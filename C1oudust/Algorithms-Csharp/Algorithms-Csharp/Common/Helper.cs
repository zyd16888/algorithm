namespace Algorithms_Csharp.Common
{
    public  static class Helper
    {
        public static void Swap(int[] arr, int firstIndex, int secondIndex)
        {
            if (arr.Length < 2 ||  firstIndex == secondIndex)
                return;
            arr[firstIndex] = arr[firstIndex] ^ arr[secondIndex];
            arr[secondIndex] = arr[firstIndex] ^ arr[secondIndex];
            arr[firstIndex] = arr[firstIndex] ^ arr[secondIndex];
        }
    }
}
