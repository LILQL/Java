package runtime;

public class TestRuntime {
    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("max memory:"+runtime.maxMemory()/1024/1024+"MB");
        System.out.println("free memory:"+runtime.freeMemory()/1024/1024+"MB");
        System.out.println("total memory:"+runtime.totalMemory()/1024/1024+"MB");
        Process p = runtime.exec("notepad.exe");

        Thread.sleep(3000);
        p.destroy();

    }
}

