public class Parent extends Person {
    private Partner partner;
    public void setPartner(Partner partner) {
        if (partner.getAge() < 120) {
            this.partner = partner;
        } else {
            System.out.println("He/She is way to old");
        }
    }
}