package com.example.opponotificationrelay;
import android.content.Context;
import android.widget.FrameLayout;
import com.github.mikephil.charting.data.*;
import com.heytap.health.core.widget.charts.data.*;
import com.heytap.health.sleep.view.SleepCustBarChart;
import java.time.*;
import java.util.*;
/** Original sleep history chart; time/unit conversion stays in this data adapter. */
final class SleepSummaryChart extends FrameLayout {
    static final int[] COLORS={0xff554bcc,0xff9188fa,0xff80caff,0xffffc400};
    SleepSummaryChart(Context c){super(c);}
    void bind(HealthMetricsData data,HealthMetricsData.Period p){removeAllViews();Context c=OfficialUiResources.wrap(getContext());SleepCustBarChart chart=new SleepCustBarChart(c);OfficialChartSupport.enumOption(chart,"setStyle","com.heytap.health.core.widget.charts.SleepBarChart$Style",p.mode==3?"YEAR":p.mode==2?"MONTH":"WEEK");chart.setXAxisTimeUnit(TimeUnit.ORIGINAL);chart.setXStart(0);chart.setBarWidth(p.mode==2?.55f:.5f);
        List<BarEntry> entries=new ArrayList<>();int max=0;int count=p.mode==0?1:p.count();for(int i=0;i<count;i++){LocalDate first=p.at(i),last=p.mode==3?first.plusMonths(1).minusDays(1):first;int[] v=values(data,first,last);if(v[4]<=0)continue;if(v[0]+v[1]+v[2]==0){continue;}SleepBarData row=new SleepBarData(HealthMetricsData.time(first),v[0]*60000L,v[1]*60000L,v[2]*60000L,v[3]*60000L);entries.add(new BarEntry(i,new float[]{v[0]/60f,v[1]/60f,v[2]/60f,v[3]/60f},row));max=Math.max(max,v[4]+v[3]);}
        chart.setSleepEntryData(entries);chart.S(max*60000f);chart.getAnimator().setPhaseY(1);
        OfficialChartSupport.configure(chart,"暂无睡眠记录",(e,title)->{SleepBarData d=(SleepBarData)e.getData();return title?HealthMetricsData.shortDate(HealthMetricsData.date(d.getTimestamp())):duration((int)(d.getShowMaxY()/60000));});OfficialChartSupport.range(chart,p);if(p.mode==0){chart.getXAxis().setAxisMinimum(-.5f);chart.getXAxis().setAxisMaximum(.5f);}chart.setContentDescription(p.label()+"，睡眠阶段统计图，"+entries.size()+"个数据点");addView(chart,new FrameLayout.LayoutParams(-1,-1));
    }
    static int[] values(HealthMetricsData data,LocalDate first,LocalDate last){long[] totals=new long[5];int count=0;if(data!=null)for(HealthMetricsData.Day d:data.days.subMap(first,true,last,true).values())if(d.sleepMinutes>0){totals[0]+=d.deep;totals[1]+=d.light;totals[2]+=d.rem;totals[3]+=d.awake;totals[4]+=d.sleepMinutes;count++;}int[] out=new int[5];for(int i=0;i<5;i++)out[i]=count==0?0:(int)(totals[i]/count);if(out[0]+out[1]+out[2]>0)out[4]=out[0]+out[1]+out[2];return out;}
    static String duration(int minutes){return minutes>0?(minutes/60>0?minutes/60+"小时":"")+(minutes%60>0?(minutes%60)+"分钟":""):"—";}
}
