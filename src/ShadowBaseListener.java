// Generated from ./Shadow.g4 by ANTLR 4.8

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link ShadowListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class ShadowBaseListener implements ShadowListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(ShadowParser.ProgramContext ctx) {
		System.out.println("program");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(ShadowParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKomunikat(ShadowParser.KomunikatContext ctx) {
		System.out.println("komunikat " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKomunikat(ShadowParser.KomunikatContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDzialanie_matematyczne(ShadowParser.Dzialanie_matematyczneContext ctx) {
		double lewa = Double.parseDouble(ctx.lewa.getText());
		double prawa = Double.parseDouble(ctx.prawa.getText());
		switch(ctx.ZNAK_MATEMATYCZNY().toString())
		{
			case "+":
				System.out.println("Dodawanie " + lewa + " + " + prawa + "= " + (lewa+prawa));
				break;
			case "-":
				System.out.println("Odejmowanie " + lewa + " + " + prawa + "= " + (lewa-prawa));
				break;
			case "/":
				System.out.println("Dzielenie " + lewa + " + " + prawa + "= " + (lewa/prawa));
				break;
			case "*":
				System.out.println("Mnozenie " + lewa + " + " + prawa + "= " + (lewa*prawa));
				break;
			case "^":
				System.out.println("Potegowanie " + lewa + " + " + prawa + "= " + (Math.pow(lewa,prawa)));
				break;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDzialanie_matematyczne(ShadowParser.Dzialanie_matematyczneContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx) {

		Pamiec.dodajStala(ctx.lewa.getText(), ctx.prawa.getText());

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx) {

		Pamiec.dodajZmienna(ctx.lewa.getText(), ctx.prawa.getText());

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx) {
		System.out.println(Pamiec.zmienZmienna(ctx.lewa.getText(), ctx.prawa.getText()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPetla_dopoki(ShadowParser.Petla_dopokiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPetla_dopoki(ShadowParser.Petla_dopokiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPetla_dla(ShadowParser.Petla_dlaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPetla_dla(ShadowParser.Petla_dlaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLewynaw(ShadowParser.LewynawContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLewynaw(ShadowParser.LewynawContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrawynaw(ShadowParser.PrawynawContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrawynaw(ShadowParser.PrawynawContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}