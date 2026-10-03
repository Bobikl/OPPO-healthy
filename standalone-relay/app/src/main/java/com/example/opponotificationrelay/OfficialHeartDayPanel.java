package com.example.opponotificationrelay;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.view.*;
import android.widget.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.heytap.health.core.widget.charts.data.*;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer$LinePosition;
import com.heytap.health.heartrate.view.HeartRateDayChart;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.oya;
import java.time.LocalDate;
import java.util.*;
/** Original heart day XML and HeartRateDayView chart configuration; independent data adapter. */
final class OfficialHeartDayPanel extends FrameLayout {
    OfficialHeartDayPanel(Context host,HealthMetricsData data,LocalDate date,boolean line,Runnable expand){
        super(host);Context c=OfficialUiResources.wrap(host);float density=c.getResources().getDisplayMetrics().density;
        View panel=LayoutInflater.from(c).inflate(OfficialUiResources.id(c,"layout","health_heart_rate_day_view_chart"),this,false);
        HeartRateDayChart chart=panel.findViewById(OfficialUiResources.id(c,"id","line_candle_chart"));
        TextView title=panel.findViewById(OfficialUiResources.id(c,"id","tv_heart_rate_title"));
        TextView value=panel.findViewById(OfficialUiResources.id(c,"id","tv_heart_rate_range"));
        TextView unit=panel.findViewById(OfficialUiResources.id(c,"id","tv_heart_rate_unit"));
        TextView empty=panel.findViewById(OfficialUiResources.id(c,"id","tv_no_data"));
        HealthMetricsData.Period period=new HealthMetricsData.Period(date,0);
        List<HealthMetricsData.Point> points=data==null?Collections.emptyList():data.heartPoints(period,line);
        int[] range=data==null?null:data.range(period,HealthMetricsData.HEART);
        boolean has=range!=null&&range[0]>0&&range[1]>0;
        value.setText(has?HealthMetricsData.rangeText(range):"");value.setVisibility(has?VISIBLE:GONE);unit.setVisibility(has?VISIBLE:GONE);empty.setVisibility(has?GONE:VISIBLE);
        ImageView button=panel.findViewById(OfficialUiResources.id(c,"id","iv_full_screen"));button.setImageDrawable(c.getDrawable(OfficialUiResources.id(c,"drawable","health_base_ic_full_screen")));button.setContentDescription("展开心率图表");button.setOnClickListener(v->expand.run());
        chart.setXAxisTimeUnit(TimeUnit.MINUTE);chart.setCandleRadius(2);chart.t();chart.G(3,1440);
        chart.setHighlightPerTapEnabled(true);chart.setHighlightPerDragEnabled(false);chart.setXAxisLabelCount(5);chart.getXAxis().setGranularity(108);
        chart.setXAxisValueFormatter((index,x)->Integer.toString(index*6));
        if(has)chart.N(range[0],range[1]);else chart.setYAxisRightValues(new float[]{40,80,120});
        chart.d(true);chart.p(0,84,34,40);chart.g();
        chart.m(BaseYAxisRenderer$LinePosition.CUSTOM_DP,0);chart.l(BaseYAxisRenderer$LinePosition.CUSTOM_DP,26);
        chart.getAxisRight().setXOffset(12);chart.getXAxis().setYOffset(8);
        chart.getXAxis().setDrawAxisLine(true);chart.getXAxis().setAxisLineWidth(.6f);
        DashPathEffect dash=new DashPathEffect(new float[]{density*3,density*3},0);
        chart.getXAxis().setAxisLineDashedLine(dash);chart.getAxisRight().setAxisLineDashedLine(dash);chart.getAxisRight().setGridDashedLine(dash);chart.getAxisRight().setGridLineWidth(.6f);
        if(chart.getRendererRightYAxis() instanceof BaseYAxisRenderer)((BaseYAxisRenderer)chart.getRendererRightYAxis()).D(true);
        if(chart.getRendererRightYAxis() instanceof nya)((nya)chart.getRendererRightYAxis()).G(true);
        chart.setShowYAxisStartLine(true);chart.getAxisRight().setLabelCount(3,true);
        chart.setForceLabelMultipleOfGranularity(true);chart.setTimeXAxisMinimum(HealthMetricsData.time(date));chart.setTimeXAxisMaximum(HealthMetricsData.time(date.plusDays(1)));chart.setVisibleXRange(1440,1440);
        List<Entry> lines=new ArrayList<>();List<CandleEntry> candles=new ArrayList<>();
        for(HealthMetricsData.Point q:points){float x=q.x*30;lines.add(new Entry(x,q.value,q));candles.add(new HeartRateCandleEntry(x,q.high,q.low,q.high,q.low,q.high,q.low,q));}
        chart.I(lines,candles);chart.K(line,!line);
        OfficialChartSupport.configure(chart,"",(e,isTitle)->OfficialChartSupport.point(e,HealthMetricsData.HEART,isTitle));
        chart.setYAxisValueFormatter((index,y)->String.format(Locale.ROOT,"%.0f",y));
        String description=period.label()+"，心率图，"+points.size()+"个数据点";chart.setContentDescription(description);
        View[] headings={title,value,unit,empty};chart.setOnChartValueSelectedListener(new OnChartValueSelectedListener(){
            public void onValueSelected(Entry e,Highlight h){for(View v:headings)v.setAlpha(0);chart.setContentDescription(description+"，"+OfficialChartSupport.point(e,HealthMetricsData.HEART,true)+"，"+OfficialChartSupport.point(e,HealthMetricsData.HEART,false));}
            public void onNothingSelected(){for(View v:headings)v.setAlpha(1);chart.setContentDescription(description);}
        });
        addView(panel,new FrameLayout.LayoutParams(-1,chart.getLayoutParams().height));
        chart.post(()->{if(chart.getRendererXAxis() instanceof oya)((oya)chart.getRendererXAxis()).e(new float[]{0,chart.getWidth()-34*density});chart.notifyDataSetChanged();chart.b();});
    }
}
