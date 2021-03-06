package gr.steve.notyhide;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.widget.Toast;

public class OutgoingReceiver extends BroadcastReceiver {
	
	private static final String LAUNCHER_NUMBER = "12345";
	
    @Override
    public void onReceive(Context context, Intent intent) {
    	
        String number = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        
        //Toast.makeText(context, "Outgoing call: "+number, Toast.LENGTH_LONG).show();
                    
        if (number.equals(LAUNCHER_NUMBER)) {
        	
            //if(intent.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL))
            //{
            //  abortBroadcast ();
            //}
            
        	
        	setResultData(null);
            Intent appIntent = new Intent(context, MainActivity.class);
            appIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(appIntent);
        }
        
        
        
    }

}
