package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:43
 * Description:
 */
public class MainTest {

    public static void main(String[] args){

        Drink order;

        order = new MokaCoffee();
        order = new Milk(order);
        order = new Chocolate(order);

        System.out.println("desc :" + order.getDesc());
        System.out.println("price :" + order.cost());
    }
}
