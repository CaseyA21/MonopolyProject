//Board Space implementation for Properties
public class Utilities extends BoardElement {
    private final int price;
    private Player owner;

    public Utilities(String name, int price) {
        super(name, SpaceType.INCOME_TAX);
        this.price = price;
        this.owner = null;

    }

    public Player getOwner() {
        return owner;
    }


    public Integer getPrice() {
        return price;
    }

    public void setOwner(Player player) {
        owner = player;
    }

    @Override
    public void triggerAction(Player player) {

    }
}
