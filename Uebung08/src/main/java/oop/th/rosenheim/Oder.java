package oop.th.rosenheim;

public class Oder extends ExtendedKnoten{

    @Override
    public Boolean getWert() {
        for(Knoten k : unterknoten){
            if(k.getWert()){
                return true;
            }
        }
        return false;
    }

}