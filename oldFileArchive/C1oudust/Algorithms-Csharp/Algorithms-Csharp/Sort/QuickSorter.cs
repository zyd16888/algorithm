using System;
using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public static class QuickSorter
    {
        public static void QuickSort(int[] arr)
        {
            if (arr== null || arr.Length < 2)
            return;
            QuickSort(arr,0,arr.Length);
        }

        public static void QuickSort(int[] arr, int L, int R)
        {
            if (L < R)
            {
                int baseIndex = arr.Length - 1;
                for (int i = 0; i < arr.Length; i++)
                {
                    if (arr[i]>arr[baseIndex] )
                    {
                        Helper.Swap(arr,arr[baseIndex],arr[i]);
                    }
                }
            }
        }
    }
}
