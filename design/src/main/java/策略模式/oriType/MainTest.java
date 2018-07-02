package 策略模式.oriType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:04
 * Description:测试类
 */
public class MainTest {
    public static void main(String[] args){
        GreenHeadDuck green = new GreenHeadDuck();
        RedHeadDuck red = new RedHeadDuck();

        green.display();
        green.quack();
        green.swim();
        green.fly();

        red.display();
        red.quack();
        red.swim();
        red.fly();
    }
}
