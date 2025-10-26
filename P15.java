/*WRITE A JAVA PROGRAM USING AN INTERFACE CALLED 'BANK' HAVING FUNCTION 'RATE_OF_INTEREST()'.
 IMPLEMENT THIS INTERFACE TO CREATE TWO SEPARATE BANK CLASSES 'SBI' AND 'PNB' TO PRINT DIFFERENT
  RATES OF INTEREST. INCLUDE ADDITIONAL MEMBER VARIABLES, CONSTRUCTORS ALSO IN CLASSES 'SBI' AND 'PNB'. */

  interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    String branchName;
    double rate;

    SBI(String branchName, double rate) {
        this.branchName = branchName;
        this.rate = rate;
    }

    public double rateOfInterest() {
        return rate;
    }
}

class PNB implements Bank {
    String branchName;
    double rate;

    PNB(String branchName, double rate) {
        this.branchName = branchName;
        this.rate = rate;
    }

    public double rateOfInterest() {
        return rate;
    }
}

class P15 {
    public static void main(String[] args) {
        SBI sbi = new SBI("Thalassery", 6.5);
        PNB pnb = new PNB("Kannur", 7.0);

        System.out.println("SBI " + sbi.branchName + " : " + sbi.rateOfInterest());
        System.out.println("PNB " + pnb.branchName + " : " + pnb.rateOfInterest());
    }
}
