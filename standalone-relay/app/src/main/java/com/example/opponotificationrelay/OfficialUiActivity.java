package com.example.opponotificationrelay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.*;
import java.lang.ref.WeakReference;

/** Delay resource-dependent UI creation without blocking the framework lifecycle. */
public abstract class OfficialUiActivity extends Activity {
    private boolean uiReady,started,resumed,dead;
    private Bundle initial,restore;
    @Override public final void onCreate(Bundle saved){
        super.onCreate(saved);initial=saved==null?null:new Bundle(saved);
        if(OfficialUiResources.ready())createUi();else{loading(false);prepare();}
    }
    private void loading(boolean failed){
        LinearLayout box=new LinearLayout(this);box.setOrientation(1);box.setGravity(Gravity.CENTER);box.setBackgroundColor(0xff202020);
        TextView label=new TextView(this);label.setText(failed?"界面资源加载失败，请重试":"正在准备界面…");label.setTextColor(0xffeeeeee);label.setTextSize(16);box.addView(label);
        if(failed){Button retry=new Button(this);retry.setText("重试");retry.setOnClickListener(v->{loading(false);prepare();});box.addView(retry);}
        setContentView(box);
    }
    private void prepare(){
        WeakReference<OfficialUiActivity> ref=new WeakReference<>(this);
        OfficialUiResources.prepare(getApplicationContext(),()->{
            OfficialUiActivity activity=ref.get();if(activity==null||activity.dead||activity.isFinishing())return;
            if(OfficialUiResources.ready()){if(activity.started)activity.createUi();}else activity.loading(true);
        });
    }
    private void createUi(){
        if(uiReady||dead||isFinishing())return;
        uiReady=true;onUiCreate(initial);initial=null;
        if(started)onUiStart();
        if(restore!=null){super.onRestoreInstanceState(restore);restore=null;}
        if(resumed)onUiResume();
    }
    @Override protected final void onStart(){super.onStart();started=true;if(uiReady)onUiStart();else if(OfficialUiResources.ready())createUi();}
    @Override protected final void onResume(){super.onResume();resumed=true;if(uiReady)onUiResume();}
    @Override protected final void onPause(){if(uiReady)onUiPause();resumed=false;super.onPause();}
    @Override protected final void onStop(){if(uiReady)onUiStop();started=false;super.onStop();}
    @Override protected final void onDestroy(){dead=true;if(uiReady)onUiDestroy();initial=null;restore=null;super.onDestroy();}
    @Override protected final void onSaveInstanceState(Bundle out){super.onSaveInstanceState(out);if(uiReady)onUiSaveInstanceState(out);else if(initial!=null)out.putAll(initial);}
    @Override protected final void onRestoreInstanceState(Bundle saved){if(uiReady)super.onRestoreInstanceState(saved);else restore=new Bundle(saved);}
    protected void onUiCreate(Bundle saved){}
    protected void onUiStart(){}
    protected void onUiResume(){}
    protected void onUiPause(){}
    protected void onUiStop(){}
    protected void onUiDestroy(){}
    protected void onUiSaveInstanceState(Bundle out){}
}
