public class ApresentacaoArrayDadosPessoais {

    public void imprimeUmDadoPessoal(DadosPessoais dadosPessoais){
        System.out.println("\nNome: " + dadosPessoais.getNomePessoa());
        System.out.println("CEP: " + dadosPessoais.getCep());
        System.out.println("Endereço: " + dadosPessoais.getEndereco());
        System.out.println("Número: " + dadosPessoais.getNumero());
        System.out.println("Complemento: " + dadosPessoais.getBairro());
        System.out.println("Bairro: " + dadosPessoais.getBairro());
        System.out.println("Cidade: " + dadosPessoais.getCidade());
        System.out.println("Estado: " + dadosPessoais.getEstado());
        System.out.println("Telefone: " + dadosPessoais.getTelefone());
    }
}
