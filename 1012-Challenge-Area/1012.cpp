#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    float A, B, C;
    cin >> A >> B >> C;
    cout << fixed << setprecision(3);
    cout << "TRIANGULO: " << A*C/2 << "\n";
    cout << "CIRCULO: " << 3.14159 * (C*C) << "\n";
    cout << "TRAPEZIO: " << ((A+B)*C)/2 << "\n";
    cout << "QUADRADO: " << (B*B) << "\n";
    cout << "RETANGULO: " << A*B << endl;

    return 0; 
}