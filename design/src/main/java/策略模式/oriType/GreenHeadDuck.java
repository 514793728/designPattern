package 策略模式.oriType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:02
 * Description:绿头鸭
 */
public class GreenHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("绿头鸭");
    }

    public void fly() {
        System.out.println("no fly");
    }
}
