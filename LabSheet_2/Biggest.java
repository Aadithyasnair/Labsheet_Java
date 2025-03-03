class Biggest {
       // Method to find the biggest of two numbers
       static int findBiggest(int a, int b) {
        return (a > b) ? a : b;
    }

    // method to find the biggest of three numbers
    static int findBiggest(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c) ? b : c;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 35;
        
    System.out.println("Biggest of " + num1 + " and " + num2 + " is: " +Biggest.findBiggest(num1, num2));
    System.out.println("Biggest of " + num1 + ", " + num2 + " and " + num3 + " is: " + Biggest.findBiggest(num1, num2, num3));
    }
}
