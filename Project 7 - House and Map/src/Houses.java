
public class Houses {
    private final int[] location = new int[2];// the [0] position is the row number, the [1] position is the column
                                              // number

    public Houses(int row, int column) {
        location[0] = row;
        location[1] = column;
    }

    public int[] getLocation() {
        return location;
    }

}