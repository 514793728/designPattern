package 适配器模式.鸭子;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:11
 * Description:
 */
public class GreenHeadDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("gaga");
    }

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
