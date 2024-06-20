package oop.th.rosenheim;

import java.util.ArrayList;
import java.util.List;

public abstract class ExtendedKnoten extends Knoten{
    protected List<Knoten> unterknoten;

    public ExtendedKnoten() {
        unterknoten = new ArrayList<>();
    }

    public ExtendedKnoten addKnoten(Knoten k) {
        this.unterknoten.add((Knoten) k);
        return this;
    }
}
