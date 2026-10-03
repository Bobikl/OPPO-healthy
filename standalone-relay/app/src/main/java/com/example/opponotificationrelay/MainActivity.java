package com.example.opponotificationrelay;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/** Health and device tabs share the existing foreground connection owner. */
public final class MainActivity extends Activity {
    private OfficialComposeOwner composeOwner;private DeviceController controller;private HealthPage health;private boolean deviceTab,resumed;
    @Override protected void onCreate(Bundle state){
        super.onCreate(state);composeOwner=new OfficialComposeOwner(this);FileLogger.init(this);BackgroundStart.logLastExit(this);ListenerRecovery.restoreInterruptedRepair(this);
        if(state!=null&&state.getBoolean("deviceTab"))showDevice();else showHealth();
    }
    private void detach(){if(controller!=null){controller.stop();controller=null;}if(health!=null){health.close();health=null;}}
    private void showHealth(){if(health!=null)return;detach();deviceTab=false;health=new HealthPage(this,this::showHealth,this::showDevice);if(resumed)health.start();}
    private void showDevice(){if(controller!=null)return;detach();deviceTab=true;controller=new DeviceController(new DeviceRepository(this),new DevicePage(this));
        HealthNavigation.add((LinearLayout)findViewById(R.id.device_root),false,this::showHealth,this::showDevice);if(resumed)controller.start();}
    @Override protected void onResume(){super.onResume();composeOwner.state("RESUMED");resumed=true;ListenerRecovery.request(this);BackgroundStart.restore(this,"用户重新打开应用");if(controller!=null)controller.start();if(health!=null)health.start();}
    @Override protected void onPause(){composeOwner.state("STARTED");resumed=false;if(controller!=null)controller.stop();if(health!=null)health.stop();super.onPause();}
    @Override protected void onStop(){composeOwner.state("CREATED");super.onStop();}
    @Override protected void onDestroy(){detach();composeOwner.state("DESTROYED");super.onDestroy();}
    @Override protected void onSaveInstanceState(Bundle state){state.putBoolean("deviceTab",deviceTab);super.onSaveInstanceState(state);}
    @Override public void onBackPressed(){if(deviceTab)showHealth();else super.onBackPressed();}
}