package Deadlock;

class Deadlock {
    A a = new A();
    B b = new B();
    
    Deadlock(){
    	Thread.currentThread().setName("MainThread");
    	Thread t = new Thread((Runnable)this , "RacingThread");
    	t.start();
    	
    	a.foo(b); // get lock on b in this thread 
    	System.out.println("Back in my Thread");
    }
	
    public void run(){
    	b.bar(a); // get lock on a in this thread 
    	System.out.println("Back in other thread");
    }
	public static void main(String[] args) {
		new Deadlock();
	}

}

class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered in A.foo");
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("A is Interrupted !!!");
		}
		
		System.out.println("Trying to call B.last");
		b.last();
	}
	synchronized void last(){
		System.out.println("Inside A.last");
	}
	
}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered in B.bar");
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("B is Interrupted !!!");
		}
		System.out.println(name + " Trying to call	A.last");
		a.last();
	}
	synchronized void last(){
		System.out.println("Inside A.last");
	}
	
}