/*
 * https://ac.nowcoder.com/acm/contest/331/G
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_5
{
    class CoolNumber
    {
        public static void Run()
        {

            int n = Convert.ToInt32(Console.ReadLine());
            int[] c = new int[n];
            int[] a = new int[1000005];
            int[] ans = new int[1000005];

            for (int i = 1; i <= 1000000; i++)
            {
                for (int j = i; j <= 1000000; j += i)
                {
                    a[j]++;
                }
                if (ans[a[i]] == 0) ans[a[i]] = i;
            }

            for (int j = 0; j < n; j++)
            {
                c[j] = int.Parse(Console.ReadLine());
            }

            foreach (var v in c)
            {
                Console.WriteLine(ans[v]);
            }

        }
        //            int n = Convert.ToInt32(Console.ReadLine());
        //            int[] c = new int[n];
        //            for (int j = 0; j < n; j++)
        //            {
        //                int num = int.Parse(Console.ReadLine());
        //                c[j] = Find(num);
        //            }
        //
        //            foreach (var i in c)
        //            {
        //                Console.WriteLine(i);
        //            }

    

        public static int Find(int n)
        {
            for (int i = 0; i < 1000000; i++)
            {
                if (Factor(i, n))
                    return i;
            }
            return -1;
        }
        public static bool Factor(int n, int num)
        {
            int count = 0;
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    count++;

                }
            }
            if (count == num)
                return true;
            return false;
        }
    }
}
