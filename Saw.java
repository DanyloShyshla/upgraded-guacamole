package com.company;

public class Saw {

    String name;

    private int power;

    private int wheeling;

    private int weight;

    private int price;

    public static int sawQuantity;

    protected int chainSpeed;

    protected int oilReservoir;

    public Saw() {
        this("Still-14", 1800, 9, 4, 3999, 300, 2);
    }

    public Saw(String name, int power, int wheeling, int weight, int price) {
        this(name, power, wheeling, weight, price, 300, 2);
    }

    public Saw(String name, int power, int wheeling, int weight, int price, int chainSpeed, int oilReservoir) {
        this.name = name;
        this.power = power;
        this.wheeling = wheeling;
        this.weight = weight;
        this.price = price;
        this.chainSpeed = chainSpeed;
        this.oilReservoir = oilReservoir;
        Saw.sawQuantity++;
    }

    //@Override
    public String toString() {
        return "Saw{" +
                "name='" + name + '\'' +
                ", power=" + power + "VT" +
                ", wheeling=" + wheeling + "m/sec" +
                ", weight=" + weight + "KG" +
                ", price=" + price + "UAN" +
                ", chainSpeed=" + chainSpeed + "m/sec" +
                ", oilReservoir=" + oilReservoir + "L" +
                '}';
    }

    public static void printStaticSawQuontity() {
        System.out.println("The saw quantity is " + sawQuantity);
    }

    public void printSawQuontity() {
        Saw.printStaticSawQuontity();
    }

    public void resetValues(String name, int power, int wheeling, int weight, int price, int chainSpeed, int oilReservoir) {
        this.name = name;
        this.power = power;
        this.wheeling = wheeling;
        this.weight = weight;
        this.price = price;
        this.chainSpeed = chainSpeed;
        this.oilReservoir = oilReservoir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWheeling() {
        return wheeling;
    }

    public void setWheeling(int wheeling) {
        this.wheeling = wheeling;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getSawQuantity() {
        return sawQuantity;
    }

    public static void setSawQuantity(int sawQuantity) {
        Saw.sawQuantity = sawQuantity;
    }

    public int getChainSpeed() {
        return chainSpeed;
    }

    public void setChainSpeed(int chainSpeed) {
        this.chainSpeed = chainSpeed;
    }

    public int getOilReservoir() {
        return oilReservoir;
    }

    public void setOilReservoir(int oilReservoir) {
        this.oilReservoir = oilReservoir;
    }
}