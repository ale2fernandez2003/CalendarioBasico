
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    public String obtenerFecha(){
        String dia1 = dia +"";
        String mes1 = mes+"";
        String ano1 = ano+"";

        if(dia < 10){
            dia1 = "0" + dia;
        }
        if(mes < 10){
            mes1 = "0" + mes;
        }
        if(ano < 10){
            ano1 = "0" + ano;
        }
        return dia1 + "-" + mes1 + "-" + ano1;
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    public void avanzerFecha(){
        dia += 1;
        if (dia>30){
            mes += 1;
            dia=1;
            if(mes> 12){
                ano += 1;
                mes=1;
                if(ano>99){
                    ano=1;
                }
            }
        }
    }
}
