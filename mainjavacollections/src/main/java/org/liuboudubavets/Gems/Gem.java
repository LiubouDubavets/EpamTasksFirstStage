package org.liuboudubavets.Gems;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Gem implements Serializable {
    double carats;
    double priceForTheCarat;
    ColorOfGem colorOfGem;
    Cut cut;
    int clarityGrade;
    static final long serialVersionUID = 1L;

    public Gem(double carats, double priceForTheCarat,
               ColorOfGem colorOfGem, Cut cut, int clarityGrade) {

        this.carats = carats;
        this.priceForTheCarat = priceForTheCarat;
        this.colorOfGem = colorOfGem;
        this.cut = cut;
        this.clarityGrade = clarityGrade;
    }

    public double getPriceForTheCarat() {
        return priceForTheCarat;
    }

    public void setPriceForTheCarat(double priceForTheCarat) {
        this.priceForTheCarat = priceForTheCarat;
    }

    public double getPriceOfTheGem() {
        return (getCarats() * getPriceForTheCarat());
    }

    public double getCarats() {
        return carats;
    }

    public void setCarats(double carats) {
        this.carats = carats;
    }

    public ColorOfGem getColorOfGem() {
        return colorOfGem;
    }

    public Cut getCut() {
        return cut;
    }

    public void setCut(Cut cut) {
        this.cut = cut;
    }

    public void setColorOfGem(ColorOfGem colorOfGem) {
        this.colorOfGem = colorOfGem;
    }

    public int getClarityGrade() {
        return clarityGrade;
    }

    public void setClarityGrade(int clarityGrade) {
        this.clarityGrade = clarityGrade;
    }

    public String toString() {
        return "Gem: \n carats - " + getCarats() + ";\n price - $" +
                getPriceOfTheGem() + ";\n cut of the precious gem - " + getCut() +
                ";\n clarity grade - " + getClarityGrade() + " units.";
    }

    public static List<Gem> readGemList() {
       List<Gem> gemArrayList = new ArrayList<Gem>();
        try {
           FileInputStream fis = new FileInputStream("mainjavacollections/resources/gemList.dat");
           ObjectInputStream ois = new ObjectInputStream(fis);
           gemArrayList = (ArrayList<Gem>) ois.readObject();
           ois.close();
        }
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException fnfex) {
            fnfex.printStackTrace();
        }
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
        return gemArrayList;
    }
}