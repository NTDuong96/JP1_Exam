/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Tsuki-no-Ame
 */
public class PhoneBook extends PhoneEntry {

  ArrayList<String> PhoneList = new ArrayList();

  //1. Insert entry
  @Override
  void insert(String name, String phone) {
    boolean searched = false;
    for (String s : PhoneList) {
      if (s.contains(name)) {
        searched = true;
        if (!s.contains(phone)) {
          s += " : " + phone;
        } else {
          System.out.println("Entry exists");
        }
      }
    }
    if (!searched) {
      PhoneList.add(name + "," + phone);
    }
  }
  
  //2. Remove entry
  @Override
  void remove(String name) {
    boolean searched = false;
    for (String s : PhoneList) {
      if (name.equals(s.substring(0, s.indexOf(",")))) {
        searched = true;
        PhoneList.remove(s);
        System.out.println("Removed");
        break;
      }
    }
    if (!searched) System.out.println("Not found entry with name: " + name);
  }

  //3. Look up entry
  @Override
  void lookUp(String name) {
    boolean searched = false;
    for (String s : PhoneList) {
      if (s.contains(name)) {
        searched = true;
        System.out.println(s.toString());
        break;
      }
    }
    if (!searched) System.out.println("Not found entry name");
  }
  
  //4. Delete entry
  @Override
  void delete(String name, String newPhone) {
    String s = name;
    //remove old number (keep entry name)
    s = s.substring(0, s.indexOf(","));
    //add new phone to existed entry
    PhoneList.set(PhoneList.indexOf(s), s + "," + newPhone);
    System.out.println("Updated");
  }

}