#include <iostream> // this is the first line
using namespace std;

void bubbleSort(int arr[], int n)
{                               // this is 4th line - BRANCH1
    for (int i = 0; i < n; i++) // Different logic introduced in branch1
    {
        for (int j = 0; j < n - i; j++)
        {
            if (arr[j] < arr[j + 1]) // Reversed condition in branch1
            {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main()
{
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Original array from branch1: ";
    bubbleSort(arr, n);

    cout << "Sorted array: ";
    return 0;
}
