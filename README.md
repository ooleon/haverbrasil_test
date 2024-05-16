# haverbrasil_test
Test java JafaFX Scene for haverbrasil.com.br

Teste funcional para avaliar conhecimentos de Java e JavaFX
Para a execução do teste é obrigatório o uso do seguinte software que pode ser baixado da internet:

- JavaFX 10.0.1

- Scene Builder 2.0

 

Codificar Cadastro de pessoa física composto por 3 telas: tela do menu, tela do cadastro e uma tela para informar o nome do país.

- A tela do menu deve conter as seguintes opções:

            1.    Cadastro dados Pessoais e Localização

            2.    Informar o nome dos pais

            3.    Visualizar cadastro

            4.    Terminar

 

- A tela do cadastro dados pessoais e localização deve conter os seguintes campos, todos obrigatórios exceto o complemento:

    Nome
    Endereço (logradouro)
    Número
    Complemento
    Bairro
    Cidade
    Sigla do estado (selecionar a partir de uma lista)
    CEP  (formato:  XXXXX-XXX)
    CPF  (formato:  XXX.XXX.XXX-XX) – sem validação
    Data de nascimento: DD/MM/AAAA - com validação

 

 Esta tela deve conter 3 botões:  Limpar, Cancelar e Continuar.

- O botão Limpar permite apagar todos os dados do formulário sem sair da tela;

- O botão Cancelar permite sair da tela e voltar para a tela do menu ignorando toda a informação digitada;

- O botão Continuar permite abrir e sobrepor a tela para informar o nome dos pais assim que todos os campos obrigatórios forem preenchidos. Imprimir o texto: “Um ou mais campos

    obrigatórios não foram preenchidos.”  como mensagem de alerta se um ou mais campos obrigatórios não forem preenchidos.

 

- A tela para informar o nome dos pais deve conter:

            1.    Nome do pai

            2.    Nome da mãe

  Esta tela deve conter 3 botões: Limpar, Cancelar e Salvar.

  - O botão Limpar permite apagar os dados digitados sem sair da tela;

  - O botão Cancelar permite sair da tela e voltar para a tela anterior, colocando o cursor sobre o campo “Nome”.

  - O botão Salvar permite abrir a tela de Visualização do Cadastro onde todos os dados informados devem ser apresentados e o botão “Ok” o qual permitirá fechar todas as telas e apresentar o menu.

 

- A opção “Visualização do Cadastro” do menu permite abrir uma tela para mostrar todos os dados informados e o botão “Ok” o qual permitirá fechar a tela, apagar os dados da memória e apresentar o menu.

 

- A opção “Terminar” fecha o menu e termina o programa.