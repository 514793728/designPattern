package 命令模式.自定义功能键;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 21:27
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        IDEOperation ideOperation = new IDEOperationImpl();
        DeleteLineCommand deleteLineCommand = new DeleteLineCommand(ideOperation);
        CopyLineCommand copyLineCommand = new CopyLineCommand(ideOperation);
        UndoCommand undoCommand = new UndoCommand(ideOperation);
        Setting setting = new Setting(deleteLineCommand);
        setting.onKeyDown();

        setting = new Setting(copyLineCommand);
        setting.onKeyDown();

        setting = new Setting(undoCommand);
        setting.onKeyDown();
    }
}
