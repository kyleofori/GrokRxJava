package com.detroitlabs.kyleofori.grokrxjava;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;
    private TextView firstTextView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        mainActivity = new MainActivity();
        firstTextView = (TextView) mainActivity.findViewById(R.id.firstTextView);
    }

    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("firstTextView is null", firstTextView);
    }

    public void testFirstTextView_labelText() {
        final String expected = mainActivity.getString(R.string.hello_world);
        final String actual = firstTextView.getText().toString();
        assertEquals(expected, actual);
    }
    public void tearDown() throws Exception {

    }
}
