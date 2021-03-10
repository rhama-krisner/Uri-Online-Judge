#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    double n = 3.14159;
    double raio;

    cin >> raio ;
    cout << fixed << setprecision(4);
    cout << "A = " << n * (raio * raio);
};

