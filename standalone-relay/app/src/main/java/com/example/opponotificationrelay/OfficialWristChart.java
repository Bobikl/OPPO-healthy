package com.example.opponotificationrelay;
import android.content.Context;
import com.heytap.health.wrist_temperature.view.WristTemperatureChart;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.time.*;import java.util.*;import java.math.*;
/** The original wrist renderer, including its missing-value sentinel and baseline colors. */
final class OfficialWristChart {
 static float value(HealthMetricsData.Day d){if(d==null||d.wristBase<=0||d.wristValue<=0)return Float.NaN;return Math.max(-8,Math.min(8,new BigDecimal(Integer.toString(d.wristValue-d.wristBase)).divide(new BigDecimal(100),1,RoundingMode.HALF_UP).floatValue()));}
 static WristTemperatureChart create(Context context,HealthMetricsData data,HealthMetricsData.Period p){
  Context ui=OfficialUiResources.wrap(context);WristTemperatureChart chart=new WristTemperatureChart(ui,null);chart.setChartType(1);chart.setDrawZeroGridLine(true);chart.setExtraSpace(.5f);chart.setIfIntercept(true);chart.setIfDrawMask(true);chart.p(16,12,35,26);
  chart.setXAxisTimeUnit(p.mode==3?TimeUnit.ORIGINAL:TimeUnit.DAY);chart.setTimeXAxisMinimum(p.mode==3?0:HealthMetricsData.time(p.start));chart.setTimeXAxisMaximum(p.mode==3?11:HealthMetricsData.time(p.end));chart.getXAxis().setLabelCount(p.mode==1?7:p.mode==3?6:5);
  chart.setXAxisValueFormatter((i,v)->p.mode==3?((int)Math.round(v)+1)+"月":Integer.toString(HealthMetricsData.date((long)(v*86400000L)).getDayOfMonth()));chart.setYAxisValueFormatter((i,v)->String.format(Locale.CHINA,"%.1f",v));
  List<TimeStampedData> entries=new ArrayList<>();float maximum=2;int valid=0;
  for(int i=0;i<p.count();i++){LocalDate a=p.at(i),b=p.mode==3?a.plusMonths(1).minusDays(1):a;float sum=0;int count=0;if(data!=null)for(HealthMetricsData.Day d:data.days.subMap(a,true,b,true).values()){float v=value(d);if(!Float.isNaN(v)){sum+=v;count++;}}
   float v=count==0?-10000:sum/count;if(count>0){valid++;maximum=Math.max(maximum,(float)Math.ceil(Math.abs(v)/2)*2);}entries.add(new TimeStampedData(p.mode==3?i:HealthMetricsData.time(a),v));
  }
  chart.setYAxisRightValues(new float[]{-maximum-.05f,0,maximum+.05f});
  if(valid==0){chart.clear();chart.setNoDataText("暂无数据");chart.setNoDataTextColor(0xff999999);}else chart.setEntryData(entries);
  OfficialChartSupport.configure(chart,"暂无数据",(entry,heading)->{TimeStampedData q=(TimeStampedData)entry.getData();return heading?(p.mode==3?(q.getTimestamp()+1)+"月":HealthMetricsData.shortDate(HealthMetricsData.date(q.getTimestamp()))):q.getY()<=-10000?"暂无数据":String.format(Locale.CHINA,"%+.1f℃",q.getY());});
  chart.setContentDescription("手腕温度多日曲线，"+valid+"个有效数据点");chart.invalidate();return chart;
 }
}
