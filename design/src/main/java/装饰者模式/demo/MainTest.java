package 装饰者模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 23:32
 * Description:
 */
public class MainTest {
    public static void main(String[] args){

        Goods goods;

        goods = new Clothes(); //快递衣服
        goods = new Paper(goods); //用纸包装
        goods = new Foam(goods); //同时加上泡沫
        System.out.println("该快递包含的有： "+goods.getDesc());
        System.out.println("该快递总重量为： "+goods.weighting());
    }
}
