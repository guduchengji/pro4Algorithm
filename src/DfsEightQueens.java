/**
 * 八皇后问题
 */
public class DfsEightQueens {
    //定义一个数组表示从左到右的数组
    int[]queens=new int[8];
    //定义计数器
    int count=0;
    /**
     * 整体思路：
     * 定义第一列的属性
     * 而后计算后一列，使其不在前一列的触发点上
     * 而后依次向后遍历
     */
    public void deepdirstalgorithm(int column){
        if (column==8){
            count++;
            System.out.println("这是第"+count+"种方法：");
            print();
            return;
        }
        for (int i=0;i<8;i++){
            queens[column]=i;
            //调用判断
            if (iscollide(column)){
                deepdirstalgorithm(column+1);
            }
        }
    }
    private boolean iscollide(int column){
        for (int i=0;i<column;i++){
            if (queens[i]==queens[column]){
                return false;
            }
        if (Math.abs(queens[i]-queens[column])==(column-i))return false;
        }
        System.out.println("cc");
        return true;
    }
    private void print(){
        for (int i=0;i<8;i++){
            for (int j = 0; j < 8; j++) {
                if (queens[i]==j){
                    System.out.print("👑");
                }else{
                    System.out.print("口");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args){
        DfsEightQueens q = new DfsEightQueens();
        q.deepdirstalgorithm(0);
        System.out.println("共"+q.count+"种方法");

    }

}
