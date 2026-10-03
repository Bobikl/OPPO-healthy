package com.example.opponotificationrelay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.*;
import java.time.LocalDate;
import java.util.*;
import com.heytap.health.core.widget.charts.data.TimeStampedData;

/** Independent landscape destination, matching the official SleepDayHorizontalActivity flow. */
public final class SleepTimelineActivity extends OfficialUiActivity implements HealthDataManager.Listener {
    private LocalDate date=LocalDate.now();
    private SleepTimelineView chart;
    private TextView summary,times,heartToggle,oxygenToggle;
    private final boolean[] visible={true,true,true,true};private int lineMode;
    @Override public void onUiCreate(Bundle state){
        super.onUiCreate(state);
        try{date=LocalDate.parse(state==null?getIntent().getStringExtra("date"):state.getString("date"));}catch(Exception ignored){}
        LinearLayout root=HealthUi.vertical(this);root.setBackgroundColor(DeviceStyle.BG);
        LinearLayout header=HealthUi.header(this,root,"睡眠 · "+HealthMetricsData.shortDate(date),null);
        header.getChildAt(0).setContentDescription("收起时间线");
        LinearLayout body=HealthUi.vertical(this);HealthUi.padding(body,24,0,24,10);
        summary=HealthUi.text(this,"",16,HealthUi.TEXT);body.addView(summary);
        chart=new SleepTimelineView(this);chart.setExpanded(true);body.addView(chart,new LinearLayout.LayoutParams(-1,0,1));
        times=HealthUi.text(this,"",12,HealthUi.MUTED);body.addView(times);
        LinearLayout legend=new LinearLayout(this);legend.setGravity(Gravity.CENTER);HealthUi.padding(legend,0,8,0,0);
        for(int i=0;i<4;i++){
            TextView label=HealthUi.text(this,"●  "+SleepTimelineView.NAMES[i],12,HealthUi.MUTED);
            final int stage=i;label.setOnClickListener(v->{visible[stage]=!visible[stage];label.setAlpha(visible[stage]?1f:.35f);chart.stage(stage+1,visible[stage]);});label.setContentDescription(SleepTimelineView.NAMES[i]+"筛选");
            android.text.SpannableString text=new android.text.SpannableString(label.getText());text.setSpan(new android.text.style.ForegroundColorSpan(SleepTimelineView.COLORS[i]),0,1,33);label.setText(text);label.setGravity(Gravity.CENTER);
            legend.addView(label,new LinearLayout.LayoutParams(HealthUi.dp(this,105),-2));
        }
        body.addView(legend);
        LinearLayout signals=new LinearLayout(this);signals.setGravity(Gravity.CENTER);
        heartToggle=signalButton(signals,"心率",1);oxygenToggle=signalButton(signals,"血氧",2);body.addView(signals);
        root.addView(body,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);
    }
    @Override protected void onUiStart(){super.onUiStart();HealthDataManager.get(this).add(this);HealthDataManager.get(this).request(new HealthMetricsData.Period(date,0),date,false);HealthDataManager.get(this).request(date,true,false);HealthDataManager.get(this).request(date.minusDays(1),true,false);}
    @Override protected void onUiStop(){HealthDataManager.get(this).remove(this);super.onUiStop();}
    @Override protected void onUiSaveInstanceState(Bundle b){b.putString("date",date.toString());super.onUiSaveInstanceState(b);}
    private TextView signalButton(LinearLayout row,String name,int mode){TextView t=HealthUi.text(this,name,12,HealthUi.MUTED);t.setGravity(Gravity.CENTER);HealthUi.padding(t,16,6,16,6);t.setOnClickListener(v->{lineMode=lineMode==mode?0:mode;chart.line(lineMode);updateSignals();});row.addView(t);return t;}
    private void updateSignals(){heartToggle.setTextColor(lineMode==1?HealthMetricsData.RED:HealthUi.MUTED);oxygenToggle.setTextColor(lineMode==2?0xff62baff:HealthUi.MUTED);}
    private static List<TimeStampedData> signal(TreeMap<Long,Integer> source,long start,long end){List<TimeStampedData> out=new ArrayList<>();if(start<=0||end<=start)return out;long previous=0;for(Map.Entry<Long,Integer> e:source.subMap(start,true,end,false).entrySet()){TimeStampedData p=new TimeStampedData(e.getKey(),e.getValue());p.setDisconnect(previous>0&&e.getKey()-previous>300000);out.add(p);previous=e.getKey();}return out;}
    @Override public void changed(HealthMetricsData data,String message,boolean busy){
        chart.bind(data==null?Collections.emptyList():data.sleep(date));HealthMetricsData.Day day=data==null?null:data.find(date);
        List<HealthMetricsData.SleepSegment> rows=data==null?Collections.emptyList():data.sleep(date);long start=rows.isEmpty()?0:rows.get(0).start,end=rows.isEmpty()?0:rows.get(rows.size()-1).end;
        List<TimeStampedData> h=data==null?Collections.emptyList():signal(data.raw,start,end),o=data==null?Collections.emptyList():signal(data.oxygen,start,end);
        chart.signals(h,o);if((lineMode==1&&h.isEmpty())||(lineMode==2&&o.isEmpty()))lineMode=0;chart.line(lineMode);for(int i=0;i<4;i++)chart.stage(i+1,visible[i]);
        heartToggle.setEnabled(!h.isEmpty());heartToggle.setText(h.isEmpty()?"心率 · 暂无数据":"心率");oxygenToggle.setEnabled(!o.isEmpty());oxygenToggle.setText(o.isEmpty()?"血氧 · 暂无数据":"血氧");updateSignals();
        summary.setText("全天睡眠  "+SleepSummaryChart.duration(day==null?0:day.sleepMinutes));
        times.setText(day==null||day.sleepIn<=0?"暂无睡眠时间记录":"入睡 "+HealthMetricsData.timeLabel(day.sleepIn)+"    —    醒来 "+HealthMetricsData.timeLabel(day.sleepOut-60000));
    }
}
