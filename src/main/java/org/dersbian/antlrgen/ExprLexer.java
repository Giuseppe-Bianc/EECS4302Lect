// Generated from java-escape by ANTLR 4.11.1

    package org.dersbian.antlrgen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, NUM=6, HEX_DIGIT=7, BIN_DIGIT=8, 
		OCT_DIGIT=9, INT_TYPE=10, COMENT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ID", "NUM", "HEX_DIGIT", "BIN_DIGIT", 
			"OCT_DIGIT", "INT_TYPE", "COMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'*'", "'+'", null, null, null, null, null, "'INT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "NUM", "HEX_DIGIT", "BIN_DIGIT", 
			"OCT_DIGIT", "INT_TYPE", "COMENT", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\fd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004"+
		"$\b\u0004\n\u0004\f\u0004\'\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005,\b\u0005\u000b\u0005\f\u0005-\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0004\u00053\b\u0005\u000b\u0005\f\u00054\u0001\u0005\u0001\u0005"+
		"\u0004\u00059\b\u0005\u000b\u0005\f\u0005:\u0001\u0005\u0003\u0005>\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005B\b\u0005\n\u0005\f\u0005E\t"+
		"\u0005\u0003\u0005G\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\nW\b\n\n\n\f\nZ\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000b_\b\u000b\u000b\u000b\f\u000b`\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000"+
		"\u000b\u0001\u0000az\u0004\u000009AZ__az\u0002\u0000XXxx\u0002\u0000B"+
		"Bbb\u0001\u000019\u0001\u000009\u0003\u000009AFaf\u0001\u000001\u0001"+
		"\u000007\u0002\u0000\n\n\r\r\u0002\u0000\t\n  n\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000"+
		"\u0003\u001b\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000\u0000\u0000"+
		"\u0007\u001f\u0001\u0000\u0000\u0000\t!\u0001\u0000\u0000\u0000\u000b"+
		"F\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000"+
		"\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000"+
		"\u0015R\u0001\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005:\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"=\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005*\u0000"+
		"\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005+\u0000\u0000 "+
		"\b\u0001\u0000\u0000\u0000!%\u0007\u0000\u0000\u0000\"$\u0007\u0001\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&\n\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000()\u00050\u0000\u0000)+\u0007\u0002\u0000\u0000*,\u0003"+
		"\r\u0006\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.G\u0001\u0000\u0000\u0000"+
		"/0\u00050\u0000\u000002\u0007\u0003\u0000\u000013\u0003\u000f\u0007\u0000"+
		"21\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u00005G\u0001\u0000\u0000\u000068\u00050\u0000"+
		"\u000079\u0003\u0011\b\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;G\u0001\u0000"+
		"\u0000\u0000<>\u0005-\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?C\u0007\u0004\u0000\u0000@B\u0007"+
		"\u0005\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000F(\u0001\u0000\u0000\u0000F/\u0001\u0000"+
		"\u0000\u0000F6\u0001\u0000\u0000\u0000F=\u0001\u0000\u0000\u0000G\f\u0001"+
		"\u0000\u0000\u0000HI\u0007\u0006\u0000\u0000I\u000e\u0001\u0000\u0000"+
		"\u0000JK\u0007\u0007\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0007"+
		"\b\u0000\u0000M\u0012\u0001\u0000\u0000\u0000NO\u0005I\u0000\u0000OP\u0005"+
		"N\u0000\u0000PQ\u0005T\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005"+
		"/\u0000\u0000ST\u0005/\u0000\u0000TX\u0001\u0000\u0000\u0000UW\b\t\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\\\u0006\n\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000"+
		"]_\u0007\n\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0006\u000b\u0000\u0000c\u0018\u0001\u0000\u0000\u0000\n\u0000"+
		"%-4:=CFX`\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}