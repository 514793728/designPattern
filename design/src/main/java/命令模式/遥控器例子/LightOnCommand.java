package 命令模式.遥控器例子;

/**
 * author:Ben_sir.
 * Date : 2018/7/2/002 22:05
 * Description:
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        System.out.print("---undo");
        light.off();
    }
}
