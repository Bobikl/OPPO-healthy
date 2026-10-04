package com.example.opponotificationrelay;
import android.content.*;import java.time.*;import java.io.IOException;import java.util.function.BooleanSupplier;import org.json.*;import com.heytap.health.sleep.formula.formula.result.OsaResultBean;
/** A separately attributed, local result; imported official history is never overwritten. */
public final class OsaLocalAnalysis {
 private OsaLocalAnalysis(){}
 public static String label(JSONObject result)throws JSONException{int level=result.getInt("level");String[] labels={"未见异常","疑似轻度","疑似中度","疑似重度"};return "本机分析 · "+result.getString("date")+"\n"+labels[level]+" · AHI "+String.format(java.util.Locale.CHINA,"%.2f",result.getDouble("ahi"));}
 public static String last(Context c){try{String key=RelayConfig.getTargetMac(c)+"|"+LocalDate.now();String s=c.getSharedPreferences("osa_local_results",0).getString(key,"");return s.isEmpty()?"尚无本机分析结果":label(new JSONObject(s));}catch(Exception e){return "尚无本机分析结果";}}
 public static String run(Context c,BooleanSupplier cancelled)throws Exception{
  if(SnoreRecordingService.isRunning())throw new IOException("OSA_RECORDING_BUSY");String device=RelayConfig.getTargetMac(c);DeviceIdentity identity=DeviceIdentityStore.read(c);if(identity==null||!"OWW251".equals(identity.model))throw new IOException("OSA_MODEL_UNVERIFIED");LocalDate date=LocalDate.now();
  OsaAnalysisRepository.refresh(c,device,date,cancelled);if(cancelled.getAsBoolean()||!device.equals(RelayConfig.getTargetMac(c)))throw new IOException("OSA_SYNC_CANCELLED");
  OsaAnalysisInput input=OsaAnalysisRepository.load(c,device,date);OsaResultBean result=OsaRiskAdapter.watch(identity.model,input,OsaSnoreInput.load(c,device,input.start*1000,input.end*1000));
  if(!OsaRiskAdapter.valid(result))return "本次数据不足，未生成呼吸暂停结果。"+(input.oxygenSeconds<180?"整晚血氧资料仍不足，请保持佩戴并在起床后同步。":"请保持整晚佩戴，后续有完整睡眠资料时再分析。");
  if(cancelled.getAsBoolean()||!device.equals(RelayConfig.getTargetMac(c))||!date.equals(LocalDate.now()))throw new IOException("OSA_SYNC_CANCELLED");
  JSONObject data=new JSONObject().put("source","local-OSALib-6.6.7").put("date",date.toString()).put("device",device).put("level",result.osaLevel).put("ahi",result.osaAhi).put("invalidSpo2Ratio",result.invalidSpo2Ratio).put("sleepStart",input.start).put("sleepEnd",input.end).put("sleepMinutes",input.sleepMinutes).put("sensorMinutes",input.sensorMinutes).put("oxygenSamples",input.oxygenSeconds).put("profile","official-empty-defaults").put("generatedAt",System.currentTimeMillis());
  if(!c.getSharedPreferences("osa_local_results",0).edit().putString(device+"|"+date,data.toString()).commit())throw new IOException("OSA_RESULT_STORAGE");return label(data);
 }
 public static String error(Exception e){String code=e.getMessage();if("OSA_SLEEP_INCOMPLETE".equals(code))return "本次睡眠资料不足，暂不能分析。请在起床后同步整晚记录。";if("OSA_SENSOR_INCOMPLETE".equals(code))return "本次呼吸传感器资料不足，暂不能分析。";if("OSA_RECORDING_BUSY".equals(code))return "请先结束录音，再开始分析。";return "分析未完成，请确认手表连接后重试。";}
}
