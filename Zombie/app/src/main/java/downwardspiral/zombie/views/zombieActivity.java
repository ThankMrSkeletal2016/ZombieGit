package downwardspiral.zombie.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import downwardspiral.zombie.R;
import downwardspiral.zombie.models.GeolocationOutputDoc;

public class zombieActivity extends AppCompatActivity {

    private Button mContinue;

    private gpsPage gpsPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zombie);

        mContinue = (Button) findViewById(R.id.continueButton);

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(zombieActivity.this,R.string.gettingGPS,Toast.LENGTH_SHORT).show();
            }
        });

        setContentView(R.layout.gps);
        GeolocationOutputDoc output = gpsPage.getGPS();
        TextView longitude = (TextView)findViewById(R.id.longitude);
        longitude.setText("Your Longitude is "+output.getLongitude());
        TextView latitude = (TextView)findViewById(R.id.latitude);
        latitude.setText("Your Latitude is "+output.getLatitude());
        setContentView(R.layout.gps);

    }
}
