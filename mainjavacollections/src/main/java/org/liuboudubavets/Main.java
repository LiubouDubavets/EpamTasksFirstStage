package org.liuboudubavets;

public class Main {
    public static void main(String[] args) {

        Necklace necklace = new Necklace();
        necklace.constructionGemList();
        necklace.constructionNecklace();
        necklace.printingListOfGemsInNecklace();
        necklace.countTotalWeightAndPrice();
        necklace.sortedListOfGems();
        necklace.listOfGemsFilteredByClarityRange();
    }
}