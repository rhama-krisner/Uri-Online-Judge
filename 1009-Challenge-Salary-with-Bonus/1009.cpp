#include <iomanip>
#include <iostream>

using namespace std;

int main() {
    string name;
    float venda, salario;
    cin >> name;
    cout << fixed << setprecision(2);
    cin >> salario;
    cin >> venda;
    cout << "TOTAL = R$ " << salario + ((venda / 100) * 15) << '\n';

    return 0;
}