package 策略模式.newType.quack;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:32
 * Description:
 */
public class NoQuackImpl implements IQuack {
    @Override
    public void quack() {
        System.out.println("no quack");
    }
}
