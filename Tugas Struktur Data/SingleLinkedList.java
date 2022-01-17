package adt_list_baru;
//deklarassi kelas mahasiswa
class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;
    
    //deklarasi konstruktor
    public Mahasiswa (String nim, String nama, double ipk){
        
        this.nama = nama;
        this.ipk = ipk;
        this.nim = nim;
    } 
    //deklarasi method
    //ambil nilai ipk
    public double getIpk (){
        return this.ipk;
    }
    
    //ambil nilai nim
    public String getNim(){
        return this.nim;
    }
    
    //ambil nilai nama
    public String getNama(){
        return this.nama;
    }
    
    //cetak di format dalam bentuk string
    public String toString (){
        return String.format("%s\t| %.6s\t| %s\t|\n", nim, nama, ipk);
    }
}

class Node {
    Object data;
    double ipk;
    Node  next;
}
public class SingleLinkedList{
    private Node pointer;    
    // contructor LL
    public SingleLinkedList() {
        pointer = null;
    }
    
    //deklarasi method
    // membuat suatu node baru
    public void buatNode(Mahasiswa dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.ipk = dt.getIpk();
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }
    
    public boolean sisip(Mahasiswa dt1, Mahasiswa dt2) {
        Node n = pointer; //n digunakan utk mencari posisi dt2
        while ((n != null) && (n.data != dt2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node nn = new Node();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }
    
    public Object hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }
    
    public void sisipDataDiAkhir(Mahasiswa data) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }
    
    public void hapusData(Mahasiswa dataHapus) {
        Node n = pointer;
        while ((n != null) && (n.next.data != dataHapus)) {
            n = n.next;
        }
        n.next = n.next.next;
    }
    public Node getPointer() {
        return pointer;
    } 
    
    //untuk mengurutkan
    public void sort(){
        Node i = pointer;
        while(i != null){
            Node j = i.next;
            while(j != null){
                if( i.ipk < j.ipk){
                    Object tmp = i.data;
                    i.data = j.data;
                    j.data = tmp;
                    double tem = i.ipk;
                    i.ipk = j.ipk;
                    j.ipk = tem;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
              
    // cetak data
    public void cetak(String kom) {
        System.out.println("=================================");
        System.out.println(kom);
        System.out.println("=================================");
        Node n = pointer;
        while (n!= null) {
            System.out.print(n.data+"");
            n = n.next;
        }
        System.out.println("=================================\n");
    }      
}
