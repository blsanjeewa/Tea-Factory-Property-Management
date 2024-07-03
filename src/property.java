import java.util.Scanner;

public abstract class property { //abstract class

     Scanner inputValues = new Scanner(System.in);

    //data members
      double value;
      double Maintenance_Cost;
      String Property_Trustee;
      String Ownership;
      static String Company_Name = "ABC";

      //private data member
      private String Property_Id;
      //getter method
      public String getProperty_Id() {
          return Property_Id;
      }

      //initialize by constructor
     property() {
          this.Property_Id = null;
          this.value = 0;
          this.Ownership = null;
          this.Property_Trustee = null;
      }

      //over loading constructor
          property(String Property_Id, double value, String Ownership, String Property_Trustee){
          this.Property_Id = Property_Id;
          this.value = value;
          this.Ownership = Ownership;
          this.Property_Trustee =Property_Trustee;
          //this.Maintenance_Cost = Maintenance_Cost;
      }


    void inputValues(){
        System.out.print("Enter Ownership :");
        this.Ownership = inputValues.nextLine();

        System.out.print("Enter Property Trustee :");
        this.Property_Trustee = inputValues.nextLine();

        System.out.print("Enter property Id :");
        this.Property_Id = inputValues.nextLine();

        System.out.print("Enter value :");
        this.value = inputValues.nextDouble();



    }


    //Abstract method
      abstract double CalMaintenanceCost();


     void print(){
         System.out.println(" ");
         System.out.println("Property information");
         System.out.println("____________________");
         System.out.println(" ");
         System.out.println("Company name             =" + " " + Company_Name);
         System.out.println("property Id              ="+" "+getProperty_Id());
         System.out.println("Property Trustee         ="+" "+Property_Trustee);
         System.out.println("The owner                ="+" " +Ownership);
         System.out.println("The value                ="+" "+"Rs."+value);


     }

     //toString method
     public String toString(){
         return "This is a Property";
     }

  }

 class Land extends property {

    Scanner inputValues = new Scanner(System.in);
     //data members
     private double profit;
     double income;
     double Area_Of_Land;
     double Income_per_perch;
     double Maintenance_per_perch;

     //constructor
     Land() {
         Area_Of_Land = 0;
         Income_per_perch = 0;
         Maintenance_per_perch = 0;
         income = 0;
         profit = 0;
     }

     //over loading Land constructor
     Land(double Area_Of_Land, double Income_per_perch, double Maintenance_per_perch,String Property_Id, double value, String Ownership, String Property_Trustee ) {
        super(Property_Id,value, Ownership,Property_Trustee);
         this.Area_Of_Land = Area_Of_Land;
         this.Income_per_perch = Income_per_perch;
         this.Maintenance_per_perch = Maintenance_per_perch;

     }

     //overriding method
     public void inputValues() {

          super.inputValues();

         System.out.print("Enter Area_Of_Land :");
         this.Area_Of_Land = inputValues.nextDouble();

         System.out.print("Enter Income_per_perch  :");
         this.Income_per_perch = inputValues.nextDouble();

         System.out.print("Enter Maintenance_per_perch  :");
         this.Maintenance_per_perch = inputValues.nextDouble();
     }

     //print method overriding

     void print() {

         super.print();
         System.out.println("Income                   =" + " " + "Rs." +getIncome());
         System.out.println("Maintenance cost         =" + " " + "Rs." + CalMaintenanceCost());
         System.out.println("profit                   =" + " " + "Rs." + getProfit());

     }

     //set data members
     public void setArea_Of_Land(double Area_Of_Land) {
         this.Area_Of_Land = Area_Of_Land;
     }

     public void setIncome_per_perch(double Income_per_perch) {
         this.Income_per_perch = Income_per_perch;
     }

     public void setMaintenance_per_perch(double Maintenance_per_perch) {
         this.Maintenance_per_perch = Maintenance_per_perch;
     }

     //getter methods
     public double getArea_Of_Land() {
         return Area_Of_Land;
     }

     public double getIncome_per_perch() {
         return Income_per_perch;
     }

     public double getMaintenance_per_perch() {
         return Maintenance_per_perch;
     }

     //calculate income
     public double getIncome() {
         return getArea_Of_Land()*getIncome_per_perch();
     }

     //Calculate Maintenance for one land
     double CalMaintenanceCost() {
         return getArea_Of_Land()*getMaintenance_per_perch();
     }

     public double getProfit() {
         return getIncome()-CalMaintenanceCost();
     }

     //toString method
     public String toString(){
         return super.toString()+" "+"and"+" "+"This is a Land property";
     }

     }

     //Machine property
     class Machine extends property{

    Scanner inputValues = new Scanner(System.in);

    //data members
    double workHours;
    double Maintenance_Machine_Cost;
    double MaintenanceCost_per_hour;
    double quality;

    //constructor
     Machine(){
         this.workHours = 0;
         this.MaintenanceCost_per_hour = 0;
         this.quality = 0;
     }

     //over loading method
     Machine(String Property_Id, double value, String Ownership, String Property_Trustee, double workHours,double MaintenanceCost_per_hour){
         super(Property_Id,value,Ownership,Property_Trustee);
              this.workHours = workHours;
              this.MaintenanceCost_per_hour = MaintenanceCost_per_hour;

     }

     //input values
     void inputValues(){

         super.inputValues();

         System.out.print("Enter workHours :");
         this.workHours = inputValues.nextFloat();

         System.out.print("Enter Maintenance_per_hour  :");
         this.MaintenanceCost_per_hour = inputValues.nextDouble();

     }

        //get method
         public double getWorkHours() {
             return workHours;
         }

         public double getMaintenanceCost_per_hour() {
             return MaintenanceCost_per_hour;
         }

         //set methods
         public void setWorkHours(float workHours) {
             this.workHours = workHours;
         }

         public void setMaintenanceCost_per_hour(double maintenanceCost_per_hour) {
             MaintenanceCost_per_hour = maintenanceCost_per_hour;
         }


         double CalMaintenanceCost(){
         return getMaintenanceCost_per_hour()*getWorkHours();
        }

         public double getQuality() {
             return (getMaintenanceCost_per_hour()/getWorkHours())/100;
         }

         //Override method
         void print() {
             super.print();
             System.out.println("Maintenance cost         =" + " " + "Rs." + CalMaintenanceCost());

             if(getQuality() <= 0.5)
                     System.out.println("This machine is in working condition.");
             else if(getQuality()>= 0.6)
                     System.out.println("This machine needs to be replaced.");
                 else
                     System.out.println("This machine needs to be repaired.");
         }

         //toString method
         public String toString(){
             return super.toString()+" "+"and"+" "+"This is a machine property";
         }
     }



