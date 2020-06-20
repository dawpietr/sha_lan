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
    @Override
    public void enterProgram(ShadowParser.ProgramContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProgram(ShadowParser.ProgramContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterKomunikat(ShadowParser.KomunikatContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitKomunikat(ShadowParser.KomunikatContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExit(ShadowParser.ExitContext ctx) {
        System.out.println("Nastepuje zamkniecie aplikacji!");
        System.exit(0);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExit(ShadowParser.ExitContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWypisz(ShadowParser.WypiszContext ctx) {
        String wyraz = ctx.lewa.getText();
        if (!(Pamiec.czyIstniejeZmienne(wyraz) == -1))
            System.out.println("Zmienna " + Pamiec.zmienne.get((Pamiec.czyIstniejeZmienne(wyraz))).nazwa + " = " + Pamiec.zmienne.get((Pamiec.czyIstniejeZmienne(wyraz))).wartosc);
        if (!(Pamiec.czyIstniejeStala(wyraz) == -1))
            System.out.println("Stala " + Pamiec.stala.get((Pamiec.czyIstniejeStala(wyraz))).nazwa + " = " + Pamiec.stala.get((Pamiec.czyIstniejeStala(wyraz))).wartosc);
        if ((Pamiec.czyIstniejeZmienne(wyraz) == -1) && (Pamiec.czyIstniejeStala(wyraz) == -1)) {
            String wypisz = "";
            for (int g = 0; g < ctx.getChildCount(); g++) {
                if (!ctx.getChild(g).getText().equalsIgnoreCase("wypisz"))
                    wypisz += ctx.getChild(g).getText();
            }
            System.out.println(wypisz);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWypisz(ShadowParser.WypiszContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx) {
        Pamiec.dodajStala(ctx.lewa.getText(), ctx.prawa.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx) {
        Pamiec.dodajZmienna(ctx.lewa.getText(), ctx.prawa.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx) {
        Pamiec.zmienZmienna(ctx.lewa.getText(), ctx.prawa.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWyrazeniematematyczne(ShadowParser.WyrazeniematematyczneContext ctx) {
        String ZNAK = ctx.ZNAK_MATEMATYCZNY().getText();
        String leweWyrazenie = ctx.lewa.getText();
        String praweWyrazenie = ctx.prawa.getText();
        if (!(Pamiec.czyLiczbowa(leweWyrazenie))) {
            if (!(Pamiec.czyLiczbowa(praweWyrazenie))) {
                int j = Pamiec.czyIstniejeZmienne(leweWyrazenie);
                int k = Pamiec.czyIstniejeZmienne(praweWyrazenie);
                int l = Pamiec.czyIstniejeStala(leweWyrazenie);
                int m = Pamiec.czyIstniejeStala(praweWyrazenie);
                if (!(j == -1)) {
                    double lewa = Double.parseDouble(Pamiec.zmienne.get(j).wartosc);
                    if (!(k == -1))//lewa i prawa to zmienne
                    {
                        System.out.println("Dzialanie dla zmiennych");
                        Pamiec.wykonajDzialanie(lewa, ZNAK, Double.parseDouble(Pamiec.zmienne.get(k).wartosc));
                    }
                    if (!(m == -1))//lewa zmienna prawa stala
                    {
                        System.out.println("Dzialanie dla zmiennej i stalej");
                        Pamiec.wykonajDzialanie(lewa, ZNAK, Double.parseDouble(Pamiec.stala.get(m).wartosc));
                    }
                }
                if (!(l == -1)) {
                    double lewa = Double.parseDouble(Pamiec.stala.get(l).wartosc);
                    if (!(k == -1))//lewa stala prawa zmienna
                    {
                        System.out.println("Dzialanie dla stalej i zmiennej");
                        Pamiec.wykonajDzialanie(lewa, ZNAK, Double.parseDouble(Pamiec.zmienne.get(k).wartosc));
                    }
                    if (!(m == -1))//lewa stala prawa stala
                    {
                        System.out.println("Dzialanie dla stalych");
                        Pamiec.wykonajDzialanie(lewa, ZNAK, Double.parseDouble(Pamiec.stala.get(m).wartosc));
                    }
                }
            }
        } else {
            double lewa = Double.parseDouble(ctx.lewa.getText());
            double prawa = Double.parseDouble(ctx.prawa.getText());
            Pamiec.wykonajDzialanie(lewa, ZNAK, prawa);

        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWyrazeniematematyczne(ShadowParser.WyrazeniematematyczneContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx) {
        Pamiec.zwieksz(ctx.lewa.getText());

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx) {
        Pamiec.zmniejsz(ctx.lewa.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterKolejnedzialanie(ShadowParser.KolejnedzialanieContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitKolejnedzialanie(ShadowParser.KolejnedzialanieContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx) {
        String lewa = (ctx.lewa.getText());
        String prawa = (ctx.prawa.getText());
        String znak = (ctx.znak.getText());

        if (!Pamiec.czyPrawda(lewa, znak, prawa))
            while (ctx.komunikat().getChildCount() > 0) ctx.komunikat().removeLastChild();
        //Pamiec.wykonajPorownanie(lewa, znak, prawa);


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPetla_dopoki(ShadowParser.Petla_dopokiContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPetla_dopoki(ShadowParser.Petla_dopokiContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPetla_dla(ShadowParser.Petla_dlaContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPetla_dla(ShadowParser.Petla_dlaContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
