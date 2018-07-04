package 命令模式.自定义功能键;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 21:15
 * Description:
 */
public class DeleteLineCommand implements Command {
    private IDEOperation ideOperation;

    public DeleteLineCommand(IDEOperation ideOperation) {
        this.ideOperation = ideOperation;
    }

    @Override
    public void execute() {
        ideOperation.deleteLine();
    }
}
