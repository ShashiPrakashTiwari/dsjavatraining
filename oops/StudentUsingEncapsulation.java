package oops;

public class StudentUsingEncapsulation {
    public static void main(String[] args) {
        stusdent s=new stusdent();
        s.setName("arvind");
        s.setEmail("arvind@gmail.com");
        s.setTechnology("java");
        s.setMobile("6387793487");
        System.out.println(s.getName()+s.getEmail()+s.getTechnology()+s.getMobile());

    }
}
class stusdent{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String email;
    String technology;
    String mobile;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return String.valueOf(mobile);
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
