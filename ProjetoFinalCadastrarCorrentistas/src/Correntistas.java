import java.util.ArrayList;

public class Correntistas {


	//Declara��o das vari�veis privadas
		private int agencia;
		private int conta;
		private float saldo;
		private String nome;
		private String email;
		private String telefone;
		
		
		//Cria��o do m�todo para leitura de vari�veis
		public Correntistas () {
			this.agencia=agencia;
			this.conta=conta;
			this.saldo=saldo;
			this.nome=nome;
			this.email=email;
			this.telefone=telefone;
			
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getConta() {
			return conta;
		}

		public void setConta(int conta) {
			this.conta = conta;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
			
		}

		

