package com.example.opponotificationrelay;
import android.content.Context;
import android.widget.FrameLayout;
import com.github.mikephil.charting.charts.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.heytap.health.core.widget.charts.*;
import com.heytap.health.core.widget.charts.data.*;
import com.heytap.health.heartrate.view.HeartRateDayChart;
import com.heytap.health.step.detail.view.StepCustBarChart;
import java.util.*;
/** Hosts complete original health charts and maps the independent cache to their datasets. */
final class HealthChartView extends FrameLayout {
    interface Selection{void selected(HealthMetricsData.Point point);}Selection selection;
    HealthChartView(Context c){super(c);}
    void bind(HealthMetricsData data,HealthMetricsData.Period p,int metric,boolean line,boolean comparison){
        removeAllViews();Context c=OfficialUiResources.wrap(getContext());List<HealthMetricsData.Point> points=data==null?Collections.emptyList():metric==HealthMetricsData.HEART?data.heartPoints(p,line):data.metricPoints(p,metric);
        BarLineChartBase chart;int color=metric==HealthMetricsData.STEPS?HealthMetricsData.GREEN:metric==HealthMetricsData.CALORIES?HealthMetricsData.ORANGE:metric==HealthMetricsData.SLEEP_SCORE?HealthMetricsData.PURPLE:HealthMetricsData.RED;
        if(metric==HealthMetricsData.HEART){
            HeartRateDayChart heart=new HeartRateDayChart(c);heart.setXAxisTimeUnit(TimeUnit.ORIGINAL);heart.F=0;heart.K(line,!line);List<Entry> lines=new ArrayList<>();List<CandleEntry> candles=new ArrayList<>();int min=300,max=0;
            for(HealthMetricsData.Point q:points){lines.add(new Entry(q.x,q.value,q));candles.add(new HeartRateCandleEntry(q.x,q.high,q.low,q.high,q.low,q.high,q.low,q));min=Math.min(min,(int)q.low);max=Math.max(max,(int)q.high);}
            if(!points.isEmpty()){heart.I(lines,candles);heart.N(min,max);}else heart.clear();if(p.mode==0){heart.G(3,48);heart.setCandleRadius(2);}else heart.setBarWidth(p.mode==1?.35f:.45f);chart=heart;
        }else if(metric==HealthMetricsData.STEPS||metric==HealthMetricsData.CALORIES){
            HealthTimeXBarChart bars=new StepCustBarChart(c);bars.setXAxisTimeUnit(TimeUnit.ORIGINAL);bars.setXStart(0);bars.setBarColor(color);bars.setBarWidth(p.mode==0?1:.5f);List<HealthSingleBarEntry> entries=new ArrayList<>();for(HealthMetricsData.Point q:points)entries.add(new HealthSingleBarEntry(q.x,q.value,q,color));bars.setEntryList(entries);chart=bars;
        }else{
            HealthTimeXLineChart graph=new HealthTimeXLineChart(c);graph.setXAxisTimeUnit(TimeUnit.ORIGINAL);graph.setxStart(0);graph.setLineColor(color);List<Entry> entries=new ArrayList<>();for(HealthMetricsData.Point q:points)entries.add(new Entry(q.x,q.value,q));graph.setEntryList(entries);
            if(comparison&&data!=null){
                LineData values=(LineData)graph.getData();if(values==null){values=new LineData();graph.setData(values);}List<Entry> before=new ArrayList<>();for(HealthMetricsData.Point q:data.metricPoints(p.previous(),metric))before.add(new Entry(q.x,q.value,q));if(!before.isEmpty()){LineDataSet previous=new LineDataSet(before,"上一时段");previous.setColor(0xffb9b9b9);previous.setDrawValues(false);previous.setDrawCircles(false);previous.setLineWidth(1.5f);OfficialChartSupport.enumOption(previous,"setAxisDependency","com.github.mikephil.charting.components.YAxis$AxisDependency","RIGHT");values.addDataSet(previous);graph.notifyDataSetChanged();}
            }chart=graph;
        }
        OfficialChartSupport.configure(chart,"暂无数据",(entry,title)->OfficialChartSupport.point(entry,metric,title));OfficialChartSupport.range(chart,p);
        String description=p.label()+"，"+(metric==HealthMetricsData.HEART?"心率图":"统计图")+"，"+points.size()+"个数据点";chart.setContentDescription(description);setContentDescription(description);
        chart.setOnChartValueSelectedListener(new OnChartValueSelectedListener(){public void onValueSelected(Entry e,Highlight h){chart.setContentDescription(description+"，"+OfficialChartSupport.point(e,metric,true)+"，"+OfficialChartSupport.point(e,metric,false));if(selection!=null&&e.getData() instanceof HealthMetricsData.Point)selection.selected((HealthMetricsData.Point)e.getData());}public void onNothingSelected(){chart.setContentDescription(description);}});
        addView(chart,new FrameLayout.LayoutParams(-1,-1));
    }
}
