package wavetechstudio.thefactorypattern

public class BreadFactory {

    companion object {
        final val BRI = "BRI"
        final val BAG = "BAG"
        final val ROL = "ROL"
    }

    public fun getBread(string: String): Bread {
        return if (string.equals(BRI)) {
            Brioche()
        } else if (string.equals(BAG)) {
            Baugette()
        } else if (string.equals(ROL)) {
            Roll()
        } else {
            Roll()
        }
    }
}