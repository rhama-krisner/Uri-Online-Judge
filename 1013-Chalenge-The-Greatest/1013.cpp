#include <iostream>
#include <cmath> //Chamando biblioteca C de matemática.

using namespace std;

int main()
{
    int a, b, c;
    cin >> a >> b >> c;
    int maiorAB = (a + b + abs(a - b)) / 2; //abs( ) Faz parte da linguagem C. abs Força o valor a ser positivo
    if (maiorAB > c)
    {
        cout << maiorAB << " eh maior. \n";
    }
    else
    {
        cout << c << " eh maior.\n";
    }

    return 0;
}