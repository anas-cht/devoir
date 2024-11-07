package anas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
public class Compte {
    private String numcompte;
    private Date dateCreat ;
    private Date dateUpdate ;
    private double device ;
    private Client client ;
    private List<Transaction> Transaction;

    public Compte (Client client ,String numcompte,double device){
        this.client=client;
        this.numcompte=numcompte ;
        this.dateCreat=new Date() ;
        this.dateUpdate=new Date() ;
        this.device=device ;
        this.Transaction = new ArrayList<>();
    }

    public String get_numcompte(){
        return this.numcompte ;
    }
    public void set_numcompte(String numcompte){
        this.numcompte=numcompte;
    }

    public Date get_datecreat(){
        return this.dateCreat ;
    }
    public void set_datecreat(Date datecreat){
        this.dateCreat=datecreat ;
    }

    public Date get_dateupdate(){
        return this.dateUpdate ;
    }
    public void set_dateupdate(Date dateupdate){
        this.dateUpdate=dateupdate ;
    }

    public double get_device(){
        return this.device ;
    }
    public void set_device(double device){
        this.device=device ;
    }

    public Client get_client(){
        return this.client ;
    }
    public void set_client(Client client){
        this.client=client ;
    }

    public List<Transaction> get_Transaction() {
        return this.Transaction;
    }
    public void seT_Comptes(List<Transaction> transaction) {
        this.Transaction = transaction;
    }

    public void afficher_transaction(){
        for (int i = 0; i < Transaction.size(); i++) {
            System.out.println((Transaction.get(i)).get_Reference());
        }
    }

    public void add_transaction (Transaction a){
        this.Transaction.add(a);
}

    public void compte_json(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("numcompte", this.numcompte);
        // jsonObject.put("date create", this.dateCreat);
        // jsonObject.put("date update", this.dateUpdate);
        jsonObject.put("device", this.device);
        jsonObject.put("client", this.client.get_numclient());
        JSONArray transactionArray = new JSONArray();
        for (Transaction transaction1 : this.Transaction) {
            JSONObject compteJson = new JSONObject();
            compteJson.put("transaction", transaction1.get_Reference());
            transactionArray.put(compteJson);
        }
        jsonObject.put("transactions", transactionArray);
        System.out.println("JSON : " + jsonObject.toString());
        }
}
