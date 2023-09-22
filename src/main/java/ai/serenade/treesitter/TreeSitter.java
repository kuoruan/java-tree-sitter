package ai.serenade.treesitter;

import ai.serenade.treesitter.query.QueryMatch;
import ai.serenade.treesitter.query.internals.QueryCreationResult;

import java.io.UnsupportedEncodingException;

public class TreeSitter {

    public static native Node nodeChild(Node node, int child);

    public static native int nodeChildCount(Node node);

    public static native Node nodeChildByFieldName(Node node, String fieldName);

    public static native Position nodeStartPosition(Node node);

    public static native Position nodeEndPosition(Node node);

    public static native boolean nodeHasError(Node node);

    public static native int nodeEndByte(Node node);

    public static native int nodeStartByte(Node node);

    public static native String nodeString(Node node);

    public static native String nodeType(Node node);

    public static native boolean nodeIsNamed(Node node);

    public static native long parserNew();

    public static native void parserDelete(long parser);

    public static native void parserSetLanguage(long parser, long language);

    public static native long parserParseBytes(long parser, byte[] source, int length) throws UnsupportedEncodingException;

    public static native long treeCursorNew(Node node);

    public static native TreeCursorNode treeCursorCurrentTreeCursorNode(long cursor);

    public static native String treeCursorCurrentFieldName(long cursor);

    public static native Node treeCursorCurrentNode(long cursor);

    public static native void treeCursorDelete(long cursor);

    public static native boolean treeCursorGotoFirstChild(long cursor);

    public static native boolean treeCursorGotoNextSibling(long cursor);

    public static native boolean treeCursorGotoParent(long cursor);

    public static native void treeDelete(long tree);

    public static native Node treeRootNode(long tree);

    public static native QueryCreationResult queryNew(long language, String queryCode);

    public static native void queryDelete(long query);

    public static native void queryCursorDelete(long queryCursorPointer);

    public static native long queryCursorNew();

    public static native QueryMatch queryCursorNextMatch(long queryCursor);

    public static native void queryCursorExec(long queryCursor, long query, Node node);

    public static native int queryCaptureCount(long query);

    public static native String queryCaptureNameForId(long query, int id);

}
