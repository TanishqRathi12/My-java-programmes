public class trialthread extends threadzz {
    public static void main(String[] args) {
      trialthread thread = new trialthread();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
  