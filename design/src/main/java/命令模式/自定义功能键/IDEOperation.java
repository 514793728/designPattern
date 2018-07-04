package 命令模式.自定义功能键;

/**
 * author:Ben_sir.
 * Date : 2018/7/4/004 21:10
 * Description:
 */
public interface IDEOperation {
    void deleteLine(); //删除行

    void copyLine(); //复制行

    void undoOperate(); //回退操作
}
