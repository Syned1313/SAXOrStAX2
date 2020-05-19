package sax.stax.model;

public class Car {
    private String type;
    private String engine;

    public Car() {
    }

    public Car(String type, String engine) {
        this.type = type;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
