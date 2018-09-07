package com.udacity.gradle.builditbigger;

/**
 * Created by someone on 9/6/18.
 */

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Pair;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.CountDownLatch;


@RunWith(JUnit4.class)
public class EndpointsAsyncTaskTest {

    private Context context;

    @Test
    public void testJoke() throws InterruptedException {

        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();

        EndpointsAsyncTask testTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                assertTrue(result.length() > 0);
                latch.countDown();
            }
        };

        testTask.execute(Pair.create(context,"another joke!"));
        latch.await();
    }

}
