Este programa em Java permite consultar informações de endereço a partir de um CEP utilizando a API pública ViaCEP. 
O usuário digita um CEP no terminal, o sistema envia uma requisição HTTP, recebe o JSON retornado e converte esses dados em um objeto Endereco, exibindo logradouro, cidade e estado. 
O projeto usa HttpClient para a requisição e Gson para transformar o JSON em um objeto Java.
Cada resultado de uma requisição à API é gravado em um arquivo JSON.
