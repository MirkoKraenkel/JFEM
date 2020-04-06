package mkr.dev.grid;

import java.nio.channels.Pipe;

public interface Geometry {
    Point toGlobal(Point x);
    Point toLocal(Point x);
}
