public class Computer {

    private int storage;
    private String printerModel;

    public Computer(int inputStorage, String inputPrinterModel) {
        this.storage = inputStorage;
        this.printerModel = inputPrinterModel;
    }

    public int getStorage() {
        return storage;
    }

    public int addStorage(int moreStorage) {
        this.storage += moreStorage;
        return this.storage;

    }
}
