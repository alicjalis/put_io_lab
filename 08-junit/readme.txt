Pytanie 3.1
Tak, zmiana adnotacji z @BeforeEach na @BeforeAll spowodowałaby, że metoda setUp zostanie wykonana tylko raz, a nie przed każdym testem. W kontekście naszych testów, oznaczałoby to, że pole calculator zostanie zainicjalizowane tylko raz, a nie przed każdym testem.

Pytanie 4.1
Metoda test1 zgłosi "failure", ponieważ asercja assertFalse(true, "This assertion will always fail") jest zawsze fałszywa.
Metoda test2 zgłosi "error", ponieważ instrukcja throw new RuntimeException(); rzuca wyjątek RuntimeException, który nie jest obsługiwany przez framework JUnit.

Pytanie 4.2
JUnit oczekuje na rzucenie AssertionError.

Pytanie 5.1
Jest to typ whitebox

Pytanie 5.2
Można zidentyfikować 4 różne ścieżki
