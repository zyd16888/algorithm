/*
 链接：https://ac.nowcoder.com/acm/contest/317/A
题目描述:
小a的数学基础实在太差了，以至于他只会用计算器算数。他的计算器比较特殊，只有+,−,×,/+,−,×,/(即加减乘除)四种运算。
经过一番周折，小a终于算出了他想要的数，但是他却忘记了最初的数是什么。不过幸运的是他记下了整个操作序列，他想请你帮他算出最初的数

输入描述:第一行两个整数n,Xn,X，分别表示操作次数和最终的数接下来nn行表示操作序列，每行两个数opt,x
若opt=1,则表示将当前数加xx
若opt=2，则表示将当前数减x
若opt=3，则表示将当前数乘x
若opt=4，则表示将当前数除以x

输出描述:
一个整数表示最初的数
eg:
Input:
4 6
1 3
2 1
3 3
4 2
Output:
2

解释：2+3=5 5−1=4 4∗3=12 12/2=6
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition
{
    class AandCalculator
    {
        public static void Run()
        {
            int n = Int32.Parse(Console.ReadLine());
            long res = Int32.Parse(Console.ReadLine());
            int[] steps = new int[n * 2];

            for (int i = 0; i < steps.Length - 1; i += 2)
            {
                string[] s = Console.ReadLine().Split(' ');
                steps[i] = Int32.Parse(s[0]);
                steps[i + 1] = Int32.Parse(s[1]);
            }

            for (int i = steps.Length - 1; i >= 0; i--)
            {
                if (steps[i - 1] == 1)
                {
                    res = res - steps[i];
                }
                else if (steps[i - 1] == 2)
                {
                    res = res + steps[i];
                }
                else if (steps[i - 1] == 3)
                {
                    res = res / steps[i];
                }
                else if (steps[i - 1] == 4)
                {
                    res = res * steps[i];
                }

                i--;
            }

            Console.WriteLine(res);
        }
    }
}
