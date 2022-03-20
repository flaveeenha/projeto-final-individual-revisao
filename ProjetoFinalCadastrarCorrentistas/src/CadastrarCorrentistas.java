import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastrarCorrentistas {

	public static void main(String[] args) throws IOException {

		ArrayList<Correntistas> guardacorrentistas = new ArrayList();

		while (true) {

			int opcao = 0;
			String mostra = "";
			String nomeArq = "C:\\Users\\flavi\\CadastroCorrentistas.txt";
			String linha = "";
			File arq = new File(nomeArq);

			Scanner teclado = new Scanner(System.in);

			System.out.println("*********************");
			System.out.println("Selecione uma opção");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Consulta");
			System.out.println("3 - Gravar");
			System.out.println("4 - Abrir janela");
			System.out.println("5 - Sair");
			System.out.println("*********************");
			opcao = teclado.nextInt();

			Correntistas correntistas = new Correntistas();
			switch (opcao) {
			case 1:
				System.out.println("Informe a agência do cliente:");
				correntistas.setAgencia(teclado.nextInt());

				System.out.println("Informe a conta do cliente:");
				correntistas.setConta(teclado.nextInt());

				System.out.println("Informe o saldo do saldo:");
				correntistas.setSaldo(teclado.nextFloat());

				teclado.nextLine();
				System.out.println("Informe o nome do cliente:");
				correntistas.setNome(teclado.nextLine());

				System.out.println("Informe o email do cliente:");
				correntistas.setEmail(teclado.next());

				System.out.println("Informe o Telefone do cliente:");
				correntistas.setTelefone(teclado.next());

				guardacorrentistas.add(correntistas);

				break;

			case 2:
				for (Correntistas gc : guardacorrentistas) {

					System.out.println("Agência: " + gc.getAgencia() + " - Conta: " + gc.getConta() + " - Saldo - "
							+ gc.getSaldo() + " - Nome - " + gc.getNome() + " - Email - " + gc.getEmail()
							+ " - Telefone - " + gc.getTelefone());
				}
				break;

			case 3:
				FileWriter arquivo = new FileWriter("C:\\Users\\flavi\\CadastroCorrentistas.txt");

				PrintWriter gravaArquivo = new PrintWriter(arquivo);

				gravaArquivo.printf("Registros dos funcionários" + "%n");

				for (Correntistas gc : guardacorrentistas) {
					gravaArquivo.printf("Agência: " + gc.getAgencia() + " - Conta: " + gc.getConta() + " - Saldo - "
							+ gc.getSaldo() + " - Nome - " + gc.getNome() + " - Email - " + gc.getEmail()
							+ " - Telefone - " + gc.getTelefone() + "%n");
				}

				arquivo.close();
				System.out.println("O arquivo está sendo gravado na unidade C:\\flavi\\CadastroFuncionarios.txt");

				break;

			case 4:

				if (arq.exists()) {
					mostra = "Arquivo - " + arq + ", aberto com sucesso";
					mostra = "Tamanho total do Arquivo - " + Long.toString(arq.length()) + "Bytes \n \n \n";

					try {
						FileReader reader = new FileReader(nomeArq);

						BufferedReader leitor = new BufferedReader(reader);
						while (true) {
							linha = leitor.readLine();
							System.out.println(linha);

							if (linha == null)
								break;
							mostra += linha + "\n";
						}
					}

					catch (Exception erro) {
					}
					// System.out.println("Conteudo existente");
					JOptionPane.showMessageDialog(null, mostra, "Registro de contas", 1);

				} else
					System.out.println("");
				JOptionPane.showMessageDialog(null, "Fechando janela. Obrigada!", "Saindo", 2);

				break;

			case 5:

				System.out.println("Saindo");
				break;

			default:
				System.out.println("Opção inválida. Seleciona uma opção no menu.");
			}

		}
	}
}
