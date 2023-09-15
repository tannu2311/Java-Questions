#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> maximizeEqualNumbers(vector<int>& arr, int k) {
    unordered_map<int, int> countMap;

    // Count the occurrences of each number
    for (int num : arr)
        countMap[num]++;

    // Find the most frequent number
    int maxFreq = 0;
    int mostFrequent = 0;
    for (const auto& pair : countMap) {
        if (pair.second > maxFreq) {
            maxFreq = pair.second;
            mostFrequent = pair.first;
        }
    }

    // Replace each element with the most frequent number
    for (int i = 0; i < arr.size(); i++)
        arr[i] = mostFrequent;

    return arr;
}

int main() {
    int n, k;
    cout << "Enter the number of elements (n): ";
    cin >> n;

    cout << "Enter the integer range (-k to k): ";
    cin >> k;

    vector<int> arr(n);
    cout << "Enter the elements of the array:" << endl;
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    vector<int> result = maximizeEqualNumbers(arr, k);

    cout << "Array after maximizing equal numbers: ";
    for (int num : result)
        cout << num << " ";
    cout << endl;

    return 0;
}
