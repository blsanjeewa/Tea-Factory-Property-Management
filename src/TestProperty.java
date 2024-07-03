import java.util.Scanner;

public class TestProperty{

    public static void main(String[] args) {

        //land property
        Land land1 = new Land();
        land1.inputValues();
        land1.print();
        System.out.println(land1.toString());

        System.out.println(" ");

        //Machine property
        Machine machine1 = new Machine();
        machine1.inputValues();
        machine1.print();
        System.out.println(machine1.toString());

        System.out.println(" ");
        System.out.println("This values by constructor...");
        System.out.println(" ");
        System.out.println("This is Machine sub class objects....");
        System.out.println(" ");

        //First Land object
        Land Land_A = new Land(40,80000,5000,"Loo1",200000,"sale","jkl");
        Land_A.getIncome(); Land_A.CalMaintenanceCost(); Land_A.getProfit();
        Land_A.print();

        //Second Land object
        Land Land_B = new Land(75, 85000, 20000, "L00B", 4500000, "Land Sale","Mr.A.Kamal");
        Land_B.getIncome(); Land_B.CalMaintenanceCost(); Land_B.getProfit();
        Land_B.print();

        //Third Land object
        Land Land_C = new Land(30,25000,10000,"L00C",2075000,"Company","Mr.A.D.D.Perera");
        Land_C.getIncome(); Land_C.CalMaintenanceCost(); Land_C.getProfit();
        Land_C.print();

        //Fourth Land object
        Land Land_D = new Land(120,30000,18000,"L00D",8000000,"Company","Mr.L.B.Nimal");
         Land_D.getIncome(); Land_D.CalMaintenanceCost(); Land_D.getProfit();
        Land_D.print();

        //Fifth Land object
        Land Land_E = new Land(167,42000,21000,"L00E",12000000,"Land Sale","Mr.T.S.Samaraweera");
        Land_E.getIncome(); Land_E.CalMaintenanceCost(); Land_E.getProfit();
        Land_E.print();

        System.out.println(" ");
        System.out.println("This is Machine sub class objects....");

        //First Machine object
        Machine Machine_A = new Machine("M00A",60000,"company","Mr.A.B.Perera",20,40000);
        Machine_A.CalMaintenanceCost(); Machine_A.print();

        //second Machine object
        Machine Machine_B = new Machine("M00B",11000,"company","Mr.A.P.Kamal",17,6000);
        Machine_B.CalMaintenanceCost(); Machine_B.print();

        //Third Machine object
        Machine Machine_C = new Machine("M00C",12500,"ab sale","Mr.p.p.Gunathilaka",26,8500);
        Machine_C.CalMaintenanceCost(); Machine_C.print();

        //Fourth Machine object
        Machine Machine_D = new Machine("M00D",3100,"company","Mr.u.Liyanage",21,11000);
        Machine_D.CalMaintenanceCost(); Machine_D.print();

        //Fifth Machine object
        Machine Machine_E = new Machine("M00E",15600,"sale","Mr.A.Silwa",27,13000);
        Machine_E.CalMaintenanceCost(); Machine_E.print();


    }

}
