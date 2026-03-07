import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Character> characters = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int nextid = 1;

    static void tambahCharacter() {
        System.out.print("Nama : ");
        String name = input.nextLine();
        System.out.print("HP : ");
        int health = input.nextInt();
        System.out.print("Attack Power : ");
        int attackPower = input.nextInt();
        input.nextLine();

        Character newCharacter = new Character(nextid++, name, health, attackPower);
        characters.add(newCharacter);
        System.out.println("Character berhasil ditambahkan!");
        System.out.println("");
    }

    static void lihatCharacter() {
        if(characters.isEmpty()){
            System.out.println("Belum ada character yang ditambahkan!");
        } else {
            for(Character c : characters){
                c.showCharacter();
            }

        }
    }
    
    static void updateCharacter() {
        lihatCharacter();
        System.out.println("Pilih id character yang ingin diubah: ");
        int id = input.nextInt();
        input.nextLine();

        Character c = cariCharacterById(id);
        if (c != null) {
            System.out.println("Masukan data yang ingin diubah:");
            System.out.println("1. Nama Character");
            System.out.println("2. HP Character");
            System.out.println("3. Attack Power Character");

            int pilihan_2 = input.nextInt();
            input.nextLine();

            switch (pilihan_2) {
                case 1:
                    System.out.print("Masukan nama baru: ");
                    String newName = input.nextLine();
                    c.setName(newName);
                    break;
                case 2:
                    System.out.print("Masukan HP baru: ");
                    int newHealth = input.nextInt();
                    input.nextLine();
                    c.setHealth(newHealth);
                    break;
                case 3:
                    System.out.print("Masukan Attack Power baru: ");
                    int newAttackPower = input.nextInt();
                    input.nextLine();
                    c.setAttack(newAttackPower);
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
        System.out.print("Pilih id character yang ingin dihapus: ");
        int id = input.nextInt();
        input.nextLine();

        Character c = cariCharacterById(id);
        if (c != null) {
            characters.remove(c);
            System.out.println("Character berhasil dihapus!");
        } else {
            System.out.println("Id character tidak valid!");
        }

        System.out.println("");
    }

    static Character cariCharacterById(int id){

    for(Character c : characters){
        if(c.getId() == id){
            return c;
        }
    }

    return null;
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
