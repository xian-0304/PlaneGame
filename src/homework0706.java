
import java.util.Arrays;

public class homework0706 {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},
                {4,3,5},
                {7,5,6}};
        new saddlePoint().findPoint(arr);
    }
}

//双层循环找鞍点
class saddlePoint{
    void findPoint(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i][0];
            // 找到某一行最小值，记录它的列值
            int col = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if ( tmp > arr[i][j]){
                    tmp = arr[i][j];
                    col = j;
                }
                //比较列，如果是这一列最大值就返回,否则退出循环
            }
            //每一行最小值x  是否为列最大值
            int x = arr[i][col];
            //找到这一列最大值  是否与x相等
            int y = x;
            //找到col列 最大值
            for (int j = 0; j < arr.length; j++) {
                if (y < arr[j][col]){
                    y = arr[j][col];
                }
            // 如果每一行的最小值 x == col列最大值，则为鞍点
            }
            if (y == x)
                System.out.println(x);
        }
    }
}