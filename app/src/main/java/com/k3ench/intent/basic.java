package com.k3ench.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class basic extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t=(TextView) findViewById(R.id.nkt) ;

        Intent intent = getIntent();

        String ma = intent.getStringExtra("mkk");
        t.setText("Hi  "+ma+"!!");
       // setTitle(ma);
       // t.setText(ma);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    //switch (view.getId()) {
                      //  case R.id.fab:
                         //   Intent k = new Intent(basic.this, IntentMe.class);
                            //startActivity(k);
                            //finish();
                //System.gc();
                //System.exit(0);
                           // break;
                //basic.this.finish();

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
              //  android.os.Process.killProcess(android.os.Process.myPid());
                //basic.super.onDestroy();               //  }

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
