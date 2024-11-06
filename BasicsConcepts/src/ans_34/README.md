# 34. Obiekty a klasy, pojęcie hermetyzacji.

### Różnica między obiektem, a klasą. 
**Klasa** jest to szablon na podstawie którego tworzymy obiekt(instancję) tej klasy.

[Przykład](class_vs_object/Car.java)

**Obiektem** nazywamy element stworzony w pamięci na podstawie klasy. Instancję klasy w Javie tworzymy przy pomocy konstruktora oraz słowa kluczowego new.

### Pojęcie hermetyzacji

**Hermetyzacja(inaczej zwana enkapsulacja)** polega na ograniczeniu widoczności tych elementów klasy, które nie powinny być widoczne na zewnątrz jej.
Jest ona wprowadzana w celu uniemożliwienia modyfikacji pewnych elementów(pól) klasy, których to zmiana ze względu na swoje przeznaczenie może być niepożądane.
Hermetyzowanie elementów klasy powoduje też, że nie mamy dostępu do takich elementów bezpośrednio. Uzyskanie do nich dostępu możemy realizować poprzez wykorzystanie metod. W Javie wykorzystujemy do tego tzw. gettery.

[Przykład hermetyzacji](hermetyzacja/Car.java)