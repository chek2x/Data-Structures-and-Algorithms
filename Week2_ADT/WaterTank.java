public class WaterTank {
    // properties-attribute, characteristics, data fields or data members
    private String name, brand, color, height;
    private double capacity, currentWater, weight;

    WaterTank tank; // This is declared for copy constructor purpose

    /**
     * 4 Operations of ADT
     * 1. Creator (constructor) : used to initialize properties or object
     * 2. Transformer (setter) : sets/change its value or state to an object
     * 3. Observer (getter) : returns a value of an object
     * 4. Input/Output (data or values) : entry give by users
     */

    /**
     * Types of constructor
     * 1. default - automatically created, no parameter
     * 2. parameterized - with parameters
     * 3. copy - copies an object
     */

    public WaterTank() { // default constructor
        capacity = 1000.00;
        currentWater = 0.00;
    }

    public WaterTank(double capacity) { // Parametertized constructor with 1 parameter
        this.capacity = capacity;
        currentWater = 0.00;
    }

    public WaterTank(String name, double capacity) { // Parameterized constructor with 2 parameters
        this.name = name;
        this.capacity = capacity;
        currentWater = 0.00;
    }

    public WaterTank(String name, String brand, double capacity) { // Parameterized constructor with 2 parameters
        this.name = name;
        this.capacity = capacity;
        setBrand(brand);
        currentWater = 0.00;
    }

    public WaterTank(WaterTank tank) { // Copy constructor
        this.tank = tank;
    }
    // ----Behavior of a class or an object

    // Below are the class setters (also known as mutators)

    /**
     * This method fills water to the tank
     * 
     * @param amount
     * @author martzelbaste
     */
    public void addWater(double amount) {
        currentWater += amount;
    }

    public void removeWater(double amount) {
        currentWater -= amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    // Below are the class getters (a.k.a accessors)
    /**
     * This method return <b>curernt water</b> of the tank
     */
    public double getCurrentWater() {
        return currentWater;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return (currentWater == 0);
    }

    public boolean isFull() {
        return (currentWater >= capacity);
    }

    public double getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double remainingCapacity() {
        return capacity - currentWater;
    }

    // You are NOT binded with setter and getter rules, you can do like this
    public double clearWater() { // This method is a combination of both setter and getter
        double wastage = currentWater;
        currentWater = 0.00;
        return wastage;
    }
}
