import java.util.Scanner;

/**
 * @author 李小龙
 * @version 1.0.0
 * @ClassName Yanghuisanjiao.java
 * @Description TODO
 * @createTime 2020年01月15日 16:23:00
 */
public class Yanghuisanjiao {
    /*
打印杨辉三角(行数可以键盘录入)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
任何一行的第一列和最后一列都是1
从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和
*/



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入杨辉三角的行数：");
            int n = sc.nextInt();

            int[][] triangle = new int[n][];
            for (int i = 0; i < triangle.length; i++) {
                triangle[i] = new int[i + 1];

                for (int j = 0; j < triangle[i].length; j++) {
                    if (i == 0 || j == 0 || i == j) {
                        triangle[i][j] = 1;
                    } else {
                        triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                    }
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }

        }

    }


