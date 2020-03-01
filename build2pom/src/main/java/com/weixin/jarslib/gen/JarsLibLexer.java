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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASSIFIER=7, JAR_LIBRARY=8, 
		JARS=9, JAR=10, SCALA_JAR=11, NAME=12, ORG=13, REV=14, INTRANSITIVE=15, 
		EXCLUDES=16, EXCLUDE=17, FORCE=18, DEPENDENCIES=19, BOOL_VALUE=20, SINGLE_QUOTED_STRING=21, 
		NEWLINE=22, IDENTIFIER=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CLASSIFIER", "JAR_LIBRARY", 
			"JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", 
			"EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "ESC", "UNICODE", "HEX", "LetterOrDigit", "Letter", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'classifier'", "'jar_library'", 
			"'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", "'rev'", "'intransitive'", 
			"'excludes'", "'exclude'", "'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CLASSIFIER", "JAR_LIBRARY", 
			"JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", 
			"EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00bb\n\25\3\26\3\26\3\26\7\26\u00c0\n\26\f\26\16\26\u00c3\13\26\3\26"+
		"\3\26\3\27\5\27\u00c8\n\27\3\27\3\27\3\30\3\30\7\30\u00ce\n\30\f\30\16"+
		"\30\u00d1\13\30\3\31\3\31\3\31\5\31\u00d6\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\5\34\u00e2\n\34\3\35\3\35\3\36\6\36\u00e7\n"+
		"\36\r\36\16\36\u00e8\3\36\3\36\3\u00c1\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\2\63\2\65\2\67\29\2;\32\3\2\b\4\2$$^^\n\2$$\61\61^^ddh"+
		"hppttvv\5\2\62;CHch\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u00ee\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\r"+
		"G\3\2\2\2\17I\3\2\2\2\21T\3\2\2\2\23`\3\2\2\2\25e\3\2\2\2\27i\3\2\2\2"+
		"\31s\3\2\2\2\33x\3\2\2\2\35|\3\2\2\2\37\u0080\3\2\2\2!\u008d\3\2\2\2#"+
		"\u0096\3\2\2\2%\u009e\3\2\2\2\'\u00a4\3\2\2\2)\u00ba\3\2\2\2+\u00bc\3"+
		"\2\2\2-\u00c7\3\2\2\2/\u00cb\3\2\2\2\61\u00d2\3\2\2\2\63\u00d7\3\2\2\2"+
		"\65\u00dd\3\2\2\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e6\3\2\2\2=>\7?"+
		"\2\2>\4\3\2\2\2?@\7*\2\2@\6\3\2\2\2AB\7+\2\2B\b\3\2\2\2CD\7]\2\2D\n\3"+
		"\2\2\2EF\7_\2\2F\f\3\2\2\2GH\7.\2\2H\16\3\2\2\2IJ\7e\2\2JK\7n\2\2KL\7"+
		"c\2\2LM\7u\2\2MN\7u\2\2NO\7k\2\2OP\7h\2\2PQ\7k\2\2QR\7g\2\2RS\7t\2\2S"+
		"\20\3\2\2\2TU\7l\2\2UV\7c\2\2VW\7t\2\2WX\7a\2\2XY\7n\2\2YZ\7k\2\2Z[\7"+
		"d\2\2[\\\7t\2\2\\]\7c\2\2]^\7t\2\2^_\7{\2\2_\22\3\2\2\2`a\7l\2\2ab\7c"+
		"\2\2bc\7t\2\2cd\7u\2\2d\24\3\2\2\2ef\7l\2\2fg\7c\2\2gh\7t\2\2h\26\3\2"+
		"\2\2ij\7u\2\2jk\7e\2\2kl\7c\2\2lm\7n\2\2mn\7c\2\2no\7a\2\2op\7l\2\2pq"+
		"\7c\2\2qr\7t\2\2r\30\3\2\2\2st\7p\2\2tu\7c\2\2uv\7o\2\2vw\7g\2\2w\32\3"+
		"\2\2\2xy\7q\2\2yz\7t\2\2z{\7i\2\2{\34\3\2\2\2|}\7t\2\2}~\7g\2\2~\177\7"+
		"x\2\2\177\36\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7u\2\2\u0087\u0088\7k\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2"+
		"\u008a\u008b\7x\2\2\u008b\u008c\7g\2\2\u008c \3\2\2\2\u008d\u008e\7g\2"+
		"\2\u008e\u008f\7z\2\2\u008f\u0090\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7w\2\2\u0092\u0093\7f\2\2\u0093\u0094\7g\2\2\u0094\u0095\7u\2\2\u0095"+
		"\"\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7z\2\2\u0098\u0099\7e\2\2\u0099"+
		"\u009a\7n\2\2\u009a\u009b\7w\2\2\u009b\u009c\7f\2\2\u009c\u009d\7g\2\2"+
		"\u009d$\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2"+
		"\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7g\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7"+
		"f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7e\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0(\3\2\2\2\u00b1\u00b2\7V\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2"+
		"\2\u00b4\u00bb\7g\2\2\u00b5\u00b6\7H\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00bb\7g\2\2\u00ba\u00b1\3\2\2\2\u00ba"+
		"\u00b5\3\2\2\2\u00bb*\3\2\2\2\u00bc\u00c1\7)\2\2\u00bd\u00c0\5\61\31\2"+
		"\u00be\u00c0\n\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7)\2\2\u00c5,\3\2\2\2\u00c6\u00c8\7\17\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca"+
		"\7\f\2\2\u00ca.\3\2\2\2\u00cb\u00cf\59\35\2\u00cc\u00ce\5\67\34\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\60\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\7^\2\2\u00d3\u00d6"+
		"\t\3\2\2\u00d4\u00d6\5\63\32\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\62\3\2\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\5\65\33\2\u00d9\u00da"+
		"\5\65\33\2\u00da\u00db\5\65\33\2\u00db\u00dc\5\65\33\2\u00dc\64\3\2\2"+
		"\2\u00dd\u00de\t\4\2\2\u00de\66\3\2\2\2\u00df\u00e2\59\35\2\u00e0\u00e2"+
		"\t\5\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e28\3\2\2\2\u00e3"+
		"\u00e4\t\6\2\2\u00e4:\3\2\2\2\u00e5\u00e7\t\7\2\2\u00e6\u00e5\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\b\36\2\2\u00eb<\3\2\2\2\13\2\u00ba\u00bf\u00c1\u00c7"+
		"\u00cf\u00d5\u00e1\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}