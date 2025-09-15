public class IntroducitonToStrings {
    public static void main(String[] args) {
        
        // 1. Length of a string
        String str1 = "Java";
        System.out.println("Length of \"" + str1 + "\" \u2192 " + str1.length()); // 4

        // 2. Concatenation
        String str2 = "Hello";
        String str3 = "World";
        System.out.println("\"" + str2 + "\" + \"" + str3 + "\" \u2192 " + (str2 + str3)); // HelloWorld
        System.out.println("Using concat(): " + str2.concat(str3)); // HelloWorld

        // 3. Character at index
        System.out.println("\"" + str1 + "\".charAt(2) \u2192 " + str1.charAt(2)); // v

        // 4. Substring extraction
        String str4 = "Programming";
        System.out.println("\"" + str4 + "\".substring(1, 4) \u2192 " + str4.substring(1, 4)); // rog

        // 5. Uppercase conversion
        String str5 = "java";
        System.out.println("\"" + str5 + "\".toUpperCase() \u2192 " + str5.toUpperCase()); // JAVA

        // 6. Lowercase conversion
        String str6 = "HELLO";
        System.out.println("\"" + str6 + "\".toLowerCase() \u2192 " + str6.toLowerCase()); // hello

        // 7. Remove spaces
        String str7 = "   Welcome to Java   ";
        System.out.println("Before trim: \"" + str7 + "\"");
        System.out.println("After trim: \"" + str7.trim() + "\"");

        // 8. Replace characters
        System.out.println("\"Java\".replace('a','o') \u2192 " + "Java".replace('a','o')); // Jovo

        // 9. Equals comparison
        System.out.println("\"java\".equals(\"java\") \u2192 " + "java".equals("java")); // true
        System.out.println("\"Java\".equals(\"java\") \u2192 " + "Java".equals("java")); // false

        // 10. Ignore case equality
        System.out.println("\"Java\".equalsIgnoreCase(\"java\") \u2192 " + "Java".equalsIgnoreCase("java")); // true
    }
}