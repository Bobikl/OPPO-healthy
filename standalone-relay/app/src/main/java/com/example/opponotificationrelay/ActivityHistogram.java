package com.example.opponotificationrelay;
import android.content.Context;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.model.GradientColor;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.*;
import java.time.LocalDate;
import java.util.*;
/** Data adapter for the HealthBarChart actually used by the four original daily cards. */
final class ActivityHistogram {
    static void bind(HealthBarChart chart,HealthMetricsData data,LocalDate date,int metric) {
        Context c=chart.getContext();float density=c.getResources().getDisplayMetrics().density;
        String[] colors={"step","calories","exercise_duration","activity_frequency"};
        int color=c.getColor(OfficialUiResources.id(c,"color","health_daily_activity_"+colors[metric]+"_OPlus"));
        boolean hourly=metric==3;long unit=hourly?3600000:1800000;
        chart.setXAxisTimeUnit(hourly?TimeUnit.HOUR:TimeUnit.HALF_AN_HOUR);
        chart.setXAxisValueFormatter((index,value)->Integer.toString((int)(hourly?value:value/2)));
        chart.setXAxisMinimum(0);chart.setXAxisMaximum(hourly?24:48);chart.getXAxis().setLabelCount(5);
        chart.setBarWidth(hourly?.8333333f:.7222222f);chart.setRadius(3);chart.setYAxisMinimum(0);
        chart.setYAxisLabelCount(2);chart.setShowYAxisStartLine(true);chart.setDefaultBatHeightScale(0);
        chart.getAxisRight().setGridColor(c.getColor(OfficialUiResources.id(c,"color","health_daily_grid_line_night")));
        chart.getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{density*3.67f,density*3.67f},hourly?3.67f:0));
        chart.setGridLinePos(new float[]{density*(hourly?20:22),c.getResources().getDisplayMetrics().widthPixels-density*(hourly?48:61)});
        chart.setVibrate(false);chart.setBarColor(color);chart.setBarGradientColor(new GradientColor(color,color));
        if(hourly)chart.setExtraTopOffset(0);
        long start=HealthMetricsData.time(date),end=HealthMetricsData.time(date.plusDays(1));
        List<HealthSingleBarEntry> entries=new ArrayList<>();float peak=0;
        if(data!=null){
            if(hourly){for(Map.Entry<Long,Integer> v:data.moveHours.subMap(start,true,end,false).entrySet()){
                float x=(v.getKey()-start)/(float)unit,value=v.getValue();peak=Math.max(peak,value);
                entries.add(entry(x,value,v.getKey(),color));
            }}else for(Map.Entry<Long,int[]> v:data.activityHalves.subMap(start,true,end,false).entrySet()){
                float value=v.getValue()[metric],x=(v.getKey()-start)/(float)unit;peak=Math.max(peak,value);
                if(value>0)entries.add(entry(x,value,v.getKey(),color));
            }
        }
        chart.setYAxisMaximum(DailyChartScale.maximum(metric,peak));chart.setEntryList(entries);
        String suffix=new String[]{"步","千卡","分钟","次"}[metric];
        OfficialChartSupport.configure(chart,"暂无分时记录",(e,title)->{
            HealthMetricsData.Point p=(HealthMetricsData.Point)e.getData();
            return title?p.label:(metric==1?String.format(Locale.ROOT,"%.1f",p.value/1000):Integer.toString(Math.round(p.value)))+" "+suffix;
        });
        // Restore the original formatter after installing the shared marker adapter.
        chart.getAxisRight().setValueFormatter(new com.github.mikephil.charting.formatter.ValueFormatter(){
            @Override public String getAxisLabel(float value,com.github.mikephil.charting.components.AxisBase axis){
                if(hourly)return "";
                if(metric==1)return String.format(Locale.ROOT,"%.0f",value/1000);
                if(metric==0&&value>=1000){float k=(float)Math.floor(value/10)/100;return k==Math.round(k)?Math.round(k)+"k":Float.toString(k)+"k";}
                return Integer.toString((int)value);
            }
        });
        chart.setContentDescription(new String[]{"步数","消耗","锻炼时长","活动次数"}[metric]+"分时图，"+entries.size()+"个数据点");
        chart.notifyDataSetChanged();chart.invalidate();
    }
    private static HealthSingleBarEntry entry(float x,float value,long time,int color){
        return new HealthSingleBarEntry(x,value,new HealthMetricsData.Point(x,value,value,value,time,HealthMetricsData.timeLabel(time)),color);
    }
}
