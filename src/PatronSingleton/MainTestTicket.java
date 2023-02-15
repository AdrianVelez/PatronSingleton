package PatronSingleton;

public class MainTestTicket {

    public static void main(String[] args) {
        //Relacion muchos a uno, basicamente es el patron de diseño singleton.
        Usuarios user1=new Usuarios("Adrian", "velez");
        Usuarios user2=new Usuarios("Larry", "Hernandez");
        Usuarios user3=new Usuarios("carlos", "perez");
        Usuarios user4=new Usuarios("christian", "sayago");
        Usuarios user5=new Usuarios("Armando", "molina");
        Usuarios user6=new Usuarios("Arturo", "Diaz");

        //Una sola instancia de la clase con el patron aplicado
        Ticket t1 = Ticket.getInstance();

        System.out.println(t1.ticketUser(user1)+"\n");
        System.out.println(t1.ticketUser(user2)+"\n");
        System.out.println(t1.ticketUser(user3)+"\n");
        System.out.println(t1.ticketUser(user4)+"\n");
        System.out.println(t1.ticketUser(user5)+"\n");

        System.out.println(t1.ticketUser(user6)+"\n");







    }
}
