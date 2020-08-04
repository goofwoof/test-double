package mock;

public class MockDoorPanel extends DoorPanel {
    @Override
    void close() {
        System.out.println("Everything is closed");
    }
}
