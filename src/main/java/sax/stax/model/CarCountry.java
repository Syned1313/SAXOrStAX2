package sax.stax.model;

import java.util.Objects;

public class CarCountry {
    private String carCountry;

    public CarCountry(){
    }

    public CarCountry(String carCountry) {
        this.carCountry = carCountry;
    }

    public String getCarCountry() {
        return carCountry;
    }

    public void setCarCountry(String carCountry) {
        this.carCountry = carCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarCountry that = (CarCountry) o;
        return Objects.equals(carCountry, that.carCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carCountry);
    }

    @Override
    public String toString() {
        return "CarCountry{" +
                "carCountry='" + carCountry + '\'' +
                '}';
    }
}
