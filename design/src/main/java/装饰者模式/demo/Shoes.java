package 装饰者模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 23:25
 * Description:
 */
public class Shoes extends Goods {
    @Override
    public float weighting() {
        return super.getWeight();
    }

    public Shoes() {
        super.setWeight(5.0f);
        super.setDesc("鞋子("+super.getWeight()+")");
    }
}
