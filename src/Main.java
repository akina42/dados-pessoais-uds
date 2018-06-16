import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<DadosPessoais> arrayDadosPessoais = new ArrayList<>();
        DadosPessoais primeiroDadosPessoais = new DadosPessoais("José", "87047230",
                "Avenida Brasil", "123", "Edíficio Torres", "Centro",
                "Maringá", "Paraná", "44999923654");

        DadosPessoais segundoDadosPessoais = new DadosPessoais("Maria", "87047230",
                "Avenida Brasil", "123", "Edíficio Torres", "Centro",
                "Maringá", "Paraná", "44999923654");

        DadosPessoais terceiroDadosPessoais = new DadosPessoais("Lucas", "87047230",
                "Avenida Brasil", "123", "Edíficio Torres", "Centro",
                "Maringá", "Paraná", "44999923654");

        DadosPessoais quartoDadosPessoais = new DadosPessoais("Laura", "87047230",
                "Avenida Brasil", "123", "Edíficio Torres", "Centro",
                "Maringá", "Paraná", "44999923654");


        arrayDadosPessoais.add(primeiroDadosPessoais);
        arrayDadosPessoais.add(segundoDadosPessoais);
        arrayDadosPessoais.add(terceiroDadosPessoais);
        arrayDadosPessoais.get(0).setNomePessoa("José de Almeida");
        arrayDadosPessoais.set(1, quartoDadosPessoais);
        arrayDadosPessoais.remove(2);

        /*for (DadosPessoais dadoPessoal : arrayDadosPessoais){
            ApresentacaoArrayDadosPessoais apresentacaoArrayDadosPessoais = new ApresentacaoArrayDadosPessoais();
            apresentacaoArrayDadosPessoais.imprimeUmDadoPessoal(dadoPessoal);
        }*/

        arrayDadosPessoais.stream().forEach((dadoPessoal) -> {
            ApresentacaoArrayDadosPessoais apresentacaoArrayDadosPessoais = new ApresentacaoArrayDadosPessoais();
            apresentacaoArrayDadosPessoais.imprimeUmDadoPessoal(dadoPessoal);
        });
    }
}
