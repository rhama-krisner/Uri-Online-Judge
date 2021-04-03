quantidade = int(input())
i = 0
while i < quantidade:
    i += 1
    numero1, numero2 = input().split()
    numero1 = int(numero1)
    numero2 = int(numero2)
    if numero2 == 0:
        print('divisao impossivel')
    if numero2 != 0:
        divisao = numero1 / numero2
        print('{:.1f}'.format(divisao))
