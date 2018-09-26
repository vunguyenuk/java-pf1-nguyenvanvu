package AccessModifier;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public String toString(){
        return "Max value in array is: " + maxValue + "\nlocation of array is: ( row: " + row + ", col: " + column + ")";
    }


}
