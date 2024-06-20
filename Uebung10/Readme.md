# Übung 10: Objektorientierte Modellierung

- [UML Tools](#uml-tools)
- [Hilfestellungen](#hilfestellungen)
## Kernthemen
- Entwerfen eines eigenen UML-Diagramms
- Notation von Variablen und Methoden
- Darstellung der Sichtbarkeiten sowie der Spezifikationen wie z.B. static, final und abstract
- Darstellung von Beziehungen zwischen Klassen
- Angabe von Kardinalitäten und Rollenbeziehungen

## Aufgabe 1: Klassendiagramm

Modellieren Sie zu folgendem Sachverhalt ein Klassendiagramm:  

„Also, wir brauchen ein System, mit dem wir unsere Universität organisieren können. Es gibt ja
Professoren die Lehrveranstaltungen halten. Eine Lehrveranstaltung findet immer in einem bestimmten
Semester statt und hat immer das gleiche Schema im Stundenplan: Name und Vorname des Dozenten,
Semester und Dozent. Ein Student besucht verschiedene Lehrveranstaltungen. Seine Matrikelnummer
soll einfach eine fortlaufende Nummer sein. Dabei darf es natürlich keine doppelten geben. Wir nehmen
mal eine sechsstellige Nummer. Die ersten sollten dann ja wieder frei werden nach einer gewissen Zeit.
Studenten können ja Veranstaltungen besuchen, indem Sie zu einem Hörsaal gehen. Sie können aber
auch Dozenten besuchen, indem sie zu dem Büro des Dozenten laufen. Um das zu organisieren, haben
Sie einen Kalender der aus Terminen besteht. Sie können dann Dozenten oder Veranstaltungen zu
ihrem Kalender hinzufügen. Die Terminvergabe soll dann automatisch laufen.
Am Ende wollen wir dann ganz banale Dinge damit tun, wie zum Beispiel Alle Studenten in einer Liste
ausgeben, Alle Studenten zu einer Veranstaltung listen oder für einen Dozenten einen Stundenplan
erstellen.“  

Verwenden Sie dazu die Ihnen aus der Vorlesung bekannten Modellierungsparadigmen. Wo können
Sie Vererbung, abstrakte Klassen oder Interfaces sinnvoll einsetzen?

## Aufgabe 2: Codegenerierung
Implementieren Sie den in Aufgabe 1 modellierten Sachverhalt in Java. Achten Sie darauf, dass trotz
nicht implementierter Methoden das Programm kompiliert werden kann.

## UML Tools
- Violet UML: https://sourceforge.net/projects/violet/
- UML Diagramme mit UMLet: https://www.umlet.com/
- Free Online UML Editor: https://online.visual-paradigm.com/de/diagrams/solutions/free-uml-editor-online/
- BlueJ: https://www.bluej.org/
- PlantUML: https://plantuml.com/de/
- Umletino: http://www.umlet.com/umletino/umletino.html
- Mermaid: https://mermaid.js.org/
- Draw:io: https://app.diagrams.net/

Finden Sie noch weitere Tools sinnvoll? Dann schicken Sie mir einfach eine Email und ich füge es der Liste hinzu!


## Hilfestellungen

Hier sind einige Links zu Videos, um UML besser verständlich zu machen:
- UML Klassendiagramm: https://www.youtube.com/watch?v=zzwUH3vbNkc
- Assoziationen in UML: https://www.youtube.com/watch?v=sTM0EjAit7c
- Assoziationen in UML 2: https://www.youtube.com/watch?v=Z6CrqPukPkY

Weblinks:
- UML Webpage: https://www.uml.org/
- Klassendiagramm Übersicht: https://www.uml-diagrams.org/class-diagrams-overview.html