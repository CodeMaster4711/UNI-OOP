package oop.th.rosenheim;

import java.util.Objects;

public class CompactDisc implements Comparable<CompactDisc>{
    private final String interpret;
    private final String title;
    private final int yearOfPublication;
    private final String recordLabel;

    public CompactDisc(String interpret, String title, int yearOfPublication, String recordLabel) {
        this.interpret = interpret;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.recordLabel = recordLabel;
    }

    public String getInterpreter() {
        return interpret;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public String getrecordlale(){
        return recordLabel;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "interpret='" + interpret + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", recordLabel='" + recordLabel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompactDisc that = (CompactDisc) o;
        return interpret.equalsIgnoreCase(that.interpret) &&
                title.equalsIgnoreCase(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interpret.toLowerCase(), title.toLowerCase());
    }

    @Override
    public int compareTo(CompactDisc other) {
        String thisInterpret = this.interpret.toLowerCase().trim().replaceAll("^(der|die|das|ein|eine|einer|eines|the|a|an)\\s+", "");
        String otherInterpret = other.interpret.toLowerCase().trim().replaceAll("^(der|die|das|ein|eine|einer|eines|the|a|an)\\s+", "");
        int interpretComparison = thisInterpret.compareToIgnoreCase(otherInterpret);

        if (interpretComparison != 0) {
            return interpretComparison;
        } else {
            return this.title.compareToIgnoreCase(other.title);
        }
    }
}
