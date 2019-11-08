package sample;

public class Client {

    private int clientID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String homeAddress;
    private String city;
    private String zipCode;

    private double accountBalance;

    //Constructors ************************************************************************
    Client(){
        setClientID(0);
        setFirstName("");
        setLastName("");
        setEmail("");
        setPhoneNumber("0");
        setHomeAddress("");
        setCity("");
        setZipCode("");

    }

    Client(int id, String fName, String lName, String email, String phoneNum, String address, String city, String zip){
        setClientID(id);
        setFirstName(fName);
        setLastName(lName);
        setEmail(email);
        setPhoneNumber(phoneNum);
        setHomeAddress(address);
        setCity(city);
        setZipCode(zip);
    }

    //getters ************************************************************************
    public void setClientID (int id){
        this.clientID = id;
    }

    public void setFirstName (String name){
        this.firstName = name;
    }

    public void setLastName (String name){
        this.lastName = name;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public void setPhoneNumber (String number){
        this.phoneNumber = number;
    }

    public void setHomeAddress (String address){
        this.homeAddress = address;
    }

    public void setCity (String city){
        this.city = city;
    }

    public void setZipCode(String zip){
        this.zipCode = zip;
    }


    //getters ************************************************************************
    public int getClientID (){
        return clientID;
    }

    public String getFirstName (){
        return firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public String getEmail (){
        return email;
    }

    public String getPhoneNumber (){
        return phoneNumber;
    }

    public String getHomeAddress (){
        return homeAddress;
    }

    public String getCity(){
        return city;
    }

    public String getZipCode(){
        return zipCode;
    }



    //getter and setter for accountBalance ************************************************************************
    public void setAccountBalance (double balance){
        this.accountBalance = balance;
    }

    public double getAccountBalance(){
        return accountBalance;
    }
}
