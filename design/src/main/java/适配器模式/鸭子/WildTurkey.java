package 适配器模式.鸭子;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:12
 * Description:
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("guo guo");
    }

    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
