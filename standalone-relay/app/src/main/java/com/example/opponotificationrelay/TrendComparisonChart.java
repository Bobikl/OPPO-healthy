package com.example.opponotificationrelay;
import android.content.Context;
import android.widget.FrameLayout;
import android.graphics.drawable.GradientDrawable;
import com.heytap.health.core.widget.charts.customChart.*;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/** Original official trend renderers with date-aligned local data adapters. */
final class TrendComparisonChart extends FrameLayout {
    TrendComparisonChart(Context c){super(c);setImportantForAccessibility(IMPORTANT_FOR_ACCESSIBILITY_YES);}
    @Override protected void onMeasure(int w,int h){super.onMeasure(w,MeasureSpec.makeMeasureSpec(DeviceStyle.dp(getContext(),170),MeasureSpec.EXACTLY));}
    void bind(HealthMetricsData.Trend t){
        removeAllViews();Context c=OfficialUiResources.wrap(getContext());int old=0xff999999,color=t.color();
        String left=HealthMetricsData.rangeLabel(t.beforeStart,t.beforeEnd),right=HealthMetricsData.rangeLabel(t.start,t.end);
        int[] previous=values(t.previous,t.beforeStart,t.beforeEnd),current=values(t.current,t.start,t.end);
        if(t.metric==HealthMetricsData.SLEEP_SCORE){
            WeekTrendLineChart view=new WeekTrendLineChart(c);
            List<WeekTrendLineChart$e> a=new ArrayList<>(),b=new ArrayList<>();
            for(int value:previous)a.add(new WeekTrendLineChart$e(value,Collections.singletonList(t.before),old,Collections.singletonList(old)));
            for(int value:current)b.add(new WeekTrendLineChart$e(value,Collections.singletonList(t.after),color,Collections.singletonList(color)));
            List<WeekTrendLineChart$c> labels=new ArrayList<>();labels.add(new WeekTrendLineChart$c(t.averageLabel(),t.before,t.before+"分",old));labels.add(new WeekTrendLineChart$c(t.averageLabel(),t.after,t.after+"分",color));
            view.setFillLeftDrawable(fill(old));view.setFillRightDrawable(fill(color));
            view.refreshData(new WeekTrendLineChart$f(new WeekTrendLineChart$d(left,old,a),new WeekTrendLineChart$d(right,color,b),labels),true);view.setPhaseY(1);addView(view,new LayoutParams(-1,-1));
        }else{
            WeekTrentChart view=new WeekTrentChart(c);List<WeekTrentChart$e> a=new ArrayList<>(),b=new ArrayList<>();
            for(int value:previous)a.add(new WeekTrentChart$e(value,Collections.singletonList(t.before),old,Collections.singletonList(old)));
            for(int value:current)b.add(new WeekTrentChart$e(value,Collections.singletonList(t.after),color,Collections.singletonList(color)));
            List<WeekTrentChart$c> labels=new ArrayList<>();labels.add(new WeekTrentChart$c(t.averageLabel(),t.before,String.valueOf(t.before),old));labels.add(new WeekTrentChart$c(t.averageLabel(),t.after,String.valueOf(t.after),color));
            view.refreshData(new WeekTrentChart$f(new WeekTrentChart$d(left,old,a),new WeekTrentChart$d(right,color,b),labels),true);view.setPhaseY(1);addView(view,new LayoutParams(-1,-1));
        }
        setContentDescription(t.title()+"，"+left+" 日均 "+t.before+t.unit()+"，"+right+" 日均 "+t.after+t.unit());
    }
    private static GradientDrawable fill(int c){return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,new int[]{(c&0xffffff)|0x38000000,c&0xffffff});}
    private static int[] values(List<HealthMetricsData.Point> rows,LocalDate start,LocalDate end){int[] values=new int[(int)ChronoUnit.DAYS.between(start,end)+1];for(HealthMetricsData.Point p:rows){int i=(int)p.x;if(i>=0&&i<values.length)values[i]=Math.round(p.value);}return values;}
}
