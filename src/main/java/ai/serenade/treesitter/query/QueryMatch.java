package ai.serenade.treesitter.query;

import java.util.ArrayList;
import java.util.List;

public class QueryMatch {
    public int id;
    public int patternIndex;
    public int captureCount;

    public long matchPointer;

    public List<QueryMatchCapture> captures;

    public QueryMatch() {
        this.captures = new ArrayList<>();
    }


    public List<QueryMatchCapture> getCaptures() {
        return captures;
    }

}
