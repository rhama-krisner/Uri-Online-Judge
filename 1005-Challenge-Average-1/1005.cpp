#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    double a, b;
    cout << fixed << setprecision(1) << '\n' ;
    cin >> a;
    cout << a << "\n";
    
    if (a < 0 || a > 10)
    {
        cout << "\n";
        cout << "Pesentation Error \n";
        terminate();
    }
    
    cin >> b;
    if (b < 0 || b > 10)
    {
        cout << "\n";
        cout << "Pesentation Error\n";
        terminate();
    }
    
    cout << fixed << setprecision(4) << '\n' ;
    double media = (a + b)/2;
    cout << "MEDIA = " << media << "\n";
    
}