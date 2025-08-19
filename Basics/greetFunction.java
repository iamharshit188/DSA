// class greetFunction {

//     static void greet() {
//         System.out.println("Hello World");
//     }

//     public static void main(String[] args) {
//         greet();
//         greet();
//     }
// }
// class greetFunction{
//     static String getMessage(){
//         return "Java is Awesome";
//     }
//     public static void main(String[] args){
//         System.out.println(getMessage());
//     }
// }
//
class Example {

    static void greet(String name) {
        System.out.println("Hello," + name + "!");
    }

    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");
        greet("Harry");
    }
}
