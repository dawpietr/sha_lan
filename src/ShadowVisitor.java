// Generated from ./Shadow.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShadowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShadowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShadowParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ShadowParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#komunikat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomunikat(ShadowParser.KomunikatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#dzialanie_matematyczne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDzialanie_matematyczne(ShadowParser.Dzialanie_matematyczneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code utworzeniestalej}
	 * labeled alternative in {@link ShadowParser#utworzenie_stalej}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx);
	/**
	 * Visit a parse tree produced by the {@code utworzeniezmiennej}
	 * labeled alternative in {@link ShadowParser#utworzenie_zmiennej}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zmianazmiennej}
	 * labeled alternative in {@link ShadowParser#zmiana_zmiennej}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniezwiekszenie}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniezmniejszenie}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniefunkcja}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenienawias}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieznakowe}
	 * labeled alternative in {@link ShadowParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#zapytanie_jesli}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#petla_dopoki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPetla_dopoki(ShadowParser.Petla_dopokiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#petla_dla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPetla_dla(ShadowParser.Petla_dlaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#deklaracja_funkcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#lewynaw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLewynaw(ShadowParser.LewynawContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowParser#prawynaw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrawynaw(ShadowParser.PrawynawContext ctx);
}