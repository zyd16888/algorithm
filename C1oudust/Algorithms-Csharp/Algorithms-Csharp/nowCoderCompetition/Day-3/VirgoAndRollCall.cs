/*
 * https://ac.nowcoder.com/acm/contest/329/C
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_3
{
    class VirgoAndRollCall
    {
        public static void Run()
        {
            int a = Int32.Parse(Console.ReadLine());
            string[] s = new string[a+1];
            string[] str = Console.ReadLine().Split(' ');
            for (int i = 0; i < str.Length; i++)
            {
                s[int.Parse(str[i])] = str[i];
            }
            for (int i = 1; i < s.Length; i++)
            {
                if (s[i] == null)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
