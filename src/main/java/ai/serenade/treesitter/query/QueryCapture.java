package ai.serenade.treesitter.query;

import ai.serenade.treesitter.TreeSitter;

public class QueryCapture {
  private int id;
  private String name;

  public QueryCapture(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }

}
