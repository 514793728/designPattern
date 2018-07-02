package 策略模式.newType.duck;

import 策略模式.newType.fly.NoFlyImpl;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:46
 * Description:
 */
public class MainTest {

    public static void main(String[] args){
        Duck greenDuck = new GreenDuck();
        greenDuck.fly();
        greenDuck.quack();
        greenDuck.display();

        greenDuck.setiFly(new NoFlyImpl());
        greenDuck.fly();
    }

}
