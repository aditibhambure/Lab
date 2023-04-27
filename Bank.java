package Lab_work;

public class Bank {
	public float getRateOfInterest() {
        return 0;      // default returns 0
    }

    public static void main(String[] args) {
        Bank sbi = new SBI();  //create object sbi
        Bank icici = new ICICI();  //create object icici
        Bank axis = new AXIS();  //create object axsi

        System.out.println("SBI interest: " + sbi.getRateOfInterest() + "");
        System.out.println("ICICI interest: " + icici.getRateOfInterest() + "");
        System.out.println("AXIS  interest: " + axis.getRateOfInterest() + "");
    }
}

class SBI extends Bank {
    public float getRateOfInterest() {
        return 8; // SBI has  8% rate of interest
    }
}

class ICICI extends Bank {
    public float getRateOfInterest() {
        return 7; // ICICI has 7% rate of interest
    }
}

class AXIS extends Bank {
    public float getRateOfInterest() {
        return 9; // AXIS has 9% rate of interest
    }
}
