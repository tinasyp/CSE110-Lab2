package edu.ucsd.cse110.lab2;

import android.widget.Button;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import android.text.TextUtils;
import android.widget.TextView;

@RunWith(RobolectricTestRunner.class)

public class BetterMainActvityTest {
    @Test
    public void test_one_plus_one_equals_two() {
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            var one = activity.findViewById(R.id.btn_one);
            var plus = activity.findViewById(R.id.btn_plus);
            var equal = activity.findViewById(R.id.btn_equals);
            one.performClick();
            plus.performClick();
            one.performClick();
            equal.performClick();
//            var message = activity.findViewById(R.id.display).
            Assert.assertEquals(((TextView)activity.findViewById(R.id.display)).getText().toString(), "2");
        });
    }
}
