/*
 * https://ac.nowcoder.com/acm/contest/331/J
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_5
{
    class CoolMath
    {
        public static void Run()
        {
            int m = int.Parse(Console.ReadLine());
            long ans = 1;
            for (int i = 0; i < m; i++)
            {
                ans *= 3;
                ans %= 998244353;
            }

            Console.WriteLine(ans);


        }

    }
}
