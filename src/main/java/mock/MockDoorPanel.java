package mock;

public class MockDoorPanel extends DoorPanel {

    @Override
    public void close() {
        System.out.println("Everything is closed");
    }
}
