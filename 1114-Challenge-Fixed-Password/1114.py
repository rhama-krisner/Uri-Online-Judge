senha_definida = 2002
passe = int(input())
i = 0
while senha_definida == passe:
    print('Acesso Permitido')
else:
    print('Senha inválida')
    passe = int(input())
