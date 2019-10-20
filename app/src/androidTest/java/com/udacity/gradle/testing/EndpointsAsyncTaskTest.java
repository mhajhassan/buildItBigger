package com.udacity.gradle.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.TaskResult;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void testDoInBackground() throws InterruptedException {

        final CountDownLatch signal = new CountDownLatch(1);
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(result -> {
            assertNotNull(result);
            signal.countDown();
        });
        endpointsAsyncTask.execute();
        signal.await(30, TimeUnit.SECONDS);
    }
}