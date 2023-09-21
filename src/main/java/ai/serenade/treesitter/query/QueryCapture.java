package ai.serenade.treesitter.query;

public class QueryCapture {
    private final int id;
    private final String name;

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
