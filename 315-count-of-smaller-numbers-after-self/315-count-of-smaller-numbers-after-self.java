class Solution {
    public List<Integer> countSmaller(int[] nums) {
    int[] result = new int[nums.length];

        Items[] items = new Items[nums.length];

        for (int i = 0; i < nums.length; i++) {
            items[i] = new Items(nums[i], i);
        }

        mergeSort(items, 0, nums.length - 1, result);

        List<Integer> output = new ArrayList<>();
        Arrays.stream(result).forEach(output::add);

        return output;
    }

    private void mergeSort(Items[] items, int start, int end, int[] result) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(items, start, mid, result);
            mergeSort(items, mid + 1, end, result);
            merge(items, start, mid, end, result);
        }
    }

    private void merge(Items[] items, int start, int mid, int end, int[] result) {
        int sortedArraySize = end -  start + 1;
        Items[] temp = new Items[sortedArraySize];

        int leftIndex = start;
        int rightIndex = mid + 1;
        int count = 0;
        int index = 0;

        while ( leftIndex  <= mid && rightIndex <= end ) {
            if (items[leftIndex].value > items[rightIndex].value) {
                temp[index++] = items[rightIndex++];
                count++;
            }
            else {
                result[items[leftIndex].index] += count;
                temp[index++] = items[leftIndex++];
            }
        }

        while (leftIndex <= mid) {
            result[items[leftIndex].index] += count;
            temp[index++] = items[leftIndex++];
        }

        while ((rightIndex <= end)) {
            temp[index++] = items[rightIndex++];
        }

        for ( int i = start, j = 0; i <= end; i++, j++) {
            items[i] = temp[j];
        }
    }

    class Items {
        int value;
        int index;

        public Items(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    
}