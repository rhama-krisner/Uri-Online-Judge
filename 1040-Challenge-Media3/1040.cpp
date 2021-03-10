#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float n1, n2, n3, n4;
    cin >> n1 >> n2 >> n3 >> n4;

    cout << fixed << setprecision(1);
    float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
    cout << "Media: " << media << "\n";

    if (media >= 7.0)
    {
        cout << "Aluno aprovado" << "\n";
    }
    else if (media <= 5.0)
    {
        cout << "Aluno reprovado." << "\n";
    }
    else if (media > 5.0 && media <= 6.9)
    {
        cout << "Aluno em exame." << "\n";
        float novaNota, novaMedia;
        cout << "Nota do exame: ";
        cin >> novaNota;

        novaMedia = (media + novaNota) / 2;

        if (novaMedia < 5)
        {
            cout << "Aluno reprovado." << "\n";
        }
        else
        {
            cout << "Aluno Aprovado" << "\n";
        }
        cout << "Media final: " << novaMedia << "\n";
    }

    return 0;
}