package 策略模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 20:30
 * Description:
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        iFly = new NoFly();
        iQuack = new GeGeQuack();
    }
}
