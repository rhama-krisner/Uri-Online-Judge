for i in range(5):
    numero1, numero2 = input().split()
    numero1 = int(numero1)
    numero2 = int(numero2)
    if numero1 > numero2:
        print('Decrescente')
    else:
        print('Crescente')
