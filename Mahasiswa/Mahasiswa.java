
package Mahasiswa;

/**
 *
 * @author hp
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String email;
    
    public static void main (String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "2131740028";
        mhs.nama = "Moh.Farkhandika S.P";
        mhs.email = "sycophantam21@gmail.com";
        System.out.println(mhs.biodata());
    }
    
    public String biodata() {
        String bio;
        bio = "Nim Mahasiswa   :"+this.nim+"\n"+
              "Nama Mahasiswa  :"+this.nama+"\n"+
              "Email Mahasiswa :"+this.email+"";
        return bio;
    }
}
