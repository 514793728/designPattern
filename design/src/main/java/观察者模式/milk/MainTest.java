package 观察者模式.milk;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 21:30
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        MilkEnterprise enterprise = new MilkEnterprise();
        enterprise.addObserver(new User1()); //登记用户1到牛奶公司
        enterprise.addObserver(new User2());//登记用户2到牛奶公司
        enterprise.setData(new Milk("酸奶",66.0f)); //牛奶公司有新牛奶出品
    }
}
