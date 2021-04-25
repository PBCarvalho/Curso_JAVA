package classe;

public class Data {
	
	//Desafio 01 - DataTeste1
	int dia;
	int mes;
	int ano;
	
	//Desafio 02 - DataTeste2
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	//Desafio 03 - DataTeste2
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
}
