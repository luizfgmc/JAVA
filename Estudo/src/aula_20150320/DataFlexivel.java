package aula_20150320;
/* 
 * Nome....: Luiz Flávio Gomes Martins da Costa 
 * E-mail..: luizflavio@outlook.com.br
 * RA......: 31518781
 */
public class DataFlexivel{
	int dia;
	int mes;
	int ano;
	public DataFlexivel(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		AcertaMes(); // Acerta o mes
		AcertaDia(); // Acerta o dia
	}
	// Acerta os mes //
	private void AcertaMes(){
		int mesDigitado = this.mes;
		if (this.mes < 0){
			this.mes = 1;
			for (int i = 1; i > mesDigitado; i--){
				if (i != 0){
					if (this.mes == 1){
						this.mes = 12;
						this.ano--;
					}else{
						this.mes--;
					}
				}
			}
		}else{
			if (this.mes > 12){
				int anoIncompleto = (mes % 12);
				int anosCompeltos = ((mes - anoIncompleto)/12);
				if (anoIncompleto == 0){
					this.mes = 12;
					this.ano +=(anosCompeltos-1);
				}else{
					this.mes = anoIncompleto;
					this.ano += anosCompeltos;
				}
			}
		}
	}
	// Acerta os dias //
	private void AcertaDia(){
		int diasDigitados = this.dia;
		int numeroDiasMes = CalculaNumeroDiasMes(this.mes, this.ano);
		if (this.dia < 0){
			this.dia = 1;
			for (int i = 1; i > diasDigitados; i--){
				if (i != 0){
					if (this.dia == 1){
						if (this.mes == 1){
							this.mes = 12;
							this.ano--;
							if (this.ano == 0){
								this.ano--;
							}
						}else{
							this.mes--;	
						}
						this.dia = CalculaNumeroDiasMes(this.mes, this.ano);
					}else{
						this.dia--;
					}
				}
			}
		}else{
			this.dia = 1;
			for (int i =1; i < diasDigitados; i++ ){
				if (this.dia == numeroDiasMes){
					this.mes++;
					this.dia = 1;
					AcertaMes();
					numeroDiasMes =CalculaNumeroDiasMes(this.mes, this.ano);
				}else{
					this.dia++;
				}
			}
		}
	}
	// Para verificar quantos dias tem o mes de trabalho//	
	private int CalculaNumeroDiasMes(int mes, int ano){
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
	// Verifica se o ano é bissesto /
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
		String textoDataCompleta;
		String textoComplemento = this.ano > 0 ? "." : " a.C.";
		this.ano = Math.abs(this.ano);
		String [] textoMes = {"Janeiro", "Fevereiro" , "Março", "Abril", "Maio", "Junho", 
				"Julho", "Agosto", "Setembro", "Outubro","Novembro", "Dezembro"}; 
		textoDataCompleta = (this.dia + " de " + textoMes[this.mes -1] + " de " + this.ano + textoComplemento );
		return textoDataCompleta;
	}
}