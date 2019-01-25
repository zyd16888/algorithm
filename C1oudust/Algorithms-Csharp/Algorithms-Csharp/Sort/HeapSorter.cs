using Algorithms_Csharp.Common;

namespace Algorithms_Csharp.Sort
{
    public static class HeapSorter
    {
        public static void HeapSort(int []arr)
        {
            if(arr == null || arr.Length <2 )
                return;
            for (int i = 0; i < arr.Length; i++)
                HeapInsert(arr,i);

            for( int heapSize = arr.Length-1;heapSize > 0;heapSize-- )
            {
                Helper.Swap(arr, 0, heapSize);              
                Heapify(arr, 0, heapSize);
            }
        }

        private static void HeapInsert( int []arr ,int index)
        {
            while (arr[index] > arr[(index-1)/2])
            {
                Helper.Swap(arr, index, (index - 1)/2);
                index = (index - 1) / 2;
            }
        }

        private static void Heapify(int[] arr, int index, int heapSize)
        {
            int left = 2 * index + 1;      
            int largest = index;   

            if (left < heapSize && arr[left] > arr[largest])  
            {
                largest = left;
            }
            if (left+1 < heapSize && arr[left+1] > arr[largest])    
            {
                largest = left+1;
            }
            if (index != largest) 
            {
                Helper.Swap(arr,index, largest);   
                Heapify(arr, largest, heapSize); 
            }
            //            int left = index * 2 + 1;
            //            while (left < heapSize)
            //            {
            //                int largest = (left + 1 < heapSize && arr[left] > arr[left + 1]) ? left : left+1;
            //                largest = arr[index] > arr[largest] ? index : largest;
            //                if (largest == index) break;
            //                Helper.Swap(arr, index, largest);
            //                index = largest;
            //                left = index * 2 + 1;
            //            }
        }
    }
}
