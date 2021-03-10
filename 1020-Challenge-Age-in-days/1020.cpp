#include <iostream>

using namespace std;

int main(){
    int d;
    cin >> d;

    int ano = d/365;
    int mes = (d%365)/30;
    int dia = (d%365)%30;

    cout << ano << " ano (s)" << "\n";
    cout << mes << " mes (es)" << "\n";
    cout << dia << " dia (s)" << "\n";

    return 0;
}