package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager ramManager = new RAMManager();
        DiskManager diskManager = new DiskManager();

        ramManager.allocateMemory(1024);
        diskManager.allocateMemory(2048);

        ramManager.freeMemory();
        diskManager.freeMemory();

        String memoryType = MemoryManager.getMemoryType();
        System.out.println(memoryType);
    }
}
