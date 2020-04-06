package mkr.dev.grid.infrastructure;


public class PointSimplexParser {
    private final String filename;
    private double[][] points;
    private int[][] simplices;


    public PointSimplexParser(String filename) {
        this.filename = filename;
    }

    public boolean validateContent() {
        return false;
    }

    public void loadFile(){

    }

    public double[][] getPoints() {
        return points;
    }

    public int[][] getSimplices() {
        return simplices;
    }
}
