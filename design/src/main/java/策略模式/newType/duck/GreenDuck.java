package 策略模式.newType.duck;

import 策略模式.newType.fly.GoodFlyImpl;
import 策略模式.newType.quack.GaGaQuackImpl;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:37
 * Description:
 */
public class GreenDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

    public GreenDuck() {
        iFly = new GoodFlyImpl();
        iQuack = new GaGaQuackImpl();
    }
}
