# Übung 11

- [Hilfestellungen](#hilfestellungen)

## Kernthemen
- Überschreiben der Standard Object-Methoden 
- toString, equals, hashCode, (clone auch wichtig, kommt aber nicht vor da immutable)
- Implementieren von Interfaces
- Erstellung einer eignen Ordnung für Objekte anhand der Interfaces comparable<T> und Comparator<T> (evtl. Generics)
- Wichtigkeit von immutable verstehen

### Erklärung Comparable und Comparator
Das Interface Comparable wird für die „natürliche“ Ordnung von Objekten definiert. Falls benötigt,
werden alternative Ordnungen über das Interface Comparator definiert.
Hinweis: Wie in der Vorlesung besprochen wird die Verwendung von Generics empfohlen. Falls Sie
dennoch auf Generics verzichten, können Sie Raw Types Warnings ignorieren.

## Aufgabe 1 :  Klasse CD
Schreiben Sie eine Klasse CompactDisc mit den Attributen Interpret, Titel, Erscheinungsjahr und
Plattenlabel. Die Objekte der Klasse sollen immutable sein!  

Implementieren Sie ferner sinnvolle Konstruktoren und Getter-Methoden und überschreiben Sie die
Methoden toString, equals und hashCode. Zwei CDs sollen gleich sein, wenn Interpret und Titel
übereinstimmen (ohne Berücksichtigung der Groß-und Kleinschreibung).

## Aufgabe 2: Interface Comparable
Das Interface java.lang.Comparable ist in der Java-Bibliothek vordefiniert:
````java
package java.lang;
import java.util.*;
public interface Comparable<T> {
public int compareTo(T o);
}
````
Implementieren Sie das Interface Comparable für die Klasse CompactDisc. Ordnen Sie dabei CDs
wie im Plattenladen, das heißt nach Interpret, wobei jedoch führende „der“, „die“, „das“, „ein“, „eine“,
„einer“, „eines“, „the“, „a“ und „an“ nicht berücksichtigt werden. Zum Beispiel:
- „Die Toten Hosen“ steht unter „T“
- „The Who“ unter „W“

Testen Sie Ihre Implementierung mit dem vorgegebenen JUnit Testtreiber [TestCompactDisc](src/test/java/oop/th/rosenheim/TestCompactDisc.java)!

Hinweise:
- Gehen Sie davon aus, dass das Attribut für den Interpreten niemals null ist
- Verwenden Sie ggfs. geeignete Hilfsmethoden der Klasse String, wie z.B. die Methode
  trim(), um führende oder abschließende Leerzeichen zu entfernen.
  https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
- Die Klasse Arrays verfügt über eine Reihe von (statischen) Methoden, die je nach gewähltem
  Lösungsansatz hilfreich sein können, z.B. sort(.), copyOf(.), binarySearch(.)
  https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

## Aufgabe 3: Interface Comparator – Vergleich nach Erscheinungsjahr
- Schreiben Sie eine Klasse YearOfPublicationComparator, die einen Comparator für
  CompactDiscs implementiert, der diese nach dem Erscheinungsjahr ordnet.
- Testen Sie mit der Methode testYearOfPublicationComparator() der JUnit Testklasse
  [TestCompactDisc](src/test/java/oop/th/rosenheim/TestCompactDisc.java). Versuchen Sie zu verstehen, wie und was diese Methode testet.

## Aufgabe 4: Interface Comparator – Vergleich nach Interpret und Titel

Schreiben Sie eine Klasse InterpreterTitleComparator, der die CDs (wie in der natürlichen
Ordnung) nach Interpret ordnet, und zusätzlich die CDs bei gleichem Interpreten nach Titel ordnet.
Einen JUnit Testtreiber [TestInterpreterTitleComparator](src/test/java/oop/th/rosenheim/TestInterpreterTitleComparator.java) finden Sie in der Vorgabe.

## Hilfestellungen

Diese Übung beschäftigt sich mit dem Thema "Comparator und Comparable".  
Einen wirklich hilfreichen Artikel zum Thema habe ich auf dieser Webseite gefunden: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/  

Erklärung von Comparable anhand eines einfachen Beispiels:https://www.youtube.com/watch?v=swEvHhN9l8k&t=1s  

### Aufgabe 1:
CompactDisk.java soll erstellt werden. Legen Sie die beschriebenen Attribute an und entsprechenden Getter. Überschreiben Sie toString(), equals() (Vergleich nach Interpret und Titel), und hashCode() (gerne wie im Beispiel der Vorlesungsfolien (*31)).

### Aufgabe 2:
CompactDisk.java wird erweitert um das Interface Comparable und die Methode
compareTo() wird überschrieben:
- Verwenden Sie ggfs. geeignete Hilfsmethoden der Klasse String, wie z.B. die Methode trim(), um führende oder abschließende Leerzeichen zu entfernen. https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
- Die Klasse Arrays verfügt über eine Reihe von (statischen) Methoden, die je nach gewähltem Lösungsansatz hilfreich sein können, z.B. sort(.), copyOf(.), binarySearch(.) https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

### Aufgabe 3
YearOfPublicationComparator.java wird erstellt, um CompactDisks nach Erscheinungsjahr zu ordnen.

### Aufgabe 4
InterpreterTitleComparator.java wird erstellt, um CompactDisks nach Interpret zu ordnen. Im Falle von gleichen Interpreten sollen die Inhalte nach Titel sortiert werden.