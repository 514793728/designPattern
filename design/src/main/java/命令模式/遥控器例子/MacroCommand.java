package 命令模式.遥控器例子;

/**
 * author:Ben_sir.
 * Date : 2018/7/2/002 22:53
 * Description:宏命令
 */
public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
