package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:36
 * Description:
 */
public class Decorator extends Drink {

    private Drink drink;  //装饰的对象

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "-" + super.getPrice() + " && " + drink.getDesc();
    }

    public Decorator(Drink drink) {
        this.drink = drink;
    }
}
