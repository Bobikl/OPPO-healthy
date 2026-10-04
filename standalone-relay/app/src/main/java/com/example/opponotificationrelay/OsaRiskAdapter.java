package com.example.opponotificationrelay;
import android.os.Looper;import java.io.IOException;
import com.heytap.health.sleep.formula.formula.*;import com.heytap.health.sleep.formula.formula.jni.*;import com.heytap.health.sleep.formula.formula.result.OsaResultBean;
/** Serialized OSALib evaluation. No synthetic profile values or inferred results. */
public final class OsaRiskAdapter {
 private static final Object LOCK=new Object();private OsaRiskAdapter(){}
 public static OsaResultBean watch(String model,OsaAnalysisInput input,OsaSnoreMultiFragBean snore)throws IOException {
  if(Looper.myLooper()==Looper.getMainLooper())throw new IOException("OSA_MAIN_THREAD");
  if(!"OWW251".equals(model))throw new IOException("OSA_MODEL_UNVERIFIED");if(input==null)throw new IOException("OSA_INPUT_MISSING");
  synchronized(LOCK){if(SnoreRecordingService.isRunning())throw new IOException("OSA_RECORDING_BUSY");
   try{DeviceMsgBean device=new DeviceMsgBean();device.deviceType=1;device.generation=3;device.phoneMsg=new DevicePhoneBean();device.phoneMsg.phoneDataBuf=new DevicePhoneInfoBean[0];
    // Official OsaInputParameterTransform defaults current StarRiver models to wyh.g.
    // An empty UserInfo leaves all four OsaUserBean fields at Java defaults.
    OsaUserBean user=OsaAnalysisInput.emptyUser();OsaHistBean history=new OsaHistBean();OsaStatisticsBean statistics=new OsaStatisticsBean();
    OsaResultBean result=OsaAlgorithm.osaAlgProcess(input.oxygen,null,input.sensor,snore,input.sleep,user,statistics,device,history);
    if(result==null)throw new IOException("OSA_NATIVE_EMPTY");return result;
   }catch(LinkageError e){throw new IOException("OSA_NATIVE_UNAVAILABLE",e);}finally{try{OsaAlgorithm.recycleGlobalRef();}catch(LinkageError ignored){}}
  }
 }
 public static boolean valid(OsaResultBean r){return r!=null&&r.osaLevel>=0&&r.osaLevel<=3&&r.noPersonInBedFlag==0&&!Float.isNaN(r.osaAhi)&&!Float.isInfinite(r.osaAhi)&&r.osaAhi>=0;}
}
