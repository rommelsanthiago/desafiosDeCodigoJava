<style>
r { color: #f314b5 }
</style>

# Descrição
Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.

## Entrada
Linha 1: A quantidade de logs a serem analisados;
Linhas Seguintes: <br> Cada linha terá as informações de log de um determinado serviço AWS, no seguinte:<br>
<r>yyyy-MM-dd HH:mm:ss,{Nome do Serviço AWS},{Log do Evento Registrado Neste Serviço AWS}</r>
## Saída
O programa exibirá os resultados da análise, apresentando:

- A quantidade de eventos específicos para cada log de serviço AWS lido na Entrada (em ordem de leitura):<br>
<r>Eventos por servico: <br>
{Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}<br>
{Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}<br>
{Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}</r><br>
- O serviço AWS que teve a maior* quantidade de eventos registrados:<br>
<r>Maior:{Nome do Serviço AWS}</r><br>
- O serviço AWS que teve a menor* quantidade de eventos registrados:<br>
<r>Menor:{Nome do Serviço AWS}</r>
  * Tenha como verdade que sempre teremos um serviço com maior incidência e outro com menor, ou seja, nunca teríamos um empate. Veja exemplos abaixo.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	| Saída
--------|---------
1 <br> 2023-07-24 10:15:32,RDS,Database instance db-01a failed to start | Eventos por servico: <br> RDS:1 <br> Maior:RDS <br> Menor:RDS
3 <br> 2023-07-24 10:15:32,EC2,Instance i-12345 started <br> 2023-07-24 10:17:45,EC2,Instance i-67890 stopped <br> 2023-07-24 10:20:11,S3,Bucket example-bucket created | Eventos por servico: <br> S3:1 <br> EC2:2 <br> Maior:EC2 <br> Menor:S3
6 <br> 2023-07-24 10:15:32,EC2,Instance i-12345 started <br> 2023-07-24 10:17:45,S3,Bucket example-bucket created <br> 2023-07-24 10:20:11,EC2,Instance i-67890 stopped <br> 2023-07-24 10:23:05,Lambda,Function example-function executed successfully <br> 2023-07-24 10:25:39,S3,Object example.txt deleted from bucket example-bucket <br> 2023-07-24 10:28:02,EC2,Instance i-98765 started	| Eventos por servico: <br> S3:2 <br> EC2:3 <br> Lambda:1 <br> Maior:EC2 <br> Menor:Lambda