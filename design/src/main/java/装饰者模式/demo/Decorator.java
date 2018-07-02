package 装饰者模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 23:26
 * Description:
 */
public class Decorator extends Goods {
    Goods goods;

    public Decorator(Goods goods) {
        this.goods = goods;
    }

    @Override
    public float weighting() {
        return super.getWeight() + goods.weighting();
    }

    public String getDesc() {
        return super.getDesc() +"("+super.getWeight()+")，"+ goods.getDesc();

    }
}
