//找到数组中第一个不重复的数
//时间复杂度O(n),辅助的空间复杂度O(n)。
using System.Collections.Generic;

namespace Algorithms_Csharp.Array
{
    class FirstNotRepeat
    {
        public int FindFirstNotRepeat(int[] a)
        {
            Dictionary<int,int> temp = new Dictionary<int, int>();
            foreach (var val in a)
            {
                temp[val]++;
            }

            foreach (var val in a)
            {
                if (temp[val] == 1)
                {
                    return val;
                }               
            }
            return 0;
        }
    }
}
