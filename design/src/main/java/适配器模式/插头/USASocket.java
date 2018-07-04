package 适配器模式.插头;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:36
 * Description:
 */
public class USASocket implements Socket{

    @Override
    public void display() {
        System.out.println("长方形底座，插孔较粗");
    }
}
