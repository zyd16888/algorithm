/*
 * https://ac.nowcoder.com/acm/contest/329/D
 */
using System;
using System.Collections.Generic;

namespace Algorithms_Csharp.nowCoderCompetition.Day_3
{
    class VirgoAndTrain
    {
        public static void Run()
        {
            int n = int.Parse(Console.ReadLine());       
            List<Work> work = new List<Work>();
            for (int i = 0; i < n; i++)
            {
                string[] s = Console.ReadLine().Split(' ');
                work.Add(new Work(int.Parse(s[0]), int.Parse(s[1])));
            }
            work.Sort(new MyCompare());
            int fat = 0;
            for (int i = 0; i <n ; i++)
            {        
                
                int num = 0;
                for (int j = i + 1; j < n; j++)
                    num += work[j].fatigue;                   
                fat += work[i].time * num;
            }

            Console.WriteLine(fat);
        }
    }

    public class Work
    {
        public int time { get; set; }
        public int fatigue { get; set; }

        public Work(int a, int b)
        {
            this.time = a;
            this.fatigue = b;
        }
    }

    public class MyCompare : IComparer<Work>
    {
        public int Compare(Work x, Work y)
        {
            if (x.time == y.time)
                return y.fatigue - x.fatigue;
            return x.time - y.time;
        }
    }
}
