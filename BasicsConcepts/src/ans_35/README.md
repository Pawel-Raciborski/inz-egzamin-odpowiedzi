# 35. Pola i metody statyczne w klasie.

### Pola statyczne klasy
Są to pola należące do klasy, nie bezpośrednio do obiektu, co oznacza, że są współdzielone przez wszystkie instancje klasy. Definiowane przy użyciu słowa kluczowego static. Są one inicjalizowane podczas pierwszego użycia klasy, i są dostępnie „przed obiektem”.
W klasie mogą zostać użyte przy polu oraz metodzie. 

Należy jednak pamiętać, że w przypadku elementów static, nie mają one dostępu do pól oraz metod instancyjnych.

[Przykład staticów](pola_statyczne/Car.java)