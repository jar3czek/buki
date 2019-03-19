Specyfikacja systemu informatycznego “Buki”
===========================================

Opis sytuacyjny
---------------

Klient prowadzi stacjonarny zakład bukmacherski. Biznes okazał się strzałem w dziesiątkę i podejmuje decyzję, że chce uruchomić portal internetowy “Buki” wraz z aplikacją mobilną aby klienci mogli grać nie tylko w stacjonarnej siedzibie firmy.

Główne wymagania systemu
------------------------

Gracz może zakupić zakład na dowolną kwotę na dowolne wydarzenie sportowe. Każde wydarzenie sportowe ma swój unikalny identyfikator. W pierwszej wersji systemu wydarzenia sportowe będą wprowadzane ręcznie bezpośrednio do bazy danych systemu przez wysoko wykwalifikowanego pracownika firmy bukmacherskiej. 

Rozliczenie działa na zasadzie prepaid, gracz ma przypisane środki (Euro Gole)  do swojego konta. Sprawdzamy ilość Euro Goli na koncie i pobieramy opłaty od graczy za wybrany zakład. Jeden wyjątek pojawia się wtedy gdy gracz nie może dokonać płatności - nie ma wystarczających Euro Goli na koncie. W tym biznesie szacunek i dobre relacje lojalnymi graczami są najważniejsze a więc gdy mamy do czynienia z klientem VIP nie robimy z tego żadnego problemu i wystawiamy zakład nawet gdy gracz nie ma wystarczających środków na koncie (na kredyt). Udzielamy kredytu tylko klientom VIP, tylko w sytuacji gdy limit kredytu nie został przekroczony. Jeżeli udało się pobrać opłatę, zapisujemy zakład na koncie gracza i odnotowujemy fakt płatności.

Gracze kupują Euro Gole u sprawdzonego dostawcy płatności internetowych. Gracz wchodzi na stronę zakładu bukmacherskiego, klika w przycisk “Doładuj konto”, następuje zostaje przekierowany na stronę dostawcy płatności. Tam gracz wybiera za jaką kwotę PLN chce zakupi Euro Gole, następuje przekierowanie na stronę banku, po poprawnym wykonaniu przelewu partner informuje nas o tym, jaką ilość Euro Goli zakupił gracz.

W pierwszej iteracji rozliczenia wygranych zakładów i wypłata wygranej będzie możliwa tylko podczas osobistej wizyty w siedzibie firmy.


Stories
=======

Zasilenie konta
---------------

_Jako właściciel internetowego zakładu bukmacherskiego_ <br />
_chcę aby gracz mógł zasilić swoje konto Euro Golami_ <br />
_tak aby w przyszłości móc wykupić zakład._ <br />

Cały proces zakupu Euro Goli realizowany jest przez zewnętrzną firmę, jedyne co trzeba zrobić to udostępnić możliwość przyjęcia informacji od zewnętrznego partnera o ilości zakupionych przez gracza Euro Goli. 

Zakup zakładu
-------------

_Jako gracz_ <br />
_chcę mieć możliwość zakupu zakładu_ <br />
_po to żeby zdobyć wygraną._ <br />

Zakład może być na dowolną kwotę, zakład może składać się z jednego lub wielu wydarzeń sportowych. Gracz nie może kupić zakładu za większą ilość Euro Goli niż ma obecnie na koncie. Wydarzenia sportowe są wprowadzane ręcznie bezpośrednio do bazy danych systemu przez wysoko wykwalifikowanego pracownika firmy bukmacherskiej.

Udzielanie kredytu
------------------

_Jako właściciel internetowego zakładu bukmacherskiego_ <br />
_chcę aby klient VIP mógł kupić zakład w sytuacji gdy nie ma wystarczającej ilości Euro Goli na koncie_ <br />
_po to żeby utrzymywać dobre relacje z lojalnymi klientami._ <br />

Wiadomo, że kontrola jest podstawą zaufania a więc nawet klient VIP powinien mieć limit dostępnego kredytu. Dobrze żeby limit był sprawą indywidualną, limit może ale nie musi być nadpisany dla wybranych klientów VIP (np. znajomych prezesa). Domyślny limit dla wszystkich klientów VIP to 1000 Euro Goli.


Przegląd zakładów
-----------------

_Jako gracz_ <br />
_chcę mieć możliwość przejrzenia moich zakładów_ <br />
_tak aby śledzić odpowiednie wydarzenia sportowe._ <br />

Ze względu na bardzo wysoki koszt rozwoju części frontend platformy na razie gracz może wygenerować zestawienie swoich zakładów które po pewnym czasie przyjdzie jako załącznik wiadomości na adres email zarejestrowany w jego koncie. Odpowiednio wygenerowany raport należy zapisać w formie pliku csv na zasobie sieciowym. Raz dziennie wysoko wykwalifikowany pracownik biura bukmacherskiego będzie odczytywał pliki z zasobu i wysyłał ręcznie maile do klientów. Plik ma nazywać się tak jak adres email na który należy wysłać raport.

Powiadomienie SMS o zakupie Euro Goli
-------------------------------------

_Jako właściciel internetowego zakładu bukmacherskiego_ <br />
_chcę aby klient po zakupie Euro Goli wiedział, że może już dokonywać zakładów_ <br />
_po to żeby klienci chętnie dokonywali zakupów._ <br />

Po przyjęciu informacji o zakupie Euro Goli od partnera wysyłamy sms na numer telefonu podpięty do konta gracza. W przyszłości pewnie będziemy chcieli dodać inne kanały takie jak np email.

Rozliczenie zakładu
-------------------

_Jako gracz_ <br />
_chcę aby mój zakład został rozliczony_ <br />
_tak abym mógł odebrać należną mi nagrodę._ <br />

Jeżeli petent zjawi się w stacjonarnym oddziale firmy i poprosi o rozliczenie zakładu wówczas wysoko wykwalifikowany pracownik zakładu musi mieć możliwość po numerze zakładu sprawdzić na jakie wydarzenia był zakład i jeżeli wszystkie wydarzenia zakończyły się zgodnie z przewidywaniem petenta wówczas pracownik wręcza petentowi ilość pieniędzy odpowiadającą ilości Euro Goli na zakładzie. 
Aby nie doszło do wyłudzeń po wypłaceniu gotówki pracownik oznacza zakład jako “opłacono”. Jeżeli petent nie sprawdził sam i prosi o rozliczenie przegranego zakładu wówczas pracownik ma mieć możliwość oznaczenia zakładu jako “przegrana”. 
W sytuacji gdy petent jeszcze raz poprosi o rozliczenie rozliczonego już zakładu system powinien poinformować operatora o tym, że zakład o danym numerze jest już rozliczony tak aby operator ponownie nie tracił czasu na analizę wyników wydarzeń sportowych. 
