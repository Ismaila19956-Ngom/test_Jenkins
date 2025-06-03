package com.ngom.dev.niit.sn.jenkins;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PipelineTest {
    @Test
    void testPipelineIsRunning() {
        String message = "Pipeline is running!";
        assertEquals("Pipeline is running!", message);
    }
    //add comment
}
