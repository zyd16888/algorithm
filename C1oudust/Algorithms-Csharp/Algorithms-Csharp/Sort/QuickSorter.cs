using System;
using System.Collections.Generic;
using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public static class QuickSorter
    {
        public static void QuickSort(int[] arr)
        {
            if (arr == null || arr.Length < 2)
                return;
            QuickSort(arr, 0, arr.Length - 1);
        }

        private static void QuickSort(int[] arr, int L, int R)
        {
            if (L < R)
            {
                int partition = Partition(arr, L, R);
                QuickSort(arr, L, partition);
                QuickSort(arr, partition + 1, R);
            }
        }


        private static int Partition(int[] arr, int L, int R)
        {
            int i = L, j = R, X = arr[i];
            while (i<j)
            {
                while (i<j&& arr[j]>X)
                {
                    j--;
                }

                if (i<j)
                {
                    arr[i] = arr[j];
                    i++;
                }

                while (i<j && arr[i] < X)
                {
                    i++;
                }

                if (i<j)
                {
                    arr[j] = arr[i];
                    j--;
                }

                arr[i] = X;
            }

            return i;
        }

        public static void OptQuickSort(int[] arr)
        {
            if (arr == null || arr.Length < 2)
                return;
            OptQuickSort(arr, 0, arr.Length -1);
        }

        private static void OptQuickSort(int[] arr, int L, int R)
        {
            if (L < R)
            {
                Helper.Swap(arr, L + (int)(new Random().Next(0,1) * (R - L + 1)), R);
                int [] opt = OptPartition(arr, L, R);
                OptQuickSort(arr,L,opt[0]-1);
                OptQuickSort(arr,opt[1]+1,R);
            }
        }

        private static int [] OptPartition(int[] arr, int L, int R)
        {   
            int less = L-1, more= R;
            while (L<more)
            {
                if (arr[L] < arr[R])
                {
                    Helper.Swap(arr,++less,L++);
                }
                else if (arr[less] < arr[R])
                {
                    Helper.Swap(arr,--more,L);
                }
                else
                {
                    L++;
                }
            }
            Helper.Swap(arr,more,R);
            return new int[]{less+1,more};
        }
    }
}
