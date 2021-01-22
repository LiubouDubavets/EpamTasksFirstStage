package org.liuboudubavets.Gems.GemsPackage;

import org.liuboudubavets.Gems.ColorOfGem;
import org.liuboudubavets.Gems.Cut;
import org.liuboudubavets.Gems.Gem;
import org.liuboudubavets.Gems.TypeOfPreciousGem;

import java.io.Serializable;

public class PreciousGem extends Gem implements Serializable {
    private TypeOfPreciousGem typeOfPreciousGem;
    private static final long serialVersionUID = 1L;
    public PreciousGem(double carats, double priceForTheCarat, ColorOfGem colorOfGem, Cut cut,
                       int clarityGrade, TypeOfPreciousGem typeOfPreciousGem) {
        super(carats, priceForTheCarat, colorOfGem, cut, clarityGrade);
        this.typeOfPreciousGem = typeOfPreciousGem;
    }

    public TypeOfPreciousGem getTypeOfPreciousGem() {
        return typeOfPreciousGem;
    }

    public void setTypeOfPreciousGem(TypeOfPreciousGem typeOfPreciousGem) {
        this.typeOfPreciousGem = typeOfPreciousGem;
    }

    public String toString(){
        return super.toString().replace("Gem:",
                "Precious gem: " + typeOfPreciousGem);
    }
}
