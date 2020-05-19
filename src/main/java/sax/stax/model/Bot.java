package sax.stax.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Bot {
    private Integer id;
    private String name;
    private String surname;
    private int password;
    private int age;
    private String country;
    private String city;
    private String street;
    private int numberOfBuilding;
    private String serial;
    private List<Car> cars;
    private Map<CarContinent, CarCountry> carCountriesContinents;
    private Set<Brand> carBrands;

    public Bot() {
    }

    public Bot(Integer id, String name, String surname, int password, int age, String country, String city, String street, int numberOfBuilding, String serial, List<Car> cars, Map<CarContinent, CarCountry> carCountriesContinents, Set<Brand> carBrands) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.age = age;
        this.country = country;
        this.city = city;
        this.street = street;
        this.numberOfBuilding = numberOfBuilding;
        this.serial = serial;
        this.cars = cars;
        this.carCountriesContinents = carCountriesContinents;
        this.carBrands = carBrands;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfBuilding() {
        return numberOfBuilding;
    }

    public void setNumberOfBuilding(int numberOfBuilding) {
        this.numberOfBuilding = numberOfBuilding;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Map<CarContinent, CarCountry> getCarCountriesContinents() {
        return carCountriesContinents;
    }

    public void setCarCountriesContinents(Map<CarContinent, CarCountry> carCountriesContinents) {
        this.carCountriesContinents = carCountriesContinents;
    }

    public Set<Brand> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Set<Brand> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return password == bot.password &&
                age == bot.age &&
                numberOfBuilding == bot.numberOfBuilding &&
                Objects.equals(id, bot.id) &&
                Objects.equals(name, bot.name) &&
                Objects.equals(surname, bot.surname) &&
                Objects.equals(country, bot.country) &&
                Objects.equals(city, bot.city) &&
                Objects.equals(street, bot.street) &&
                Objects.equals(serial, bot.serial) &&
                Objects.equals(cars, bot.cars) &&
                Objects.equals(carCountriesContinents, bot.carCountriesContinents) &&
                Objects.equals(carBrands, bot.carBrands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, password, age, country, city, street, numberOfBuilding, serial, cars, carCountriesContinents, carBrands);
    }

    @Override
    public String toString() {
        return "Bot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password=" + password +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberOfBuilding=" + numberOfBuilding +
                ", serial='" + serial + '\'' +
                ", cars=" + cars +
                ", carCountriesContinents=" + carCountriesContinents +
                ", carBrands=" + carBrands +
                '}';
    }
}
