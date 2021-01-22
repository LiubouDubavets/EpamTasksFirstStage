package org.liuboudubavets;
import java.util.ArrayList;
import java.util.Scanner;

public class OperationsWithArrayOfHouses {

    public static void findHouseByNumberOfRooms(ArrayList<House> houses){
        System.out.println("What number of rooms you would like to be in your house?");
        Scanner scan = new Scanner(System.in);
        int expectedNumberOfRooms = Integer.parseInt(scan.nextLine());
        System.out.println("Expected number of rooms --- "+ expectedNumberOfRooms);
        ArrayList<House> housesSortByNumberOfRooms = new ArrayList<House>();
        for (int i=0; i<houses.size(); i++){
            if(houses.get(i).getNumberOfRooms() == expectedNumberOfRooms){
                housesSortByNumberOfRooms.add(houses.get(i));
                System.out.println("Information about apartment "+ (i+1));
            }
        }
        for (int i=0; i<housesSortByNumberOfRooms.size(); i++) {
            System.out.println(House.toString(housesSortByNumberOfRooms.get(i)));
        }
    }

    public static void findHouseByNumberOfRoomsAndFloor(ArrayList<House> houses){
        System.out.println("What number of rooms you would like to be in your house?");
        Scanner scan = new Scanner(System.in);
        int expectedNumberOfRooms = Integer.parseInt(scan.nextLine());
        System.out.println("Starting from what floor you would like to be your house?");
        Scanner scanFloorBegin = new Scanner(System.in);
        int expectedFloorBegin = Integer.parseInt(scanFloorBegin.nextLine());
        System.out.println("And ending what floor you would like to be your house?");
        Scanner scanFloorEnd = new Scanner(System.in);
        int expectedFloorEnd = Integer.parseInt(scanFloorEnd.nextLine());
        System.out.println("Expected number of rooms --- "+ expectedNumberOfRooms+"; expected floor: "+
                expectedFloorBegin+ "--"+ expectedFloorEnd);
        ArrayList<House> housesSortByNumberOfRoomsAndFloor = new ArrayList<House>();
        for (int i=0; i<houses.size(); i++){
            if(houses.get(i).getNumberOfRooms() == expectedNumberOfRooms &&
                    houses.get(i).getFloor()>=expectedFloorBegin && houses.get(i).getFloor()<=expectedFloorEnd){
                housesSortByNumberOfRoomsAndFloor.add(houses.get(i));
            }
        }
        if(housesSortByNumberOfRoomsAndFloor.size()>0) {
            for (int i = 0; i < housesSortByNumberOfRoomsAndFloor.size(); i++) {
                System.out.println(House.toString(housesSortByNumberOfRoomsAndFloor.get(i)));
            }
        }
        else System.out.println("There is no apartments with acceptable to you parameters.\n" +
                "Please, try to insert another parameters.");
    }

    public static void findHouseBySquare(ArrayList<House> houses){
        System.out.println("What minimum square you would like to be your house?");
        Scanner scan = new Scanner(System.in);
        int expectedMinSquare = Integer.parseInt(scan.nextLine());
        System.out.println("Expected min square  --- "+ expectedMinSquare);
        ArrayList<House> housesSortBySquare = new ArrayList<House>();
        for (int i=0; i<houses.size(); i++){
            if(houses.get(i).getSquare() >= expectedMinSquare){
                housesSortBySquare.add(houses.get(i));
            }
        }
        for (int i=0; i<housesSortBySquare.size(); i++) {
            System.out.println("Information about apartment: " + House.toString(housesSortBySquare.get(i)));
        }
    }
}