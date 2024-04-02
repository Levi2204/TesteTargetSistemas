# int contador = 0;
#         int termoUm = 1;
#         int termoDois = 1;
#         int termoUmAnt = 1;
#         while (contador <= qnts){
#             termoUmAnt = termoUm;
#             termoUm = termoUm + termoDois;
#             termoDois = termoUmAnt;
#             System.out.print(termoUm  + "-->");
#             contador ++;
#         }

lista = []
numero = int(input("Digite um número para saber se ele está na sequência de fibonacci: "))


contador = 1

primeiro = 1
segundo = 1

while (contador <= numero):
    lista.append(primeiro)
    antigo = primeiro
    primeiro += segundo
    segundo = antigo
    contador +=1
if (numero in lista):
    print(f"O número {numero} está na sequência de fibonacci")
else:
    print(f"O número {numero} não está na sequência de fibonacci")

