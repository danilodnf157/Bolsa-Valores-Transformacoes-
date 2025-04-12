# Projeto UT1 – Transformações da Bolsa de Valores BOVESPA (1994–2020)

Este projeto contém a implementação das transformações obrigatórias da **primeira etapa (UT1)** da disciplina de Estrutura de Dados, utilizando exclusivamente arrays simples.

## ✅ Transformações Implementadas

### 1. T1 – Transformar Data
- Converte o campo `datetime` do formato `YYYY-MM-DD` para `DD/MM/YYYY`
- Gera o arquivo: `b3stocks_T1.csv`

### 2. F1 – Maior Volume por Dia
- Para cada data, mantém apenas o registro com o **maior volume negociado**
- Gera o arquivo: `b3stocks_F1.csv`

### 3. Filtro – Volume Acima da Média
- Calcula a média do volume de todos os registros
- Filtra os registros com volume **acima da média**
- Gera o arquivo: `b3stocks_T1_acimaMedia.csv`

## 🧪 Como Executar

1. Importe o projeto no Eclipse como **projeto Maven existente**
2. Execute a classe `Main.java`
3. Os arquivos `.csv` serão gerados automaticamente na pasta `src/main/resources`

## 🔒 Regras Atendidas

- ✅ Uso exclusivo de arrays (`String[]`, `double[]`, etc.)
- ✅ Nenhuma utilização de coleções (`ArrayList`, `HashMap`, etc.)
- ✅ Saída correta dos arquivos exigidos pela etapa

---

## 📥 Como Baixar e Executar o Projeto

1. Acesse o repositório no GitHub:  
   🔗 https://github.com/danilodnf157/Bolsa-Valores-Transformacoes-

2. Clique no botão verde **"Code"** e depois em **"Download ZIP"**, ou acesse diretamente:  
   🔗 https://github.com/danilodnf157/Bolsa-Valores-Transformacoes-/archive/refs/heads/main.zip

3. Extraia o arquivo `.zip` em uma pasta local.

4. No Eclipse, vá em **File > Import > Existing Maven Projects**.

5. Selecione a pasta onde o projeto foi extraído.

6. Finalize a importação e execute a classe `Main.java`.

---

Feito com 💻 por **Danilo Nascimento de Freitas** – UEPB
