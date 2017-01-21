// Generated from Portugol.g4 by ANTLR 4.4

   package semantica;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, IMPRIME=44, IDENTIFIER=45, 
		NUMBER=46, REAL=47, WS=48, RETURN=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'"
	};
	public static final String[] ruleNames = {
		"T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", 
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "IMPRIME", "IDENTIFIER", "NUMBER", "REAL", "WS", "RETURN"
	};


	public PortugolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\7.\u011a\n.\f.\16.\u011d\13.\3/\6/\u0120\n/\r"+
		"/\16/\u0121\3\60\6\60\u0125\n\60\r\60\16\60\u0126\3\60\3\60\6\60\u012b"+
		"\n\60\r\60\16\60\u012c\3\61\6\61\u0130\n\61\r\61\16\61\u0131\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7j\3\2\2"+
		"\2\tp\3\2\2\2\13u\3\2\2\2\rz\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2"+
		"\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33"+
		"\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u009a\3\2\2\2#\u009c"+
		"\3\2\2\2%\u00a0\3\2\2\2\'\u00a6\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2"+
		"-\u00b2\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bd\3\2\2\2\65\u00c4"+
		"\3\2\2\2\67\u00ca\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d6\3\2\2\2"+
		"?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00de\3\2\2\2E\u00e0\3\2\2\2G\u00e8\3"+
		"\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2\2\2O\u00f7\3\2\2\2Q\u00f9"+
		"\3\2\2\2S\u00ff\3\2\2\2U\u0104\3\2\2\2W\u0106\3\2\2\2Y\u010f\3\2\2\2["+
		"\u0117\3\2\2\2]\u011f\3\2\2\2_\u0124\3\2\2\2a\u012f\3\2\2\2c\u0135\3\2"+
		"\2\2ef\7\61\2\2f\4\3\2\2\2gh\7#\2\2hi\7?\2\2i\6\3\2\2\2jk\7G\2\2kl\7P"+
		"\2\2lm\7V\2\2mn\7C\2\2no\7Q\2\2o\b\3\2\2\2pq\7U\2\2qr\7C\2\2rs\7K\2\2"+
		"st\7T\2\2t\n\3\2\2\2uv\7N\2\2vw\7G\2\2wx\7K\2\2xy\7C\2\2y\f\3\2\2\2z{"+
		"\7T\2\2{|\7G\2\2|}\7R\2\2}~\7K\2\2~\177\7V\2\2\177\u0080\7C\2\2\u0080"+
		"\16\3\2\2\2\u0081\u0082\7=\2\2\u0082\20\3\2\2\2\u0083\u0084\7T\2\2\u0084"+
		"\u0085\7G\2\2\u0085\u0086\7C\2\2\u0086\u0087\7N\2\2\u0087\22\3\2\2\2\u0088"+
		"\u0089\7?\2\2\u0089\24\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c"+
		"\26\3\2\2\2\u008d\u008e\7$\2\2\u008e\30\3\2\2\2\u008f\u0090\7(\2\2\u0090"+
		"\32\3\2\2\2\u0091\u0092\7*\2\2\u0092\34\3\2\2\2\u0093\u0094\7,\2\2\u0094"+
		"\36\3\2\2\2\u0095\u0096\7H\2\2\u0096\u0097\7C\2\2\u0097\u0098\7E\2\2\u0098"+
		"\u0099\7C\2\2\u0099 \3\2\2\2\u009a\u009b\7.\2\2\u009b\"\3\2\2\2\u009c"+
		"\u009d\7H\2\2\u009d\u009e\7K\2\2\u009e\u009f\7O\2\2\u009f$\3\2\2\2\u00a0"+
		"\u00a1\7R\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7U\2\2"+
		"\u00a4\u00a5\7Q\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7V\2"+
		"\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac"+
		"\7I\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae*\3\2\2\2\u00af\u00b0"+
		"\7U\2\2\u00b0\u00b1\7G\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7R\2\2\u00b3\u00b4"+
		"\7T\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6\7I\2\2\u00b6.\3\2\2\2\u00b7\u00b8"+
		"\7\17\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7V\2\2\u00bb"+
		"\u00bc\7G\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7H\2\2\u00be\u00bf\7W\2\2\u00bf"+
		"\u00c0\7P\2\2\u00c0\u00c1\7E\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7Q\2\2"+
		"\u00c3\64\3\2\2\2\u00c4\u00c5\7H\2\2\u00c5\u00c6\7C\2\2\u00c6\u00c7\7"+
		"N\2\2\u00c7\u00c8\7U\2\2\u00c8\u00c9\7G\2\2\u00c9\66\3\2\2\2\u00ca\u00cb"+
		"\7H\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7O\2\2\u00cd\u00ce\7\60\2\2\u00ce"+
		"8\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7R\2\2\u00d2\u00d3"+
		"\7C\2\2\u00d3\u00d4\7T\2\2\u00d4\u00d5\7C\2\2\u00d5<\3\2\2\2\u00d6\u00d7"+
		"\7@\2\2\u00d7\u00d8\7?\2\2\u00d8>\3\2\2\2\u00d9\u00da\7>\2\2\u00da@\3"+
		"\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd\7?\2\2\u00ddB\3\2\2\2\u00de\u00df"+
		"\7~\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e2\7P\2\2\u00e2\u00e3"+
		"\7V\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7T\2\2\u00e6"+
		"\u00e7\7Q\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ea\7P\2\2\u00ea"+
		"\u00eb\7S\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7C\2\2\u00ed\u00ee\7P\2\2"+
		"\u00ee\u00ef\7V\2\2\u00ef\u00f0\7Q\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7@\2"+
		"\2\u00f2J\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7+\2\2"+
		"\u00f6N\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7U\2\2\u00fa"+
		"\u00fb\7G\2\2\u00fb\u00fc\7P\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7Q\2\2"+
		"\u00feR\3\2\2\2\u00ff\u0100\7V\2\2\u0100\u0101\7T\2\2\u0101\u0102\7W\2"+
		"\2\u0102\u0103\7G\2\2\u0103T\3\2\2\2\u0104\u0105\7/\2\2\u0105V\3\2\2\2"+
		"\u0106\u0107\7D\2\2\u0107\u0108\7Q\2\2\u0108\u0109\7Q\2\2\u0109\u010a"+
		"\7N\2\2\u010a\u010b\7G\2\2\u010b\u010c\7C\2\2\u010c\u010d\7P\2\2\u010d"+
		"\u010e\7Q\2\2\u010eX\3\2\2\2\u010f\u0110\7K\2\2\u0110\u0111\7O\2\2\u0111"+
		"\u0112\7R\2\2\u0112\u0113\7T\2\2\u0113\u0114\7K\2\2\u0114\u0115\7O\2\2"+
		"\u0115\u0116\7C\2\2\u0116Z\3\2\2\2\u0117\u011b\t\2\2\2\u0118\u011a\t\3"+
		"\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\\\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\t\4\2\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122^\3\2\2\2\u0123\u0125\t\4\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\7\60\2\2\u0129\u012b\t\4\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d`\3\2\2\2"+
		"\u012e\u0130\t\5\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b\61\2\2"+
		"\u0134b\3\2\2\2\u0135\u0136\7T\2\2\u0136\u0137\7G\2\2\u0137\u0138\7V\2"+
		"\2\u0138\u0139\7Q\2\2\u0139\u013a\7T\2\2\u013a\u013b\7P\2\2\u013b\u013c"+
		"\7G\2\2\u013cd\3\2\2\2\b\2\u011b\u0121\u0126\u012c\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}