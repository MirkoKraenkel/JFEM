package mkr.dev.grid;

import java.util.List;
import java.util.stream.Stream;

public class Simplex2dGrid implements Grid<Simplex2d>{
    List<Simplex2d> elements;

    @Override
    public Stream<Simplex2d> getLeafEntityStream() {
         return elements.stream().filter(Entity::isLeaf);
    }

    @Override
    public Stream<Simplex2d> getLevelEntityStream(int level) {
        return  elements.stream().filter(simplex2d -> simplex2d.level()==level);
    }
}
