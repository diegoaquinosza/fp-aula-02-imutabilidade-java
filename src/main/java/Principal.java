import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        // Shallow Immutability: o record não muda de ponteiro, mas os dados internos da Cidade mudam
        Cidade cidadeMutavel = new Cidade("Palmas");
        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Diego", cidadeMutavel);
        System.out.println("Antes: " + pessoaShallow.cidade().getNome());
        cidadeMutavel.setNome("Porto Nacional"); // Efeito colateral!
        System.out.println("Depois (mutou indiretamente): " + pessoaShallow.cidade().getNome());

        // Deep Immutability: nada pode ser alterado após a instanciação
        CidadeRecord cidadeImutavel = new CidadeRecord("Palmas");
        PessoaRecord pessoaDeep = new PessoaRecord("Diego", cidadeImutavel);
        System.out.println("Totalmente imutável: " + pessoaDeep);
    }
}
