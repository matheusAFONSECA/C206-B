public class Cliente {
    // Cliente é uma das classes principais para esse exercício
    // Ela exerce uma relação de agregação com a classe Computador

    // atributos
    String nome;    // nome do cliente
    long cpf;       //cpf do cliente

    // instanciando os computadores que o cliente comprou -> considerando um máximo de 20
    Computador[] computadorsComprados = new Computador[20];      // computadores comprados

    // metodos
    public float calculaTotalCompra(){       // calcula o total da compra do cliente
        // var aux
        float total = 0;

        for (int i = 0; i < computadorsComprados.length; i++){
            if (computadorsComprados[i] != null){
                total = total + computadorsComprados[i].preco;
            }
        }

        return total;
    }

}
