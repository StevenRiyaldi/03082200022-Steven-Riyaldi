import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
    Nama : Steven Riyaldi
    NIM  : 03082200022
*/

class alokasiKamar {
    private static ArrayList<Integer> totalKamar = new ArrayList<Integer>();
    private Tamu tamu;
    private fileIO fIo;

    public alokasiKamar() {
    }

    public fileIO getFIo() {
        return this.fIo;
    }

    public void setFIo(fileIO fIo) {
        this.fIo = fIo;
    }

    public void AddTotalKamar(ArrayList<Integer> totalKamar) {
        totalKamar.add(50);
        totalKamar.add(50);
        totalKamar.add(50);
        totalKamar.add(50);
        totalKamar.add(50);
    }

    public static ArrayList<Integer> getTotalKamar() {
        return totalKamar;
    }

    public void setTotalKamar(ArrayList<Integer> totalKamar) {
        alokasiKamar.totalKamar = totalKamar;
    }

    public Tamu getTamu() {
        return this.tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }


    public void penguranganKamar() {
        int total;
        total = totalKamar.get(tamu.getJenisKamar()-1);
        total -= tamu.getJumlahKamar();
        totalKamar.set(tamu.getJenisKamar()-1, total);
        sorting();
    }

    public void sorting(){
        for (int i = 0; i < getTotalKamar().size(); i++){
            for(int j = 0; j < getTotalKamar().size()-1; j++)  {
                int temp = getTotalKamar().get(j);
                if(temp > getTotalKamar().get(j+1)) {
                    totalKamar.set(j, totalKamar.get(j+1));
                    totalKamar.set(j+1, temp);
                }
            }
        }
        System.out.println(totalKamar);
    }

    public void writeRead() throws FileNotFoundException{
        fIo.writejumlahKamar(totalKamar);
        fIo.readJumlahKamar();
        fIo.toJumlahKamarObject();
    }
}