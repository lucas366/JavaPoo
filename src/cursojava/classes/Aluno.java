package cursojava.classes;

public class Aluno {

	/*Esses são os atributos do Aluno*/
   private	String nome;
   private int idade;
   private String dataNasccimento;
   private String registroGeral;
   private String numerocpf;
   private String nomeMae;
   private String nomePai;
   private String dataMatricula;
   private String nomeEscola;
   private String serieMatriculado;
	

	public  Aluno()  {/*Cria os dados na memoria - Sendo padrão do java*/
		
	}
	
	public  Aluno (String nomePadrão)  {
		nome = nomePadrão;
		
	}
	/*Veremos o metodos SETTERS e GETTERS do Objetos*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para Resgatar ou obter o valor do atributos*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNasccimento() {
		return dataNasccimento;
	}

	public void setDataNasccimento(String dataNasccimento) {
		this.dataNasccimento = dataNasccimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumerocpf() {
		return numerocpf;
	}

	public void setNumerocpf(String numerocpf) {
		this.numerocpf = numerocpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	
	
}
