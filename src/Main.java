import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner( System.in );

        System.out.print("Digite um CEP para busca( sem traços ): ");
        var numeroCep = scanner.next();

        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println(consultaCep.buscaEndereco(numeroCep));

    }
}
