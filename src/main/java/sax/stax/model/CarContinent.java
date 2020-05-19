package sax.stax.model;

import java.util.Objects;

public class CarContinent {
    private String carContinent;

    public CarContinent(){
    }
    public CarContinent(String carContinent) {
        this.carContinent = carContinent;
    }

    public String getCarContinent() {
        return carContinent;
    }

    public void setCarContinent(String carContinent) {
        this.carContinent = carContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarContinent that = (CarContinent) o;
        return Objects.equals(carContinent, that.carContinent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carContinent);
    }

    @Override
    public String toString() {
        return "CarContinent{" +
                "carContinent='" + carContinent + '\'' +
                '}';
    }
}
