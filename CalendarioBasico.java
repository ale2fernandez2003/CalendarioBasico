
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
        String Dia1 = dia +"";
        String Mes1 = mes+"";
        String Ano1 = ano+"";

        if(dia < 10){
            Dia1 = "0" + dia;
        }
        if(mes < 10){
            Mes1 = "0" + mes;
        }
        if(ano < 10){
            Ano1 = "0" + ano;
        }
        return Dia1 + "-" + Mes1 + "-" + Ano1;
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
}
