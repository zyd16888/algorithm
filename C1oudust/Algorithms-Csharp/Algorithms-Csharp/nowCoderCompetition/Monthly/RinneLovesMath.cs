/*
 * https://ac.nowcoder.com/acm/contest/370/J
 */
using System;
using System.Collections.Generic;
namespace Algorithms_Csharp.nowCoderCompetition.Monthly
{
    public class Sqr
    {
        public int a { get; set; }
        public int b { get; set; }
        public Sqr(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
    }
    public class RinneLovesMath
    {
        public static void Run()
        {
            int n = int.Parse(Console.ReadLine());
            List<Sqr> sqr = new List<Sqr>();
            while (n != 0)
            {
                int num = int.Parse(Console.ReadLine());
                if (num < 0)
                {
                    sqr.Add(new Sqr(-1, -1));
                }
                else
                {
                    for (int a = Convert.ToInt32(Math.Sqrt(num)); a > 0; a--)
                    {
                        if (num % (a * a) == 0)
                        {
                            sqr.Add(new Sqr(a, num / (a * a)));
                            break;
                        }
                    }
                }
                n--;
            }
            foreach (var val in sqr)
            {
                if (val.a == -1)
                {
                    Console.WriteLine(-1);
                    continue;
                }
                Console.WriteLine(val.a + " " + val.b);
            }
        }
    }
}


