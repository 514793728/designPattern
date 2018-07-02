package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:41
 * Description:
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        super.setDesc("milk");
        super.setPrice(6.0f);
    }
}
