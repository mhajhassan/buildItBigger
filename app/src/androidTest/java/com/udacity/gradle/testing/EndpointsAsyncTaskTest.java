package com.udacity.gradle.testing;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testVerifyResponseNotNull() throws InterruptedException, ExecutionException, TimeoutException {
        MainActivity mainActivity = new MainActivity();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivity);
        endpointsAsyncTask.execute();
        String result = endpointsAsyncTask.get(10, TimeUnit.SECONDS);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }
}
