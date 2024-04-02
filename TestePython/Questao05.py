lista = []
palavra = input("Digite uma palavra: ")

for i in palavra:
    lista.append(i)

tamanho = len(lista)

for i in range(tamanho):
    tamanho -= 1
    print(lista[tamanho], end="")
