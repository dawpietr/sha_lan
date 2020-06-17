import java.util.ArrayList;
import java.util.List;

public class Pamiec {



    static List<zmienna> zmienne = new ArrayList<zmienna>();
    static List<stala> stala = new ArrayList<stala>();



    static void dodajZmienna(String nazwa, String wartosc) {
        zmienne.add(new zmienna(nazwa, wartosc));
        System.out.println("Utworzono zmienna " + nazwa + " zawierajaca: " + wartosc);
    }

    static String zmienZmienna (String nazwa, String wartosc) {
        if (stala.contains(nazwa))
            return ("Istnieje stala o tej nazwie, modyfikacje niedopuszczalne");
        if (!(zmienne.contains(nazwa)))
            return ("Nie istnieje zmienna o tej nazwie");
        else
         {
             zmienne.set(zmienne.indexOf(nazwa), new zmienna(nazwa, wartosc));
            return ("Istnieje stala o tej nazwie, modyfikacje niedopuszczalne");
        }

    }

    static void dodajStala(String nazwa, String wartosc) {
        stala.add(new stala(nazwa, wartosc));
        System.out.println("Utworzono stala " + nazwa + " zawierajaca: " + wartosc);
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
