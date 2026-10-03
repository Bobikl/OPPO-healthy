package com.example.opponotificationrelay;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/** Health and device tabs share the existing foreground connection owner. */
public final class MainActivity extends OfficialUiActivity {
    private OfficialComposeOwner composeOwner;private DeviceController controller;private HealthPage health;private boolean deviceTab,resumed;
    @Override protected void onUiCreate(Bundle state){
        super.onUiCreate(state);composeOwner=new OfficialComposeOwner(this);FileLogger.init(this);BackgroundStart.logLastExit(this);ListenerRecovery.restoreInterruptedRepair(this);
        if(state!=null&&state.getBoolean("deviceTab"))showDevice();else showHealth();
    }
    private void detach(){if(controller!=null){controller.stop();controller=null;}if(health!=null){health.close();health=null;}}
    private void showHealth(){if(health!=null)return;detach();deviceTab=false;health=new HealthPage(this,this::showHealth,this::showDevice);if(resumed)health.start();}
    private void showDevice(){if(controller!=null)return;detach();deviceTab=true;controller=new DeviceController(new DeviceRepository(this),new DevicePage(this));
        HealthNavigation.add((LinearLayout)findViewById(R.id.device_root),false,this::showHealth,this::showDevice);if(resumed)controller.start();}
    @Override protected void onUiResume(){super.onUiResume();composeOwner.state("RESUMED");resumed=true;ListenerRecovery.request(this);BackgroundStart.restore(this,"用户重新打开应用");if(controller!=null)controller.start();if(health!=null)health.start();}
    @Override protected void onUiPause(){composeOwner.state("STARTED");resumed=false;if(controller!=null)controller.stop();if(health!=null)health.stop();super.onUiPause();}
    @Override protected void onUiStop(){composeOwner.state("CREATED");super.onUiStop();}
    @Override protected void onUiDestroy(){detach();composeOwner.state("DESTROYED");super.onUiDestroy();}
    @Override protected void onUiSaveInstanceState(Bundle state){state.putBoolean("deviceTab",deviceTab);super.onUiSaveInstanceState(state);}
    @Override public void onBackPressed(){if(deviceTab)showHealth();else super.onBackPressed();}
}