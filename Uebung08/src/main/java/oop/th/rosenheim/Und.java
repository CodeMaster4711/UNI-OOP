package oop.th.rosenheim;

public class Und extends ExtendedKnoten{
        @Override
        public Boolean getWert() {
            for(Knoten k : unterknoten){
                if(!k.getWert()){
                    return false;
                }
            }
            return true;
        }
}
