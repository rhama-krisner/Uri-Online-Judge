nota1 = input()
while float(nota1) % 1 > 0 or float(nota1) < 0 or float(nota1) > 10:
    print('nota inválida')
    nota1 = input()
if float(nota1) % 1 == 0 or float(nota1) > 0:
    nota2 = input()
    while float(nota2) % 1 > 0 or float(nota2) < 0 or float(nota2) > 10:
      print('nota inválida')
      nota2 = input()
    if float(nota2) % 1 == 0 or float(nota2) > 0:
        print('media={}'.format((float(nota2)+float(nota1))/2))

