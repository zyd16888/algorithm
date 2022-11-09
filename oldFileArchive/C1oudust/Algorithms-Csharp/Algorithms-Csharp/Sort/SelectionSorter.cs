using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public  static class SelectionSorter
    {
        public static void SelectionSort(int[] arr)
        {
            if (arr == null || arr.Length < 2)
                return;
            for (int i = 0; i < arr.Length; i++)
            {
                int minIndex = i;
                for (int j = i+1; j < arr.Length ; j++)
                {
                    minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                }
                Helper.Swap(arr,i,minIndex);
            }
        }
    }
}
