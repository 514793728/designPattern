package 策略模式.newType.fly;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:30
 * Description:
 */
public class BadFlyImpl implements IFly {
    @Override
    public void fly() {
        System.out.println("bad fly");
    }
}
