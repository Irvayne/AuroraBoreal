grammar Portugol;

@lexer::header{
   package semantica;
}

@parser::header{
   package semantica;
   import java.util.*;
}

@parser::members {
    Map<String, String> functionTypes = new HashMap<String, String>();
    Map<String, String> varTypes = new HashMap<String, String>();
    
    String realOrInteger(String a, String b){    
        if(!a.equals("bool")&&!a.equals("string")&&
            !b.equals("bool")&&!b.equals("string")){
            if(a.equals(b)){
                return a;
            }else{
                return "real";
            }
        }else{
            int line = _ctx.getStart().getLine();
            int column = _ctx.getStart().getCharPositionInLine();
            throw new RuntimeException(line+":"+column+" wrong type in expression");
        }
    }
}
program: 'PROG' programName=IDENTIFIER ';' varDeclaration* functionDeclarations statement* 'FIM.';

statement: para
         | enquanto
         | repita
         | assignment
         | branch
         | returnFunc
         | callFunction ';'
         ;

statementWBreak: para
         | enquanto
         | repita
         | assignment
         | branchWBreak
         | returnFunc
         | callFunction ';'
         | breakLoop
         ;

returnFunc: 'RETORNE' stringOrExpr ';';
breakLoop: 'SAIR' ';';

branch: 'SE' '(' condition=bool ')' 'ENTAO' onTrue=block ('SENAO' onFalse=block)? 'FIM' ';'
      ;

branchWBreak: 'SE' '(' condition=bool ')' 'ENTAO' onTrue=blockWBreak 
              ('SENAO' onFalse=blockWBreak)? 'FIM' ';'
      ;

block: statement* ;
blockWBreak: statementWBreak*;

expression: expr;

bool returns [String t]
    : bool '|' join {$t = "bool";}  #Or
    | a=join          {$t = $a.t;}  #BoolJoin
    ;
join returns [String t]
    : join '&' equality {$t = "bool";} #And
    | a=equality          {$t = $a.t;} #BoolEquality
    ;
equality returns [String t]
    : equality '==' rel {$t = "bool";} #Eq
    | equality '!=' rel {$t = "bool";} #Diff
    | a=rel               {$t = $a.t;} #BoolRel
    ;
rel returns [String t]
    : expr '<' expr     {$t = "bool";} #Lt
    | expr '<=' expr    {$t = "bool";} #Le
    | expr '>=' expr    {$t = "bool";} #Ge
    | expr '>' expr     {$t = "bool";} #Gt
    | a=expr              {$t = $a.t;} #BoolExpr
    ;
expr returns [String t]
    : a=expr '+' b=term {$t = realOrInteger($a.t,$b.t);} #Add
    | a=expr '-' b=term {$t = realOrInteger($a.t,$b.t);} #Sub
    | a=term              {$t = $a.t;}                  #ExprTerm
    ;         
term returns [String t]
    : a=term '*' b=unary{$t = realOrInteger($a.t,$b.t);} #Multi
    | a=term '/' b=unary{$t = realOrInteger($a.t,$b.t);} #Div
    | a=unary             {$t = $a.t;}                 #TermUnary
    ;
unary returns [String t]
    : '!' unary    {$t = "bool";}    #NotUnary
    | '-' a=unary    {$t = $a.t;}  #MinusUnary
    | a=factor       {$t = $a.t;} #FactorUnary
    ;
factor returns [String t]
    : '(' a=bool ')'    {$t = $a.t;}   #Parentesis
    | varName=IDENTIFIER  {$t = varTypes.get($varName.text);} #Variable
    | NUMBER          {$t = "int";}     #Number
    | REAL            {$t = "real";}    #Real
    | 'TRUE'          {$t = "bool";}    #BoolTrue
    | 'FALSE'         {$t = "bool";}    #BoolFalse
    | a=callFunction    {$t = $a.t;} #ExprCallFunction
    ;

varDeclaration: type IDENTIFIER (decIds[$type.t])* ';'{varTypes.put($IDENTIFIER.text, $type.t);}; 
decIds[String t]: ',' IDENTIFIER                    {varTypes.put($IDENTIFIER.text, $t);};

assignment: varName=IDENTIFIER '=' stringOrExpr ';';

para: 'PARA' mainVar=IDENTIFIER '=' mainNum=NUMBER 'ATE' until=(IDENTIFIER | NUMBER) ('PASSO' step=NUMBER)?
      'FACA' statementWBreak* 'FIM' ';';

enquanto: 'ENQUANTO' '(' bool ')' 'FACA' statementWBreak* 'FIM' ';';

repita: 'REPITA' statementWBreak* 'ATE' '(' bool ')' ';';

functionDeclarations: funcao*;

funcao: 'FUNCAO' IDENTIFIER '(' paramDeclarations[$IDENTIFIER.text]? ')' (':' type)? ';'
        varDeclaration* 
        (statement|RETURN expression)* 'FIM' ';'
        {if($type.ctx!=null)
            functionTypes.put($IDENTIFIER.text, $type.t);
         else
            functionTypes.put($IDENTIFIER.text, "void");
        };

callFunction returns [String t]
        : 'IMPRIMA' '(' stringOrExpr (',' stringOrExpr)* ')'         #Imprime
        | 'LEIA' '(' IDENTIFIER (',' IDENTIFIER)* ')'                #Leia
        | IDENTIFIER '(' arguments? ')' {$t=functionTypes.get($IDENTIFIER.text);}#OtherFunc
        ;

arguments: stringOrExpr (',' stringOrExpr)*;

//paramList: type ids (';' type ids)*;

paramDeclarations[String funcName]: paramDeclaration[$funcName] (';' paramDeclaration[$funcName])*;
paramDeclaration[String funcName]: type IDENTIFIER (paramIds[$type.t,$funcName])*
    {varTypes.put($IDENTIFIER.text, $type.t);}; 
paramIds[String t, String funcName]: ',' IDENTIFIER
    {varTypes.put($IDENTIFIER.text, $t);};

ids: IDENTIFIER (',' IDENTIFIER)*;

string : '"' ~('\r' | '\n' | '"')* '"' ;

stringOrExpr returns [String t]
    : string    {$t = "string";}
    | a=expr      {$t = $a.t;}
    ;

type returns [String t]
    : 'INTEIRO' {$t = "int";}
    | 'STRING'  {$t = "string";}
    | 'REAL'    {$t = "real";}
    | 'BOOLEANO'{$t = "bool";}
    ;

IMPRIME: 'IMPRIMA';
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9]+;
REAL: [0-9]+ '.' [0-9]+;
WS: [ \t\n\r]+ -> skip;
RETURN: 'RETORNE';