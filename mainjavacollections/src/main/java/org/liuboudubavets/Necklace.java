package org.liuboudubavets;

import org.liuboudubavets.Gems.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Necklace {
    ArrayList<Gem> gemList = new ArrayList<Gem>();
    ArrayList<Gem> necklace = new ArrayList<Gem>();

    public void constructionGemList()  {
        gemList.addAll(Gem.readGemList());
        System.out.println("List of gems.\n" +
                           "_____________");
        for (int i = 0; i < gemList.size(); i++) {
            System.out.println((i + 1) + " - " + gemList.get(i).toString());
        }
    }

     public ArrayList<Gem> constructionNecklace(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What gems you would like to add to the necklace?\n" +
                " Please, write numbers of element to add gems to the necklace.");
        String stringOfIndexGemsToAdd = scan.nextLine();
        for (String s: stringOfIndexGemsToAdd.split(" ")) {
            necklace.add(gemList.get(Integer.parseInt(s)-1));
        }
        return necklace;
    }

    public void printingListOfGemsInNecklace(){
        System.out.println("List of gems in necklace.");
        for (int i = 0; i<necklace.size(); i++){
            System.out.println((i+1)+" - "+ necklace.get(i).toString());
        }
    }

    public void countTotalWeightAndPrice() {
        double totalWeightInCarats = 0;
        double totalPriceInDollars = 0;
        for(int i=0; i<necklace.size(); i++){
            totalWeightInCarats += necklace.get(i).getCarats();
            totalPriceInDollars += necklace.get(i).getPriceOfTheGem();
        }
        System.out.println("Total weight of gems in necklace: " + totalWeightInCarats + " carats.\n" +
                "Total price of gems in necklace: $" + totalPriceInDollars+".");
    }

    public void sortedListOfGems() {
        Collections.sort(necklace, Comparator.comparingDouble(Gem::getPriceOfTheGem));
        System.out.println("After sort by price of the Gem");
        for (Gem gem: necklace){
            System.out.println(gem.toString());
        }
    }

    public void listOfGemsFilteredByClarityRange() {
        System.out.println("Please, insert minimum clarity to choose.");
        Scanner scanMin = new Scanner(System.in);
        int minClarity = Integer.parseInt(scanMin.nextLine());
        System.out.println("Please, insert maximum clarity to choose.");
        Scanner scanMax = new Scanner(System.in);
        int maxClarity = Integer.parseInt(scanMax.nextLine());
        for (int i=0; i<necklace.size(); i++) {
            if (necklace.get(i).getClarityGrade() <= maxClarity&&necklace.get(i).getClarityGrade() >= minClarity) {
                    System.out.println(necklace.get(i).toString());
                }
        }
    }
}
