package anas;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
public class Client {
    private String numclient;
    private String nom ;
    private String prenom ;
    private String adresse ;
    private String phone ;
    private String email ;
    private List<Compte> comptes ;

    public Client(String num,String name,String prename,String adress,String phon,String email){
        this.numclient=num;
        this.nom=name;
        this.prenom=prename;
        this.adresse=adress;
        this.phone=phon;
        this.email=email;
        this.comptes = new ArrayList<>();
    }

    public String get_numclient(){
        return this.numclient ;
    }
    public void set_numclient(String numclient){
        this.numclient=numclient;
    }

    public String get_nom(){
        return this.nom ;
    }
    public void set_nom(String nom){
        this.nom=nom;
    }

    public String get_prenom(){
        return this.prenom ;
    }
    public void set_prenom(String prenom){
        this.prenom=prenom;
    }

    public String get_adresse(){
        return this.adresse ;
    }
    public void set_adresse(String adresse){
        this.adresse=adresse;
    }

    public String get_phone(){
        return this.phone ;
    }
    public void set_phone(String phone){
        this.phone=phone;
    }

    public String get_email(){
        return this.email ;
    }
    public void set_email(String email){
        this.email=email;
    }

    public List<Compte> get_TComptes() {
        return this.comptes;
    }
    public void seT_Comptes(List<Compte> t_comptes) {
        this.comptes = t_comptes;
    }

    public void afficher_comptes(){
        for (int i = 0; i < comptes.size(); i++) {
            System.out.println((comptes.get(i)).get_numcompte());
        }
    }

    public void add_compte (Compte a){
        comptes.add(a);
    }

    public void client_json(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("numclient", this.numclient);
        jsonObject.put("nom", this.nom);
        jsonObject.put("prenom", this.prenom);
        jsonObject.put("adresse", this.adresse);
        jsonObject.put("phone", this.phone);
        jsonObject.put("email", this.email);
        JSONArray compteArray = new JSONArray();
        for (Compte compte : this.comptes) {
            JSONObject compteJson = new JSONObject();
            compteJson.put("numcompte", compte.get_numcompte());
            compteArray.put(compteJson);
        }
        jsonObject.put("comptes", compteArray);
        System.out.println("JSON : " + jsonObject.toString());
        }
}
