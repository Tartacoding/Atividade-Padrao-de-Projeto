public class Email implements Canal{
    public void enviar(String texto){
        System.out.println("📱 Enviando por SMS:  " + texto);
    }
}
