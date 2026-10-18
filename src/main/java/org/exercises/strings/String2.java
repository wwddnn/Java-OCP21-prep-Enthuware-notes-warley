package org.exercises.strings;

public class String2 {
    //anotação sobre code blocks

    //The Java text blocks feature, which been standardised in Java 17, makes it easier to write compile time constant strings within Java code. For example, instead of writing:
    //String templateHtml =
    //"<html>\n"+
    //"   <body>\n"+
    //"       hello\n"+
    //"   </body>\n"+
    //"</html>\n";
    //
    //You can write:
    //String templateHtml = """
    //   <html>
    //     <body>
    //         hello
    //     </body>
    //   </html>
    //   """;
    //Observe that the text is now neatly formatted and readable. The text does not have \n for line breaks either.
    //Rules to interpret Java Text blocks
    //The compiler converts a Java text block into a String using a complicated set of rules, which are as follows:  Delimiters: 1. The starting delimiter is """ followed by any number of white spaces followed by the ASCII LF character (i.e. the new line character). 2. The ending delimiter is """. Thus, in the above example, the String starts with <html> and ends with a new line character after </html>.  Indentation: 1. White space characters that are used to indent the text block are removed from each line. These white spaces are collectively called "incidental whitespace". In the above example, <html> is indented 3 spaces from the left margin. Some other lines have more spaces at the beginning but the first three of those spaces are common to all the lines. These are all incidental whitespace and are removed. However, any space after the incidental whitespace and before the first non-whitespace character at each line is considered "essential whitespace" and is kept. Thus, the second line is interpreted as " <body>" instead of "<body>".  2. All trailing whitespace is removed and each line is terminated with a single ASCII LF character (the new line character) immediately after the last non-whitespace character. Thus, even if you have multiple space characters (such as spaces and tabs) at the end of a line, those will not be a part of the String. They will be replaced with a single new line character. Note that if the code is written on Windows platform, a line is terminated with two characters CR and LF i.e. \r\n. But Java normalizes that to just LF. This ensures that the text is same on windows and unix platforms.  Escape characters: You can still use escape characters in a text block. For example:
    //String s = """
    //                Hello\tTab\n""";
    //t inserts a tab character between Hello and Tab and \n inserts a new line character after Tab. Note that instead of \n, it is more convenient to just include a new line:
    //String s = """
    //                Hello\tTab
    //                """;
    //If you want to break a long text into multiple lines in the code without actually inserting a new line character in the text, you can do so using \ like this:
    //String s = """
    //               Hello \
    //               World""";
    //System.out.println(s);//prints Hello World
    //Observe that there is no new line between Hello and World even though there is a new line between them in the code.
    //Useful examples for the exam
    //String s =
    //"""
    //hello
    //""";
    //The above string starts with h and ends with a new line character. Thus, the length of the above string is 6. Observe that there is no new line character at the beginning. This is exactly the same as:
    //String s = "hello\n";
    //String s =
    //   """
    //      hello
    //   """;
    //The length of the essential whitespace is 3 and not 0. Thus, the length of the above string is 9. This is exactly the same as:
    //String s = "   hello\n";
    //String s = """
    //      hello
    //      """;
    //The length of the essential whitespace is 0. Thus, the length of the above string is 6. This is exactly the same as:
    //String s = "hello\n";
    //String s = """
    //      hello""";
    //The length of the essential whitespace is 0 and there is no new line at the end. Thus, the length of the above string is 5. This is exactly the same as:
    //String s = "hello";
    //String s = """
    //                """;
    //This is empty string (length is 0).
    //String s = """      hello
    //           """;
    //
    //This will not compile because a new line is required after the opening """.
}
