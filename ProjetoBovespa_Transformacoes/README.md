# Projeto UT1 - Transformações da Bolsa de Valores BOVESPA (1994–2020)

Este projeto contém a implementação das transformações obrigatórias da **primeira etapa (UT1)** da disciplina de Estrutura de Dados.

## ✅ Transformações Implementadas

### 1. T1 - Transformar Data
- Converte o campo `datetime` do formato `YYYY-MM-DD` para `DD/MM/YYYY`
- Salva como: `b3stocks_T1.csv`

### 2. F1 - Maior Volume por Dia
- Para cada data, mantém apenas o registro com o **maior volume negociado**
- Salva como: `b3stocks_F1.csv`

### 3. Filtro - Volume Acima da Média
- Calcula a média do volume de todos os registros
- Filtra os registros com volume **acima da média**
- Salva como: `b3stocks_T1_acimaMedia.csv`

## 🧪 Como Executar

1. Importe o projeto no Eclipse como **projeto Maven existente**
2. Rode a classe `Main.java`
3. Os arquivos `.csv` serão gerados na pasta `src/main/resources`

## 🛠️ Regras Atendidas

- ✅ Uso exclusivo de `arrays` simples (`String[]`, `double[]`)
- ✅ Nenhum uso de bibliotecas como `ArrayList`, `HashMap` em lógica principal
- ✅ Geração correta dos arquivos exigidos

---

Feito com 💻 por [Seu Nome]
