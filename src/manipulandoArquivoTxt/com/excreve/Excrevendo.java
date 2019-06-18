package manipulandoArquivoTxt.com.excreve;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Excrevendo {

    public static void main(String[] args) {
        try {
            // Arquivo de Saida
            // estou criando um arquivo para ser escrito
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");

            // o cara que imprime como o printn
            // ele quer alguém que escreva nesse arquivo que estar aberto
            PrintWriter pri = new PrintWriter(arquivo);

            // aqui eu escrevo no arquivo e gravo as informações
            pri.println("Linha1 Coluna1; Linha1 Coluna 2; Linha Coluna 3");
            pri.println("Linha2 Coluna2; Linha1 Coluna 2; Linha Coluna 3");
            pri.println("Linha3 Coluna3; Linha1 Coluna 2; Linha Coluna 3");

            pri.close();
            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo");
        }

    }

}
