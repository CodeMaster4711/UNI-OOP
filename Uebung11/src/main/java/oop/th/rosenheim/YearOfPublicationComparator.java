package oop.th.rosenheim;

import java.util.Comparator;

public class YearOfPublicationComparator implements Comparator<CompactDisc> {

    @Override
    public int compare(CompactDisc cd1, CompactDisc cd2) {
        return Integer.compare(cd1.getYearOfPublication(), cd2.getYearOfPublication());
    }
}