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
		TARGET=10, JAR_LIBRARY=11, JARS=12, JAR=13, SCALA_JAR=14, NAME=15, ORG=16, 
		REV=17, INTRANSITIVE=18, EXCLUDES=19, EXCLUDE=20, FORCE=21, DEPENDENCIES=22, 
		BOOL_VALUE=23, SINGLE_QUOTED_STRING=24, NEWLINE=25, IDENTIFIER=26, WS=27, 
		LINE_COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CLASSIFIER", "URL", 
			"MUTABLE", "TARGET", "JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", 
			"ORG", "REV", "INTRANSITIVE", "EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", 
			"BOOL_VALUE", "SINGLE_QUOTED_STRING", "NEWLINE", "IDENTIFIER", "ESC", 
			"UNICODE", "HEX", "LetterOrDigit", "Letter", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'classifier'", "'url'", 
			"'mutable'", "'target'", "'jar_library'", "'jars'", "'jar'", "'scala_jar'", 
			"'name'", "'org'", "'rev'", "'intransitive'", "'excludes'", "'exclude'", 
			"'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CLASSIFIER", "URL", "MUTABLE", 
			"TARGET", "JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", 
			"INTRANSITIVE", "EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", 
			"SINGLE_QUOTED_STRING", "NEWLINE", "IDENTIFIER", "WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d6\n\30"+
		"\3\31\3\31\3\31\7\31\u00db\n\31\f\31\16\31\u00de\13\31\3\31\3\31\3\32"+
		"\5\32\u00e3\n\32\3\32\3\32\3\33\3\33\7\33\u00e9\n\33\f\33\16\33\u00ec"+
		"\13\33\3\34\3\34\3\34\5\34\u00f1\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\5\37\u00fd\n\37\3 \3 \3!\6!\u0102\n!\r!\16!\u0103\3"+
		"!\3!\3\"\3\"\7\"\u010a\n\"\f\"\16\"\u010d\13\"\3\"\5\"\u0110\n\"\3\"\3"+
		"\"\3\"\3\"\4\u00dc\u010b\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\29\2;\2=\2?\2A\35C\36\3\2\b\4\2$$^^\n\2$$\61\61^^ddhh"+
		"ppttvv\5\2\62;CHch\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u0119\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21"+
		"\\\3\2\2\2\23`\3\2\2\2\25h\3\2\2\2\27o\3\2\2\2\31{\3\2\2\2\33\u0080\3"+
		"\2\2\2\35\u0084\3\2\2\2\37\u008e\3\2\2\2!\u0093\3\2\2\2#\u0097\3\2\2\2"+
		"%\u009b\3\2\2\2\'\u00a8\3\2\2\2)\u00b1\3\2\2\2+\u00b9\3\2\2\2-\u00bf\3"+
		"\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00e2\3\2\2\2\65\u00e6\3\2\2"+
		"\2\67\u00ed\3\2\2\29\u00f2\3\2\2\2;\u00f8\3\2\2\2=\u00fc\3\2\2\2?\u00fe"+
		"\3\2\2\2A\u0101\3\2\2\2C\u0107\3\2\2\2EF\7?\2\2F\4\3\2\2\2GH\7*\2\2H\6"+
		"\3\2\2\2IJ\7+\2\2J\b\3\2\2\2KL\7]\2\2L\n\3\2\2\2MN\7_\2\2N\f\3\2\2\2O"+
		"P\7.\2\2P\16\3\2\2\2QR\7e\2\2RS\7n\2\2ST\7c\2\2TU\7u\2\2UV\7u\2\2VW\7"+
		"k\2\2WX\7h\2\2XY\7k\2\2YZ\7g\2\2Z[\7t\2\2[\20\3\2\2\2\\]\7w\2\2]^\7t\2"+
		"\2^_\7n\2\2_\22\3\2\2\2`a\7o\2\2ab\7w\2\2bc\7v\2\2cd\7c\2\2de\7d\2\2e"+
		"f\7n\2\2fg\7g\2\2g\24\3\2\2\2hi\7v\2\2ij\7c\2\2jk\7t\2\2kl\7i\2\2lm\7"+
		"g\2\2mn\7v\2\2n\26\3\2\2\2op\7l\2\2pq\7c\2\2qr\7t\2\2rs\7a\2\2st\7n\2"+
		"\2tu\7k\2\2uv\7d\2\2vw\7t\2\2wx\7c\2\2xy\7t\2\2yz\7{\2\2z\30\3\2\2\2{"+
		"|\7l\2\2|}\7c\2\2}~\7t\2\2~\177\7u\2\2\177\32\3\2\2\2\u0080\u0081\7l\2"+
		"\2\u0081\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083\34\3\2\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7e\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7a\2\2\u008a\u008b\7l\2\2\u008b\u008c\7c\2\2"+
		"\u008c\u008d\7t\2\2\u008d\36\3\2\2\2\u008e\u008f\7p\2\2\u008f\u0090\7"+
		"c\2\2\u0090\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092 \3\2\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7i\2\2\u0096\"\3\2\2\2\u0097\u0098"+
		"\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a\7x\2\2\u009a$\3\2\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7z\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7u\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7z\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7w\2\2"+
		"\u00b6\u00b7\7f\2\2\u00b7\u00b8\7g\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7h\2"+
		"\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be"+
		"\7g\2\2\u00be,\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2"+
		"\7r\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7f\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\u00cb\7u\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7V\2"+
		"\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d6\7g\2\2\u00d0\u00d1"+
		"\7H\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4"+
		"\u00d6\7g\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\60\3\2\2\2"+
		"\u00d7\u00dc\7)\2\2\u00d8\u00db\5\67\34\2\u00d9\u00db\n\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7)"+
		"\2\2\u00e0\62\3\2\2\2\u00e1\u00e3\7\17\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\f\2\2\u00e5\64\3\2\2\2\u00e6"+
		"\u00ea\5? \2\u00e7\u00e9\5=\37\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\66\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00f0\7^\2\2\u00ee\u00f1\t\3\2\2\u00ef\u00f1\59\35\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f18\3\2\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00f4\5;\36\2\u00f4\u00f5\5;\36\2\u00f5\u00f6\5;\36\2\u00f6\u00f7\5;"+
		"\36\2\u00f7:\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9<\3\2\2\2\u00fa\u00fd\5"+
		"? \2\u00fb\u00fd\t\5\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		">\3\2\2\2\u00fe\u00ff\t\6\2\2\u00ff@\3\2\2\2\u0100\u0102\t\7\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b!\2\2\u0106B\3\2\2\2\u0107\u010b"+
		"\7%\2\2\u0108\u010a\13\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0110\7\17\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\7\f\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\""+
		"\2\2\u0114D\3\2\2\2\r\2\u00d5\u00da\u00dc\u00e2\u00ea\u00f0\u00fc\u0103"+
		"\u010b\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}