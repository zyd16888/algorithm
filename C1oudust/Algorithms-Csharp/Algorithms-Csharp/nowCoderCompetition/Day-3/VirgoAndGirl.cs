/*
 * https://ac.nowcoder.com/acm/contest/329/E
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_3
{
    class VirgoAndGirl
    {
        public static void Run()
        {

            int count = int.Parse(Console.ReadLine());
            int[] res = new int[count];
            int n = 0, m = 0;
            for (int i = 0; i < count; i++)
            {
                int num;
                string[] s = Console.ReadLine().Split(' ');
                n = int.Parse(s[0]);
                m = int.Parse(s[1]);
                if (m % 2 == 0)
                {
                    num = n * (m - 1) - 1;
                }
                else
                {
                    num = n * m - 2;
                }

                res[i] = num;
            }

            foreach (var v in res)
            {
                Console.WriteLine(v);
            }

        }
    }
}
