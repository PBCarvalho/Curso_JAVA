package classe;

public class DataTeste1 {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 16;
		d1.mes = 8;
		d1.ano = 1993;
		
		var d2 = new Data();
		d2.dia = 20;
		d2.mes = 1;
		d2.ano = 1980;
		
		System.out.printf("%d/%d/%d.\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d.", d2.dia, d2.mes, d2.ano);
	}
}
