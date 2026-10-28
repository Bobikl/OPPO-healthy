package com.example.opponotificationrelay;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.components.LimitLine;
import com.heytap.health.core.widget.charts.HealthTimeXLineChart;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
/** Local records adapter using the original chart renderer and shared native date panel. */
public final class VitalsDetailActivity extends OfficialUiActivity implements HealthDataManager.Listener {
    private final HealthPageTransition transition=new HealthPageTransition();
    private int kind=OfficialHomeSmallCard.OXYGEN,mode;private LocalDate date=LocalDate.now();private HealthMetricsData data;private TextView status;private ScrollView scroll;private int visible=30;private boolean loading=true;private TextView loadingView,emptyView;
    private LinearLayout pageRoot,body,segmentHost,dateControls,knowledge,records;
    private TextView summaryValue,summaryTitle;private int renderedMode=-1;
    private com.heytap.health.wrist_temperature.view.WristTemperatureChart wristChart;
    private com.heytap.health.core.widget.charts.BloodOxCandleChart oxygenChart;
    boolean oxygen(){return kind==OfficialHomeSmallCard.OXYGEN;}
    private String title(){return oxygen()?"血氧":"手腕温度";}
    @Override public void onUiCreate(Bundle saved){super.onUiCreate(saved);kind=getIntent().getIntExtra("vital",OfficialHomeSmallCard.OXYGEN);if(kind!=OfficialHomeSmallCard.WRIST)kind=OfficialHomeSmallCard.OXYGEN;
        try{date=LocalDate.parse(saved!=null?saved.getString("date"):getIntent().getStringExtra("date"));}catch(Exception ignored){}if(saved!=null)mode=saved.getInt("mode");if(!oxygen()&&mode==0)mode=1;build(false);}
    @Override protected void onUiStart(){super.onUiStart();if(pageRoot==null)build(false);transition.select(new HealthMetricsData.Period(date,mode));HealthDataManager.get(this).add(this);request();}
    @Override protected void onUiStop(){HealthDataManager.get(this).remove(this);data=null;pageRoot=null;wristChart=null;oxygenChart=null;renderedMode=-1;super.onUiStop();}
    @Override protected void onUiSaveInstanceState(Bundle saved){saved.putString("date",date.toString());saved.putInt("mode",mode);super.onUiSaveInstanceState(saved);}
    private void request(){loading=true;if(oxygen()&&mode==0)HealthDataManager.get(this).requestOxygenDay(date);else HealthDataManager.get(this).request(new HealthMetricsData.Period(date,mode),date,false,oxygen()?HealthSnapshotWindow.Content.ALL:HealthSnapshotWindow.Content.WRIST_SUMMARY);updateLoading("");}
    private void change(LocalDate day,int selectedMode){if(day.isBefore(LocalDate.of(2019,1,1)))return;date=day.isAfter(LocalDate.now())?LocalDate.now():day;mode=oxygen()?selectedMode:Math.max(1,selectedMode);visible=30;transition.select(new HealthMetricsData.Period(date,mode));request();}
    @Override public void changed(HealthMetricsData value,String message,boolean busy){
        HealthDataManager manager=HealthDataManager.get(this);
        loading=busy||manager.hasPendingRequests();
        HealthPageReadiness.Content content=oxygen()&&mode==0?HealthPageReadiness.Content.OXYGEN_DAY:HealthPageReadiness.Content.SUMMARY;
        boolean ready=manager.presentationReady(value,content,date);
        if(transition.update(value,data,date,RelayConfig.getTargetMac(this),ready)){
            data=value;
            build(transition.keepScroll());
        }
        status.setText(message);
        status.setVisibility(message.isEmpty()?View.GONE:View.VISIBLE);
        updateLoading(message);
    }
    private List<HealthMetricsData.Point> points(HealthMetricsData.Period p){List<HealthMetricsData.Point> out=new ArrayList<>();if(data==null)return out;
        if(oxygen()&&mode==0){long start=HealthMetricsData.time(date),end=HealthMetricsData.time(date.plusDays(1));for(Map.Entry<Long,Integer> e:data.oxygen.subMap(start,true,end,false).entrySet())out.add(new HealthMetricsData.Point((e.getKey()-start)/1800000f,e.getValue(),e.getValue(),e.getValue(),e.getKey(),HealthMetricsData.timeLabel(e.getKey())));return out;}
        for(HealthMetricsData.Day d:data.days.subMap(p.start,true,p.end,true).values()){
            if(oxygen()?d.oxygenCount<=0:d.wristBase<=0||d.wristValue<=0)continue;
            float value=oxygen()?d.oxygenMean:OfficialWristChart.value(d);
            float x=mode==0?24:mode==3?d.date.getMonthValue()-1+(d.date.getDayOfMonth()-1)/(float)d.date.lengthOfMonth():ChronoUnit.DAYS.between(p.start,d.date);
            out.add(new HealthMetricsData.Point(x,oxygen()?d.oxygenMin:value,oxygen()?d.oxygenMax:value,value,HealthMetricsData.time(d.date),HealthMetricsData.shortDate(d.date)));
        }return out;
    }
    private void updateLoading(String message){boolean initial=data==null;if(loadingView!=null){loadingView.setText(loading?"正在读取历史记录…":message);loadingView.setVisibility(initial&&(loading||!message.isEmpty())?View.VISIBLE:View.GONE);}if(emptyView!=null&&initial)emptyView.setText(loading?"正在读取历史记录…":message.isEmpty()?"暂无记录":"记录尚未加载完成");}
    private String value(float v){if(oxygen())return String.valueOf(Math.round(v));v=Math.round(v*10)/10f;return String.format(Locale.CHINA,v>0?"+%.1f":"%.1f",v==0?0:v);}
    private void createShell(HealthMetricsData.Period p){
        pageRoot=HealthUi.vertical(this);pageRoot.setBackgroundColor(0xff1a1a1a);HealthUi.header(this,pageRoot,title(),null);
        segmentHost=HealthUi.vertical(this);pageRoot.addView(segmentHost);LinearLayout calendar=HealthUi.vertical(this);HealthUi.padding(calendar,18,0,18,0);
        dateControls=HealthUi.dateRow(this,calendar,p.label(),p.end.isBefore(LocalDate.now()),()->change(new HealthMetricsData.Period(date,mode).previous().start,mode),()->change(new HealthMetricsData.Period(date,mode).next(),mode),()->HealthUi.pick(this,date,oxygen()?"oxygen":"wrist",d->change(d,mode)));pageRoot.addView(calendar);
        scroll=new ScrollView(this);scroll.setVerticalScrollBarEnabled(false);body=HealthUi.vertical(this);scroll.addView(body);LinearLayout top=HealthUi.vertical(this);HealthUi.padding(top,18,4,18,16);
        loadingView=HealthUi.text(this,"正在读取历史记录…",14,HealthUi.MUTED);top.addView(loadingView);summaryTitle=HealthUi.text(this,"",16,HealthUi.MUTED);top.addView(summaryTitle);summaryValue=HealthUi.value(this,"—",oxygen()?"%":"℃",42);top.addView(summaryValue);body.addView(top);
        View chart;if(oxygen()){oxygenChart=OfficialOxygenChart.create(this,p,Collections.emptyList());chart=oxygenChart;}else{wristChart=OfficialWristChart.create(this,null,p);chart=wristChart;}body.addView(chart,new LinearLayout.LayoutParams(-1,HealthUi.dp(this,260)));
        knowledge=HealthUi.vertical(this);body.addView(knowledge);records=HealthUi.vertical(this);HealthUi.padding(records,18,22,18,24);body.addView(records);pageRoot.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));setContentView(pageRoot);DeviceStyle.insets(this,pageRoot);
    }
    private void build(boolean keep){if(data!=null&&!date.equals(data.window.anchor))return;int y=keep&&scroll!=null?scroll.getScrollY():0;HealthMetricsData.Period p=new HealthMetricsData.Period(date,mode);List<HealthMetricsData.Point> points=points(p);List<HealthMetricsData.Point> oxygenRanges=oxygen()?OxygenChartData.ranges(data,p):Collections.emptyList();
        if(pageRoot==null)createShell(p);
        if(renderedMode!=mode){segmentHost.removeAllViews();HealthUi.segments(this,segmentHost,mode,oxygen()?0:1,m->change(date,m));renderedMode=mode;}
        HealthUi.bindDateRow(dateControls,p.label(),p.end.isBefore(LocalDate.now()));
        HealthMetricsData.Day day=data==null?null:data.find(date);String summary="—";
        if(mode==0){if(oxygen()&&day!=null&&day.oxygenLatest>0)summary=String.valueOf(day.oxygenLatest);else if(!oxygen()&&day!=null&&day.wristBase>0&&day.wristValue>0)summary=OfficialHomeSmallCard.wristValue(day);}
        else if(!points.isEmpty()){float sum=0;for(HealthMetricsData.Point q:points)sum+=q.value;summary=value(sum/points.size());}
        if(oxygen())summary=OxygenChartData.summary(oxygenRanges);
        summaryTitle.setText(oxygen()?"血氧范围":(mode==0?"较个人基准":"平均基准温差"));HealthUi.bindValue(summaryValue,summary,oxygen()?"%":"℃");
        if(oxygen())OfficialOxygenChart.bind(oxygenChart,p,oxygenRanges);else OfficialWristChart.bind(wristChart,data,p);
        knowledge.removeAllViews();DetailKnowledge.add(this,knowledge,kind,data);records.removeAllViews();records.addView(HealthUi.text(this,mode==0?"当天记录":"每日记录",19,HealthUi.TEXT));TextView hint=HealthUi.text(this,oxygen()?(mode==0?"按实际测量时间显示":"每日均值及范围，仅统计有记录的日期"):"相对当天个人基准的温差",13,HealthUi.MUTED);HealthUi.padding(hint,0,12,0,12);records.addView(hint);
        emptyView=null;if(points.isEmpty()){emptyView=HealthUi.text(this,data==null&&loading?"正在读取历史记录…":"暂无记录",17,HealthUi.MUTED);records.addView(emptyView);}
        for(int i=points.size()-1;i>=Math.max(0,points.size()-visible);i--){HealthMetricsData.Point q=points.get(i);String text=q.label+"    "+value(q.value)+(oxygen()?"%":"℃");if(oxygen()&&mode!=0)text+="    "+Math.round(q.low)+"–"+Math.round(q.high)+"%";TextView row=HealthUi.text(this,text,16,HealthUi.TEXT);HealthUi.padding(row,0,16,0,16);if(mode!=0){row.setContentDescription(text+"，查看当天记录");row.setOnClickListener(v->{if(oxygen())change(HealthMetricsData.date(q.time),0);else HealthUi.sheet(this,HealthMetricsData.shortDate(HealthMetricsData.date(q.time)),value(q.value),"℃","较个人基准的温差");});}records.addView(row);}
        if(points.size()>visible){Button more=new Button(this);more.setText("查看更多记录");more.setOnClickListener(v->{visible+=30;build(true);});records.addView(more);}
        if(!oxygen())addRawRecords(records,p);
        status=HealthUi.text(this,"",12,HealthUi.MUTED);status.setVisibility(View.GONE);records.addView(status);updateLoading("");if(!keep)scroll.scrollTo(0,0);else if(y>0){HealthMetricsData rendered=data;scroll.post(()->{if(data==rendered)scroll.scrollTo(0,y);});}
    }
    private void addRawRecords(LinearLayout records,HealthMetricsData.Period period){
        TextView heading=HealthUi.text(this,"原始腕温（℃）",19,HealthUi.TEXT);HealthUi.padding(heading,0,24,0,12);records.addView(heading);
        records.addView(HealthUi.text(this,"实际测量的绝对腕温范围；点击日期查看逐条记录。缺少当天基准时，温差曲线保留为空。",13,HealthUi.MUTED));
        int count=0;if(data!=null)for(HealthMetricsData.Day day:data.days.subMap(period.start,true,period.end,true).descendingMap().values()){
            if(day.wristRawCount<=0)continue;if(count++>=visible)continue;
            String text=HealthMetricsData.shortDate(day.date)+"    "+String.format(Locale.CHINA,"%.2f–%.2f ℃",day.wristRawMin/100f,day.wristRawMax/100f)+"    "+day.wristRawCount+" 条";
            TextView row=HealthUi.text(this,text,16,HealthUi.TEXT);HealthUi.padding(row,0,16,0,16);row.setContentDescription(text+"，查看原始测量");row.setOnClickListener(v->startActivity(new android.content.Intent(this,WristRawDetailActivity.class).putExtra("date",day.date.toString())));records.addView(row);
        }
        if(count==0){TextView empty=HealthUi.text(this,"暂无原始测量",16,HealthUi.MUTED);HealthUi.padding(empty,0,16,0,0);records.addView(empty);}
        if(count>visible){Button more=new Button(this);more.setText("查看更多原始记录");more.setOnClickListener(v->{visible+=30;build(true);});records.addView(more);}
    }
}
