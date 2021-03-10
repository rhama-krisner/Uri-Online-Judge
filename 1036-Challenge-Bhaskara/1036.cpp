#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main()
{
    double a, b, c;
    cin >> a >> b >> c;
    double delta = pow(b, 2) - (4 * a * c);
    double x1 = (-(b) + sqrt(delta)) / (2.0 * a);
    double x2 = (-(b)-sqrt(delta)) / (2.0 * a);

    if (isnan(delta) || isnan(x1) || isnan(x2))
    {
        cout << "Impossivel calcular" << "\n";
    }
    else
    {

        cout << fixed << setprecision(5);
        cout << "R1 = " << x1 << "\n";
        cout << "R2 = " << x2 << "\n";
    }

    return 0;
}