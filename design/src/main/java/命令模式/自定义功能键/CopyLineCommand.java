package 命令模式.自定义功能键;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 21:18
 * Description:
 */
public class CopyLineCommand implements Command {
    private IDEOperation ideOperation;

    public CopyLineCommand(IDEOperation ideOperation) {
        this.ideOperation = ideOperation;
    }

    @Override
    public void execute() {
        ideOperation.copyLine();
    }
}
