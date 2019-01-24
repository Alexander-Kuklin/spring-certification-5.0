package spring.certification.ioc.q035;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Objects;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Accompanies {@link SpelFunctionality} answer to the question about basic features of SpEL language, more specifically verifies
 * functionality offered by {@link ExpressionParser} and {@link Expression} interfaces.
 */
public class SpelFunctionalityTest {

    /**
     * SpEL parser used within unit tests. Reusable and thread-safe.
     */
    private static final ExpressionParser PARSER = new SpelExpressionParser();

    /**
     * Verifies SpEL functionality of evaluating literal expressions.
     */
    @Test
    public void shouldEvaluateLiteralExpression() {
        String singleCharacter = "'A'";
        String word = "'Word'";
        String integralNumber = "1";
        String floatingPointNumber = "1.0";

        Expression characterExpression = PARSER.parseExpression(singleCharacter);
        Character evaluatedCharacter = characterExpression.getValue(Character.class);
        assertTrue(Objects.equals('A', evaluatedCharacter));

        Expression stringExpression = PARSER.parseExpression(word);
        String evaluatedString = stringExpression.getValue(String.class);
        assertEquals("Word", evaluatedString);

        Expression integralNumberExpression = PARSER.parseExpression(integralNumber);
        Integer evaluatedIntegralNumber = integralNumberExpression.getValue(Integer.class);
        assertEquals(1, (int) evaluatedIntegralNumber);

        Expression floatingPointExpression = PARSER.parseExpression(floatingPointNumber);
        Double evaluatedFloatingPointExpression = floatingPointExpression.getValue(Double.class);
        assertEquals(1.0, (double) evaluatedFloatingPointExpression, 0.01);
    }

    /**
     * Verifies SpEL functionality of evaluating boolean expressions.
     */
    @Test
    public void shouldEvaluateBooleanExpression() {
        Boolean trueValue = PARSER.parseExpression("true").getValue(Boolean.class);
        assertTrue(trueValue);

        Boolean trueExpression = PARSER.parseExpression("0 < 1").getValue(Boolean.class);
        assertTrue(trueExpression);
    }

    /**
     * Verifies SpEL functionality of evaluating regular expressions.
     */
    @Test
    public void shouldEvaluateRegexp() {
        Boolean regexpResult = PARSER.parseExpression("'Bonnie' matches '\\w*'").getValue(Boolean.class);
        assertTrue(regexpResult);
    }

    /**
     * Verifies SpEL functionality of evaluating class expressions.
     */
    @Test
    public void shouldEvaluateClassExpression() {
        WordWrapper wordWrapper = new WordWrapper();
        String actualWord = PARSER.parseExpression("word").getValue(wordWrapper, String.class);
        assertEquals(wordWrapper.getWord(), actualWord);
    }

    /**
     * Simple wrapper to demonstrate evaluation of class expressions
     */
    private static class WordWrapper {
        private String word = "Santa is coming";

        public String getWord() {
            return word;
        }
    }
}