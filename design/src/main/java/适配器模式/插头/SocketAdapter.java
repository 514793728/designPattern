package 适配器模式.插头;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 22:38
 * Description:
 */
public class SocketAdapter implements Socket{
    private Plug plug;

    public SocketAdapter(Plug plug) {
        this.plug = plug;
    }

    @Override
    public void display() {
        plug.display();
    }
}
