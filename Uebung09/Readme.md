# Übung 09 Strings und Arrays

- [Intro zu Übung 9](#hilfestellungen)
- [Hilfestellungen](#hilfestellungen)

## Kernthemen

- Unterschied zwischen Vergleich auf Identität und Gleichheit
- Operationen auf Strings
    - Strings in Arrays umzuwandeln und umgekehrt (split und StringJoiner)
    - Klassenmethoden von Arrays verwenden
    - StringBuffer und StringBuilder
- Nachschauen von einzelnen Methoden in der entsprechenden API
- Anwenden von Klassenmethoden

## Aufgabe 1: Fehlersuche

Im folgenden (ziemlich sinnlosen) Programm sind Fehler enthalten. Das Programm liest einen Namen
von der Kommandozeile. Falls „Duck“ eingegeben wird, so wird der Benutzer mit „Hallo Donald“ begrüßt.
Anschließend gibt das Programm den 2. und 3. Buchstaben der Eingabe als Großbuchstaben aus.

Überlegen Sie sich ohne1 Computer, was falsch ist und korrigieren Sie das Programm! Ggfs. können
sie das Programm später in IntelliJ prüfen

````java
public class StringOops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.next();
        process(name);
    }

    public static void process(string "name") {
        if (name == Duck) {
            System.out.println("Hello Donald!);
        }
        toUpperCase(name);
        name.substring(1, 3);
        System.out.println(name + " has " + name.length + " letters");
    }
}
````

## Aufgabe 2: Zerlegen und Zusammensetzen von Zeichenketten

In dieser und der nächsten Aufgabe 3 werden einige statische Methoden für Zeichenketten in der Klasse
StringUtil implementiert.

- Gegeben seien zwei Strings s1 und s2 sowie 2 Arrays a1 und a2. Welche Java-Anweisung
  vergleicht s1 und s2 bzw. a1 und a2 auf Gleichheit? Welche Anweisung vergleicht auf Identität
- ````java
  public static String[] string2StringArray(String s) 
  ````
  Implementieren Sie diese Methode, die den String s in seine Einzelwörter zerlegt und die
  Einzelwörter dann alphabetisch sortiert in ein Array von Strings einträgt. Bsp.: Die Eingabe „bald
  sind ferien“ liefert das String-Array („bald“, „ferien“, sind“). Hinweise:
    - Die Java-Klasse Arrays liefert eine einfache Möglichkeit ein Array von Strings zu sortieren.
      https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
    - Informieren Sie sich über die Methode 'split' der Klasse String und über reguläre Ausdrücke:
        - https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        - https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
    - Als Trennzeichen für Einzelwörter fungieren 1 oder mehrere aufeinanderfolgende White-
      spaces.
- ````java
  public static String stringArray2String(String[] arr)
  ````
  Fügt die Elemente eines String-Arrays zu einem langen String (mit Trennzeichen ' ') zusammen.
  Verwenden Sie hierzu die Klasse StringBuffer.
  Hinweis: Verwenden Sie nicht Arrays.toString() oder die Methode join der Klasse String.


- Implementieren Sie eine JUnit5 Testklasse StringUtilsTest, die Folgendes testet:
    - „kurt fährt auto“ soll gemäß b) korrekt in das Array [„auto“, „fährt“, „kurt“] zerlegt werden.
    - „kurt fährt auto“ soll trotz der vielen Whitespaces in das gleiche Array zerlegt werden.
    - Das Array [„kurt“, „fährt“, „Auto“] ergibt beim Zusammensetzen gemäß c): „kurt fährt Auto“.
      Die Methode assertArrayEquals(.) kann nützlich sein.

## Aufgabe 3: Anagramme

Der Begriff Anagramm bezeichnet eine Buchstabenfolge, die aus einer anderen Buchstabenfolge allein
durch Umstellung (Permutation) der einzelnen Buchstaben gebildet wird. Beispielsweise sind „Bier“ und
„Brei“ ein Anagramm. Ebenso sind „Fr. Inge C. Sonst, Rheine“ und „Schornsteinfegerin“ Anagramme.
Wir betrachten im Folgenden nur Buchstaben und ignorieren Sonderzeichen, Ziffern, Leerzeichen sowie
Groß- und Kleinschreibung.

- ````java
  public static boolean areAnagrams(String string1,String string2)
  ````
  Implementieren Sie diese Methode, die prüft ob zwei Strings Anagramme sind. Hinweise:
    - Sie können mit Character.isLetter(char c) auf einen Buchstaben prüfen.
    - Nützliche Funktionen finden Sie ggfs. auch in der Klasse Arrays und StringBuilder.


- Erweitern Sie die JUnit5 Testklasse StringUtilsTest von Aufgabe 2 mit folgenden Tests:
    - „Debit Card“ und „Bad Credit“ sind Anagramme.
    - „derbe Hotline“ und „Bohlen, Dieter“ sind Anagramme.
    - „Haus“ und „Haus“ sind keine Anagramme, da es sich um die gleichen Wörter handelt.
    - „joy“ und „enjoy“ sind ebenfalls keine Anagramme.

## Hilfestellungen

In dieser Übung befassen Sie sich zu aller erst mit einem Fehlerteufel. Danach zerlegen Sie Zeichenketten bzw. fügen Zeichenketten zusammen.

### Aufgabe 1
In der ersten Aufgabe versuchen Sie OHNE IntelliJ die eingeschlichenen Fehler zu finden. Hier sind sowohl Syntax Fehler gemeint, als auch semantische Fehler:
also liefert z.B. name.substring(1,3) den richtigen Substring, aber wird wie in der Beschreibung der Aufgabe vorgegeben auch der 2. und 3. Buchstabe am Screen ausgegeben?

### Aufgabe 2
In dieser Aufgabe beschäftigen Sie sich mit den Klassen String und Array und eine Auswahl an darin vorgegebenen Methoden.
Ziel ist es nicht, alle Methoden der Klassen auswendig zu wissen.
Vielmehr geht es darum, wie die Methoden aufgerufen werden (Aufruf der Methoden über vorher instanziiertes Objekt versus Aufruf von Klassenmethoden),
und wo Sie die Informationen finden, sodass Sie Aufgaben dieser Art lösen können.
Hierzu gibt es in den Übungsblättern Links zu Online-Beschreibungen der Klasse String und Array sowie zum Thema reguläre Ausdrücke.  
Wichtig ist auch, dass Sie sich im Thema testen üben und wieder eine Testklasse zur Aufgabe 2 entwickeln.

### Aufgabe 3
In dieser Aufgabe beschäftigen Sie sich mit der Klasse Character und implementieren eine Methode, welche zwei Eingabestrings auf Anagramme testet.

### Links
java.util.Arrays: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html  
java.lang.System: https://docs.oracle.com/javase/7/docs/api/java/lang/System.html  
java.lang.Character: https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html  
java.lang.String: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html  
java.util.regex.Pattern: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html  
java.lang.StringBuffer: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html