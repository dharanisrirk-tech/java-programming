static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1); // Left
        quickSort(arr, pivotIndex + 1, high); // Right
    }
}

static int partition(int[] arr, int low, int high) {
    int pivot = arr[high]; // Pivot as last element
    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; // Swap
        }
    }
    int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp; // Swap Pivot
    return i + 1;
}
