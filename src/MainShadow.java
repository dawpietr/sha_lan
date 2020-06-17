import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;



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
        ShadowParser.ProgramContext tree = ShadowParser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        ShadowListener listener = new ShadowBaseListener();
        //ParseTreeWalker.DEFAULT.walk(listener, tree);
        walker.walk(listener, tree);

        /*ShadowBaseVisitor visitor = new ShadowBaseVisitor() {
            @Override
            public Object visitProgram(ShadowParser.ProgramContext ctx) {

                 System.out.println("Program");
                return visitChildren(ctx);
            }

            @Override
            public Object visitKomunikat(ShadowParser.KomunikatContext ctx) {
                //visit(ctx);
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
            public Object visitWyrazeniefunkcja(ShadowParser.WyrazeniefunkcjaContext ctx) {
                System.out.println("wyrazeniefunkcja");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazenienawias(ShadowParser.WyrazenienawiasContext ctx) {
                System.out.println("wyrazenienawias");
                return visitChildren(ctx);
            }

            @Override
            public Object visitWyrazenieznakowe(ShadowParser.WyrazenieznakoweContext ctx) {
                System.out.println("wyrazenieznakowe");
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
            public Object visitDzialanie_matematyczne(ShadowParser.Dzialanie_matematyczneContext ctx) {
                double lewa = Double.parseDouble(ctx.lewa.toString());
                double prawa = Double.parseDouble(ctx.prawa.toString());
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
                return super.visitDzialanie_matematyczne(ctx);
            }


            @Override
            public Object visit(ParseTree parseTree) {
                System.out.println("parseTreeStart");
                //visitProgram(programContext);
                for (int i =0; i<parseTree.getChildCount(); i++) {
                    if (!(parseTree.getChild(i).toString()).equalsIgnoreCase(";")) {

                        //System.out.println(visit(parseTree.getChild(i)).getClass());
                        System.out.println(parseTree.getChild(i).getText());
                        visit(parseTree.getChild(i));
                        //System.out.println(parseTree.getChild(i).toString());
                        //System.out.println(parseTree.getChild(i).toStringTree());
                        //visitChildren((RuleNode) parseTree.getChild(i));
                        ;
                    }
                    System.out.println("!");
                }
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
                System.out.println("parseTreeEnd");
                return null;
            }

            @Override
            public Object visitChildren(RuleNode ruleNode) {
                System.out.println("visitChildrenStart");

                System.out.println(ruleNode.getText());
                    visit(ruleNode);
                    //System.out.println(ruleNode.getRuleContext().getText());
                    //System.out.println(ruleNode.getRuleContext().getChild(0).toString());
                    //System.out.println(ruleNode.getRuleContext().getChild(1).getText());
                    //for (int i =0; i<ruleNode.getChildCount(); i++) {
                    //   if (!(ruleNode.getChild(i).toString()).equalsIgnoreCase(";")) {
                    //       //System.out.println(ruleNode.getChild(i).toString());
                    //    }
                    //     visitProgram(programContext.(ruleNode.getChild(i)));
                    //     System.out.println("!");
                    // }


                    //visit(ruleNode.getChild(0));
                    System.out.println("visitChildrenEnd");
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
        };*/
        //visitor.visit(context);
        //System.out.println("???");
        //System.out.println(visitor.visit(programContext));
        System.out.println("???");

    }



}