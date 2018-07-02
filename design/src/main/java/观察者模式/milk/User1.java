package 观察者模式.milk;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 21:16
 * Description:
 */
public class User1 implements Observer {

    @Override
    public void update(Object object) {
        System.out.println("-----user1获取到更新----------");

        Milk milk = (Milk) object;
        //获取牛奶公司推送来的消息（这里只做简单的展示）
        System.out.println("最新牛奶品种：" +milk.getType());
        System.out.println("最新牛奶价格：" +milk.getPrice());
    }
}
