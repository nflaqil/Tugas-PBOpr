class teller {
    String namaTeller ;
    int nomorMeja ; 
    int idTeller ; 
    
    void setTeller(String newNamaTeller, int newNomorMeja, int newIdTeller ) {
        this.namaTeller = newNamaTeller; 
        this.nomorMeja = newNomorMeja ; 
        this.idTeller = newIdTeller; 
    }
    
    String getNamaTeller(){
        return namaTeller ; 
    } 
    int getNomorMeja(){
        return nomorMeja;
    }
    int getIdTeller(){
        return idTeller;
    }
}

class nasabah {
    String namaNasabah ; 
    int nomorRekening ;  
    int nomorAntrian ; 

    void setNasabah(String newNamaNasabah, int newNomorRekening, int newNomorAntrian){
        this.namaNasabah = newNamaNasabah ; 
        this.nomorRekening = newNomorRekening; 
        this.nomorAntrian = newNomorAntrian;
            
    }
    
    String getNamaNasabah() {
        return namaNasabah;
    }
    int getNomorRekening(){
        return nomorRekening;
    }
    int getNomorAntrian(){
        return nomorAntrian;
    }
}

public class Teller {
    public static void main(String[] args) {
        teller teller1 = new teller();
        teller1.setTeller("Cahya Adiguna", 1, 1056);
        
        
        nasabah nasabah1 = new nasabah();
        nasabah1.setNasabah("Thomas Sigulempong", 20213415, 1);
        
        System.out.println("Data Teller : ");
        System.out.println(teller1.getNamaTeller());
        System.out.println(teller1.getNomorMeja());
        System.out.println(teller1.getIdTeller()); 
        
        System.out.println("Data Nasabah :  ");
        System.out.println(nasabah1.getNamaNasabah());
        System.out.println(nasabah1.getNomorRekening());
        System.out.println(nasabah1.getNomorAntrian());
        
        System.out.println("Teller "+teller1.getNamaTeller() + " sedang melayani " +nasabah1.getNamaNasabah() + " pada meja " + teller1.getNomorMeja());
        
    }
  }
}