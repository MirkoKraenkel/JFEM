package mkr.dev.grid;

import java.util.List;

interface Entity {
  public List<Entity> getChildren();
  public Boolean isLeaf();
  public int level();
}
