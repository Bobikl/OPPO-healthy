package com.example.opponotificationrelay;

import android.app.*;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.*;

/** Existing local nap quiet policy, now under Sleep > Habits and reminders. */
public final class NapSettingsActivity extends Activity {
    private TextView start,end,status;private OfficialStyleSwitch toggle;private boolean rendering;
    private int dp(int n){return DeviceStyle.dp(this,n);}
    private TextView text(String s,int size){TextView v=new TextView(this);v.setText(s);v.setTextSize(size);v.setTextColor(DeviceStyle.TEXT);v.setPadding(dp(18),dp(18),dp(18),dp(18));return v;}
    @Override protected void onCreate(Bundle saved){super.onCreate(saved);ScrollView scroll=new ScrollView(this);LinearLayout content=new LinearLayout(this);content.setOrientation(LinearLayout.VERTICAL);content.setPadding(dp(18),dp(18),dp(18),dp(30));scroll.addView(content);
        LinearLayout card=new LinearLayout(this);card.setOrientation(LinearLayout.VERTICAL);card.setBackground(DeviceStyle.shape(0xff303030,16,this));content.addView(card);
        LinearLayout row=new LinearLayout(this);row.setGravity(Gravity.CENTER_VERTICAL);row.addView(text("午休时静默手机通知",18),new LinearLayout.LayoutParams(0,-2,1));toggle=new OfficialStyleSwitch(this);toggle.setContentDescription("午休时静默手机通知");LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-2,dp(48));lp.rightMargin=dp(18);row.addView(toggle,lp);card.addView(row);
        toggle.setOnCheckedChangeListener((b,on)->{if(rendering)return;if(on && RelayConfig.getProtocolCid(this)!=RelayPayloadEncoder.COMMAND_POST_PARSED){Toast.makeText(this,"当前通知协议不支持午休静默",Toast.LENGTH_LONG).show();render();return;}NapQuietSettings.setEnabled(this,on);render();});
        start=text("",18);end=text("",18);card.addView(start);card.addView(end);start.setOnClickListener(v->pick(true));end.setOnClickListener(v->pick(false));
        status=text("",13);status.setTextColor(DeviceStyle.MUTED);content.addView(status);DeviceStyle.shell(this,"午休时静默手机通知",scroll);render();}
    private void render(){rendering=true;try{toggle.setChecked(NapQuietSettings.enabled(this));start.setText("午休开始时间    "+NapQuietPolicy.time(NapQuietSettings.start(this)));end.setText("午休结束时间    "+NapQuietPolicy.time(NapQuietSettings.end(this)));status.setText("手机通知仍会送达手表，午休时不发出声音和震动。按手机本地时间生效。\n\n"+(NapQuietSettings.enabled(this)?"当前午休时间已启用":"当前午休静默已关闭"));}finally{rendering=false;}}
    private void pick(boolean first){int current=first?NapQuietSettings.start(this):NapQuietSettings.end(this);OfficialTimePicker.show(this,first?"午休开始时间":"午休结束时间",current,picked->{int a=first?picked:NapQuietSettings.start(this),b=first?NapQuietSettings.end(this):picked;if(!NapQuietPolicy.valid(a,b)){Toast.makeText(this,"结束时间需要晚于开始时间",Toast.LENGTH_LONG).show();return;}NapQuietSettings.setRange(this,a,b);render();});}
}
