/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebook;

/**
 *
 * @author Tsuki-no-Ame
 */
import java.util.Scanner;

public class PhoneBookList {
    static PhoneBook pb = new PhoneBook();
    static Scanner sc = new Scanner(System.in);
    static String name, phone;
    
    static void Menu() {
    System.out.println("Menu");
    System.out.println("-----");
    System.out.println("1. Insert entry");
    System.out.println("2. Remove entry");
    System.out.println("3. Delete entry");
    System.out.println("4. Look up entry");
    System.out.println("5. Exit");
  }
    
  public static void main(String[] args) {
    Menu();
    while (true) {
      System.out.print("choose option: ");
      switch (sc.nextInt()) {
        case 1:
          insert();
          break;
        case 2:
          remove();
        case 3:
          update();
          break;
        case 4:
          lookUp();
          break;
        case 5:
          return;
      }
    }
  }
    private static void insert() {
    sc.nextLine();
    System.out.print("Input name: ");
    name = sc.nextLine();
    System.out.print("Input phone: ");
    phone = sc.nextLine();
    pb.insert(name, phone);
  }
    private static void remove() {
    sc.nextLine();
    System.out.print("Input entry name to remove: ");
    name = sc.nextLine();
    pb.remove(name);
  }
    private static void update() {
    boolean founded = false;
    sc.nextLine();
    System.out.print("Input entry name to update: ");
    name = sc.nextLine();
    for (String s : pb.PhoneList) {
      if (name.equals(s.substring(0, s.indexOf(",")))) {
        founded = true;
        System.out.print("Input entry number you want to update: ");
        phone = sc.nextLine();
        pb.delete(name, phone);
        break;
      }
    }
    if (!founded) System.out.println("Not found entry with name: " + name);
  }
    
    private static void lookUp() {
    sc.nextLine();
    System.out.print("Please enter entry name to search phone: ");
    name = sc.nextLine();
    pb.lookUp(name);
  }
}
