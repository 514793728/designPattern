package 命令模式.遥控器例子;

public interface Control {
    void onButton(int slot);

    void offButton(int slot);

    void undoButton(); //返回
}
