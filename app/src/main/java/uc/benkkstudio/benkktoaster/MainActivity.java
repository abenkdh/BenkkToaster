package uc.benkkstudio.benkktoaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uc.benkkstudio.simpletoaster.SimpleToaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleToaster.show(this, "BENKK");
    }
}
