x, y = input().split()
x = int(x)
y = int(y)

while x != 0 and y != 0:
    if x > 0 and y > 0:
        print('primeiro')
        x, y = input().split()
        x = int(x)
        y = int(y)
    if x < 0 and y > 0:
        print('segundo')
        x, y = input().split()
        x = int(x)
        y = int(y)
    if x < 0 and y < 0:
        print('terceiro')
        x, y = input().split()
        x = int(x)
        y = int(y)
    if x > 0 and y < 0:
        print('quarto')
        x, y = input().split()
        x = int(x)
        y = int(y)
    if x == 0 or y == 0:
        print('')
        break
