#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    float codigo,produto, quantidade;
    cin >> codigo >> quantidade;
    if (codigo == 1)
    {
        produto = 4.00;
    } else if (codigo == 2)
    {
        produto = 4.50;
    } else if (codigo == 3)
    {
        produto = 5.00;
    } else if (codigo == 4)
    {
        produto = 2.00;
    } else if (codigo == 5)
    {
        produto = 1.50;
    }

    cout << fixed << setprecision(2);
    cout << "Total: R$ " << (produto*quantidade) << "\n";
    
    return 0;  

}