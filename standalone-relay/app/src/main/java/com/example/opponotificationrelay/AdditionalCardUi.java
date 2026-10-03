package com.example.opponotificationrelay;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.runtime.*;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.heytap.health.main.view.BodyFatLineChartViewKt;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.data.*;
import com.heytap.health.healthbase.view.HealthProgressBarView3;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.oplus.aiunit.vision.c1f;
import kotlin.Unit;import kotlin.jvm.functions.Function2;
import java.time.*;import java.util.*;
final class AdditionalCardUi {
 static String apnea(Context c,int level){return c.getString(OfficialUiResources.id(c,"string",level==0?"health_sleep_normal":level==1?"health_sleep_apnea_level_low":level==2?"health_sleep_apnea_level_medium":level==3?"health_sleep_apnea_level_high":"health_sleep_no_assessment"));}
 static int color(Context c,String name){return c.getColor(OfficialUiResources.id(c,"color",name));}
 static void apneaBar(Context c,HealthProgressBarView3 bar,int level){String[] colors={"normal","low","medium","high"};List<c1f> values=new ArrayList<>();for(int i=0;i<4;i++)values.add(new c1f(i*10+1,(i+1)*10,color(c,"health_sleep_snore_level_"+colors[i]),"",""));bar.setIntervalPx(0);bar.setCursorColor(color(c,"lib_base_colorBlack"));OfficialChartSupport.enumOption(bar,"setCurSorType","com.heytap.health.healthbase.view.HealthProgressBarView3$CurSorType","CENTER");bar.setDrawCursor(level>=0&&level<=3);bar.setData(values,level>=0&&level<=3?level*10+5:-1);bar.animateY();}
 static void weight(Context c,ComposeView chart,HealthMetricsData data,long measured){LocalDate end=HealthMetricsData.date(measured);List<Float> points=new ArrayList<>();for(int i=6;i>=0;i--){LocalDate day=end.minusDays(i);Map.Entry<Long,Integer> e=data.weights.floorEntry(HealthMetricsData.time(day.plusDays(1))-1);points.add(e!=null&&e.getKey()>=HealthMetricsData.time(day)?e.getValue()/1000f:0f);}MutableState animation=SnapshotStateKt.mutableStateOf(Boolean.TRUE,SnapshotStateKt.structuralEqualityPolicy());
  chart.setContent(ComposableLambdaKt.composableLambdaInstance(146008,true,new Function2(){public Object invoke(Object value,Object flags){Composer composer=(Composer)value;long background=ColorResources_androidKt.colorResource(OfficialUiResources.id(c,"color","lib_ui_black_4"),composer,0);BodyFatLineChartViewKt.a(points,36,background,background,0L,0L,3,0,0L,2,2,0,animation,composer,806879288,6,2480);return Unit.INSTANCE;}}));
 }
 static void glucose(GluCombineChart chart,HealthMetricsData data,LocalDate day,boolean compact){HealthMetricsData.Day d=data==null?null:data.find(day);float low=d==null?3.9f:d.glucoseLow/1000f,high=d==null?7.8f:d.glucoseHigh/1000f;chart.setXAxisTimeUnit(TimeUnit.MINUTE);chart.setTimeXAxisMinimum(HealthMetricsData.time(day));chart.setTimeXAxisMaximum(HealthMetricsData.time(day.plusDays(1)));chart.setLineStrokeWidth(1.5f);chart.I(high,low);chart.D(true,false);chart.setMaskColor(color(chart.getContext(),"health_chart_blood_sugar_normal_bg_color"));chart.d(true);chart.p(compact?0:16,compact?0:12,compact?0:34,compact?0:26);chart.getXAxis().setDrawGridLines(false);chart.getAxisRight().setDrawGridLines(false);chart.getXAxis().setDrawLabels(!compact);chart.getAxisRight().setDrawLabels(!compact);chart.getXAxis().setDrawAxisLine(false);chart.setXAxisValueFormatter((i,v)->compact?"":HealthMetricsData.timeLabel((long)(v*60000)));chart.setYAxisValueFormatter((i,v)->compact?"":String.format(Locale.CHINA,"%.1f",v));if(compact){chart.setOnTouchListener((ChartTouchListener)null);chart.setTouchEnabled(false);chart.setMarker(null);}List<TimeStampedData> points=new ArrayList<>();float max=Math.max(10,high+2);long previous=0;if(data!=null)for(HealthMetricsData.Glucose p:data.glucose(day)){TimeStampedData entry=new TimeStampedData(p.time,p.milli/1000f);entry.setDisconnect(previous>0&&p.time-previous>20*60000L);points.add(entry);previous=p.time;max=Math.max(max,p.milli/1000f+2);}chart.getAxisRight().setAxisMinimum(0);chart.getAxisRight().setAxisMaximum(max);chart.setYAxisRightValues(new float[]{0,max});if(points.isEmpty()){chart.clear();chart.setNoDataText("暂无记录");}else chart.E(points,new ArrayList());chart.invalidate();}
}
