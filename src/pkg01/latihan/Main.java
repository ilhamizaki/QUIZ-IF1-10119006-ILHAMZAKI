/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.latihan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : Main class quiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("=====Program Kasir Rock n Roll Haircut=====");
        System.out.print("Customer Name : ");
        String name = scanner.nextLine();
        customer.setName(name);
        
        System.out.print("Customer Email : ");
        String email = scanner.next();
        customer.setEmail(email);
        
        ServicePrice service = new ServicePrice();
        service.displayService();
        int pilih = scanner.nextInt();
        service.getPrice(pilih);
        
        String cekMember;       
        switch (pilih) {
            case 1 :
                System.out.print("Are you Member (yes/no) : ");
                cekMember = scanner.next();
                service.setPriceService(45000);
                float harga1 = service.getPriceService();
                float diskon1 = service.getSale(service.checkMemberStatus(cekMember), service.getPriceService());
                System.out.println("");
                System.out.println("**************************");
                System.out.println("*****CUSTOMER INVOICE*****");
                System.out.println("Date Transaction : " + customer.currentTime());
                System.out.println("Service Price : " + harga1);
                System.out.println("Discount : " + diskon1);
                System.out.println("Total Pay : " + service.getTotalPlay(harga1, diskon1));
                break;
            case 2 :
                System.out.print("Are you Member (yes/no) : ");
                cekMember = scanner.next();
                service.setPriceService(55000);
                float harga2 = service.getPriceService();
                float diskon2 = service.getSale(service.checkMemberStatus(cekMember), service.getPriceService());
                System.out.println("");
                System.out.println("**************************");
                System.out.println("*****CUSTOMER INVOICE*****");
                System.out.println("Date Transaction : " + customer.currentTime());
                System.out.println("Service Price : " + harga2);
                System.out.println("Discount : " + diskon2);
                System.out.println("Total Pay : " + service.getTotalPlay(harga2, diskon2));
                break;
            case 3 :
                System.out.print("Are you Member (yes/no) : ");
                cekMember = scanner.next();
                service.setPriceService(15000);
                float harga3 = service.getPriceService();
                float diskon3 = service.getSale(service.checkMemberStatus(cekMember), service.getPriceService());
                System.out.println("");
                System.out.println("**************************");
                System.out.println("*****CUSTOMER INVOICE*****");
                System.out.println("Date Transaction : " + customer.currentTime());
                System.out.println("Service Price : " + harga3);
                System.out.println("Discount : " + diskon3);
                System.out.println("Total Pay : " + service.getTotalPlay(harga3, diskon3));
                break;
            default :
                System.out.println("Nomor Salah");
                    break;
        }
    }
    
}
