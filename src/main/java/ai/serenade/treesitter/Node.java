package ai.serenade.treesitter;

public class Node {
    private int context0;
    private int context1;
    private int context2;
    private int context3;
    private long id;
    private long tree;

    public Node() {
    }

    public Node getChild(int child) {
        return TreeSitter.nodeChild(this, child);
    }

    public int getChildCount() {
        return TreeSitter.nodeChildCount(this);
    }

    public Node getChildByFieldName(String fieldName) {
        return TreeSitter.nodeChildByFieldName(this, fieldName);
    }

    public int getDescendantCount() {
        return TreeSitter.nodeDescendantCount(this);
    }

    public Node getDescendantForByteRange(int start, int end) {
        return TreeSitter.nodeDescendantForByteRange(this, start, end);
    }

    public Node getNamedDescendantForByteRange(int start, int end) {
        return TreeSitter.nodeNamedDescendantForByteRange(this, start, end);
    }

    public Position getStartPosition() {
        return TreeSitter.nodeStartPosition(this);
    }

    public Position getEndPosition() {
        return TreeSitter.nodeEndPosition(this);
    }

    public boolean hasError() {
        return TreeSitter.nodeHasError(this);
    }

    public int getEndByte() {
        return TreeSitter.nodeEndByte(this);
    }

    public String getNodeString() {
        return TreeSitter.nodeString(this);
    }

    public int getStartByte() {
        return TreeSitter.nodeStartByte(this);
    }

    public String getType() {
        return TreeSitter.nodeType(this);
    }

    public boolean isNamed() {
        return TreeSitter.nodeIsNamed(this);
    }

    public TreeCursor walk() {
        return new TreeCursor(TreeSitter.treeCursorNew(this));
    }
}
