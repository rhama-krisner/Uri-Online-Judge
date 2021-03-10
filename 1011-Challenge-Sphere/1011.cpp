#include <math.h>

#include <iomanip>
#include <iostream>

using namespace std;

int main() {
    float R;
    float pi = 3.14159;
    cin >> R;
    float volume = (4.0 / 3) * pi * pow(R, 3);
    cout << fixed << setprecision(3);
    cout << "VOLUME = " << volume << endl;

    return 0;
}