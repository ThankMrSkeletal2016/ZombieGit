package downwardspiral.zombie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mContinue;

    private TextView mLon;
    private TextView mLat;
    boolean buttonPressed = false;

    private Geolocation gps = new Geolocation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLon = (TextView)findViewById(R.id.lon);
        mLat = (TextView)findViewById(R.id.lat);
        mLon.setText(R.string.longHere);
        mLat.setText(R.string.latHere);

        mContinue = (Button) findViewById(R.id.continueButton);

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.gettingGPS,Toast.LENGTH_SHORT).show();
                gps.setGpsLongitude(R.string.staticLong);
                gps.setGpsLatitude(R.string.staticLat);
                mLon.setText(gps.getGpsLongitude());
                mLat.setText(gps.getGpsLatitude());

            }
        });
    }
}
