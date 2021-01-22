package org.liuboudubavets.Gems.GemsPackage;

import org.liuboudubavets.Gems.ColorOfGem;
import org.liuboudubavets.Gems.Cut;
import org.liuboudubavets.Gems.Gem;
import org.liuboudubavets.Gems.TypeOfSemiPreciousGem;

import java.io.Serializable;

public class SemiPreciousGem extends Gem implements Serializable {
    private TypeOfSemiPreciousGem typeOfSemiPreciousGem;
    private static final long serialVersionUID = 1L;
    public SemiPreciousGem(double carats, double priceForTheCarat, ColorOfGem colorOfGem, Cut cut,
                           int clarityGrade, TypeOfSemiPreciousGem typeOfSemiPreciousGem) {
        super(carats, priceForTheCarat, colorOfGem, cut, clarityGrade);
        this.typeOfSemiPreciousGem = typeOfSemiPreciousGem;
    }

    public String toString() {
        return super.toString().replace("Gem:",
                "Semi-precious gem: " + typeOfSemiPreciousGem);
    }
}
