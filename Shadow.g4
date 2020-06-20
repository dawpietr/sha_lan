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
            |exit
            |wypisz
            ;
exit: 'EXIT';
wypisz: 'wypisz' lewa = (ZNAKI|WYKRZYKNIK|CUDZYSLOW|PRZECINEK|KROPKA|PYTAJNIK)*;


utworzenie_stalej   : STALA lewa=wyrazenie PRZYPISANIE prawa=wyrazenie      #utworzeniestalej;
utworzenie_zmiennej : ZMIENNA lewa=wyrazenie PRZYPISANIE prawa=wyrazenie    #utworzeniezmiennej;
zmiana_zmiennej     : lewa=wyrazenie PRZYPISANIE prawa=wyrazenie            #zmianazmiennej;

wyrazenie          :lewa=wyrazenie ZNAK_MATEMATYCZNY prawa=wyrazenie            #wyrazeniematematyczne
                   |lewa=wyrazenie ZWIEKSZENIE                                  #wyrazeniezwiekszenie
                   |lewa=wyrazenie ZMNIEJSZENIE                                 #wyrazeniezmniejszenie
                   |LEWYNAW wyrazenie PRAWYNAW                                  #wyrazenienawias
                   |wywolanie_funkcji                                           #wyrazeniefunkcja
                   |ZNAK_MATEMATYCZNY prawa=wyrazenie                           #kolejnedzialanie
                   |ZNAKI                                                       #wyrazenieznakowe
                    ;
zapytanie_jesli     :JESLI LEWYNAW lewa=wyrazenie znak=(POROWNANIE|WIEKSZE|MNIEJSZE|NIEROWNE) prawa=wyrazenie PRAWYNAW komunikat;
petla_dopoki        :DOPOKI;
petla_dla           :DLA;
deklaracja_funkcji  :FUNKCJA wyrazenie PRZYPISANIE '(' (komunikat)* ')' ;
wywolanie_funkcji   :FUNKCJA wyrazenie '(' (wyrazenie)* ')';

LEWYNAW:'('|'['|'{';
PRAWYNAW:')'|'}'|']';
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
ZNAK_MATEMATYCZNY: '+'|'-'|'*'|'/'|'^' ;
BITI : '&';
BITLUB : '|';
MODULO : '%';
STRZALKA : '->';
PODWOJNYDWUKROPEK : '::';

fragment CYFRA: [0-9];
ZNAKI: [a-zA-Z0-9] ([a-zA-Z_] | LICZBY)* ;
LICZBY         :CYFRA
                |CYFRA+ ([.,] CYFRA+)? ;

BIALE_ZNAKI:  [ \t\r\n\u000C]+ -> skip;
KOMENTARZ:   '/*' .*? '*/' -> channel(HIDDEN);
LINIA_KOMENTARZA:   '//' ~[\r\n]* -> channel(HIDDEN);