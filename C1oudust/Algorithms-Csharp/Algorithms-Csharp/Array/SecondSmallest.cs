//找到数组中第二小的数
//时间复杂度O(n)
using System;

namespace Algorithms_Csharp.Array
{
    class SecondSmallest
    {
        int firstMin = Int32.MaxValue;
        int secondMin = Int32.MaxValue;

        public int FindSecondSmallest(int[] a)
        {
            for (int i = 0; i < a.Length; i++)
            {
                if (a[i] < firstMin)
                {
                    secondMin = firstMin;
                    firstMin = a[i];
                }
                else if (a[i]< secondMin && a[i] != firstMin)
                {
                    secondMin = a[i];
                }
            }
            return secondMin;
        }
    }
}
