/*
 * https://ac.nowcoder.com/acm/contest/330/A
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_4
{
    class AppleseAndStoreGame
    {
        public static void Run()
        {
            int a = Int32.Parse(Console.ReadLine());
            int[] arr = new int[a];
            string[] s = Console.ReadLine().Split(' ');
            for (int i = 0; i < a; i++)
            {
                arr[i] = Int32.Parse(s[i]);
            }
            //无论石头堆情况如何，先手者总会赢
            Console.WriteLine("Applese");
        }
    }
}
