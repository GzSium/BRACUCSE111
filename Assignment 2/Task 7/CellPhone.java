public class CellPhone{
    public String model ="unknown ";
    //storecontact array hobe
    int i = 0;
    public String[] contact= new String[3];
    public void storeContact(String con){
        if(i<3) {
        contact[i]= con;
        i++;
        System.out.println("Contact Stored"); 
        }else{
        System.out.println("Memory full. New contact can't be stored. ");
        }
    }
    public void printDetails() {
        System.out.println("Phone Model "+model);
        System.out.println("Contacts Stored "+i);
        System.out.println("Stored Contacts: ");
        for(int j=0;j<i;j++){
            System.out.println(contact[j]);
        }
        }
    }

