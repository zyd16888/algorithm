/*
 * https://ac.nowcoder.com/acm/contest/329/G
 */
using System;
using System.Text.RegularExpressions;

namespace Algorithms_Csharp.nowCoderCompetition.Day_3
{
    class VirgoAndGirl_3
    {
        public static void Run()
        {
            string[] a = Console.ReadLine().Split(' ');  
            int l = int.Parse(a[0]);
            int r = int.Parse(a[1]);
            int count = 0;
            
            for (int i = l; i < r; i++)
            {
                if (Regex.IsMatch(i.ToString(), @".*?(6)")) 
                {
                    count++;
                }
            }

            Console.WriteLine(count);
        }
    }
}
