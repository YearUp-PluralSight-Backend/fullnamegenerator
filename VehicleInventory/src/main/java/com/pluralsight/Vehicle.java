package com.pluralsight;

import java.util.Objects;

/**
 * representing a vehicle in the vehicle inventory system
 * it has five properties, including vehicleId, makeModel, color, odometerReading, price
 * it has two constructors, getters and setters.
 */
public class Vehicle {

    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle() {
    }

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return getVehicleId() == vehicle.getVehicleId() && getOdometerReading() == vehicle.getOdometerReading() && Float.compare(getPrice(), vehicle.getPrice()) == 0 && Objects.equals(getMakeModel(), vehicle.getMakeModel()) && Objects.equals(getColor(), vehicle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVehicleId(), getMakeModel(), getColor(), getOdometerReading(), getPrice());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }

    /**
     * display the vehicle infomation
     */
    public void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Make & Model: " + makeModel);
        System.out.println("Color: " + color);
        System.out.println("Odometer: " + odometerReading + " miles");
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
