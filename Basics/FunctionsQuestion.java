// Write a method to check if a number is prime(parameterised , return type boolean)
// Write a method to print multiplication table of a given number(parameterised and void )
// Write a method to find factorial of a number ( parameterised , return type int)
// Write a method without parameters that prints keep learning java
// Overload a method max() to return maximum of two intergers and doubles
// 
class FunctionsQuestion{
    boolean isPrime(int n){
        if (n <= 1)
             return false;
         // Check divisibility from 2 to n-1
         for (int i = 2; i < n; i++)
             if (n % i == 0)
                 return false;
         return true; 
    }
}