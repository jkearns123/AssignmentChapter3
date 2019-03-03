package com.jadekearns.question1testfixtures;

import static org.junit.Assert.assertTrue;

import com.jadekearns.question1testfixtures.IV_Timeouts;
import org.junit.Test;

/**
 * Unit test for simple IV_Timeouts.
 */
public class IVTimeoutsTest
{

    @Test (timeout = 30)
    public void testPerformance(){
        IV_Timeouts iv_timeouts = new IV_Timeouts();
        iv_timeouts.stopwatch();
    }
}
