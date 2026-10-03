package com.example.opponotificationrelay;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

/** Device monitoring controls. Values come from the connected watch, never guessed defaults. */
public final class HealthSettingsActivity extends OfficialUiActivity {
    public static final String CATEGORY="health_category";
    private final Handler ui=new Handler(Looper.getMainLooper());
    private final Map<HealthSetting,Row> rows=new EnumMap<>(HealthSetting.class);
    private RfcommWearTransport transport;private TextView state;private ProgressBar progress;private TextView refresh;
    private OafHealthChannel.Snapshot snapshot;private boolean rendering,attempted;
    private final Runnable tick=new Runnable(){public void run(){render();ui.postDelayed(this,1000);}};
    private static final class Row {LinearLayout view;TextView detail,value;CompoundButton toggle;}
    private int dp(int n){return DeviceStyle.dp(this,n);}
    private TextView label(String text,int size,int color){TextView v=new TextView(this);v.setText(text);v.setTextSize(size);v.setTextColor(color);v.setLineSpacing(dp(3),1);return v;}
    private LinearLayout vertical(){LinearLayout v=new LinearLayout(this);v.setOrientation(LinearLayout.VERTICAL);return v;}
    @Override protected void onUiCreate(Bundle saved){
        super.onUiCreate(saved);HealthSyncManager.get(this).interactive(true);transport=RfcommWearTransport.getInstance(this);
        int category=getIntent().getIntExtra(CATEGORY,0);if(category<0 || category>=HealthSetting.CATEGORIES.length)category=0;
        ScrollView scroll=new ScrollView(this);scroll.setFillViewport(true);scroll.setVerticalScrollBarEnabled(false);
        LinearLayout content=vertical();content.setPadding(dp(18),dp(4),dp(18),dp(30));scroll.addView(content);
        LinearLayout statusRow=new LinearLayout(this);statusRow.setGravity(Gravity.CENTER_VERTICAL);statusRow.setPadding(dp(2),dp(12),dp(2),dp(20));
        state=label("正在读取手表设置…",14,DeviceStyle.MUTED);statusRow.addView(state,new LinearLayout.LayoutParams(0,-2,1));
        progress=new ProgressBar(this);LinearLayout.LayoutParams pp=new LinearLayout.LayoutParams(dp(20),dp(20));pp.leftMargin=dp(10);statusRow.addView(progress,pp);content.addView(statusRow);
        if(category==4){
            TextView habits=label("作息习惯与提醒  ›",18,DeviceStyle.TEXT);habits.setPadding(dp(18),dp(20),dp(18),dp(20));habits.setBackground(DeviceStyle.shape(0xff303030,16,this));
            LinearLayout.LayoutParams hp=new LinearLayout.LayoutParams(-1,-2);hp.bottomMargin=dp(18);content.addView(habits,hp);
            habits.setOnClickListener(v->startActivity(new android.content.Intent(this,SleepHabitsActivity.class)));
        }
        LinearLayout card=vertical();card.setBackground(DeviceStyle.shape(0xff303030,16,this));content.addView(card,new LinearLayout.LayoutParams(-1,-2));
        boolean first=true;
        for(HealthSetting key:HealthSetting.values())if(key.category==category){
            if(!first){View line=new View(this);line.setBackgroundColor(0xff424242);LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,dp(1));lp.setMargins(dp(18),0,dp(18),0);card.addView(line,lp);}first=false;
            Row row=new Row();row.view=new LinearLayout(this);row.view.setGravity(Gravity.CENTER_VERTICAL);row.view.setPadding(dp(18),dp(14),dp(18),dp(14));
            LinearLayout text=vertical();text.addView(label(key.label,18,DeviceStyle.TEXT));row.detail=label("未读取",13,DeviceStyle.MUTED);LinearLayout.LayoutParams hint=new LinearLayout.LayoutParams(-1,-2);hint.topMargin=dp(5);text.addView(row.detail,hint);row.view.addView(text,new LinearLayout.LayoutParams(0,-2,1));
            if(key.toggle){row.toggle=new OfficialStyleSwitch(this);row.toggle.setContentDescription(key.label);row.view.addView(row.toggle,new LinearLayout.LayoutParams(-2,dp(48)));
                row.toggle.setOnCheckedChangeListener((button,on)->{if(!rendering)save(key,on?1:0,snapshot==null?0:snapshot.revision);});
                row.view.setOnClickListener(v->{if(row.toggle.isEnabled())row.toggle.setChecked(!row.toggle.isChecked());});
            }else{row.value=label("未读取  ›",15,DeviceStyle.MUTED);row.value.setGravity(Gravity.END);row.value.setPadding(dp(8),0,0,0);row.view.addView(row.value,new LinearLayout.LayoutParams(-2,-2));row.view.setOnClickListener(v->pick(key));}
            card.addView(row.view,new LinearLayout.LayoutParams(-1,-2));rows.put(key,row);
        }
        TextView footer=label("修改后会重新读取手表设置，确认保存结果。",13,DeviceStyle.MUTED);footer.setPadding(dp(4),dp(18),dp(4),0);content.addView(footer);
        LinearLayout shell=DeviceStyle.shell(this,HealthSetting.CATEGORIES[category],scroll);LinearLayout bar=(LinearLayout)shell.getChildAt(0);
        refresh=label("刷新",15,DeviceStyle.ACCENT);refresh.setGravity(Gravity.CENTER);refresh.setPadding(dp(10),0,0,0);bar.addView(refresh,new LinearLayout.LayoutParams(-2,dp(48)));
        refresh.setOnClickListener(v->{attempted=transport.requestHealthSettings();render();});render();
    }
    @Override protected void onUiResume(){super.onUiResume();HealthSyncManager.get(this).interactive(true);attempted=false;render();ui.postDelayed(tick,1000);}
    @Override protected void onUiPause(){ui.removeCallbacks(tick);HealthSyncManager.get(this).interactive(false);super.onUiPause();}
    @Override protected void onUiDestroy(){ui.removeCallbacksAndMessages(null);super.onUiDestroy();}
    private void render(){
        if(!attempted && transport.getState()==RfcommWearTransport.STATE_READY)attempted=transport.requestHealthSettings();
        snapshot=transport.healthSettings();state.setText(snapshot.message);progress.setVisibility(snapshot.busy?View.VISIBLE:View.GONE);refresh.setEnabled(!snapshot.busy);refresh.setAlpha(snapshot.busy?0.4f:1f);
        rendering=true;
        try{for(Map.Entry<HealthSetting,Row> entry:rows.entrySet()){
            HealthSetting key=entry.getKey();Row row=entry.getValue();Integer value=snapshot.values.get(key);boolean known=value!=null;
            row.detail.setText(known?key.hint:snapshot.values.isEmpty()?"未读取":"设备未返回此项设置");
            boolean enabled=known && !snapshot.busy && snapshot.connected;row.view.setEnabled(enabled);
            if(row.toggle!=null){row.toggle.setChecked(known && value==1);row.toggle.setEnabled(enabled);}
            else{row.value.setText(known?key.display(value)+"  ›":"未读取  ›");row.value.setTextColor(enabled?DeviceStyle.ACCENT:DeviceStyle.MUTED);}
        }}finally{rendering=false;}
    }
    private void pick(HealthSetting key){
        OafHealthChannel.Snapshot current=snapshot;if(current==null || current.busy || !current.values.containsKey(key))return;
        if(!current.writable(SystemClock.elapsedRealtime())){transport.requestHealthSettings();render();Toast.makeText(this,"正在刷新设置，请读取完成后重试",Toast.LENGTH_SHORT).show();return;}
        int count=(key.max-key.min)/key.step+1;String[] choices=new String[count];for(int i=0;i<count;i++)choices[i]=key.display(key.min+i*key.step);
        NumberPicker picker=new NumberPicker(this);picker.setMinValue(0);picker.setMaxValue(count-1);picker.setDisplayedValues(choices);picker.setWrapSelectorWheel(false);picker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        int selected=current.values.get(key);picker.setValue(key.valid(selected)?(selected-key.min)/key.step:0);
        LinearLayout box=new LinearLayout(this);box.setGravity(Gravity.CENTER);box.setPadding(dp(20),dp(12),dp(20),dp(12));box.addView(picker,new LinearLayout.LayoutParams(-2,dp(180)));
        new AlertDialog.Builder(this).setTitle(key.label).setView(box).setNegativeButton("取消",null).setPositiveButton("保存",(d,w)->save(key,key.min+picker.getValue()*key.step,current.revision)).show();
    }
    private void save(HealthSetting key,int value,long revision){
        if(!transport.changeHealthSetting(key,value,revision)){Toast.makeText(this,"设置已过期或尚未读取，请刷新后重试",Toast.LENGTH_SHORT).show();transport.requestHealthSettings();}
        render();
    }
}