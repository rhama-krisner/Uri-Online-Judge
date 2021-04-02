soma = []
i = 0
quantidade = 1
while i <= quantidade:
    num1, num2 = input().split()
    num1 = int(num1)
    num2 = int(num2)

if num1 > 0 and num2 > 0:
    quantidade += 1
    i += 1
    if num1 > num2:
        aux = num2
        num2 = num1
        num1 = aux
        soma.append(num1)
    for i in range(quantidade):
        while num1 < num2:
            num1 += 1
            soma.append(num1)
    print('Sum={}'.format(sum(soma)))
    soma.clear()





