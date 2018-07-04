package 命令模式.自定义功能键;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 21:15
 * Description:
 */
public class IDEOperationImpl implements IDEOperation{
    @Override
    public void deleteLine() {
        System.out.println("删除一行");
    }

    @Override
    public void copyLine() {
        System.out.println("复制一行");
    }

    @Override
    public void undoOperate() {
        System.out.println("回退操作");
    }
}
