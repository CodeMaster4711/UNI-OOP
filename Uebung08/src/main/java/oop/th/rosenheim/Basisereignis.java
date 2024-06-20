package oop.th.rosenheim;

public class Basisereignis extends Knoten {
    private boolean wert;

    public Basisereignis(boolean wert) {
        this.wert = wert;
    }

    @Override
    public Boolean getWert() {
        return wert;
    }
}
