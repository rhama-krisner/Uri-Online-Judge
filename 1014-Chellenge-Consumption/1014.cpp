#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    int x;
    float y;
    cin >> x >> y;
    cout << fixed << setprecision(3);
    cout << x / y << " km/l";

    return 0;
}