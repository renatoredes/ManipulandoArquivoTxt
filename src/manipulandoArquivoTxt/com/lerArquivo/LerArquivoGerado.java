package manipulandoArquivoTxt.com.lerArquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LerArquivoGerado {

    public static void main(String[] args) {

        try {
            // responsavel por abrir o arquivo
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
            // responsavel por ler o arquivo
            InputStreamReader input = new InputStreamReader(arquivo);
            // resposavel por ler linha por linha
            BufferedReader brBuf = new BufferedReader(input);

            String linha;

            do {
                linha = brBuf.readLine();
                if (linha != null) {
                    String[] palavras = linha.split(";");

                    System.out.println("Nova linha  -----------  ----------------  ----------");
                    for (int i = 0; i < palavras.length; i++) {
                        System.out.println("Palavra lida = " + palavras[i]);
                    }

                }
            } while (linha != null);

        } catch (Exception e) {

            System.out.println("Erro ao Ler o Arquivo.");
        }
    }
}
