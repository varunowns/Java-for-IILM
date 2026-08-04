class VariableScopeDemonstrator {

    // 1. Static (Class) Variable
    // Allocated once per class in the Method Area.
    // Outlives all individual objects and lasts for the entire program runtime.
    private static int staticCounter = 0;

    // 2. Instance (Object) Variable
    // Allocated on the Heap every time a new object is instantiated.
    // Lives as long as its owning object lives.
    private int instanceCounter = 0;

    /**
     * Executes a process to show variable behavior during sequential calls.
     */
    public void demonstrateVariables(String objectName) {
        // 3. Local Variable
        // Allocated on the Stack every time this method is invoked.
        // Destroyed immediately when the method block exits.
        int localCounter = 0;

        // Increment all three types of variables
        localCounter++;
        this.instanceCounter++;
        VariableScopeDemonstrator.staticCounter++;

        // Print the state of variables for this specific execution
        System.out.printf("%-10s | Local: %-5d | Instance: %-8d | Static: %-6d%n",
                objectName, localCounter, this.instanceCounter, VariableScopeDemonstrator.staticCounter);
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-17s | %-13s%n", "Object", "Local Var", "Instance Var", "Static Var");
        System.out.println("---------------------------------------------------------------");

        // Scenario 1: Test with a single object instance over multiple calls
        System.out.println("[Testing Object A - Call 1 to 3]");
        VariableScopeDemonstrator objectA = new VariableScopeDemonstrator();
        objectA.demonstrateVariables("Obj_A");
        objectA.demonstrateVariables("Obj_A");
        objectA.demonstrateVariables("Obj_A");

        System.out.println("---------------------------------------------------------------");

        // Scenario 2: Test with a brand new object instance
        System.out.println("[Testing Object B - Call 1 to 2]");
        VariableScopeDemonstrator objectB = new VariableScopeDemonstrator();
        objectB.demonstrateVariables("Obj_B");
        objectB.demonstrateVariables("Obj_B");

        System.out.println("---------------------------------------------------------------");
    }
}
