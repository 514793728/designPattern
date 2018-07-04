package 适配器模式.插头;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:39
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        Plug chinaPlug = new ChinaPlug();
        SocketAdapter adapter = new SocketAdapter(chinaPlug);
        adapter.display();
    }
}
