package patterns.adapter.usb;

import git_test.C;

public class CompRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        CardReader cardReader = new CardReader(memoryCard);

        computer.connectWithUsb(cardReader);
    }
}
