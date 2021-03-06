package messages;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ActualMessage implements Message{
    int type;
    byte[] payload;
    ActualMessage(byte[] bytes) {
        type = ByteBuffer.wrap(Arrays.copyOfRange(bytes, 0, 1)).getInt();
        payload = Arrays.copyOfRange(bytes, 0, 1);
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();

        return bytes.toByteArray();
    }
}
