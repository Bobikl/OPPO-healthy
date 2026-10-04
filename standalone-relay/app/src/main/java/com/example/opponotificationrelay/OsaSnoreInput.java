package com.example.opponotificationrelay;
import android.content.Context;import android.database.Cursor;import java.io.IOException;import java.util.*;import org.json.*;import com.heytap.health.sleep.formula.formula.*;
/** Rehydrates only completed, same-device local recordings; short/interrupted audio is excluded. */
public final class OsaSnoreInput {
 private OsaSnoreInput(){}
 static float number(JSONObject row,String key)throws Exception{double v=row.getDouble(key);if(Double.isNaN(v)||Double.isInfinite(v)||Math.abs(v)>Float.MAX_VALUE)throw new IOException("OSA_AUDIO_NUMBER");return(float)v;}
 static float[] vector(JSONObject row,String key,int n)throws Exception{JSONArray a=row.getJSONArray(key);if(a.length()!=n)throw new IOException("OSA_AUDIO_VECTOR");float[] v=new float[n];for(int i=0;i<n;i++){double value=a.getDouble(i);if(Double.isNaN(value)||Double.isInfinite(value)||Math.abs(value)>Float.MAX_VALUE)throw new IOException("OSA_AUDIO_NUMBER");v[i]=(float)value;}return v;}
 public static OsaSnoreMultiFragBean load(Context c,String device,long from,long to)throws Exception{
  try(SnoreSessionStore store=new SnoreSessionStore(c)){List<OsaSnoreBean> fragments=new ArrayList<>();for(SnoreSessionStore.Session s:store.list()){
   if(!s.device.equals(device)||!s.scope.equals("local")||!s.state.equals("WAITING_DATA")||s.samples<SnoreSessionStore.MIN_SAMPLES||s.samples>SnoreSessionStore.MAX_SAMPLES||s.ended<=from||s.started>=to)continue;
   if(s.summary.isEmpty()||!store.file(s.id,false).isFile()||store.file(s.id,false).length()!=44+s.samples*2)throw new IOException("OSA_AUDIO_INCOMPLETE");
   JSONObject summary=new JSONObject(s.summary);if(summary.getInt("resultCode")!=0)continue;OsaSnoreBean fragment=new OsaSnoreBean();fragment.recordStartUnix=s.started/1000;fragment.recordFileLen=(int)(s.samples/8000);
   OsaSnoreModelSummaryBean model=new OsaSnoreModelSummaryBean();model.AI=number(summary,"AI");model.REI=number(summary,"REI");model.audioStates=summary.getInt("audioStates");model.meanRespRate=number(summary,"meanRespRate");model.silencedRatio=number(summary,"silencedRatio");model.silencedTime=summary.getInt("silencedTime");model.snoreFeatsSummary=vector(summary,"snoreFeats",10);model.snoreFreq=number(summary,"snoreFreq");model.snoreNum=summary.getInt("snoreNum");model.totalSignalLen=summary.getInt("totalSignalLen");model.validSignalLen=summary.getInt("validSignalLen");fragment.snoreModelSummary=model;
   List<OsaSnoreInfoBean> events=new ArrayList<>();List<OsaSnoreModelInfoBean> models=new ArrayList<>();Set<Integer> starts=new HashSet<>();
   try(Cursor rows=store.getReadableDatabase().rawQuery("SELECT kind,body FROM features WHERE session=? AND kind IN ('snore','model') ORDER BY frame LIMIT 25001",new String[]{s.id})){
    int count=0;while(rows.moveToNext()){if(++count>25000)throw new IOException("OSA_AUDIO_LIMIT");JSONObject row=new JSONObject(rows.getString(1));if(rows.getString(0).equals("snore")){JSONArray a=row.getJSONArray("details");int n=row.getInt("count");if(n<0||n>a.length()||n>128)throw new IOException("OSA_AUDIO_EVENTS");for(int i=0;i<n;i++){JSONObject e=a.getJSONObject(i);int begin=e.getInt("start"),end=e.getInt("end");if(begin<0||end<=begin||end>s.samples/8)throw new IOException("OSA_AUDIO_TIME");if(!starts.add(begin))continue;OsaSnoreInfoBean value=new OsaSnoreInfoBean();value.snoreStartTimeMs=begin;value.snoreEndTimeMs=end;value.features=vector(e,"features",7);events.add(value);if(events.size()>20000)throw new IOException("OSA_AUDIO_LIMIT");}}
    else{OsaSnoreModelInfoBean value=new OsaSnoreModelInfoBean();value.totalSignalLen=row.getInt("totalSignalLen");value.curFrameSnoreNum=row.getInt("currentCount");value.lastFrameSnoreNum=row.getInt("previousCount");value.osaModelFeature=vector(row,"features",5);models.add(value);if(models.size()>5000)throw new IOException("OSA_AUDIO_LIMIT");}}
   }
   events.sort(Comparator.comparingInt(e->e.snoreStartTimeMs));fragment.snoreDataBuf=events.toArray(new OsaSnoreInfoBean[0]);fragment.snoreDataLen=events.size();fragment.snoreOsaModelBuf=models.toArray(new OsaSnoreModelInfoBean[0]);fragment.snoreOsaModelLen=models.size();fragments.add(fragment);
  }
  if(fragments.isEmpty())return null;fragments.sort(Comparator.comparingLong(f->f.recordStartUnix));OsaSnoreMultiFragBean value=new OsaSnoreMultiFragBean();value.osaSnoreBeans=fragments.toArray(new OsaSnoreBean[0]);value.snoreFragNum=(byte)fragments.size();return value;
  }
 }
}
