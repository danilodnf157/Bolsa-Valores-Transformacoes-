# Projeto T1 - Bolsa de Valores BOVESPA (1994–2020)

Este repositório contém a implementação das **transformações obrigatórias** da primeira etapa do projeto da disciplina de Estrutura de Dados.

## ✅ Transformações Implementadas

### T1: Transformação da Data
- Transforma o campo `datetime` do formato `YYYY-MM-DD` para `DD/MM/YYYY`
- Gera o arquivo: `b3stocks_T1.csv`

### F1: Maior Volume por Dia
- Para cada data, seleciona o registro com o **maior volume negociado**
- Gera o arquivo: `b3stocks_F1.csv`

### Filtro: Volume Acima da Média
- Calcula a média de volume negociado
- Seleciona apenas os registros com volume **acima da média**
- Gera o arquivo: `b3stocks_T1_acimaMedia.csv`

## 🛠️ Execução

1. Importe o projeto no Eclipse como um **projeto Maven existente**
2. Execute a classe `Main.java`
3. Os arquivos `.csv` gerados estarão disponíveis na pasta `src/main/resources`

## 🧱 Restrições Atendidas

- ✅ Uso exclusivo de `arrays` simples (`String[]`, `double[]`, etc.)
- ✅ Nenhuma dependência externa além do JDK
- ✅ Estrutura modular e limpa, pronta para as próximas etapas
obs: após execultar o codigo lembre de atualizar a pasta do projeto (F5) para ver os novos arquivos CSV
---
