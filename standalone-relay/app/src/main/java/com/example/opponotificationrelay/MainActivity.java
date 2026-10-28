package com.example.opponotificationrelay;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/** Health and device tabs share the existing foreground connection owner. */
public final class MainActivity extends OfficialUiActivity {
    private OfficialComposeOwner composeOwner;private DeviceController controller;private HealthPage health;private boolean deviceTab,resumed;
    private View healthRoot,deviceRoot;
    @Override protected void onUiCreate(Bundle state){
        super.onUiCreate(state);composeOwner=new OfficialComposeOwner(this);FileLogger.init(this);BackgroundStart.logLastExit(this);ListenerRecovery.restoreInterruptedRepair(this);
        if(state!=null&&state.getBoolean("deviceTab"))showDevice();else showHealth();
    }
    private View content(){return ((ViewGroup)findViewById(android.R.id.content)).getChildAt(0);}
    private void pausePage(){if(deviceTab){if(controller!=null)controller.stop();}else if(health!=null)health.stop();}
    private void showHealth(){if(health!=null&&!deviceTab)return;pausePage();deviceTab=false;if(health==null){health=new HealthPage(this,this::showHealth,this::showDevice);healthRoot=content();}else setContentView(healthRoot);if(resumed)health.start();}
    private void showDevice(){if(controller!=null&&deviceTab)return;pausePage();deviceTab=true;if(controller==null){controller=new DeviceController(new DeviceRepository(this),new DevicePage(this));
        HealthNavigation.add((LinearLayout)findViewById(R.id.device_root),false,this::showHealth,this::showDevice);deviceRoot=content();}else setContentView(deviceRoot);if(resumed)controller.start();}
    @Override protected void onUiResume(){super.onUiResume();composeOwner.state("RESUMED");resumed=true;ListenerRecovery.request(this);BackgroundStart.restore(this,"用户重新打开应用");if(deviceTab){if(controller!=null)controller.start();}else if(health!=null)health.start();}
    @Override protected void onUiPause(){composeOwner.state("STARTED");resumed=false;pausePage();super.onUiPause();}
    @Override protected void onUiStop(){composeOwner.state("CREATED");super.onUiStop();}
    @Override protected void onUiDestroy(){pausePage();if(health!=null)health.close();health=null;controller=null;healthRoot=null;deviceRoot=null;composeOwner.state("DESTROYED");super.onUiDestroy();}
    @Override protected void onUiSaveInstanceState(Bundle state){state.putBoolean("deviceTab",deviceTab);super.onUiSaveInstanceState(state);}
    @Override public void onBackPressed(){if(deviceTab)showHealth();else super.onBackPressed();}
}
