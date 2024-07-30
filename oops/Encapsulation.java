package oops;

//it is data binding using method
public class Encapsulation {
    public static void main(String[] args) {
//        to print
        Trainers trainers = new Trainers();
//       data add using object and reference
        trainers.name = "anuj tripathi";
        trainers.email = "anuj@gmail.com";
        trainers.technology = "java";
        System.out.println(trainers.name + " " + trainers.email + " " + trainers.technology);
//        2data add using object and methodtr
        trainers.printprofile(trainers.name, "anuj", "anuj@gamil.com" + "java");
//        add teh data using gettet and seter
        trainers.setName("anuj");
        trainers.setEmail("anuj@gmail.com");
        trainers.setTechnology("java");
        System.out.println(trainers.getName()+trainers.getEmail()+trainers.getTechnology());


    }
}

class Trainers {
    String name;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    String technology;

    public void printprofile(String anuj, String email, String java) {
        System.out.println(anuj + email + java);
    }

}
