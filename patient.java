/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author Daisy
 */
public class patient {
    private String firstName;
    private String  lastName;
    private int Age;
    private String address;
    patient (String fName,String lName,int num, String adrs)
    {
        this.firstName= fName;
        this.lastName= lName;
        this.Age= num;
        this.address= adrs;
    }

    public String getFullname()
    {return this.firstName + this.lastName;}

    public int getAge()
    {return this.Age;}

    public String getAddress()
    {return this.address;}

    public void displayInfo() {
       System.out.println("Fullname: " + getFullname());
       System.out.println("Age: "  	+ getAge());
       System.out.println("Address: "  + getAddress());

}
}
