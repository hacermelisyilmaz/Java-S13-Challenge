package employeeApp;

public enum Plan {
    PLAN1("111", 1.1),
    PLAN2("222", 2.2);

    public String name;
    public double price;

    private Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
