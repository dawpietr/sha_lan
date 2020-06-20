import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class Pamiec {


    static List<zmienna> zmienne = new ArrayList<zmienna>();
    static List<stala> stala = new ArrayList<stala>();


    static void zwieksz(String nazwa) {
        int czy = czyIstniejeZmienne(nazwa);
        if (czy == -1)
            System.out.println("Nie istnieje taka zmienna");
        else if (czyLiczbowa(zmienne.get(czy).wartosc)) {
            zmienne.get(czy).wartosc = String.valueOf(Double.parseDouble(zmienne.get(czy).wartosc) + 1);
            System.out.println("W zmiennej " + zmienne.get(czy).nazwa + " zostala zmieniona wartosc na: " + zmienne.get(czy).wartosc);
        } else
            System.out.println("Wartosc nie jest liczbowa");
    }

    static void zmniejsz(String nazwa) {
        int czy = czyIstniejeZmienne(nazwa);
        if (czy == -1)
            System.out.println("Nie istnieje taka zmienna");
        else if (czyLiczbowa(zmienne.get(czy).wartosc)) {
            zmienne.get(czy).wartosc = String.valueOf(Double.parseDouble(zmienne.get(czy).wartosc) + 1);
            System.out.println("W zmiennej " + zmienne.get(czy).nazwa + " zostala zmieniona wartosc na: " + zmienne.get(czy).wartosc);
        } else
            System.out.println("Wartosc nie jest liczbowa");
    }

    static int czyIstniejeStala(String nazwa) {
        for (int h = 0; h < stala.size(); h++) {
            if (nazwa.equalsIgnoreCase(stala.get(h).nazwa))
                return (h);
        }
        return (-1);
    }

    static int czyIstniejeZmienne(String nazwa) {
        for (int h = 0; h < zmienne.size(); h++) {
            if (nazwa.equalsIgnoreCase(zmienne.get(h).nazwa))
                return (h);
        }
        return (-1);
    }

    static void dodajZmienna(String nazwa, String wartosc) {
        zmienne.add(new zmienna(nazwa, wartosc));
        System.out.println("Utworzono zmienna " + nazwa + " zawierajaca: " + wartosc);
    }

    static void zmienZmienna(String nazwa, String nowaWartosc) {
        int czyj = czyIstniejeZmienne(nazwa);
        if (czyj == -1)
            System.out.println("Nie istnieje taka zmienna");
        else {
            zmienne.get(czyj).wartosc = (zmienne.get(czyj).wartosc) = nowaWartosc;
            System.out.println("W zmiennej " + zmienne.get(czyj).nazwa + " zostala zmieniona wartosc na: " + zmienne.get(czyj).wartosc);
        }

    }

    static void dodajStala(String nazwa, String wartosc) {
        stala.add(new stala(nazwa, wartosc));
        System.out.println("Utworzono stala " + nazwa + " zawierajaca: " + wartosc);
    }

    public static boolean czyLiczbowa(String wartosc) {
        if (wartosc == null) {
            return false;
        }
        try {
            double d = parseDouble(wartosc);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    static void wykonajDzialanie(double lewa, String ZNAK, double prawa) {
        switch (ZNAK) {
            case "+":
                System.out.println("Dodawanie " + lewa + " + " + prawa + "= " + (lewa + prawa));
                break;
            case "-":
                System.out.println("Odejmowanie " + lewa + " - " + prawa + "= " + (lewa - prawa));
                break;
            case "/":
                if (prawa == 0) {
                    System.out.println("Pamietaj chol...., nie dziel przez zero!");
                    System.exit(-1);
                }
                System.out.println("Dzielenie " + lewa + " / " + prawa + "= " + (lewa / prawa));
                break;
            case "*":
                System.out.println("Mnozenie " + lewa + " * " + prawa + "= " + (lewa * prawa));
                break;
            case "^":
                System.out.println("Potegowanie " + lewa + " ^ " + prawa + "= " + (Math.pow(lewa, prawa)));
                break;
        }
    }

    static boolean czyPrawda(String lewa, String znak, String prawa) {
        int czyLewaZmienna = Pamiec.czyIstniejeZmienne(lewa);
        int czyLewaStala = Pamiec.czyIstniejeStala(lewa);
        int czyPrawaZmienna = Pamiec.czyIstniejeZmienne(prawa);
        int czyPrawaStala = Pamiec.czyIstniejeStala(prawa);


        if (!czyLiczbowa(lewa)) {
            if (!(czyLewaZmienna == -1)) {
                if (!(czyPrawaZmienna == -1) && !czyLiczbowa(prawa)) {
                    if (wykonajPorownanie(Pamiec.zmienne.get(czyLewaZmienna).wartosc, znak, Pamiec.zmienne.get(czyPrawaZmienna).wartosc))
                        return true;
                } else if (!(czyPrawaStala == -1) && !czyLiczbowa(prawa)) {
                    if (wykonajPorownanie(Pamiec.zmienne.get(czyLewaZmienna).wartosc, znak, Pamiec.stala.get(czyPrawaStala).wartosc))
                        return true;
                } else {
                    if (wykonajPorownanie(Pamiec.zmienne.get(czyLewaZmienna).wartosc, znak, prawa)) return true;
                }
            } else if (!(czyLewaStala == -1)) {
                if (!(czyPrawaZmienna == -1) && !czyLiczbowa(prawa)) {
                    if (wykonajPorownanie(Pamiec.stala.get(czyLewaStala).wartosc, znak, Pamiec.zmienne.get(czyPrawaZmienna).wartosc))
                        return true;
                } else if (!(czyPrawaStala == -1) && !czyLiczbowa(prawa)) {
                    if (wykonajPorownanie(Pamiec.stala.get(czyLewaStala).wartosc, znak, Pamiec.stala.get(czyPrawaStala).wartosc))
                        return true;
                } else {
                    if (wykonajPorownanie(Pamiec.stala.get(czyLewaStala).wartosc, znak, prawa)) return true;
                }
            }
        } else if (!(czyPrawaZmienna == -1) && !czyLiczbowa(prawa)) {
            if (wykonajPorownanie(lewa, znak, Pamiec.zmienne.get(czyPrawaZmienna).wartosc)) return true;
        } else if (!(czyPrawaStala == -1) && !czyLiczbowa(prawa)) {
            if (wykonajPorownanie(lewa, znak, Pamiec.stala.get(czyPrawaStala).wartosc)) return true;
        } else {
            if (wykonajPorownanie(lewa, znak, prawa)) return true;
        }
        return false;
    }


    static boolean wykonajPorownanie(String lewa, String znak, String prawa) {
        if (znak.equals("==")) {
            if (!lewa.equalsIgnoreCase(prawa)) return false;
        } else if (znak.equals("!=")) {
            if (lewa.equalsIgnoreCase(prawa))
                return false;
        } else if (Pamiec.czyLiczbowa(lewa) && Pamiec.czyLiczbowa(prawa)) {
            if (znak.equals("<")) {
                if (!(Double.parseDouble(lewa) < Double.parseDouble(prawa)))
                    return false;
            } else if (znak.equals(">")) {
                if (!(Double.parseDouble(lewa) > Double.parseDouble(prawa)))
                    return false;
            }
        } else if (!Pamiec.czyLiczbowa(lewa) || !Pamiec.czyLiczbowa(prawa)) {
            System.out.println("Co najmnniej jedna z danych nie jest liczbowa, nie sprawdze roznicy");
            return false;
        } else {
            System.out.println("Podano niepoprawny znak porownania");
            return false;
        }
        return true;

    }
}

class zmienna {

    String nazwa;
    String wartosc;

    public zmienna(String nazwa, String wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }
}

class stala {
    String nazwa;
    String wartosc;

    public stala(String nazwa, String wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }


}
