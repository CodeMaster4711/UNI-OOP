package oop.th.rosenheim;

import java.util.Comparator;

public class InterpreterTitleComparator implements Comparator<CompactDisc>{
    @Override
    public int compare(CompactDisc cd1, CompactDisc cd2) {
        String interpret1 = cd1.getInterpreter().toLowerCase().trim().replaceAll("^(der|die|das|ein|eine|einer|eines|the|a|an)\\s+", "");
        String interpret2 = cd2.getInterpreter().toLowerCase().trim().replaceAll("^(der|die|das|ein|eine|einer|eines|the|a|an)\\s+", "");
        int interpretComparison = interpret1.compareToIgnoreCase(interpret2);

        if (interpretComparison != 0) {
            return interpretComparison;
        } else {
            return cd1.getTitle().compareToIgnoreCase(cd2.getTitle());
        }
    }
}
