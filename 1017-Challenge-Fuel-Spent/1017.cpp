#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int temp, vel;
    cin >> temp;
    cin >> vel;
    cout << fixed << setprecision(3);
    float dist = vel * temp;
    cout << dist / 12 << "\n";

    return 0;
}
