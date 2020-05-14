package cookies;

public class CookieOrder {

    private int numBoxes;
    private String variety;

    public CookieOrder(String localVariety, int localNumBoxes) { //constructions
        this.numBoxes = localNumBoxes;
        this.variety = localVariety;
    }

    public int getNumberBoxes() { //accessors
        return this.numBoxes;
    }

    public String getVariety() { //accessors
        return this.variety;
    }
}
