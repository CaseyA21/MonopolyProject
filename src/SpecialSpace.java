import java.util.ArrayList;
import java.util.Random;


public class IncomeTax extends BoardElement{
    private final int price;
    private final int rent;
    private Player owner;

    public IncomeTax(String name, int price, int rent) {
        super(name, SpaceType.INCOME_TAX);
        this.price = price;
        this.rent = rent;
        this.owner = null;

    }


    public int getRent() {
        return rent;
    }


    public Player getOwner() {
        return owner;
    }


    public Integer getPrice() {
        return price;
    }
    public void setOwner(Player player){
        owner = player;
    }

    @Override
    public void triggerAction(Player player) {

    }





}
