package 命令模式.自定义功能键;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 21:19
 * Description:
 */
public class Setting {
    private Command command;

    public Setting(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onKeyDown() {
        command.execute();
    }
}
