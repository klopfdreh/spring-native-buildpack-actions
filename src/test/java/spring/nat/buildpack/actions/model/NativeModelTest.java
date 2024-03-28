package spring.nat.buildpack.actions.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NativeModelTest {

    @Test
    void testNativeModel() {
        NativeModel nativeModel = new NativeModel();
        nativeModel.setValue("myValue");
        Assertions.assertEquals("myValue", nativeModel.getValue());
    }
}
