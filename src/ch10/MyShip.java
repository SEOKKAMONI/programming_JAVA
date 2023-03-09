package ch10;

public class MyShip extends Ship{
    private String name;

    public MyShip(String name) {
        this.name = name;
    }

    @Override
    public int maxPassengers() {
        return 10;
    }

    @Override
    public int maxLuggage() {
        return 10;
    }

    public String getName() {
        return name;
    }
}
