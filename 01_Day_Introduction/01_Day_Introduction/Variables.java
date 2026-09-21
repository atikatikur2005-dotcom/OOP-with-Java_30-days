public class Variables {
    public static void main(String[] args) {

        // 1. Integer
        int age = 22;
        System.out.println(age);

        // 2. Decimal
        double price = 99.99;
        System.out.println(price);

        // 3. Character
        char grade = 'A';
        System.out.println(grade);

        // 4. Boolean
        boolean isStudent = true;
        System.out.println(isStudent);

        // 5. String
        String name = "Atik";
        System.out.println(name);

        // 6. Multiple variables
        int x = 10, y = 20, z = 30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // 7. Changing variable value
        int number = 10;
        System.out.println(number);

        number = 20;
        System.out.println(number);

        // 8. Final variable (constant)
        final double PI = 3.14159;
        System.out.println(PI);

        // 9. Different data types together
        int myAge = 22;
        double height = 5.3;
        char myGrade = 'A';
        boolean student = true;
        String myName = "Atik";

        System.out.println("Name: " + myName);
        System.out.println("Age: " + myAge);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + myGrade);
        System.out.println("Student: " + student);

        // 10. Variable with calculation
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Sum: " + sum);

        // 11. Type casting
        int num = 10;
        double converted = num;

        System.out.println(converted);

        // 12. Explicit type casting
        double value = 10.99;
        int convertedValue = (int) value;

        System.out.println(convertedValue);
    }
}
