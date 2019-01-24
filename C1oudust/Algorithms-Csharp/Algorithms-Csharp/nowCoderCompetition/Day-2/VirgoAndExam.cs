/*
 * 链接：https://ac.nowcoder.com/acm/contest/327/J
题目描述 
快要期末考试了，处女座现在有n门课程需要考试，每一门课程需要花ai小时进行复习，考试的起始时间为bi，
处女座为了考试可以不吃饭不睡觉，处女座想知道他能否复习完所有的科目（即在每一门考试之前复习完该科目）。
每一门课的考试时间都为两小时。

输入描述:
第一行一个整数n
第二行n个整数a1,a2,…,an,表示每门课需要复习的时间
第三行n个整数b1,b2,…,bn,表示每门课考试的时间

输出描述:
如果处女座能复习完，输出”YES”，否则输出”NO”

eg:
输入:
3
0 1 1
2 6 4
输出:
YES
说明:
在0-1小时复习第2门课，
在1-2小时复习第3门课，
在2-4小时考第1门课，
在4-6小时考第3门课，
在6-8小时考第2门课
 */
using System;
using System.Collections.Generic;

namespace Algorithms_Csharp.nowCoderCompetition
{
    public static class VirgoAndExam
    {
        public static void Run()
        {
            int time = 0;
            bool can = true;
            int num = int.Parse(Console.ReadLine());
            List<test> t = new List<test>();
            string[] s1 = Console.ReadLine().Split(' ');
            string[] s2 = Console.ReadLine().Split(' ');
            for (int i = 0; i < num; i++)
            {
                t.Add(new test(int.Parse(s1[i]), int.Parse(s2[i])));
            }
            t.Sort(new MyCompare());


            for (int i = 0; i < num; i++)
            {

                time += t[i].cost;

                if (time > t[i].start)
                {
                    can = false;
                    Console.WriteLine("NO");
                    break;
                }
            }

            if (can)
                Console.WriteLine("YES");
        }
    }

    public class test
    {
        public int cost { get; set; }
        public int start { get; set; }
        public test(int cost, int start)
        {
            this.cost = cost;
            this.start = start;
        }
    }

    public class MyCompare : IComparer<test>
    {
        public int Compare(test x, test y)
        {
            return x.start - y.start;
        }
    }
}
