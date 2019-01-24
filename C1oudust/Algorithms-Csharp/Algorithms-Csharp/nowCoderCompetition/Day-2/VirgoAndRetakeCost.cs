/*
 * 链接：https://ac.nowcoder.com/acm/contest/327/D
题目描述 
期末考试结束了，处女座发现很多人挂了大物，只能等着第二年重修，还要交400元的重修费。
处女座突然想起有个学长和他讲过，如果学校哪一年缺钱了，那一年的大物试卷就会特别难。
现在处女座有了所有人的成绩，处女座想知道如果所有挂科的人都在第二年重修，学校能赚多少重修费？

挂科是指一门课的分数小于60分。
输入描述:
第一行一个整数n，表示考试的人数。
第二行n个整数，表示每个人的成绩。
1<=n<=10000
学生的成绩为0-100（包括0和100）之间的整数
输出描述:
一行，学校能赚的重修费用
eg:
输入:
4
60
56
100
59
输出:
800
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition
{
    public static class VirgoAndRetakeCost
    {
        public static void Run()
        {
            int n = Console.Read();
            int sum = 0;
            while (n>0)
            {
                int score = Int32.Parse(Console.ReadLine());
                    
                if (score < 60)
                {
                    sum += 400;
                }

                n--;
            }

            Console.WriteLine(sum);
        }
    }
}
