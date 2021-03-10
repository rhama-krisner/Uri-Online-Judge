#include <iostream>

using namespace std;

int main(){
    float numero;
    cin >> numero;
    if (numero >= 0 && numero <=25)
    {
        cout << "Intervalo [0,25]" << "\n";
    } else if (numero >25 && numero <= 50)
    {
        cout << "Intervalo (25,50]" << "\n";
    } else if (numero > 50 && numero <= 75)
    {
        cout << "Intervalo (50,75]" << "\n";
    } else if (numero > 75 && numero <= 100)
    {
        cout << "Intervalo (75,100]" << "\n";
    } else {
        cout << "Fora de intervalo" << "\n";
    }
    
    return 0;  
    
    
}