/*
 * https://ac.nowcoder.com/acm/contest/332/B
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_6
{
    class GasRange
    {
        public static void Run()
        {
            string[] s = Console.ReadLine().Split(' ');
            long n = long.Parse(s[0]);
            long m = long.Parse(s[1]);
            long d = long.Parse(s[2]);
            long x = long.Parse(s[3]);
            long day = 0;
            long sal = 0;
            while (sal < m && day < x)
            {
                day++;
                sal += n;
                n += d;
            }
            Console.WriteLine(day);

        }
    }
}
