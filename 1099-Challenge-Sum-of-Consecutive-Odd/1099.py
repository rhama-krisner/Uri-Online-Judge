quantidade_teste = int(input())
impar = []

for i in range(quantidade_teste):
    num1, num2 = input().split()
    num1 = int(num1)
    num2 = int(num2)
    while num1 < num2:
        num1 += 1
        if num1 % 2 != 0:
            impar.append(num1)
    del impar[len(impar) - 1]
    print(sum(impar))
    impar.clear()
