package com.example.opponotificationrelay;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.time.*;
import java.util.*;
/** Actual watch measurements, kept separate from the official daily baseline difference. */
public final class WristRawDetailActivity extends OfficialUiActivity implements HealthDataManager.Listener {
    private final HealthPageTransition transition=new HealthPageTransition();
    private LocalDate date=LocalDate.now();private HealthMetricsData data;private ScrollView scroll;private TextView status;private int visible=60;
    @Override public void onUiCreate(Bundle saved){super.onUiCreate(saved);try{date=LocalDate.parse(saved!=null?saved.getString("date"):getIntent().getStringExtra("date"));}catch(Exception ignored){}build(false);}
    @Override protected void onUiStart(){super.onUiStart();transition.select(new HealthMetricsData.Period(date,0));HealthDataManager.get(this).add(this);request();}
    @Override protected void onUiStop(){HealthDataManager.get(this).remove(this);data=null;super.onUiStop();}
    @Override protected void onUiSaveInstanceState(Bundle saved){saved.putString("date",date.toString());super.onUiSaveInstanceState(saved);}
    private void request(){HealthDataManager.get(this).request(new HealthMetricsData.Period(date,0),date,false);}
    private void change(LocalDate day){if(day.isBefore(LocalDate.of(2019,1,1)))return;date=day.isAfter(LocalDate.now())?LocalDate.now():day;visible=60;transition.select(new HealthMetricsData.Period(date,0));request();}
    @Override public void changed(HealthMetricsData value,String message,boolean busy){
        if(transition.update(value,data,date,RelayConfig.getTargetMac(this),HealthDataManager.get(this).settled(value))){data=value;build(transition.keepScroll());}
        status.setText(data==null?(busy?"正在读取历史记录…":message):message);status.setVisibility(data==null||!message.isEmpty()?View.VISIBLE:View.GONE);
    }
    private void build(boolean keep){int y=keep&&scroll!=null?scroll.getScrollY():0;
        LinearLayout root=HealthUi.vertical(this);root.setBackgroundColor(0xff1a1a1a);HealthUi.header(this,root,"原始腕温",null);
        LinearLayout calendar=HealthUi.vertical(this);HealthUi.padding(calendar,18,0,18,0);HealthUi.dateRow(this,calendar,HealthMetricsData.dayLabel(date),date.isBefore(LocalDate.now()),()->change(date.minusDays(1)),()->change(date.plusDays(1)),()->HealthUi.pick(this,date,"wrist",this::change));root.addView(calendar);
        scroll=new ScrollView(this);scroll.setVerticalScrollBarEnabled(false);LinearLayout body=HealthUi.vertical(this);HealthUi.padding(body,18,8,18,24);scroll.addView(body);
        body.addView(HealthUi.text(this,"绝对腕温（℃）",16,HealthUi.MUTED));HealthMetricsData.Day day=data==null?null:data.find(date);
        String range=day==null||day.wristRawCount==0?"—":String.format(Locale.CHINA,"%.2f–%.2f",day.wristRawMin/100f,day.wristRawMax/100f);body.addView(HealthUi.value(this,range,"℃",36));
        TextView hint=HealthUi.text(this,"按实际测量时间显示，仅展示设备标记为有效的测量；与较个人基准的温差分别显示。",13,HealthUi.MUTED);HealthUi.padding(hint,0,16,0,20);body.addView(hint);
        NavigableMap<Long,Integer> rows=data==null?new TreeMap<>():data.wristRaw.subMap(HealthMetricsData.time(date),true,HealthMetricsData.time(date.plusDays(1)),false).descendingMap();
        body.addView(HealthUi.text(this,"当天记录 · "+rows.size()+" 条",19,HealthUi.TEXT));int count=0;
        for(Map.Entry<Long,Integer> entry:rows.entrySet()){if(count++>=visible)break;TextView row=HealthUi.text(this,HealthMetricsData.timeLabel(entry.getKey())+"    "+String.format(Locale.CHINA,"%.2f ℃",entry.getValue()/100f),17,HealthUi.TEXT);HealthUi.padding(row,0,16,0,16);body.addView(row);}
        if(data!=null&&rows.isEmpty()){TextView empty=HealthUi.text(this,"暂无原始测量",17,HealthUi.MUTED);HealthUi.padding(empty,0,20,0,0);body.addView(empty);}
        if(rows.size()>visible){Button more=new Button(this);more.setText("查看更多记录");more.setOnClickListener(v->{visible+=60;build(true);});body.addView(more);}
        status=HealthUi.text(this,data==null?"正在读取历史记录…":"",13,HealthUi.MUTED);status.setVisibility(data==null?View.VISIBLE:View.GONE);body.addView(status);root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);if(y>0)scroll.post(()->scroll.scrollTo(0,y));
    }
}
