package 装饰者模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 23:31
 * Description:
 */
public class Foam extends Decorator {
    public Foam(Goods goods) {
        super(goods);
        super.setDesc("泡沫");
        super.setWeight(0.5f);
    }
}
