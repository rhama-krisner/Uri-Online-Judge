#include <iomanip>
#include <iostream>
using namespace std;

int main() {
    int numero, quantidade1, quantidade2;
    float valor1, valor2;
    cin >> numero >> quantidade1 >> valor1;
    cin >> numero >> quantidade2 >> valor2;
    cout << fixed << setprecision(2);
    cout << "VALOR A PAGAR = R$ " << (quantidade1 * valor1) + (quantidade2 * valor2);
    return 0;
}