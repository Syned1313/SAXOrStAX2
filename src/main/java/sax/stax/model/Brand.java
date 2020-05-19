package sax.stax.model;

import java.util.Objects;

public class Brand {
    private String carBrand;

    public Brand() {
    }

    public Brand(String brand) {
        this.carBrand = brand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return Objects.equals(carBrand, brand.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "carBrand='" + carBrand + '\'' +
                '}';
    }
}
