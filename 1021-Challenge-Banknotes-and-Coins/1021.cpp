#include <iostream>

using namespace std;

int main()
{
    float valor;
    cin >> valor;
    cout << "valor:"<< "\n";

    int resultado = valor / 100;
    cout << resultado << " nota (s) de R$ 100.00"<< "\n";
    valor = valor - (resultado * 100);

    resultado = valor /50;
    cout << resultado << " nota (s) de R$ 50.00" << "\n";
    valor = valor - (resultado*50);

    resultado = valor/20;
    cout << resultado << " nota (s) de R$ 20.00" << "\n";
    valor = valor - (resultado*20);

    resultado = valor/10;
    cout << resultado << " nota (s) de R$ 10.00" << "\n";
    valor = valor - (resultado*10);

    resultado = valor/5;
    cout << resultado << " nota (s) de R$ 5.00" << "\n";
    valor = valor - (resultado*5);

    resultado = valor/2;
    cout << resultado << " nota (s) de R$ 2.00"  << "\n";
    valor = valor - (resultado*2);
    
    cout << "MOEDAS:" << "\n";

    resultado = valor/1.0f;
    cout << resultado << " moeda (s) de R$ 1.00" << "\n";
    valor = valor - (resultado*1);
    
    resultado = valor/0.5f;
    cout << resultado << " moeda (s) de R$ 0.50" << "\n";
    valor = valor - (resultado*0.5);

    resultado = valor/0.25f;
    cout << resultado << " moeda (s) de R$ 0.25" << "\n";
    valor = valor - (resultado*0.25);

    resultado = valor/0.10f;
    cout << resultado << " moeda (s) de R$ 0.10" << "\n";
    valor = valor - (resultado*0.10);

    resultado = valor/0.05f;
    cout << resultado << " moeda (s) de R$ 0.05" << "\n";
    resultado = valor - (resultado*0.05);

    resultado = valor/0.01f;
    cout << resultado << " moeda (s) de R$ 0.01" << "\n";
    resultado = valor - (resultado*0.01);

    return 0;
}