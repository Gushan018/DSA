public class RabbitProblem {
    
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        
        long a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void printRabbitGrowth(int months) {
        System.out.println("Month\tRabbit Pairs");
        System.out.println("-----   ------------");
        for (int i = 0; i <= months; i++) {
            System.out.println(i + "\t" + fibonacciIterative(i));
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Classic Rabbit Problem (Fibonacci) ===\n");
        
        System.out.println("Number of rabbit pairs after 12 months:");
        System.out.println("Iterative: " + fibonacciIterative(12));  
        System.out.println("Recursive: " + fibonacciRecursive(12));  
        
        System.out.println("\nGrowth over first 15 months:");
        printRabbitGrowth(15);
        
        System.out.println("\nNote: Month 0 = 0, Month 1 = 1, Month 2 = 1, Month 3 = 2, etc.");
    }
}