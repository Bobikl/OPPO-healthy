package com.example.opponotificationrelay;
import java.io.IOException;import java.util.*;
import com.heytap.health.sleep.formula.formula.*;
/** Unit-preserving input conversion verified against official 6.6.7 transforms. */
public final class OsaAnalysisInput {
 public final OsaSleepBean sleep;public final OsaSensorBean sensor;public final OsaSpo2Bean oxygen;
 public final int sleepMinutes,sensorMinutes,oxygenSeconds;public final long start,end;
 private OsaAnalysisInput(OsaSleepBean s,OsaSensorBean v,OsaSpo2Bean o,int asleep,int sensors,int seconds,long a,long b){sleep=s;sensor=v;oxygen=o;sleepMinutes=asleep;sensorMinutes=sensors;oxygenSeconds=seconds;start=a;end=b;}
 static int stage(int state){int raw=state&7;return raw==1?2:raw==2?1:raw==3?3:0;}
 // Official V2: sleep type only, reliability restored before JNI packing.
 static int packedSpo2(int typeSecond,int raw){if((typeSecond&3)!=0||(raw&248)==0)return 0;return (raw&248)|4|((raw>>>1)&3);}
 public static OsaAnalysisInput build(NavigableMap<Integer,Integer> sleepRows,NavigableMap<Integer,Integer> sensorRows,NavigableMap<Integer,Integer> oxygenRows)throws IOException{
  long start=0,end=0;int asleep=0;
  for(Map.Entry<Integer,Integer> e:sleepRows.entrySet())if(stage(e.getValue())>0){if(start==0)start=e.getKey();end=e.getKey()+60L;asleep++;}
  if(start<1500000000||end<=start||end-start>86400||asleep<180)throw new IOException("OSA_SLEEP_INCOMPLETE");
  int len=(int)((end-start)/60);OsaSleepBean sleep=new OsaSleepBean();sleep.sleepStartUnix=start;sleep.sleepDataLen=len;sleep.sleepMinBuff=new short[len];
  for(Map.Entry<Integer,Integer> e:sleepRows.entrySet()){long offset=e.getKey()-start;if(offset>=0&&offset<end-start){if(offset%60!=0)throw new IOException("OSA_SLEEP_ALIGNMENT");sleep.sleepMinBuff[(int)(offset/60)]=(short)stage(e.getValue());}}
  NavigableMap<Integer,Integer> selected=sensorRows.subMap((int)start,true,(int)end,false);
  if(selected.size()<60)throw new IOException("OSA_SENSOR_INCOMPLETE");
  OsaSensorBean sensor=new OsaSensorBean();sensor.sensorOsaStartUnix=selected.firstKey();sensor.sensorOsaBuffLen=(selected.lastKey()-selected.firstKey())/60+1;sensor.sensorOsaMinBuff=new int[sensor.sensorOsaBuffLen];
  for(Map.Entry<Integer,Integer> e:selected.entrySet()){int offset=e.getKey()-selected.firstKey();if(offset%60!=0)throw new IOException("OSA_SENSOR_ALIGNMENT");sensor.sensorOsaMinBuff[offset/60]=e.getValue();}
  NavigableMap<Integer,Integer> valid=new TreeMap<>();for(Map.Entry<Integer,Integer> e:oxygenRows.subMap((int)start,true,(int)end,false).entrySet()){int value=e.getValue();if(value>=8&&value<=255)valid.put(e.getKey(),value);}
  OsaSpo2Bean oxygen=null;if(!valid.isEmpty()){oxygen=new OsaSpo2Bean();oxygen.spo2StartUnix=valid.firstKey();oxygen.spo2BuffLen=valid.lastKey()-valid.firstKey()+1;oxygen.spo2Buffs=new short[oxygen.spo2BuffLen];for(Map.Entry<Integer,Integer> e:valid.entrySet())oxygen.spo2Buffs[e.getKey()-valid.firstKey()]=e.getValue().shortValue();}
  return new OsaAnalysisInput(sleep,sensor,oxygen,asleep,selected.size(),valid.size(),start,end);
 }
 public static OsaUserBean emptyUser(){return new OsaUserBean();}
}
