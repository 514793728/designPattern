package 策略模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 20:37
 * Description:
 */
public class NoFly implements IFly{
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
