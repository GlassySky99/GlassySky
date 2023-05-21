package lr13;

public class Example4 {

    public static void main(String[] args)throws InterruptedException {
        Thread t1 = new Thread(()->{

            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());

        });
        Thread t3 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t4 = new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t5 = new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t6 = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t7 = new Thread(()->{
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t8 = new Thread(()->{
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t9 = new Thread(()->{
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        Thread t10 = new Thread(()->{
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID потока "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
        });
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t5.setName("Thread 5");
        t6.setName("Thread 6");
        t7.setName("Thread 7");
        t8.setName("Thread 8");
        t9.setName("Thread 9");
        t10.setName("Thread 10");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
    }
}
