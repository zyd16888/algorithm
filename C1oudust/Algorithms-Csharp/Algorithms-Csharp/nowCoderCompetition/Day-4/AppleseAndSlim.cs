/*
 * https://ac.nowcoder.com/acm/contest/330/J
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_4
{
    class AppleseAndSlim
    {
        public static void Run()
        {
            string[] s = Console.ReadLine().Split(' ');
            double f1 = double.Parse(s[0]);
            double f2 = double.Parse(s[1]);
            double a = double.Parse(s[2]);
            double res = Math.Sqrt(f1 * f1 + f2 * f2 + 2 * f1 * f2 * Math.Cos((a / 360.0) * 2 * Math.PI));
            Console.WriteLine($"{res:F10}");

        }
    }
}
