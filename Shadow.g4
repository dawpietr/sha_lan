//gramatyka zostaa wygenerowana na podstawie Java8 z ANTLR/
//gramatyka oraz jezyk wykonywany z zamyslem jezyka szkoleniowego dla dzieci uczacych sie informatyki/
grammar Shadow;


program: (komunikat SREDNIK)*;

komunikat:   wyrazenie
            |utworzenie_stalej
            |utworzenie_zmiennej
            |zmiana_zmiennej
            |zapytanie_jesli
            |petla_dopoki
            |petla_dla
            |deklaracja_funkcji
            |wywolanie_funkcji
            ;


utworzenie_stalej   : STALA lewa=wyrazenie PRZYPISANIE prawa=wyrazenie      #utworzeniestalej;
utworzenie_zmiennej : ZMIENNA lewa=wyrazenie PRZYPISANIE prawa=wyrazenie    #utworzeniezmiennej;
zmiana_zmiennej     : lewa=wyrazenie PRZYPISANIE prawa=wyrazenie            #zmianazmiennej;

wyrazenie          :lewa=wyrazenie PLUS prawa=wyrazenie             #wyrazeniedodawania
                   |lewa=wyrazenie MINUS prawa=wyrazenie            #wyrazenieodejmowania
                   |lewa=wyrazenie MNOZENIE prawa=wyrazenie         #wyrazeniemnozenia
                   |lewa=wyrazenie DZIELENIE prawa=wyrazenie        #wyrazeniedzielenia
                   |lewa=wyrazenie POTEGOWANIE prawa=wyrazenie      #wyrazeniepotegowania
                   |lewa=wyrazenie ZWIEKSZENIE                      #wyrazeniezwiekszenie
                   |lewa=wyrazenie ZMNIEJSZENIE                     #wyrazeniezmniejszenie
                   |lewynaw wyrazenie prawynaw                      #wyrazenienawias
                   |wywolanie_funkcji                               #wyrazeniefunkcja
                   |ZNAKI                                           #wyrazenieznakowe
                    ;
zapytanie_jesli     :JESLI;
petla_dopoki        :DOPOKI;
petla_dla           :DLA;
deklaracja_funkcji  :FUNKCJA wyrazenie PRZYPISANIE '(' (komunikat)* ')' ;
wywolanie_funkcji   :FUNKCJA wyrazenie '(' (wyrazenie)* ')';

lewynaw:'(''[''{';
prawynaw:')''}'']';
STALA   : 'stala';
ZMIENNA : 'zmienna';
ALBO    : 'albo';
DLA     : 'dla';
JESLI   : 'jesli';
IDZ     : 'idz';
ZWROC   : 'zwroc';
DOPOKI  : 'dopoki';
FUNKCJA : 'funkcja';

BOOLEAN :	'prawda'  |	'falsz';
NIC     :	'null';

LNAWIAS : '(';
PNAWIAS : ')';
LKLAMROWY : '{';
PKLAMROWY : '}';
LKWADRAT : '[';
PKWADRAT : ']';
CUDZYSLOW: '"';
SREDNIK : ';';
PRZECINEK : ',';
KROPKA : '.';
PRZYPISANIE : '=';
WIEKSZE : '>';
MNIEJSZE : '<';
WYKRZYKNIK : '!';
PYTAJNIK : '?';
DWUKROPEK : ':';
POROWNANIE : '==';
NIEROWNE : '!=';
I : '&&';
LUB : '||';
ZWIEKSZENIE : '++';
ZMNIEJSZENIE : '--';
PLUS: '+';
MINUS : '-';
MNOZENIE : '*';
DZIELENIE : '/';
POTEGOWANIE: '^';
BITI : '&';
BITLUB : '|';
MODULO : '%';
STRZALKA : '->';
PODWOJNYDWUKROPEK : '::';

fragment CYFRY: [0-9]+;
ZNAKI: [a-zA-Z0-9] ([a-zA-Z_] | LICZBY)* ;
LICZBY         : CYFRY+ ([.,] CYFRY+)? ;

BIALE_ZNAKI:  [ \t\r\n\u000C]+ -> skip;
KOMENTARZ:   '/*' .*? '*/' -> channel(HIDDEN);
LINIA_KOMENTARZA:   '//' ~[\r\n]* -> channel(HIDDEN);