import java.util.Date;

public class Klant {

    private String name;
    private String adres;
    private Date birthdate;
    private Boolean company;
    private Integer phonenumber;


    //constructor
    public Klant(String name, String adres, Date birthdate, Boolean company, Integer phonenumber){
        this.name = name;
        this.adres = adres;
        this.birthdate = birthdate;
        this.company = company;
        this.phonenumber = phonenumber;
    }

    //getters:
    public String getName(){
        return  name;
    }

    public String getAdres(){
        return adres;
    }

    public Date getBirthdate(){
        return birthdate;
    }

    public Boolean getCompany(){
        return company;
    }

    public Integer getPhonenumber(){
        return phonenumber;
    }


}
