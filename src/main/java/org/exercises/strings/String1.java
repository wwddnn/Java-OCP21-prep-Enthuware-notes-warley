package org.exercises.strings;
public class String1 {
    static void main() {
        String codeBlocks = """
                0123\
                4567
                """;

        System.out.println( "-" + codeBlocks+ "-");
        System.out.println(codeBlocks.length());
        System.out.println(codeBlocks.substring(5,7));
        System.out.println(codeBlocks.substring(2,4));
    }
}
