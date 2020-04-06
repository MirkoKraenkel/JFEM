package mkr.dev.grid;

import java.util.stream.Stream;

public interface Grid<E extends Entity> {
    public  Stream<E> getLeafEntityStream();
    public Stream<E> getLevelEntityStream(int level);
}
