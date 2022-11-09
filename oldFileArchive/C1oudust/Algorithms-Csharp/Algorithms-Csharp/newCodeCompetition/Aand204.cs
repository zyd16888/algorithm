using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algorithms_Csharp.newCodeCompetition
{
    class Aand204
    {
        public static void Sum(int[] arr)
        {
            double res = Math.Pow(arr[0], 2);
            for (int i = 1; i < arr.Length; i++)
            {
                res += Math.Pow(arr[i] - arr[i - 1], 2);
            }

            Console.WriteLine(res);
        }
        public static void Work(int[] arr)
        {
            Array.Sort(arr);
            Swap(arr, 0, arr.Length - 1);
            for (int i = 0; i < arr.Length - 1; i++)
            {
                FindMaxSub(arr, i);
            }
            Sum(arr);
        }

        private static void FindMaxSub(int[] arr, int i)
        {
            int maxSub = i + 1;
            for (int j = i + 1; j < arr.Length; j++)
            {
                maxSub = Math.Pow(arr[j] - arr[i], 2) > Math.Pow(arr[maxSub] - arr[i], 2) ? j : maxSub;
            }
            Swap(arr, i + 1, maxSub);
        }

        public static void Swap(int[] arr, int firstIndex, int secondIndex)
        {
            if (arr.Length < 2 || firstIndex == secondIndex)
                return;
            arr[firstIndex] = arr[firstIndex] ^ arr[secondIndex];
            arr[secondIndex] = arr[firstIndex] ^ arr[secondIndex];
            arr[firstIndex] = arr[firstIndex] ^ arr[secondIndex];
        }
        public static void Run()
        {
            int a = Int32.Parse(Console.ReadLine());
            int[] arr = new int[a];
            string[] s = Console.ReadLine().Split(' ');
            ; for (int i = 0; i < a; i++)
            {
                arr[i] = Int32.Parse(s[i]);
            }
            Work(arr);
        }
    }
}
