package PatronSingleton;

public class Ticket {

    int id = 0;
    int total=5;
    int resto;

    private  static Ticket ticket;

    private Ticket(){
    }

    public static Ticket getInstance(){
        if (ticket==null){
            ticket=new Ticket();
        }
        return Ticket.ticket;
    }

    public Usuarios ticketUser( Usuarios usuer){
        id++;
        resto = total-id;
        if (resto<0){
            System.out.println("Los boletos se acabaron.");
            return usuer=null;
        }else {
            System.out.println("ticket a nombre de: " + usuer.getNombre() + " No. " + id);
        }
        return usuer;
    }

}
