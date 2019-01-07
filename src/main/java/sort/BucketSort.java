package sort;

import java.io.IOException;
import java.util.Scanner;

/**
 * 啊哈，算法第一章排序之桶排序
 *  时间复杂度O(M+N)
 * Created by Lenovo on 2019/1/7.
 */
public class BucketSort {

    public static void main(String[] args) throws IOException {
        int[] book = new int[101];
        int i,j,t,n;
        for(i=0;i<=100;i++)
            book[i]=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();  //输入一个数n，表示接下来有n个数
        for(i=1;i<=n;i++)//循环读入n个数，并进行桶排序
        {
            t = scanner.nextInt();
            book[t]++; //进行计数，对编号为t的桶放一个小旗子
        }
        for(i=100;i>=0;i--) //依次判断编号1000~0的桶
            for(j=1;j<=book[i];j++) //出现了几次就将桶的编号打印几次
                System.out.print(i  + " ");
    }
}
