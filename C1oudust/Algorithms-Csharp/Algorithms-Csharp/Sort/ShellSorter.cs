using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public static class ShellSorter
    {
        public static void ShellSort(int[] arr)
        {
            if (arr == null || arr.Length < 2)
                return;
            for (int gap = arr.Length / 2; gap >= 1; gap /= 2)
            {
                for (int i = gap; i < arr.Length; i++)
                {
                    for (int j = i - gap; j >= 0 && arr[j] > arr[j + gap]; j -= gap)
                    {
                        Helper.Swap(arr, j, j + gap);
                    }
                }
            }
        }
    }
}
