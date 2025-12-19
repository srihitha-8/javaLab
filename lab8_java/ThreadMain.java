class One extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Two extends Thread{
    public void run(){
        while(true){
            try{
                System.out.println("CSE");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class ThreadMain {
    public static void main(String[] args) {
        One o=new One();
        Two t=new Two();
        o.start();
        t.start();
    }
}