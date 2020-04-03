package pl.zawierucha.project2;

import java.util.ArrayList;
import java.util.List;

public class ListaKlientow {
    private ArrayList<Klientbase> klientbase;
    public ListaKlientow(){
        klientbase = new ArrayList<Klientbase>();
    }
    public void dodajKlienta(Klient klient) {
        klientbase.add(klient);
    }




    public String toString(){
        String total = "\n";
        for (int i=0; i<klientbase.size(); i++){
            Klientbase k = klientbase.get(i);
            total = total + k.toString();
        }
        return total;
    }
}
