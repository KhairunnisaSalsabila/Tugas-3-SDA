package tugas3;
import java.util.LinkedList;
public class datamahasiswa {
    public static void main(String[] args) {
       
        //Buatlah sebuah LinkedList yang mana pada LinkedList 
        //tersebut dapat menambah data berupa No_Bp, Nama_Mahasiswa, Alamat.

        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> nobp = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        //Tambahkan beberapa fungsi/operasi pada LinkedList yang anda ketahui

        //add(), addFirst(), dan addLast()

        nama.add("Nisa");
        nama.add("Alifia");
        nama.addFirst("Farhan");
        nama.addLast("Fira");

        nobp.add("2031");
        nobp.add("2022");
        nobp.addFirst("2101");
        nobp.addLast("2705");

        alamat.add("Jambi");
        alamat.add("Semarang");
        alamat.addFirst("Padang");
        alamat.addLast("Jakarta");

        System.out.println("\nMenambahkan Data Mahasiswa");
        System.out.println("-------------------------");
        System.out.println("Nama Mahasiswa \t :" +nama);
        System.out.println("Nomor BP \t :" +nobp);
        System.out.println("Alamat \t\t :" +alamat);
        
        //set() 

        nama.set(0, "Aulia");
        nama.set(2, "Alvin");
       
        nobp.set(0, "3024");
        nobp.set(2, "2115");
        
        alamat.set(0,"Bandung");
        alamat.set(2,"Yogyakarta");

        System.out.println("\nMenyisipkan Data Mahasiswa");
        System.out.println("--------------------------");
        System.out.println("Nama Mahasiswa \t :" +nama);
        System.out.println("Nomor BP \t :" +nobp);
        System.out.println("Alamat \t\t :" +alamat);
        
        //remove()

        nama.remove(3);
        nobp.remove(3);
        alamat.remove(3);
 
        System.out.println("\nMenghapus Data Mahasiswa");
        System.out.println("------------------------");
        System.out.println("Nama Mahasiswa \t :" +nama);
        System.out.println("Nomor BP \t :" +nobp);
        System.out.println("Alamat \t\t :" +alamat);

        //pop()

        nama.pop();
        nobp.pop();
        alamat.pop();

        System.out.println("\nData mahasiswa setelah fungsi POP");
        System.out.println("---------------------------------");
        System.out.println("Nama Mahasiswa \t :" +nama);
        System.out.println("Nomor BP \t :" +nobp);
        System.out.println("Alamat \t\t :" +alamat);

        //push()

        nama.push("Yaya");
        nobp.push("2101");
        alamat.push("Solo");
        System.out.println("\nData mahasiswa setelah fungsi PUSH");
        System.out.println("----------------------------------");
        System.out.println("Nama Mahasiswa \t :" +nama);
        System.out.println("Nomor BP \t :" +nobp);
        System.out.println("Alamat \t\t :" +alamat);

        //get()

        System.out.println("\nFungsi Get"); 
        System.out.println("----------");
        System.out.println("Get Nama Mahasiswa \t :" +nama.get(1));
        System.out.println("Get Nomor BP \t\t :" +nobp.get(1));
        System.out.println("Get Alamat \t\t :" +alamat.get(1));

        //indexOf()

        System.out.println("\nIndex Of"); 
        System.out.println("--------");
        System.out.println("IndexOf pada Nama Mahasiswa (Fira) \t :" +nama.indexOf("Fira"));
        System.out.println("IndexOf pada Nomor BP (2101) \t\t :" +nobp.indexOf("2101"));
        System.out.println("IndexOf pada Alamat (Batam) \t\t :" +alamat.indexOf("Batam"));

        //isEmpty()

        //nama mahasiswa
        System.out.println("\nPengecekan Data");
        System.out.println("---------------");
        System.out.println("Apakah data nama mahasiswa kosong? \t : "+nama.isEmpty());
        //nomor bp
        System.out.println("Apakah data nomor BP kosong? \t\t : "+nobp.isEmpty());
        //alamat
        alamat.clear();
        System.out.println("Apakah data alamat kosong? \t\t : "+alamat.isEmpty());    

    }
}
