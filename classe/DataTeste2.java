package classe;

public class DataTeste2 {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		// d1.dia = 16;
		// d1.mes = 8;
		// d1.ano = 1993;		
		
		var d2 = new Data(2, 7, 2015);
		// d2.dia = 20;
		// d2.mes = 1;
		// d2.ano = 1980;
		
		System.out.println(d1.obterDataFormatada());		
		System.out.println(d2.obterDataFormatada());
	}
}
