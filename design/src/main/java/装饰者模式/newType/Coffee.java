package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:32
 * Description:
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
