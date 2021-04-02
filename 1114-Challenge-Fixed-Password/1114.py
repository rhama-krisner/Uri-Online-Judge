senha_definida = 2002
passe = int(input())
i = 0
while senha_definida != passe:
    print('Senha Invalida')
    passe = int(input())
    if senha_definida == passe:
        print('Acesso Permitido')

