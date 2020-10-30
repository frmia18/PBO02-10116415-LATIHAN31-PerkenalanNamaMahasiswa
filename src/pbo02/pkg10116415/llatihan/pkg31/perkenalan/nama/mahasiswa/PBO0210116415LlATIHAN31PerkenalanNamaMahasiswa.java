/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415.llatihan.pkg31.perkenalan.nama.mahasiswa;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Perkenalan nama mahasiswa
 */
public class PBO0210116415LlATIHAN31PerkenalanNamaMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama="Rizki Adam Kurniawan"+"\n";
        mahasiswa1.PerkenalanDiri(mahasiswa1.nim, mahasiswa1.nama);
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama="Indra Tiola"+"\n";
        mahasiswa2.PerkenalanDiri(mahasiswa2.nim, mahasiswa2.nama);
        
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama= "Robi Tanzil Ganefi"+ "\n";
        mahasiswa3.PerkenalanDiri(mahasiswa3.nim, mahasiswa3.nama);
        
        mahasiswa mahasiswa4 = new mahasiswa();
        mahasiswa4.nim = "10110272";
        mahasiswa4.nama="muhammad Nur Awaludin"+"\n";
        mahasiswa4.PerkenalanDiri(mahasiswa4.nim, mahasiswa4.nama);
    }
    
}
