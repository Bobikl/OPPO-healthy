package com.example.opponotificationrelay;

import android.content.Context;
import com.heytap.health.core.widget.charts.BloodOxCandleChart;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.oplus.aiunit.vision.xp0;
import java.util.*;

/** The original blood-oxygen range renderer, with local records and calendar labels. */
final class OfficialOxygenChart {
    static BloodOxCandleChart create(Context context,HealthMetricsData.Period period,List<HealthMetricsData.Point> points) {
        BloodOxCandleChart chart=new BloodOxCandleChart(OfficialUiResources.wrap(context));
        chart.setXAxisTimeUnit(TimeUnit.ORIGINAL);chart.setXAxisMinimum(0);
        chart.setBarWidth(period.mode==0?.6f:period.mode==1?.49122804f:period.mode==2?.5263158f:.5473684f);chart.setRadius(2);
        chart.l(16,12,period.mode==1?44:period.mode==2?36.5f:period.mode==3?40.5f:34,26);
        List<HealthCandleEntry> entries=new ArrayList<>();float low=100;
        for(HealthMetricsData.Point p:points){entries.add(new HealthCandleEntry(p.x,p.low,p.high,p));low=Math.min(low,p.low);}
        chart.setEntryList(entries);chart.setSpo2RangeStr(OxygenChartData.summary(points));
        OfficialChartSupport.configure(chart,"暂无数据",(entry,heading)->{
            HealthMetricsData.Point p=(HealthMetricsData.Point)entry.getData();return heading?p.label:OxygenChartData.label(p.low,p.high)+"%";
        });
        chart.setYAxisValueFormatter(new xp0(){@Override public String a(int index,double value){return Integer.toString((int)Math.round(value));}});
        chart.setYAxisLabel(points.isEmpty()?90:low);
        chart.setXAxisValueFormatter(new xp0(){@Override public String a(int index,double value){
            int x=(int)Math.round(value);if(Math.abs(value-x)>.05)return "";
            if(period.mode==0)return x>=0&&x<=24?String.format(Locale.ROOT,"%02d:00",x):"";
            return OfficialChartSupport.slots(period).getAxisLabel(x,chart.getXAxis());
        }});
        chart.getXAxis().setAxisMinimum(-.5f);
        chart.getXAxis().setAxisMaximum(period.mode==0?24.5f:period.count()-.5f);
        chart.getXAxis().setLabelCount(period.mode==0?5:period.mode==1?7:period.mode==2?6:12,false);
        chart.getXAxis().setGranularity(period.mode==0?6:period.mode==1||period.mode==3?1:5);chart.getXAxis().setGranularityEnabled(true);
        chart.setHighlightPerDragEnabled(false);chart.setHighlightPerTapEnabled(true);chart.setScaleEnabled(false);chart.setDragEnabled(false);
        chart.getAnimator().setPhaseY(1);chart.notifyDataSetChanged();chart.invalidate();
        chart.setContentDescription("血氧范围图，"+points.size()+"个范围条");return chart;
    }
}
