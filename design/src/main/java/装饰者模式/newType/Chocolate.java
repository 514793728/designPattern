package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:40
 * Description:
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDesc("chocolate");
        super.setPrice(3.0f);
    }
}
