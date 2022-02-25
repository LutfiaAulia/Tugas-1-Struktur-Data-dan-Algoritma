package project_01;

import java.util.*;

public class tugas {
    public static void main(String[] args) {
        String [] x = {"U","L","I","A"};
        //Soal no 1
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut:
        //1. isEmpty()
        System.out.println("1. Memeriksa apakah array kosong:");
        for (int i = 0; i < 4; i++){
            System.out.println("index "+i+" = "+x[i].isEmpty());
        }

        ArrayList<String> name = new ArrayList<String>(Arrays.asList(x));

        //2. size()
        System.out.println("\n2. Ukuran dari array x: "+name.size());
        
        //3. get(0), get(2), get(6), get(3)
        System.out.println("\n3. Mengambil nilai dari index yang dipilih ");
        System.out.println("Nilai dari index 0: "+name.get(0));
        System.out.println("Nilai dari index 2: "+name.get(2));
        System.out.println("Nilai dari index 3: "+name.get(3));
        try{
            System.out.println("Nilai dari index 6: "+name.get(6));
        }
        catch(Exception exception){
            System.out.println("Nilai dari index 6: tidak ditemukan");
        }
    
        //4. indexOf(a), indexOf(c), indexOf(q)
        if (name.indexOf("A")!= -1){
            System.out.println("\n3. Nilai A terdapat pada index: "+name.indexOf("A"));
        }
        if (name.indexOf("C")==-1){
            System.out.println("Nilai C terdapat pada index: Tidak ditemukan");
        }
        if(name.indexOf("Q")==-1){
            System.out.println("Nilai Q terdapat pada index: Tidak ditemukan");
        }
        
        //5. remove(0), remove(3), remove(2)
        System.out.println("\n5. Menghilangkan index dan nilainya pada array: ");
        name.remove(0);
        name.remove(2);
        try{
            name.remove(3);
        }
        catch(Exception exception){
            System.out.println("Index 3 tidak ditemukan");
        }
        System.out.println(name);
        
        //6. add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(3,j)
        System.out.println("\n6. Menambahkan nilai baru kedalam array: ");
        name.add(0,"E");
        name.add(2,"F");
        name.add(3,"G");
        name.add(4,"H");
        name.add(6,"H");
        name.add(3,"J");
        System.out.println(name);
        
    }
}