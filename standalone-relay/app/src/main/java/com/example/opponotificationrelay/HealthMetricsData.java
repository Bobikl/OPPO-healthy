package com.example.opponotificationrelay;

import java.time.*;
import java.time.temporal.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/** Values and calendar calculations shared by cards and detail screens. Missing values stay missing. */
final class HealthMetricsData {
    static final int HEART=0,REST=1,WALK=2,SLEEP_HEART=3,STEPS=4,CALORIES=5,SLEEP_SCORE=6;
    static final int RED=0xfff43b3b,PINK=0xffff0067,GREEN=0xff00c853,ORANGE=0xffff5722,PURPLE=0xff7965ff;
    static ZoneId zone(){return ZoneId.systemDefault();}
    final List<Knowledge> knowledge=new ArrayList<>();
    static final class Knowledge {String page,card,title,description,url;long start,end;}
    final TreeMap<LocalDate,Day> days=new TreeMap<>();final TreeMap<Long,Bin> bins=new TreeMap<>();
    final TreeMap<Long,int[]> activityHours=new TreeMap<>(),activityHalves=new TreeMap<>();
    final TreeMap<Long,Integer> moveHours=new TreeMap<>();
    final TreeMap<LocalDate,List<SleepSegment>> sleepSegments=new TreeMap<>();
    static final class SleepSegment {final long start,end;final int stage;final boolean last;
        SleepSegment(long start,long end,int raw,boolean last){this.start=start;this.end=end;stage=raw==2?0:raw==4?1:raw==3?2:3;this.last=last;}}
    List<SleepSegment> sleep(LocalDate date){List<SleepSegment> s=sleepSegments.get(date);return s==null?Collections.emptyList():s;}
    final TreeMap<Long,Integer> weights=new TreeMap<>();final TreeMap<Long,Glucose> glucose=new TreeMap<>();
    static final class Glucose {final long time;final int milli,trend;Glucose(long time,int milli,int trend){this.time=time;this.milli=milli;this.trend=trend;}}
    List<Glucose> glucose(LocalDate day){return new ArrayList<>(glucose.subMap(time(day),true,time(day.plusDays(1)),false).values());}
    final TreeMap<Long,Mental> mental=new TreeMap<>();final TreeMap<Long,Relax> relax=new TreeMap<>();
    static final class Mental {final long time;final int value,state,type,hrv;Mental(long time,int value,int state,int type,int hrv){this.time=time;this.value=value;this.state=state;this.type=type;this.hrv=hrv;}}
    static final class Relax {final long time;final int seconds,type,subtype;int minHeart,maxHeart,mental,stress;Relax(long time,int seconds,int type,int subtype){this.time=time;this.seconds=seconds;this.type=type;this.subtype=subtype;}}
    List<Mental> mental(LocalDate day){return new ArrayList<>(mental.subMap(time(day),true,time(day.plusDays(1)),false).values());}
    List<Relax> relax(LocalDate day){return new ArrayList<>(relax.subMap(time(day),true,time(day.plusDays(1)),false).values());}
    final TreeMap<Long,Integer> raw=new TreeMap<>(),oxygen=new TreeMap<>();final List<Warning> warnings=new LinkedList<>();
    HealthSnapshotWindow window;
    long loadedAt,officialAt;String device="";boolean officialLoaded;
    static final class Day {
        final LocalDate date;int min,max,rest,walk,sleepHeart,sleepScore,sleepMinutes,deep,light,rem,awake,steps=-1,calories=-1;long latestTime;int latest;
        int oxygenMin,oxygenMax,oxygenMean,oxygenLatest,oxygenCount;long oxygenTime;
        int weightGrams,glucoseMin,glucoseMax,glucoseMean,glucoseLatest,glucoseTrend,glucoseLow=3900,glucoseHigh=7800,apneaLevel=-2,apneaAhi=-1,apneaVersion;long weightTime,glucoseTime;
        Mental mentalMin,mentalMax;int warningCount;
        int mentalSleepHrv,mentalRestHeart,mentalReminders=-1;
        int mentalAverage,mentalState,mentalHrv,mentalBaseLow,mentalBaseMiddle,mentalBaseHigh,mentalLatest,mentalLatestState,sunshineMinutes=-1,sunshineTarget,sunshineType,relaxSeconds,relaxCount;long mentalTime;
        long sleepIn,sleepOut;int wakes,spo2,sleepHrLow,sleepHrHigh,breathLow,breathHigh,hrv,hrvLow,hrvHigh,wristBase,wristValue,wristConfidence;
        Day(LocalDate d){date=d;}
        void range(int lo,int hi){if(lo>0&&hi>=lo){min=min==0?lo:Math.min(min,lo);max=Math.max(max,hi);}}
        int value(int metric){switch(metric){case REST:return rest;case WALK:return walk;case SLEEP_HEART:return sleepHeart;case STEPS:return steps;case CALORIES:return calories;case SLEEP_SCORE:return sleepScore;default:return latest;}}
    }
    static final class Bin {
        final long stamp;int min,max,count;long sum,lastTime;int last;
        Bin(long s){stamp=s;}
        void add(int value,long time){if(value<=0||value>300)return;min=min==0?value:Math.min(min,value);max=Math.max(max,value);sum+=value;count++;if(time>=lastTime){lastTime=time;last=value;}}
        float mean(){return count>0?(float)sum/count:0;}
    }
    static final class Warning {long start,end;int type,heartType,min,max;}
    Day day(LocalDate date){Day d=days.get(date);if(d==null){d=new Day(date);days.put(date,d);}return d;}
    Day find(LocalDate date){return days.get(date);}
    static long time(LocalDate d){return d.atStartOfDay(zone()).toInstant().toEpochMilli();}
    static LocalDate date(long millis){return Instant.ofEpochMilli(millis).atZone(zone()).toLocalDate();}
    static LocalDate dateCode(int code){return LocalDate.of(code/10000,(code/100)%100,code%100);}
    static String dayLabel(LocalDate date){return date.format(DateTimeFormatter.ofPattern("MM月dd日，EEE",Locale.CHINA)).replace("星期","周");}
    static String shortDate(LocalDate d){return d.getMonthValue()+"月"+String.format(Locale.ROOT,"%02d",d.getDayOfMonth())+"日";}
    static String rangeLabel(LocalDate start,LocalDate end){return shortDate(start)+"-"+shortDate(end);}
    static String timeLabel(long t){return t>0?Instant.ofEpochMilli(t).atZone(zone()).format(DateTimeFormatter.ofPattern("HH:mm")):"—";}
    static final class Period {
        final LocalDate start,end;final int mode;
        Period(LocalDate date,int mode){this.mode=mode;switch(mode){case 1:start=date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));end=start.plusDays(6);break;case 2:start=date.withDayOfMonth(1);end=start.plusMonths(1).minusDays(1);break;case 3:start=date.withDayOfYear(1);end=start.plusYears(1).minusDays(1);break;default:start=date;end=date;}}
        Period(LocalDate start,LocalDate end,int mode){this.start=start;this.end=end;this.mode=mode;}
        Period previous(){return new Period(mode==0?start.minusDays(1):mode==1?start.minusWeeks(1):mode==2?start.minusMonths(1):start.minusYears(1),mode);}
        LocalDate next(){return mode==0?start.plusDays(1):mode==1?start.plusWeeks(1):mode==2?start.plusMonths(1):start.plusYears(1);}
        int count(){return mode==0?48:mode==1?7:mode==2?(int)ChronoUnit.DAYS.between(start,end)+1:12;}
        String label(){return mode==0?dayLabel(start):mode==1?rangeLabel(start,end):mode==2?start.getYear()+"年"+start.getMonthValue()+"月":start.getYear()+"年";}
        LocalDate at(int i){return mode==3?start.plusMonths(i):start.plusDays(i);}
        boolean contains(LocalDate date){return !date.isBefore(start)&&!date.isAfter(end);}
    }
    static final class Point {float x,low,high,value;long time;String label;Point(float x,float low,float high,float value,long time,String label){this.x=x;this.low=low;this.high=high;this.value=value;this.time=time;this.label=label;}}
    List<Point> heartPoints(Period p,boolean line){
        List<Point> out=new ArrayList<>();if(p.mode==0){long start=time(p.start),end=time(p.end.plusDays(1));
            if(line&&!raw.subMap(start,true,end,false).isEmpty()){for(Map.Entry<Long,Integer> e:raw.subMap(start,true,end,false).entrySet())out.add(new Point((e.getKey()-start)/1800000f,e.getValue(),e.getValue(),e.getValue(),e.getKey(),timeLabel(e.getKey())));}
            else for(Bin b:bins.subMap(start,true,end,false).values()){float x=(b.stamp-start)/1800000f;out.add(new Point(x,b.min,b.max,b.mean(),b.stamp,timeLabel(b.stamp)+"-"+timeLabel(b.stamp+1800000L)));}
        }else for(int i=0;i<p.count();i++){LocalDate a=p.at(i),b=p.mode==3?a.plusMonths(1).minusDays(1):a;int lo=0,hi=0;long sum=0;int count=0;
            for(Day d:days.subMap(a,true,b,true).values()){if(d.min>0){lo=lo==0?d.min:Math.min(lo,d.min);hi=Math.max(hi,d.max);sum+=(d.min+d.max)/2;count++;}}
            if(count>0)out.add(new Point(i,lo,hi,(float)sum/count,time(a),p.mode==3?(i+1)+"月":shortDate(a)));}
        return out;
    }
    List<Point> metricPoints(Period p,int metric){List<Point> out=new ArrayList<>();
        if(p.mode==0&&(metric==STEPS||metric==CALORIES)){long start=time(p.start),end=time(p.end.plusDays(1));for(Map.Entry<Long,int[]> e:activityHours.subMap(start,true,end,false).entrySet()){int value=e.getValue()[metric==STEPS?0:1];if(metric==CALORIES)value/=1000;if(value>0)out.add(new Point((e.getKey()-start)/1800000f+1,value,value,value,e.getKey(),timeLabel(e.getKey())+"-"+timeLabel(e.getKey()+3600000L)));}return out;}
        for(int i=0;i<(p.mode==0?1:p.count());i++){LocalDate a=p.at(i),b=p.mode==3?a.plusMonths(1).minusDays(1):a;long sum=0;int count=0,min=0,max=0;
        for(Day d:days.subMap(a,true,b,true).values()){int value=d.value(metric);if(value>0){sum+=value;count++;min=min==0?value:Math.min(min,value);max=Math.max(max,value);}}
        if(count>0)out.add(new Point(i,min,max,(float)sum/count,time(a),p.mode==3?(i+1)+"月":shortDate(a)));}return out;}
    int[] range(Period p,int metric){int lo=0,hi=0;for(Day d:days.subMap(p.start,true,p.end,true).values()){int a=metric==HEART?d.min:d.value(metric),b=metric==HEART?d.max:a;if(a>0){lo=lo==0?a:Math.min(lo,a);hi=Math.max(hi,b);}}return new int[]{lo,hi};}
    static String rangeText(int[] r){return r[0]<=0?"—":r[0]==r[1]?""+r[0]:r[0]+"-"+r[1];}
    int average(LocalDate start,LocalDate end,int metric){long sum=0;int count=0;for(Day d:days.subMap(start,true,end,true).values()){int v=d.value(metric);if(v>0){sum+=v;count++;}}return count==0?0:(int)(sum/count);}
    int sum(LocalDate start,LocalDate end,int metric){int sum=0;for(Day d:days.subMap(start,true,end,true).values())sum+=Math.max(0,d.value(metric));return sum;}
    int validDays(LocalDate start,LocalDate end,int metric){int n=0;for(Day d:days.subMap(start,true,end,true).values())if(d.value(metric)>(metric==CALORIES?50:0))n++;return n;}
    int warningCount(Period p){if(window==null){int n=0;for(Warning w:warnings)if(p.contains(date(w.start)))n++;return n;}int n=0;for(Day d:days.subMap(p.start,true,p.end,true).values())n+=d.warningCount;return n;}
    List<Mental> mentalExtrema(Period p){List<Mental> out=new ArrayList<>();for(Day d:days.subMap(p.start,true,p.end,true).values()){if(d.mentalMin!=null)out.add(d.mentalMin);if(d.mentalMax!=null)out.add(d.mentalMax);}if(window==null)out.addAll(mental.subMap(time(p.start),true,time(p.end.plusDays(1)),false).values());out.sort(Comparator.comparingLong(q->q.time));return out;}
    static final class Trend {
        final int metric,before,after;final LocalDate beforeStart,beforeEnd,start,end;final List<Point> previous,current;final boolean monthly;
        Trend(HealthMetricsData d,LocalDate anchor,int metric,boolean monthly){this.metric=metric;this.monthly=monthly;
            LocalDate last=metric==SLEEP_SCORE?anchor:anchor.minusDays(1);LocalDate first=last.minusDays(monthly?30:6);
            if(monthly&&first.getDayOfMonth()==1){start=first;end=first.plusMonths(1).minusDays(1);beforeEnd=start.minusDays(1);beforeStart=beforeEnd.withDayOfMonth(1);}
            else{start=first;end=last;beforeEnd=first.minusDays(1);beforeStart=beforeEnd.minusDays(monthly?30:6);}
            before=d.average(beforeStart,beforeEnd,metric);after=d.average(start,end,metric);previous=trendPoints(d,beforeStart,beforeEnd,metric);current=trendPoints(d,start,end,metric);
        }
        static List<Point> trendPoints(HealthMetricsData d,LocalDate a,LocalDate b,int metric){List<Point> out=new ArrayList<>();for(LocalDate x=a;!x.isAfter(b);x=x.plusDays(1)){Day day=d.find(x);int v=day==null?0:day.value(metric);if(v>0)out.add(new Point(ChronoUnit.DAYS.between(a,x),v,v,v,time(x),shortDate(x)));}return out;}
        int delta(){return after-before;}
        String title(){return metric==STEPS?"步数趋势":metric==CALORIES?"消耗趋势":"睡眠评分";}
        String unit(){return metric==STEPS?"步":metric==CALORIES?"千卡":"分";}
        String averageLabel(){return metric==STEPS?"日均步数":metric==CALORIES?"日均消耗":"日均评分";}
        String wording(){return averageLabel()+(delta()>0?(metric==SLEEP_SCORE?"上升":"增加"):delta()<0?(metric==SLEEP_SCORE?"下降":"减少"):"持平")+(delta()==0?"":" "+Math.abs(delta())+" "+unit());}
        int color(){return metric==STEPS?GREEN:metric==CALORIES?ORANGE:PURPLE;}
        boolean visible(HealthMetricsData d){int required=monthly?20:3,threshold=metric==STEPS?(monthly?1000:500):metric==CALORIES?100:5;return before>0&&after>0&&d.validDays(beforeStart,beforeEnd,metric)>=required&&d.validDays(start,end,metric)>=required&&Math.abs(delta())>=threshold;}
    }
    List<Trend> trends(LocalDate date){List<Trend> out=new ArrayList<>();for(int metric:new int[]{SLEEP_SCORE,STEPS,CALORIES}){Trend weekly=new Trend(this,date,metric,false);if(metric!=SLEEP_SCORE){Trend monthly=new Trend(this,date,metric,true);if(monthly.visible(this)){out.add(monthly);continue;}}if(weekly.visible(this))out.add(weekly);}return out;}
}
