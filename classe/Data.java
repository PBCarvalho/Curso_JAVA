package classe;

public class Data {
	
	//Desafio 01 - DataTeste1
	int dia;
	int mes;
	int ano;
	
	//Desafio 02 - DataTeste2
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
