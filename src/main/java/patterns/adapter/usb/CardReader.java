package patterns.adapter.usb;

public class CardReader implements USBable {

    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsb() {
        this.memoryCard.insert();
    }

}
