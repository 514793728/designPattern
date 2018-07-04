package 适配器模式.鸭子;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:13
 * Description:
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
