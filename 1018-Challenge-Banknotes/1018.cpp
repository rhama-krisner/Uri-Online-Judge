#include <iostream>

using namespace std;

int main()
{
    int valor;
    cin >> valor;

    int resultado = valor/100;
    cout << resultado << " nota (s) de R$ 100,00" << "\n";
    valor = valor - (resultado*100); // reseta o valor de entrada para ser chamado de novo.
    
    resultado = valor/50;
    cout << resultado << " nota (s) de R$ 50,00" << "\n";
    valor = valor - (resultado*50);
    
    resultado = valor/20;
    cout << resultado << " nota (s) de R$ 20,00" << "\n";
    valor = valor - (resultado*20);

    resultado = valor/10;
    cout << resultado << " nota (s) de R$ 10,00" << "\n";
    valor = valor - (resultado*10);

    resultado = valor/5;
    cout << resultado << " nota (s) de R$ 5,00" << "\n";
    valor = valor - (resultado*5);

    resultado = valor/2;
    cout << resultado << " nota (s) de R$ 2,00" << "\n";
    valor = valor - (resultado*2);

    resultado = valor/1;
    cout << resultado << " nota(s) de R$ 1,00" << "\n";
    valor = valor - (resultado*1);
    
}