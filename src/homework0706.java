
import java.util.Arrays;

public class homework0706 {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},
                {4,3,5},
                {7,5,6}};
        new saddlePoint().findPoint(arr);
    }
}

//˫��ѭ���Ұ���
class saddlePoint{
    void findPoint(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i][0];
            // �ҵ�ĳһ����Сֵ����¼������ֵ
            int col = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if ( tmp > arr[i][j]){
                    tmp = arr[i][j];
                    col = j;
                }
                //�Ƚ��У��������һ�����ֵ�ͷ���,�����˳�ѭ��
            }
            //ÿһ����Сֵx  �Ƿ�Ϊ�����ֵ
            int x = arr[i][col];
            //�ҵ���һ�����ֵ  �Ƿ���x���
            int y = x;
            //�ҵ�col�� ���ֵ
            for (int j = 0; j < arr.length; j++) {
                if (y < arr[j][col]){
                    y = arr[j][col];
                }
            // ���ÿһ�е���Сֵ x == col�����ֵ����Ϊ����
            }
            if (y == x)
                System.out.println(x);
        }
    }
}