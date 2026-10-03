package com.example.opponotificationrelay;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.*;
import com.github.mikephil.charting.data.*;
import com.heytap.health.core.widget.charts.HealthTimeXLineChart;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.hrv.ui.chart.BaseChart;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
/** Local record binding for the original wellness controls. */
public final class WellnessDetailActivity extends Activity implements HealthDataManager.Listener {
 private int kind=5,mode,visible=30;private LocalDate date=LocalDate.now();private HealthMetricsData data;private TextView status;private ScrollView scroll;
 private String title(){return kind==5?"身心状态":kind==6?"放松":"日照";}
 @Override public void onCreate(Bundle saved){super.onCreate(saved);kind=getIntent().getIntExtra("vital",5);if(kind<5||kind>7)kind=5;try{date=LocalDate.parse(saved!=null?saved.getString("date"):getIntent().getStringExtra("date"));}catch(Exception ignored){}if(saved!=null)mode=saved.getInt("mode");build(false);}
 @Override protected void onStart(){super.onStart();HealthDataManager.get(this).add(this);request();}
 @Override protected void onStop(){HealthDataManager.get(this).remove(this);super.onStop();}
 @Override protected void onSaveInstanceState(Bundle saved){saved.putString("date",date.toString());saved.putInt("mode",mode);super.onSaveInstanceState(saved);}
 private void request(){HealthDataManager.get(this).request(date,false,false);}
 private void change(LocalDate day,int selectedMode){if(day.isBefore(LocalDate.of(2019,1,1)))return;date=day.isAfter(LocalDate.now())?LocalDate.now():day;mode=selectedMode;visible=30;build(false);request();}
 @Override public void changed(HealthMetricsData value,String message,boolean busy){if(data!=value){data=value;build(true);}status.setText(message);status.setVisibility(message.isEmpty()?View.GONE:View.VISIBLE);}
 boolean has(HealthMetricsData.Day d){return kind==5?d.mentalAverage>0:kind==6?d.relaxCount>0:d.sunshineMinutes>=0;}
 private float metric(HealthMetricsData.Day d){return kind==5?d.mentalAverage:kind==6?d.relaxSeconds/60f:d.sunshineMinutes;}
 private String number(float value){return value==Math.round(value)?String.valueOf(Math.round(value)):String.format(Locale.CHINA,"%.1f",value);}
 private String duration(int seconds){return seconds/60+" 分钟"+(seconds%60==0?"":" "+seconds%60+" 秒");}
 private void build(boolean keep){int y=keep&&scroll!=null?scroll.getScrollY():0;Context ui=OfficialUiResources.wrap(this);HealthMetricsData.Period p=new HealthMetricsData.Period(date,mode);List<HealthMetricsData.Day> days=new ArrayList<>();if(data!=null)for(HealthMetricsData.Day d:data.days.subMap(p.start,true,p.end,true).values())if(has(d))days.add(d);
  LinearLayout root=HealthUi.vertical(this);root.setBackgroundColor(0xff1a1a1a);HealthUi.header(this,root,title(),null);HealthUi.segments(this,root,mode,m->change(date,m));LinearLayout calendar=HealthUi.vertical(this);HealthUi.padding(calendar,18,0,18,0);HealthUi.dateRow(this,calendar,p.label(),p.end.isBefore(LocalDate.now()),()->change(p.previous().start,mode),()->change(p.next(),mode),()->HealthUi.pick(this,date,d->change(d,mode)));root.addView(calendar);
  scroll=new ScrollView(this);scroll.setVerticalScrollBarEnabled(false);LinearLayout body=HealthUi.vertical(this);scroll.addView(body);LinearLayout top=HealthUi.vertical(this);HealthUi.padding(top,18,4,18,16);HealthMetricsData.Day selected=data==null?null:data.find(date);float sum=0;for(HealthMetricsData.Day d:days)sum+=metric(d);String summary=days.isEmpty()?"—":number(kind==5?sum/days.size():sum);
  if(mode==0&&kind==5&&selected!=null&&selected.mentalLatest>0)summary=String.valueOf(selected.mentalLatest);top.addView(HealthUi.text(this,kind==5?(mode==0?"最近身心状态":"平均身心状态"):"累计"+title()+"时长",16,HealthUi.MUTED));top.addView(HealthUi.value(this,summary,kind==5?"":"分钟",42));
  if(mode==0&&selected!=null){if(kind==5&&selected.mentalLatest>0)top.addView(HealthUi.text(this,WellnessUi.mentalState(selected.mentalLatestState)+" · "+HealthMetricsData.timeLabel(selected.mentalTime),16,HealthUi.MUTED));if(kind==7&&selected.sunshineMinutes>=0)top.addView(HealthUi.text(this,"每日目标 "+selected.sunshineTarget+" 分钟",16,HealthUi.MUTED));}body.addView(top);
  if(kind==5&&mode==0){BaseChart chart=new BaseChart(ui);WellnessUi.mental(chart,data,date,false);chart.setContentDescription("身心状态记录图");body.addView(chart,new LinearLayout.LayoutParams(-1,HealthUi.dp(this,260)));}
  else if(mode!=0){HealthTimeXLineChart chart=new HealthTimeXLineChart(ui);chart.setXAxisTimeUnit(TimeUnit.ORIGINAL);chart.setxStart(0);chart.setLineColor(kind==5?0xff66ceac:kind==6?0xffb1a3ff:0xffffb337);List<Entry> entries=new ArrayList<>();for(HealthMetricsData.Day d:days){float x=mode==3?d.date.getMonthValue()-1+(d.date.getDayOfMonth()-1)/(float)d.date.lengthOfMonth():ChronoUnit.DAYS.between(p.start,d.date);entries.add(new Entry(x,metric(d),d));}chart.setEntryList(entries);
   if(chart.getData()!=null)for(Object object:chart.getData().getDataSets()){LineDataSet set=(LineDataSet)object;set.setColor(android.graphics.Color.TRANSPARENT);set.setDrawFilled(false);set.setDrawCircles(true);set.setDrawCircleHole(false);set.setCircleColor(kind==5?0xff66ceac:kind==6?0xffb1a3ff:0xffffb337);set.setCircleRadius(3);set.setDrawValues(false);}OfficialChartSupport.configure(chart,"暂无数据",(entry,heading)->{HealthMetricsData.Day d=(HealthMetricsData.Day)entry.getData();return heading?d.date.toString():number(metric(d))+(kind==5?"":" 分钟");});OfficialChartSupport.range(chart,p);chart.getAxisRight().setAxisMinimum(0);if(kind==5)chart.getAxisRight().setAxisMaximum(100);chart.setContentDescription(title()+"每日记录图，"+days.size()+"个数据点");body.addView(chart,new LinearLayout.LayoutParams(-1,HealthUi.dp(this,260)));}
  LinearLayout records=HealthUi.vertical(this);HealthUi.padding(records,18,22,18,24);records.addView(HealthUi.text(this,mode==0?"当天记录":"每日记录",19,HealthUi.TEXT));List<String> labels=new ArrayList<>();List<LocalDate> dates=new ArrayList<>();
  if(mode==0&&data!=null&&kind==5){List<HealthMetricsData.Mental> points=data.mental(date);for(int i=points.size()-1;i>=0;i--){HealthMetricsData.Mental q=points.get(i);labels.add(HealthMetricsData.timeLabel(q.time)+"    "+q.value+"    "+WellnessUi.mentalState(q.state));}}
  else if(mode==0&&data!=null&&kind==6){List<HealthMetricsData.Relax> points=data.relax(date);for(int i=points.size()-1;i>=0;i--){HealthMetricsData.Relax q=points.get(i);labels.add(HealthMetricsData.timeLabel(q.time)+"    "+WellnessUi.relaxName(ui,q.type,q.subtype)+"    "+duration(q.seconds));}}
  else for(int i=days.size()-1;i>=0;i--){HealthMetricsData.Day d=days.get(i);labels.add(d.date+"    "+(kind==6?duration(d.relaxSeconds):number(metric(d))+(kind==7?" 分钟":"    "+WellnessUi.mentalState(d.mentalState))));dates.add(d.date);}
  if(labels.isEmpty())records.addView(HealthUi.text(this,"暂无记录",17,HealthUi.MUTED));for(int i=0;i<Math.min(visible,labels.size());i++){String label=labels.get(i);TextView row=HealthUi.text(this,label,16,HealthUi.TEXT);HealthUi.padding(row,0,16,0,16);if(mode!=0){LocalDate day=dates.get(i);row.setContentDescription(label+"，查看当天记录");row.setOnClickListener(v->change(day,0));}records.addView(row);}if(labels.size()>visible){Button more=new Button(this);more.setText("查看更多记录");more.setOnClickListener(v->{visible+=30;build(true);});records.addView(more);}
  status=HealthUi.text(this,"",12,HealthUi.MUTED);status.setVisibility(View.GONE);records.addView(status);body.addView(records);root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);if(y>0)scroll.post(()->scroll.scrollTo(0,y));
 }
}