import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.print("Digite um CEP para busca( sem traços ): ");
        var numeroCep = scanner.nextLine();

        try {

            ConsultaCep consultaCep = new ConsultaCep();

            Endereco endereco = consultaCep.buscaEndereco(numeroCep);
            System.out.println(endereco);

            GeradorDeArquivo arquivo = new GeradorDeArquivo();
            arquivo.salvaJson(endereco);

        } catch (RuntimeException | IOException e) {

            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação...");

        }

    }
}
