package com.example.opponotificationrelay;
import android.content.Context;
import com.heytap.health.hrv.ui.chart.BaseChart;
import com.heytap.health.hrv.constant.HrvConstant;
import com.heytap.health.core.widget.charts.data.*;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.time.LocalDate;
import java.util.*;
final class WellnessUi {
    static String mentalState(int state){return com.oplus.aiunit.vision.ti9.a(state);}
    static String relaxName(Context c,int type,int subtype){String name=type==1?"health_relax_subtype_breath":type==2?"health_relax_subtype_meditation":null;if(name==null)return "放松";String[] labels=c.getResources().getStringArray(OfficialUiResources.id(c,"array",name));return subtype>=1&&subtype<=labels.length?labels[subtype-1]:"放松";}
    static void mental(BaseChart chart,HealthMetricsData data,LocalDate day,boolean compact){
        chart.setDrawZeroGridLine(false);chart.setExtraSpace(15);chart.setXAxisTimeUnit(TimeUnit.MINUTE);chart.setChartType(0);chart.setLineStrokeWidth(compact?4:6);chart.setCircleStrokeRadius(compact?1.5f:2);chart.setCircleStrokeHoleRadius(compact?2:3);chart.getXAxis().setDrawGridLines(false);chart.getAxisRight().setDrawGridLines(false);chart.getAxisLeft().setEnabled(false);
        chart.setExtraTopOffset(compact?0:20);chart.getXAxis().setEnabled(!compact);chart.getAxisRight().setEnabled(!compact);chart.getXAxis().setLabelCount(5);chart.setTouchEnabled(!compact);if(compact)chart.setOnTouchListener((ChartTouchListener)null);
        long start=HealthMetricsData.time(day),end=HealthMetricsData.time(day.plusDays(1));chart.setTimeXAxisMinimum(start);chart.setTimeXAxisMaximum(end);chart.setChartBackgroundRadius(2);chart.d(true);if(compact)chart.p(1,1,1,1);else {chart.p(16,12,34,26);chart.setXAxisValueFormatter((i,v)->HealthMetricsData.timeLabel((long)(v*60000)));chart.setYAxisValueFormatter((i,v)->String.valueOf(Math.round(v)));}
        List<ILineDataSet> sets=new ArrayList<>();List<TimeStampedData> segment=new ArrayList<>();long previous=0;
        if(data!=null)for(HealthMetricsData.Mental point:data.mental(day)){
            // Split missing half-hour samples into separate native line datasets; never add zero readings.
            if(previous>0&&point.time-previous>1800000L&&!segment.isEmpty()){sets.add(chart.u(segment));segment=new ArrayList<>();}
            TimeStampedData entry=new TimeStampedData();entry.setTimestamp(point.time);entry.setY(point.value);entry.setHeartRateType(point.state);segment.add(entry);previous=point.time;
        }
        if(!segment.isEmpty())sets.add(chart.u(segment));
        if(sets.isEmpty()){chart.clear();chart.setNoDataText("暂无记录");chart.setNoDataTextColor(0xff999999);}else {CombinedData combined=new CombinedData();combined.setData(new LineData(sets));chart.setData(combined);}
        chart.setBaseLines(HrvConstant.INSTANCE.a());chart.invalidate();
    }
}
