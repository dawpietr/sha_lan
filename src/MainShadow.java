import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.parseFloat;


public class MainShadow extends ShadowBaseVisitor <Object> {


    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("/home/shado/IdeaProjects/sha_lan/now.Shadow");
        ShadowLexer ShadowLexer = new ShadowLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(ShadowLexer);
        ShadowParser ShadowParser = new ShadowParser(commonTokenStream);

        ShadowParser.ProgramContext programContext = ShadowParser.program();
        ShadowBaseVisitor visitor = new ShadowBaseVisitor() {
            @Override
            public Object visitProgram(ShadowParser.ProgramContext ctx) {

                 System.out.println("Program");
                return visitChildren(ctx);
            }

            @Override
            public Object visitKomunikat(ShadowParser.KomunikatContext ctx) {
                visit(ctx);
                System.out.println("komunikat");
                return visitChildren(ctx);
            }

            @Override
            public Object visitUtworzeniestalej(ShadowParser.UtworzeniestalejContext ctx) {
                System.out.println("utworzeniestalej");
                return visitChildren(ctx);
            }

            @Override
            public Object visitUtworzeniezmiennej(ShadowParser.UtworzeniezmiennejContext ctx) {
                System.out.println("utworzeniezmiennej");
                return visitChildren(ctx);
            }

            @Override
            public Object visitZmianazmiennej(ShadowParser.ZmianazmiennejContext ctx) {
                System.out.println("zmianazmiennej");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniezwiekszenie(ShadowParser.WyrazeniezwiekszenieContext ctx) {
                System.out.println("wyrazeniezwiekszenie");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniezmniejszenie(ShadowParser.WyrazeniezmniejszenieContext ctx) {
                System.out.println("wyrazeniezmniejszenie");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniepotegowania(ShadowParser.WyrazeniepotegowaniaContext ctx) {
                System.out.println("wyrazeniepotegowania");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniedzielenia(ShadowParser.WyrazeniedzieleniaContext ctx) {
                System.out.println("wyrazeniedzielenia");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx) {
                System.out.println("wyrazeniefunkcja");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniedodawania(ShadowParser.WyrazeniedodawaniaContext ctx) {
                System.out.println("wyrazeniedodawania");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx) {
                System.out.println("wyrazenienawias");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazeniemnozenia(ShadowParser.WyrazeniemnozeniaContext ctx) {
                System.out.println("wyrazeniemnozenia");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx) {
                System.out.println("wyrazenieznakowe");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazenieodejmowania(ShadowParser.WyrazenieodejmowaniaContext ctx) {
                System.out.println("wyrazenieodejmowania");
                return visitChildren(ctx);
            }

            @Override
            public Object visitZapytanie_jesli(ShadowParser.Zapytanie_jesliContext ctx) {
                System.out.println("zapytaniejesli");
                return visitChildren(ctx);
            }

            @Override
            public Object visitPetla_dopoki(ShadowParser.Petla_dopokiContext ctx) {
                System.out.println("petladopoki");
                return visitChildren(ctx);
            }

            @Override
            public Object visitPetla_dla(ShadowParser.Petla_dlaContext ctx) {
                System.out.println("petladla");
                return visitChildren(ctx);
            }

            @Override
            public Object visitDeklaracja_funkcji(ShadowParser.Deklaracja_funkcjiContext ctx) {
                System.out.println("deklaracja");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWywolanie_funkcji(ShadowParser.Wywolanie_funkcjiContext ctx) {
                System.out.println("wywolanie");
                return visitChildren(ctx);
            }

            @Override
            public Object visitLewynaw(ShadowParser.LewynawContext ctx) {
                System.out.println("lewynaw");
                return visitChildren(ctx);
            }

            @Override
            public Object visitPrawynaw(ShadowParser.PrawynawContext ctx) {
                System.out.println("prawynaw");
                return visitChildren(ctx);
            }


            @Override
            public Object visit(ParseTree parseTree) {
                //visitProgram(programContext);
                /*for (int i =0; i<parseTree.getChildCount(); i++) {
                    if (!(parseTree.getChild(i).toString()).equalsIgnoreCase(";")) {
                        System.out.println(parseTree.getChild(i).toString());
                    }
                    visitChildren((RuleNode) parseTree);
                    System.out.println("!");
                }*/
                //System.out.println(parseTree.getChild(0).getText());
                //parseTree.getChildCount();
                //parseTree.getChild(0).getText();
                //String splited = parseTree.getText();
                //String[] splitedArray = null;
                //splitedArray = splited.split(";");
                //for (int i = 0 ; i < splitedArray.length ; i++) {
                //    System.out.println(splitedArray [i]);
                //    visitKomunikat(ParseTree (splitedArray [i]));
                //}

                //System.out.println(parseTree.getText());
                return visitChildren((RuleNode) parseTree);
            }

            @Override
            public Object visitChildren(RuleNode ruleNode) {

                for (int i =0; i<ruleNode.getChildCount(); i++) {
                    if (!(ruleNode.getChild(i).toString()).equalsIgnoreCase(";")) {
                        //System.out.println(ruleNode.getChild(i).toString());
                    }
                    visit(ruleNode.getChild(i));
                    System.out.println("!");
                }


                //visit(ruleNode.getChild(0));
                return ruleNode.getText();
            }

            @Override
            public Object visitTerminal(TerminalNode terminalNode) {
                System.out.println("terminal");
                return null;
            }

            @Override
            public Object visitErrorNode(ErrorNode errorNode) {
                System.out.println("error");
                return null;
            }
        };
        visitor.visit(programContext);
        System.out.println("???");
        //System.out.println(visitor.visit(programContext));
        System.out.println("???");
    }


    List<MainShadow.zmienna> zmienne = new ArrayList<MainShadow.zmienna>();
    List<stala> stale = new ArrayList<stala>();

    public class zmienna {
        String nazwa;
        String wartosc;

        public zmienna(String nazwa, String wartosc) {
            this.nazwa = nazwa;
            this.wartosc = wartosc;
        }
    }

    public class stala {
        String nazwa;
        String wartosc;

        public stala(String nazwa, String wartosc) {
            this.nazwa = nazwa;
            this.wartosc = wartosc;
        }


    }
}