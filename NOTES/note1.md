## Thread Introduction
### java.lang.Thread
##### What are Threads in java:
* In java, a thread is the smallest unit of execution within a process.
* Threads allow multiple tasks to be performed concurrently within a single program, enabling better utilization of system resources and improved responsiveness.
* Each thread represents an independent sequence of instructions that can execute in parallel with other threads.

##### What is multi-threading
* **Multithreading** is the concurrent execution of multiple threads in a single process. Each thread represents an independent flow of execution, allowing programs to perform multiple tasks concurrently.
* **Creating Threads**: in java, you can create threads by either **extending the Thread class** or **implementing the Runnable interface**. Implementing Runnable is generally preferred as it provides better separation of concerns.

##### Threads Creation Hands-On
There are two ways to create thread in java.
i) By Extending the Thread class [like below]
```java
package multithreading.creatingthreads;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i< 5; i++) {
			System.out.println("Thread A: " + i);
		}
		System.out.println("Thread A completed.");
	}
}

public class ThreadExample {
	
	public static void main(String[] args) {
		MyThread threadA = new MyThread();
		threadA.start();
		for(int i = 0; i<5; i++) {
			System.out.println("Main Thread: " + i);
		}
		System.out.println("Thread Main completed.");
	}

}
```
