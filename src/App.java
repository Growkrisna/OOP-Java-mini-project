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
        System.out.println("");
    }

    static void lihatCharacter() {
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).showCharacter();
        }
        System.out.println("");
    }
    
    static void updateCharacter() {
        lihatCharacter();
        System.out.println("Pilih nomor character yang ingin diubah: ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= characters.size()) {
            System.out.println("Masukan data yang ingin diubah:");
            System.out.println("1. Nama Character");
            System.out.println("2. HP Character");
            System.out.println("3. Attack Power Character");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan nama baru: ");
                    String newName = input.nextLine();
                    characters.get(index - 1).setName(newName);
                    break;
                case 2:
                    System.out.print("Masukan HP baru: ");
                    int newHealth = input.nextInt();
                    input.nextLine();
                    characters.get(index - 1).setHealth(newHealth);
                    break;
                case 3:
                    System.out.print("Masukan Attack Power baru: ");
                    int newAttackPower = input.nextInt();
                    input.nextLine();
                    characters.get(index - 1).setAttack(newAttackPower);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } else {
            System.out.println("Nomor character tidak valid!");
        }

        System.out.println("");
    }

    static void hapusCharacter() {
        lihatCharacter();
        System.out.print("Pilih nomor character yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();
        if (index > 0 && index <= characters.size()) {
            characters.remove(index - 1);
            System.out.println("Character berhasil dihapus!");
        } else {
            System.out.println("Nomor character tidak valid!");
        }

        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        int pilihan;

        lihatCharacter();

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
