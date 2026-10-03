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
    private int kind=OfficialHomeSmallCard.OXYGEN,mode;private LocalDate date=LocalDate.now();private HealthMetricsData data;private TextView status;private ScrollView scroll;private int visible=30;
    boolean oxygen(){return kind==OfficialHomeSmallCard.OXYGEN;}
    private String title(){return oxygen()?"血氧":"手腕温度";}
    @Override public void onUiCreate(Bundle saved){super.onUiCreate(saved);kind=getIntent().getIntExtra("vital",OfficialHomeSmallCard.OXYGEN);if(kind!=OfficialHomeSmallCard.WRIST)kind=OfficialHomeSmallCard.OXYGEN;
        try{date=LocalDate.parse(saved!=null?saved.getString("date"):getIntent().getStringExtra("date"));}catch(Exception ignored){}if(saved!=null)mode=saved.getInt("mode");if(!oxygen()&&mode==0)mode=1;build(false);}
    @Override protected void onUiStart(){super.onUiStart();HealthDataManager.get(this).add(this);request();}
    @Override protected void onUiStop(){HealthDataManager.get(this).remove(this);data=null;super.onUiStop();}
    @Override protected void onUiSaveInstanceState(Bundle saved){saved.putString("date",date.toString());saved.putInt("mode",mode);super.onUiSaveInstanceState(saved);}
    private void request(){HealthDataManager.get(this).request(new HealthMetricsData.Period(date,mode),date,false);if(oxygen()&&mode==0)HealthDataManager.get(this).request(date,true,false);}
    private void change(LocalDate day,int selectedMode){if(day.isBefore(LocalDate.of(2019,1,1)))return;date=day.isAfter(LocalDate.now())?LocalDate.now():day;mode=oxygen()?selectedMode:Math.max(1,selectedMode);visible=30;build(false);request();}
    @Override public void changed(HealthMetricsData value,String message,boolean busy){if(data!=value){data=value;build(true);}status.setText(message);status.setVisibility(message.isEmpty()?View.GONE:View.VISIBLE);}
    private List<HealthMetricsData.Point> points(HealthMetricsData.Period p){List<HealthMetricsData.Point> out=new ArrayList<>();if(data==null)return out;
        if(oxygen()&&mode==0){long start=HealthMetricsData.time(date),end=HealthMetricsData.time(date.plusDays(1));for(Map.Entry<Long,Integer> e:data.oxygen.subMap(start,true,end,false).entrySet())out.add(new HealthMetricsData.Point((e.getKey()-start)/1800000f,e.getValue(),e.getValue(),e.getValue(),e.getKey(),HealthMetricsData.timeLabel(e.getKey())));return out;}
        for(HealthMetricsData.Day d:data.days.subMap(p.start,true,p.end,true).values()){
            if(oxygen()?d.oxygenCount<=0:d.wristBase<=0||d.wristValue<=0)continue;
            float value=oxygen()?d.oxygenMean:OfficialWristChart.value(d);
            float x=mode==0?24:mode==3?d.date.getMonthValue()-1+(d.date.getDayOfMonth()-1)/(float)d.date.lengthOfMonth():ChronoUnit.DAYS.between(p.start,d.date);
            out.add(new HealthMetricsData.Point(x,oxygen()?d.oxygenMin:value,oxygen()?d.oxygenMax:value,value,HealthMetricsData.time(d.date),HealthMetricsData.shortDate(d.date)));
        }return out;
    }
    private String value(float v){if(oxygen())return String.valueOf(Math.round(v));v=Math.round(v*10)/10f;return String.format(Locale.CHINA,v>0?"+%.1f":"%.1f",v==0?0:v);}
    private void build(boolean keep){int y=keep&&scroll!=null?scroll.getScrollY():0;HealthMetricsData.Period p=new HealthMetricsData.Period(date,mode);List<HealthMetricsData.Point> points=points(p);List<HealthMetricsData.Point> oxygenRanges=oxygen()?OxygenChartData.ranges(data,p):Collections.emptyList();
        LinearLayout root=HealthUi.vertical(this);root.setBackgroundColor(0xff1a1a1a);HealthUi.header(this,root,title(),null);HealthUi.segments(this,root,mode,oxygen()?0:1,m->change(date,m));LinearLayout calendar=HealthUi.vertical(this);HealthUi.padding(calendar,18,0,18,0);HealthUi.dateRow(this,calendar,p.label(),p.end.isBefore(LocalDate.now()),()->change(p.previous().start,mode),()->change(p.next(),mode),()->HealthUi.pick(this,date,d->change(d,mode)));root.addView(calendar);
        scroll=new ScrollView(this);scroll.setVerticalScrollBarEnabled(false);LinearLayout body=HealthUi.vertical(this);scroll.addView(body);LinearLayout top=HealthUi.vertical(this);HealthUi.padding(top,18,4,18,16);
        HealthMetricsData.Day day=data==null?null:data.find(date);String summary="—";
        if(mode==0){if(oxygen()&&day!=null&&day.oxygenLatest>0)summary=String.valueOf(day.oxygenLatest);else if(!oxygen()&&day!=null&&day.wristBase>0&&day.wristValue>0)summary=OfficialHomeSmallCard.wristValue(day);}
        else if(!points.isEmpty()){float sum=0;for(HealthMetricsData.Point q:points)sum+=q.value;summary=value(sum/points.size());}
        if(oxygen())summary=OxygenChartData.summary(oxygenRanges);
        top.addView(HealthUi.text(this,oxygen()?"血氧范围":(mode==0?"较个人基准":"平均基准温差"),16,HealthUi.MUTED));top.addView(HealthUi.value(this,summary,oxygen()?"%":"℃",42));body.addView(top);
        if(oxygen())body.addView(OfficialOxygenChart.create(this,p,oxygenRanges),new LinearLayout.LayoutParams(-1,HealthUi.dp(this,260)));
        else body.addView(OfficialWristChart.create(this,data,p),new LinearLayout.LayoutParams(-1,HealthUi.dp(this,260)));
        DetailKnowledge.add(this,body,kind,data);LinearLayout records=HealthUi.vertical(this);HealthUi.padding(records,18,22,18,24);records.addView(HealthUi.text(this,mode==0?"当天记录":"每日记录",19,HealthUi.TEXT));TextView hint=HealthUi.text(this,oxygen()?(mode==0?"按实际测量时间显示":"每日均值及范围，仅统计有记录的日期"):"相对当天个人基准的温差",13,HealthUi.MUTED);HealthUi.padding(hint,0,12,0,12);records.addView(hint);
        if(points.isEmpty())records.addView(HealthUi.text(this,"暂无记录",17,HealthUi.MUTED));
        for(int i=points.size()-1;i>=Math.max(0,points.size()-visible);i--){HealthMetricsData.Point q=points.get(i);String text=q.label+"    "+value(q.value)+(oxygen()?"%":"℃");if(oxygen()&&mode!=0)text+="    "+Math.round(q.low)+"–"+Math.round(q.high)+"%";TextView row=HealthUi.text(this,text,16,HealthUi.TEXT);HealthUi.padding(row,0,16,0,16);if(mode!=0){row.setContentDescription(text+"，查看当天记录");row.setOnClickListener(v->{if(oxygen())change(HealthMetricsData.date(q.time),0);else HealthUi.sheet(this,HealthMetricsData.shortDate(HealthMetricsData.date(q.time)),value(q.value),"℃","较个人基准的温差");});}records.addView(row);}
        if(points.size()>visible){Button more=new Button(this);more.setText("查看更多记录");more.setOnClickListener(v->{visible+=30;build(true);});records.addView(more);}
        status=HealthUi.text(this,"",12,HealthUi.MUTED);status.setVisibility(View.GONE);records.addView(status);body.addView(records);root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);if(y>0)scroll.post(()->scroll.scrollTo(0,y));
    }
}
