// Generated from ./Shadow.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShadowParser}.
 */
public interface ShadowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShadowParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ShadowParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ShadowParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#komunikat}.
	 * @param ctx the parse tree
	 */
	void enterKomunikat(ShadowParser.KomunikatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#komunikat}.
	 * @param ctx the parse tree
	 */
	void exitKomunikat(ShadowParser.KomunikatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#dzialanie_matematyczne}.
	 * @param ctx the parse tree
	 */
	void enterDzialanie_matematyczne(ShadowParser.Dzialanie_matematyczneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#dzialanie_matematyczne}.
	 * @param ctx the parse tree
	 */
	void exitDzialanie_matematyczne(ShadowParser.Dzialanie_matematyczneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code utworzeniestalej}
	 * labeled alternative in {@link ShadowParser#utworzenie_stalej}.
	 * @param ctx the parse tree
	 */
	void enterUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx);
	/**
	 * Exit a parse tree produced by the {@code utworzeniestalej}
	 * labeled alternative in {@link ShadowParser#utworzenie_stalej}.
	 * @param ctx the parse tree
	 */
	void exitUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx);
	/**
	 * Enter a parse tree produced by the {@code utworzeniezmiennej}
	 * labeled alternative in {@link ShadowParser#utworzenie_zmiennej}.
	 * @param ctx the parse tree
	 */
	void enterUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx);
	/**
	 * Exit a parse tree produced by the {@code utworzeniezmiennej}
	 * labeled alternative in {@link ShadowParser#utworzenie_zmiennej}.
	 * @param ctx the parse tree
	 */
	void exitUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zmianazmiennej}
	 * labeled alternative in {@link ShadowParser#zmiana_zmiennej}.
	 * @param ctx the parse tree
	 */
	void enterZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zmianazmiennej}
	 * labeled alternative in {@link ShadowParser#zmiana_zmiennej}.
	 * @param ctx the parse tree
	 */
	void exitZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniezwiekszenie}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniezwiekszenie}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniezmniejszenie}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniezmniejszenie}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniefunkcja}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniefunkcja}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenienawias}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenienawias}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieznakowe}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieznakowe}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#zapytanie_jesli}.
	 * @param ctx the parse tree
	 */
	void enterZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#zapytanie_jesli}.
	 * @param ctx the parse tree
	 */
	void exitZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#petla_dopoki}.
	 * @param ctx the parse tree
	 */
	void enterPetla_dopoki(ShadowParser.Petla_dopokiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#petla_dopoki}.
	 * @param ctx the parse tree
	 */
	void exitPetla_dopoki(ShadowParser.Petla_dopokiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#petla_dla}.
	 * @param ctx the parse tree
	 */
	void enterPetla_dla(ShadowParser.Petla_dlaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#petla_dla}.
	 * @param ctx the parse tree
	 */
	void exitPetla_dla(ShadowParser.Petla_dlaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#deklaracja_funkcji}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#deklaracja_funkcji}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 */
	void enterWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 */
	void exitWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#lewynaw}.
	 * @param ctx the parse tree
	 */
	void enterLewynaw(ShadowParser.LewynawContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#lewynaw}.
	 * @param ctx the parse tree
	 */
	void exitLewynaw(ShadowParser.LewynawContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#prawynaw}.
	 * @param ctx the parse tree
	 */
	void enterPrawynaw(ShadowParser.PrawynawContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#prawynaw}.
	 * @param ctx the parse tree
	 */
	void exitPrawynaw(ShadowParser.PrawynawContext ctx);
}