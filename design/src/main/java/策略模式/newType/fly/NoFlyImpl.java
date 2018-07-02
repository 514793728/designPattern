package 策略模式.newType.fly;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:31
 * Description:
 */
public class NoFlyImpl implements IFly {
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
