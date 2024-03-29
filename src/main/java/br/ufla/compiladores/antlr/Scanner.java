// Generated from Scanner.g4 by ANTLR 4.7.2

	package br.ufla.compiladores.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DELIMITADOR=1, ALGORITMO=2, DECLARACOES=3, LETRA=4, DIGITO=5, ATRIBUIR=6, 
		A=7, LER=8, IMPRIMIR=9, ENQUANTO=10, FACA=11, SE=12, SENAO=13, ENTAO=14, 
		INICIO=15, FIM=16, NUMERO_INTEIRO=17, NUMERO_REAL=18, INTEIRO=19, REAL=20, 
		ABRE_PARENTESES=21, FECHA_PARENTESES=22, OPERADOR_RELACIONAL=23, OPERADOR_ARITMETICO=24, 
		IDENTIFICADOR=25, NEW_LINE=26, WHITE_SKEEP=27, COMENTARIOS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DELIMITADOR", "ALGORITMO", "DECLARACOES", "LETRA", "DIGITO", "ATRIBUIR", 
			"A", "LER", "IMPRIMIR", "ENQUANTO", "FACA", "SE", "SENAO", "ENTAO", "INICIO", 
			"FIM", "NUMERO_INTEIRO", "NUMERO_REAL", "INTEIRO", "REAL", "ABRE_PARENTESES", 
			"FECHA_PARENTESES", "OPERADOR_RELACIONAL", "OPERADOR_ARITMETICO", "IDENTIFICADOR", 
			"NEW_LINE", "WHITE_SKEEP", "COMENTARIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'ALGORITMO'", "'DECLARACOES'", null, null, "'ATRIBUIR'", 
			"'A'", "'LER'", "'IMPRIMIR'", "'ENQUANTO'", "'faca'", "'SE'", "'SENAO'", 
			"'ENTAO'", "'INICIO'", "'FIM'", null, null, "'INT'", "'real'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DELIMITADOR", "ALGORITMO", "DECLARACOES", "LETRA", "DIGITO", "ATRIBUIR", 
			"A", "LER", "IMPRIMIR", "ENQUANTO", "FACA", "SE", "SENAO", "ENTAO", "INICIO", 
			"FIM", "NUMERO_INTEIRO", "NUMERO_REAL", "INTEIRO", "REAL", "ABRE_PARENTESES", 
			"FECHA_PARENTESES", "OPERADOR_RELACIONAL", "OPERADOR_ARITMETICO", "IDENTIFICADOR", 
			"NEW_LINE", "WHITE_SKEEP", "COMENTARIOS"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\6\22\u0099\n\22\r\22\16\22\u009a\3\23"+
		"\7\23\u009e\n\23\f\23\16\23\u00a1\13\23\3\23\3\23\7\23\u00a5\n\23\f\23"+
		"\16\23\u00a8\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c0"+
		"\n\30\3\31\3\31\3\32\3\32\5\32\u00c6\n\32\3\32\3\32\3\32\7\32\u00cb\n"+
		"\32\f\32\16\32\u00ce\13\32\3\33\5\33\u00d1\n\33\3\33\3\33\3\33\3\33\3"+
		"\34\6\34\u00d8\n\34\r\34\16\34\u00d9\3\34\3\34\3\35\3\35\7\35\u00e0\n"+
		"\35\f\35\16\35\u00e3\13\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\5\5\2,-//\61\61\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\2\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7G\3\2\2\2\tS\3\2\2\2\13U\3"+
		"\2\2\2\rW\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23f\3\2\2\2\25o\3\2\2\2\27x"+
		"\3\2\2\2\31}\3\2\2\2\33\u0080\3\2\2\2\35\u0086\3\2\2\2\37\u008c\3\2\2"+
		"\2!\u0093\3\2\2\2#\u0098\3\2\2\2%\u009f\3\2\2\2\'\u00a9\3\2\2\2)\u00ad"+
		"\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\u00c5\3\2\2\2\65\u00d0\3\2\2\2\67\u00d7\3\2\2\29\u00dd\3\2\2\2;<\7"+
		"<\2\2<\4\3\2\2\2=>\7C\2\2>?\7N\2\2?@\7I\2\2@A\7Q\2\2AB\7T\2\2BC\7K\2\2"+
		"CD\7V\2\2DE\7O\2\2EF\7Q\2\2F\6\3\2\2\2GH\7F\2\2HI\7G\2\2IJ\7E\2\2JK\7"+
		"N\2\2KL\7C\2\2LM\7T\2\2MN\7C\2\2NO\7E\2\2OP\7Q\2\2PQ\7G\2\2QR\7U\2\2R"+
		"\b\3\2\2\2ST\4c|\2T\n\3\2\2\2UV\4\62;\2V\f\3\2\2\2WX\7C\2\2XY\7V\2\2Y"+
		"Z\7T\2\2Z[\7K\2\2[\\\7D\2\2\\]\7W\2\2]^\7K\2\2^_\7T\2\2_\16\3\2\2\2`a"+
		"\7C\2\2a\20\3\2\2\2bc\7N\2\2cd\7G\2\2de\7T\2\2e\22\3\2\2\2fg\7K\2\2gh"+
		"\7O\2\2hi\7R\2\2ij\7T\2\2jk\7K\2\2kl\7O\2\2lm\7K\2\2mn\7T\2\2n\24\3\2"+
		"\2\2op\7G\2\2pq\7P\2\2qr\7S\2\2rs\7W\2\2st\7C\2\2tu\7P\2\2uv\7V\2\2vw"+
		"\7Q\2\2w\26\3\2\2\2xy\7h\2\2yz\7c\2\2z{\7e\2\2{|\7c\2\2|\30\3\2\2\2}~"+
		"\7U\2\2~\177\7G\2\2\177\32\3\2\2\2\u0080\u0081\7U\2\2\u0081\u0082\7G\2"+
		"\2\u0082\u0083\7P\2\2\u0083\u0084\7C\2\2\u0084\u0085\7Q\2\2\u0085\34\3"+
		"\2\2\2\u0086\u0087\7G\2\2\u0087\u0088\7P\2\2\u0088\u0089\7V\2\2\u0089"+
		"\u008a\7C\2\2\u008a\u008b\7Q\2\2\u008b\36\3\2\2\2\u008c\u008d\7K\2\2\u008d"+
		"\u008e\7P\2\2\u008e\u008f\7K\2\2\u008f\u0090\7E\2\2\u0090\u0091\7K\2\2"+
		"\u0091\u0092\7Q\2\2\u0092 \3\2\2\2\u0093\u0094\7H\2\2\u0094\u0095\7K\2"+
		"\2\u0095\u0096\7O\2\2\u0096\"\3\2\2\2\u0097\u0099\5\13\6\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"$\3\2\2\2\u009c\u009e\5\13\6\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a6\7\60\2\2\u00a3\u00a5\5\13\6\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7&\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7P\2\2\u00ab"+
		"\u00ac\7V\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3"+
		",\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5.\3\2\2\2\u00b6\u00c0\7@\2\2\u00b7\u00b8"+
		"\7@\2\2\u00b8\u00c0\7?\2\2\u00b9\u00c0\7>\2\2\u00ba\u00bb\7>\2\2\u00bb"+
		"\u00c0\7?\2\2\u00bc\u00c0\7?\2\2\u00bd\u00be\7>\2\2\u00be\u00c0\7@\2\2"+
		"\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba"+
		"\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\60\3\2\2\2\u00c1"+
		"\u00c2\t\2\2\2\u00c2\62\3\2\2\2\u00c3\u00c6\5\t\5\2\u00c4\u00c6\7a\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00cc\3\2\2\2\u00c7\u00cb"+
		"\5\t\5\2\u00c8\u00cb\5\13\6\2\u00c9\u00cb\7a\2\2\u00ca\u00c7\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\64\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1"+
		"\7\17\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d3\7\f\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\33\2\2\u00d5\66"+
		"\3\2\2\2\u00d6\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\34"+
		"\2\2\u00dc8\3\2\2\2\u00dd\u00e1\7\'\2\2\u00de\u00e0\n\4\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\35\2\2\u00e5:\3\2\2\2"+
		"\r\2\u009a\u009f\u00a6\u00bf\u00c5\u00ca\u00cc\u00d0\u00d9\u00e1\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}