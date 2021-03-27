quantidade = int(input())
coelho = 0
rato = 0
sapo = 0

for i in range(1, quantidade + 1):
    x = input().split()
    quantidadeCobaia, tipoCobaia = x
    if tipoCobaia == "C":
        coelho = coelho + int(quantidadeCobaia)
    if tipoCobaia == "R":
        rato = rato + int(quantidadeCobaia)
    if tipoCobaia == "S":
        sapo = sapo + int(quantidadeCobaia)

total = sapo + rato + coelho
porcentagemCoelho = (coelho / total) * 100
porcentagemRato = (rato / total) * 100
porcentagemSapo = (sapo / total) * 100

print("total: ", total)
print('Total de Coelhos: ', coelho)
print('Total de Sapos: ', sapo)
print('Total de ratos: ', rato)
print('Percentual de coelhos: {:.2f}%'.format(porcentagemCoelho))
print('Percentual de ratos: {:.2f}%'.format(porcentagemRato))
print('Percentual de sapos: {:.2f}%'.format(porcentagemSapo))
