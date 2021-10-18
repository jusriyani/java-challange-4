public class JavaMethod{
    
    //this is method
    public static void main(String[] args){
        // myMethod(); //cara memanggil method di class tsb.
        // delete(17);
        // delete(20);
        // delete(50);
        // delete(117);
        // delete(300);
        // human("Jusri", 20);
        // human("Yani", 20);
       // status(); //saat method ini dipanggil tidak kelihatan hasilnya, tetapi jika ada UI nya akan kelihatan
        System.out.println(status());
        System.out.println(validateNumber(40));
    }

    static void myMethod(){
        System.out.println("Method exceute!");
    }

    static void delete(int angka){
        System.out.println("Berhasil menghapus mahasiswa nomor " + angka);
    }

    static void human(String nama, int umur){
        System.out.println("Nama: " + nama + ", umur: " + umur);
    }

    static String status(){
        return "Hello World";
    }

    static boolean validateNumber(int angka){
        if(angka > 20){
            return true;
        }else{
            return false;
        }
    }
}


/*Note
void tidak me-return nilai, tetapi hanya memproses
untuk penggunaan nama method, jangan pernah menambahkan angka,
seperti myMethod1, myMethod2.
*/