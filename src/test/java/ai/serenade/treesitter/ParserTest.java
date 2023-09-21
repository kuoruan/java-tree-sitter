package ai.serenade.treesitter;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest extends TestBase {

    @Test
    void testParse() throws UnsupportedEncodingException {
        try (Parser parser = new Parser()) {
            parser.setLanguage(Languages.python());
            try (Tree tree = parser.parseString("print(\"hi\")")) {
                assertEquals(
                        "(module (expression_statement (call function: (identifier) arguments: (argument_list (string (string_start) (string_content) (string_end))))))",
                        tree.getRootNode().getNodeString()
                );
            }
        }
    }
}
