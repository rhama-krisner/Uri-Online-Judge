#include <iomanip>
#include <iostream>

using namespace std;

int main() {
    int number, hour;
    float value;

    cin >> number;
    cin >> hour;
    cin >> value;

    cout << "NUMBER = " << number << '\n';
    cout << fixed << setprecision(2);
    cout << "SALARY = U$ " << hour * value << '\n';

    return 0;
}