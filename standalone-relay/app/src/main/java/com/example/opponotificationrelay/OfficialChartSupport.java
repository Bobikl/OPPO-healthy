package com.example.opponotificationrelay;
import android.content.Context;
import com.github.mikephil.charting.charts.*;
import com.github.mikephil.charting.components.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.*;
import com.oplus.aiunit.vision.ohb;
import java.time.*;
import java.util.*;
/** Data/label adapters only; original renderers, highlights and gesture listeners remain in use. */
final class OfficialChartSupport {
    interface Label{String text(Entry e,boolean title);}
    static void configure(BarLineChartBase chart,String empty,Label label){
        chart.getAxisRight().setValueFormatter(new ValueFormatter(){@Override public String getAxisLabel(float value,AxisBase axis){return value==Math.round(value)?Integer.toString(Math.round(value)):String.format(java.util.Locale.ROOT,"%.1f",value);}});
        chart.setNoDataText(empty);chart.setNoDataTextColor(0xff999999);chart.getDescription().setEnabled(false);chart.getLegend().setEnabled(false);chart.setDrawMarkers(true);
        CommonMarkerView marker=new CommonMarkerView(chart.getContext(),new ohb(){public String a(Entry e){return label.text(e,false);}public String b(Entry e){return label.text(e,true);}});
        marker.setChartView(chart);chart.setMarker(marker);chart.setContentDescription(empty);
    }
    static ValueFormatter slots(HealthMetricsData.Period p){return new ValueFormatter(){@Override public String getAxisLabel(float x,AxisBase axis){int i=Math.round(x);if(Math.abs(x-i)>.05f)return "";if(p.mode==0)return i<0||i>48?"":Integer.toString(i/2);if(i<0||i>=p.count())return "";LocalDate d=p.at(i);return p.mode==3?(d.getMonthValue()+"月"):p.mode==1?(d.equals(LocalDate.now())?"今天":"周"+new String[]{"一","二","三","四","五","六","日"}[d.getDayOfWeek().getValue()-1]):Integer.toString(d.getDayOfMonth());}};}
    static void range(BarLineChartBase chart,HealthMetricsData.Period p){
        XAxis axis=chart.getXAxis();axis.setAxisMinimum(p.mode==0?0:-.5f);axis.setAxisMaximum(p.mode==0?48:p.count()-.5f);axis.setValueFormatter(slots(p));axis.setGranularity(p.mode==0?12:p.mode==1?1:p.mode==2?5:2);axis.setGranularityEnabled(true);axis.setLabelCount(p.mode==1?7:p.mode==0?5:6,false);chart.notifyDataSetChanged();chart.invalidate();
    }
    static String point(Entry e,int metric,boolean title){Object data=e.getData();if(!(data instanceof HealthMetricsData.Point))return title?"":Integer.toString(Math.round(e.getY()));HealthMetricsData.Point p=(HealthMetricsData.Point)data;if(title)return p.label;String value=metric==HealthMetricsData.HEART&&e instanceof CandleEntry?Math.round(p.low)+"–"+Math.round(p.high):Integer.toString(Math.round(p.value));return value+" "+(metric<=HealthMetricsData.SLEEP_HEART?"次/分":metric==HealthMetricsData.STEPS?"步":metric==HealthMetricsData.CALORIES?"千卡":"分");}
    static List<SleepUnitData> sleep(List<HealthMetricsData.SleepSegment> rows){List<SleepUnitData> result=new ArrayList<>();for(HealthMetricsData.SleepSegment r:rows){SleepUnitData d=new SleepUnitData();d.setTimestamp(r.start);d.setDuration(r.end-r.start);d.setType(r.stage+1);d.setStageSleepEnd(r.last);result.add(d);}return result;}
    static String sleepLabel(Entry e,boolean title){Object value=e.getData();if(!(value instanceof SleepUnitData))return "";SleepUnitData d=(SleepUnitData)value;int type=Math.max(0,Math.min(3,d.getType()-1));return title?SleepTimelineView.NAMES[type]:HealthMetricsData.timeLabel(d.getTimestamp())+"–"+HealthMetricsData.timeLabel(d.getTimestamp()+d.getDuration())+"  "+SleepSummaryChart.duration((int)(d.getDuration()/60000));}
    static void enumOption(Object receiver,String method,String enumType,String name){try{Class<?> type=Class.forName(enumType);receiver.getClass().getMethod(method,type).invoke(receiver,type.getField(name).get(null));}catch(Exception e){throw new IllegalStateException(method,e);}}
}
