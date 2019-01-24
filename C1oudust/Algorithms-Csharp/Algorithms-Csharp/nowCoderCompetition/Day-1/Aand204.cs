/*
链接：https://ac.nowcoder.com/acm/contest/317/B
题目描述：
小a非常喜欢204这个数字，因为′a′+′k′=204′a′+′k′=204。现在他有一个长度为n的序列，其中只含有2,0,4这三种数字，设ai为序列中第i个数，
你需要重新排列这个数列，使得∑i=1n(ai−ai−1)^2最大(公式的含义是：每个数与前一个数差的平方的和)注意：我们默认a0=0

输入描述:第一行一个整数n接下来一行n个整数，第i个数表示ai

输出一个整数，表示∑i=1n(ai−ai−1)^2的最大值

eg: 
Input:2
    2 4
Output:
    20
解释：按(4,2)排列是最优的，此时sum=(4−0)^2+(2−4)^2=20
*/
using System;

namespace Algorithms_Csharp.nowCoderCompetition
{
    class Aand204
    {
        public static void Sum(int[] arr)
        {
            double res = Math.Pow(arr[0], 2);
            for (int i = 1; i < arr.Length; i++)
            {
                res += Math.Pow(arr[i] - arr[i - 1], 2);
            }

            Console.WriteLine(res);
        }
        public static void Work(int[] arr)
        {
            Array.Sort(arr);
            Swap(arr, 0, arr.Length - 1);
            for (int i = 0; i < arr.Length - 1; i++)
            {
                FindMaxSub(arr, i);
            }
            Sum(arr);
        }

        private static void FindMaxSub(int[] arr, int i)
        {
            int maxSub = i + 1;
            for (int j = i + 1; j < arr.Length; j++)
            {
                maxSub = Math.Pow(arr[j] - arr[i], 2) > Math.Pow(arr[maxSub] - arr[i], 2) ? j : maxSub;
            }
            Swap(arr, i + 1, maxSub);
        }

        public static void Swap(int[] arr, int firstIndex, int secondIndex)
        {
            if (arr.Length < 2 || firstIndex == secondIndex)
                return;
            arr[firstIndex] = arr[firstIndex] ^ arr[secondIndex];
            arr[secondIndex] = arr[firstIndex] ^ arr[secondIndex];
            arr[firstIndex] = arr[firstIndex] ^ arr[secondIndex];
        }
        public static void Run()
        {
            int a = Int32.Parse(Console.ReadLine());
            int[] arr = new int[a];
            string[] s = Console.ReadLine().Split(' ');
            ; for (int i = 0; i < a; i++)
            {
                arr[i] = Int32.Parse(s[i]);
            }
            Work(arr);
        }
    }
}
