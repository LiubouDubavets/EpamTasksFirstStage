package org.liuboudubavets;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        House apartmentForTwo = new House(1, 23, 54.2, 4,
                2, 50, "1st Street", TypeOfBuilding.TOWNHOUSE);
        House familyApartment = new House(2, 10, 100, 3, 4,
                100, "Ruby Street", TypeOfBuilding.APARTMENT);
        House singleApartment = new House(3, 120, 37.5, 14,
                1, 100, "2nd Street", TypeOfBuilding.COOP);
        House partOfHouse = new House(4, 2, 98.5, 1, 4,
                100, "Tawny Street", TypeOfBuilding.BUNGALOW);
        House cityVilla = new House(5, 1, 210.5, 1, 7,
                150, "Country Street", TypeOfBuilding.VILLA);
        ArrayList<House> houses = new ArrayList<House>();
        houses.add(apartmentForTwo);
        houses.add(familyApartment);
        houses.add(singleApartment);
        houses.add(partOfHouse);
        houses.add(cityVilla);

        System.out.println("Hello!\n > What kind of sorting would you like to make:\n" +
                " >> 1 - by number of rooms\n" +
                " >> 2 - by number of rooms and floor range\n" +
                " >> 3 - by minimum square\n" +
                " >> 4 - get information about all apartments");
        Scanner scan = new Scanner(System.in);
        String choosingOfSorting = scan.nextLine();
        switch (choosingOfSorting) {
            case "1": {
                OperationsWithArrayOfHouses.findHouseByNumberOfRooms(houses);
                break;
            }
            case "2": {
                OperationsWithArrayOfHouses.findHouseByNumberOfRoomsAndFloor(houses);
                break;
            }
            case "3": {
                OperationsWithArrayOfHouses.findHouseBySquare(houses);
                break;
            }
            case "4": {
                for (int i = 0; i < houses.size(); i++) {
                    System.out.println(House.toString(houses.get(i)));
                }
            }
        }
    }
}