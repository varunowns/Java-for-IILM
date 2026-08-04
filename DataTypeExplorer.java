class DataTypeExplorer {
    public static void main(String[] args) {

        // Primitive Data Types
        byte b = 100;
        short s = 200;
        int i = 1000;
        long l = 10000L;
        float f = 12.5f;
        double d = 25.75;
        char c = 'A';
        boolean flag = true;

        System.out.println("Primitive Data Types:");
        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d + " " + c + " " + flag);

        // Implicit Casting
        int x = 50;
        double y = x;
        System.out.println("\nImplicit Casting: " + y);

        // Explicit Casting
        double p = 99.99;
        int q = (int) p;
        System.out.println("Explicit Casting: " + q);
        
        // Overflow
        byte max = 127;
        max++;
        System.out.println("Overflow: " + max);
    }
}