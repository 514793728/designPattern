package 策略模式.newType.duck;

import 策略模式.newType.fly.NoFlyImpl;
import 策略模式.newType.quack.GeGeQuackImpl;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:38
 * Description:
 */
public class RedDuck extends Duck{

    @Override
    public void display() {
        System.out.println("红头鸭");
    }

    public RedDuck() {
        iFly = new NoFlyImpl();
        iQuack = new GeGeQuackImpl();
    }
}


