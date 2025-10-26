class OOP implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("OOP");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Through implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Through");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class JavaWord implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class P22 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new OOP());
        Thread t2 = new Thread(new Through());
        Thread t3 = new Thread(new JavaWord());

        t1.start();
        t2.start();
        t3.start();
    }
}
