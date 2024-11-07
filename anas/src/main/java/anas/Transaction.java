package anas;
import org.json.JSONObject;

public class Transaction {
    public enum Type {VIRIN, VIREST, VIRCHAC, VIRMULTA};
    private Type type;  
    private String timestmp;
    private String reference ;
    private Compte compte1 ;
    private Compte compte2 ;


    public Transaction (Type type ,String timestmp,String reference,Compte c1,Compte c2 ){
        this.type=type ;
        this.timestmp=timestmp ;
        this.reference=reference ;
        this.compte1=c1;
        this.compte2=c2;
    }

    public Type get_Type() {
        return type;
    }
    public void set_Type(Type type) {
        this.type = type;
    }

    public String get_Timestmp() {
        return timestmp;
    }
    public void set_Timestmp(String timestmp) {
        this.timestmp = timestmp;
    }

    public String get_Reference() {
        return reference;
    }
    public void set_Reference(String reference) {
        this.reference = reference;
    }

    public Compte get_Compte1() {
        return this.compte1;
    }
    public void seT_Compte1(Compte c1) {
        this.compte1 = c1;
    }

    public Compte get_Compte2() {
        return this.compte2;
    }
    public void seT_Compte2(Compte c2) {
        this.compte2 = c2;
    }

    public void transaction_json(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Type", this.type);
        jsonObject.put("Timestmp", this.timestmp);
        jsonObject.put("Reference", this.reference);
        jsonObject.put("Timestmp", this.timestmp);
        jsonObject.put("numcompte1", this.compte1.get_numcompte());
        jsonObject.put("numcompte2", this.compte2.get_numcompte());
        System.out.println("JSON : " + jsonObject.toString());
        }
    }
