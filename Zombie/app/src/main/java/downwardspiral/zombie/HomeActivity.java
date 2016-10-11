package downwardspiral.zombie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ian on 10/10/2016.
 */

public class HomeActivity extends Activity {

    private Button mGpsButton;
    private Button mAccept;
    private Button mLeaveButton;

    private Geolocation gps = new Geolocation();
    private TextView mLon;
    private TextView mLat;
    private TextView mHomeBase;
    private TextView mLeave;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homebase);

        mGpsButton = (Button) findViewById(R.id.gpsButton);
        mAccept = (Button) findViewById(R.id.acceptButton);
        mLeaveButton = (Button)findViewById(R.id.leaveHome);
        mAccept.setEnabled(false);
        mLeaveButton.setEnabled(false);


        mLon = (TextView)findViewById(R.id.lon);
        mLat = (TextView)findViewById(R.id.lat);
        mLeave = (TextView)findViewById(R.id.leaveText);
        mLon.setText(R.string.longHere);
        mLat.setText(R.string.latHere);

        mHomeBase = (TextView)findViewById(R.id.homeBase);

        mGpsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gps.setGpsLatitude(R.string.staticLat);
                gps.setGpsLongitude(R.string.staticLong);
                mLon.setText(gps.getGpsLongitude());
                mLat.setText(gps.getGpsLatitude());
                if(!mAccept.isEnabled()) {
                    mAccept.setEnabled(true);
                }
            }
        });
        mAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHomeBase.setText(R.string.home);
                mLeave.setText(R.string.leaveText);
                mLeaveButton.setEnabled(true);
            }
        });
        mLeaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You Have Left Home!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
