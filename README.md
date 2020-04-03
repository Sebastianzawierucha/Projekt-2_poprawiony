Zrealizowano model obiektowy wypożyczalni multimedialnej. Zbudowana jest z klasy nadrzędnej Zasoby, po której dziedziczą kolejne klasy: Audiobook, Ebook, Książka, Płyta, Film. W każdej podrzędnej klasie zostały zaimplementowane konstruktory nadające wartości początkowe. W każdej klasie zostały dodane metody wyświetlania oraz dodawania wybranych mediów. Została zaimplementowana prosta obsługa klientów, umożlwiająca dodawanie, wprowadzanie dla klientów ilości dni wypożyczenia a także automatyczne obliczenie zaległości wynikającej z przekroczenia czasu wypożyczenia jak również informacja, że użytkownik ma zablokowaną możliwość wypożyczania nowych mediów ze względu na przekroczenie czasu. Każde medium oraz klient dodawany jest do bazy danych przy pomocy oddzielnych funkcji znajdujących się w poszczególnych klasach. Baza danych budowana jest przy pomocy narzędzia ArrayList. Został również wprowadzony mechanizm wyświetlania poszczególnych danych, elastyczny, bo dostosowuje się do ilości parametrów w danej klasie. Klasa główna start składa się z interfejsu i odwołań do poszczególnych metod. Do zaimplementowania pozostało przypisywanie wypożyczanych mediów danemu klientowi, "chowanie" mediów wypożyczonych, edycja i usuwanie zarówno mediów jak i klientów. Cały program główny jest uruchomiony przy pomocy pętli while. Interfejs polega na wybieraniu odpowiednich cyfr. 
