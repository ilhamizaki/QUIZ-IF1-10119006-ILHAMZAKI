/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.latihan;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class ServicePrice
 */
public class ServicePrice implements ServiceItem{

    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int serviceItem) {
        return serviceItem;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        boolean member = false;
        if("yes".equals(statusMember)) {
            return member = true;
        }
        return member;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember) {
            return (float) (parServicePrice * 0.1);
        } 
        return parServicePrice = 0;
    }

    public float getTotalPlay(float priceService, float discount) {
        return priceService - discount;
    }
}
