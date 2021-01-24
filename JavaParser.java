// $ANTLR 3.5.1 C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g 2020-12-13 10:37:55

    import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class JavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", 
		"ASSERT", "BANG", "BANGEQ", "BAR", "BARBAR", "BAREQ", "BOOLEAN", "BREAK", 
		"BYTE", "CARET", "CARETEQ", "CASE", "CATCH", "CHAR", "CHARLITERAL", "CLASS", 
		"COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DEFAULT", "DO", "DOT", 
		"DOUBLE", "DOUBLELITERAL", "DoubleSuffix", "ELLIPSIS", "ELSE", "ENUM", 
		"EQ", "EQEQ", "EXTENDS", "EscapeSequence", "Exponent", "FALSE", "FINAL", 
		"FINALLY", "FLOAT", "FLOATLITERAL", "FOR", "FloatSuffix", "GOTO", "GT", 
		"HexDigit", "HexPrefix", "IDENTIFIER", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "INTLITERAL", "IdentifierPart", "IdentifierStart", 
		"IntegerNumber", "LBRACE", "LBRACKET", "LINE_COMMENT", "LONG", "LONGLITERAL", 
		"LPAREN", "LT", "LongSuffix", "MONKEYS_AT", "NATIVE", "NEW", "NULL", "NonIntegerNumber", 
		"PACKAGE", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PRIVATE", 
		"PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", 
		"SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", 
		"STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"SurrogateIdentifer", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", 
		"TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "WS", "'System.out.println'", 
		"'super.'", "'this.'"
	};
	public static final int EOF=-1;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int ABSTRACT=4;
	public static final int AMP=5;
	public static final int AMPAMP=6;
	public static final int AMPEQ=7;
	public static final int ASSERT=8;
	public static final int BANG=9;
	public static final int BANGEQ=10;
	public static final int BAR=11;
	public static final int BARBAR=12;
	public static final int BAREQ=13;
	public static final int BOOLEAN=14;
	public static final int BREAK=15;
	public static final int BYTE=16;
	public static final int CARET=17;
	public static final int CARETEQ=18;
	public static final int CASE=19;
	public static final int CATCH=20;
	public static final int CHAR=21;
	public static final int CHARLITERAL=22;
	public static final int CLASS=23;
	public static final int COLON=24;
	public static final int COMMA=25;
	public static final int COMMENT=26;
	public static final int CONST=27;
	public static final int CONTINUE=28;
	public static final int DEFAULT=29;
	public static final int DO=30;
	public static final int DOT=31;
	public static final int DOUBLE=32;
	public static final int DOUBLELITERAL=33;
	public static final int DoubleSuffix=34;
	public static final int ELLIPSIS=35;
	public static final int ELSE=36;
	public static final int ENUM=37;
	public static final int EQ=38;
	public static final int EQEQ=39;
	public static final int EXTENDS=40;
	public static final int EscapeSequence=41;
	public static final int Exponent=42;
	public static final int FALSE=43;
	public static final int FINAL=44;
	public static final int FINALLY=45;
	public static final int FLOAT=46;
	public static final int FLOATLITERAL=47;
	public static final int FOR=48;
	public static final int FloatSuffix=49;
	public static final int GOTO=50;
	public static final int GT=51;
	public static final int HexDigit=52;
	public static final int HexPrefix=53;
	public static final int IDENTIFIER=54;
	public static final int IF=55;
	public static final int IMPLEMENTS=56;
	public static final int IMPORT=57;
	public static final int INSTANCEOF=58;
	public static final int INT=59;
	public static final int INTERFACE=60;
	public static final int INTLITERAL=61;
	public static final int IdentifierPart=62;
	public static final int IdentifierStart=63;
	public static final int IntegerNumber=64;
	public static final int LBRACE=65;
	public static final int LBRACKET=66;
	public static final int LINE_COMMENT=67;
	public static final int LONG=68;
	public static final int LONGLITERAL=69;
	public static final int LPAREN=70;
	public static final int LT=71;
	public static final int LongSuffix=72;
	public static final int MONKEYS_AT=73;
	public static final int NATIVE=74;
	public static final int NEW=75;
	public static final int NULL=76;
	public static final int NonIntegerNumber=77;
	public static final int PACKAGE=78;
	public static final int PERCENT=79;
	public static final int PERCENTEQ=80;
	public static final int PLUS=81;
	public static final int PLUSEQ=82;
	public static final int PLUSPLUS=83;
	public static final int PRIVATE=84;
	public static final int PROTECTED=85;
	public static final int PUBLIC=86;
	public static final int QUES=87;
	public static final int RBRACE=88;
	public static final int RBRACKET=89;
	public static final int RETURN=90;
	public static final int RPAREN=91;
	public static final int SEMI=92;
	public static final int SHORT=93;
	public static final int SLASH=94;
	public static final int SLASHEQ=95;
	public static final int STAR=96;
	public static final int STAREQ=97;
	public static final int STATIC=98;
	public static final int STRICTFP=99;
	public static final int STRINGLITERAL=100;
	public static final int SUB=101;
	public static final int SUBEQ=102;
	public static final int SUBSUB=103;
	public static final int SUPER=104;
	public static final int SWITCH=105;
	public static final int SYNCHRONIZED=106;
	public static final int SurrogateIdentifer=107;
	public static final int THIS=108;
	public static final int THROW=109;
	public static final int THROWS=110;
	public static final int TILDE=111;
	public static final int TRANSIENT=112;
	public static final int TRUE=113;
	public static final int TRY=114;
	public static final int VOID=115;
	public static final int VOLATILE=116;
	public static final int WHILE=117;
	public static final int WS=118;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[428+1];


	}

	@Override public String[] getTokenNames() { return JavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g"; }


	/** A class that encapsulates information about a class such as its name, data members, and methods 
	**/
	private ClassInfo classInfo = new ClassInfo();
	private MethodInfo methodInfo = new MethodInfo();
	public ClassInfo getClassInfo() { return classInfo; }
	String myDataString = "";
	String myMethodString = "";
	String myString = "";
	String myString2 = "";
	String myString3 = "";
	String classString = "";
	String localVarString = "";
	String modifiers = "";
	String multipleCallsString = "";
	boolean isDataMember = false;
	boolean isFormalParameter = false;
	boolean isClass = false;




	// $ANTLR start "compilationUnit"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:44:1: compilationUnit : ( ( annotations )? packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ;
	public final void compilationUnit() throws RecognitionException {
		int compilationUnit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:5: ( ( ( annotations )? packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:9: ( ( annotations )? packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:9: ( ( annotations )? packageDeclaration )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==MONKEYS_AT) ) {
				int LA2_1 = input.LA(2);
				if ( (synpred2_Java()) ) {
					alt2=1;
				}
			}
			else if ( (LA2_0==PACKAGE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:13: ( annotations )? packageDeclaration
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:13: ( annotations )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==MONKEYS_AT) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:14: annotations
							{
							pushFollow(FOLLOW_annotations_in_compilationUnit80);
							annotations();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_packageDeclaration_in_compilationUnit109);
					packageDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:49:9: ( importDeclaration )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==IMPORT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:49:10: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_compilationUnit131);
					importDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:51:9: ( typeDeclaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ABSTRACT||LA4_0==BOOLEAN||LA4_0==BYTE||LA4_0==CHAR||LA4_0==CLASS||LA4_0==DOUBLE||LA4_0==ENUM||LA4_0==FINAL||LA4_0==FLOAT||LA4_0==IDENTIFIER||(LA4_0 >= INT && LA4_0 <= INTERFACE)||LA4_0==LONG||LA4_0==LT||(LA4_0 >= MONKEYS_AT && LA4_0 <= NATIVE)||(LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)||(LA4_0 >= SEMI && LA4_0 <= SHORT)||(LA4_0 >= STATIC && LA4_0 <= STRICTFP)||LA4_0==SYNCHRONIZED||LA4_0==TRANSIENT||(LA4_0 >= VOID && LA4_0 <= VOLATILE)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:51:10: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_compilationUnit153);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

		}
	}
	// $ANTLR end "compilationUnit"



	// $ANTLR start "packageDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:54:1: packageDeclaration : 'package' qualifiedName ';' ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:55:5: ( 'package' qualifiedName ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:55:9: 'package' qualifiedName ';'
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration183); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedName_in_packageDeclaration185);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_packageDeclaration195); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "packageDeclaration"



	// $ANTLR start "importDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:58:1: importDeclaration : ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' );
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:59:5: ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IMPORT) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==STATIC) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==IDENTIFIER) ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3==DOT) ) {
							int LA9_4 = input.LA(5);
							if ( (LA9_4==STAR) ) {
								alt9=1;
							}
							else if ( (LA9_4==IDENTIFIER) ) {
								alt9=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA9_1==IDENTIFIER) ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3==DOT) ) {
						int LA9_4 = input.LA(4);
						if ( (LA9_4==STAR) ) {
							alt9=1;
						}
						else if ( (LA9_4==IDENTIFIER) ) {
							alt9=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:59:9: 'import' ( 'static' )? IDENTIFIER '.' '*' ';'
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration215); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:60:9: ( 'static' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==STATIC) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:60:10: 'static'
							{
							match(input,STATIC,FOLLOW_STATIC_in_importDeclaration227); if (state.failed) return;
							}
							break;

					}

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration248); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_importDeclaration250); if (state.failed) return;
					match(input,STAR,FOLLOW_STAR_in_importDeclaration252); if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_importDeclaration262); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:64:9: 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';'
					{
					match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration279); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:65:9: ( 'static' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==STATIC) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:65:10: 'static'
							{
							match(input,STATIC,FOLLOW_STATIC_in_importDeclaration291); if (state.failed) return;
							}
							break;

					}

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration312); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:68:9: ( '.' IDENTIFIER )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==DOT) ) {
							int LA7_1 = input.LA(2);
							if ( (LA7_1==IDENTIFIER) ) {
								alt7=1;
							}

						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:68:10: '.' IDENTIFIER
							{
							match(input,DOT,FOLLOW_DOT_in_importDeclaration323); if (state.failed) return;
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration325); if (state.failed) return;
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:70:9: ( '.' '*' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==DOT) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:70:10: '.' '*'
							{
							match(input,DOT,FOLLOW_DOT_in_importDeclaration347); if (state.failed) return;
							match(input,STAR,FOLLOW_STAR_in_importDeclaration349); if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_importDeclaration370); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "importDeclaration"



	// $ANTLR start "qualifiedImportName"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:74:1: qualifiedImportName : IDENTIFIER ( '.' IDENTIFIER )* ;
	public final void qualifiedImportName() throws RecognitionException {
		int qualifiedImportName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:75:5: ( IDENTIFIER ( '.' IDENTIFIER )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:75:9: IDENTIFIER ( '.' IDENTIFIER )*
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName389); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:76:9: ( '.' IDENTIFIER )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DOT) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:76:10: '.' IDENTIFIER
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedImportName400); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName402); if (state.failed) return;
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, qualifiedImportName_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedImportName"



	// $ANTLR start "typeDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:79:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:80:5: ( classOrInterfaceDeclaration | ';' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ABSTRACT||LA11_0==BOOLEAN||LA11_0==BYTE||LA11_0==CHAR||LA11_0==CLASS||LA11_0==DOUBLE||LA11_0==ENUM||LA11_0==FINAL||LA11_0==FLOAT||LA11_0==IDENTIFIER||(LA11_0 >= INT && LA11_0 <= INTERFACE)||LA11_0==LONG||LA11_0==LT||(LA11_0 >= MONKEYS_AT && LA11_0 <= NATIVE)||(LA11_0 >= PRIVATE && LA11_0 <= PUBLIC)||LA11_0==SHORT||(LA11_0 >= STATIC && LA11_0 <= STRICTFP)||LA11_0==SYNCHRONIZED||LA11_0==TRANSIENT||(LA11_0 >= VOID && LA11_0 <= VOLATILE)) ) {
				alt11=1;
			}
			else if ( (LA11_0==SEMI) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:80:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration432);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:81:9: ';'
					{
					match(input,SEMI,FOLLOW_SEMI_in_typeDeclaration442); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "typeDeclaration"



	// $ANTLR start "classOrInterfaceDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:83:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );
	public final void classOrInterfaceDeclaration() throws RecognitionException {
		int classOrInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:84:5: ( classDeclaration | interfaceDeclaration )
			int alt12=2;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA12_1 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case PUBLIC:
				{
				int LA12_2 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case PROTECTED:
				{
				int LA12_3 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case PRIVATE:
				{
				int LA12_4 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case STATIC:
				{
				int LA12_5 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case ABSTRACT:
				{
				int LA12_6 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case FINAL:
				{
				int LA12_7 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case NATIVE:
				{
				int LA12_8 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA12_9 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case TRANSIENT:
				{
				int LA12_10 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case VOLATILE:
				{
				int LA12_11 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case STRICTFP:
				{
				int LA12_12 = input.LA(2);
				if ( (synpred12_Java()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case CLASS:
			case ENUM:
				{
				alt12=1;
				}
				break;
			case INTERFACE:
				{
				alt12=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:84:10: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration462);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:85:9: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration472);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceDeclaration"



	// $ANTLR start "modifiers"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:89:1: modifiers returns [String value] : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* ;
	public final String modifiers() throws RecognitionException {
		String value = null;

		int modifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:90:5: ( ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:91:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:91:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
			loop13:
			while (true) {
				int alt13=13;
				switch ( input.LA(1) ) {
				case MONKEYS_AT:
					{
					int LA13_2 = input.LA(2);
					if ( (LA13_2==IDENTIFIER) ) {
						alt13=1;
					}

					}
					break;
				case PUBLIC:
					{
					alt13=2;
					}
					break;
				case PROTECTED:
					{
					alt13=3;
					}
					break;
				case PRIVATE:
					{
					alt13=4;
					}
					break;
				case STATIC:
					{
					alt13=5;
					}
					break;
				case ABSTRACT:
					{
					alt13=6;
					}
					break;
				case FINAL:
					{
					alt13=7;
					}
					break;
				case NATIVE:
					{
					alt13=8;
					}
					break;
				case SYNCHRONIZED:
					{
					alt13=9;
					}
					break;
				case TRANSIENT:
					{
					alt13=10;
					}
					break;
				case VOLATILE:
					{
					alt13=11;
					}
					break;
				case STRICTFP:
					{
					alt13=12;
					}
					break;
				}
				switch (alt13) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:91:10: annotation
					{
					pushFollow(FOLLOW_annotation_in_modifiers511);
					annotation();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += ""; }
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:92:9: 'public'
					{
					match(input,PUBLIC,FOLLOW_PUBLIC_in_modifiers523); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "public ";}
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:93:9: 'protected'
					{
					match(input,PROTECTED,FOLLOW_PROTECTED_in_modifiers535); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "protected ";}
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:94:9: 'private'
					{
					match(input,PRIVATE,FOLLOW_PRIVATE_in_modifiers547); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "private ";}
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:95:9: 'static'
					{
					match(input,STATIC,FOLLOW_STATIC_in_modifiers559); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "static "; }
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:96:9: 'abstract'
					{
					match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifiers571); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "abstract ";}
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:97:9: 'final'
					{
					match(input,FINAL,FOLLOW_FINAL_in_modifiers583); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "final ";}
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:98:9: 'native'
					{
					match(input,NATIVE,FOLLOW_NATIVE_in_modifiers596); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "native ";}
					}
					break;
				case 9 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:99:9: 'synchronized'
					{
					match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifiers608); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "synchronized ";}
					}
					break;
				case 10 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:100:9: 'transient'
					{
					match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifiers620); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "transient ";}
					}
					break;
				case 11 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:101:9: 'volatile'
					{
					match(input,VOLATILE,FOLLOW_VOLATILE_in_modifiers632); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "volatile ";}
					}
					break;
				case 12 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:102:9: 'strictfp'
					{
					match(input,STRICTFP,FOLLOW_STRICTFP_in_modifiers644); if (state.failed) return value;
					if ( state.backtracking==0 ) {modifiers += "strictfp ";}
					}
					break;

				default :
					break loop13;
				}
			}

			if ( state.backtracking==0 ) {if(modifiers=="") modifiers="null "; value = modifiers;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, modifiers_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "variableModifiers"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:105:1: variableModifiers returns [String value] : ( 'final' | annotation )* ;
	public final String variableModifiers() throws RecognitionException {
		String value = null;

		int variableModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:106:5: ( ( 'final' | annotation )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:106:9: ( 'final' | annotation )*
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:106:9: ( 'final' | annotation )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==FINAL) ) {
					alt14=1;
				}
				else if ( (LA14_0==MONKEYS_AT) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:106:13: 'final'
					{
					match(input,FINAL,FOLLOW_FINAL_in_variableModifiers682); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "final";}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:107:13: annotation
					{
					pushFollow(FOLLOW_annotation_in_variableModifiers698);
					annotation();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, variableModifiers_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "variableModifiers"



	// $ANTLR start "classDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:111:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:112:5: ( normalClassDeclaration | enumDeclaration )
			int alt15=2;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA15_1 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case PUBLIC:
				{
				int LA15_2 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case PROTECTED:
				{
				int LA15_3 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case PRIVATE:
				{
				int LA15_4 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case STATIC:
				{
				int LA15_5 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case ABSTRACT:
				{
				int LA15_6 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case FINAL:
				{
				int LA15_7 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case NATIVE:
				{
				int LA15_8 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA15_9 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case TRANSIENT:
				{
				int LA15_10 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case VOLATILE:
				{
				int LA15_11 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case STRICTFP:
				{
				int LA15_12 = input.LA(2);
				if ( (synpred27_Java()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case CLASS:
				{
				alt15=1;
				}
				break;
			case ENUM:
				{
				alt15=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:112:9: normalClassDeclaration
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration733);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:113:9: enumDeclaration
					{
					pushFollow(FOLLOW_enumDeclaration_in_classDeclaration743);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "normalClassDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:115:1: normalClassDeclaration : a= modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody ;
	public final void normalClassDeclaration() throws RecognitionException {
		int normalClassDeclaration_StartIndex = input.index();

		Token IDENTIFIER1=null;
		String a =null;
		ParserRuleReturnScope type2 =null;
		ParserRuleReturnScope typeList3 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:116:5: (a= modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:116:9: a= modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody
			{
			pushFollow(FOLLOW_modifiers_in_normalClassDeclaration764);
			a=modifiers();
			state._fsp--;
			if (state.failed) return;
			match(input,CLASS,FOLLOW_CLASS_in_normalClassDeclaration767); if (state.failed) return;
			IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalClassDeclaration769); if (state.failed) return;
			if ( state.backtracking==0 ) {classInfo.headerInfo(modifiers); modifiers = ""; classInfo.setName((IDENTIFIER1!=null?IDENTIFIER1.getText():null));}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:117:9: ( typeParameters )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:117:10: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration782);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:119:9: ( 'extends' type )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==EXTENDS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:119:10: 'extends' type
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_normalClassDeclaration804); if (state.failed) return;
					pushFollow(FOLLOW_type_in_normalClassDeclaration806);
					type2=type();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addAncestor((type2!=null?input.toString(type2.start,type2.stop):null));classInfo.setPlus(" extends " + (type2!=null?input.toString(type2.start,type2.stop):null));}
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:121:9: ( 'implements' typeList )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==IMPLEMENTS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:121:10: 'implements' typeList
					{
					match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_normalClassDeclaration830); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_normalClassDeclaration832);
					typeList3=typeList();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.setPlus(classInfo.getPlus()+" implements "+(typeList3!=null?input.toString(typeList3.start,typeList3.stop):null));}
					}
					break;

			}

			pushFollow(FOLLOW_classBody_in_normalClassDeclaration867);
			classBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, normalClassDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalClassDeclaration"



	// $ANTLR start "typeParameters"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:125:1: typeParameters returns [String value] : '<' e= typeParameter ( ',' f= typeParameter )* '>' ;
	public final String typeParameters() throws RecognitionException {
		String value = null;

		int typeParameters_StartIndex = input.index();

		String e =null;
		String f =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:126:5: ( '<' e= typeParameter ( ',' f= typeParameter )* '>' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:126:9: '<' e= typeParameter ( ',' f= typeParameter )* '>'
			{
			match(input,LT,FOLLOW_LT_in_typeParameters890); if (state.failed) return value;
			if ( state.backtracking==0 ) {myString = "<";}
			pushFollow(FOLLOW_typeParameter_in_typeParameters908);
			e=typeParameter();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {myString += e;}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:128:13: ( ',' f= typeParameter )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:128:14: ',' f= typeParameter
					{
					match(input,COMMA,FOLLOW_COMMA_in_typeParameters926); if (state.failed) return value;
					pushFollow(FOLLOW_typeParameter_in_typeParameters930);
					f=typeParameter();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {myString += ", "; myString += f;}
					}
					break;

				default :
					break loop19;
				}
			}

			if ( state.backtracking==0 ) {value = myString;}
			match(input,GT,FOLLOW_GT_in_typeParameters961); if (state.failed) return value;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, typeParameters_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "typeParameters"



	// $ANTLR start "typeParameter"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:132:1: typeParameter returns [String value] : IDENTIFIER ( 'extends' typeBound )? ;
	public final String typeParameter() throws RecognitionException {
		String value = null;

		int typeParameter_StartIndex = input.index();

		Token IDENTIFIER4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:133:5: ( IDENTIFIER ( 'extends' typeBound )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:133:9: IDENTIFIER ( 'extends' typeBound )?
			{
			IDENTIFIER4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeParameter983); if (state.failed) return value;
			if ( state.backtracking==0 ) {value = (IDENTIFIER4!=null?IDENTIFIER4.getText():null);}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:134:9: ( 'extends' typeBound )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==EXTENDS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:134:10: 'extends' typeBound
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_typeParameter996); if (state.failed) return value;
					pushFollow(FOLLOW_typeBound_in_typeParameter998);
					typeBound();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, typeParameter_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "typeParameter"



	// $ANTLR start "typeBound"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:137:1: typeBound : type ( '&' type )* ;
	public final void typeBound() throws RecognitionException {
		int typeBound_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:138:5: ( type ( '&' type )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:138:9: type ( '&' type )*
			{
			pushFollow(FOLLOW_type_in_typeBound1028);
			type();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:139:9: ( '&' type )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AMP) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:139:10: '&' type
					{
					match(input,AMP,FOLLOW_AMP_in_typeBound1039); if (state.failed) return;
					pushFollow(FOLLOW_type_in_typeBound1041);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, typeBound_StartIndex); }

		}
	}
	// $ANTLR end "typeBound"



	// $ANTLR start "enumDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:142:1: enumDeclaration : modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody ;
	public final void enumDeclaration() throws RecognitionException {
		int enumDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:143:5: ( modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:143:9: modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody
			{
			pushFollow(FOLLOW_modifiers_in_enumDeclaration1071);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {classInfo.headerInfo(modifiers);}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:144:9: ( 'enum' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:144:10: 'enum'
			{
			match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration1084); if (state.failed) return;
			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDeclaration1105); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:147:9: ( 'implements' typeList )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==IMPLEMENTS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:147:10: 'implements' typeList
					{
					match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_enumDeclaration1116); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_enumDeclaration1118);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_enumBody_in_enumDeclaration1139);
			enumBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, enumDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "enumDeclaration"



	// $ANTLR start "enumBody"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:152:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
	public final void enumBody() throws RecognitionException {
		int enumBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:153:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:153:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_enumBody1163); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:154:9: ( enumConstants )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==IDENTIFIER||LA23_0==MONKEYS_AT) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:154:10: enumConstants
					{
					pushFollow(FOLLOW_enumConstants_in_enumBody1174);
					enumConstants();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:156:9: ( ',' )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==COMMA) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:156:9: ','
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumBody1196); if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:157:9: ( enumBodyDeclarations )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==SEMI) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:157:10: enumBodyDeclarations
					{
					pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody1209);
					enumBodyDeclarations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_enumBody1231); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, enumBody_StartIndex); }

		}
	}
	// $ANTLR end "enumBody"



	// $ANTLR start "enumConstants"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:161:1: enumConstants : enumConstant ( ',' enumConstant )* ;
	public final void enumConstants() throws RecognitionException {
		int enumConstants_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:162:5: ( enumConstant ( ',' enumConstant )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:162:9: enumConstant ( ',' enumConstant )*
			{
			pushFollow(FOLLOW_enumConstant_in_enumConstants1250);
			enumConstant();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:163:9: ( ',' enumConstant )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==COMMA) ) {
					int LA26_1 = input.LA(2);
					if ( (LA26_1==IDENTIFIER||LA26_1==MONKEYS_AT) ) {
						alt26=1;
					}

				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:163:10: ',' enumConstant
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumConstants1261); if (state.failed) return;
					pushFollow(FOLLOW_enumConstant_in_enumConstants1263);
					enumConstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop26;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, enumConstants_StartIndex); }

		}
	}
	// $ANTLR end "enumConstants"



	// $ANTLR start "enumConstant"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:170:1: enumConstant : ( annotations )? IDENTIFIER ( arguments )? ( classBody )? ;
	public final void enumConstant() throws RecognitionException {
		int enumConstant_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:171:5: ( ( annotations )? IDENTIFIER ( arguments )? ( classBody )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:171:9: ( annotations )? IDENTIFIER ( arguments )? ( classBody )?
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:171:9: ( annotations )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==MONKEYS_AT) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:171:10: annotations
					{
					pushFollow(FOLLOW_annotations_in_enumConstant1296);
					annotations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumConstant1317); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:174:9: ( arguments )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==LPAREN) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:174:10: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant1328);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:176:9: ( classBody )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LBRACE) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:176:10: classBody
					{
					pushFollow(FOLLOW_classBody_in_enumConstant1350);
					classBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, enumConstant_StartIndex); }

		}
	}
	// $ANTLR end "enumConstant"



	// $ANTLR start "enumBodyDeclarations"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:181:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
	public final void enumBodyDeclarations() throws RecognitionException {
		int enumBodyDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:182:5: ( ';' ( classBodyDeclaration )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:182:9: ';' ( classBodyDeclaration )*
			{
			match(input,SEMI,FOLLOW_SEMI_in_enumBodyDeclarations1390); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:183:9: ( classBodyDeclaration )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==ABSTRACT||LA30_0==BOOLEAN||LA30_0==BYTE||LA30_0==CHAR||LA30_0==CLASS||LA30_0==DOUBLE||LA30_0==ENUM||LA30_0==FINAL||LA30_0==FLOAT||LA30_0==IDENTIFIER||(LA30_0 >= INT && LA30_0 <= INTERFACE)||LA30_0==LBRACE||LA30_0==LONG||LA30_0==LT||(LA30_0 >= MONKEYS_AT && LA30_0 <= NATIVE)||(LA30_0 >= PRIVATE && LA30_0 <= PUBLIC)||(LA30_0 >= SEMI && LA30_0 <= SHORT)||(LA30_0 >= STATIC && LA30_0 <= STRICTFP)||LA30_0==SYNCHRONIZED||LA30_0==TRANSIENT||(LA30_0 >= VOID && LA30_0 <= VOLATILE)) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:183:10: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1402);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop30;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, enumBodyDeclarations_StartIndex); }

		}
	}
	// $ANTLR end "enumBodyDeclarations"



	// $ANTLR start "interfaceDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:186:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:187:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
			int alt31=2;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA31_1 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case PUBLIC:
				{
				int LA31_2 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case PROTECTED:
				{
				int LA31_3 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case PRIVATE:
				{
				int LA31_4 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case STATIC:
				{
				int LA31_5 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case ABSTRACT:
				{
				int LA31_6 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case FINAL:
				{
				int LA31_7 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case NATIVE:
				{
				int LA31_8 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA31_9 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case TRANSIENT:
				{
				int LA31_10 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case VOLATILE:
				{
				int LA31_11 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case STRICTFP:
				{
				int LA31_12 = input.LA(2);
				if ( (synpred43_Java()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

				}
				break;
			case INTERFACE:
				{
				alt31=1;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:187:9: normalInterfaceDeclaration
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1432);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:188:9: annotationTypeDeclaration
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1442);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, interfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "normalInterfaceDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:191:1: normalInterfaceDeclaration : modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
	public final void normalInterfaceDeclaration() throws RecognitionException {
		int normalInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:192:5: ( modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:192:9: modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody
			{
			pushFollow(FOLLOW_modifiers_in_normalInterfaceDeclaration1466);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			match(input,INTERFACE,FOLLOW_INTERFACE_in_normalInterfaceDeclaration1468); if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1470); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:193:9: ( typeParameters )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==LT) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:193:10: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration1481);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:195:9: ( 'extends' typeList )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EXTENDS) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:195:10: 'extends' typeList
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_normalInterfaceDeclaration1503); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration1505);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration1526);
			interfaceBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, normalInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalInterfaceDeclaration"


	public static class typeList_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "typeList"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:199:1: typeList : type ( ',' type )* ;
	public final JavaParser.typeList_return typeList() throws RecognitionException {
		JavaParser.typeList_return retval = new JavaParser.typeList_return();
		retval.start = input.LT(1);
		int typeList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:200:5: ( type ( ',' type )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:200:9: type ( ',' type )*
			{
			pushFollow(FOLLOW_type_in_typeList1545);
			type();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:201:9: ( ',' type )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==COMMA) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:201:10: ',' type
					{
					match(input,COMMA,FOLLOW_COMMA_in_typeList1556); if (state.failed) return retval;
					pushFollow(FOLLOW_type_in_typeList1558);
					type();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop34;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, typeList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeList"



	// $ANTLR start "classBody"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:204:1: classBody : '{' ( classBodyDeclaration )* '}' ;
	public final void classBody() throws RecognitionException {
		int classBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:205:5: ( '{' ( classBodyDeclaration )* '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:205:9: '{' ( classBodyDeclaration )* '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_classBody1588); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:206:9: ( classBodyDeclaration )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==ABSTRACT||LA35_0==BOOLEAN||LA35_0==BYTE||LA35_0==CHAR||LA35_0==CLASS||LA35_0==DOUBLE||LA35_0==ENUM||LA35_0==FINAL||LA35_0==FLOAT||LA35_0==IDENTIFIER||(LA35_0 >= INT && LA35_0 <= INTERFACE)||LA35_0==LBRACE||LA35_0==LONG||LA35_0==LT||(LA35_0 >= MONKEYS_AT && LA35_0 <= NATIVE)||(LA35_0 >= PRIVATE && LA35_0 <= PUBLIC)||(LA35_0 >= SEMI && LA35_0 <= SHORT)||(LA35_0 >= STATIC && LA35_0 <= STRICTFP)||LA35_0==SYNCHRONIZED||LA35_0==TRANSIENT||(LA35_0 >= VOID && LA35_0 <= VOLATILE)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:206:10: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_classBody1600);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_classBody1622); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, classBody_StartIndex); }

		}
	}
	// $ANTLR end "classBody"



	// $ANTLR start "interfaceBody"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:210:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
	public final void interfaceBody() throws RecognitionException {
		int interfaceBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:211:5: ( '{' ( interfaceBodyDeclaration )* '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:211:9: '{' ( interfaceBodyDeclaration )* '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_interfaceBody1641); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:212:9: ( interfaceBodyDeclaration )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ABSTRACT||LA36_0==BOOLEAN||LA36_0==BYTE||LA36_0==CHAR||LA36_0==CLASS||LA36_0==DOUBLE||LA36_0==ENUM||LA36_0==FINAL||LA36_0==FLOAT||LA36_0==IDENTIFIER||(LA36_0 >= INT && LA36_0 <= INTERFACE)||LA36_0==LONG||LA36_0==LT||(LA36_0 >= MONKEYS_AT && LA36_0 <= NATIVE)||(LA36_0 >= PRIVATE && LA36_0 <= PUBLIC)||(LA36_0 >= SEMI && LA36_0 <= SHORT)||(LA36_0 >= STATIC && LA36_0 <= STRICTFP)||LA36_0==SYNCHRONIZED||LA36_0==TRANSIENT||(LA36_0 >= VOID && LA36_0 <= VOLATILE)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:212:10: interfaceBodyDeclaration
					{
					pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody1653);
					interfaceBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop36;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_interfaceBody1675); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

		}
	}
	// $ANTLR end "interfaceBody"



	// $ANTLR start "classBodyDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:216:1: classBodyDeclaration : ( ';' | ( 'static' )? block | memberDecl );
	public final void classBodyDeclaration() throws RecognitionException {
		int classBodyDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:217:5: ( ';' | ( 'static' )? block | memberDecl )
			int alt38=3;
			switch ( input.LA(1) ) {
			case SEMI:
				{
				alt38=1;
				}
				break;
			case STATIC:
				{
				int LA38_2 = input.LA(2);
				if ( (LA38_2==LBRACE) ) {
					alt38=2;
				}
				else if ( (LA38_2==ABSTRACT||LA38_2==BOOLEAN||LA38_2==BYTE||LA38_2==CHAR||LA38_2==CLASS||LA38_2==DOUBLE||LA38_2==ENUM||LA38_2==FINAL||LA38_2==FLOAT||LA38_2==IDENTIFIER||(LA38_2 >= INT && LA38_2 <= INTERFACE)||LA38_2==LONG||LA38_2==LT||(LA38_2 >= MONKEYS_AT && LA38_2 <= NATIVE)||(LA38_2 >= PRIVATE && LA38_2 <= PUBLIC)||LA38_2==SHORT||(LA38_2 >= STATIC && LA38_2 <= STRICTFP)||LA38_2==SYNCHRONIZED||LA38_2==TRANSIENT||(LA38_2 >= VOID && LA38_2 <= VOLATILE)) ) {
					alt38=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LBRACE:
				{
				alt38=2;
				}
				break;
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case IDENTIFIER:
			case INT:
			case INTERFACE:
			case LONG:
			case LT:
			case MONKEYS_AT:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
				{
				alt38=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:217:9: ';'
					{
					match(input,SEMI,FOLLOW_SEMI_in_classBodyDeclaration1694); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:218:9: ( 'static' )? block
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:218:9: ( 'static' )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==STATIC) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:218:10: 'static'
							{
							match(input,STATIC,FOLLOW_STATIC_in_classBodyDeclaration1705); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_block_in_classBodyDeclaration1727);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:221:9: memberDecl
					{
					pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1737);
					memberDecl();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, classBodyDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classBodyDeclaration"



	// $ANTLR start "memberDecl"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:223:1: memberDecl : ( fieldDeclaration | methodDeclaration | classDeclaration | interfaceDeclaration );
	public final void memberDecl() throws RecognitionException {
		int memberDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:224:5: ( fieldDeclaration | methodDeclaration | classDeclaration | interfaceDeclaration )
			int alt39=4;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA39_1 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case PUBLIC:
				{
				int LA39_2 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case PROTECTED:
				{
				int LA39_3 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case PRIVATE:
				{
				int LA39_4 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case STATIC:
				{
				int LA39_5 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case ABSTRACT:
				{
				int LA39_6 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case FINAL:
				{
				int LA39_7 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case NATIVE:
				{
				int LA39_8 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA39_9 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case TRANSIENT:
				{
				int LA39_10 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case VOLATILE:
				{
				int LA39_11 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case STRICTFP:
				{
				int LA39_12 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}
				else if ( (synpred54_Java()) ) {
					alt39=3;
				}
				else if ( (true) ) {
					alt39=4;
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA39_13 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				int LA39_14 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA39_15 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BYTE:
				{
				int LA39_16 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA39_17 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA39_18 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA39_19 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA39_20 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA39_21 = input.LA(2);
				if ( (synpred52_Java()) ) {
					alt39=1;
				}
				else if ( (synpred53_Java()) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LT:
			case VOID:
				{
				alt39=2;
				}
				break;
			case CLASS:
			case ENUM:
				{
				alt39=3;
				}
				break;
			case INTERFACE:
				{
				alt39=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:224:10: fieldDeclaration
					{
					pushFollow(FOLLOW_fieldDeclaration_in_memberDecl1759);
					fieldDeclaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { modifiers = ""; String lines[] = myDataString.split("\\r?\\n"); for(int i = 0; i < lines.length; ++i) classInfo.addDataMember(lines[i]);}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:225:10: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_memberDecl1772);
					methodDeclaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addMethod(methodInfo);}
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:226:10: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_memberDecl1785);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:227:10: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1796);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, memberDecl_StartIndex); }

		}
	}
	// $ANTLR end "memberDecl"



	// $ANTLR start "methodDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:229:1: methodDeclaration returns [String value] : ( modifiers ( typeParameters )? IDENTIFIER e= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER f= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' ) );
	public final String methodDeclaration() throws RecognitionException {
		String value = null;

		int methodDeclaration_StartIndex = input.index();

		Token IDENTIFIER6=null;
		Token IDENTIFIER9=null;
		String e =null;
		String f =null;
		String modifiers5 =null;
		String modifiers7 =null;
		ParserRuleReturnScope type8 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:230:5: ( modifiers ( typeParameters )? IDENTIFIER e= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER f= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' ) )
			int alt49=2;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA49_1 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case PUBLIC:
				{
				int LA49_2 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case PROTECTED:
				{
				int LA49_3 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case PRIVATE:
				{
				int LA49_4 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case STATIC:
				{
				int LA49_5 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case ABSTRACT:
				{
				int LA49_6 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case FINAL:
				{
				int LA49_7 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case NATIVE:
				{
				int LA49_8 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA49_9 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case TRANSIENT:
				{
				int LA49_10 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case VOLATILE:
				{
				int LA49_11 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case STRICTFP:
				{
				int LA49_12 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case LT:
				{
				int LA49_13 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA49_14 = input.LA(2);
				if ( (synpred59_Java()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
				{
				alt49=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:232:10: modifiers ( typeParameters )? IDENTIFIER e= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
					{
					pushFollow(FOLLOW_modifiers_in_methodDeclaration1836);
					modifiers5=modifiers();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {methodInfo = new MethodInfo(); modifiers = ""; String mods[] = modifiers5.split(" "); for(int i = 0; i < mods.length; ++i){methodInfo.addModifier(mods[i]);}}
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:233:9: ( typeParameters )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==LT) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:233:10: typeParameters
							{
							pushFollow(FOLLOW_typeParameters_in_methodDeclaration1849);
							typeParameters();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) {}
							}
							break;

					}

					IDENTIFIER6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration1872); if (state.failed) return value;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((IDENTIFIER6!=null?IDENTIFIER6.getText():null)); methodInfo.setName((IDENTIFIER6!=null?IDENTIFIER6.getText():null)); methodInfo.setReturnType("constructor");}
					pushFollow(FOLLOW_formalParameters_in_methodDeclaration1886);
					e=formalParameters();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {isFormalParameter = true; myString = ""; myString2 = ""; myString3 = ""; if(e != "")methodInfo.addParameter(e); isFormalParameter = true;}
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:237:9: ( 'throws' qualifiedNameList )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==THROWS) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:237:10: 'throws' qualifiedNameList
							{
							match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration1899); if (state.failed) return value;
							pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration1901);
							qualifiedNameList();
							state._fsp--;
							if (state.failed) return value;
							}
							break;

					}

					match(input,LBRACE,FOLLOW_LBRACE_in_methodDeclaration1922); if (state.failed) return value;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:240:9: ( explicitConstructorInvocation )?
					int alt42=2;
					switch ( input.LA(1) ) {
						case LT:
							{
							alt42=1;
							}
							break;
						case THIS:
							{
							int LA42_2 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case LPAREN:
							{
							int LA42_3 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case SUPER:
							{
							int LA42_4 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case IDENTIFIER:
							{
							int LA42_5 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case INTLITERAL:
							{
							int LA42_6 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case NEW:
							{
							int LA42_7 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case BOOLEAN:
							{
							int LA42_8 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case CHAR:
							{
							int LA42_9 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case BYTE:
							{
							int LA42_10 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case SHORT:
							{
							int LA42_11 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case INT:
							{
							int LA42_12 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case LONG:
							{
							int LA42_13 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case FLOAT:
							{
							int LA42_14 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case DOUBLE:
							{
							int LA42_15 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case VOID:
							{
							int LA42_16 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
						case CHARLITERAL:
						case DOUBLELITERAL:
						case FALSE:
						case FLOATLITERAL:
						case LONGLITERAL:
						case NULL:
						case STRINGLITERAL:
						case TRUE:
							{
							int LA42_48 = input.LA(2);
							if ( (synpred57_Java()) ) {
								alt42=1;
							}
							}
							break;
					}
					switch (alt42) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:240:10: explicitConstructorInvocation
							{
							pushFollow(FOLLOW_explicitConstructorInvocation_in_methodDeclaration1934);
							explicitConstructorInvocation();
							state._fsp--;
							if (state.failed) return value;
							}
							break;

					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:242:9: ( blockStatement )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==ABSTRACT||(LA43_0 >= ASSERT && LA43_0 <= BANG)||(LA43_0 >= BOOLEAN && LA43_0 <= BYTE)||(LA43_0 >= CHAR && LA43_0 <= CLASS)||LA43_0==CONTINUE||LA43_0==DO||(LA43_0 >= DOUBLE && LA43_0 <= DOUBLELITERAL)||LA43_0==ENUM||(LA43_0 >= FALSE && LA43_0 <= FINAL)||(LA43_0 >= FLOAT && LA43_0 <= FOR)||(LA43_0 >= IDENTIFIER && LA43_0 <= IF)||(LA43_0 >= INT && LA43_0 <= INTLITERAL)||LA43_0==LBRACE||(LA43_0 >= LONG && LA43_0 <= LPAREN)||(LA43_0 >= MONKEYS_AT && LA43_0 <= NULL)||LA43_0==PLUS||(LA43_0 >= PLUSPLUS && LA43_0 <= PUBLIC)||LA43_0==RETURN||(LA43_0 >= SEMI && LA43_0 <= SHORT)||(LA43_0 >= STATIC && LA43_0 <= SUB)||(LA43_0 >= SUBSUB && LA43_0 <= SYNCHRONIZED)||(LA43_0 >= THIS && LA43_0 <= THROW)||(LA43_0 >= TILDE && LA43_0 <= WHILE)||(LA43_0 >= 119 && LA43_0 <= 121)) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:242:10: blockStatement
							{
							pushFollow(FOLLOW_blockStatement_in_methodDeclaration1956);
							blockStatement();
							state._fsp--;
							if (state.failed) return value;
							}
							break;

						default :
							break loop43;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_methodDeclaration1978); if (state.failed) return value;
					if ( state.backtracking==0 ) {classInfo.addToAllMethodCalls(classInfo.getMethodCalls()); classInfo.emptyMethodCalls();}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:245:9: modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER f= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' )
					{
					pushFollow(FOLLOW_modifiers_in_methodDeclaration1990);
					modifiers7=modifiers();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {methodInfo = new MethodInfo(); modifiers = ""; String mods[] = modifiers7.split(" "); for(int i = 0; i < mods.length; ++i){methodInfo.addModifier(mods[i]);}}
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:246:9: ( typeParameters )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==LT) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:246:10: typeParameters
							{
							pushFollow(FOLLOW_typeParameters_in_methodDeclaration2003);
							typeParameters();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) {}
							}
							break;

					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:248:9: ( type | 'void' )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==BOOLEAN||LA45_0==BYTE||LA45_0==CHAR||LA45_0==DOUBLE||LA45_0==FLOAT||LA45_0==IDENTIFIER||LA45_0==INT||LA45_0==LONG||LA45_0==SHORT) ) {
						alt45=1;
					}
					else if ( (LA45_0==VOID) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return value;}
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:248:10: type
							{
							pushFollow(FOLLOW_type_in_methodDeclaration2027);
							type8=type();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) {methodInfo.setReturnType((type8!=null?((JavaParser.type_return)type8).value:null));}
							}
							break;
						case 2 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:249:13: 'void'
							{
							match(input,VOID,FOLLOW_VOID_in_methodDeclaration2044); if (state.failed) return value;
							if ( state.backtracking==0 ) {methodInfo.setReturnType("void");}
							}
							break;

					}

					IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration2066); if (state.failed) return value;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((IDENTIFIER9!=null?IDENTIFIER9.getText():null)); methodInfo.setName((IDENTIFIER9!=null?IDENTIFIER9.getText():null));}
					pushFollow(FOLLOW_formalParameters_in_methodDeclaration2080);
					f=formalParameters();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {isFormalParameter = true; myString = ""; myString2 = ""; myString3 = ""; if(f != "")methodInfo.addParameter(f); isFormalParameter = true;}
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:253:9: ( '[' ']' )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==LBRACKET) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:253:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_methodDeclaration2094); if (state.failed) return value;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_methodDeclaration2096); if (state.failed) return value;
							}
							break;

						default :
							break loop46;
						}
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:255:9: ( 'throws' qualifiedNameList )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==THROWS) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:255:10: 'throws' qualifiedNameList
							{
							match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2118); if (state.failed) return value;
							pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2120);
							qualifiedNameList();
							state._fsp--;
							if (state.failed) return value;
							}
							break;

					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:257:9: ( block | ';' )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==LBRACE) ) {
						alt48=1;
					}
					else if ( (LA48_0==SEMI) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return value;}
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:258:13: block
							{
							pushFollow(FOLLOW_block_in_methodDeclaration2175);
							block();
							state._fsp--;
							if (state.failed) return value;
							}
							break;
						case 2 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:259:13: ';'
							{
							match(input,SEMI,FOLLOW_SEMI_in_methodDeclaration2190); if (state.failed) return value;
							}
							break;

					}

					if ( state.backtracking==0 ) {{classInfo.addToAllMethodCalls(classInfo.getMethodCalls()); classInfo.emptyMethodCalls();} value = myMethodString;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, methodDeclaration_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "methodDeclaration"



	// $ANTLR start "fieldDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:262:1: fieldDeclaration returns [String value] : modifiers type e= variableDeclarator ( ',' f= variableDeclarator )* ';' ;
	public final String fieldDeclaration() throws RecognitionException {
		String value = null;

		int fieldDeclaration_StartIndex = input.index();

		String e =null;
		String f =null;
		String modifiers10 =null;
		ParserRuleReturnScope type11 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:263:5: ( modifiers type e= variableDeclarator ( ',' f= variableDeclarator )* ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:263:9: modifiers type e= variableDeclarator ( ',' f= variableDeclarator )* ';'
			{
			pushFollow(FOLLOW_modifiers_in_fieldDeclaration2226);
			modifiers10=modifiers();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {if(modifiers10 != null) myDataString = modifiers10; }
			pushFollow(FOLLOW_type_in_fieldDeclaration2239);
			type11=type();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {isDataMember = true; if((type11!=null?((JavaParser.type_return)type11).value:null) != null) myDataString += (type11!=null?((JavaParser.type_return)type11).value:null).trim(); if(isClass && isDataMember && !(type11!=null?((JavaParser.type_return)type11).value:null).equals("String")){classInfo.addAggregate((type11!=null?((JavaParser.type_return)type11).value:null)); isClass = false; isDataMember = false;}}
			pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2255);
			e=variableDeclarator();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {if(e != null) myDataString += " " + e.trim();}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:266:9: ( ',' f= variableDeclarator )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==COMMA) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:266:10: ',' f= variableDeclarator
					{
					match(input,COMMA,FOLLOW_COMMA_in_fieldDeclaration2268); if (state.failed) return value;
					pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2272);
					f=variableDeclarator();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {myDataString += "\n"; if(modifiers10 != null) myDataString += modifiers10; 
					        				if((type11!=null?((JavaParser.type_return)type11).value:null) != null) myDataString += (type11!=null?((JavaParser.type_return)type11).value:null) + " "; 
					        				if(f != null) myDataString += f.trim();}
					}
					break;

				default :
					break loop50;
				}
			}

			if ( state.backtracking==0 ) {value = myDataString;}
			match(input,SEMI,FOLLOW_SEMI_in_fieldDeclaration2300); if (state.failed) return value;
			if ( state.backtracking==0 ) {}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, fieldDeclaration_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "fieldDeclaration"



	// $ANTLR start "variableDeclarator"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:272:1: variableDeclarator returns [String value] : IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )? ;
	public final String variableDeclarator() throws RecognitionException {
		String value = null;

		int variableDeclarator_StartIndex = input.index();

		Token IDENTIFIER12=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:273:5: ( IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:273:9: IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )?
			{
			IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclarator2325); if (state.failed) return value;
			if ( state.backtracking==0 ) {value = (IDENTIFIER12!=null?IDENTIFIER12.getText():null);}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:274:9: ( '[' ']' )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==LBRACKET) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:274:10: '[' ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_variableDeclarator2338); if (state.failed) return value;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_variableDeclarator2340); if (state.failed) return value;
					}
					break;

				default :
					break loop51;
				}
			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:276:9: ( '=' variableInitializer )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==EQ) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:276:10: '=' variableInitializer
					{
					match(input,EQ,FOLLOW_EQ_in_variableDeclarator2362); if (state.failed) return value;
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator2364);
					variableInitializer();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, variableDeclarator_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "variableDeclarator"



	// $ANTLR start "interfaceBodyDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:282:1: interfaceBodyDeclaration : ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' );
	public final void interfaceBodyDeclaration() throws RecognitionException {
		int interfaceBodyDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:283:5: ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' )
			int alt53=5;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA53_1 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PUBLIC:
				{
				int LA53_2 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PROTECTED:
				{
				int LA53_3 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PRIVATE:
				{
				int LA53_4 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STATIC:
				{
				int LA53_5 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ABSTRACT:
				{
				int LA53_6 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FINAL:
				{
				int LA53_7 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NATIVE:
				{
				int LA53_8 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA53_9 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TRANSIENT:
				{
				int LA53_10 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOLATILE:
				{
				int LA53_11 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRICTFP:
				{
				int LA53_12 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}
				else if ( (synpred70_Java()) ) {
					alt53=3;
				}
				else if ( (synpred71_Java()) ) {
					alt53=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA53_13 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				int LA53_14 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA53_15 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BYTE:
				{
				int LA53_16 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA53_17 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA53_18 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA53_19 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA53_20 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA53_21 = input.LA(2);
				if ( (synpred68_Java()) ) {
					alt53=1;
				}
				else if ( (synpred69_Java()) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LT:
			case VOID:
				{
				alt53=2;
				}
				break;
			case INTERFACE:
				{
				alt53=3;
				}
				break;
			case CLASS:
			case ENUM:
				{
				alt53=4;
				}
				break;
			case SEMI:
				{
				alt53=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:284:9: interfaceFieldDeclaration
					{
					pushFollow(FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2402);
					interfaceFieldDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:285:9: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2412);
					interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:286:9: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2422);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:287:9: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_interfaceBodyDeclaration2432);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:288:9: ';'
					{
					match(input,SEMI,FOLLOW_SEMI_in_interfaceBodyDeclaration2442); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, interfaceBodyDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceBodyDeclaration"



	// $ANTLR start "interfaceMethodDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:290:1: interfaceMethodDeclaration : modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		int interfaceMethodDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:291:5: ( modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:291:9: modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
			{
			pushFollow(FOLLOW_modifiers_in_interfaceMethodDeclaration2461);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:292:9: ( typeParameters )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==LT) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:292:10: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_interfaceMethodDeclaration2472);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:294:9: ( type | 'void' )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==BOOLEAN||LA55_0==BYTE||LA55_0==CHAR||LA55_0==DOUBLE||LA55_0==FLOAT||LA55_0==IDENTIFIER||LA55_0==INT||LA55_0==LONG||LA55_0==SHORT) ) {
				alt55=1;
			}
			else if ( (LA55_0==VOID) ) {
				alt55=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:294:10: type
					{
					pushFollow(FOLLOW_type_in_interfaceMethodDeclaration2494);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:295:10: 'void'
					{
					match(input,VOID,FOLLOW_VOID_in_interfaceMethodDeclaration2505); if (state.failed) return;
					}
					break;

			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2525); if (state.failed) return;
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2535);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:299:9: ( '[' ']' )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==LBRACKET) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:299:10: '[' ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_interfaceMethodDeclaration2546); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_interfaceMethodDeclaration2548); if (state.failed) return;
					}
					break;

				default :
					break loop56;
				}
			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:301:9: ( 'throws' qualifiedNameList )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==THROWS) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:301:10: 'throws' qualifiedNameList
					{
					match(input,THROWS,FOLLOW_THROWS_in_interfaceMethodDeclaration2570); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration2572);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_interfaceMethodDeclaration2585); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, interfaceMethodDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMethodDeclaration"



	// $ANTLR start "interfaceFieldDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:309:1: interfaceFieldDeclaration : modifiers type variableDeclarator ( ',' variableDeclarator )* ';' ;
	public final void interfaceFieldDeclaration() throws RecognitionException {
		int interfaceFieldDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:310:5: ( modifiers type variableDeclarator ( ',' variableDeclarator )* ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:310:9: modifiers type variableDeclarator ( ',' variableDeclarator )* ';'
			{
			pushFollow(FOLLOW_modifiers_in_interfaceFieldDeclaration2606);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_interfaceFieldDeclaration2608);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2610);
			variableDeclarator();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:311:9: ( ',' variableDeclarator )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==COMMA) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:311:10: ',' variableDeclarator
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaceFieldDeclaration2621); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2623);
					variableDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop58;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_interfaceFieldDeclaration2644); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, interfaceFieldDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceFieldDeclaration"


	public static class type_return extends ParserRuleReturnScope {
		public String value;
	};


	// $ANTLR start "type"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:315:1: type returns [String value] : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
	public final JavaParser.type_return type() throws RecognitionException {
		JavaParser.type_return retval = new JavaParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		String classOrInterfaceType13 =null;
		String primitiveType14 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:316:5: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==IDENTIFIER) ) {
				alt61=1;
			}
			else if ( (LA61_0==BOOLEAN||LA61_0==BYTE||LA61_0==CHAR||LA61_0==DOUBLE||LA61_0==FLOAT||LA61_0==INT||LA61_0==LONG||LA61_0==SHORT) ) {
				alt61=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:316:9: classOrInterfaceType ( '[' ']' )*
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_type2667);
					classOrInterfaceType13=classOrInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = classOrInterfaceType13; isDataMember = false;}
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:317:9: ( '[' ']' )*
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==LBRACKET) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:317:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_type2680); if (state.failed) return retval;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_type2682); if (state.failed) return retval;
							}
							break;

						default :
							break loop59;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:319:9: primitiveType ( '[' ']' )*
					{
					pushFollow(FOLLOW_primitiveType_in_type2703);
					primitiveType14=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = primitiveType14; isClass = false;}
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:320:9: ( '[' ']' )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==LBRACKET) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:320:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_type2721); if (state.failed) return retval;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_type2723); if (state.failed) return retval;
							if ( state.backtracking==0 ) {retval.value = retval.value + "[]";}
							}
							break;

						default :
							break loop60;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type"



	// $ANTLR start "classOrInterfaceType"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:323:1: classOrInterfaceType returns [String value] : e= IDENTIFIER (f= typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* ;
	public final String classOrInterfaceType() throws RecognitionException {
		String value = null;

		int classOrInterfaceType_StartIndex = input.index();

		Token e=null;
		String f =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:324:5: (e= IDENTIFIER (f= typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:324:9: e= IDENTIFIER (f= typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )*
			{
			e=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType2766); if (state.failed) return value;
			if ( state.backtracking==0 ) {isClass = true; value = (e!=null?e.getText():null);}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:325:9: (f= typeArguments )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==LT) ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1==BOOLEAN||LA62_1==BYTE||LA62_1==CHAR||LA62_1==DOUBLE||LA62_1==FLOAT||LA62_1==IDENTIFIER||LA62_1==INT||LA62_1==LONG||LA62_1==QUES||LA62_1==SHORT) ) {
					alt62=1;
				}
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:325:10: f= typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2782);
					f=typeArguments();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

			}

			if ( state.backtracking==0 ) {isClass = true; classString = (e!=null?e.getText():null); if(f != null) classString += f; value = classString;}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:327:9: ( '.' IDENTIFIER ( typeArguments )? )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==DOT) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:327:10: '.' IDENTIFIER ( typeArguments )?
					{
					match(input,DOT,FOLLOW_DOT_in_classOrInterfaceType2809); if (state.failed) return value;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType2811); if (state.failed) return value;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:328:13: ( typeArguments )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==LT) ) {
						int LA63_1 = input.LA(2);
						if ( (LA63_1==BOOLEAN||LA63_1==BYTE||LA63_1==CHAR||LA63_1==DOUBLE||LA63_1==FLOAT||LA63_1==IDENTIFIER||LA63_1==INT||LA63_1==LONG||LA63_1==QUES||LA63_1==SHORT) ) {
							alt63=1;
						}
					}
					switch (alt63) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:328:14: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2826);
							typeArguments();
							state._fsp--;
							if (state.failed) return value;
							}
							break;

					}

					}
					break;

				default :
					break loop64;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, classOrInterfaceType_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "classOrInterfaceType"



	// $ANTLR start "primitiveType"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:332:1: primitiveType returns [String value] : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
	public final String primitiveType() throws RecognitionException {
		String value = null;

		int primitiveType_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:333:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
			int alt65=8;
			switch ( input.LA(1) ) {
			case BOOLEAN:
				{
				alt65=1;
				}
				break;
			case CHAR:
				{
				alt65=2;
				}
				break;
			case BYTE:
				{
				alt65=3;
				}
				break;
			case SHORT:
				{
				alt65=4;
				}
				break;
			case INT:
				{
				alt65=5;
				}
				break;
			case LONG:
				{
				alt65=6;
				}
				break;
			case FLOAT:
				{
				alt65=7;
				}
				break;
			case DOUBLE:
				{
				alt65=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:333:9: 'boolean'
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType2878); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "boolean";}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:334:9: 'char'
					{
					match(input,CHAR,FOLLOW_CHAR_in_primitiveType2890); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "char";}
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:335:9: 'byte'
					{
					match(input,BYTE,FOLLOW_BYTE_in_primitiveType2903); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "byte";}
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:336:9: 'short'
					{
					match(input,SHORT,FOLLOW_SHORT_in_primitiveType2916); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "short";}
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:337:9: 'int'
					{
					match(input,INT,FOLLOW_INT_in_primitiveType2929); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "int";}
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:338:9: 'long'
					{
					match(input,LONG,FOLLOW_LONG_in_primitiveType2942); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "long";}
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:339:9: 'float'
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType2955); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "float";}
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:340:9: 'double'
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType2968); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = "double";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, primitiveType_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "primitiveType"



	// $ANTLR start "typeArguments"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:342:1: typeArguments returns [String value] : '<' e= typeArgument ( ',' f= typeArgument )* '>' ;
	public final String typeArguments() throws RecognitionException {
		String value = null;

		int typeArguments_StartIndex = input.index();

		String e =null;
		String f =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:343:5: ( '<' e= typeArgument ( ',' f= typeArgument )* '>' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:343:9: '<' e= typeArgument ( ',' f= typeArgument )* '>'
			{
			match(input,LT,FOLLOW_LT_in_typeArguments2998); if (state.failed) return value;
			pushFollow(FOLLOW_typeArgument_in_typeArguments3002);
			e=typeArgument();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {myString2 = "<"; if(e != null) myString2 += e;}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:344:9: ( ',' f= typeArgument )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==COMMA) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:344:10: ',' f= typeArgument
					{
					match(input,COMMA,FOLLOW_COMMA_in_typeArguments3015); if (state.failed) return value;
					pushFollow(FOLLOW_typeArgument_in_typeArguments3019);
					f=typeArgument();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {myString2 += ", "; if(f != null) myString2 += f;}
					}
					break;

				default :
					break loop66;
				}
			}

			match(input,GT,FOLLOW_GT_in_typeArguments3043); if (state.failed) return value;
			if ( state.backtracking==0 ) {myString2 += ">"; value = myString2;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, typeArguments_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "typeArguments"



	// $ANTLR start "typeArgument"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:348:1: typeArgument returns [String value] : ( type | '?' ( ( 'extends' | 'super' ) type )? );
	public final String typeArgument() throws RecognitionException {
		String value = null;

		int typeArgument_StartIndex = input.index();

		ParserRuleReturnScope type15 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:349:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==BOOLEAN||LA68_0==BYTE||LA68_0==CHAR||LA68_0==DOUBLE||LA68_0==FLOAT||LA68_0==IDENTIFIER||LA68_0==INT||LA68_0==LONG||LA68_0==SHORT) ) {
				alt68=1;
			}
			else if ( (LA68_0==QUES) ) {
				alt68=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:349:9: type
					{
					pushFollow(FOLLOW_type_in_typeArgument3068);
					type15=type();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (type15!=null?((JavaParser.type_return)type15).value:null);}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:350:9: '?' ( ( 'extends' | 'super' ) type )?
					{
					match(input,QUES,FOLLOW_QUES_in_typeArgument3080); if (state.failed) return value;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:351:9: ( ( 'extends' | 'super' ) type )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==EXTENDS||LA67_0==SUPER) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:352:13: ( 'extends' | 'super' ) type
							{
							if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return value;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_type_in_typeArgument3148);
							type();
							state._fsp--;
							if (state.failed) return value;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, typeArgument_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "typeArgument"



	// $ANTLR start "qualifiedNameList"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:358:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
	public final void qualifiedNameList() throws RecognitionException {
		int qualifiedNameList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:359:5: ( qualifiedName ( ',' qualifiedName )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:359:9: qualifiedName ( ',' qualifiedName )*
			{
			pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3178);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:360:9: ( ',' qualifiedName )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:360:10: ',' qualifiedName
					{
					match(input,COMMA,FOLLOW_COMMA_in_qualifiedNameList3189); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3191);
					qualifiedName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop69;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, qualifiedNameList_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedNameList"



	// $ANTLR start "formalParameters"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:363:1: formalParameters returns [String value] : '(' ( formalParameterDecls )? ')' ;
	public final String formalParameters() throws RecognitionException {
		String value = null;

		int formalParameters_StartIndex = input.index();

		String formalParameterDecls16 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:364:5: ( '(' ( formalParameterDecls )? ')' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:364:9: '(' ( formalParameterDecls )? ')'
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_formalParameters3225); if (state.failed) return value;
			if ( state.backtracking==0 ) {}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:365:9: ( formalParameterDecls )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==BOOLEAN||LA70_0==BYTE||LA70_0==CHAR||LA70_0==DOUBLE||LA70_0==FINAL||LA70_0==FLOAT||LA70_0==IDENTIFIER||LA70_0==INT||LA70_0==LONG||LA70_0==MONKEYS_AT||LA70_0==SHORT) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:365:10: formalParameterDecls
					{
					pushFollow(FOLLOW_formalParameterDecls_in_formalParameters3238);
					formalParameterDecls16=formalParameterDecls();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {isFormalParameter = true; myString = ""; if(formalParameterDecls16 != null) myString += formalParameterDecls16; classInfo.addFormalParameters(formalParameterDecls16);}
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_formalParameters3262); if (state.failed) return value;
			if ( state.backtracking==0 ) {value = myString;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, formalParameters_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "functionParameters"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:370:1: functionParameters : ( ( ( IDENTIFIER || INTLITERAL ) ',' )* ( IDENTIFIER || INTLITERAL ) || primary || noParameters );
	public final void functionParameters() throws RecognitionException {
		int functionParameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:2: ( ( ( IDENTIFIER || INTLITERAL ) ',' )* ( IDENTIFIER || INTLITERAL ) || primary || noParameters )
			int alt74=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA74_1 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt74=1;
				}
				else if ( (synpred103_Java()) ) {
					alt74=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMA:
				{
				alt74=1;
				}
				break;
			case INTLITERAL:
				{
				int LA74_3 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt74=1;
				}
				else if ( (synpred103_Java()) ) {
					alt74=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RPAREN:
				{
				int LA74_4 = input.LA(2);
				if ( (synpred101_Java()) ) {
					alt74=1;
				}
				else if ( (synpred102_Java()) ) {
					alt74=2;
				}
				else if ( (synpred104_Java()) ) {
					alt74=4;
				}
				else if ( (true) ) {
					alt74=5;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case INT:
			case LONG:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case SHORT:
			case STRINGLITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt74=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:4: ( ( IDENTIFIER || INTLITERAL ) ',' )* ( IDENTIFIER || INTLITERAL )
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:4: ( ( IDENTIFIER || INTLITERAL ) ',' )*
					loop72:
					while (true) {
						int alt72=2;
						switch ( input.LA(1) ) {
						case IDENTIFIER:
							{
							int LA72_1 = input.LA(2);
							if ( (LA72_1==COMMA) ) {
								alt72=1;
							}

							}
							break;
						case INTLITERAL:
							{
							int LA72_3 = input.LA(2);
							if ( (LA72_3==COMMA) ) {
								alt72=1;
							}

							}
							break;
						case COMMA:
							{
							alt72=1;
							}
							break;
						}
						switch (alt72) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:5: ( IDENTIFIER || INTLITERAL ) ','
							{
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:5: ( IDENTIFIER || INTLITERAL )
							int alt71=3;
							switch ( input.LA(1) ) {
							case IDENTIFIER:
								{
								alt71=1;
								}
								break;
							case COMMA:
								{
								alt71=2;
								}
								break;
							case INTLITERAL:
								{
								alt71=3;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 71, 0, input);
								throw nvae;
							}
							switch (alt71) {
								case 1 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:6: IDENTIFIER
									{
									match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionParameters3284); if (state.failed) return;
									}
									break;
								case 2 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:18: 
									{
									}
									break;
								case 3 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:20: INTLITERAL
									{
									match(input,INTLITERAL,FOLLOW_INTLITERAL_in_functionParameters3289); if (state.failed) return;
									}
									break;

							}

							match(input,COMMA,FOLLOW_COMMA_in_functionParameters3292); if (state.failed) return;
							}
							break;

						default :
							break loop72;
						}
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:38: ( IDENTIFIER || INTLITERAL )
					int alt73=3;
					switch ( input.LA(1) ) {
					case IDENTIFIER:
						{
						alt73=1;
						}
						break;
					case RPAREN:
						{
						alt73=2;
						}
						break;
					case INTLITERAL:
						{
						alt73=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 73, 0, input);
						throw nvae;
					}
					switch (alt73) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:39: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionParameters3297); if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:51: 
							{
							}
							break;
						case 3 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:53: INTLITERAL
							{
							match(input,INTLITERAL,FOLLOW_INTLITERAL_in_functionParameters3302); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:372:3: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:372:5: primary
					{
					pushFollow(FOLLOW_primary_in_functionParameters3309);
					primary();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:373:3: 
					{
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:373:5: noParameters
					{
					pushFollow(FOLLOW_noParameters_in_functionParameters3315);
					noParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, functionParameters_StartIndex); }

		}
	}
	// $ANTLR end "functionParameters"



	// $ANTLR start "noParameters"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:376:1: noParameters :;
	public final void noParameters() throws RecognitionException {
		int noParameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:377:2: ()
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:377:4: 
			{
			}

		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, noParameters_StartIndex); }

		}
	}
	// $ANTLR end "noParameters"



	// $ANTLR start "formalParameterDecls"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:380:1: formalParameterDecls returns [String value] : ( ellipsisParameterDecl |e= normalParameterDecl ( ',' f= normalParameterDecl )* | (g= normalParameterDecl ',' )+ ellipsisParameterDecl );
	public final String formalParameterDecls() throws RecognitionException {
		String value = null;

		int formalParameterDecls_StartIndex = input.index();

		String e =null;
		String f =null;
		String g =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:381:5: ( ellipsisParameterDecl |e= normalParameterDecl ( ',' f= normalParameterDecl )* | (g= normalParameterDecl ',' )+ ellipsisParameterDecl )
			int alt77=3;
			switch ( input.LA(1) ) {
			case FINAL:
				{
				int LA77_1 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case MONKEYS_AT:
				{
				int LA77_2 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA77_3 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA77_4 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case CHAR:
				{
				int LA77_5 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case BYTE:
				{
				int LA77_6 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case SHORT:
				{
				int LA77_7 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case INT:
				{
				int LA77_8 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case LONG:
				{
				int LA77_9 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case FLOAT:
				{
				int LA77_10 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			case DOUBLE:
				{
				int LA77_11 = input.LA(2);
				if ( (synpred105_Java()) ) {
					alt77=1;
				}
				else if ( (synpred107_Java()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:381:9: ellipsisParameterDecl
					{
					pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3349);
					ellipsisParameterDecl();
					state._fsp--;
					if (state.failed) return value;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:382:9: e= normalParameterDecl ( ',' f= normalParameterDecl )*
					{
					pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3361);
					e=normalParameterDecl();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {myString2 = ""; if(e != null) myString2 = e; }
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:383:9: ( ',' f= normalParameterDecl )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==COMMA) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:383:10: ',' f= normalParameterDecl
							{
							match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3374); if (state.failed) return value;
							pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3378);
							f=normalParameterDecl();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) {myString2 += ", "; if(f != null) myString2 += f;}
							}
							break;

						default :
							break loop75;
						}
					}

					if ( state.backtracking==0 ) {value = myString2;}
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:385:9: (g= normalParameterDecl ',' )+ ellipsisParameterDecl
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:385:9: (g= normalParameterDecl ',' )+
					int cnt76=0;
					loop76:
					while (true) {
						int alt76=2;
						switch ( input.LA(1) ) {
						case FINAL:
							{
							int LA76_1 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case MONKEYS_AT:
							{
							int LA76_2 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case IDENTIFIER:
							{
							int LA76_3 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case BOOLEAN:
							{
							int LA76_4 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case CHAR:
							{
							int LA76_5 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case BYTE:
							{
							int LA76_6 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case SHORT:
							{
							int LA76_7 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case INT:
							{
							int LA76_8 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case LONG:
							{
							int LA76_9 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case FLOAT:
							{
							int LA76_10 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						case DOUBLE:
							{
							int LA76_11 = input.LA(2);
							if ( (synpred108_Java()) ) {
								alt76=1;
							}

							}
							break;
						}
						switch (alt76) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:385:10: g= normalParameterDecl ','
							{
							pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3406);
							g=normalParameterDecl();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) {myString2 = ""; if(g != null) myString2 += g;}
							match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3418); if (state.failed) return value;
							if ( state.backtracking==0 ) {myString2 += ", ";}
							}
							break;

						default :
							if ( cnt76 >= 1 ) break loop76;
							if (state.backtracking>0) {state.failed=true; return value;}
							EarlyExitException eee = new EarlyExitException(76, input);
							throw eee;
						}
						cnt76++;
					}

					if ( state.backtracking==0 ) {value = myString2;}
					pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3444);
					ellipsisParameterDecl();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, formalParameterDecls_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "formalParameterDecls"



	// $ANTLR start "normalParameterDecl"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:390:1: normalParameterDecl returns [String value] : variableModifiers type IDENTIFIER ( '[' ']' )* ;
	public final String normalParameterDecl() throws RecognitionException {
		String value = null;

		int normalParameterDecl_StartIndex = input.index();

		Token IDENTIFIER19=null;
		String variableModifiers17 =null;
		ParserRuleReturnScope type18 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:391:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:391:9: variableModifiers type IDENTIFIER ( '[' ']' )*
			{
			pushFollow(FOLLOW_variableModifiers_in_normalParameterDecl3467);
			variableModifiers17=variableModifiers();
			state._fsp--;
			if (state.failed) return value;
			pushFollow(FOLLOW_type_in_normalParameterDecl3469);
			type18=type();
			state._fsp--;
			if (state.failed) return value;
			IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalParameterDecl3471); if (state.failed) return value;
			if ( state.backtracking==0 ) {myString3 = ""; if(variableModifiers17 != null) myString3 = variableModifiers17; 
			    								myString3 += (type18!=null?((JavaParser.type_return)type18).value:null); myString3 += " "; myString3 += (IDENTIFIER19!=null?IDENTIFIER19.getText():null); if(isClass && !(type18!=null?((JavaParser.type_return)type18).value:null).equals("String")){classInfo.addAssociation((type18!=null?((JavaParser.type_return)type18).value:null)); isClass = false;}}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:393:9: ( '[' ']' )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==LBRACKET) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:393:10: '[' ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_normalParameterDecl3484); if (state.failed) return value;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_normalParameterDecl3486); if (state.failed) return value;
					if ( state.backtracking==0 ) {myString3 += "[]";}
					}
					break;

				default :
					break loop78;
				}
			}

			if ( state.backtracking==0 ) {value = myString3;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, normalParameterDecl_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "normalParameterDecl"



	// $ANTLR start "ellipsisParameterDecl"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:396:1: ellipsisParameterDecl : variableModifiers type '...' IDENTIFIER ;
	public final void ellipsisParameterDecl() throws RecognitionException {
		int ellipsisParameterDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:397:5: ( variableModifiers type '...' IDENTIFIER )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:397:9: variableModifiers type '...' IDENTIFIER
			{
			pushFollow(FOLLOW_variableModifiers_in_ellipsisParameterDecl3520);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_ellipsisParameterDecl3530);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3533); if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3543); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, ellipsisParameterDecl_StartIndex); }

		}
	}
	// $ANTLR end "ellipsisParameterDecl"



	// $ANTLR start "explicitConstructorInvocation"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:401:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
	public final void explicitConstructorInvocation() throws RecognitionException {
		int explicitConstructorInvocation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
			int alt81=2;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt81=1;
				}
				break;
			case THIS:
				{
				int LA81_2 = input.LA(2);
				if ( (synpred112_Java()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case IDENTIFIER:
			case INT:
			case INTLITERAL:
			case LONG:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case SHORT:
			case STRINGLITERAL:
			case TRUE:
			case VOID:
				{
				alt81=2;
				}
				break;
			case SUPER:
				{
				int LA81_4 = input.LA(2);
				if ( (synpred112_Java()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:9: ( nonWildcardTypeArguments )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==LT) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:10: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3563);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3621);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3623); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:408:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
					{
					pushFollow(FOLLOW_primary_in_explicitConstructorInvocation3633);
					primary();
					state._fsp--;
					if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_explicitConstructorInvocation3644); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:410:9: ( nonWildcardTypeArguments )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==LT) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:410:10: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3655);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation3676); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3686);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3688); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, explicitConstructorInvocation_StartIndex); }

		}
	}
	// $ANTLR end "explicitConstructorInvocation"



	// $ANTLR start "qualifiedName"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:415:1: qualifiedName : IDENTIFIER ( '.' IDENTIFIER )* ;
	public final void qualifiedName() throws RecognitionException {
		int qualifiedName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:416:5: ( IDENTIFIER ( '.' IDENTIFIER )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:416:9: IDENTIFIER ( '.' IDENTIFIER )*
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName3707); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:417:9: ( '.' IDENTIFIER )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==DOT) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:417:10: '.' IDENTIFIER
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedName3718); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName3720); if (state.failed) return;
					}
					break;

				default :
					break loop82;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, qualifiedName_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedName"



	// $ANTLR start "annotations"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:420:1: annotations : ( annotation )+ ;
	public final void annotations() throws RecognitionException {
		int annotations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:421:5: ( ( annotation )+ )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:421:9: ( annotation )+
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:421:9: ( annotation )+
			int cnt83=0;
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==MONKEYS_AT) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:421:10: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations3751);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt83 >= 1 ) break loop83;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(83, input);
					throw eee;
				}
				cnt83++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, annotations_StartIndex); }

		}
	}
	// $ANTLR end "annotations"



	// $ANTLR start "annotation"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:428:1: annotation : '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
	public final void annotation() throws RecognitionException {
		int annotation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:429:5: ( '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:429:9: '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )?
			{
			match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotation3782); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedName_in_annotation3784);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:430:9: ( '(' ( elementValuePairs | elementValue )? ')' )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==LPAREN) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:430:13: '(' ( elementValuePairs | elementValue )? ')'
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_annotation3798); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:431:19: ( elementValuePairs | elementValue )?
					int alt84=3;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==IDENTIFIER) ) {
						int LA84_1 = input.LA(2);
						if ( (LA84_1==EQ) ) {
							alt84=1;
						}
						else if ( ((LA84_1 >= AMP && LA84_1 <= AMPAMP)||(LA84_1 >= BANGEQ && LA84_1 <= BARBAR)||LA84_1==CARET||LA84_1==DOT||LA84_1==EQEQ||LA84_1==GT||LA84_1==INSTANCEOF||LA84_1==LBRACKET||(LA84_1 >= LPAREN && LA84_1 <= LT)||LA84_1==PERCENT||LA84_1==PLUS||LA84_1==PLUSPLUS||LA84_1==QUES||LA84_1==RPAREN||LA84_1==SLASH||LA84_1==STAR||LA84_1==SUB||LA84_1==SUBSUB) ) {
							alt84=2;
						}
					}
					else if ( (LA84_0==BANG||LA84_0==BOOLEAN||LA84_0==BYTE||(LA84_0 >= CHAR && LA84_0 <= CHARLITERAL)||(LA84_0 >= DOUBLE && LA84_0 <= DOUBLELITERAL)||LA84_0==FALSE||(LA84_0 >= FLOAT && LA84_0 <= FLOATLITERAL)||LA84_0==INT||LA84_0==INTLITERAL||LA84_0==LBRACE||(LA84_0 >= LONG && LA84_0 <= LPAREN)||LA84_0==MONKEYS_AT||(LA84_0 >= NEW && LA84_0 <= NULL)||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==SHORT||(LA84_0 >= STRINGLITERAL && LA84_0 <= SUB)||(LA84_0 >= SUBSUB && LA84_0 <= SUPER)||LA84_0==THIS||LA84_0==TILDE||LA84_0==TRUE||LA84_0==VOID) ) {
						alt84=2;
					}
					switch (alt84) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:431:23: elementValuePairs
							{
							pushFollow(FOLLOW_elementValuePairs_in_annotation3825);
							elementValuePairs();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:432:23: elementValue
							{
							pushFollow(FOLLOW_elementValue_in_annotation3849);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_annotation3885); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, annotation_StartIndex); }

		}
	}
	// $ANTLR end "annotation"



	// $ANTLR start "elementValuePairs"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:437:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
	public final void elementValuePairs() throws RecognitionException {
		int elementValuePairs_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:438:5: ( elementValuePair ( ',' elementValuePair )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:438:9: elementValuePair ( ',' elementValuePair )*
			{
			pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3916);
			elementValuePair();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:439:9: ( ',' elementValuePair )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==COMMA) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:439:10: ',' elementValuePair
					{
					match(input,COMMA,FOLLOW_COMMA_in_elementValuePairs3927); if (state.failed) return;
					pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3929);
					elementValuePair();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop86;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, elementValuePairs_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePairs"



	// $ANTLR start "elementValuePair"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:442:1: elementValuePair : IDENTIFIER '=' elementValue ;
	public final void elementValuePair() throws RecognitionException {
		int elementValuePair_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:443:5: ( IDENTIFIER '=' elementValue )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:443:9: IDENTIFIER '=' elementValue
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_elementValuePair3959); if (state.failed) return;
			match(input,EQ,FOLLOW_EQ_in_elementValuePair3961); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_elementValuePair3963);
			elementValue();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, elementValuePair_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePair"



	// $ANTLR start "elementValue"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:445:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
	public final void elementValue() throws RecognitionException {
		int elementValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:446:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
			int alt87=3;
			switch ( input.LA(1) ) {
			case BANG:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case IDENTIFIER:
			case INT:
			case INTLITERAL:
			case LONG:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case PLUS:
			case PLUSPLUS:
			case SHORT:
			case STRINGLITERAL:
			case SUB:
			case SUBSUB:
			case SUPER:
			case THIS:
			case TILDE:
			case TRUE:
			case VOID:
				{
				alt87=1;
				}
				break;
			case MONKEYS_AT:
				{
				alt87=2;
				}
				break;
			case LBRACE:
				{
				alt87=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:446:9: conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_elementValue3982);
					conditionalExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:447:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_elementValue3992);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:448:9: elementValueArrayInitializer
					{
					pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue4002);
					elementValueArrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, elementValue_StartIndex); }

		}
	}
	// $ANTLR end "elementValue"



	// $ANTLR start "elementValueArrayInitializer"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:450:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
	public final void elementValueArrayInitializer() throws RecognitionException {
		int elementValueArrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:451:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:451:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_elementValueArrayInitializer4021); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:452:9: ( elementValue ( ',' elementValue )* )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==BANG||LA89_0==BOOLEAN||LA89_0==BYTE||(LA89_0 >= CHAR && LA89_0 <= CHARLITERAL)||(LA89_0 >= DOUBLE && LA89_0 <= DOUBLELITERAL)||LA89_0==FALSE||(LA89_0 >= FLOAT && LA89_0 <= FLOATLITERAL)||LA89_0==IDENTIFIER||LA89_0==INT||LA89_0==INTLITERAL||LA89_0==LBRACE||(LA89_0 >= LONG && LA89_0 <= LPAREN)||LA89_0==MONKEYS_AT||(LA89_0 >= NEW && LA89_0 <= NULL)||LA89_0==PLUS||LA89_0==PLUSPLUS||LA89_0==SHORT||(LA89_0 >= STRINGLITERAL && LA89_0 <= SUB)||(LA89_0 >= SUBSUB && LA89_0 <= SUPER)||LA89_0==THIS||LA89_0==TILDE||LA89_0==TRUE||LA89_0==VOID) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:452:10: elementValue ( ',' elementValue )*
					{
					pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4032);
					elementValue();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:453:13: ( ',' elementValue )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==COMMA) ) {
							int LA88_1 = input.LA(2);
							if ( (LA88_1==BANG||LA88_1==BOOLEAN||LA88_1==BYTE||(LA88_1 >= CHAR && LA88_1 <= CHARLITERAL)||(LA88_1 >= DOUBLE && LA88_1 <= DOUBLELITERAL)||LA88_1==FALSE||(LA88_1 >= FLOAT && LA88_1 <= FLOATLITERAL)||LA88_1==IDENTIFIER||LA88_1==INT||LA88_1==INTLITERAL||LA88_1==LBRACE||(LA88_1 >= LONG && LA88_1 <= LPAREN)||LA88_1==MONKEYS_AT||(LA88_1 >= NEW && LA88_1 <= NULL)||LA88_1==PLUS||LA88_1==PLUSPLUS||LA88_1==SHORT||(LA88_1 >= STRINGLITERAL && LA88_1 <= SUB)||(LA88_1 >= SUBSUB && LA88_1 <= SUPER)||LA88_1==THIS||LA88_1==TILDE||LA88_1==TRUE||LA88_1==VOID) ) {
								alt88=1;
							}

						}

						switch (alt88) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:453:14: ',' elementValue
							{
							match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4047); if (state.failed) return;
							pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4049);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop88;
						}
					}

					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:455:12: ( ',' )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==COMMA) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:455:13: ','
					{
					match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4078); if (state.failed) return;
					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_elementValueArrayInitializer4082); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, elementValueArrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "elementValueArrayInitializer"



	// $ANTLR start "annotationTypeDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:460:1: annotationTypeDeclaration : modifiers '@' 'interface' IDENTIFIER annotationTypeBody ;
	public final void annotationTypeDeclaration() throws RecognitionException {
		int annotationTypeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:461:5: ( modifiers '@' 'interface' IDENTIFIER annotationTypeBody )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:461:9: modifiers '@' 'interface' IDENTIFIER annotationTypeBody
			{
			pushFollow(FOLLOW_modifiers_in_annotationTypeDeclaration4103);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4105); if (state.failed) return;
			match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationTypeDeclaration4115); if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4125); if (state.failed) return;
			pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4135);
			annotationTypeBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, annotationTypeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeDeclaration"



	// $ANTLR start "annotationTypeBody"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:466:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
	public final void annotationTypeBody() throws RecognitionException {
		int annotationTypeBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:467:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:467:9: '{' ( annotationTypeElementDeclaration )* '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_annotationTypeBody4154); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:468:9: ( annotationTypeElementDeclaration )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==ABSTRACT||LA91_0==BOOLEAN||LA91_0==BYTE||LA91_0==CHAR||LA91_0==CLASS||LA91_0==DOUBLE||LA91_0==ENUM||LA91_0==FINAL||LA91_0==FLOAT||LA91_0==IDENTIFIER||(LA91_0 >= INT && LA91_0 <= INTERFACE)||LA91_0==LONG||LA91_0==LT||(LA91_0 >= MONKEYS_AT && LA91_0 <= NATIVE)||(LA91_0 >= PRIVATE && LA91_0 <= PUBLIC)||(LA91_0 >= SEMI && LA91_0 <= SHORT)||(LA91_0 >= STATIC && LA91_0 <= STRICTFP)||LA91_0==SYNCHRONIZED||LA91_0==TRANSIENT||(LA91_0 >= VOID && LA91_0 <= VOLATILE)) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:468:10: annotationTypeElementDeclaration
					{
					pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4166);
					annotationTypeElementDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop91;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_annotationTypeBody4188); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, annotationTypeBody_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeBody"



	// $ANTLR start "annotationTypeElementDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:475:1: annotationTypeElementDeclaration : ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' );
	public final void annotationTypeElementDeclaration() throws RecognitionException {
		int annotationTypeElementDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:476:5: ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' )
			int alt92=7;
			switch ( input.LA(1) ) {
			case MONKEYS_AT:
				{
				int LA92_1 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PUBLIC:
				{
				int LA92_2 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PROTECTED:
				{
				int LA92_3 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PRIVATE:
				{
				int LA92_4 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STATIC:
				{
				int LA92_5 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ABSTRACT:
				{
				int LA92_6 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FINAL:
				{
				int LA92_7 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NATIVE:
				{
				int LA92_8 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SYNCHRONIZED:
				{
				int LA92_9 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TRANSIENT:
				{
				int LA92_10 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOLATILE:
				{
				int LA92_11 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRICTFP:
				{
				int LA92_12 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}
				else if ( (synpred128_Java()) ) {
					alt92=3;
				}
				else if ( (synpred129_Java()) ) {
					alt92=4;
				}
				else if ( (synpred130_Java()) ) {
					alt92=5;
				}
				else if ( (synpred131_Java()) ) {
					alt92=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA92_13 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				int LA92_14 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA92_15 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BYTE:
				{
				int LA92_16 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA92_17 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA92_18 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA92_19 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA92_20 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA92_21 = input.LA(2);
				if ( (synpred126_Java()) ) {
					alt92=1;
				}
				else if ( (synpred127_Java()) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CLASS:
				{
				alt92=3;
				}
				break;
			case INTERFACE:
				{
				alt92=4;
				}
				break;
			case ENUM:
				{
				alt92=5;
				}
				break;
			case SEMI:
				{
				alt92=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}
			switch (alt92) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:476:9: annotationMethodDeclaration
					{
					pushFollow(FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4209);
					annotationMethodDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:477:9: interfaceFieldDeclaration
					{
					pushFollow(FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4219);
					interfaceFieldDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:478:9: normalClassDeclaration
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4229);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:479:9: normalInterfaceDeclaration
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4239);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:480:9: enumDeclaration
					{
					pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4249);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:481:9: annotationTypeDeclaration
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4259);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:482:9: ';'
					{
					match(input,SEMI,FOLLOW_SEMI_in_annotationTypeElementDeclaration4269); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, annotationTypeElementDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeElementDeclaration"



	// $ANTLR start "annotationMethodDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:484:1: annotationMethodDeclaration : modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' ;
	public final void annotationMethodDeclaration() throws RecognitionException {
		int annotationMethodDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:485:5: ( modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:485:9: modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';'
			{
			pushFollow(FOLLOW_modifiers_in_annotationMethodDeclaration4288);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_annotationMethodDeclaration4290);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4292); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_annotationMethodDeclaration4302); if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_annotationMethodDeclaration4304); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:486:17: ( 'default' elementValue )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==DEFAULT) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:486:18: 'default' elementValue
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationMethodDeclaration4307); if (state.failed) return;
					pushFollow(FOLLOW_elementValue_in_annotationMethodDeclaration4309);
					elementValue();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_annotationMethodDeclaration4338); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, annotationMethodDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationMethodDeclaration"



	// $ANTLR start "block"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:490:1: block : '{' ( blockStatement )* '}' ;
	public final void block() throws RecognitionException {
		int block_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:491:5: ( '{' ( blockStatement )* '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:491:9: '{' ( blockStatement )* '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_block4361); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:492:9: ( blockStatement )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==ABSTRACT||(LA94_0 >= ASSERT && LA94_0 <= BANG)||(LA94_0 >= BOOLEAN && LA94_0 <= BYTE)||(LA94_0 >= CHAR && LA94_0 <= CLASS)||LA94_0==CONTINUE||LA94_0==DO||(LA94_0 >= DOUBLE && LA94_0 <= DOUBLELITERAL)||LA94_0==ENUM||(LA94_0 >= FALSE && LA94_0 <= FINAL)||(LA94_0 >= FLOAT && LA94_0 <= FOR)||(LA94_0 >= IDENTIFIER && LA94_0 <= IF)||(LA94_0 >= INT && LA94_0 <= INTLITERAL)||LA94_0==LBRACE||(LA94_0 >= LONG && LA94_0 <= LPAREN)||(LA94_0 >= MONKEYS_AT && LA94_0 <= NULL)||LA94_0==PLUS||(LA94_0 >= PLUSPLUS && LA94_0 <= PUBLIC)||LA94_0==RETURN||(LA94_0 >= SEMI && LA94_0 <= SHORT)||(LA94_0 >= STATIC && LA94_0 <= SUB)||(LA94_0 >= SUBSUB && LA94_0 <= SYNCHRONIZED)||(LA94_0 >= THIS && LA94_0 <= THROW)||(LA94_0 >= TILDE && LA94_0 <= WHILE)||(LA94_0 >= 119 && LA94_0 <= 121)) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:492:10: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block4372);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop94;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_block4393); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, block_StartIndex); }

		}
	}
	// $ANTLR end "block"



	// $ANTLR start "blockStatement"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:520:1: blockStatement : ( localVariableDeclarationStatement | function_statement | classOrInterfaceDeclaration | statement );
	public final void blockStatement() throws RecognitionException {
		int blockStatement_StartIndex = input.index();

		String localVariableDeclarationStatement20 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:521:5: ( localVariableDeclarationStatement | function_statement | classOrInterfaceDeclaration | statement )
			int alt95=4;
			switch ( input.LA(1) ) {
			case FINAL:
				{
				int LA95_1 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (synpred136_Java()) ) {
					alt95=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 95, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MONKEYS_AT:
				{
				int LA95_2 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (synpred136_Java()) ) {
					alt95=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 95, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA95_3 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (synpred135_Java()) ) {
					alt95=2;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA95_4 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case CHAR:
				{
				int LA95_5 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case BYTE:
				{
				int LA95_6 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case SHORT:
				{
				int LA95_7 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case INT:
				{
				int LA95_8 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case LONG:
				{
				int LA95_9 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case FLOAT:
				{
				int LA95_10 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case DOUBLE:
				{
				int LA95_11 = input.LA(2);
				if ( (synpred134_Java()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case SEMI:
				{
				int LA95_12 = input.LA(2);
				if ( (synpred135_Java()) ) {
					alt95=2;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case 120:
				{
				int LA95_13 = input.LA(2);
				if ( (synpred135_Java()) ) {
					alt95=2;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case 121:
				{
				int LA95_14 = input.LA(2);
				if ( (synpred135_Java()) ) {
					alt95=2;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case TRANSIENT:
			case VOLATILE:
				{
				alt95=3;
				}
				break;
			case SYNCHRONIZED:
				{
				int LA95_21 = input.LA(2);
				if ( (synpred136_Java()) ) {
					alt95=3;
				}
				else if ( (true) ) {
					alt95=4;
				}

				}
				break;
			case ASSERT:
			case BANG:
			case BREAK:
			case CHARLITERAL:
			case CONTINUE:
			case DO:
			case DOUBLELITERAL:
			case FALSE:
			case FLOATLITERAL:
			case FOR:
			case IF:
			case INTLITERAL:
			case LBRACE:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case PLUS:
			case PLUSPLUS:
			case RETURN:
			case STRINGLITERAL:
			case SUB:
			case SUBSUB:
			case SUPER:
			case SWITCH:
			case THIS:
			case THROW:
			case TILDE:
			case TRUE:
			case TRY:
			case VOID:
			case WHILE:
			case 119:
				{
				alt95=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:521:9: localVariableDeclarationStatement
					{
					pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement4414);
					localVariableDeclarationStatement20=localVariableDeclarationStatement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {String lines[] = localVariableDeclarationStatement20.split("\\r?\\n"); for(int i = 0; i < lines.length; ++i) {classInfo.addLocalVariable(lines[i]); methodInfo.addLocal(lines[i]);}}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:522:9: function_statement
					{
					pushFollow(FOLLOW_function_statement_in_blockStatement4426);
					function_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:523:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement4436);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:524:9: statement
					{
					pushFollow(FOLLOW_statement_in_blockStatement4446);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, blockStatement_StartIndex); }

		}
	}
	// $ANTLR end "blockStatement"



	// $ANTLR start "function_statement"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:527:1: function_statement : function_call ';' ;
	public final void function_statement() throws RecognitionException {
		int function_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:528:2: ( function_call ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:529:2: function_call ';'
			{
			pushFollow(FOLLOW_function_call_in_function_statement4466);
			function_call();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_function_statement4468); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, function_statement_StartIndex); }

		}
	}
	// $ANTLR end "function_statement"



	// $ANTLR start "system_call"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:533:1: system_call : (a= 'System.out.println' '(' STRINGLITERAL ')' ||a= 'System.out.println' '(' function_call ')' ||a= 'System.out.println' '(' expression ')' );
	public final void system_call() throws RecognitionException {
		int system_call_StartIndex = input.index();

		Token a=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:534:2: (a= 'System.out.println' '(' STRINGLITERAL ')' ||a= 'System.out.println' '(' function_call ')' ||a= 'System.out.println' '(' expression ')' )
			int alt96=5;
			switch ( input.LA(1) ) {
			case 119:
				{
				int LA96_1 = input.LA(2);
				if ( (synpred137_Java()) ) {
					alt96=1;
				}
				else if ( (synpred139_Java()) ) {
					alt96=3;
				}
				else if ( (true) ) {
					alt96=5;
				}

				}
				break;
			case RPAREN:
				{
				int LA96_2 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COLON:
				{
				int LA96_3 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SEMI:
				{
				int LA96_4 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMA:
				{
				int LA96_5 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EOF:
				{
				int LA96_6 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RBRACKET:
				{
				int LA96_7 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RBRACE:
				{
				int LA96_8 = input.LA(2);
				if ( (synpred138_Java()) ) {
					alt96=2;
				}
				else if ( (synpred140_Java()) ) {
					alt96=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:535:2: a= 'System.out.println' '(' STRINGLITERAL ')'
					{
					a=(Token)match(input,119,FOLLOW_119_in_system_call4485); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_system_call4487); if (state.failed) return;
					match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_system_call4489); if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_system_call4491); if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((a!=null?a.getText():null));}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:536:3: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:536:5: a= 'System.out.println' '(' function_call ')'
					{
					a=(Token)match(input,119,FOLLOW_119_in_system_call4502); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_system_call4504); if (state.failed) return;
					pushFollow(FOLLOW_function_call_in_system_call4506);
					function_call();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_system_call4508); if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((a!=null?a.getText():null));}
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:537:3: 
					{
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:537:5: a= 'System.out.println' '(' expression ')'
					{
					a=(Token)match(input,119,FOLLOW_119_in_system_call4518); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_system_call4520); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_system_call4522);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_system_call4524); if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((a!=null?a.getText():null));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, system_call_StartIndex); }

		}
	}
	// $ANTLR end "system_call"



	// $ANTLR start "multiple_calls"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:541:1: multiple_calls : ( '.' b= IDENTIFIER )* ;
	public final void multiple_calls() throws RecognitionException {
		int multiple_calls_StartIndex = input.index();

		Token b=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:542:2: ( ( '.' b= IDENTIFIER )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:543:2: ( '.' b= IDENTIFIER )*
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:543:2: ( '.' b= IDENTIFIER )*
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==DOT) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:543:4: '.' b= IDENTIFIER
					{
					match(input,DOT,FOLLOW_DOT_in_multiple_calls4543); if (state.failed) return;
					b=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_multiple_calls4547); if (state.failed) return;
					if ( state.backtracking==0 ) {multipleCallsString+="."+(b!=null?b.getText():null);}
					}
					break;

				default :
					break loop97;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, multiple_calls_StartIndex); }

		}
	}
	// $ANTLR end "multiple_calls"



	// $ANTLR start "function_call"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:547:1: function_call : (a= IDENTIFIER multiple_calls '(' functionParameters ')' ||a= ( 'super.' || 'this.' ) b= IDENTIFIER '(' functionParameters ')' );
	public final void function_call() throws RecognitionException {
		int function_call_StartIndex = input.index();

		Token a=null;
		Token b=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:548:2: (a= IDENTIFIER multiple_calls '(' functionParameters ')' ||a= ( 'super.' || 'this.' ) b= IDENTIFIER '(' functionParameters ')' )
			int alt99=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA99_1 = input.LA(2);
				if ( (synpred142_Java()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=3;
				}

				}
				break;
			case EOF:
			case COLON:
			case COMMA:
			case RBRACE:
			case RBRACKET:
			case RPAREN:
			case SEMI:
				{
				alt99=2;
				}
				break;
			case 120:
			case 121:
				{
				alt99=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:548:4: a= IDENTIFIER multiple_calls '(' functionParameters ')'
					{
					a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_call4567); if (state.failed) return;
					pushFollow(FOLLOW_multiple_calls_in_function_call4569);
					multiple_calls();
					state._fsp--;
					if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_function_call4571); if (state.failed) return;
					pushFollow(FOLLOW_functionParameters_in_function_call4573);
					functionParameters();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_function_call4575); if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((a!=null?a.getText():null) + multipleCallsString); multipleCallsString="";}
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:549:3: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:549:5: a= ( 'super.' || 'this.' ) b= IDENTIFIER '(' functionParameters ')'
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:549:7: ( 'super.' || 'this.' )
					int alt98=3;
					switch ( input.LA(1) ) {
					case 120:
						{
						alt98=1;
						}
						break;
					case IDENTIFIER:
						{
						alt98=2;
						}
						break;
					case 121:
						{
						alt98=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}
					switch (alt98) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:549:8: 'super.'
							{
							a=(Token)match(input,120,FOLLOW_120_in_function_call4586); if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:549:18: 
							{
							}
							break;
						case 3 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:549:20: 'this.'
							{
							a=(Token)match(input,121,FOLLOW_121_in_function_call4591); if (state.failed) return;
							}
							break;

					}

					b=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_call4596); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_function_call4598); if (state.failed) return;
					pushFollow(FOLLOW_functionParameters_in_function_call4600);
					functionParameters();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_function_call4602); if (state.failed) return;
					if ( state.backtracking==0 ) {classInfo.addMethodCall((a!=null?a.getText():null) + (b!=null?b.getText():null));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, function_call_StartIndex); }

		}
	}
	// $ANTLR end "function_call"



	// $ANTLR start "localVariableDeclarationStatement"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:554:1: localVariableDeclarationStatement returns [String value] : localVariableDeclaration ';' ;
	public final String localVariableDeclarationStatement() throws RecognitionException {
		String value = null;

		int localVariableDeclarationStatement_StartIndex = input.index();

		String localVariableDeclaration21 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:555:5: ( localVariableDeclaration ';' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:555:9: localVariableDeclaration ';'
			{
			pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4641);
			localVariableDeclaration21=localVariableDeclaration();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {value = localVariableDeclaration21;}
			match(input,SEMI,FOLLOW_SEMI_in_localVariableDeclarationStatement4653); if (state.failed) return value;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, localVariableDeclarationStatement_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "localVariableDeclarationStatement"



	// $ANTLR start "localVariableDeclaration"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:558:1: localVariableDeclaration returns [String value] : variableModifiers type e= variableDeclarator ( ',' f= variableDeclarator )* ;
	public final String localVariableDeclaration() throws RecognitionException {
		String value = null;

		int localVariableDeclaration_StartIndex = input.index();

		String e =null;
		String f =null;
		String variableModifiers22 =null;
		ParserRuleReturnScope type23 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return value; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:559:5: ( variableModifiers type e= variableDeclarator ( ',' f= variableDeclarator )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:559:9: variableModifiers type e= variableDeclarator ( ',' f= variableDeclarator )*
			{
			pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration4675);
			variableModifiers22=variableModifiers();
			state._fsp--;
			if (state.failed) return value;
			pushFollow(FOLLOW_type_in_localVariableDeclaration4677);
			type23=type();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {localVarString = ""; if(variableModifiers22 != null ){localVarString += variableModifiers22; localVarString += " "; } if((type23!=null?((JavaParser.type_return)type23).value:null) != null){localVarString += (type23!=null?((JavaParser.type_return)type23).value:null); localVarString += " ";} }
			pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4691);
			e=variableDeclarator();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {if(e != null ) localVarString += e;}
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:561:9: ( ',' f= variableDeclarator )*
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==COMMA) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:561:10: ',' f= variableDeclarator
					{
					match(input,COMMA,FOLLOW_COMMA_in_localVariableDeclaration4704); if (state.failed) return value;
					pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4708);
					f=variableDeclarator();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {localVarString += "\n"; if(variableModifiers22 != null ){localVarString += variableModifiers22; localVarString += " "; } if((type23!=null?((JavaParser.type_return)type23).value:null) != null){localVarString += (type23!=null?((JavaParser.type_return)type23).value:null); localVarString += " ";} if(f != null ) localVarString += f; }
					}
					break;

				default :
					break loop100;
				}
			}

			if ( state.backtracking==0 ) {value = localVarString;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, localVariableDeclaration_StartIndex); }

		}
		return value;
	}
	// $ANTLR end "localVariableDeclaration"



	// $ANTLR start "statement"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:564:1: statement : ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expression ';' | IDENTIFIER ':' statement | ';' );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:565:5: ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expression ';' | IDENTIFIER ':' statement | ';' )
			int alt107=17;
			switch ( input.LA(1) ) {
			case LBRACE:
				{
				alt107=1;
				}
				break;
			case ASSERT:
				{
				int LA107_2 = input.LA(2);
				if ( (synpred149_Java()) ) {
					alt107=2;
				}
				else if ( (synpred151_Java()) ) {
					alt107=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt107=4;
				}
				break;
			case FOR:
				{
				alt107=5;
				}
				break;
			case WHILE:
				{
				alt107=6;
				}
				break;
			case DO:
				{
				alt107=7;
				}
				break;
			case TRY:
				{
				alt107=8;
				}
				break;
			case SWITCH:
				{
				alt107=9;
				}
				break;
			case SYNCHRONIZED:
				{
				alt107=10;
				}
				break;
			case RETURN:
				{
				alt107=11;
				}
				break;
			case THROW:
				{
				alt107=12;
				}
				break;
			case BREAK:
				{
				alt107=13;
				}
				break;
			case CONTINUE:
				{
				alt107=14;
				}
				break;
			case IDENTIFIER:
				{
				int LA107_14 = input.LA(2);
				if ( (synpred167_Java()) ) {
					alt107=15;
				}
				else if ( (synpred168_Java()) ) {
					alt107=16;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SEMI:
				{
				int LA107_15 = input.LA(2);
				if ( (synpred167_Java()) ) {
					alt107=15;
				}
				else if ( (true) ) {
					alt107=17;
				}

				}
				break;
			case BANG:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case INT:
			case INTLITERAL:
			case LONG:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case PLUS:
			case PLUSPLUS:
			case SHORT:
			case STRINGLITERAL:
			case SUB:
			case SUBSUB:
			case SUPER:
			case THIS:
			case TILDE:
			case TRUE:
			case VOID:
			case 119:
			case 120:
			case 121:
				{
				alt107=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:565:9: block
					{
					pushFollow(FOLLOW_block_in_statement4742);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:9: ( 'assert' ) expression ( ':' expression )? ';'
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:9: ( 'assert' )
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:10: 'assert'
					{
					match(input,ASSERT,FOLLOW_ASSERT_in_statement4766); if (state.failed) return;
					}

					pushFollow(FOLLOW_expression_in_statement4786);
					expression();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:569:20: ( ':' expression )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==COLON) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:569:21: ':' expression
							{
							match(input,COLON,FOLLOW_COLON_in_statement4789); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_statement4791);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_statement4795); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:9: 'assert' expression ( ':' expression )? ';'
					{
					match(input,ASSERT,FOLLOW_ASSERT_in_statement4805); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement4808);
					expression();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:30: ( ':' expression )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==COLON) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:31: ':' expression
							{
							match(input,COLON,FOLLOW_COLON_in_statement4811); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_statement4813);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_statement4817); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:571:9: 'if' parExpression statement ( 'else' statement )?
					{
					match(input,IF,FOLLOW_IF_in_statement4839); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement4841);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement4843);
					statement();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:571:38: ( 'else' statement )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==ELSE) ) {
						int LA103_1 = input.LA(2);
						if ( (synpred152_Java()) ) {
							alt103=1;
						}
					}
					switch (alt103) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:571:39: 'else' statement
							{
							match(input,ELSE,FOLLOW_ELSE_in_statement4846); if (state.failed) return;
							pushFollow(FOLLOW_statement_in_statement4848);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:572:9: forstatement
					{
					pushFollow(FOLLOW_forstatement_in_statement4870);
					forstatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:573:9: 'while' parExpression statement
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement4880); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement4882);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement4884);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:574:9: 'do' statement 'while' parExpression ';'
					{
					match(input,DO,FOLLOW_DO_in_statement4894); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement4896);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input,WHILE,FOLLOW_WHILE_in_statement4898); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement4900);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_statement4902); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:575:9: trystatement
					{
					pushFollow(FOLLOW_trystatement_in_statement4912);
					trystatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:576:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement4922); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement4924);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_statement4926); if (state.failed) return;
					pushFollow(FOLLOW_switchBlockStatementGroups_in_statement4928);
					switchBlockStatementGroups();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACE,FOLLOW_RBRACE_in_statement4930); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:577:9: 'synchronized' parExpression block
					{
					match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement4940); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement4942);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement4944);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:578:9: 'return' ( expression )? ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement4954); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:578:18: ( expression )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==BANG||LA104_0==BOOLEAN||LA104_0==BYTE||(LA104_0 >= CHAR && LA104_0 <= CHARLITERAL)||(LA104_0 >= DOUBLE && LA104_0 <= DOUBLELITERAL)||LA104_0==FALSE||(LA104_0 >= FLOAT && LA104_0 <= FLOATLITERAL)||LA104_0==IDENTIFIER||LA104_0==INT||LA104_0==INTLITERAL||(LA104_0 >= LONG && LA104_0 <= LPAREN)||(LA104_0 >= NEW && LA104_0 <= NULL)||LA104_0==PLUS||LA104_0==PLUSPLUS||LA104_0==SHORT||(LA104_0 >= STRINGLITERAL && LA104_0 <= SUB)||(LA104_0 >= SUBSUB && LA104_0 <= SUPER)||LA104_0==THIS||LA104_0==TILDE||LA104_0==TRUE||LA104_0==VOID||(LA104_0 >= 119 && LA104_0 <= 121)) ) {
						alt104=1;
					}
					else if ( (LA104_0==SEMI) ) {
						int LA104_2 = input.LA(2);
						if ( (synpred160_Java()) ) {
							alt104=1;
						}
					}
					switch (alt104) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:578:19: expression
							{
							pushFollow(FOLLOW_expression_in_statement4957);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_statement4962); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:579:9: 'throw' expression ';'
					{
					match(input,THROW,FOLLOW_THROW_in_statement4972); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement4974);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_statement4976); if (state.failed) return;
					}
					break;
				case 13 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:580:9: 'break' ( IDENTIFIER )? ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement4986); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:581:13: ( IDENTIFIER )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==IDENTIFIER) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:581:14: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5001); if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_statement5018); if (state.failed) return;
					}
					break;
				case 14 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:583:9: 'continue' ( IDENTIFIER )? ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_statement5028); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:584:13: ( IDENTIFIER )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==IDENTIFIER) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:584:14: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5043); if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_statement5060); if (state.failed) return;
					}
					break;
				case 15 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:586:9: expression ';'
					{
					pushFollow(FOLLOW_expression_in_statement5070);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_statement5073); if (state.failed) return;
					}
					break;
				case 16 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:587:9: IDENTIFIER ':' statement
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5088); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_statement5090); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement5092);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 17 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:588:9: ';'
					{
					match(input,SEMI,FOLLOW_SEMI_in_statement5102); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "switchBlockStatementGroups"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:590:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
	public final void switchBlockStatementGroups() throws RecognitionException {
		int switchBlockStatementGroups_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:591:5: ( ( switchBlockStatementGroup )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:591:9: ( switchBlockStatementGroup )*
			{
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:591:9: ( switchBlockStatementGroup )*
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==CASE||LA108_0==DEFAULT) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:591:10: switchBlockStatementGroup
					{
					pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5122);
					switchBlockStatementGroup();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop108;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, switchBlockStatementGroups_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroups"



	// $ANTLR start "switchBlockStatementGroup"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:593:1: switchBlockStatementGroup : switchLabel ( blockStatement )* ;
	public final void switchBlockStatementGroup() throws RecognitionException {
		int switchBlockStatementGroup_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:594:5: ( switchLabel ( blockStatement )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:595:9: switchLabel ( blockStatement )*
			{
			pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup5150);
			switchLabel();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:596:9: ( blockStatement )*
			loop109:
			while (true) {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==ABSTRACT||(LA109_0 >= ASSERT && LA109_0 <= BANG)||(LA109_0 >= BOOLEAN && LA109_0 <= BYTE)||(LA109_0 >= CHAR && LA109_0 <= CLASS)||LA109_0==CONTINUE||LA109_0==DO||(LA109_0 >= DOUBLE && LA109_0 <= DOUBLELITERAL)||LA109_0==ENUM||(LA109_0 >= FALSE && LA109_0 <= FINAL)||(LA109_0 >= FLOAT && LA109_0 <= FOR)||(LA109_0 >= IDENTIFIER && LA109_0 <= IF)||(LA109_0 >= INT && LA109_0 <= INTLITERAL)||LA109_0==LBRACE||(LA109_0 >= LONG && LA109_0 <= LPAREN)||(LA109_0 >= MONKEYS_AT && LA109_0 <= NULL)||LA109_0==PLUS||(LA109_0 >= PLUSPLUS && LA109_0 <= PUBLIC)||LA109_0==RETURN||(LA109_0 >= SEMI && LA109_0 <= SHORT)||(LA109_0 >= STATIC && LA109_0 <= SUB)||(LA109_0 >= SUBSUB && LA109_0 <= SYNCHRONIZED)||(LA109_0 >= THIS && LA109_0 <= THROW)||(LA109_0 >= TILDE && LA109_0 <= WHILE)||(LA109_0 >= 119 && LA109_0 <= 121)) ) {
					alt109=1;
				}

				switch (alt109) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:596:10: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup5161);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop109;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, switchBlockStatementGroup_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroup"



	// $ANTLR start "switchLabel"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:599:1: switchLabel : ( 'case' expression ':' | 'default' ':' );
	public final void switchLabel() throws RecognitionException {
		int switchLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:600:5: ( 'case' expression ':' | 'default' ':' )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==CASE) ) {
				alt110=1;
			}
			else if ( (LA110_0==DEFAULT) ) {
				alt110=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:600:9: 'case' expression ':'
					{
					match(input,CASE,FOLLOW_CASE_in_switchLabel5191); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_switchLabel5193);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_switchLabel5195); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:601:9: 'default' ':'
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchLabel5205); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_switchLabel5207); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, switchLabel_StartIndex); }

		}
	}
	// $ANTLR end "switchLabel"



	// $ANTLR start "trystatement"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:603:1: trystatement : 'try' block ( catches 'finally' block | catches | 'finally' block ) ;
	public final void trystatement() throws RecognitionException {
		int trystatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:604:5: ( 'try' block ( catches 'finally' block | catches | 'finally' block ) )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:604:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
			{
			match(input,TRY,FOLLOW_TRY_in_trystatement5226); if (state.failed) return;
			pushFollow(FOLLOW_block_in_trystatement5228);
			block();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:605:9: ( catches 'finally' block | catches | 'finally' block )
			int alt111=3;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==CATCH) ) {
				int LA111_1 = input.LA(2);
				if ( (synpred172_Java()) ) {
					alt111=1;
				}
				else if ( (synpred173_Java()) ) {
					alt111=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA111_0==FINALLY) ) {
				alt111=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:605:13: catches 'finally' block
					{
					pushFollow(FOLLOW_catches_in_trystatement5242);
					catches();
					state._fsp--;
					if (state.failed) return;
					match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5244); if (state.failed) return;
					pushFollow(FOLLOW_block_in_trystatement5246);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:606:13: catches
					{
					pushFollow(FOLLOW_catches_in_trystatement5260);
					catches();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:607:13: 'finally' block
					{
					match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5274); if (state.failed) return;
					pushFollow(FOLLOW_block_in_trystatement5276);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, trystatement_StartIndex); }

		}
	}
	// $ANTLR end "trystatement"



	// $ANTLR start "catches"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:610:1: catches : catchClause ( catchClause )* ;
	public final void catches() throws RecognitionException {
		int catches_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:611:5: ( catchClause ( catchClause )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:611:9: catchClause ( catchClause )*
			{
			pushFollow(FOLLOW_catchClause_in_catches5306);
			catchClause();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:612:9: ( catchClause )*
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==CATCH) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:612:10: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches5317);
					catchClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop112;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, catches_StartIndex); }

		}
	}
	// $ANTLR end "catches"



	// $ANTLR start "catchClause"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:615:1: catchClause : 'catch' '(' formalParameter ')' block ;
	public final void catchClause() throws RecognitionException {
		int catchClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:616:5: ( 'catch' '(' formalParameter ')' block )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:616:9: 'catch' '(' formalParameter ')' block
			{
			match(input,CATCH,FOLLOW_CATCH_in_catchClause5347); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5349); if (state.failed) return;
			pushFollow(FOLLOW_formalParameter_in_catchClause5351);
			formalParameter();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5361); if (state.failed) return;
			pushFollow(FOLLOW_block_in_catchClause5363);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, catchClause_StartIndex); }

		}
	}
	// $ANTLR end "catchClause"



	// $ANTLR start "formalParameter"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:619:1: formalParameter : variableModifiers type IDENTIFIER ( '[' ']' )* ;
	public final void formalParameter() throws RecognitionException {
		int formalParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:620:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:620:9: variableModifiers type IDENTIFIER ( '[' ']' )*
			{
			pushFollow(FOLLOW_variableModifiers_in_formalParameter5383);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameter5385);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalParameter5387); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:621:9: ( '[' ']' )*
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==LBRACKET) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:621:10: '[' ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_formalParameter5398); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_formalParameter5400); if (state.failed) return;
					}
					break;

				default :
					break loop113;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, formalParameter_StartIndex); }

		}
	}
	// $ANTLR end "formalParameter"



	// $ANTLR start "forstatement"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:624:1: forstatement : ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement | 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement );
	public final void forstatement() throws RecognitionException {
		int forstatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:625:5: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement | 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement )
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==FOR) ) {
				int LA117_1 = input.LA(2);
				if ( (synpred176_Java()) ) {
					alt117=1;
				}
				else if ( (true) ) {
					alt117=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}

			switch (alt117) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:627:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement
					{
					match(input,FOR,FOLLOW_FOR_in_forstatement5448); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5450); if (state.failed) return;
					pushFollow(FOLLOW_variableModifiers_in_forstatement5452);
					variableModifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_forstatement5454);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forstatement5456); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_forstatement5458); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_forstatement5469);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5471); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_forstatement5473);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:631:9: 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement
					{
					match(input,FOR,FOLLOW_FOR_in_forstatement5505); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5507); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:632:17: ( forInit )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==BANG||LA114_0==BOOLEAN||LA114_0==BYTE||(LA114_0 >= CHAR && LA114_0 <= CHARLITERAL)||LA114_0==COMMA||(LA114_0 >= DOUBLE && LA114_0 <= DOUBLELITERAL)||(LA114_0 >= FALSE && LA114_0 <= FINAL)||(LA114_0 >= FLOAT && LA114_0 <= FLOATLITERAL)||LA114_0==IDENTIFIER||LA114_0==INT||LA114_0==INTLITERAL||(LA114_0 >= LONG && LA114_0 <= LPAREN)||LA114_0==MONKEYS_AT||(LA114_0 >= NEW && LA114_0 <= NULL)||LA114_0==PLUS||LA114_0==PLUSPLUS||LA114_0==SHORT||(LA114_0 >= STRINGLITERAL && LA114_0 <= SUB)||(LA114_0 >= SUBSUB && LA114_0 <= SUPER)||LA114_0==THIS||LA114_0==TILDE||LA114_0==TRUE||LA114_0==VOID||(LA114_0 >= 119 && LA114_0 <= 121)) ) {
						alt114=1;
					}
					else if ( (LA114_0==SEMI) ) {
						int LA114_2 = input.LA(2);
						if ( (synpred177_Java()) ) {
							alt114=1;
						}
					}
					switch (alt114) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:632:18: forInit
							{
							pushFollow(FOLLOW_forInit_in_forstatement5527);
							forInit();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_forstatement5548); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:634:17: ( expression )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==BANG||LA115_0==BOOLEAN||LA115_0==BYTE||(LA115_0 >= CHAR && LA115_0 <= CHARLITERAL)||(LA115_0 >= DOUBLE && LA115_0 <= DOUBLELITERAL)||LA115_0==FALSE||(LA115_0 >= FLOAT && LA115_0 <= FLOATLITERAL)||LA115_0==IDENTIFIER||LA115_0==INT||LA115_0==INTLITERAL||(LA115_0 >= LONG && LA115_0 <= LPAREN)||(LA115_0 >= NEW && LA115_0 <= NULL)||LA115_0==PLUS||LA115_0==PLUSPLUS||LA115_0==SHORT||(LA115_0 >= STRINGLITERAL && LA115_0 <= SUB)||(LA115_0 >= SUBSUB && LA115_0 <= SUPER)||LA115_0==THIS||LA115_0==TILDE||LA115_0==TRUE||LA115_0==VOID||(LA115_0 >= 119 && LA115_0 <= 121)) ) {
						alt115=1;
					}
					else if ( (LA115_0==SEMI) ) {
						int LA115_2 = input.LA(2);
						if ( (synpred178_Java()) ) {
							alt115=1;
						}
					}
					switch (alt115) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:634:18: expression
							{
							pushFollow(FOLLOW_expression_in_forstatement5568);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_forstatement5589); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:636:17: ( expressionList )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==BANG||LA116_0==BOOLEAN||LA116_0==BYTE||(LA116_0 >= CHAR && LA116_0 <= CHARLITERAL)||LA116_0==COMMA||(LA116_0 >= DOUBLE && LA116_0 <= DOUBLELITERAL)||LA116_0==FALSE||(LA116_0 >= FLOAT && LA116_0 <= FLOATLITERAL)||LA116_0==IDENTIFIER||LA116_0==INT||LA116_0==INTLITERAL||(LA116_0 >= LONG && LA116_0 <= LPAREN)||(LA116_0 >= NEW && LA116_0 <= NULL)||LA116_0==PLUS||LA116_0==PLUSPLUS||LA116_0==SHORT||(LA116_0 >= STRINGLITERAL && LA116_0 <= SUB)||(LA116_0 >= SUBSUB && LA116_0 <= SUPER)||LA116_0==THIS||LA116_0==TILDE||LA116_0==TRUE||LA116_0==VOID||(LA116_0 >= 119 && LA116_0 <= 121)) ) {
						alt116=1;
					}
					else if ( (LA116_0==RPAREN) ) {
						int LA116_2 = input.LA(2);
						if ( (synpred179_Java()) ) {
							alt116=1;
						}
					}
					switch (alt116) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:636:18: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forstatement5609);
							expressionList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5630); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_forstatement5632);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, forstatement_StartIndex); }

		}
	}
	// $ANTLR end "forstatement"



	// $ANTLR start "forInit"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:639:1: forInit : ( localVariableDeclaration | expressionList );
	public final void forInit() throws RecognitionException {
		int forInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:640:5: ( localVariableDeclaration | expressionList )
			int alt118=2;
			switch ( input.LA(1) ) {
			case FINAL:
			case MONKEYS_AT:
				{
				alt118=1;
				}
				break;
			case IDENTIFIER:
				{
				int LA118_3 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA118_4 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case CHAR:
				{
				int LA118_5 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case BYTE:
				{
				int LA118_6 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case SHORT:
				{
				int LA118_7 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case INT:
				{
				int LA118_8 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case LONG:
				{
				int LA118_9 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case FLOAT:
				{
				int LA118_10 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case DOUBLE:
				{
				int LA118_11 = input.LA(2);
				if ( (synpred180_Java()) ) {
					alt118=1;
				}
				else if ( (true) ) {
					alt118=2;
				}

				}
				break;
			case EOF:
			case BANG:
			case CHARLITERAL:
			case COMMA:
			case DOUBLELITERAL:
			case FALSE:
			case FLOATLITERAL:
			case INTLITERAL:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case PLUS:
			case PLUSPLUS:
			case SEMI:
			case STRINGLITERAL:
			case SUB:
			case SUBSUB:
			case SUPER:
			case THIS:
			case TILDE:
			case TRUE:
			case VOID:
			case 119:
			case 120:
			case 121:
				{
				alt118=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:640:9: localVariableDeclaration
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_forInit5651);
					localVariableDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:641:9: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forInit5661);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, forInit_StartIndex); }

		}
	}
	// $ANTLR end "forInit"



	// $ANTLR start "parExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:643:1: parExpression : '(' expression ')' ;
	public final void parExpression() throws RecognitionException {
		int parExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:644:5: ( '(' expression ')' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:644:9: '(' expression ')'
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_parExpression5680); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_parExpression5682);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_parExpression5684); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, parExpression_StartIndex); }

		}
	}
	// $ANTLR end "parExpression"



	// $ANTLR start "expressionList"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:646:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		int expressionList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:647:5: ( expression ( ',' expression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:647:9: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList5703);
			expression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:648:9: ( ',' expression )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==COMMA) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:648:10: ',' expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_expressionList5714); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expressionList5716);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop119;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, expressionList_StartIndex); }

		}
	}
	// $ANTLR end "expressionList"



	// $ANTLR start "expression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:652:1: expression : ( function_call || system_call || ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )* function_call || ( INTLITERAL ( '*' || '/' || '+' || '-' ) )* function_call ||e= conditionalExpression ( assignmentOperator expression )? );
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:653:5: ( function_call || system_call || ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )* function_call || ( INTLITERAL ( '*' || '/' || '+' || '-' ) )* function_call ||e= conditionalExpression ( assignmentOperator expression )? )
			int alt125=9;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA125_1 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (true) ) {
					alt125=9;
				}

				}
				break;
			case RPAREN:
				{
				int LA125_2 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COLON:
				{
				int LA125_3 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SEMI:
				{
				int LA125_4 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMA:
				{
				int LA125_5 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EOF:
				{
				int LA125_6 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RBRACKET:
				{
				int LA125_7 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RBRACE:
				{
				int LA125_8 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred183_Java()) ) {
					alt125=2;
				}
				else if ( (synpred184_Java()) ) {
					alt125=3;
				}
				else if ( (synpred185_Java()) ) {
					alt125=4;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred194_Java()) ) {
					alt125=6;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (synpred203_Java()) ) {
					alt125=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 120:
				{
				int LA125_9 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 121:
				{
				int LA125_10 = input.LA(2);
				if ( (synpred182_Java()) ) {
					alt125=1;
				}
				else if ( (synpred193_Java()) ) {
					alt125=5;
				}
				else if ( (synpred202_Java()) ) {
					alt125=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 119:
				{
				alt125=3;
				}
				break;
			case INTLITERAL:
				{
				int LA125_12 = input.LA(2);
				if ( (synpred202_Java()) ) {
					alt125=7;
				}
				else if ( (true) ) {
					alt125=9;
				}

				}
				break;
			case BANG:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case INT:
			case LONG:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case PLUS:
			case PLUSPLUS:
			case SHORT:
			case STRINGLITERAL:
			case SUB:
			case SUBSUB:
			case SUPER:
			case THIS:
			case TILDE:
			case TRUE:
			case VOID:
				{
				alt125=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:654:5: function_call
					{
					pushFollow(FOLLOW_function_call_in_expression5751);
					function_call();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:655:6: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:655:8: system_call
					{
					pushFollow(FOLLOW_system_call_in_expression5760);
					system_call();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:6: 
					{
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:7: ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )* function_call
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:7: ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )*
					loop121:
					while (true) {
						int alt121=2;
						int LA121_0 = input.LA(1);
						if ( (LA121_0==IDENTIFIER) ) {
							int LA121_1 = input.LA(2);
							if ( (LA121_1==EOF||(LA121_1 >= COLON && LA121_1 <= COMMA)||LA121_1==IDENTIFIER||LA121_1==PLUS||(LA121_1 >= RBRACE && LA121_1 <= RBRACKET)||(LA121_1 >= RPAREN && LA121_1 <= SEMI)||LA121_1==SLASH||LA121_1==STAR||LA121_1==SUB||(LA121_1 >= 120 && LA121_1 <= 121)) ) {
								alt121=1;
							}

						}

						switch (alt121) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:8: IDENTIFIER ( '*' || '/' || '+' || '-' )
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression5770); if (state.failed) return;
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:19: ( '*' || '/' || '+' || '-' )
							int alt120=7;
							switch ( input.LA(1) ) {
							case STAR:
								{
								alt120=1;
								}
								break;
							case IDENTIFIER:
								{
								int LA120_2 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RPAREN:
								{
								int LA120_3 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 3, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case COLON:
								{
								int LA120_4 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 4, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case SEMI:
								{
								int LA120_5 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case COMMA:
								{
								int LA120_6 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
								{
								int LA120_7 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RBRACKET:
								{
								int LA120_8 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RBRACE:
								{
								int LA120_9 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 9, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 120:
								{
								int LA120_10 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 121:
								{
								int LA120_11 = input.LA(2);
								if ( (synpred187_Java()) ) {
									alt120=2;
								}
								else if ( (synpred189_Java()) ) {
									alt120=4;
								}
								else if ( (synpred191_Java()) ) {
									alt120=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 120, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case SLASH:
								{
								alt120=3;
								}
								break;
							case PLUS:
								{
								alt120=5;
								}
								break;
							case SUB:
								{
								alt120=7;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 120, 0, input);
								throw nvae;
							}
							switch (alt120) {
								case 1 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:20: '*'
									{
									match(input,STAR,FOLLOW_STAR_in_expression5773); if (state.failed) return;
									}
									break;
								case 2 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:24: 
									{
									}
									break;
								case 3 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:25: '/'
									{
									match(input,SLASH,FOLLOW_SLASH_in_expression5776); if (state.failed) return;
									}
									break;
								case 4 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:29: 
									{
									}
									break;
								case 5 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:30: '+'
									{
									match(input,PLUS,FOLLOW_PLUS_in_expression5779); if (state.failed) return;
									}
									break;
								case 6 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:34: 
									{
									}
									break;
								case 7 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:35: '-'
									{
									match(input,SUB,FOLLOW_SUB_in_expression5782); if (state.failed) return;
									}
									break;

							}

							}
							break;

						default :
							break loop121;
						}
					}

					pushFollow(FOLLOW_function_call_in_expression5787);
					function_call();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:6: 
					{
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:8: ( INTLITERAL ( '*' || '/' || '+' || '-' ) )* function_call
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:8: ( INTLITERAL ( '*' || '/' || '+' || '-' ) )*
					loop123:
					while (true) {
						int alt123=2;
						int LA123_0 = input.LA(1);
						if ( (LA123_0==INTLITERAL) ) {
							alt123=1;
						}

						switch (alt123) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:9: INTLITERAL ( '*' || '/' || '+' || '-' )
							{
							match(input,INTLITERAL,FOLLOW_INTLITERAL_in_expression5798); if (state.failed) return;
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:20: ( '*' || '/' || '+' || '-' )
							int alt122=7;
							switch ( input.LA(1) ) {
							case STAR:
								{
								alt122=1;
								}
								break;
							case IDENTIFIER:
								{
								int LA122_2 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RPAREN:
								{
								int LA122_3 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 3, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case COLON:
								{
								int LA122_4 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 4, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case SEMI:
								{
								int LA122_5 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case COMMA:
								{
								int LA122_6 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
								{
								int LA122_7 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RBRACKET:
								{
								int LA122_8 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RBRACE:
								{
								int LA122_9 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 9, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 120:
								{
								int LA122_10 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 121:
								{
								int LA122_11 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INTLITERAL:
								{
								int LA122_12 = input.LA(2);
								if ( (synpred196_Java()) ) {
									alt122=2;
								}
								else if ( (synpred198_Java()) ) {
									alt122=4;
								}
								else if ( (synpred200_Java()) ) {
									alt122=6;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 122, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case SLASH:
								{
								alt122=3;
								}
								break;
							case PLUS:
								{
								alt122=5;
								}
								break;
							case SUB:
								{
								alt122=7;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 122, 0, input);
								throw nvae;
							}
							switch (alt122) {
								case 1 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:21: '*'
									{
									match(input,STAR,FOLLOW_STAR_in_expression5801); if (state.failed) return;
									}
									break;
								case 2 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:25: 
									{
									}
									break;
								case 3 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:26: '/'
									{
									match(input,SLASH,FOLLOW_SLASH_in_expression5804); if (state.failed) return;
									}
									break;
								case 4 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:30: 
									{
									}
									break;
								case 5 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:31: '+'
									{
									match(input,PLUS,FOLLOW_PLUS_in_expression5807); if (state.failed) return;
									}
									break;
								case 6 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:35: 
									{
									}
									break;
								case 7 :
									// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:36: '-'
									{
									match(input,SUB,FOLLOW_SUB_in_expression5810); if (state.failed) return;
									}
									break;

							}

							}
							break;

						default :
							break loop123;
						}
					}

					pushFollow(FOLLOW_function_call_in_expression5815);
					function_call();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:658:6: 
					{
					}
					break;
				case 9 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:658:8: e= conditionalExpression ( assignmentOperator expression )?
					{
					pushFollow(FOLLOW_conditionalExpression_in_expression5826);
					conditionalExpression();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:658:32: ( assignmentOperator expression )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==AMPEQ||LA124_0==BAREQ||LA124_0==CARETEQ||LA124_0==EQ||LA124_0==GT||LA124_0==LT||LA124_0==PERCENTEQ||LA124_0==PLUSEQ||LA124_0==SLASHEQ||LA124_0==STAREQ||LA124_0==SUBEQ) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:658:33: assignmentOperator expression
							{
							pushFollow(FOLLOW_assignmentOperator_in_expression5829);
							assignmentOperator();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_expression_in_expression5831);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignmentOperator"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:662:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' );
	public final void assignmentOperator() throws RecognitionException {
		int assignmentOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:663:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' )
			int alt126=12;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt126=1;
				}
				break;
			case PLUSEQ:
				{
				alt126=2;
				}
				break;
			case SUBEQ:
				{
				alt126=3;
				}
				break;
			case STAREQ:
				{
				alt126=4;
				}
				break;
			case SLASHEQ:
				{
				alt126=5;
				}
				break;
			case AMPEQ:
				{
				alt126=6;
				}
				break;
			case BAREQ:
				{
				alt126=7;
				}
				break;
			case CARETEQ:
				{
				alt126=8;
				}
				break;
			case PERCENTEQ:
				{
				alt126=9;
				}
				break;
			case LT:
				{
				alt126=10;
				}
				break;
			case GT:
				{
				int LA126_11 = input.LA(2);
				if ( (LA126_11==GT) ) {
					int LA126_12 = input.LA(3);
					if ( (LA126_12==GT) ) {
						alt126=11;
					}
					else if ( (LA126_12==EQ) ) {
						alt126=12;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 126, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:663:9: '='
					{
					match(input,EQ,FOLLOW_EQ_in_assignmentOperator5858); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:664:9: '+='
					{
					match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignmentOperator5868); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:665:9: '-='
					{
					match(input,SUBEQ,FOLLOW_SUBEQ_in_assignmentOperator5878); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:666:9: '*='
					{
					match(input,STAREQ,FOLLOW_STAREQ_in_assignmentOperator5888); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:667:9: '/='
					{
					match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignmentOperator5898); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:668:9: '&='
					{
					match(input,AMPEQ,FOLLOW_AMPEQ_in_assignmentOperator5908); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:669:9: '|='
					{
					match(input,BAREQ,FOLLOW_BAREQ_in_assignmentOperator5918); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:670:9: '^='
					{
					match(input,CARETEQ,FOLLOW_CARETEQ_in_assignmentOperator5928); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:671:9: '%='
					{
					match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignmentOperator5938); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:672:10: '<' '<' '='
					{
					match(input,LT,FOLLOW_LT_in_assignmentOperator5949); if (state.failed) return;
					match(input,LT,FOLLOW_LT_in_assignmentOperator5951); if (state.failed) return;
					match(input,EQ,FOLLOW_EQ_in_assignmentOperator5953); if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:673:10: '>' '>' '>' '='
					{
					match(input,GT,FOLLOW_GT_in_assignmentOperator5964); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_assignmentOperator5966); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_assignmentOperator5968); if (state.failed) return;
					match(input,EQ,FOLLOW_EQ_in_assignmentOperator5970); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:674:10: '>' '>' '='
					{
					match(input,GT,FOLLOW_GT_in_assignmentOperator5981); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_assignmentOperator5983); if (state.failed) return;
					match(input,EQ,FOLLOW_EQ_in_assignmentOperator5985); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, assignmentOperator_StartIndex); }

		}
	}
	// $ANTLR end "assignmentOperator"



	// $ANTLR start "conditionalExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:676:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' conditionalExpression )? ;
	public final void conditionalExpression() throws RecognitionException {
		int conditionalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:677:5: ( conditionalOrExpression ( '?' expression ':' conditionalExpression )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:677:9: conditionalOrExpression ( '?' expression ':' conditionalExpression )?
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression6004);
			conditionalOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:678:9: ( '?' expression ':' conditionalExpression )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==QUES) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:678:10: '?' expression ':' conditionalExpression
					{
					match(input,QUES,FOLLOW_QUES_in_conditionalExpression6015); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression6017);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_conditionalExpression6019); if (state.failed) return;
					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression6021);
					conditionalExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, conditionalExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalExpression"



	// $ANTLR start "conditionalOrExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:681:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
	public final void conditionalOrExpression() throws RecognitionException {
		int conditionalOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:682:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:682:9: conditionalAndExpression ( '||' conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6051);
			conditionalAndExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:683:9: ( '||' conditionalAndExpression )*
			loop128:
			while (true) {
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==BARBAR) ) {
					alt128=1;
				}

				switch (alt128) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:683:10: '||' conditionalAndExpression
					{
					match(input,BARBAR,FOLLOW_BARBAR_in_conditionalOrExpression6062); if (state.failed) return;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6064);
					conditionalAndExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop128;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, conditionalOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:686:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
	public final void conditionalAndExpression() throws RecognitionException {
		int conditionalAndExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:687:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:687:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6094);
			inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:688:9: ( '&&' inclusiveOrExpression )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==AMPAMP) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:688:10: '&&' inclusiveOrExpression
					{
					match(input,AMPAMP,FOLLOW_AMPAMP_in_conditionalAndExpression6105); if (state.failed) return;
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6107);
					inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop129;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, conditionalAndExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "inclusiveOrExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:691:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
	public final void inclusiveOrExpression() throws RecognitionException {
		int inclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:692:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:692:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
			{
			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6137);
			exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:693:9: ( '|' exclusiveOrExpression )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==BAR) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:693:10: '|' exclusiveOrExpression
					{
					match(input,BAR,FOLLOW_BAR_in_inclusiveOrExpression6148); if (state.failed) return;
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6150);
					exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop130;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, inclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "inclusiveOrExpression"



	// $ANTLR start "exclusiveOrExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:696:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
	public final void exclusiveOrExpression() throws RecognitionException {
		int exclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:697:5: ( andExpression ( '^' andExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:697:9: andExpression ( '^' andExpression )*
			{
			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6180);
			andExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:698:9: ( '^' andExpression )*
			loop131:
			while (true) {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==CARET) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:698:10: '^' andExpression
					{
					match(input,CARET,FOLLOW_CARET_in_exclusiveOrExpression6191); if (state.failed) return;
					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6193);
					andExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop131;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, exclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "exclusiveOrExpression"



	// $ANTLR start "andExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:701:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
	public final void andExpression() throws RecognitionException {
		int andExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:702:5: ( equalityExpression ( '&' equalityExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:702:9: equalityExpression ( '&' equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_andExpression6223);
			equalityExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:703:9: ( '&' equalityExpression )*
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==AMP) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:703:10: '&' equalityExpression
					{
					match(input,AMP,FOLLOW_AMP_in_andExpression6234); if (state.failed) return;
					pushFollow(FOLLOW_equalityExpression_in_andExpression6236);
					equalityExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop132;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, andExpression_StartIndex); }

		}
	}
	// $ANTLR end "andExpression"



	// $ANTLR start "equalityExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:706:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		int equalityExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:707:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:707:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
			{
			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6266);
			instanceOfExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:708:9: ( ( '==' | '!=' ) instanceOfExpression )*
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==BANGEQ||LA133_0==EQEQ) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:709:13: ( '==' | '!=' ) instanceOfExpression
					{
					if ( input.LA(1)==BANGEQ||input.LA(1)==EQEQ ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6343);
					instanceOfExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop133;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, equalityExpression_StartIndex); }

		}
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "instanceOfExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:715:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
	public final void instanceOfExpression() throws RecognitionException {
		int instanceOfExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:716:5: ( relationalExpression ( 'instanceof' type )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:716:9: relationalExpression ( 'instanceof' type )?
			{
			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression6373);
			relationalExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:717:9: ( 'instanceof' type )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==INSTANCEOF) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:717:10: 'instanceof' type
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression6384); if (state.failed) return;
					pushFollow(FOLLOW_type_in_instanceOfExpression6386);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, instanceOfExpression_StartIndex); }

		}
	}
	// $ANTLR end "instanceOfExpression"



	// $ANTLR start "relationalExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:720:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		int relationalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:721:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:721:9: shiftExpression ( relationalOp shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpression6416);
			shiftExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:722:9: ( relationalOp shiftExpression )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==LT) ) {
					int LA135_2 = input.LA(2);
					if ( (LA135_2==BANG||LA135_2==BOOLEAN||LA135_2==BYTE||(LA135_2 >= CHAR && LA135_2 <= CHARLITERAL)||(LA135_2 >= DOUBLE && LA135_2 <= DOUBLELITERAL)||LA135_2==EQ||LA135_2==FALSE||(LA135_2 >= FLOAT && LA135_2 <= FLOATLITERAL)||LA135_2==IDENTIFIER||LA135_2==INT||LA135_2==INTLITERAL||(LA135_2 >= LONG && LA135_2 <= LPAREN)||(LA135_2 >= NEW && LA135_2 <= NULL)||LA135_2==PLUS||LA135_2==PLUSPLUS||LA135_2==SHORT||(LA135_2 >= STRINGLITERAL && LA135_2 <= SUB)||(LA135_2 >= SUBSUB && LA135_2 <= SUPER)||LA135_2==THIS||LA135_2==TILDE||LA135_2==TRUE||LA135_2==VOID) ) {
						alt135=1;
					}

				}
				else if ( (LA135_0==GT) ) {
					int LA135_3 = input.LA(2);
					if ( (LA135_3==BANG||LA135_3==BOOLEAN||LA135_3==BYTE||(LA135_3 >= CHAR && LA135_3 <= CHARLITERAL)||(LA135_3 >= DOUBLE && LA135_3 <= DOUBLELITERAL)||LA135_3==EQ||LA135_3==FALSE||(LA135_3 >= FLOAT && LA135_3 <= FLOATLITERAL)||LA135_3==IDENTIFIER||LA135_3==INT||LA135_3==INTLITERAL||(LA135_3 >= LONG && LA135_3 <= LPAREN)||(LA135_3 >= NEW && LA135_3 <= NULL)||LA135_3==PLUS||LA135_3==PLUSPLUS||LA135_3==SHORT||(LA135_3 >= STRINGLITERAL && LA135_3 <= SUB)||(LA135_3 >= SUBSUB && LA135_3 <= SUPER)||LA135_3==THIS||LA135_3==TILDE||LA135_3==TRUE||LA135_3==VOID) ) {
						alt135=1;
					}

				}

				switch (alt135) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:722:10: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression6427);
					relationalOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_shiftExpression_in_relationalExpression6429);
					shiftExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop135;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, relationalExpression_StartIndex); }

		}
	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "relationalOp"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:725:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' );
	public final void relationalOp() throws RecognitionException {
		int relationalOp_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:726:5: ( '<' '=' | '>' '=' | '<' | '>' )
			int alt136=4;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==LT) ) {
				int LA136_1 = input.LA(2);
				if ( (LA136_1==EQ) ) {
					alt136=1;
				}
				else if ( (LA136_1==BANG||LA136_1==BOOLEAN||LA136_1==BYTE||(LA136_1 >= CHAR && LA136_1 <= CHARLITERAL)||(LA136_1 >= DOUBLE && LA136_1 <= DOUBLELITERAL)||LA136_1==FALSE||(LA136_1 >= FLOAT && LA136_1 <= FLOATLITERAL)||LA136_1==IDENTIFIER||LA136_1==INT||LA136_1==INTLITERAL||(LA136_1 >= LONG && LA136_1 <= LPAREN)||(LA136_1 >= NEW && LA136_1 <= NULL)||LA136_1==PLUS||LA136_1==PLUSPLUS||LA136_1==SHORT||(LA136_1 >= STRINGLITERAL && LA136_1 <= SUB)||(LA136_1 >= SUBSUB && LA136_1 <= SUPER)||LA136_1==THIS||LA136_1==TILDE||LA136_1==TRUE||LA136_1==VOID) ) {
					alt136=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 136, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA136_0==GT) ) {
				int LA136_2 = input.LA(2);
				if ( (LA136_2==EQ) ) {
					alt136=2;
				}
				else if ( (LA136_2==BANG||LA136_2==BOOLEAN||LA136_2==BYTE||(LA136_2 >= CHAR && LA136_2 <= CHARLITERAL)||(LA136_2 >= DOUBLE && LA136_2 <= DOUBLELITERAL)||LA136_2==FALSE||(LA136_2 >= FLOAT && LA136_2 <= FLOATLITERAL)||LA136_2==IDENTIFIER||LA136_2==INT||LA136_2==INTLITERAL||(LA136_2 >= LONG && LA136_2 <= LPAREN)||(LA136_2 >= NEW && LA136_2 <= NULL)||LA136_2==PLUS||LA136_2==PLUSPLUS||LA136_2==SHORT||(LA136_2 >= STRINGLITERAL && LA136_2 <= SUB)||(LA136_2 >= SUBSUB && LA136_2 <= SUPER)||LA136_2==THIS||LA136_2==TILDE||LA136_2==TRUE||LA136_2==VOID) ) {
					alt136=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 136, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				throw nvae;
			}

			switch (alt136) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:726:10: '<' '='
					{
					match(input,LT,FOLLOW_LT_in_relationalOp6460); if (state.failed) return;
					match(input,EQ,FOLLOW_EQ_in_relationalOp6462); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:727:10: '>' '='
					{
					match(input,GT,FOLLOW_GT_in_relationalOp6473); if (state.failed) return;
					match(input,EQ,FOLLOW_EQ_in_relationalOp6475); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:728:9: '<'
					{
					match(input,LT,FOLLOW_LT_in_relationalOp6485); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:729:9: '>'
					{
					match(input,GT,FOLLOW_GT_in_relationalOp6495); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, relationalOp_StartIndex); }

		}
	}
	// $ANTLR end "relationalOp"



	// $ANTLR start "shiftExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:731:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final void shiftExpression() throws RecognitionException {
		int shiftExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:732:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:732:9: additiveExpression ( shiftOp additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_shiftExpression6514);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:733:9: ( shiftOp additiveExpression )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==LT) ) {
					int LA137_1 = input.LA(2);
					if ( (LA137_1==LT) ) {
						int LA137_4 = input.LA(3);
						if ( (LA137_4==BANG||LA137_4==BOOLEAN||LA137_4==BYTE||(LA137_4 >= CHAR && LA137_4 <= CHARLITERAL)||(LA137_4 >= DOUBLE && LA137_4 <= DOUBLELITERAL)||LA137_4==FALSE||(LA137_4 >= FLOAT && LA137_4 <= FLOATLITERAL)||LA137_4==IDENTIFIER||LA137_4==INT||LA137_4==INTLITERAL||(LA137_4 >= LONG && LA137_4 <= LPAREN)||(LA137_4 >= NEW && LA137_4 <= NULL)||LA137_4==PLUS||LA137_4==PLUSPLUS||LA137_4==SHORT||(LA137_4 >= STRINGLITERAL && LA137_4 <= SUB)||(LA137_4 >= SUBSUB && LA137_4 <= SUPER)||LA137_4==THIS||LA137_4==TILDE||LA137_4==TRUE||LA137_4==VOID) ) {
							alt137=1;
						}

					}

				}
				else if ( (LA137_0==GT) ) {
					int LA137_2 = input.LA(2);
					if ( (LA137_2==GT) ) {
						int LA137_5 = input.LA(3);
						if ( (LA137_5==GT) ) {
							int LA137_7 = input.LA(4);
							if ( (LA137_7==BANG||LA137_7==BOOLEAN||LA137_7==BYTE||(LA137_7 >= CHAR && LA137_7 <= CHARLITERAL)||(LA137_7 >= DOUBLE && LA137_7 <= DOUBLELITERAL)||LA137_7==FALSE||(LA137_7 >= FLOAT && LA137_7 <= FLOATLITERAL)||LA137_7==IDENTIFIER||LA137_7==INT||LA137_7==INTLITERAL||(LA137_7 >= LONG && LA137_7 <= LPAREN)||(LA137_7 >= NEW && LA137_7 <= NULL)||LA137_7==PLUS||LA137_7==PLUSPLUS||LA137_7==SHORT||(LA137_7 >= STRINGLITERAL && LA137_7 <= SUB)||(LA137_7 >= SUBSUB && LA137_7 <= SUPER)||LA137_7==THIS||LA137_7==TILDE||LA137_7==TRUE||LA137_7==VOID) ) {
								alt137=1;
							}

						}
						else if ( (LA137_5==BANG||LA137_5==BOOLEAN||LA137_5==BYTE||(LA137_5 >= CHAR && LA137_5 <= CHARLITERAL)||(LA137_5 >= DOUBLE && LA137_5 <= DOUBLELITERAL)||LA137_5==FALSE||(LA137_5 >= FLOAT && LA137_5 <= FLOATLITERAL)||LA137_5==IDENTIFIER||LA137_5==INT||LA137_5==INTLITERAL||(LA137_5 >= LONG && LA137_5 <= LPAREN)||(LA137_5 >= NEW && LA137_5 <= NULL)||LA137_5==PLUS||LA137_5==PLUSPLUS||LA137_5==SHORT||(LA137_5 >= STRINGLITERAL && LA137_5 <= SUB)||(LA137_5 >= SUBSUB && LA137_5 <= SUPER)||LA137_5==THIS||LA137_5==TILDE||LA137_5==TRUE||LA137_5==VOID) ) {
							alt137=1;
						}

					}

				}

				switch (alt137) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:733:10: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression6525);
					shiftOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_additiveExpression_in_shiftExpression6527);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop137;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, shiftExpression_StartIndex); }

		}
	}
	// $ANTLR end "shiftExpression"



	// $ANTLR start "shiftOp"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:736:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' );
	public final void shiftOp() throws RecognitionException {
		int shiftOp_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:737:5: ( '<' '<' | '>' '>' '>' | '>' '>' )
			int alt138=3;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==LT) ) {
				alt138=1;
			}
			else if ( (LA138_0==GT) ) {
				int LA138_2 = input.LA(2);
				if ( (LA138_2==GT) ) {
					int LA138_3 = input.LA(3);
					if ( (LA138_3==GT) ) {
						alt138=2;
					}
					else if ( (LA138_3==BANG||LA138_3==BOOLEAN||LA138_3==BYTE||(LA138_3 >= CHAR && LA138_3 <= CHARLITERAL)||(LA138_3 >= DOUBLE && LA138_3 <= DOUBLELITERAL)||LA138_3==FALSE||(LA138_3 >= FLOAT && LA138_3 <= FLOATLITERAL)||LA138_3==IDENTIFIER||LA138_3==INT||LA138_3==INTLITERAL||(LA138_3 >= LONG && LA138_3 <= LPAREN)||(LA138_3 >= NEW && LA138_3 <= NULL)||LA138_3==PLUS||LA138_3==PLUSPLUS||LA138_3==SHORT||(LA138_3 >= STRINGLITERAL && LA138_3 <= SUB)||(LA138_3 >= SUBSUB && LA138_3 <= SUPER)||LA138_3==THIS||LA138_3==TILDE||LA138_3==TRUE||LA138_3==VOID) ) {
						alt138=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 138, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 138, 0, input);
				throw nvae;
			}

			switch (alt138) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:737:10: '<' '<'
					{
					match(input,LT,FOLLOW_LT_in_shiftOp6558); if (state.failed) return;
					match(input,LT,FOLLOW_LT_in_shiftOp6560); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:738:10: '>' '>' '>'
					{
					match(input,GT,FOLLOW_GT_in_shiftOp6571); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_shiftOp6573); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_shiftOp6575); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:739:10: '>' '>'
					{
					match(input,GT,FOLLOW_GT_in_shiftOp6586); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_shiftOp6588); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, shiftOp_StartIndex); }

		}
	}
	// $ANTLR end "shiftOp"



	// $ANTLR start "additiveExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:741:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		int additiveExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:742:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:742:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6607);
			multiplicativeExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:743:9: ( ( '+' | '-' ) multiplicativeExpression )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==PLUS||LA139_0==SUB) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:744:13: ( '+' | '-' ) multiplicativeExpression
					{
					if ( input.LA(1)==PLUS||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6684);
					multiplicativeExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop139;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, additiveExpression_StartIndex); }

		}
	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:750:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		int multiplicativeExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:751:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:752:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6721);
			unaryExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:753:9: ( ( '*' | '/' | '%' ) unaryExpression )*
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==PERCENT||LA140_0==SLASH||LA140_0==STAR) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:754:13: ( '*' | '/' | '%' ) unaryExpression
					{
					if ( input.LA(1)==PERCENT||input.LA(1)==SLASH||input.LA(1)==STAR ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6816);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop140;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, multiplicativeExpression_StartIndex); }

		}
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:765:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
	public final void unaryExpression() throws RecognitionException {
		int unaryExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:766:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
			int alt141=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt141=1;
				}
				break;
			case SUB:
				{
				alt141=2;
				}
				break;
			case PLUSPLUS:
				{
				alt141=3;
				}
				break;
			case SUBSUB:
				{
				alt141=4;
				}
				break;
			case BANG:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case IDENTIFIER:
			case INT:
			case INTLITERAL:
			case LONG:
			case LONGLITERAL:
			case LPAREN:
			case NEW:
			case NULL:
			case SHORT:
			case STRINGLITERAL:
			case SUPER:
			case THIS:
			case TILDE:
			case TRUE:
			case VOID:
				{
				alt141=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}
			switch (alt141) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:766:9: '+' unaryExpression
					{
					match(input,PLUS,FOLLOW_PLUS_in_unaryExpression6848); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6851);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:767:9: '-' unaryExpression
					{
					match(input,SUB,FOLLOW_SUB_in_unaryExpression6861); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6863);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:768:9: '++' unaryExpression
					{
					match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unaryExpression6873); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6875);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:769:9: '--' unaryExpression
					{
					match(input,SUBSUB,FOLLOW_SUBSUB_in_unaryExpression6885); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6887);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:770:9: unaryExpressionNotPlusMinus
					{
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression6897);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, unaryExpression_StartIndex); }

		}
	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "unaryExpressionNotPlusMinus"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:772:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
	public final void unaryExpressionNotPlusMinus() throws RecognitionException {
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:773:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
			int alt144=4;
			switch ( input.LA(1) ) {
			case TILDE:
				{
				alt144=1;
				}
				break;
			case BANG:
				{
				alt144=2;
				}
				break;
			case LPAREN:
				{
				int LA144_3 = input.LA(2);
				if ( (synpred243_Java()) ) {
					alt144=3;
				}
				else if ( (true) ) {
					alt144=4;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CHARLITERAL:
			case DOUBLE:
			case DOUBLELITERAL:
			case FALSE:
			case FLOAT:
			case FLOATLITERAL:
			case IDENTIFIER:
			case INT:
			case INTLITERAL:
			case LONG:
			case LONGLITERAL:
			case NEW:
			case NULL:
			case SHORT:
			case STRINGLITERAL:
			case SUPER:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt144=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}
			switch (alt144) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:773:9: '~' unaryExpression
					{
					match(input,TILDE,FOLLOW_TILDE_in_unaryExpressionNotPlusMinus6916); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6918);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:774:9: '!' unaryExpression
					{
					match(input,BANG,FOLLOW_BANG_in_unaryExpressionNotPlusMinus6928); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6930);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:775:9: castExpression
					{
					pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus6940);
					castExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:776:9: primary ( selector )* ( '++' | '--' )?
					{
					pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus6950);
					primary();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:777:9: ( selector )*
					loop142:
					while (true) {
						int alt142=2;
						int LA142_0 = input.LA(1);
						if ( (LA142_0==DOT||LA142_0==LBRACKET) ) {
							alt142=1;
						}

						switch (alt142) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:777:10: selector
							{
							pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus6961);
							selector();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop142;
						}
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:779:9: ( '++' | '--' )?
					int alt143=2;
					int LA143_0 = input.LA(1);
					if ( (LA143_0==PLUSPLUS||LA143_0==SUBSUB) ) {
						alt143=1;
					}
					switch (alt143) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:
							{
							if ( input.LA(1)==PLUSPLUS||input.LA(1)==SUBSUB ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, unaryExpressionNotPlusMinus_StartIndex); }

		}
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"



	// $ANTLR start "castExpression"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:783:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus );
	public final void castExpression() throws RecognitionException {
		int castExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:784:5: ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==LPAREN) ) {
				int LA145_1 = input.LA(2);
				if ( (synpred247_Java()) ) {
					alt145=1;
				}
				else if ( (true) ) {
					alt145=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:784:9: '(' primitiveType ')' unaryExpression
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7030); if (state.failed) return;
					pushFollow(FOLLOW_primitiveType_in_castExpression7032);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7034); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_castExpression7036);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:785:9: '(' type ')' unaryExpressionNotPlusMinus
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7046); if (state.failed) return;
					pushFollow(FOLLOW_type_in_castExpression7048);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7050); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7052);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, castExpression_StartIndex); }

		}
	}
	// $ANTLR end "castExpression"



	// $ANTLR start "primary"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:790:1: primary : ( parExpression | 'this' ( '.' IDENTIFIER )* ( identifierSuffix )? | IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )? | 'super' superSuffix | literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
	public final void primary() throws RecognitionException {
		int primary_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:791:5: ( parExpression | 'this' ( '.' IDENTIFIER )* ( identifierSuffix )? | IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )? | 'super' superSuffix | literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
			int alt151=8;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt151=1;
				}
				break;
			case THIS:
				{
				alt151=2;
				}
				break;
			case IDENTIFIER:
				{
				alt151=3;
				}
				break;
			case SUPER:
				{
				alt151=4;
				}
				break;
			case CHARLITERAL:
			case DOUBLELITERAL:
			case FALSE:
			case FLOATLITERAL:
			case INTLITERAL:
			case LONGLITERAL:
			case NULL:
			case STRINGLITERAL:
			case TRUE:
				{
				alt151=5;
				}
				break;
			case NEW:
				{
				alt151=6;
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				alt151=7;
				}
				break;
			case VOID:
				{
				alt151=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}
			switch (alt151) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:791:9: parExpression
					{
					pushFollow(FOLLOW_parExpression_in_primary7072);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:792:9: 'this' ( '.' IDENTIFIER )* ( identifierSuffix )?
					{
					match(input,THIS,FOLLOW_THIS_in_primary7094); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:793:9: ( '.' IDENTIFIER )*
					loop146:
					while (true) {
						int alt146=2;
						int LA146_0 = input.LA(1);
						if ( (LA146_0==DOT) ) {
							int LA146_2 = input.LA(2);
							if ( (LA146_2==IDENTIFIER) ) {
								int LA146_3 = input.LA(3);
								if ( (synpred249_Java()) ) {
									alt146=1;
								}

							}

						}

						switch (alt146) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:793:10: '.' IDENTIFIER
							{
							match(input,DOT,FOLLOW_DOT_in_primary7105); if (state.failed) return;
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7107); if (state.failed) return;
							}
							break;

						default :
							break loop146;
						}
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:795:9: ( identifierSuffix )?
					int alt147=2;
					switch ( input.LA(1) ) {
						case LBRACKET:
							{
							int LA147_1 = input.LA(2);
							if ( (synpred250_Java()) ) {
								alt147=1;
							}
							}
							break;
						case LPAREN:
							{
							alt147=1;
							}
							break;
						case DOT:
							{
							int LA147_3 = input.LA(2);
							if ( (synpred250_Java()) ) {
								alt147=1;
							}
							}
							break;
					}
					switch (alt147) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:795:10: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary7129);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:797:9: IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )?
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7150); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:798:9: ( '.' IDENTIFIER )*
					loop148:
					while (true) {
						int alt148=2;
						int LA148_0 = input.LA(1);
						if ( (LA148_0==DOT) ) {
							int LA148_2 = input.LA(2);
							if ( (LA148_2==IDENTIFIER) ) {
								int LA148_3 = input.LA(3);
								if ( (synpred252_Java()) ) {
									alt148=1;
								}

							}

						}

						switch (alt148) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:798:10: '.' IDENTIFIER
							{
							match(input,DOT,FOLLOW_DOT_in_primary7161); if (state.failed) return;
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7163); if (state.failed) return;
							}
							break;

						default :
							break loop148;
						}
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:800:9: ( identifierSuffix )?
					int alt149=2;
					switch ( input.LA(1) ) {
						case LBRACKET:
							{
							int LA149_1 = input.LA(2);
							if ( (synpred253_Java()) ) {
								alt149=1;
							}
							}
							break;
						case LPAREN:
							{
							alt149=1;
							}
							break;
						case DOT:
							{
							int LA149_3 = input.LA(2);
							if ( (synpred253_Java()) ) {
								alt149=1;
							}
							}
							break;
					}
					switch (alt149) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:800:10: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary7185);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:802:9: 'super' superSuffix
					{
					match(input,SUPER,FOLLOW_SUPER_in_primary7206); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_primary7216);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:804:9: literal
					{
					pushFollow(FOLLOW_literal_in_primary7226);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:805:9: creator
					{
					pushFollow(FOLLOW_creator_in_primary7236);
					creator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:806:9: primitiveType ( '[' ']' )* '.' 'class'
					{
					pushFollow(FOLLOW_primitiveType_in_primary7246);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:807:9: ( '[' ']' )*
					loop150:
					while (true) {
						int alt150=2;
						int LA150_0 = input.LA(1);
						if ( (LA150_0==LBRACKET) ) {
							alt150=1;
						}

						switch (alt150) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:807:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_primary7257); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_primary7259); if (state.failed) return;
							}
							break;

						default :
							break loop150;
						}
					}

					match(input,DOT,FOLLOW_DOT_in_primary7280); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_primary7282); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:810:9: 'void' '.' 'class'
					{
					match(input,VOID,FOLLOW_VOID_in_primary7292); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_primary7294); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_primary7296); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, primary_StartIndex); }

		}
	}
	// $ANTLR end "primary"



	// $ANTLR start "superSuffix"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:813:1: superSuffix : ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? );
	public final void superSuffix() throws RecognitionException {
		int superSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:814:5: ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? )
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==LPAREN) ) {
				alt154=1;
			}
			else if ( (LA154_0==DOT) ) {
				alt154=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}

			switch (alt154) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:814:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_superSuffix7321);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:815:9: '.' ( typeArguments )? IDENTIFIER ( arguments )?
					{
					match(input,DOT,FOLLOW_DOT_in_superSuffix7331); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:815:13: ( typeArguments )?
					int alt152=2;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==LT) ) {
						alt152=1;
					}
					switch (alt152) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:815:14: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_superSuffix7334);
							typeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superSuffix7355); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:818:9: ( arguments )?
					int alt153=2;
					int LA153_0 = input.LA(1);
					if ( (LA153_0==LPAREN) ) {
						alt153=1;
					}
					switch (alt153) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:818:10: arguments
							{
							pushFollow(FOLLOW_arguments_in_superSuffix7366);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, superSuffix_StartIndex); }

		}
	}
	// $ANTLR end "superSuffix"



	// $ANTLR start "identifierSuffix"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:821:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator );
	public final void identifierSuffix() throws RecognitionException {
		int identifierSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:822:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator )
			int alt157=8;
			alt157 = dfa157.predict(input);
			switch (alt157) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:822:9: ( '[' ']' )+ '.' 'class'
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:822:9: ( '[' ']' )+
					int cnt155=0;
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==LBRACKET) ) {
							alt155=1;
						}

						switch (alt155) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:822:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7397); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7399); if (state.failed) return;
							}
							break;

						default :
							if ( cnt155 >= 1 ) break loop155;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(155, input);
							throw eee;
						}
						cnt155++;
					}

					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7420); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7422); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:825:9: ( '[' expression ']' )+
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:825:9: ( '[' expression ']' )+
					int cnt156=0;
					loop156:
					while (true) {
						int alt156=2;
						int LA156_0 = input.LA(1);
						if ( (LA156_0==LBRACKET) ) {
							int LA156_3 = input.LA(2);
							if ( (synpred265_Java()) ) {
								alt156=1;
							}

						}

						switch (alt156) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:825:10: '[' expression ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7433); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_identifierSuffix7435);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7437); if (state.failed) return;
							}
							break;

						default :
							if ( cnt156 >= 1 ) break loop156;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(156, input);
							throw eee;
						}
						cnt156++;
					}

					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:827:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_identifierSuffix7458);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:828:9: '.' 'class'
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7468); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7470); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:829:9: '.' nonWildcardTypeArguments IDENTIFIER arguments
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7480); if (state.failed) return;
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_identifierSuffix7482);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierSuffix7484); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_identifierSuffix7486);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:830:9: '.' 'this'
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7496); if (state.failed) return;
					match(input,THIS,FOLLOW_THIS_in_identifierSuffix7498); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:831:9: '.' 'super' arguments
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7508); if (state.failed) return;
					match(input,SUPER,FOLLOW_SUPER_in_identifierSuffix7510); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_identifierSuffix7512);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:832:9: innerCreator
					{
					pushFollow(FOLLOW_innerCreator_in_identifierSuffix7522);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, identifierSuffix_StartIndex); }

		}
	}
	// $ANTLR end "identifierSuffix"



	// $ANTLR start "selector"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:834:1: selector : ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' );
	public final void selector() throws RecognitionException {
		int selector_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:835:5: ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' )
			int alt159=5;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==DOT) ) {
				switch ( input.LA(2) ) {
				case IDENTIFIER:
					{
					alt159=1;
					}
					break;
				case THIS:
					{
					alt159=2;
					}
					break;
				case SUPER:
					{
					alt159=3;
					}
					break;
				case NEW:
					{
					alt159=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 159, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA159_0==LBRACKET) ) {
				alt159=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}

			switch (alt159) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:835:9: '.' IDENTIFIER ( arguments )?
					{
					match(input,DOT,FOLLOW_DOT_in_selector7542); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector7544); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:836:9: ( arguments )?
					int alt158=2;
					int LA158_0 = input.LA(1);
					if ( (LA158_0==LPAREN) ) {
						alt158=1;
					}
					switch (alt158) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:836:10: arguments
							{
							pushFollow(FOLLOW_arguments_in_selector7555);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:838:9: '.' 'this'
					{
					match(input,DOT,FOLLOW_DOT_in_selector7576); if (state.failed) return;
					match(input,THIS,FOLLOW_THIS_in_selector7578); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:839:9: '.' 'super' superSuffix
					{
					match(input,DOT,FOLLOW_DOT_in_selector7588); if (state.failed) return;
					match(input,SUPER,FOLLOW_SUPER_in_selector7590); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_selector7600);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:841:9: innerCreator
					{
					pushFollow(FOLLOW_innerCreator_in_selector7610);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:842:9: '[' expression ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_selector7620); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selector7622);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_selector7624); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, selector_StartIndex); }

		}
	}
	// $ANTLR end "selector"



	// $ANTLR start "creator"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:845:1: creator : ( 'new' nonWildcardTypeArguments et= type classCreatorRest | 'new' et= type classCreatorRest | arrayCreator );
	public final void creator() throws RecognitionException {
		int creator_StartIndex = input.index();

		ParserRuleReturnScope et =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:846:5: ( 'new' nonWildcardTypeArguments et= type classCreatorRest | 'new' et= type classCreatorRest | arrayCreator )
			int alt160=3;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==NEW) ) {
				int LA160_1 = input.LA(2);
				if ( (synpred277_Java()) ) {
					alt160=1;
				}
				else if ( (synpred278_Java()) ) {
					alt160=2;
				}
				else if ( (true) ) {
					alt160=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}

			switch (alt160) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:846:9: 'new' nonWildcardTypeArguments et= type classCreatorRest
					{
					match(input,NEW,FOLLOW_NEW_in_creator7644); if (state.failed) return;
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator7646);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_creator7650);
					et=type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_classCreatorRest_in_creator7652);
					classCreatorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:847:9: 'new' et= type classCreatorRest
					{
					match(input,NEW,FOLLOW_NEW_in_creator7663); if (state.failed) return;
					pushFollow(FOLLOW_type_in_creator7667);
					et=type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_classCreatorRest_in_creator7669);
					classCreatorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:848:13: arrayCreator
					{
					pushFollow(FOLLOW_arrayCreator_in_creator7684);
					arrayCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, creator_StartIndex); }

		}
	}
	// $ANTLR end "creator"



	// $ANTLR start "arrayCreator"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:851:1: arrayCreator : ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* );
	public final void arrayCreator() throws RecognitionException {
		int arrayCreator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:852:5: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==NEW) ) {
				int LA164_1 = input.LA(2);
				if ( (synpred280_Java()) ) {
					alt164=1;
				}
				else if ( (true) ) {
					alt164=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:852:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
					{
					match(input,NEW,FOLLOW_NEW_in_arrayCreator7704); if (state.failed) return;
					pushFollow(FOLLOW_createdName_in_arrayCreator7706);
					createdName();
					state._fsp--;
					if (state.failed) return;
					match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7716); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7718); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:854:9: ( '[' ']' )*
					loop161:
					while (true) {
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==LBRACKET) ) {
							alt161=1;
						}

						switch (alt161) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:854:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7729); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7731); if (state.failed) return;
							}
							break;

						default :
							break loop161;
						}
					}

					pushFollow(FOLLOW_arrayInitializer_in_arrayCreator7752);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:857:9: 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )*
					{
					match(input,NEW,FOLLOW_NEW_in_arrayCreator7762); if (state.failed) return;
					pushFollow(FOLLOW_createdName_in_arrayCreator7764);
					createdName();
					state._fsp--;
					if (state.failed) return;
					match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7774); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_arrayCreator7776);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7786); if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:860:9: ( '[' expression ']' )*
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==LBRACKET) ) {
							int LA162_1 = input.LA(2);
							if ( (synpred281_Java()) ) {
								alt162=1;
							}

						}

						switch (alt162) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:860:13: '[' expression ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7800); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_arrayCreator7802);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7816); if (state.failed) return;
							}
							break;

						default :
							break loop162;
						}
					}

					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:863:9: ( '[' ']' )*
					loop163:
					while (true) {
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==LBRACKET) ) {
							int LA163_2 = input.LA(2);
							if ( (LA163_2==RBRACKET) ) {
								int LA163_3 = input.LA(3);
								if ( (synpred282_Java()) ) {
									alt163=1;
								}

							}

						}

						switch (alt163) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:863:10: '[' ']'
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7838); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7840); if (state.failed) return;
							}
							break;

						default :
							break loop163;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, arrayCreator_StartIndex); }

		}
	}
	// $ANTLR end "arrayCreator"



	// $ANTLR start "variableInitializer"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:866:1: variableInitializer : ( arrayInitializer | expression );
	public final void variableInitializer() throws RecognitionException {
		int variableInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:867:5: ( arrayInitializer | expression )
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==LBRACE) ) {
				alt165=1;
			}
			else if ( (LA165_0==EOF||LA165_0==BANG||LA165_0==BOOLEAN||LA165_0==BYTE||(LA165_0 >= CHAR && LA165_0 <= CHARLITERAL)||(LA165_0 >= COLON && LA165_0 <= COMMA)||(LA165_0 >= DOUBLE && LA165_0 <= DOUBLELITERAL)||LA165_0==FALSE||(LA165_0 >= FLOAT && LA165_0 <= FLOATLITERAL)||LA165_0==IDENTIFIER||LA165_0==INT||LA165_0==INTLITERAL||(LA165_0 >= LONG && LA165_0 <= LPAREN)||(LA165_0 >= NEW && LA165_0 <= NULL)||LA165_0==PLUS||LA165_0==PLUSPLUS||(LA165_0 >= RBRACE && LA165_0 <= RBRACKET)||(LA165_0 >= RPAREN && LA165_0 <= SHORT)||(LA165_0 >= STRINGLITERAL && LA165_0 <= SUB)||(LA165_0 >= SUBSUB && LA165_0 <= SUPER)||LA165_0==THIS||LA165_0==TILDE||LA165_0==TRUE||LA165_0==VOID||(LA165_0 >= 119 && LA165_0 <= 121)) ) {
				alt165=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:867:9: arrayInitializer
					{
					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer7870);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:868:9: expression
					{
					pushFollow(FOLLOW_expression_in_variableInitializer7880);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, variableInitializer_StartIndex); }

		}
	}
	// $ANTLR end "variableInitializer"



	// $ANTLR start "arrayInitializer"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:870:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' ;
	public final void arrayInitializer() throws RecognitionException {
		int arrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:871:5: ( '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:871:9: '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_arrayInitializer7899); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:872:13: ( variableInitializer ( ',' variableInitializer )* )?
			int alt167=2;
			switch ( input.LA(1) ) {
				case BANG:
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case CHARLITERAL:
				case DOUBLE:
				case DOUBLELITERAL:
				case FALSE:
				case FLOAT:
				case FLOATLITERAL:
				case IDENTIFIER:
				case INT:
				case INTLITERAL:
				case LBRACE:
				case LONG:
				case LONGLITERAL:
				case LPAREN:
				case NEW:
				case NULL:
				case PLUS:
				case PLUSPLUS:
				case SHORT:
				case STRINGLITERAL:
				case SUB:
				case SUBSUB:
				case SUPER:
				case THIS:
				case TILDE:
				case TRUE:
				case VOID:
				case 119:
				case 120:
				case 121:
					{
					alt167=1;
					}
					break;
				case COMMA:
					{
					int LA167_2 = input.LA(2);
					if ( (synpred285_Java()) ) {
						alt167=1;
					}
					}
					break;
				case RBRACE:
					{
					int LA167_3 = input.LA(2);
					if ( (synpred285_Java()) ) {
						alt167=1;
					}
					}
					break;
			}
			switch (alt167) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:872:14: variableInitializer ( ',' variableInitializer )*
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer7915);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:873:17: ( ',' variableInitializer )*
					loop166:
					while (true) {
						int alt166=2;
						int LA166_0 = input.LA(1);
						if ( (LA166_0==COMMA) ) {
							int LA166_1 = input.LA(2);
							if ( (synpred284_Java()) ) {
								alt166=1;
							}

						}

						switch (alt166) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:873:18: ',' variableInitializer
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer7934); if (state.failed) return;
							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer7936);
							variableInitializer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop166;
						}
					}

					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:876:13: ( ',' )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==COMMA) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:876:14: ','
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer7986); if (state.failed) return;
					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_arrayInitializer7999); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, arrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "arrayInitializer"



	// $ANTLR start "createdName"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:879:1: createdName : ( classOrInterfaceType | primitiveType );
	public final void createdName() throws RecognitionException {
		int createdName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:880:5: ( classOrInterfaceType | primitiveType )
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==IDENTIFIER) ) {
				alt169=1;
			}
			else if ( (LA169_0==BOOLEAN||LA169_0==BYTE||LA169_0==CHAR||LA169_0==DOUBLE||LA169_0==FLOAT||LA169_0==INT||LA169_0==LONG||LA169_0==SHORT) ) {
				alt169=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}

			switch (alt169) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:880:9: classOrInterfaceType
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_createdName8031);
					classOrInterfaceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:881:9: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_createdName8041);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, createdName_StartIndex); }

		}
	}
	// $ANTLR end "createdName"



	// $ANTLR start "innerCreator"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:883:1: innerCreator : '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest ;
	public final void innerCreator() throws RecognitionException {
		int innerCreator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:884:5: ( '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:884:9: '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest
			{
			match(input,DOT,FOLLOW_DOT_in_innerCreator8061); if (state.failed) return;
			match(input,NEW,FOLLOW_NEW_in_innerCreator8063); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:885:9: ( nonWildcardTypeArguments )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==LT) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:885:10: nonWildcardTypeArguments
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator8074);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerCreator8095); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:888:9: ( typeArguments )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==LT) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:888:10: typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_innerCreator8106);
					typeArguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_classCreatorRest_in_innerCreator8127);
			classCreatorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, innerCreator_StartIndex); }

		}
	}
	// $ANTLR end "innerCreator"



	// $ANTLR start "classCreatorRest"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:892:1: classCreatorRest : arguments ( classBody )? ;
	public final void classCreatorRest() throws RecognitionException {
		int classCreatorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:893:5: ( arguments ( classBody )? )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:893:9: arguments ( classBody )?
			{
			pushFollow(FOLLOW_arguments_in_classCreatorRest8146);
			arguments();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:894:9: ( classBody )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==LBRACE) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:894:10: classBody
					{
					pushFollow(FOLLOW_classBody_in_classCreatorRest8157);
					classBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, classCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "classCreatorRest"



	// $ANTLR start "nonWildcardTypeArguments"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:897:1: nonWildcardTypeArguments : '<' typeList '>' ;
	public final void nonWildcardTypeArguments() throws RecognitionException {
		int nonWildcardTypeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:898:5: ( '<' typeList '>' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:898:9: '<' typeList '>'
			{
			match(input,LT,FOLLOW_LT_in_nonWildcardTypeArguments8187); if (state.failed) return;
			pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments8189);
			typeList();
			state._fsp--;
			if (state.failed) return;
			match(input,GT,FOLLOW_GT_in_nonWildcardTypeArguments8199); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, nonWildcardTypeArguments_StartIndex); }

		}
	}
	// $ANTLR end "nonWildcardTypeArguments"



	// $ANTLR start "arguments"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:901:1: arguments : '(' ( expressionList )? ')' ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:902:5: ( '(' ( expressionList )? ')' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:902:9: '(' ( expressionList )? ')'
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_arguments8218); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:902:13: ( expressionList )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==BANG||LA173_0==BOOLEAN||LA173_0==BYTE||(LA173_0 >= CHAR && LA173_0 <= CHARLITERAL)||LA173_0==COMMA||(LA173_0 >= DOUBLE && LA173_0 <= DOUBLELITERAL)||LA173_0==FALSE||(LA173_0 >= FLOAT && LA173_0 <= FLOATLITERAL)||LA173_0==IDENTIFIER||LA173_0==INT||LA173_0==INTLITERAL||(LA173_0 >= LONG && LA173_0 <= LPAREN)||(LA173_0 >= NEW && LA173_0 <= NULL)||LA173_0==PLUS||LA173_0==PLUSPLUS||LA173_0==SHORT||(LA173_0 >= STRINGLITERAL && LA173_0 <= SUB)||(LA173_0 >= SUBSUB && LA173_0 <= SUPER)||LA173_0==THIS||LA173_0==TILDE||LA173_0==TRUE||LA173_0==VOID||(LA173_0 >= 119 && LA173_0 <= 121)) ) {
				alt173=1;
			}
			else if ( (LA173_0==RPAREN) ) {
				int LA173_2 = input.LA(2);
				if ( (synpred291_Java()) ) {
					alt173=1;
				}
			}
			switch (alt173) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:902:14: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments8221);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_arguments8234); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"



	// $ANTLR start "literal"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:905:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL );
	public final void literal() throws RecognitionException {
		int literal_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:906:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:
			{
			if ( input.LA(1)==CHARLITERAL||input.LA(1)==DOUBLELITERAL||input.LA(1)==FALSE||input.LA(1)==FLOATLITERAL||input.LA(1)==INTLITERAL||input.LA(1)==LONGLITERAL||input.LA(1)==NULL||input.LA(1)==STRINGLITERAL||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, literal_StartIndex); }

		}
	}
	// $ANTLR end "literal"



	// $ANTLR start "classHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:920:1: classHeader : modifiers 'class' IDENTIFIER ;
	public final void classHeader() throws RecognitionException {
		int classHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:921:5: ( modifiers 'class' IDENTIFIER )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:921:9: modifiers 'class' IDENTIFIER
			{
			pushFollow(FOLLOW_modifiers_in_classHeader8356);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			match(input,CLASS,FOLLOW_CLASS_in_classHeader8358); if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classHeader8360); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, classHeader_StartIndex); }

		}
	}
	// $ANTLR end "classHeader"



	// $ANTLR start "enumHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:923:1: enumHeader : modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER ;
	public final void enumHeader() throws RecognitionException {
		int enumHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:924:5: ( modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:924:9: modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER
			{
			pushFollow(FOLLOW_modifiers_in_enumHeader8380);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			if ( input.LA(1)==ENUM||input.LA(1)==IDENTIFIER ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumHeader8388); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, enumHeader_StartIndex); }

		}
	}
	// $ANTLR end "enumHeader"



	// $ANTLR start "interfaceHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:926:1: interfaceHeader : modifiers 'interface' IDENTIFIER ;
	public final void interfaceHeader() throws RecognitionException {
		int interfaceHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:927:5: ( modifiers 'interface' IDENTIFIER )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:927:9: modifiers 'interface' IDENTIFIER
			{
			pushFollow(FOLLOW_modifiers_in_interfaceHeader8407);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceHeader8409); if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceHeader8411); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, interfaceHeader_StartIndex); }

		}
	}
	// $ANTLR end "interfaceHeader"



	// $ANTLR start "annotationHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:929:1: annotationHeader : modifiers '@' 'interface' IDENTIFIER ;
	public final void annotationHeader() throws RecognitionException {
		int annotationHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:930:5: ( modifiers '@' 'interface' IDENTIFIER )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:930:9: modifiers '@' 'interface' IDENTIFIER
			{
			pushFollow(FOLLOW_modifiers_in_annotationHeader8430);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationHeader8432); if (state.failed) return;
			match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationHeader8434); if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationHeader8436); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, annotationHeader_StartIndex); }

		}
	}
	// $ANTLR end "annotationHeader"



	// $ANTLR start "typeHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:932:1: typeHeader : modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER ;
	public final void typeHeader() throws RecognitionException {
		int typeHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:5: ( modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:9: modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER
			{
			pushFollow(FOLLOW_modifiers_in_typeHeader8455);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:19: ( 'class' | 'enum' | ( ( '@' )? 'interface' ) )
			int alt175=3;
			switch ( input.LA(1) ) {
			case CLASS:
				{
				alt175=1;
				}
				break;
			case ENUM:
				{
				alt175=2;
				}
				break;
			case INTERFACE:
			case MONKEYS_AT:
				{
				alt175=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 175, 0, input);
				throw nvae;
			}
			switch (alt175) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:20: 'class'
					{
					match(input,CLASS,FOLLOW_CLASS_in_typeHeader8458); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:28: 'enum'
					{
					match(input,ENUM,FOLLOW_ENUM_in_typeHeader8460); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:35: ( ( '@' )? 'interface' )
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:35: ( ( '@' )? 'interface' )
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:36: ( '@' )? 'interface'
					{
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:36: ( '@' )?
					int alt174=2;
					int LA174_0 = input.LA(1);
					if ( (LA174_0==MONKEYS_AT) ) {
						alt174=1;
					}
					switch (alt174) {
						case 1 :
							// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:933:36: '@'
							{
							match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_typeHeader8463); if (state.failed) return;
							}
							break;

					}

					match(input,INTERFACE,FOLLOW_INTERFACE_in_typeHeader8467); if (state.failed) return;
					}

					}
					break;

			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeHeader8471); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 113, typeHeader_StartIndex); }

		}
	}
	// $ANTLR end "typeHeader"



	// $ANTLR start "methodHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:935:1: methodHeader : modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' ;
	public final void methodHeader() throws RecognitionException {
		int methodHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:5: ( modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:9: modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '('
			{
			pushFollow(FOLLOW_modifiers_in_methodHeader8490);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:19: ( typeParameters )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==LT) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:19: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_methodHeader8492);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:35: ( type | 'void' )?
			int alt177=3;
			switch ( input.LA(1) ) {
				case IDENTIFIER:
					{
					int LA177_1 = input.LA(2);
					if ( (LA177_1==DOT||LA177_1==IDENTIFIER||LA177_1==LBRACKET||LA177_1==LT) ) {
						alt177=1;
					}
					}
					break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					{
					alt177=1;
					}
					break;
				case VOID:
					{
					alt177=2;
					}
					break;
			}
			switch (alt177) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:36: type
					{
					pushFollow(FOLLOW_type_in_methodHeader8496);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:936:41: 'void'
					{
					match(input,VOID,FOLLOW_VOID_in_methodHeader8498); if (state.failed) return;
					}
					break;

			}

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodHeader8502); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_methodHeader8504); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 114, methodHeader_StartIndex); }

		}
	}
	// $ANTLR end "methodHeader"



	// $ANTLR start "fieldHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:938:1: fieldHeader : modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
	public final void fieldHeader() throws RecognitionException {
		int fieldHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:939:5: ( modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:939:9: modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
			{
			pushFollow(FOLLOW_modifiers_in_fieldHeader8523);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_fieldHeader8525);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldHeader8527); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:939:35: ( '[' ']' )*
			loop178:
			while (true) {
				int alt178=2;
				int LA178_0 = input.LA(1);
				if ( (LA178_0==LBRACKET) ) {
					alt178=1;
				}

				switch (alt178) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:939:36: '[' ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_fieldHeader8530); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_fieldHeader8531); if (state.failed) return;
					}
					break;

				default :
					break loop178;
				}
			}

			if ( input.LA(1)==COMMA||input.LA(1)==EQ||input.LA(1)==SEMI ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 115, fieldHeader_StartIndex); }

		}
	}
	// $ANTLR end "fieldHeader"



	// $ANTLR start "localVariableHeader"
	// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:941:1: localVariableHeader : variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
	public final void localVariableHeader() throws RecognitionException {
		int localVariableHeader_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return; }

			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:942:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:942:9: variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
			{
			pushFollow(FOLLOW_variableModifiers_in_localVariableHeader8560);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_localVariableHeader8562);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableHeader8564); if (state.failed) return;
			// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:942:43: ( '[' ']' )*
			loop179:
			while (true) {
				int alt179=2;
				int LA179_0 = input.LA(1);
				if ( (LA179_0==LBRACKET) ) {
					alt179=1;
				}

				switch (alt179) {
				case 1 :
					// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:942:44: '[' ']'
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_localVariableHeader8567); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_localVariableHeader8568); if (state.failed) return;
					}
					break;

				default :
					break loop179;
				}
			}

			if ( input.LA(1)==COMMA||input.LA(1)==EQ||input.LA(1)==SEMI ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 116, localVariableHeader_StartIndex); }

		}
	}
	// $ANTLR end "localVariableHeader"

	// $ANTLR start synpred2_Java
	public final void synpred2_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:13: ( ( annotations )? packageDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:13: ( annotations )? packageDeclaration
		{
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:13: ( annotations )?
		int alt180=2;
		int LA180_0 = input.LA(1);
		if ( (LA180_0==MONKEYS_AT) ) {
			alt180=1;
		}
		switch (alt180) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:45:14: annotations
				{
				pushFollow(FOLLOW_annotations_in_synpred2_Java80);
				annotations();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		pushFollow(FOLLOW_packageDeclaration_in_synpred2_Java109);
		packageDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Java

	// $ANTLR start synpred12_Java
	public final void synpred12_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:84:10: ( classDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:84:10: classDeclaration
		{
		pushFollow(FOLLOW_classDeclaration_in_synpred12_Java462);
		classDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred12_Java

	// $ANTLR start synpred27_Java
	public final void synpred27_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:112:9: ( normalClassDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:112:9: normalClassDeclaration
		{
		pushFollow(FOLLOW_normalClassDeclaration_in_synpred27_Java733);
		normalClassDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Java

	// $ANTLR start synpred43_Java
	public final void synpred43_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:187:9: ( normalInterfaceDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:187:9: normalInterfaceDeclaration
		{
		pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred43_Java1432);
		normalInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_Java

	// $ANTLR start synpred52_Java
	public final void synpred52_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:224:10: ( fieldDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:224:10: fieldDeclaration
		{
		pushFollow(FOLLOW_fieldDeclaration_in_synpred52_Java1759);
		fieldDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_Java

	// $ANTLR start synpred53_Java
	public final void synpred53_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:225:10: ( methodDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:225:10: methodDeclaration
		{
		pushFollow(FOLLOW_methodDeclaration_in_synpred53_Java1772);
		methodDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred53_Java

	// $ANTLR start synpred54_Java
	public final void synpred54_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:226:10: ( classDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:226:10: classDeclaration
		{
		pushFollow(FOLLOW_classDeclaration_in_synpred54_Java1785);
		classDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred54_Java

	// $ANTLR start synpred57_Java
	public final void synpred57_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:240:10: ( explicitConstructorInvocation )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:240:10: explicitConstructorInvocation
		{
		pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred57_Java1934);
		explicitConstructorInvocation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_Java

	// $ANTLR start synpred59_Java
	public final void synpred59_Java_fragment() throws RecognitionException {
		String e =null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:232:10: ( modifiers ( typeParameters )? IDENTIFIER e= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:232:10: modifiers ( typeParameters )? IDENTIFIER e= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
		{
		pushFollow(FOLLOW_modifiers_in_synpred59_Java1836);
		modifiers();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:233:9: ( typeParameters )?
		int alt183=2;
		int LA183_0 = input.LA(1);
		if ( (LA183_0==LT) ) {
			alt183=1;
		}
		switch (alt183) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:233:10: typeParameters
				{
				pushFollow(FOLLOW_typeParameters_in_synpred59_Java1849);
				typeParameters();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred59_Java1872); if (state.failed) return;
		pushFollow(FOLLOW_formalParameters_in_synpred59_Java1886);
		e=formalParameters();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:237:9: ( 'throws' qualifiedNameList )?
		int alt184=2;
		int LA184_0 = input.LA(1);
		if ( (LA184_0==THROWS) ) {
			alt184=1;
		}
		switch (alt184) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:237:10: 'throws' qualifiedNameList
				{
				match(input,THROWS,FOLLOW_THROWS_in_synpred59_Java1899); if (state.failed) return;
				pushFollow(FOLLOW_qualifiedNameList_in_synpred59_Java1901);
				qualifiedNameList();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,LBRACE,FOLLOW_LBRACE_in_synpred59_Java1922); if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:240:9: ( explicitConstructorInvocation )?
		int alt185=2;
		switch ( input.LA(1) ) {
			case LT:
				{
				alt185=1;
				}
				break;
			case THIS:
				{
				int LA185_2 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case LPAREN:
				{
				int LA185_3 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case SUPER:
				{
				int LA185_4 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case IDENTIFIER:
				{
				int LA185_5 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case INTLITERAL:
				{
				int LA185_6 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case NEW:
				{
				int LA185_7 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case BOOLEAN:
				{
				int LA185_8 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case CHAR:
				{
				int LA185_9 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case BYTE:
				{
				int LA185_10 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case SHORT:
				{
				int LA185_11 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case INT:
				{
				int LA185_12 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case LONG:
				{
				int LA185_13 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case FLOAT:
				{
				int LA185_14 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case DOUBLE:
				{
				int LA185_15 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case VOID:
				{
				int LA185_16 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
			case CHARLITERAL:
			case DOUBLELITERAL:
			case FALSE:
			case FLOATLITERAL:
			case LONGLITERAL:
			case NULL:
			case STRINGLITERAL:
			case TRUE:
				{
				int LA185_48 = input.LA(2);
				if ( (synpred57_Java()) ) {
					alt185=1;
				}
				}
				break;
		}
		switch (alt185) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:240:10: explicitConstructorInvocation
				{
				pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred59_Java1934);
				explicitConstructorInvocation();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:242:9: ( blockStatement )*
		loop186:
		while (true) {
			int alt186=2;
			int LA186_0 = input.LA(1);
			if ( (LA186_0==ABSTRACT||(LA186_0 >= ASSERT && LA186_0 <= BANG)||(LA186_0 >= BOOLEAN && LA186_0 <= BYTE)||(LA186_0 >= CHAR && LA186_0 <= CLASS)||LA186_0==CONTINUE||LA186_0==DO||(LA186_0 >= DOUBLE && LA186_0 <= DOUBLELITERAL)||LA186_0==ENUM||(LA186_0 >= FALSE && LA186_0 <= FINAL)||(LA186_0 >= FLOAT && LA186_0 <= FOR)||(LA186_0 >= IDENTIFIER && LA186_0 <= IF)||(LA186_0 >= INT && LA186_0 <= INTLITERAL)||LA186_0==LBRACE||(LA186_0 >= LONG && LA186_0 <= LPAREN)||(LA186_0 >= MONKEYS_AT && LA186_0 <= NULL)||LA186_0==PLUS||(LA186_0 >= PLUSPLUS && LA186_0 <= PUBLIC)||LA186_0==RETURN||(LA186_0 >= SEMI && LA186_0 <= SHORT)||(LA186_0 >= STATIC && LA186_0 <= SUB)||(LA186_0 >= SUBSUB && LA186_0 <= SYNCHRONIZED)||(LA186_0 >= THIS && LA186_0 <= THROW)||(LA186_0 >= TILDE && LA186_0 <= WHILE)||(LA186_0 >= 119 && LA186_0 <= 121)) ) {
				alt186=1;
			}

			switch (alt186) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:242:10: blockStatement
				{
				pushFollow(FOLLOW_blockStatement_in_synpred59_Java1956);
				blockStatement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop186;
			}
		}

		match(input,RBRACE,FOLLOW_RBRACE_in_synpred59_Java1978); if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_Java

	// $ANTLR start synpred68_Java
	public final void synpred68_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:284:9: ( interfaceFieldDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:284:9: interfaceFieldDeclaration
		{
		pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred68_Java2402);
		interfaceFieldDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_Java

	// $ANTLR start synpred69_Java
	public final void synpred69_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:285:9: ( interfaceMethodDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:285:9: interfaceMethodDeclaration
		{
		pushFollow(FOLLOW_interfaceMethodDeclaration_in_synpred69_Java2412);
		interfaceMethodDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_Java

	// $ANTLR start synpred70_Java
	public final void synpred70_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:286:9: ( interfaceDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:286:9: interfaceDeclaration
		{
		pushFollow(FOLLOW_interfaceDeclaration_in_synpred70_Java2422);
		interfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_Java

	// $ANTLR start synpred71_Java
	public final void synpred71_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:287:9: ( classDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:287:9: classDeclaration
		{
		pushFollow(FOLLOW_classDeclaration_in_synpred71_Java2432);
		classDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_Java

	// $ANTLR start synpred101_Java
	public final void synpred101_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:4: ( ( ( IDENTIFIER || INTLITERAL ) ',' )* ( IDENTIFIER || INTLITERAL ) )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:4: ( ( IDENTIFIER || INTLITERAL ) ',' )* ( IDENTIFIER || INTLITERAL )
		{
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:4: ( ( IDENTIFIER || INTLITERAL ) ',' )*
		loop191:
		while (true) {
			int alt191=2;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA191_1 = input.LA(2);
				if ( (LA191_1==COMMA) ) {
					alt191=1;
				}

				}
				break;
			case INTLITERAL:
				{
				int LA191_3 = input.LA(2);
				if ( (LA191_3==COMMA) ) {
					alt191=1;
				}

				}
				break;
			case COMMA:
				{
				alt191=1;
				}
				break;
			}
			switch (alt191) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:5: ( IDENTIFIER || INTLITERAL ) ','
				{
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:5: ( IDENTIFIER || INTLITERAL )
				int alt190=3;
				switch ( input.LA(1) ) {
				case IDENTIFIER:
					{
					alt190=1;
					}
					break;
				case COMMA:
					{
					alt190=2;
					}
					break;
				case INTLITERAL:
					{
					alt190=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 190, 0, input);
					throw nvae;
				}
				switch (alt190) {
					case 1 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:6: IDENTIFIER
						{
						match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred101_Java3284); if (state.failed) return;
						}
						break;
					case 2 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:18: 
						{
						}
						break;
					case 3 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:20: INTLITERAL
						{
						match(input,INTLITERAL,FOLLOW_INTLITERAL_in_synpred101_Java3289); if (state.failed) return;
						}
						break;

				}

				match(input,COMMA,FOLLOW_COMMA_in_synpred101_Java3292); if (state.failed) return;
				}
				break;

			default :
				break loop191;
			}
		}

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:38: ( IDENTIFIER || INTLITERAL )
		int alt192=3;
		switch ( input.LA(1) ) {
		case IDENTIFIER:
			{
			alt192=1;
			}
			break;
		case EOF:
			{
			alt192=2;
			}
			break;
		case INTLITERAL:
			{
			alt192=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 192, 0, input);
			throw nvae;
		}
		switch (alt192) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:39: IDENTIFIER
				{
				match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred101_Java3297); if (state.failed) return;
				}
				break;
			case 2 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:51: 
				{
				}
				break;
			case 3 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:371:53: INTLITERAL
				{
				match(input,INTLITERAL,FOLLOW_INTLITERAL_in_synpred101_Java3302); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred101_Java

	// $ANTLR start synpred102_Java
	public final void synpred102_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:372:3: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:372:3: 
		{
		}

	}
	// $ANTLR end synpred102_Java

	// $ANTLR start synpred103_Java
	public final void synpred103_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:372:5: ( primary )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:372:5: primary
		{
		pushFollow(FOLLOW_primary_in_synpred103_Java3309);
		primary();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred103_Java

	// $ANTLR start synpred104_Java
	public final void synpred104_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:373:3: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:373:3: 
		{
		}

	}
	// $ANTLR end synpred104_Java

	// $ANTLR start synpred105_Java
	public final void synpred105_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:381:9: ( ellipsisParameterDecl )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:381:9: ellipsisParameterDecl
		{
		pushFollow(FOLLOW_ellipsisParameterDecl_in_synpred105_Java3349);
		ellipsisParameterDecl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred105_Java

	// $ANTLR start synpred107_Java
	public final void synpred107_Java_fragment() throws RecognitionException {
		String e =null;
		String f =null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:382:9: (e= normalParameterDecl ( ',' f= normalParameterDecl )* )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:382:9: e= normalParameterDecl ( ',' f= normalParameterDecl )*
		{
		pushFollow(FOLLOW_normalParameterDecl_in_synpred107_Java3361);
		e=normalParameterDecl();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:383:9: ( ',' f= normalParameterDecl )*
		loop193:
		while (true) {
			int alt193=2;
			int LA193_0 = input.LA(1);
			if ( (LA193_0==COMMA) ) {
				alt193=1;
			}

			switch (alt193) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:383:10: ',' f= normalParameterDecl
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred107_Java3374); if (state.failed) return;
				pushFollow(FOLLOW_normalParameterDecl_in_synpred107_Java3378);
				f=normalParameterDecl();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop193;
			}
		}

		}

	}
	// $ANTLR end synpred107_Java

	// $ANTLR start synpred108_Java
	public final void synpred108_Java_fragment() throws RecognitionException {
		String g =null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:385:10: (g= normalParameterDecl ',' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:385:10: g= normalParameterDecl ','
		{
		pushFollow(FOLLOW_normalParameterDecl_in_synpred108_Java3406);
		g=normalParameterDecl();
		state._fsp--;
		if (state.failed) return;
		match(input,COMMA,FOLLOW_COMMA_in_synpred108_Java3418); if (state.failed) return;
		}

	}
	// $ANTLR end synpred108_Java

	// $ANTLR start synpred112_Java
	public final void synpred112_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
		{
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:9: ( nonWildcardTypeArguments )?
		int alt194=2;
		int LA194_0 = input.LA(1);
		if ( (LA194_0==LT) ) {
			alt194=1;
		}
		switch (alt194) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:402:10: nonWildcardTypeArguments
				{
				pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred112_Java3563);
				nonWildcardTypeArguments();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_arguments_in_synpred112_Java3621);
		arguments();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMI,FOLLOW_SEMI_in_synpred112_Java3623); if (state.failed) return;
		}

	}
	// $ANTLR end synpred112_Java

	// $ANTLR start synpred126_Java
	public final void synpred126_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:476:9: ( annotationMethodDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:476:9: annotationMethodDeclaration
		{
		pushFollow(FOLLOW_annotationMethodDeclaration_in_synpred126_Java4209);
		annotationMethodDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred126_Java

	// $ANTLR start synpred127_Java
	public final void synpred127_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:477:9: ( interfaceFieldDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:477:9: interfaceFieldDeclaration
		{
		pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred127_Java4219);
		interfaceFieldDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred127_Java

	// $ANTLR start synpred128_Java
	public final void synpred128_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:478:9: ( normalClassDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:478:9: normalClassDeclaration
		{
		pushFollow(FOLLOW_normalClassDeclaration_in_synpred128_Java4229);
		normalClassDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred128_Java

	// $ANTLR start synpred129_Java
	public final void synpred129_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:479:9: ( normalInterfaceDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:479:9: normalInterfaceDeclaration
		{
		pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred129_Java4239);
		normalInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred129_Java

	// $ANTLR start synpred130_Java
	public final void synpred130_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:480:9: ( enumDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:480:9: enumDeclaration
		{
		pushFollow(FOLLOW_enumDeclaration_in_synpred130_Java4249);
		enumDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred130_Java

	// $ANTLR start synpred131_Java
	public final void synpred131_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:481:9: ( annotationTypeDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:481:9: annotationTypeDeclaration
		{
		pushFollow(FOLLOW_annotationTypeDeclaration_in_synpred131_Java4259);
		annotationTypeDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred131_Java

	// $ANTLR start synpred134_Java
	public final void synpred134_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:521:9: ( localVariableDeclarationStatement )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:521:9: localVariableDeclarationStatement
		{
		pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred134_Java4414);
		localVariableDeclarationStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred134_Java

	// $ANTLR start synpred135_Java
	public final void synpred135_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:522:9: ( function_statement )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:522:9: function_statement
		{
		pushFollow(FOLLOW_function_statement_in_synpred135_Java4426);
		function_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred135_Java

	// $ANTLR start synpred136_Java
	public final void synpred136_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:523:9: ( classOrInterfaceDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:523:9: classOrInterfaceDeclaration
		{
		pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred136_Java4436);
		classOrInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred136_Java

	// $ANTLR start synpred137_Java
	public final void synpred137_Java_fragment() throws RecognitionException {
		Token a=null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:535:2: (a= 'System.out.println' '(' STRINGLITERAL ')' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:535:2: a= 'System.out.println' '(' STRINGLITERAL ')'
		{
		a=(Token)match(input,119,FOLLOW_119_in_synpred137_Java4485); if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred137_Java4487); if (state.failed) return;
		match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_synpred137_Java4489); if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred137_Java4491); if (state.failed) return;
		}

	}
	// $ANTLR end synpred137_Java

	// $ANTLR start synpred138_Java
	public final void synpred138_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:536:3: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:536:3: 
		{
		}

	}
	// $ANTLR end synpred138_Java

	// $ANTLR start synpred139_Java
	public final void synpred139_Java_fragment() throws RecognitionException {
		Token a=null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:536:5: (a= 'System.out.println' '(' function_call ')' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:536:5: a= 'System.out.println' '(' function_call ')'
		{
		a=(Token)match(input,119,FOLLOW_119_in_synpred139_Java4502); if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred139_Java4504); if (state.failed) return;
		pushFollow(FOLLOW_function_call_in_synpred139_Java4506);
		function_call();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred139_Java4508); if (state.failed) return;
		}

	}
	// $ANTLR end synpred139_Java

	// $ANTLR start synpred140_Java
	public final void synpred140_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:537:3: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:537:3: 
		{
		}

	}
	// $ANTLR end synpred140_Java

	// $ANTLR start synpred142_Java
	public final void synpred142_Java_fragment() throws RecognitionException {
		Token a=null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:548:4: (a= IDENTIFIER multiple_calls '(' functionParameters ')' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:548:4: a= IDENTIFIER multiple_calls '(' functionParameters ')'
		{
		a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred142_Java4567); if (state.failed) return;
		pushFollow(FOLLOW_multiple_calls_in_synpred142_Java4569);
		multiple_calls();
		state._fsp--;
		if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred142_Java4571); if (state.failed) return;
		pushFollow(FOLLOW_functionParameters_in_synpred142_Java4573);
		functionParameters();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred142_Java4575); if (state.failed) return;
		}

	}
	// $ANTLR end synpred142_Java

	// $ANTLR start synpred149_Java
	public final void synpred149_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:9: ( ( 'assert' ) expression ( ':' expression )? ';' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:9: ( 'assert' ) expression ( ':' expression )? ';'
		{
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:9: ( 'assert' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:567:10: 'assert'
		{
		match(input,ASSERT,FOLLOW_ASSERT_in_synpred149_Java4766); if (state.failed) return;
		}

		pushFollow(FOLLOW_expression_in_synpred149_Java4786);
		expression();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:569:20: ( ':' expression )?
		int alt197=2;
		int LA197_0 = input.LA(1);
		if ( (LA197_0==COLON) ) {
			alt197=1;
		}
		switch (alt197) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:569:21: ':' expression
				{
				match(input,COLON,FOLLOW_COLON_in_synpred149_Java4789); if (state.failed) return;
				pushFollow(FOLLOW_expression_in_synpred149_Java4791);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,SEMI,FOLLOW_SEMI_in_synpred149_Java4795); if (state.failed) return;
		}

	}
	// $ANTLR end synpred149_Java

	// $ANTLR start synpred151_Java
	public final void synpred151_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:9: ( 'assert' expression ( ':' expression )? ';' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:9: 'assert' expression ( ':' expression )? ';'
		{
		match(input,ASSERT,FOLLOW_ASSERT_in_synpred151_Java4805); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred151_Java4808);
		expression();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:30: ( ':' expression )?
		int alt198=2;
		int LA198_0 = input.LA(1);
		if ( (LA198_0==COLON) ) {
			alt198=1;
		}
		switch (alt198) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:570:31: ':' expression
				{
				match(input,COLON,FOLLOW_COLON_in_synpred151_Java4811); if (state.failed) return;
				pushFollow(FOLLOW_expression_in_synpred151_Java4813);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,SEMI,FOLLOW_SEMI_in_synpred151_Java4817); if (state.failed) return;
		}

	}
	// $ANTLR end synpred151_Java

	// $ANTLR start synpred152_Java
	public final void synpred152_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:571:39: ( 'else' statement )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:571:39: 'else' statement
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred152_Java4846); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred152_Java4848);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred152_Java

	// $ANTLR start synpred160_Java
	public final void synpred160_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:578:19: ( expression )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:578:19: expression
		{
		pushFollow(FOLLOW_expression_in_synpred160_Java4957);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred160_Java

	// $ANTLR start synpred167_Java
	public final void synpred167_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:586:9: ( expression ';' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:586:9: expression ';'
		{
		pushFollow(FOLLOW_expression_in_synpred167_Java5070);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMI,FOLLOW_SEMI_in_synpred167_Java5073); if (state.failed) return;
		}

	}
	// $ANTLR end synpred167_Java

	// $ANTLR start synpred168_Java
	public final void synpred168_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:587:9: ( IDENTIFIER ':' statement )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:587:9: IDENTIFIER ':' statement
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred168_Java5088); if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred168_Java5090); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred168_Java5092);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred168_Java

	// $ANTLR start synpred172_Java
	public final void synpred172_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:605:13: ( catches 'finally' block )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:605:13: catches 'finally' block
		{
		pushFollow(FOLLOW_catches_in_synpred172_Java5242);
		catches();
		state._fsp--;
		if (state.failed) return;
		match(input,FINALLY,FOLLOW_FINALLY_in_synpred172_Java5244); if (state.failed) return;
		pushFollow(FOLLOW_block_in_synpred172_Java5246);
		block();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred172_Java

	// $ANTLR start synpred173_Java
	public final void synpred173_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:606:13: ( catches )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:606:13: catches
		{
		pushFollow(FOLLOW_catches_in_synpred173_Java5260);
		catches();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred173_Java

	// $ANTLR start synpred176_Java
	public final void synpred176_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:627:9: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:627:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement
		{
		match(input,FOR,FOLLOW_FOR_in_synpred176_Java5448); if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred176_Java5450); if (state.failed) return;
		pushFollow(FOLLOW_variableModifiers_in_synpred176_Java5452);
		variableModifiers();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred176_Java5454);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred176_Java5456); if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred176_Java5458); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred176_Java5469);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred176_Java5471); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred176_Java5473);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred176_Java

	// $ANTLR start synpred177_Java
	public final void synpred177_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:632:18: ( forInit )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:632:18: forInit
		{
		pushFollow(FOLLOW_forInit_in_synpred177_Java5527);
		forInit();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred177_Java

	// $ANTLR start synpred178_Java
	public final void synpred178_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:634:18: ( expression )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:634:18: expression
		{
		pushFollow(FOLLOW_expression_in_synpred178_Java5568);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred178_Java

	// $ANTLR start synpred179_Java
	public final void synpred179_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:636:18: ( expressionList )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:636:18: expressionList
		{
		pushFollow(FOLLOW_expressionList_in_synpred179_Java5609);
		expressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred179_Java

	// $ANTLR start synpred180_Java
	public final void synpred180_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:640:9: ( localVariableDeclaration )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:640:9: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred180_Java5651);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred180_Java

	// $ANTLR start synpred182_Java
	public final void synpred182_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:654:5: ( function_call )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:654:5: function_call
		{
		pushFollow(FOLLOW_function_call_in_synpred182_Java5751);
		function_call();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred182_Java

	// $ANTLR start synpred183_Java
	public final void synpred183_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:655:6: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:655:6: 
		{
		}

	}
	// $ANTLR end synpred183_Java

	// $ANTLR start synpred184_Java
	public final void synpred184_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:655:8: ( system_call )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:655:8: system_call
		{
		pushFollow(FOLLOW_system_call_in_synpred184_Java5760);
		system_call();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred184_Java

	// $ANTLR start synpred185_Java
	public final void synpred185_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:6: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:6: 
		{
		}

	}
	// $ANTLR end synpred185_Java

	// $ANTLR start synpred187_Java
	public final void synpred187_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:24: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:24: 
		{
		}

	}
	// $ANTLR end synpred187_Java

	// $ANTLR start synpred189_Java
	public final void synpred189_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:29: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:29: 
		{
		}

	}
	// $ANTLR end synpred189_Java

	// $ANTLR start synpred191_Java
	public final void synpred191_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:34: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:34: 
		{
		}

	}
	// $ANTLR end synpred191_Java

	// $ANTLR start synpred193_Java
	public final void synpred193_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:7: ( ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )* function_call )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:7: ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )* function_call
		{
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:7: ( IDENTIFIER ( '*' || '/' || '+' || '-' ) )*
		loop205:
		while (true) {
			int alt205=2;
			int LA205_0 = input.LA(1);
			if ( (LA205_0==IDENTIFIER) ) {
				int LA205_1 = input.LA(2);
				if ( (LA205_1==EOF||LA205_1==IDENTIFIER||LA205_1==PLUS||LA205_1==SLASH||LA205_1==STAR||LA205_1==SUB||(LA205_1 >= 120 && LA205_1 <= 121)) ) {
					alt205=1;
				}

			}

			switch (alt205) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:8: IDENTIFIER ( '*' || '/' || '+' || '-' )
				{
				match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred193_Java5770); if (state.failed) return;
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:19: ( '*' || '/' || '+' || '-' )
				int alt204=7;
				switch ( input.LA(1) ) {
				case STAR:
					{
					alt204=1;
					}
					break;
				case IDENTIFIER:
					{
					int LA204_2 = input.LA(2);
					if ( (synpred187_Java()) ) {
						alt204=2;
					}
					else if ( (synpred189_Java()) ) {
						alt204=4;
					}
					else if ( (synpred191_Java()) ) {
						alt204=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 204, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
					{
					int LA204_3 = input.LA(2);
					if ( (synpred187_Java()) ) {
						alt204=2;
					}
					else if ( (synpred189_Java()) ) {
						alt204=4;
					}
					else if ( (synpred191_Java()) ) {
						alt204=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 204, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 120:
					{
					int LA204_4 = input.LA(2);
					if ( (synpred187_Java()) ) {
						alt204=2;
					}
					else if ( (synpred189_Java()) ) {
						alt204=4;
					}
					else if ( (synpred191_Java()) ) {
						alt204=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 204, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 121:
					{
					int LA204_5 = input.LA(2);
					if ( (synpred187_Java()) ) {
						alt204=2;
					}
					else if ( (synpred189_Java()) ) {
						alt204=4;
					}
					else if ( (synpred191_Java()) ) {
						alt204=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 204, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case SLASH:
					{
					alt204=3;
					}
					break;
				case PLUS:
					{
					alt204=5;
					}
					break;
				case SUB:
					{
					alt204=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 204, 0, input);
					throw nvae;
				}
				switch (alt204) {
					case 1 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:20: '*'
						{
						match(input,STAR,FOLLOW_STAR_in_synpred193_Java5773); if (state.failed) return;
						}
						break;
					case 2 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:24: 
						{
						}
						break;
					case 3 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:25: '/'
						{
						match(input,SLASH,FOLLOW_SLASH_in_synpred193_Java5776); if (state.failed) return;
						}
						break;
					case 4 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:29: 
						{
						}
						break;
					case 5 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:30: '+'
						{
						match(input,PLUS,FOLLOW_PLUS_in_synpred193_Java5779); if (state.failed) return;
						}
						break;
					case 6 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:34: 
						{
						}
						break;
					case 7 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:656:35: '-'
						{
						match(input,SUB,FOLLOW_SUB_in_synpred193_Java5782); if (state.failed) return;
						}
						break;

				}

				}
				break;

			default :
				break loop205;
			}
		}

		pushFollow(FOLLOW_function_call_in_synpred193_Java5787);
		function_call();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred193_Java

	// $ANTLR start synpred194_Java
	public final void synpred194_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:6: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:6: 
		{
		}

	}
	// $ANTLR end synpred194_Java

	// $ANTLR start synpred196_Java
	public final void synpred196_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:25: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:25: 
		{
		}

	}
	// $ANTLR end synpred196_Java

	// $ANTLR start synpred198_Java
	public final void synpred198_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:30: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:30: 
		{
		}

	}
	// $ANTLR end synpred198_Java

	// $ANTLR start synpred200_Java
	public final void synpred200_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:35: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:35: 
		{
		}

	}
	// $ANTLR end synpred200_Java

	// $ANTLR start synpred202_Java
	public final void synpred202_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:8: ( ( INTLITERAL ( '*' || '/' || '+' || '-' ) )* function_call )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:8: ( INTLITERAL ( '*' || '/' || '+' || '-' ) )* function_call
		{
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:8: ( INTLITERAL ( '*' || '/' || '+' || '-' ) )*
		loop208:
		while (true) {
			int alt208=2;
			int LA208_0 = input.LA(1);
			if ( (LA208_0==INTLITERAL) ) {
				alt208=1;
			}

			switch (alt208) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:9: INTLITERAL ( '*' || '/' || '+' || '-' )
				{
				match(input,INTLITERAL,FOLLOW_INTLITERAL_in_synpred202_Java5798); if (state.failed) return;
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:20: ( '*' || '/' || '+' || '-' )
				int alt207=7;
				switch ( input.LA(1) ) {
				case STAR:
					{
					alt207=1;
					}
					break;
				case IDENTIFIER:
					{
					int LA207_2 = input.LA(2);
					if ( (synpred196_Java()) ) {
						alt207=2;
					}
					else if ( (synpred198_Java()) ) {
						alt207=4;
					}
					else if ( (synpred200_Java()) ) {
						alt207=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 207, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
					{
					int LA207_3 = input.LA(2);
					if ( (synpred196_Java()) ) {
						alt207=2;
					}
					else if ( (synpred198_Java()) ) {
						alt207=4;
					}
					else if ( (synpred200_Java()) ) {
						alt207=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 207, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 120:
					{
					int LA207_4 = input.LA(2);
					if ( (synpred196_Java()) ) {
						alt207=2;
					}
					else if ( (synpred198_Java()) ) {
						alt207=4;
					}
					else if ( (synpred200_Java()) ) {
						alt207=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 207, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 121:
					{
					int LA207_5 = input.LA(2);
					if ( (synpred196_Java()) ) {
						alt207=2;
					}
					else if ( (synpred198_Java()) ) {
						alt207=4;
					}
					else if ( (synpred200_Java()) ) {
						alt207=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 207, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case INTLITERAL:
					{
					int LA207_6 = input.LA(2);
					if ( (synpred196_Java()) ) {
						alt207=2;
					}
					else if ( (synpred198_Java()) ) {
						alt207=4;
					}
					else if ( (synpred200_Java()) ) {
						alt207=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 207, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case SLASH:
					{
					alt207=3;
					}
					break;
				case PLUS:
					{
					alt207=5;
					}
					break;
				case SUB:
					{
					alt207=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 207, 0, input);
					throw nvae;
				}
				switch (alt207) {
					case 1 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:21: '*'
						{
						match(input,STAR,FOLLOW_STAR_in_synpred202_Java5801); if (state.failed) return;
						}
						break;
					case 2 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:25: 
						{
						}
						break;
					case 3 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:26: '/'
						{
						match(input,SLASH,FOLLOW_SLASH_in_synpred202_Java5804); if (state.failed) return;
						}
						break;
					case 4 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:30: 
						{
						}
						break;
					case 5 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:31: '+'
						{
						match(input,PLUS,FOLLOW_PLUS_in_synpred202_Java5807); if (state.failed) return;
						}
						break;
					case 6 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:35: 
						{
						}
						break;
					case 7 :
						// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:657:36: '-'
						{
						match(input,SUB,FOLLOW_SUB_in_synpred202_Java5810); if (state.failed) return;
						}
						break;

				}

				}
				break;

			default :
				break loop208;
			}
		}

		pushFollow(FOLLOW_function_call_in_synpred202_Java5815);
		function_call();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred202_Java

	// $ANTLR start synpred203_Java
	public final void synpred203_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:658:6: ()
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:658:6: 
		{
		}

	}
	// $ANTLR end synpred203_Java

	// $ANTLR start synpred243_Java
	public final void synpred243_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:775:9: ( castExpression )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:775:9: castExpression
		{
		pushFollow(FOLLOW_castExpression_in_synpred243_Java6940);
		castExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred243_Java

	// $ANTLR start synpred247_Java
	public final void synpred247_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:784:9: ( '(' primitiveType ')' unaryExpression )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:784:9: '(' primitiveType ')' unaryExpression
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred247_Java7030); if (state.failed) return;
		pushFollow(FOLLOW_primitiveType_in_synpred247_Java7032);
		primitiveType();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred247_Java7034); if (state.failed) return;
		pushFollow(FOLLOW_unaryExpression_in_synpred247_Java7036);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred247_Java

	// $ANTLR start synpred249_Java
	public final void synpred249_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:793:10: ( '.' IDENTIFIER )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:793:10: '.' IDENTIFIER
		{
		match(input,DOT,FOLLOW_DOT_in_synpred249_Java7105); if (state.failed) return;
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred249_Java7107); if (state.failed) return;
		}

	}
	// $ANTLR end synpred249_Java

	// $ANTLR start synpred250_Java
	public final void synpred250_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:795:10: ( identifierSuffix )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:795:10: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred250_Java7129);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred250_Java

	// $ANTLR start synpred252_Java
	public final void synpred252_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:798:10: ( '.' IDENTIFIER )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:798:10: '.' IDENTIFIER
		{
		match(input,DOT,FOLLOW_DOT_in_synpred252_Java7161); if (state.failed) return;
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred252_Java7163); if (state.failed) return;
		}

	}
	// $ANTLR end synpred252_Java

	// $ANTLR start synpred253_Java
	public final void synpred253_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:800:10: ( identifierSuffix )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:800:10: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred253_Java7185);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred253_Java

	// $ANTLR start synpred265_Java
	public final void synpred265_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:825:10: ( '[' expression ']' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:825:10: '[' expression ']'
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred265_Java7433); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred265_Java7435);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred265_Java7437); if (state.failed) return;
		}

	}
	// $ANTLR end synpred265_Java

	// $ANTLR start synpred277_Java
	public final void synpred277_Java_fragment() throws RecognitionException {
		ParserRuleReturnScope et =null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:846:9: ( 'new' nonWildcardTypeArguments et= type classCreatorRest )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:846:9: 'new' nonWildcardTypeArguments et= type classCreatorRest
		{
		match(input,NEW,FOLLOW_NEW_in_synpred277_Java7644); if (state.failed) return;
		pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred277_Java7646);
		nonWildcardTypeArguments();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred277_Java7650);
		et=type();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_classCreatorRest_in_synpred277_Java7652);
		classCreatorRest();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred277_Java

	// $ANTLR start synpred278_Java
	public final void synpred278_Java_fragment() throws RecognitionException {
		ParserRuleReturnScope et =null;

		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:847:9: ( 'new' et= type classCreatorRest )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:847:9: 'new' et= type classCreatorRest
		{
		match(input,NEW,FOLLOW_NEW_in_synpred278_Java7663); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred278_Java7667);
		et=type();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_classCreatorRest_in_synpred278_Java7669);
		classCreatorRest();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred278_Java

	// $ANTLR start synpred280_Java
	public final void synpred280_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:852:9: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:852:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
		{
		match(input,NEW,FOLLOW_NEW_in_synpred280_Java7704); if (state.failed) return;
		pushFollow(FOLLOW_createdName_in_synpred280_Java7706);
		createdName();
		state._fsp--;
		if (state.failed) return;
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred280_Java7716); if (state.failed) return;
		match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred280_Java7718); if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:854:9: ( '[' ']' )*
		loop217:
		while (true) {
			int alt217=2;
			int LA217_0 = input.LA(1);
			if ( (LA217_0==LBRACKET) ) {
				alt217=1;
			}

			switch (alt217) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:854:10: '[' ']'
				{
				match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred280_Java7729); if (state.failed) return;
				match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred280_Java7731); if (state.failed) return;
				}
				break;

			default :
				break loop217;
			}
		}

		pushFollow(FOLLOW_arrayInitializer_in_synpred280_Java7752);
		arrayInitializer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred280_Java

	// $ANTLR start synpred281_Java
	public final void synpred281_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:860:13: ( '[' expression ']' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:860:13: '[' expression ']'
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred281_Java7800); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred281_Java7802);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred281_Java7816); if (state.failed) return;
		}

	}
	// $ANTLR end synpred281_Java

	// $ANTLR start synpred282_Java
	public final void synpred282_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:863:10: ( '[' ']' )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:863:10: '[' ']'
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred282_Java7838); if (state.failed) return;
		match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred282_Java7840); if (state.failed) return;
		}

	}
	// $ANTLR end synpred282_Java

	// $ANTLR start synpred284_Java
	public final void synpred284_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:873:18: ( ',' variableInitializer )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:873:18: ',' variableInitializer
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred284_Java7934); if (state.failed) return;
		pushFollow(FOLLOW_variableInitializer_in_synpred284_Java7936);
		variableInitializer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred284_Java

	// $ANTLR start synpred285_Java
	public final void synpred285_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:872:14: ( variableInitializer ( ',' variableInitializer )* )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:872:14: variableInitializer ( ',' variableInitializer )*
		{
		pushFollow(FOLLOW_variableInitializer_in_synpred285_Java7915);
		variableInitializer();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:873:17: ( ',' variableInitializer )*
		loop218:
		while (true) {
			int alt218=2;
			int LA218_0 = input.LA(1);
			if ( (LA218_0==COMMA) ) {
				alt218=1;
			}

			switch (alt218) {
			case 1 :
				// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:873:18: ',' variableInitializer
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred285_Java7934); if (state.failed) return;
				pushFollow(FOLLOW_variableInitializer_in_synpred285_Java7936);
				variableInitializer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop218;
			}
		}

		}

	}
	// $ANTLR end synpred285_Java

	// $ANTLR start synpred291_Java
	public final void synpred291_Java_fragment() throws RecognitionException {
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:902:14: ( expressionList )
		// C:\\Users\\Owner\\Desktop\\CSULB\\CECS 547\\OOPIES\\src\\Java.g:902:14: expressionList
		{
		pushFollow(FOLLOW_expressionList_in_synpred291_Java8221);
		expressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred291_Java

	// Delegated rules

	public final boolean synpred278_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred278_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred139_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred139_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred172_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred172_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred178_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred178_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred194_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred194_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred247_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred247_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred277_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred277_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred108_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred108_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred202_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred202_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred282_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred282_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred149_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred149_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred285_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred285_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred140_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred140_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred135_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred135_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred138_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred138_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred176_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred176_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred291_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred291_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred173_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred173_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred280_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred280_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred103_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred168_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred168_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred198_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred198_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred253_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred253_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred179_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred179_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred187_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred250_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred250_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred167_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred167_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred128_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred128_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred136_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred136_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred130_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred130_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred183_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred183_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred252_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred252_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred152_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred152_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred189_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred189_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred160_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred160_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred104_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred104_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred185_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred185_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred107_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred107_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred243_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred243_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred249_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred249_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred177_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred177_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred193_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred193_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred112_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred112_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred265_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred265_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred196_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred196_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred191_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred191_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred131_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred131_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred180_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred180_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred137_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred137_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred203_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred203_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred284_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred284_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred281_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred281_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred129_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred129_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred200_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred126_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred134_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred134_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_Java() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred142_Java_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA157 dfa157 = new DFA157(this);
	static final String DFA157_eotS =
		"\17\uffff";
	static final String DFA157_eofS =
		"\4\uffff\1\5\11\uffff\1\5";
	static final String DFA157_minS =
		"\1\37\1\11\1\uffff\1\27\1\5\6\uffff\1\27\1\11\1\uffff\1\5";
	static final String DFA157_maxS =
		"\1\106\1\171\1\uffff\1\154\1\147\6\uffff\1\154\1\171\1\uffff\1\147";
	static final String DFA157_acceptS =
		"\2\uffff\1\3\2\uffff\1\2\1\4\1\6\1\7\1\10\1\5\2\uffff\1\1\1\uffff";
	static final String DFA157_specialS =
		"\17\uffff}>";
	static final String[] DFA157_transitionS = {
			"\1\3\42\uffff\1\1\3\uffff\1\2",
			"\1\5\4\uffff\1\5\1\uffff\1\5\4\uffff\2\5\11\uffff\2\5\11\uffff\1\5\2"+
			"\uffff\2\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\6\uffff\3\5\4\uffff\2"+
			"\5\4\uffff\1\5\1\uffff\1\5\5\uffff\1\4\3\uffff\1\5\6\uffff\2\5\1\uffff"+
			"\2\5\3\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5",
			"",
			"\1\6\57\uffff\1\12\3\uffff\1\11\34\uffff\1\10\3\uffff\1\7",
			"\3\5\2\uffff\4\5\3\uffff\2\5\5\uffff\2\5\5\uffff\1\13\6\uffff\2\5\13"+
			"\uffff\1\5\6\uffff\1\5\7\uffff\1\14\4\uffff\1\5\7\uffff\5\5\3\uffff\3"+
			"\5\1\uffff\2\5\1\uffff\4\5\3\uffff\3\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\15\36\uffff\1\5\20\uffff\1\5\3\uffff\1\5\34\uffff\1\5\3\uffff\1\5",
			"\1\5\4\uffff\1\5\1\uffff\1\5\4\uffff\2\5\11\uffff\2\5\11\uffff\1\5\2"+
			"\uffff\2\5\6\uffff\1\5\4\uffff\1\5\1\uffff\1\5\6\uffff\3\5\4\uffff\2"+
			"\5\4\uffff\1\5\1\uffff\1\5\5\uffff\1\16\3\uffff\1\5\6\uffff\2\5\1\uffff"+
			"\2\5\3\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5",
			"",
			"\3\5\2\uffff\4\5\3\uffff\2\5\5\uffff\2\5\5\uffff\1\13\6\uffff\2\5\13"+
			"\uffff\1\5\6\uffff\1\5\7\uffff\1\14\4\uffff\1\5\7\uffff\5\5\3\uffff\3"+
			"\5\1\uffff\2\5\1\uffff\4\5\3\uffff\3\5"
	};

	static final short[] DFA157_eot = DFA.unpackEncodedString(DFA157_eotS);
	static final short[] DFA157_eof = DFA.unpackEncodedString(DFA157_eofS);
	static final char[] DFA157_min = DFA.unpackEncodedStringToUnsignedChars(DFA157_minS);
	static final char[] DFA157_max = DFA.unpackEncodedStringToUnsignedChars(DFA157_maxS);
	static final short[] DFA157_accept = DFA.unpackEncodedString(DFA157_acceptS);
	static final short[] DFA157_special = DFA.unpackEncodedString(DFA157_specialS);
	static final short[][] DFA157_transition;

	static {
		int numStates = DFA157_transitionS.length;
		DFA157_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA157_transition[i] = DFA.unpackEncodedString(DFA157_transitionS[i]);
		}
	}

	protected class DFA157 extends DFA {

		public DFA157(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 157;
			this.eot = DFA157_eot;
			this.eof = DFA157_eof;
			this.min = DFA157_min;
			this.max = DFA157_max;
			this.accept = DFA157_accept;
			this.special = DFA157_special;
			this.transition = DFA157_transition;
		}
		@Override
		public String getDescription() {
			return "821:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator );";
		}
	}

	public static final BitSet FOLLOW_annotations_in_compilationUnit80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit109 = new BitSet(new long[]{0x1200102000800012L,0x0011040C10700600L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit131 = new BitSet(new long[]{0x1200102000800012L,0x0011040C10700600L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit153 = new BitSet(new long[]{0x1000102000800012L,0x0011040C10700600L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration183 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration185 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_packageDeclaration195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importDeclaration215 = new BitSet(new long[]{0x0040000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_STATIC_in_importDeclaration227 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration248 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration250 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_STAR_in_importDeclaration252 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_importDeclaration262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importDeclaration279 = new BitSet(new long[]{0x0040000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_STATIC_in_importDeclaration291 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration312 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration323 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration325 = new BitSet(new long[]{0x0000000080000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration347 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_STAR_in_importDeclaration349 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_importDeclaration370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedImportName389 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedImportName400 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedImportName402 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_typeDeclaration442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_modifiers511 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_PUBLIC_in_modifiers523 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_PROTECTED_in_modifiers535 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_PRIVATE_in_modifiers547 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_STATIC_in_modifiers559 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_ABSTRACT_in_modifiers571 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_FINAL_in_modifiers583 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_NATIVE_in_modifiers596 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_modifiers608 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_TRANSIENT_in_modifiers620 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_VOLATILE_in_modifiers632 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_STRICTFP_in_modifiers644 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
	public static final BitSet FOLLOW_FINAL_in_variableModifiers682 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_annotation_in_variableModifiers698 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_normalClassDeclaration764 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_CLASS_in_normalClassDeclaration767 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_normalClassDeclaration769 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000082L});
	public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration782 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_normalClassDeclaration804 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_normalClassDeclaration806 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_normalClassDeclaration830 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_typeList_in_normalClassDeclaration832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_classBody_in_normalClassDeclaration867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_typeParameters890 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters908 = new BitSet(new long[]{0x0008000002000000L});
	public static final BitSet FOLLOW_COMMA_in_typeParameters926 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters930 = new BitSet(new long[]{0x0008000002000000L});
	public static final BitSet FOLLOW_GT_in_typeParameters961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_typeParameter983 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_typeParameter996 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_typeBound_in_typeParameter998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeBound1028 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_typeBound1039 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_typeBound1041 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_modifiers_in_enumDeclaration1071 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ENUM_in_enumDeclaration1084 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enumDeclaration1105 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_enumDeclaration1116 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_typeList_in_enumDeclaration1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_enumBody1163 = new BitSet(new long[]{0x0040000002000000L,0x0000000011000200L});
	public static final BitSet FOLLOW_enumConstants_in_enumBody1174 = new BitSet(new long[]{0x0000000002000000L,0x0000000011000000L});
	public static final BitSet FOLLOW_COMMA_in_enumBody1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000011000000L});
	public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACE_in_enumBody1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants1250 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_enumConstants1261 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants1263 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_annotations_in_enumConstant1296 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enumConstant1317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000042L});
	public static final BitSet FOLLOW_arguments_in_enumConstant1328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_classBody_in_enumConstant1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_enumBodyDeclarations1390 = new BitSet(new long[]{0x1840502100A14012L,0x0019040C30700692L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1402 = new BitSet(new long[]{0x1840502100A14012L,0x0019040C30700692L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_normalInterfaceDeclaration1466 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_INTERFACE_in_normalInterfaceDeclaration1468 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1470 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000082L});
	public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration1481 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_normalInterfaceDeclaration1503 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration1505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList1545 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_typeList1556 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_typeList1558 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LBRACE_in_classBody1588 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700692L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_classBody1600 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700692L});
	public static final BitSet FOLLOW_RBRACE_in_classBody1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_interfaceBody1641 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700690L});
	public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody1653 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700690L});
	public static final BitSet FOLLOW_RBRACE_in_interfaceBody1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_classBodyDeclaration1694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_classBodyDeclaration1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_classBodyDeclaration1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDeclaration_in_memberDecl1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_memberDecl1772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_memberDecl1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_methodDeclaration1836 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_typeParameters_in_methodDeclaration1849 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1886 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L});
	public static final BitSet FOLLOW_THROWS_in_methodDeclaration1899 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration1901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_methodDeclaration1922 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1EF2L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_methodDeclaration1934 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1E72L});
	public static final BitSet FOLLOW_blockStatement_in_methodDeclaration1956 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1E72L});
	public static final BitSet FOLLOW_RBRACE_in_methodDeclaration1978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_methodDeclaration1990 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
	public static final BitSet FOLLOW_typeParameters_in_methodDeclaration2003 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
	public static final BitSet FOLLOW_type_in_methodDeclaration2027 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_VOID_in_methodDeclaration2044 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration2080 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000006L});
	public static final BitSet FOLLOW_LBRACKET_in_methodDeclaration2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_methodDeclaration2096 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000006L});
	public static final BitSet FOLLOW_THROWS_in_methodDeclaration2118 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2120 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000002L});
	public static final BitSet FOLLOW_block_in_methodDeclaration2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_methodDeclaration2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_fieldDeclaration2226 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_fieldDeclaration2239 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2255 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_fieldDeclaration2268 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2272 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_fieldDeclaration2300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclarator2325 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_variableDeclarator2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_variableDeclarator2340 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_EQ_in_variableDeclarator2362 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1872L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator2364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_interfaceBodyDeclaration2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_interfaceBodyDeclaration2442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceMethodDeclaration2461 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
	public static final BitSet FOLLOW_typeParameters_in_interfaceMethodDeclaration2472 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
	public static final BitSet FOLLOW_type_in_interfaceMethodDeclaration2494 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_VOID_in_interfaceMethodDeclaration2505 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2535 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000004L});
	public static final BitSet FOLLOW_LBRACKET_in_interfaceMethodDeclaration2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_interfaceMethodDeclaration2548 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000004L});
	public static final BitSet FOLLOW_THROWS_in_interfaceMethodDeclaration2570 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_interfaceMethodDeclaration2585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceFieldDeclaration2606 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_interfaceFieldDeclaration2608 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2610 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_interfaceFieldDeclaration2621 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2623 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_interfaceFieldDeclaration2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_type2667 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_type2680 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_type2682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_primitiveType_in_type2703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_type2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_type2723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType2766 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2782 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_DOT_in_classOrInterfaceType2809 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType2811 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2826 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_primitiveType2878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_primitiveType2890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_in_primitiveType2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_primitiveType2916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primitiveType2929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_primitiveType2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_primitiveType2955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_primitiveType2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_typeArguments2998 = new BitSet(new long[]{0x0840400100214000L,0x0000000020800010L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments3002 = new BitSet(new long[]{0x0008000002000000L});
	public static final BitSet FOLLOW_COMMA_in_typeArguments3015 = new BitSet(new long[]{0x0840400100214000L,0x0000000020800010L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments3019 = new BitSet(new long[]{0x0008000002000000L});
	public static final BitSet FOLLOW_GT_in_typeArguments3043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeArgument3068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUES_in_typeArgument3080 = new BitSet(new long[]{0x0000010000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_set_in_typeArgument3104 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_typeArgument3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3178 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_qualifiedNameList3189 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3191 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_formalParameters3225 = new BitSet(new long[]{0x0840500100214000L,0x0000000028000210L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters3238 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_formalParameters3262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_functionParameters3284 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_functionParameters3289 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters3292 = new BitSet(new long[]{0x2040000002000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_functionParameters3297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_functionParameters3302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_functionParameters3309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noParameters_in_functionParameters3315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3361 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3374 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
	public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3378 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3406 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3418 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
	public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_normalParameterDecl3467 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_normalParameterDecl3469 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_normalParameterDecl3471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_normalParameterDecl3484 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_normalParameterDecl3486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_variableModifiers_in_ellipsisParameterDecl3520 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_ellipsisParameterDecl3530 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3533 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3563 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
	public static final BitSet FOLLOW_set_in_explicitConstructorInvocation3589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3621 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation3633 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_DOT_in_explicitConstructorInvocation3644 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000080L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3655 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation3676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3686 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName3707 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedName3718 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName3720 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_annotation_in_annotations3751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_MONKEYS_AT_in_annotation3782 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedName_in_annotation3784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_annotation3798 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1A72L});
	public static final BitSet FOLLOW_elementValuePairs_in_annotation3825 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_elementValue_in_annotation3849 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation3885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3916 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_elementValuePairs3927 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3929 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_elementValuePair3959 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EQ_in_elementValuePair3961 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
	public static final BitSet FOLLOW_elementValue_in_elementValuePair3963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_elementValue3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_elementValue3992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue4002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_elementValueArrayInitializer4021 = new BitSet(new long[]{0x2840C80302614200L,0x000A91B0210A1A72L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4032 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4047 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4049 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4078 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACE_in_elementValueArrayInitializer4082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationTypeDeclaration4103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4105 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_INTERFACE_in_annotationTypeDeclaration4115 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_annotationTypeBody4154 = new BitSet(new long[]{0x1840502100A14010L,0x0011040C31700610L});
	public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4166 = new BitSet(new long[]{0x1840502100A14010L,0x0011040C31700610L});
	public static final BitSet FOLLOW_RBRACE_in_annotationTypeBody4188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_annotationTypeElementDeclaration4269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationMethodDeclaration4288 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_annotationMethodDeclaration4290 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_annotationMethodDeclaration4302 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotationMethodDeclaration4304 = new BitSet(new long[]{0x0000000020000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_DEFAULT_in_annotationMethodDeclaration4307 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
	public static final BitSet FOLLOW_elementValue_in_annotationMethodDeclaration4309 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_annotationMethodDeclaration4338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_block4361 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1E72L});
	public static final BitSet FOLLOW_blockStatement_in_block4372 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1E72L});
	public static final BitSet FOLLOW_RBRACE_in_block4393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement4414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_statement_in_blockStatement4426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement4436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement4446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_function_statement4466 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_function_statement4468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_system_call4485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_system_call4487 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_system_call4489 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_system_call4491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_system_call4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_system_call4504 = new BitSet(new long[]{0x0040000000000000L,0x0300000008000000L});
	public static final BitSet FOLLOW_function_call_in_system_call4506 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_system_call4508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_system_call4518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_system_call4520 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_system_call4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_system_call4524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_multiple_calls4543 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_multiple_calls4547 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_call4567 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_multiple_calls_in_function_call4569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_function_call4571 = new BitSet(new long[]{0x2840C80302614000L,0x000A111028001870L});
	public static final BitSet FOLLOW_functionParameters_in_function_call4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_call4575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_function_call4586 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_121_in_function_call4591 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_call4596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_function_call4598 = new BitSet(new long[]{0x2840C80302614000L,0x000A111028001870L});
	public static final BitSet FOLLOW_functionParameters_in_function_call4600 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_call4602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_localVariableDeclarationStatement4653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration4675 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration4677 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4691 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_localVariableDeclaration4704 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4708 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_block_in_statement4742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement4766 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_statement4786 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_statement4789 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_statement4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement4795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement4805 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_statement4808 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_statement4811 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_statement4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement4817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement4839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parExpression_in_statement4841 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_statement4843 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_ELSE_in_statement4846 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_statement4848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatement_in_statement4870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement4880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parExpression_in_statement4882 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_statement4884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_statement4894 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_statement4896 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_WHILE_in_statement4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parExpression_in_statement4900 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement4902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trystatement_in_statement4912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement4922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parExpression_in_statement4924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_statement4926 = new BitSet(new long[]{0x0000000020080000L,0x0000000001000000L});
	public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement4928 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACE_in_statement4930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_statement4940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parExpression_in_statement4942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement4944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement4954 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0300A1870L});
	public static final BitSet FOLLOW_expression_in_statement4957 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement4962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_statement4972 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_statement4974 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement4976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement4986 = new BitSet(new long[]{0x0040000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement5001 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement5018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_statement5028 = new BitSet(new long[]{0x0040000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement5043 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement5060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement5070 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_statement5073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement5088 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_statement5090 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_statement5092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_statement5102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5122 = new BitSet(new long[]{0x0000000020080002L});
	public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup5150 = new BitSet(new long[]{0x38C1D82350E1C312L,0x03BFB7BC347A1E72L});
	public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup5161 = new BitSet(new long[]{0x38C1D82350E1C312L,0x03BFB7BC347A1E72L});
	public static final BitSet FOLLOW_CASE_in_switchLabel5191 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_switchLabel5193 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_switchLabel5195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_switchLabel5205 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_switchLabel5207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_trystatement5226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_trystatement5228 = new BitSet(new long[]{0x0000200000100000L});
	public static final BitSet FOLLOW_catches_in_trystatement5242 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_FINALLY_in_trystatement5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_trystatement5246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_trystatement5260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINALLY_in_trystatement5274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_trystatement5276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches5306 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_catchClause_in_catches5317 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_CATCH_in_catchClause5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_catchClause5349 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
	public static final BitSet FOLLOW_formalParameter_in_catchClause5351 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClause5361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_catchClause5363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameter5383 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_formalParameter5385 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formalParameter5387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_formalParameter5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_formalParameter5400 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_FOR_in_forstatement5448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_forstatement5450 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
	public static final BitSet FOLLOW_variableModifiers_in_forstatement5452 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_forstatement5454 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_forstatement5456 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_forstatement5458 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_forstatement5469 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_forstatement5471 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_forstatement5473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forstatement5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_forstatement5507 = new BitSet(new long[]{0x2840D80300614200L,0x038A91B0300A1A70L});
	public static final BitSet FOLLOW_forInit_in_forstatement5527 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_forstatement5548 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0300A1870L});
	public static final BitSet FOLLOW_expression_in_forstatement5568 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_forstatement5589 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0280A1870L});
	public static final BitSet FOLLOW_expressionList_in_forstatement5609 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_forstatement5630 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_forstatement5632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit5651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit5661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parExpression5680 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_parExpression5682 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_parExpression5684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList5703 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_expressionList5714 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_expressionList5716 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_function_call_in_expression5751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_system_call_in_expression5760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression5770 = new BitSet(new long[]{0x0040000000000000L,0x0300002140020000L});
	public static final BitSet FOLLOW_STAR_in_expression5773 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SLASH_in_expression5776 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_PLUS_in_expression5779 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SUB_in_expression5782 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_function_call_in_expression5787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_expression5798 = new BitSet(new long[]{0x2040000000000000L,0x0300002140020000L});
	public static final BitSet FOLLOW_STAR_in_expression5801 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SLASH_in_expression5804 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_PLUS_in_expression5807 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SUB_in_expression5810 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_function_call_in_expression5815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expression5826 = new BitSet(new long[]{0x0008004000042082L,0x0000004280050080L});
	public static final BitSet FOLLOW_assignmentOperator_in_expression5829 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_expression5831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignmentOperator5858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUSEQ_in_assignmentOperator5868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBEQ_in_assignmentOperator5878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAREQ_in_assignmentOperator5888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLASHEQ_in_assignmentOperator5898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMPEQ_in_assignmentOperator5908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BAREQ_in_assignmentOperator5918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARETEQ_in_assignmentOperator5928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERCENTEQ_in_assignmentOperator5938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_assignmentOperator5949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LT_in_assignmentOperator5951 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EQ_in_assignmentOperator5953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator5964 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator5966 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator5968 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EQ_in_assignmentOperator5970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator5981 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator5983 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EQ_in_assignmentOperator5985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression6004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_QUES_in_conditionalExpression6015 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6017 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpression6019 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression6021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6051 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_BARBAR_in_conditionalOrExpression6062 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6064 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6094 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AMPAMP_in_conditionalAndExpression6105 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6107 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6137 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BAR_in_inclusiveOrExpression6148 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6150 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6180 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_CARET_in_exclusiveOrExpression6191 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6193 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression6223 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_andExpression6234 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression6236 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6266 = new BitSet(new long[]{0x0000008000000402L});
	public static final BitSet FOLLOW_set_in_equalityExpression6293 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6343 = new BitSet(new long[]{0x0000008000000402L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression6373 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression6384 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression6386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6416 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression6427 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6429 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_LT_in_relationalOp6460 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EQ_in_relationalOp6462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_relationalOp6473 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_EQ_in_relationalOp6475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_relationalOp6485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_relationalOp6495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6514 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression6525 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6527 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_LT_in_shiftOp6558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LT_in_shiftOp6560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_shiftOp6571 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_shiftOp6573 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_shiftOp6575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_shiftOp6586 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_shiftOp6588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6607 = new BitSet(new long[]{0x0000000000000002L,0x0000002000020000L});
	public static final BitSet FOLLOW_set_in_additiveExpression6634 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6684 = new BitSet(new long[]{0x0000000000000002L,0x0000002000020000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6721 = new BitSet(new long[]{0x0000000000000002L,0x0000000140008000L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression6748 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6816 = new BitSet(new long[]{0x0000000000000002L,0x0000000140008000L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression6848 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_unaryExpression6861 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUSPLUS_in_unaryExpression6873 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBSUB_in_unaryExpression6885 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression6897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TILDE_in_unaryExpressionNotPlusMinus6916 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_unaryExpressionNotPlusMinus6928 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus6940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus6950 = new BitSet(new long[]{0x0000000080000002L,0x0000008000080004L});
	public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus6961 = new BitSet(new long[]{0x0000000080000002L,0x0000008000080004L});
	public static final BitSet FOLLOW_LPAREN_in_castExpression7030 = new BitSet(new long[]{0x0800400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression7032 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_castExpression7034 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_castExpression7036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_castExpression7046 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_castExpression7048 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_castExpression7050 = new BitSet(new long[]{0x2840C80300614200L,0x000A911020001870L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpression_in_primary7072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primary7094 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
	public static final BitSet FOLLOW_DOT_in_primary7105 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary7107 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary7129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary7150 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
	public static final BitSet FOLLOW_DOT_in_primary7161 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary7163 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary7185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_primary7206 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_superSuffix_in_primary7216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary7226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_creator_in_primary7236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primary7246 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_primary7257 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_primary7259 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_primary7280 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_CLASS_in_primary7282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_primary7292 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_DOT_in_primary7294 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_CLASS_in_primary7296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix7321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_superSuffix7331 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_typeArguments_in_superSuffix7334 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_superSuffix7355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_superSuffix7366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7397 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7399 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7420 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_CLASS_in_identifierSuffix7422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7433 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_identifierSuffix7435 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix7458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7468 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_CLASS_in_identifierSuffix7470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_identifierSuffix7482 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierSuffix7484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix7486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7496 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_THIS_in_identifierSuffix7498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7508 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SUPER_in_identifierSuffix7510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix7512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_innerCreator_in_identifierSuffix7522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7542 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_selector7544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_selector7555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7576 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_THIS_in_selector7578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7588 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SUPER_in_selector7590 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_superSuffix_in_selector7600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_innerCreator_in_selector7610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_selector7620 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_selector7622 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_selector7624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_creator7644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator7646 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_creator7650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator7652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_creator7663 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_creator7667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator7669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayCreator_in_creator7684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_arrayCreator7704 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_createdName_in_arrayCreator7706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7716 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7729 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayCreator7752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_arrayCreator7762 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_createdName_in_arrayCreator7764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7774 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_arrayCreator7776 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7800 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_arrayCreator7802 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7838 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer7870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer7880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_arrayInitializer7899 = new BitSet(new long[]{0x2840C80302614200L,0x038A91B0210A1872L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer7915 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayInitializer7934 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1872L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer7936 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayInitializer7986 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RBRACE_in_arrayInitializer7999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_createdName8031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_createdName8041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_innerCreator8061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_NEW_in_innerCreator8063 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator8074 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_innerCreator8095 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
	public static final BitSet FOLLOW_typeArguments_in_innerCreator8106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classCreatorRest_in_innerCreator8127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_classCreatorRest8146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_classBody_in_classCreatorRest8157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_nonWildcardTypeArguments8187 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments8189 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_GT_in_nonWildcardTypeArguments8199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments8218 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0280A1870L});
	public static final BitSet FOLLOW_expressionList_in_arguments8221 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_arguments8234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_classHeader8356 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_CLASS_in_classHeader8358 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_classHeader8360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_enumHeader8380 = new BitSet(new long[]{0x0040002000000000L});
	public static final BitSet FOLLOW_set_in_enumHeader8382 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enumHeader8388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceHeader8407 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_INTERFACE_in_interfaceHeader8409 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_interfaceHeader8411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationHeader8430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_MONKEYS_AT_in_annotationHeader8432 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_INTERFACE_in_annotationHeader8434 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_annotationHeader8436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_typeHeader8455 = new BitSet(new long[]{0x1000002000800000L,0x0000000000000200L});
	public static final BitSet FOLLOW_CLASS_in_typeHeader8458 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_ENUM_in_typeHeader8460 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_MONKEYS_AT_in_typeHeader8463 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_INTERFACE_in_typeHeader8467 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_typeHeader8471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_methodHeader8490 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
	public static final BitSet FOLLOW_typeParameters_in_methodHeader8492 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
	public static final BitSet FOLLOW_type_in_methodHeader8496 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_VOID_in_methodHeader8498 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_methodHeader8502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_methodHeader8504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_fieldHeader8523 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_fieldHeader8525 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fieldHeader8527 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
	public static final BitSet FOLLOW_LBRACKET_in_fieldHeader8530 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_fieldHeader8531 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
	public static final BitSet FOLLOW_set_in_fieldHeader8535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableHeader8560 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_localVariableHeader8562 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_localVariableHeader8564 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
	public static final BitSet FOLLOW_LBRACKET_in_localVariableHeader8567 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_localVariableHeader8568 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
	public static final BitSet FOLLOW_set_in_localVariableHeader8572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_synpred2_Java80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_packageDeclaration_in_synpred2_Java109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_synpred12_Java462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_synpred27_Java733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred43_Java1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDeclaration_in_synpred52_Java1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_synpred53_Java1772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_synpred54_Java1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred57_Java1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_synpred59_Java1836 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_typeParameters_in_synpred59_Java1849 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred59_Java1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_formalParameters_in_synpred59_Java1886 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L});
	public static final BitSet FOLLOW_THROWS_in_synpred59_Java1899 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_synpred59_Java1901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_synpred59_Java1922 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1EF2L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred59_Java1934 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1E72L});
	public static final BitSet FOLLOW_blockStatement_in_synpred59_Java1956 = new BitSet(new long[]{0x38C1D82350E1C310L,0x03BFB7BC357A1E72L});
	public static final BitSet FOLLOW_RBRACE_in_synpred59_Java1978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred68_Java2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_synpred69_Java2412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_synpred70_Java2422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_synpred71_Java2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred101_Java3284 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_synpred101_Java3289 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_synpred101_Java3292 = new BitSet(new long[]{0x2040000002000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred101_Java3297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_synpred101_Java3302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_synpred103_Java3309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ellipsisParameterDecl_in_synpred105_Java3349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalParameterDecl_in_synpred107_Java3361 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred107_Java3374 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
	public static final BitSet FOLLOW_normalParameterDecl_in_synpred107_Java3378 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_normalParameterDecl_in_synpred108_Java3406 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_synpred108_Java3418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred112_Java3563 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
	public static final BitSet FOLLOW_set_in_synpred112_Java3589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_synpred112_Java3621 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_synpred112_Java3623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodDeclaration_in_synpred126_Java4209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred127_Java4219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_synpred128_Java4229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred129_Java4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_synpred130_Java4249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_synpred131_Java4259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred134_Java4414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_statement_in_synpred135_Java4426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred136_Java4436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_synpred137_Java4485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_synpred137_Java4487 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_synpred137_Java4489 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred137_Java4491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_synpred139_Java4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_synpred139_Java4504 = new BitSet(new long[]{0x0040000000000000L,0x0300000008000000L});
	public static final BitSet FOLLOW_function_call_in_synpred139_Java4506 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred139_Java4508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred142_Java4567 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_multiple_calls_in_synpred142_Java4569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_synpred142_Java4571 = new BitSet(new long[]{0x2840C80302614000L,0x000A111028001870L});
	public static final BitSet FOLLOW_functionParameters_in_synpred142_Java4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred142_Java4575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_synpred149_Java4766 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred149_Java4786 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_synpred149_Java4789 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred149_Java4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_synpred149_Java4795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_synpred151_Java4805 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred151_Java4808 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_synpred151_Java4811 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred151_Java4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_synpred151_Java4817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred152_Java4846 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_synpred152_Java4848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred160_Java4957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred167_Java5070 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_synpred167_Java5073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred168_Java5088 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_synpred168_Java5090 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_synpred168_Java5092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred172_Java5242 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_FINALLY_in_synpred172_Java5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_synpred172_Java5246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred173_Java5260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_synpred176_Java5448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LPAREN_in_synpred176_Java5450 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
	public static final BitSet FOLLOW_variableModifiers_in_synpred176_Java5452 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_synpred176_Java5454 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred176_Java5456 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_synpred176_Java5458 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred176_Java5469 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred176_Java5471 = new BitSet(new long[]{0x28C1C8035061C300L,0x03AEB7B0340A1872L});
	public static final BitSet FOLLOW_statement_in_synpred176_Java5473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_synpred177_Java5527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred178_Java5568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_synpred179_Java5609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred180_Java5651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_synpred182_Java5751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_system_call_in_synpred184_Java5760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred193_Java5770 = new BitSet(new long[]{0x0040000000000000L,0x0300002140020000L});
	public static final BitSet FOLLOW_STAR_in_synpred193_Java5773 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SLASH_in_synpred193_Java5776 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_PLUS_in_synpred193_Java5779 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SUB_in_synpred193_Java5782 = new BitSet(new long[]{0x0040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_function_call_in_synpred193_Java5787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_synpred202_Java5798 = new BitSet(new long[]{0x2040000000000000L,0x0300002140020000L});
	public static final BitSet FOLLOW_STAR_in_synpred202_Java5801 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SLASH_in_synpred202_Java5804 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_PLUS_in_synpred202_Java5807 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_SUB_in_synpred202_Java5810 = new BitSet(new long[]{0x2040000000000000L,0x0300000000000000L});
	public static final BitSet FOLLOW_function_call_in_synpred202_Java5815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_synpred243_Java6940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred247_Java7030 = new BitSet(new long[]{0x0800400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_primitiveType_in_synpred247_Java7032 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred247_Java7034 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred247_Java7036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred249_Java7105 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred249_Java7107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred250_Java7129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred252_Java7161 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred252_Java7163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred253_Java7185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred265_Java7433 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred265_Java7435 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred265_Java7437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_synpred277_Java7644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred277_Java7646 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_synpred277_Java7650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classCreatorRest_in_synpred277_Java7652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_synpred278_Java7663 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_type_in_synpred278_Java7667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classCreatorRest_in_synpred278_Java7669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_synpred280_Java7704 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
	public static final BitSet FOLLOW_createdName_in_synpred280_Java7706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred280_Java7716 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred280_Java7718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred280_Java7729 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred280_Java7731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_arrayInitializer_in_synpred280_Java7752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred281_Java7800 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1870L});
	public static final BitSet FOLLOW_expression_in_synpred281_Java7802 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred281_Java7816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred282_Java7838 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred282_Java7840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred284_Java7934 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1872L});
	public static final BitSet FOLLOW_variableInitializer_in_synpred284_Java7936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableInitializer_in_synpred285_Java7915 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred285_Java7934 = new BitSet(new long[]{0x2840C80300614200L,0x038A91B0200A1872L});
	public static final BitSet FOLLOW_variableInitializer_in_synpred285_Java7936 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_expressionList_in_synpred291_Java8221 = new BitSet(new long[]{0x0000000000000002L});
}
