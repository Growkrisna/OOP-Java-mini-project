import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Character> characters = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void tambahCharacter() {
        System.out.print("Nama : ");
        String name = input.nextLine();
        System.out.print("HP : ");
        int health = input.nextInt();
        System.out.print("Attack Power : ");
        int attackPower = input.nextInt();
        input.nextLine();

        Character newCharacter = new Character(name, health, attackPower);
        characters.add(newCharacter);
        System.out.println("Character berhasil ditambahkan!");
    }

    static void lihatCharacter() {

    }
    
    static void updateCharacter() {

    }

    static void hapusCharacter() {

    }

    public static void main(String[] args) throws Exception {
        int pilihan;

        do {
            System.out.println("=== MENU CHARACTER ===");
            System.out.println("1. Tambah Character");
            System.out.println("2. Lihat Character");
            System.out.println("3. Update Character");
            System.out.println("4. Hapus Character");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahCharacter();
                    break;
                case 2:
                    lihatCharacter();
                    break;
                case 3:
                    updateCharacter();
                    break;
                case 4:
                    hapusCharacter();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
    }
    
}
