package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:33
 * Description:
 */
public class MokaCoffee extends Coffee {

    public MokaCoffee() {
        super.setPrice(10.0f);
        super.setDesc("Moka Coffee" + super.getPrice());
    }
}
