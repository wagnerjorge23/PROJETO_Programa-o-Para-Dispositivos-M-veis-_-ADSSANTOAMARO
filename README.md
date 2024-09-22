# PROJETO_Programaco-Para-Dispositivos-Moveis-_-ADSSANTOAMARO

Estrutura Geral
Activity Principal (MainActivity): Contém 4 botões:

Botão 1: Chama a Calculadora de IMC.
Botão 2: Chama a Calculadora de Combustível.
Botão 3: Chama a Apresentação de Dados do Aluno.
Botão 4: Fecha o app.
Figura de Retorno: Em todas as Activities, deve haver uma figura (X) na barra superior que, ao ser clicada, retorna para a MainActivity.

Detalhamento das Activities:
1. Calculadora de IMC (IMCActivity)
O usuário deve digitar o peso (em kg) e a altura (em metros).
O app calcula o Índice de Massa Corporal (IMC) com a fórmula:

𝐼𝑀𝐶=𝑝𝑒𝑠𝑜𝑎𝑙𝑡𝑢𝑟𝑎2IMC=altura2peso
​
Após calcular, exibe a classificação do IMC de acordo com os intervalos (ex: abaixo do peso, normal, sobrepeso, obesidade).
Um botão "Limpar" deve apagar todos os dados digitados.
Um ícone "X" no topo retorna para a MainActivity.
2. Calculadora de Combustível (CombustivelActivity)
O usuário insere o preço da gasolina e do álcool.
O app verifica qual combustível vale mais a pena com base na regra dos 70%:
𝑆𝑒𝑝𝑟𝑒𝑐\c𝑜𝑑𝑜𝑎ˊ𝑙𝑐𝑜𝑜𝑙≤70%𝑑𝑜𝑝𝑟𝑒𝑐\c𝑜𝑑𝑎𝑔𝑎𝑠𝑜𝑙𝑖𝑛𝑎→𝐴ˊ𝑙𝑐𝑜𝑜𝑙𝑒ˊ𝑚𝑎𝑖𝑠𝑣𝑎𝑛𝑡𝑎𝑗𝑜ˊ
 maisvantajoso.
RadioGroup: Permite ao usuário selecionar o combustível que ele está considerando. O app automaticamente compara o valor digitado e exibe a diferença percentual em relação ao parâmetro de 70%.
Não é necessário clicar em um botão extra para calcular, pois o cálculo deve ser feito automaticamente ao inserir os valores.
O ícone "X" no topo retorna para a MainActivity.
3. Apresentação (ApresentacaoActivity)
Exibe os seguintes dados:
Nome do aluno.
Curso.
Número de matrícula.
Semestre.
Disciplina.
Um ícone "X" no topo retorna para a MainActivity.
4. Fechar o App
O botão encerra a aplicação.


®️OMERIUM TECH
