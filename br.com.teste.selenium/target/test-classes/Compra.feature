#language: pt
Funcionalidade: Efatuar compra

  #####################################################
  #		    VALIDOS  	    #
  #####################################################
  @CT01 @EfetuarCompraValidos
  Esquema do Cenario: <Cenario> Efetuar Compra
    Dado que usuario tenha selecionado os produtos para compra "<qtdeItens>"
    E exibir tela para confirmar produtosSelecionados
    Quando preencher dados de envio cobranca e clicar em PlaceToOrder "<nome>", "<endereco>", "<cidade>", "<uf>", "<cep>", "<telefone>", "<email>", "<bandeiraCartao>", "<nroCartao>", "<codCvc>"
    Entao deve exibir tela tela de resumo da compra

    Exemplos: 
      | Cenario                                       | qtdeItens | nome  | endereco  | cidade    | uf | cep   | telefone   | email           | bandeiraCartao | nroCartao        | codCvc |
      | CT01.01 com cartao MasterCard - sucesso       |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | MasterCard     | 5484604609172765 |    483 |
      | CT01.02 com cartao Visa - sucesso             |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | Visa           | 4012001037141112 |    123 |
      | CT01.03 com cartao American express - sucesso |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | Amex           | 3710134855548766 |    900 |

  #####################################################
  #		    INVALIDOS  	    #
  #####################################################
  @CT02 @EfetuarCompraIvalidos
  Esquema do Cenario: <Cenario> Efetuar Compra
    Dado que usuario tenha selecionado os produtos para compra "<qtdeItens>"
    E exibir tela para confirmar produtosSelecionados
    Quando preencher dados de envio cobranca e clicar em PlaceToOrder "<nome>", "<endereco>", "<cidade>", "<uf>", "<cep>", "<telefone>", "<email>", "<bandeiraCartao>", "<nroCartao>", "<codCvc>"
    Entao deve exibir tela tela de resumo da compra

    Exemplos: 
      | Cenario                                           | qtdeItens | nome  | endereco  | cidade    | uf | cep   | telefone   | email           | bandeiraCartao | nroCartao | codCvc |
      | CT02.01 com cartao MasterCard invalido - invalido |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | MasterCard     | AAAA      |    483 |
      | CT02.02 com cartao Visa invalido - invalido       |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | Visa           |       555 |    123 |
