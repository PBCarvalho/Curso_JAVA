package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 20;
		d1.mes = 2;
		d1.ano = 1981;		
		
		var d2 = new Data();
		d2.dia = 2;
		d2.mes = 7;
		d2.ano = 2015;
		
		var d3 = new Data();
		d3.dia = 16;
		d3.mes = 8;
		d3.ano = 1993;
		
		System.out.println("O pai nascem em " + d1.obterDataFormatada());		
		System.out.println("O filho nasceu em " + d2.obterDataFormatada());
		System.out.println("A esposa nasceu em " + d3.obterDataFormatada());
	}
}
