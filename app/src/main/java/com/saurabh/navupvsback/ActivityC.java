package com.saurabh.navupvsback;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ActivityC extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_c);
    setupToolbar();
  }

  private void setupToolbar() {
    Toolbar myChildToolbar = findViewById(R.id.toolbar);
    setSupportActionBar(myChildToolbar);
    ActionBar ab = getSupportActionBar();
    ab.setDisplayHomeAsUpEnabled(true);
  }
}