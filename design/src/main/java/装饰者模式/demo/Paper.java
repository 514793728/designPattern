package 装饰者模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 23:29
 * Description:
 */
public class Paper extends Decorator {

    public Paper(Goods goods) {
        super(goods);
        super.setDesc("报纸");
        super.setWeight(1.0f);
    }
}
