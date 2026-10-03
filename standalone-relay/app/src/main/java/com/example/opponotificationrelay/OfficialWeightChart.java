package com.example.opponotificationrelay;
import android.app.Activity;import android.widget.LinearLayout;import com.heytap.health.bodyfat.ui.*;import com.oplus.aiunit.vision.c93;import androidx.compose.runtime.*;import kotlin.Pair;import kotlin.jvm.functions.*;import java.time.*;import java.util.*;
/** Original weight curve and markers, populated only from locally read measurements. */
final class OfficialWeightChart {
 static String number(float value){return String.format(Locale.CHINA,"%.1f",value);}
 static void add(Activity a,LinearLayout body,HealthMetricsData data,HealthMetricsData.Period p){List<c93> points=new ArrayList<>();if(data!=null)for(HealthMetricsData.Day d:data.days.subMap(p.start,true,p.end,true).values())if(d.weightGrams>0)points.add(new c93(HealthMetricsData.time(d.date),Float.valueOf(d.weightGrams/1000f)));
  long start=HealthMetricsData.time(p.start),end=HealthMetricsData.time(p.end.plusDays(1));Pair range=new Pair(start,end);
  float lo=Float.MAX_VALUE,hi=-Float.MAX_VALUE;for(c93 q:points){lo=Math.min(lo,q.b());hi=Math.max(hi,q.b());}Pair yRange=points.isEmpty()?new Pair(0f,100f):new Pair((float)Math.max(0,Math.floor((lo-hi*.1f)/10)*10),(float)(Math.ceil((hi+hi*.1f)/10)*10));
  ChartDrawableData curve=new ChartDrawableData(4280208845L,2f,p.mode==3?1f:4f,p.mode==3?0f:1f,16777215L,points,0L,yRange,(Function1)v->number((Float)v));
  MutableState marker=SnapshotStateKt.mutableStateOf(-1,SnapshotStateKt.structuralEqualityPolicy());
  if(points.isEmpty()){android.widget.TextView empty=HealthUi.text(a,"暂无数据",16,HealthUi.MUTED);empty.setGravity(android.view.Gravity.CENTER);body.addView(empty,new LinearLayout.LayoutParams(-1,HealthUi.dp(a,60)));}
  OfficialMentalDetails.card(a,body,149801,c->ChartComposeKt.a(260f,null,curve,Collections.emptyList(),Collections.emptyList(),2,22f,35f,false,marker,(Function3)(t,left,right)->Arrays.asList(HealthMetricsData.date((Long)t).toString(),right==null||Float.isNaN((Float)right)?"—":number((Float)right)+" 公斤"),72f,range,end-start,start,p.mode==3?ChartScrollSnapUnit.MONTH:ChartScrollSnapUnit.DAY,43200000L,(Function1)t->{LocalDate d=HealthMetricsData.date((Long)t);return p.mode==3?d.getMonthValue()+"月":Integer.toString(d.getDayOfMonth());},null,null,null,0f,c,0,0,0,0));
  body.getChildAt(body.getChildCount()-1).setContentDescription("体重原生曲线，"+points.size()+"个有效数据点");
 }
}
