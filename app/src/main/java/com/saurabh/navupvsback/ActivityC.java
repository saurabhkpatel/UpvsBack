package com.saurabh.navupvsback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

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

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      // Respond to the action bar's Up/Home button
      case android.R.id.home:
        Intent upIntent = NavUtils.getParentActivityIntent(this);
        if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
          // This activity is NOT part of this app's task, so create a new task
          // when navigating up, with a synthesized back stack.
          TaskStackBuilder.create(this)
                          // Add all of this activity's parents to the back stack
                          .addNextIntentWithParentStack(upIntent)
                          // Navigate up to the closest parent
                          .startActivities();
        } else {
          // simply go back
          onBackPressed();
        }
        return true;
    }
    return super.onOptionsItemSelected(item);
  }
}