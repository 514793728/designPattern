package 策略模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 20:29
 * Description:
 */
public class GreenHeadDuck extends Duck {
    public GreenHeadDuck() {
        iFly = new CanFly();
        iQuack = new GaGaQuack();
    }
}
