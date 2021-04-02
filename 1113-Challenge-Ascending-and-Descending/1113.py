numero1, numero2 = input().split()
numero1 = int(numero1)
numero2 = int(numero2)
while numero1 != numero2:
    if numero1 > numero2:
        print('Decrescente')
    else:
        print('Crescente')
    numero1, numero2 = input().split()
