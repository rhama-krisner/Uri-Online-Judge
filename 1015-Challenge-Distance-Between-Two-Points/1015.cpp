#include <iostream>
#include <math.h>
#include <iomanip>

using namespace std;

int main()
{
    float x1, x2, y1, y2;
    cin >> x1 >> y1;
    cin >> x2 >> y2;
    float distancia = sqrt(pow(x2-x1,2) + pow(y2-y1, 2));
    cout << fixed << setprecision(4);
    cout << distancia << "\n";
    
    return 0;
}