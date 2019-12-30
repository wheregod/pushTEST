package org.techtown.pushtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIDService extends FirebaseMessagingService { // 여기 FirebaseMessagingService가 강의랑 다름


    private static final String TAG = "MyFirebaseIDService";


    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e(TAG,token);

        sendRegistrationToServer(token);
    }



    private void sendRegistrationToServer(String token) {




    }

}
