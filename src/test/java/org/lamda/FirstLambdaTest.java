package org.lamda;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstLambdaTest {
    @Test
    public void shouldReturnHelloMessage() {
        var lambda = new FirstLambda();
        Assertions.assertEquals("Hello, AWS Lambda", lambda.handleRequest());
    }
}