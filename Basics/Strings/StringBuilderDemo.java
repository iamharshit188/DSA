public class StringBuilderOperationsDemo {
    public static void main(String[] args) {
        
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - Adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb); // Hello World

        // 2. insert() - Inserts text at a specific index
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Hello Java World

        // 3. delete() - Removes part of text
        sb.delete(1, 4); 
        // deletes characters from index 1 (inclusive) to 4 (exclusive)
        System.out.println("After delete: " + sb); // Ho Java World

        // 4. reverse() - Reverses the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb); // dlroW avaJ oH
    }
}