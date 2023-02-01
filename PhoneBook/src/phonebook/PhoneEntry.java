/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebook;

/**
 *
 * @author Tsuki-no-Ame
 */
public abstract class PhoneEntry {
    abstract void insert(String Name, String Phone);
    abstract void remove(String Name);
    abstract void lookUp(String Name);
    abstract void delete(String Name, String newPhone);
}
