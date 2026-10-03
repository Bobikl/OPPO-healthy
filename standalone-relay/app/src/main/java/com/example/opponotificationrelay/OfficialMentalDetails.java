package com.example.opponotificationrelay;
import android.app.Activity;import android.content.Context;import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;import androidx.compose.runtime.Composer;import androidx.compose.runtime.internal.ComposableLambdaKt;import androidx.lifecycle.MutableLiveData;
import com.heytap.health.hrv.ui.item.StressDayDataViewKt;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import kotlin.Unit;import kotlin.jvm.functions.Function2;import java.time.*;import java.util.*;
/** Original Compose detail cards bound exclusively to locally read official measurements. */
final class OfficialMentalDetails {
 static int[] counts(List<HealthMetricsData.Mental> points){int[] result=new int[4];for(HealthMetricsData.Mental q:points)if(q.state>=1&&q.state<=4)result[4-q.state]++;return result;}
 static List<Integer> list(int[] a){List<Integer> r=new ArrayList<>();for(int v:a)r.add(v);return r;}
 static String analysis(Context ui,HealthMetricsData.Day day,LocalDate date){String key="health_hrv_today_status_analyze_no_date";if(day!=null&&day.mentalState>=1&&day.mentalState<=4){int description=8-day.mentalState;ZonedDateTime now=ZonedDateTime.now();if(date.equals(now.toLocalDate())){if(now.getHour()>=22)description=8;else if(now.getHour()<9){long end=day.sleepOut;description=end>0&&System.currentTimeMillis()>=end?(day.mentalState==4?1:day.mentalState==3?2:3):8;}}key="health_hrv_analyze_description_"+description;}return ui.getString(OfficialUiResources.id(ui,"string",key));}
 interface Content {void draw(Composer c);}
 static void card(Activity a,LinearLayout parent,int key,Content content){ComposeView view=new ComposeView(OfficialUiResources.wrap(a));view.setContent(ComposableLambdaKt.composableLambdaInstance(key,true,new Function2(){public Object invoke(Object c,Object flags){content.draw((Composer)c);return Unit.INSTANCE;}}));LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2);lp.setMargins(HealthUi.dp(a,18),HealthUi.dp(a,10),HealthUi.dp(a,18),HealthUi.dp(a,4));parent.addView(view,lp);}
 static void add(Activity a,LinearLayout parent,HealthMetricsData data,LocalDate date){Context ui=OfficialUiResources.wrap(a);HealthMetricsData.Day d=data==null?null:data.find(date),prior=data==null?null:data.find(date.minusDays(1));
  int[] n=counts(data==null?Collections.emptyList():data.mental(date));int total=0;for(int v:n)total+=v;int[] percent=new int[4];for(int i=0;i<4;i++)percent[i]=total==0?0:n[i]*100/total;
  MutableLiveData percentages=new MutableLiveData(list(percent)),counts=new MutableLiveData(list(n));card(a,parent,149501,c->StressDayDataViewKt.n(percentages,counts,c,72,0));
  int delta=d!=null&&prior!=null&&d.mentalAverage>0&&prior.mentalAverage>0?(d.mentalAverage-prior.mentalAverage)*100/prior.mentalAverage:Integer.MAX_VALUE;
  MutableLiveData description=new MutableLiveData(analysis(ui,d,date)),change=new MutableLiveData(delta),rank=new MutableLiveData(-1);card(a,parent,149502,c->StressDayDataViewKt.m(description,change,rank,true,c,584,0));
  PhysicalMentalStat stat=null;if(d!=null&&d.mentalAverage>0){stat=new PhysicalMentalStat();stat.setDate(Integer.parseInt(date.toString().replace("-","")));stat.setAvgStress(d.mentalAverage);stat.setStressState(d.mentalState);stat.setAvgHrv(d.mentalHrv);stat.setAvgSleepHrv(d.mentalSleepHrv);stat.setAvgRestingHeartRate(d.mentalRestHeart);}
  MutableLiveData detail=new MutableLiveData(stat);card(a,parent,149503,c->StressDayDataViewKt.f(ui,detail,true,c,72,0));
 }
 static void addPeriod(Activity a,LinearLayout parent,HealthMetricsData data,HealthMetricsData.Period p){int sum=0,count=0,work=0,wc=0,weekend=0,wec=0,reminders=0;boolean reminderKnown=true;if(data!=null)for(HealthMetricsData.Day d:data.days.subMap(p.start,true,p.end,true).values())if(d.mentalAverage>0){sum+=d.mentalAverage;count++;if(d.date.getDayOfWeek().getValue()>=6){weekend+=d.mentalAverage;wec++;}else{work+=d.mentalAverage;wc++;}if(d.mentalReminders<0)reminderKnown=false;else reminders+=d.mentalReminders;}
  HealthMetricsData.Period before=p.previous();int lastSum=0,lastCount=0,lastNotice=0;if(data!=null)for(HealthMetricsData.Day d:data.days.subMap(before.start,true,before.end,true).values())if(d.mentalAverage>0){lastSum+=d.mentalAverage;lastCount++;if(d.mentalReminders>=0)lastNotice+=d.mentalReminders;}
  int avg=count==0?0:sum/count,last=lastCount==0?0:lastSum/lastCount;HealthMetricsData.Mental best=null,worst=null;if(data!=null)for(HealthMetricsData.Mental q:data.mental.subMap(HealthMetricsData.time(p.start),true,HealthMetricsData.time(p.end.plusDays(1)),false).values()){if(best==null||q.value>=best.value)best=q;if(worst==null||q.value<=worst.value)worst=q;}
  com.oplus.aiunit.vision.o1j max=new com.oplus.aiunit.vision.o1j(best==null?0:best.time,best==null?0:best.value),min=new com.oplus.aiunit.vision.o1j(worst==null?0:worst.time,worst==null?0:worst.value);
  com.oplus.aiunit.vision.a20 model=new com.oplus.aiunit.vision.a20(wc==0?0:work/wc,wec==0?0:weekend/wec,max,min,avg,last==0?Integer.MIN_VALUE:(avg-last)*100/last,last,reminders,lastNotice);MutableLiveData values=new MutableLiveData(model);
  if(p.mode==3||!reminderKnown){card(a,parent,149504,c->com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt.i(values,c,0,0));}else{MutableLiveData cycle=new MutableLiveData();card(a,parent,149505,c->com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt.b(p.mode==1?5:6,values,cycle,null,c,0,8));}
 }

}
