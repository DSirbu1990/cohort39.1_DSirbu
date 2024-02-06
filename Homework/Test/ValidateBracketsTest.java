import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateBracketsTest {

    @Test

    public void testForValidateBrackets (){

        Assertions.assertTrue(ValidateBrackets.validateBrackets("( [ ] { } )"));
        Assertions.assertTrue(ValidateBrackets.validateBrackets("{[( )]}"));
        Assertions.assertFalse(ValidateBrackets.validateBrackets(" [(])"));
        Assertions.assertFalse(ValidateBrackets.validateBrackets(" {[}"));

    }
}
