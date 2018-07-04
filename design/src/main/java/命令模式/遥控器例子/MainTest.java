package 命令模式.遥控器例子;

/**
 * author:Ben_sir.
 * Date : 2018/7/2/002 22:20
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        Light roomLight = new Light("卧室灯");
        Light toiletLight = new Light("厕所灯");

        Command roomlightOn = new LightOnCommand(roomLight);
        Command roomlightOff = new LightOffCommand(roomLight);

        Command toiletLightOn = new LightOnCommand(toiletLight);
        Command toiletLightOff = new LightOffCommand(toiletLight);

        CommandModeControl control = new CommandModeControl();
        control.setCommand(1,roomlightOn,roomlightOff);
        control.setCommand(2,toiletLightOn,toiletLightOff);
        control.onButton(1);
        control.offButton(1);
        control.onButton(2);
        control.offButton(2);
        control.undoButton();
        control.undoButton();

        /* 宏命令*/
        Command[] onCommands = {roomlightOn, toiletLightOn};
        Command[] offCommands = {roomlightOff, toiletLightOff};
        MacroCommand onMacro = new MacroCommand(onCommands);
        MacroCommand offMacro = new MacroCommand(offCommands);
        onMacro.execute();
        offMacro.execute();
    }
}
