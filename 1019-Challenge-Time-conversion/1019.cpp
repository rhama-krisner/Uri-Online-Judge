#include <iostream>

using namespace std;

int main()
{
    int N;
    cin >> N;

    int h = N / 3600;
    int min = (N - (h * 3600)) / 60;
    int sec = (N - (h * 3600)) - (min * 60);

    cout << h << ":" << min << ":" << sec << "\n";

    return 0;
}