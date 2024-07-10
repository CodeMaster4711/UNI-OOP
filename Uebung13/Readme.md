# Übung 13: Java Collections

- [Einführung vom letzten Semesster](Hilfestellungen/uebung-13-einfuerung-1.pdf)
- [Aufgabe 1: Listen](#aufgabe-1-listen)
- [Aufgabe 2: Indexverstellen - Mengen, assoziative Speicher, Arrays](#aufgabe-2-indexverstellen---mengen-assoziative-speicher-arrays)
- [Hilfestellungen](#hilfestellungen)

## Kernthemen

- Schreiben von eigenen generischen Klassenmethoden
- Unterschied zwischen der Veränderung einer Referenz und einer Kopie der Referenz
- Anwendung von generischen Typen
- Grundlegende Funktionalität von Collections and Maps verstehen
    - Welche Collection bzw. Map ist für welchen Zweck geeignet
- Iterieren über eine Collection bzw. Map mit einem Iterator
    - Wie kommt man an die einzelnen Elemente bzw. Key-Value-Paare

## Aufgabe 1: Listen

### a)

Implementieren Sie in einer neuen leeren Klasse Util die folgende statische Methode:

````java
public static<E> void reverse1(List<E> list)
````

Die Methode verwendet Generics (Typvariable E) und soll mit beliebigen Objekten/Elementen E
funktionieren. Diese Methode kehrt die Reihenfolge aller Elemente in der Liste list um. Die
übergebene Liste wird verändert und deshalb keine neue Liste angelegt.

### b)

Implementieren Sie zusätzlich die folgende statische Methode:

````java
public static<E> List<E> reverse2(List<E> list)
````

Die Methode erstellt eine neue (!) Liste, die alle Elemente der übergegebenen Liste list enthält,
allerdings in der umgekehrten Reihenfolge. Die zurückgegebene Liste soll exakt den gleichen
Datentyp haben wie die übergebene Liste.

Hinweis:

- Sie wissen nicht, ob hinter der übergegebenen Liste z.B. eine ArrayList oder eine
  LinkedList steckt. Dennoch können Sie eine neue, leere Instanz der übergebenen Liste list
  erzeugen, siehe Vorlesung.
- Eine neue Instanz der Liste erhält man über: ````list.getClass().newInstance();````

### c)

Testen Sie Ihre Methoden aus Aufgabe b) und c) mit der vorgegebenen JUnit-Testklasse TestUtil.

## Aufgabe 2: Indexverstellen - Mengen, assoziative Speicher, Arrays

Gegeben ist ein Array von Listen. Jeder Eintrag des Arrays entspricht der Seite eines Buches und
speichert eine Liste der Begriffe/Schlüsselwörter, die für diese Seite zu indizieren sind. Beispiel:

````
Buchseite 0 / Array-Index 0: → Liste: (leer)
Buchseite 1 / Array-Index 1: → Liste:(Java, Bali, Sulawesi)
Buchseite 1 / Array-Index 2: → Liste:(Bali, Sumatra, Lombok)
````
### a)
Implementieren Sie die folgende statische Methode in der vorgegebenen Klasse ````Index````:
````java
public static Map<String, SortedSet<Integer>> makeIndex(List<String>[] keywords)
````

Die Methode erhält ein Array von Listen mit den zu indizierenden Schlüsselwörtern für jede
Buchseite und gibt einen Index zurück. Der zurückgegebene Index entspricht einer Map: Als Key
dient das Schlüsselwort, der Value ist eine Menge (keine Duplikate!) von aufsteigend sortierten Seitenzahlen auf
denen das Schlüsselwort vorkommt.  
Ferner soll in der Map eine alphabetische Ordnung für die Keys (also die Schlüsselwörter)
verwendet werden. Welche konkrete Map-Klasse ist somit geeignet?
### b)
Vervollständigen Sie die Implementierung der vorgegebenen Methode toString(…), die den
Inhalt der Map, also alle Key-Value-Paare, als String zurückgibt.
(ggfs. https://docs.oracle.com/javase/8/docs/api).

### c)
Testen Sie die Klasse mit der vorgegebenen JUnit-Testklasse TestIndex.
## Hilfestellungen

Übung 13 fokussiert sich auf das Java Collection Framework.
Um nochmals ins Thema einsteigen zu können, finden Sie hier unterschiedliche Videos (i) generell zum Thema Collection Framework (deckt fast alle Collections ab), (ii) ein Tutorial speziell zum Thema List, (iii) ein Tutorial speziell zum Thema Set, (iv) ein Tutorial speziell zum Thema Map.

- Collections: https://www.youtube.com/watch?v=Ma7u6KEKzPE
- List: https://www.youtube.com/watch?v=d3QbptJRln4
- Set: https://www.youtube.com/watch?v=rruCajMgvGA
- Map: https://www.youtube.com/watch?v=UfBaTKaSSRg

In der Übung ist es wichtig, dass Sie versuchen mit den Collections und den vorgegeben Methoden umzugehen.

### Aufgabe 1
In dieser Aufgabe implementieren Sie zwei generische Methoden, welche Sie in der Klasse Util.java zuordnen.
Wie Sie eine generische Methode anlegen finden Sie im Live Coding der Vorlesung zum 7.
Kapitel auf GitLab in der Klasse Verzeichnis.java und die Methode array2Verzeichnis().
Hilfreiche Methoden hier sind get(), set(), und size() (reverse1), sowie add() in reverse2.

### Aufgabe 2
In dieser Aufgabe implementieren Sie in einer Klasse Index.java folgende statische Methode:
````java
public static Map<String, SortedSet<Integer>> makeIndex(List<String>[] keywords)
````
Folgende Hinweise sollen Ihnen weiterhelfen:
- Da der Index alphabetisch sortiert sein muss, muss TreeMap und nicht HashMap verwendet werden!
- Der Wrapper "Integer" muss verwendet werden, da primitive Datentypen in der Java Collection nicht erlaubt sind.