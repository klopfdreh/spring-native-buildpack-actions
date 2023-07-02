package de.spring.nat.playground;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.context.annotation.Profile;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
@Profile("test")
public class SpringNativeApplicationIT {

    @Test
    void testApplicationStartedProperly(CapturedOutput capturedOutput){
        assertTrue(capturedOutput.getAll().contains("Started SpringNativeApplicationIT"));
    }
}
