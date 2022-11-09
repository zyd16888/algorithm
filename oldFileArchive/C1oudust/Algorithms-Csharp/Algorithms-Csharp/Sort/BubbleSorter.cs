using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public static class BubbleSorter
    {
        public static void BubbleSort(int[] arr)
        {
            if (arr == null || arr.Length <2)
                return;
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = i; j < arr.Length ; j++)
                {
                    if (arr[i] > arr[j])
                    {
                        Helper.Swap(arr,i,j);
                    }
                }
            }
        }
    }
}
