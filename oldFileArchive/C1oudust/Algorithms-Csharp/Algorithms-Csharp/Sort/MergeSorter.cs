namespace Algorithms_Csharp.Sort
{
    public static class MergeSorter
    {
        public static void MergeSort(int[] arr)
        {
            if (arr == null || arr.Length < 2)
                return;
            MergeSort(arr, 0, arr.Length);
        }

        public static void MergeSort(int[] arr, int L, int R)
        {
            if (L == R)
                return;
            int midIndex = L + ((R-L) >> 1);
            MergeSort(arr,L,midIndex);
            MergeSort(arr,midIndex+1,R);
            Merge(arr, L, midIndex, R);
        }

        private static void Merge(int[] arr, int L, int midIndex, int R)
        {
            int []help = new int[R-L+1];
            int i = 0, p1 = L, p2 = midIndex + 1;
            while (p1 <=midIndex && p2 <=R)
            {
                help[i++] = arr[p1]<= arr[p2]?arr[p1++]:arr[p2++];
            }

            while (p1<=midIndex)
            {
                help[i++] = arr[p1++];
            }

            while (p2<= R)
            {
                help[i++] = arr[p2++];
            }

            for (i = 0; i < help.Length; i++)
            {
                arr[L + i] = help[i];
            }
        }
    }
}
