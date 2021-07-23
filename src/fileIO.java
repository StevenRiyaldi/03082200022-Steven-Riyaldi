import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Nama : Steven Riyaldi
    NIM  : 03082200022
*/

class fileIO {
    private ArrayList<Integer> totalJumlahKamar = new ArrayList<Integer>();

    public fileIO() {
    }

    public void writejumlahKamar(ArrayList<Integer> totalKamar) {
        try {
            FileWriter fileWriter = new FileWriter("input.txt");
            BufferedWriter file = new BufferedWriter(fileWriter);
            for(int i = 0; i < totalKamar.size(); i++) {
                String a = totalKamar.get(i).toString();
                file.write(a + "-");
            }
            file.newLine();
            file.close();
        }catch(IOException io) {
            System.out.println("Error : ");
            io.printStackTrace();
        }
    }

    public void readJumlahKamar() throws FileNotFoundException {
        try {
            FileReader fileInput = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileInput);
            Scanner scanner = new Scanner(bufferedReader);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }catch(IOException io) {
            System.out.println("Error : ");
            io.printStackTrace();
        }
    }   

    public void toJumlahKamarObject() {
        try {
            FileReader file = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            Scanner scanner = new Scanner(bufferedReader);
            while(scanner.hasNext()) {
                String[] jmlhKmr = scanner.nextLine().split("-");
                for(int i = 0; i < jmlhKmr.length; i++) {
                    totalJumlahKamar.add(Integer.parseInt(jmlhKmr[i]));
                }
            }
        }catch(IOException io) {
            System.out.println("Error : ");
            io.printStackTrace();
        }
    }
}