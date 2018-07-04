package 命令模式.遥控器例子;

/**
 * author:Ben_sir.
 * Date : 2018/7/2/002 22:08
 * Description:
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.print("---undo");
        light.on();
    }
}
