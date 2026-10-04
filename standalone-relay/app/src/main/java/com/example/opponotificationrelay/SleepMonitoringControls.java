package com.example.opponotificationrelay;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

/** Sleep-page controls follow live recording state and confirmed watch readback. */
public final class SleepMonitoringControls {
    private final Activity activity;
    private final RfcommWearTransport transport;
    private final Handler handler=new Handler(Looper.getMainLooper());
    private final LinearLayout card;
    private final CompoundButton phone,watch;
    private final TextView phoneHint,watchHint,status;
    private final TextView refresh;
    private boolean rendering,active,attempted,stopping;
    private String device="";
    private OafHealthChannel.Snapshot snapshot;
    private final Runnable tick=new Runnable(){public void run(){if(!active)return;render();handler.postDelayed(this,1000);}};

    public SleepMonitoringControls(Activity activity){
        this.activity=activity;transport=RfcommWearTransport.getInstance(activity);
        card=HealthUi.card(activity,0xff1a1a1a);
        TextView title=HealthUi.text(activity,"睡眠呼吸监测",18,HealthUi.TEXT);title.setTypeface(null,1);card.addView(title);
        LinearLayout phoneText=HealthUi.vertical(activity);
        phoneText.addView(HealthUi.text(activity,"手机睡眠录音",16,HealthUi.TEXT));
        phoneHint=HealthUi.text(activity,"睡前打开，起床关闭；录音保存在本机",13,HealthUi.MUTED);phoneText.addView(phoneHint);
        phone=new OfficialStyleSwitch(activity);phone.setContentDescription("手机睡眠录音");addRow(phoneText,phone);
        HealthUi.divider(card);
        LinearLayout watchText=HealthUi.vertical(activity);
        watchText.addView(HealthUi.text(activity,"手表睡眠呼吸暂停监测",16,HealthUi.TEXT));
        watchHint=HealthUi.text(activity,"正在读取手表设置…",13,HealthUi.MUTED);watchText.addView(watchHint);
        watch=new OfficialStyleSwitch(activity);watch.setContentDescription("手表睡眠呼吸暂停监测");addRow(watchText,watch);
        status=HealthUi.text(activity,"",12,HealthUi.MUTED);card.addView(status);
        LinearLayout actions=new LinearLayout(activity);actions.setGravity(Gravity.CENTER_VERTICAL);
        TextView records=HealthUi.text(activity,"录音记录与分析  ›",15,HealthUi.TEXT);HealthUi.padding(records,0,16,8,4);
        actions.addView(records,new LinearLayout.LayoutParams(0,-2,1));records.setOnClickListener(v->activity.startActivity(new Intent(activity,SnoreMonitoringActivity.class)));
        refresh=HealthUi.text(activity,"刷新手表设置",14,DeviceStyle.ACCENT);HealthUi.padding(refresh,8,16,0,4);actions.addView(refresh);
        refresh.setOnClickListener(v->{attempted=transport.requestHealthSettings();render();});card.addView(actions);
        phone.setOnCheckedChangeListener((button,on)->{if(rendering)return;if(on){render();activity.startActivity(new Intent(activity,SnoreMonitoringActivity.class).putExtra("start_recording",true));}else{stopping=SnoreRecordingService.isRunning();SnoreRecordingService.stop(activity);render();}});
        watch.setOnCheckedChangeListener((button,on)->{
            if(rendering)return;
            if(snapshot==null||!device.equals(RelayConfig.getTargetMac(activity))||!transport.changeHealthSetting(HealthSetting.APNEA,on?1:0,snapshot.revision)){
                transport.requestHealthSettings();Toast.makeText(activity,"正在刷新手表设置，请读取完成后重试",Toast.LENGTH_SHORT).show();
            }
            render();
        });
        render();
    }
    private void addRow(LinearLayout text,CompoundButton toggle){
        LinearLayout row=new LinearLayout(activity);row.setGravity(Gravity.CENTER_VERTICAL);HealthUi.padding(row,0,18,0,18);
        row.addView(text,new LinearLayout.LayoutParams(0,-2,1));row.addView(toggle,new LinearLayout.LayoutParams(-2,HealthUi.dp(activity,48)));card.addView(row);
        row.setOnClickListener(v->{if(toggle.isEnabled())toggle.setChecked(!toggle.isChecked());});
    }
    public LinearLayout view(){return card;}
    public void resume(){active=true;attempted=false;HealthSyncManager.get(activity).interactive(true);handler.removeCallbacks(tick);tick.run();}
    public void pause(){active=false;handler.removeCallbacksAndMessages(null);HealthSyncManager.get(activity).interactive(false);}
    private void render(){
        String current=RelayConfig.getTargetMac(activity);
        if(!current.equals(device)){device=current;attempted=false;}
        if(active&&!attempted&&transport.getState()==RfcommWearTransport.STATE_READY)attempted=transport.requestHealthSettings();
        snapshot=transport.healthSettings();Integer setting=snapshot.values.get(HealthSetting.APNEA);
        boolean recording=SnoreRecordingService.isRunning();if(!recording)stopping=false;
        rendering=true;
        try{
            phone.setChecked(recording);phone.setEnabled(!stopping);
            phoneHint.setText(stopping?"正在结束录音并保存…":recording?"正在录音，可熄屏；起床后关闭即可保存":SnoreRecordingService.lastError().isEmpty()?"睡前打开，起床关闭；至少录制 1 小时":SnoreRecordingService.lastError());
            watch.setChecked(setting!=null&&setting==1);watch.setEnabled(setting!=null&&snapshot.connected&&!snapshot.busy);
            watchHint.setText(setting==null?"手表状态未确认，请连接后刷新":snapshot.busy?"正在同步，请稍候…":setting==1?"已开启，手表会在睡眠期间监测":"已关闭，开启后由手表在睡眠期间监测");
            status.setText(snapshot.message);refresh.setEnabled(!snapshot.busy);
        }finally{rendering=false;}
    }
}
