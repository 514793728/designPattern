package 适配器模式.插头;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:38
 * Description:
 */
public class ChinaPlug implements Plug {
    @Override
    public void display() {
        System.out.println("三角形孔，孔较细");
    }
}
