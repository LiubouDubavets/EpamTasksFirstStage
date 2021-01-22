package org.liuboudubavets;
public class House {
    int id;
    private int apartmentNumber;
    private double square;
    private int floor;
    private int numberOfRooms;
    private String street;
    TypeOfBuilding typeOfBuilding;
    private int technicalLifetime;

    public House(int id, int apartmentNumber, double square, int floor, int
            numberOfRooms, int technicalLifetime, String street, TypeOfBuilding typeOfBuilding) {

        this.id=id;
        this.apartmentNumber=apartmentNumber;
        this.square=square;
        this.floor=floor;
        this.numberOfRooms=numberOfRooms;
        this.street=street;
        this.technicalLifetime=technicalLifetime;
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public TypeOfBuilding getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(TypeOfBuilding typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getTechnicalLifetime() {
        return technicalLifetime;
    }

    public void setTechnicalLifetime(int technicalLifetime) {
        this.technicalLifetime = technicalLifetime;
    }

    public static String toString(House house){
        return "Apartment ID: "+ house.getId()+"; number of apartment: "+ house.getApartmentNumber()
                +"; total square of apartment: "+ house.getSquare()+"; floor: "+ house.getFloor()+
                ";\n       number of rooms in apartment: "+ house.getNumberOfRooms()+"; street: "+ house.getStreet()
                + "; technical lifetime of the building: "+ house.getTechnicalLifetime()
                + ";\n       type of building: "+ house.getTypeOfBuilding();
    }
}