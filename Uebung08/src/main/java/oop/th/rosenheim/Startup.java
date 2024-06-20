package oop.th.rosenheim;

/**
 * Ausführendes Programm für Übung 8
 * @author  	Professoren der Informatikfakultät
 * @version     1.0
 * Modified     4.4.2020 Silke Lechner-Greite
 */
public class Startup {

    public static void main(String[] args) {

        Basisereignis a = new Basisereignis(true);
        Basisereignis b = new Basisereignis(false);
        Basisereignis c = new Basisereignis(true);

        Oder baum = new Oder();
        baum.addKnoten(a).addKnoten(new Und().addKnoten(b).addKnoten(c));
        System.out.println(baum);

    }
}
