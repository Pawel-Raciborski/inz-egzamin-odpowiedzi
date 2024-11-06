# 36. Dziedziczenie, polimorfizm, szablony klas.

---

### Dziedziczenie
Jest to nabywanie cech oraz zachowań rodzica – w tym przypadku dostajemy dostęp do pól oraz metod rodzica, oraz możliwość nadpisywania działania metod rodzica.
W Javie dziedziczenie jest realizowanie poprzez użycia słówka ***extends***. 

Należy pamiętać, że klasa **może dziedziczyć maksymalnie z jednej klasy**.
Domyślnie każda klasa dziedziczy z klasy **Object**.

[Przykład dziedziczenia](dziedziczenie_i_polimorfizm)

W przypadku dziedziczenia podczas tworzenia instancji klasy dziecka, wołany jest konstruktor domyślny(bądź nadpisany) klasy rodzica, robi się to poprzez słowo kluczowe **super(…)**, gdzie jako argumenty przekazujemy wartości do konstruktora rodzica.

---

### Polimorfizm
Występuje on w przypadku gdy mamy do czynienia z dziedziczeniem. Umożliwia on różnym klasom interpretowanie tych samych metod na różne sposoby, dając nam elastyczność.

[Przykład polimorfizmu](dziedziczenie_i_polimorfizm/Main.java)

W powyższym przykładzie metoda ***voice()*** jest nadpisywana w klasie potomnej. Metody nadpisane są zazwyczaj oznaczane adnotacją **@Override**.
W efekcie metoda wywołana na obiekcie klasy podrzędnej ([Dog](dziedziczenie_i_polimorfizm/Dog.java)) wykona się w wersji specyficznej dla tego obiektu, nawet jeśli jest wywoływana poprzez referencję klasy nadrzędnej ([Animal](dziedziczenie_i_polimorfizm/Animal.java)).

---

### Rodzaje szablonów klas

#### Static Class
Klasa, która jest klasą zagnieżdżoną(zdefiniowaną w innej klasie). Tworzenie instancji tej klasy nie wymaga tworzenia instancji klasy zewnętrznej.

[Przykład klasy static](szablony_klas/static_class/StaticClassExample.java)

#### Final Class
Klasa final, jest to klasa z której żadna klasa nie może dziedziczyć. Przy definicji klasy dodajemy słówko **final** aby zaznaczyć, że ta klasa jest final.

[Przykład klasy final](szablony_klas/final_class/FinalClassExample.java)

#### Anonymous Class
Klasa anonimowa jest to klasa, która nie posiada swojej nazwy. Tworzone gdy chcemy zaimplementować jakiś interfejs bądź klasę abstrakcyjną.

[Przykład klasy anonimowej](szablony_klas/anonymous_class/Main.java)

#### Utility Class
Jest to klasa posiadająca tylko metody, które są statyczne.

[Przykład klasy utility](szablony_klas/utility_class/UtilityClassExample.java)

#### Singleton Class
Struktura klasy opiera się na implementacji wzorca Singleton. Jest to klasa, która posiada tylko jedną instancję(obiekt).
Klasa taka posiada:
- prywatny konstruktor
- metodę statyczną do zwracania instancji tej klasy

[Przykład klasy singleton](szablony_klas/singleton_class/Singleton.java)