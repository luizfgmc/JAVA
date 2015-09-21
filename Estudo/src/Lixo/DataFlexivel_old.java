package Lixo;

public class DataFlexivel_old {

	public DataFlexivel_old(int dia, int mes, int ano){
		int[] mesAno = CalculaMes(mes, ano);
		int[] diaMesAno = CalculaDia(dia, mesAno[0], mesAno[1]);
		int mesCorrigido = diaMesAno[1];
		int anoCorrigido = diaMesAno[2];
		int diaCorrigido = diaMesAno[0];

		System.out.println( diaCorrigido + " " + mesCorrigido +" "+ anoCorrigido);
	}

	private int[] CalculaMes(int mes, int ano){
		int anoIncompleto = (mes % 12);
		int anosCompeltos = ((mes - anoIncompleto)/12);
		int diaARetroagir = 0;

		if (mes < 0){
			mes = (mes * -1);
			int calcmes = CalculaDiasDoMes(mes,ano);
			for (int i = 1; i <= mes;i++){
				diaARetroagir = CalculaDiasDoMes(mes,ano);
				diaARetroagir = diaARetroagir + diaARetroagir;
			}
			int y =1;
			while (y <= diaARetroagir){
				if (calcmes < y){
					mes--;
					diaARetroagir = diaARetroagir - (y-1);
					calcmes = CalculaDiasDoMes(mes,ano);
					y = 0;
					if (mes > 12){
						ano--;
					}

				}
				y++;
			}
			
		}else{
			if ( mes > 12); {
				ano = (ano +  anosCompeltos);
				mes = (anoIncompleto);
			}
		}
		int[] mesAno = new int[] {mes,ano,diaARetroagir};
		return mesAno;
	}

	private int[] CalculaDia(int dia,int mes, int ano){
		int numerosDeDia = CalculaDiasDoMes(mes, ano);
		if (dia < 0){
			mes++;
			dia = CalculaDiasDoMes(mes, ano);
		}
		for (int i = 1; i <= numerosDeDia; i++){
			if (dia > i){
				mes++;
				if (mes > 12){
					mes = 1;
					ano++;
				}
				dia = (dia - numerosDeDia);
				numerosDeDia = CalculaDiasDoMes(mes, ano);
			}
		}
		int[] diaMesAno = new int [] {dia,mes,ano};
		return diaMesAno;
	}

	private int CalculaDiasDoMes(int mes, int ano){
		int numeroDiasMes =0;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			numeroDiasMes = 31;
		}else{
			numeroDiasMes = 30;
		}
		if (AnoBissesto(ano) == true && mes == 2){
			numeroDiasMes = 29;
		}
		if (AnoBissesto(ano) == false && mes == 2){
			numeroDiasMes = 28;
		}
		return numeroDiasMes;
	}

	private boolean AnoBissesto(int ano){
		boolean anoBissesto;
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0)) {
			anoBissesto = true;
		}else{
			anoBissesto = false;
		}
		return anoBissesto;
	}

	public String obterTextoDataCompleta(){
		String textoDataCompleta= "";

		return textoDataCompleta;
	}
}