package 适配器模式.鸭子;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:15
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        Duck greenDuck = new GreenHeadDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck duckToTurkeyAdapter = new TurkeyAdapter(wildTurkey);
        wildTurkey.gobble();
        wildTurkey.fly();
        greenDuck.quack();
        greenDuck.fly();
        duckToTurkeyAdapter.quack();
        duckToTurkeyAdapter.fly();
    }
}
