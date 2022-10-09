package com.github.devik;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public void handle(String input, Context context) {
        context.getLogger().log("Input: " + input);
    }
}
