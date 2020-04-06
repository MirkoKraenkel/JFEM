package mkr.dev.grid;

import java.util.List;

public class Simplex2d implements Entity,Simplex {

    @Override
    public List<Entity> getChildren() {
        return null;
    }

    @Override
    public Boolean isLeaf() {
        return null;
    }

    @Override
    public int level() {
        return 0;
    }

    @Override
    public Simplex[] faces() {
        return new Simplex[0];
    }

    @Override
    public Point[] vertices() {
        return new Point[0];
    }
}
