using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public static class InsertSorter
    {
        public static void InsertSort(int[] arr)
        {
            if (arr == null || arr.Length < 2)
                return;
            for (int i = 0; i <= arr.Length; i++)
            {
                for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--)
                {
                    Helper.Swap(arr,i,j);
                }
            }
        }
    }
}
