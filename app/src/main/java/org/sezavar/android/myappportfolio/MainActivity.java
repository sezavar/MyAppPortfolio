package org.sezavar.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        int buttonId = view.getId();
        Log.i(this.getClass().getName(),"onClick "+buttonId);
        switch (buttonId) {
            case R.id.buttonSpotifyStreamerId:
                this.displayMessage(getResources().getString(R.string.button_spotifyStreamer_text));
                break;
            case R.id.buttonScoresAppId:
                this.displayMessage(getResources().getString(R.string.button_scoresApp_text));
                break;
            case R.id.buttonLibraryAppId:
                this.displayMessage(getResources().getString(R.string.button_libraryApp_text));
                break;
            case R.id.buttonBuildItBiggerId:
                this.displayMessage(getResources().getString(R.string.button_buildItBigger_text));
                break;
            case R.id.buttonXyzReaderId:
                this.displayMessage(getResources().getString(R.string.button_xyzReader_text));
                break;
            case R.id.buttonCapstoneId:
                this.displayMessage(getResources().getString(R.string.button_capstone_text));
                break;
        }
    }

    private void displayMessage(String appName) {
        Log.i(this.getClass().getName(),"displayMessage "+appName);
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.predefined_message) +" "+appName + "!", Toast.LENGTH_SHORT).show();
    }
}
