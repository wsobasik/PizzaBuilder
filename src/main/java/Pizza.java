public class Pizza {


    public enum Size {XXL, MEDIUM, SMALL}

    ;

    public enum Sauce {cheese, garlic, creme, tomato;
    }

    ;

    public boolean edgesCheese;


    public Pizza(boolean edgesCheese) {
        Size size = Size.MEDIUM;
        Sauce sause = Sauce.tomato;
        this.edgesCheese = edgesCheese;
    }

    public boolean isEdgesCheese() {
        return edgesCheese;
    }

    public void setEdgesCheese(boolean edgesCheese) {
        this.edgesCheese = edgesCheese;
    }
}
