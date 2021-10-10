package Lab4Part1;

public class SalePerson implements Comparable<SalePerson>{
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString(){
        String returnStr = firstName + ", " + lastName + ": " + totalSales;
        return returnStr;
    }

    public boolean equals(Object o){
        if (o == null) return false;
        else if (!(o instanceof SalePerson)) return false;
        else{
            SalePerson aSalePerson = (SalePerson) o;
            return (firstName == aSalePerson.firstName && lastName == aSalePerson.lastName);
        }
    }

    @Override
    public int compareTo(SalePerson o) {
        SalePerson aSalePerson = (SalePerson) o;
        if (totalSales == aSalePerson.totalSales){ // Same sales, sort by lastName in Asc
            if (lastName.compareTo(aSalePerson.lastName) < 0){
                return 1; // Same sales and lower lastName
            }
            else{
                return -1; // Same sales but higher lastName
            }
        }
        else{
            if (totalSales > aSalePerson.totalSales){
                return 1; // Executing object has higher sales
            }
            else {
                return -1; // Executing object has lower sales
            }
        }
        

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getTotalSales(){
        return totalSales;
    }
}
