package downwardspiral.zombie.views;

import downwardspiral.zombie.models.GeolocationOutputDoc;

/**
 * Created by Ian on 10/8/2016.
 */

public class gpsPage extends Object {
    private int mQuestion;

    private boolean mTrueQuestion;

    public GeolocationOutputDoc getGPS(){
        GeolocationOutputDoc output = new GeolocationOutputDoc();
        String latatuide="33.5376098";
        String longitude="-86.72221560000003";
        return output;
    }
}
