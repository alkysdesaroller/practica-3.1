package convertidorgrados;

public class TestConvertirdorGrados {
    public static void main(String[] args) {
        ConvertidorGrados cg = new ConvertidorGrados();//Instanciamos un objeto que no servira de prueba
        int farenheit = cg.convertidorCelciusAFarenheit(30);//Damos un valor a este objeto
        System.out.println("Grados Farenheit  = " + farenheit );//insertamos la salida
    }
}
