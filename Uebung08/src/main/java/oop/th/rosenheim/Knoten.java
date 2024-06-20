package oop.th.rosenheim;

/**
 * Abstrakte Oberklasse Knoten
 * @author  	Professoren der Informatikfakultät
 * @version     1.0
 * Modified     4.4.2020 Silke Lechner-Greite
 */
public abstract class Knoten {
    /**
     * Abstrakte Methode getWert()
     * @return boolean
     */
    public abstract Boolean getWert();
    @Override
    public String toString(){
        if(getWert()){
            return "1";
        }else{
            return "0";
        }
    }
}