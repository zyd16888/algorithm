/*
 * https://ac.nowcoder.com/acm/contest/330/E
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_4
{
    class AppleseAndColor
    {
        public static void Run()
        {
            string[] s = Console.ReadLine().Split(' ');
            int n = Int32.Parse(s[0]);
            int ans = (int) (Convert.ToInt32(Math.Pow(2, n)) % 1000000007);
            Console.WriteLine(ans);
        }
    }
}
