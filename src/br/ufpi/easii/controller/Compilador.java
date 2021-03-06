package br.ufpi.easii.controller;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import semantica.ErroSintaxeException;
import semantica.ErroSintaxeListener;
import semantica.PortugolLexer;
import semantica.PortugolParser;
import semantica.Semantica;



public class Compilador {
	
	/**
	 * Metodo que recebe um path de um arquivo e realiza sua compilacao
	 * @param path
	 * @return
	 * @throws IOException 
	 */
	public static String compilar(String path) throws IOException{
		
		InputStream input = new FileInputStream(path);
        ANTLRInputStream stream = new ANTLRInputStream(input);
		
        PortugolLexer lexer = new PortugolLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        ErroSintaxeListener syntaxError = new ErroSintaxeListener();
        
        PortugolParser parser = new PortugolParser(tokens);
        parser.addErrorListener(syntaxError);
        
        ParseTree tree = parser.program();
        
        FileWriter codigo = new FileWriter(path+".j");
        
        ParseTreeWalker walker = new ParseTreeWalker();
        Semantica semantica = new Semantica(codigo);
        walker.walk(semantica, tree);
        String console = "";
        
        if(!syntaxError.getErroSintaxe().isEmpty()) {
            for(ErroSintaxeException erro: syntaxError.getErroSintaxe()) {
            	console = console + erro.toString() + "\n";
            }                
        }
        
        System.out.println("\nErros encontrados\n");
        for(String erro : semantica.getErros()){
        	console = console + erro + "\n";
        } 
        return console;
	}
}
