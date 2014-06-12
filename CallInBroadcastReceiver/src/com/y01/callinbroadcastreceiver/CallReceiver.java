package com.y01.callinbroadcastreceiver;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;

public class CallReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		TelephonyManager telephoneManager = (TelephonyManager) context
				.getSystemService(Service.TELEPHONY_SERVICE);
		Log.d("tt", "来电状态："+telephoneManager.getCallState());
		String callNumber;
		switch(telephoneManager.getCallState()){
		case TelephonyManager.CALL_STATE_RINGING:
			callNumber = intent.getStringExtra("incoming_number");
			Log.d("tt", "来电号码："+callNumber);
			break;
		}

	}

}
