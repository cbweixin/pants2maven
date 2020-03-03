// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/JarsLib.g4 by ANTLR 4.8
package com.weixin.jarslib.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JarsLibLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASSIFIER=7, URL=8, MUTABLE=9, 
		JAR_LIBRARY=10, JARS=11, JAR=12, SCALA_JAR=13, NAME=14, ORG=15, REV=16, 
		INTRANSITIVE=17, EXCLUDES=18, EXCLUDE=19, FORCE=20, DEPENDENCIES=21, BOOL_VALUE=22, 
		SINGLE_QUOTED_STRING=23, NEWLINE=24, IDENTIFIER=25, WS=26, LINE_COMMENT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CLASSIFIER", "URL", 
			"MUTABLE", "JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", 
			"REV", "INTRANSITIVE", "EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", 
			"BOOL_VALUE", "SINGLE_QUOTED_STRING", "NEWLINE", "IDENTIFIER", "ESC", 
			"UNICODE", "HEX", "LetterOrDigit", "Letter", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'classifier'", "'url'", 
			"'mutable'", "'jar_library'", "'jars'", "'jar'", "'scala_jar'", "'name'", 
			"'org'", "'rev'", "'intransitive'", "'excludes'", "'exclude'", "'force'", 
			"'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CLASSIFIER", "URL", "MUTABLE", 
			"JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", 
			"EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JarsLibLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JarsLib.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u010c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00cd\n\27\3\30\3\30\3\30\7\30\u00d2\n\30\f"+
		"\30\16\30\u00d5\13\30\3\30\3\30\3\31\5\31\u00da\n\31\3\31\3\31\3\32\3"+
		"\32\7\32\u00e0\n\32\f\32\16\32\u00e3\13\32\3\33\3\33\3\33\5\33\u00e8\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u00f4\n\36"+
		"\3\37\3\37\3 \6 \u00f9\n \r \16 \u00fa\3 \3 \3!\3!\7!\u0101\n!\f!\16!"+
		"\u0104\13!\3!\5!\u0107\n!\3!\3!\3!\3!\4\u00d3\u0102\2\"\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\29\2;\2=\2?\34A\35\3\2\b"+
		"\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\6\2&&C\\aac|\5\2"+
		"\13\f\17\17\"\"\2\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2"+
		"\17O\3\2\2\2\21Z\3\2\2\2\23^\3\2\2\2\25f\3\2\2\2\27r\3\2\2\2\31w\3\2\2"+
		"\2\33{\3\2\2\2\35\u0085\3\2\2\2\37\u008a\3\2\2\2!\u008e\3\2\2\2#\u0092"+
		"\3\2\2\2%\u009f\3\2\2\2\'\u00a8\3\2\2\2)\u00b0\3\2\2\2+\u00b6\3\2\2\2"+
		"-\u00cc\3\2\2\2/\u00ce\3\2\2\2\61\u00d9\3\2\2\2\63\u00dd\3\2\2\2\65\u00e4"+
		"\3\2\2\2\67\u00e9\3\2\2\29\u00ef\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2"+
		"?\u00f8\3\2\2\2A\u00fe\3\2\2\2CD\7?\2\2D\4\3\2\2\2EF\7*\2\2F\6\3\2\2\2"+
		"GH\7+\2\2H\b\3\2\2\2IJ\7]\2\2J\n\3\2\2\2KL\7_\2\2L\f\3\2\2\2MN\7.\2\2"+
		"N\16\3\2\2\2OP\7e\2\2PQ\7n\2\2QR\7c\2\2RS\7u\2\2ST\7u\2\2TU\7k\2\2UV\7"+
		"h\2\2VW\7k\2\2WX\7g\2\2XY\7t\2\2Y\20\3\2\2\2Z[\7w\2\2[\\\7t\2\2\\]\7n"+
		"\2\2]\22\3\2\2\2^_\7o\2\2_`\7w\2\2`a\7v\2\2ab\7c\2\2bc\7d\2\2cd\7n\2\2"+
		"de\7g\2\2e\24\3\2\2\2fg\7l\2\2gh\7c\2\2hi\7t\2\2ij\7a\2\2jk\7n\2\2kl\7"+
		"k\2\2lm\7d\2\2mn\7t\2\2no\7c\2\2op\7t\2\2pq\7{\2\2q\26\3\2\2\2rs\7l\2"+
		"\2st\7c\2\2tu\7t\2\2uv\7u\2\2v\30\3\2\2\2wx\7l\2\2xy\7c\2\2yz\7t\2\2z"+
		"\32\3\2\2\2{|\7u\2\2|}\7e\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7a\2\2\u0081\u0082\7l\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2"+
		"\u0084\34\3\2\2\2\u0085\u0086\7p\2\2\u0086\u0087\7c\2\2\u0087\u0088\7"+
		"o\2\2\u0088\u0089\7g\2\2\u0089\36\3\2\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7i\2\2\u008d \3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7x\2\2\u0091\"\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7u\2\2\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2"+
		"\u009b\u009c\7k\2\2\u009c\u009d\7x\2\2\u009d\u009e\7g\2\2\u009e$\3\2\2"+
		"\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7z\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3"+
		"\7n\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7z\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7f\2\2"+
		"\u00ae\u00af\7g\2\2\u00af(\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7q\2"+
		"\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7g\2\2\u00b5*\3\2"+
		"\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7u\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7V\2\2\u00c4\u00c5\7t\2"+
		"\2\u00c5\u00c6\7w\2\2\u00c6\u00cd\7g\2\2\u00c7\u00c8\7H\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cd\7g\2\2\u00cc"+
		"\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd.\3\2\2\2\u00ce\u00d3\7)\2\2\u00cf"+
		"\u00d2\5\65\33\2\u00d0\u00d2\n\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7)\2\2\u00d7\60\3\2\2\2"+
		"\u00d8\u00da\7\17\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\62\3\2\2\2\u00dd\u00e1\5=\37\2\u00de"+
		"\u00e0\5;\36\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\64\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7"+
		"\7^\2\2\u00e5\u00e8\t\3\2\2\u00e6\u00e8\5\67\34\2\u00e7\u00e5\3\2\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\5"+
		"9\35\2\u00eb\u00ec\59\35\2\u00ec\u00ed\59\35\2\u00ed\u00ee\59\35\2\u00ee"+
		"8\3\2\2\2\u00ef\u00f0\t\4\2\2\u00f0:\3\2\2\2\u00f1\u00f4\5=\37\2\u00f2"+
		"\u00f4\t\5\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4<\3\2\2\2"+
		"\u00f5\u00f6\t\6\2\2\u00f6>\3\2\2\2\u00f7\u00f9\t\7\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\b \2\2\u00fd@\3\2\2\2\u00fe\u0102\7%\2\2\u00ff"+
		"\u0101\13\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0107\7\17\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0109\7\f\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b!\2\2\u010b"+
		"B\3\2\2\2\r\2\u00cc\u00d1\u00d3\u00d9\u00e1\u00e7\u00f3\u00fa\u0102\u0106"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}