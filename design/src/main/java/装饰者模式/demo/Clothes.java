package 装饰者模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 23:16
 * Description:
 */
public class Clothes extends Goods {
    @Override
    public float weighting() {
        return super.getWeight();
    }

    public Clothes() {
        super.setWeight(10.0f);
        super.setDesc("衣服("+super.getWeight()+")");
    }
}
