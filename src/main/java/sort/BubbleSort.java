package sort;

import java.util.Scanner;

/**
 * 啊哈，算法第一章排序之冒泡排序
 *  时间复杂度为：
 * Created by Lenovo on 2019/1/7.
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] a = new int[101];
        int i,j,t,n,k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();  //输入一个数n，表示接下来有n个数
        for(i=1;i<=n;i++){//循环读入n个数到数组a中
            a[i] = scanner.nextInt();
        }

        //冒泡排序的核心部分
        for(i=1;i<=n-1;i++) //n个数排序，只用进行n-1趟
        {
            for(j=1;j<=n-i;j++) //从第1位开始比较直到最后一个尚未归位的数，想一想为什么到n-i就可以了。
            {
                if(a[j]<a[j+1]) //比较大小并交换
                { t=a[j]; a[j]=a[j+1]; a[j+1]=t; }

            }
            System.out.print("第" + i + "趟：");
            for(k=1;k<=n;k++) //输出结果
                System.out.print(a[k] + " ");
            System.out.println();
        }

        System.out.print("最后结果：");
        for(i=1;i<=n;i++) //输出结果
            System.out.print(a[i] + " ");
    }
}
