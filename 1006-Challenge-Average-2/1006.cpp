#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double a, b, c;

    cin >> a;
    if (a > 10 || a < 0) {
        exit;
    }

    cin >> b;
    if (b > 10 || b < 0) {
        exit;
    }

    cin >> c;
    if (c > 10 || c < 0) {
        exit;
    }

    double media = (a + b + c) / 3;
    cout << fixed << setprecision(1);
    cout << "MEDIA = " << media << endl;
}