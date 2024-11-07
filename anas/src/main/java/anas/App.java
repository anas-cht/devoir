package anas;

import anas.Transaction.Type;

public class App 
{
    public static void main( String[] args )
    {
        Client clt1= new Client("cle101","chattat","anas","marrakech mhamid","0699999999","anas@gmail.com");
        Client clt2= new Client("cle102","ahmed","ahmed","marrakech mhamid","0699999889","ahmed@gmail.com");
        Compte cmp1=new Compte(clt1,"cmp101",1000.0);
        Compte cmp2=new Compte(clt1,"cmp102",2500.0);
        clt1.add_compte(cmp1);
        clt2.add_compte(cmp2);
        Transaction t1=new Transaction(Type.VIRIN,"11-12-2024","ref101",cmp1,cmp2);
        cmp1.add_transaction(t1);
        cmp2.add_transaction(t1);
        clt1.afficher_comptes();
        System.out.println(cmp1.get_client().get_numclient());
        cmp1.compte_json();
        t1.transaction_json();

    }
}
