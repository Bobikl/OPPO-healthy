package com.heytap.log.strategy;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.config.StdDtoConst;
import com.heytap.log.consts.LogConstants;
import com.heytap.log.dto.TraceConfigDto;
import com.heytap.log.util.SPUtil;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class TaskConv {
    private static final String TAG = "HLog_TaskUtils";

    public static String checkAllPushTask() {
        String string = SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY + SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY), "");
        if (!TextUtils.isEmpty(string)) {
            ArrayList arrayList = new ArrayList();
            String[] strArrSplit = string.split("#");
            if (strArrSplit.length > 0) {
                for (String str : strArrSplit) {
                    TraceConfigDto traceConfigDto = parserJsonToDto(str);
                    if (traceConfigDto != null && traceConfigDto.getSrc() == 1 && traceConfigDto.getEndTime() > System.currentTimeMillis()) {
                        arrayList.add(traceConfigDto);
                    }
                }
                return convDtosToJson(arrayList);
            }
        }
        return "";
    }

    public static String convDtoToJson(TraceConfigDto traceConfigDto) {
        if (traceConfigDto == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", StdDtoConst.ENABLE_LOG_UPLOAD_KEY);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("traceId", traceConfigDto.getTraceId());
            jSONObject2.put("imei", traceConfigDto.getPhyid());
            jSONObject2.put("openId", traceConfigDto.getOpenid());
            jSONObject2.put(StdDtoConst.REGISTRATIONID_KEY, "");
            jSONObject2.put(StdDtoConst.BEGIN_TIME_KEY, traceConfigDto.getBeginTime());
            jSONObject2.put("endTime", traceConfigDto.getEndTime());
            jSONObject2.put(StdDtoConst.FORCE_KEY, traceConfigDto.getForce());
            jSONObject2.put("tracePkg", traceConfigDto.getTracePkg());
            jSONObject2.put("level", traceConfigDto.getLevel());
            jSONObject2.put(StdDtoConst.CONSOLE_KEY, traceConfigDto.getConsole());
            jSONObject2.put(StdDtoConst.MAXLOGSIZE_KEY, traceConfigDto.getMaxLogSize());
            jSONObject2.put(StdDtoConst.CONFIGURATIONCHECKS_KEY, traceConfigDto.getTimesPerDay());
            jSONObject2.put(StdDtoConst.MAXLOGINCACHE_KEY, traceConfigDto.getQueueSize());
            jSONObject2.put(StdDtoConst.NEARXTRACESIMPLERATE_KEY, traceConfigDto.getSample());
            jSONObject2.put(StdDtoConst.KEYWORDS_KEY, traceConfigDto.getKeyWords());
            jSONObject2.put(StdDtoConst.ISUPLOADED_KEY, traceConfigDto.getIsUploaded());
            jSONObject2.put("business", traceConfigDto.getBusiness());
            jSONObject2.put("source", traceConfigDto.getSrc());
            jSONObject.put("content", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String convDtoToJsonExt(TraceConfigDto traceConfigDto) {
        if (traceConfigDto == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("traceId", traceConfigDto.getTraceId());
            jSONObject.put("imei", traceConfigDto.getPhyid());
            jSONObject.put("openId", traceConfigDto.getOpenid());
            jSONObject.put(StdDtoConst.REGISTRATIONID_KEY, "");
            jSONObject.put(StdDtoConst.BEGIN_TIME_KEY, traceConfigDto.getBeginTime());
            jSONObject.put("endTime", traceConfigDto.getEndTime());
            jSONObject.put(StdDtoConst.FORCE_KEY, traceConfigDto.getForce());
            jSONObject.put("tracePkg", traceConfigDto.getTracePkg());
            jSONObject.put("level", traceConfigDto.getLevel());
            jSONObject.put(StdDtoConst.CONSOLE_KEY, traceConfigDto.getConsole());
            jSONObject.put(StdDtoConst.MAXLOGSIZE_KEY, traceConfigDto.getMaxLogSize());
            jSONObject.put(StdDtoConst.CONFIGURATIONCHECKS_KEY, traceConfigDto.getTimesPerDay());
            jSONObject.put(StdDtoConst.MAXLOGINCACHE_KEY, traceConfigDto.getQueueSize());
            jSONObject.put(StdDtoConst.NEARXTRACESIMPLERATE_KEY, traceConfigDto.getSample());
            jSONObject.put(StdDtoConst.KEYWORDS_KEY, traceConfigDto.getKeyWords());
            jSONObject.put(StdDtoConst.ISUPLOADED_KEY, traceConfigDto.getIsUploaded());
            jSONObject.put("business", traceConfigDto.getBusiness());
            jSONObject.put("source", traceConfigDto.getSrc());
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String convDtosToJson(List<TraceConfigDto> list) {
        if (list == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (TraceConfigDto traceConfigDto : list) {
            if (traceConfigDto != null) {
                String strConvDtoToJsonExt = convDtoToJsonExt(traceConfigDto);
                if (!TextUtils.isEmpty(strConvDtoToJsonExt)) {
                    jSONArray.put(strConvDtoToJsonExt);
                }
            }
        }
        return jSONArray.toString();
    }

    public static TraceConfigDto convKitToDto(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            TraceConfigDto traceConfigDto = new TraceConfigDto();
            traceConfigDto.setTraceId(jSONObject.optLong("traceId"));
            traceConfigDto.setEncryClientId(jSONObject.optString("encryClientId"));
            traceConfigDto.setForce(jSONObject.optInt(StdDtoConst.FORCE_KEY));
            traceConfigDto.setTracePkg(jSONObject.optString("tracePkg"));
            traceConfigDto.setBeginTime(jSONObject.optLong(StdDtoConst.BEGIN_TIME_KEY));
            traceConfigDto.setEndTime(jSONObject.optLong("endTime"));
            traceConfigDto.setExactMatchTracePkg(jSONObject.optInt("exactMatchTracePkg"));
            traceConfigDto.setLevel(jSONObject.optInt("level"));
            traceConfigDto.setConsole(jSONObject.optInt(StdDtoConst.CONSOLE_KEY));
            traceConfigDto.setMaxLogSize(jSONObject.optInt(StdDtoConst.MAXLOGSIZE_KEY));
            traceConfigDto.setTimesPerDay(jSONObject.optInt("timesPerDay"));
            traceConfigDto.setSample(jSONObject.optInt(DebugModeEntity.KEY_SAMPLE));
            traceConfigDto.setKeyWords(jSONObject.optString(StdDtoConst.KEYWORDS_KEY));
            traceConfigDto.setCommons(jSONObject.optString("commons"));
            traceConfigDto.setBusiness(jSONObject.optString("business"));
            traceConfigDto.setSrc(1);
            return traceConfigDto;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized List<TraceConfigDto> convKitToDtos(String str) {
        TraceConfigDto traceConfigDtoConvKitToDto;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (traceConfigDtoConvKitToDto = convKitToDto(jSONObjectOptJSONObject.toString())) != null) {
                    arrayList.add(traceConfigDtoConvKitToDto);
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static void deletePushTaskInfo(long j2) {
        String string = SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY);
        String str = "";
        String string2 = TextUtils.isEmpty("") ? SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY + string, "") : "";
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        ArrayList<TraceConfigDto> arrayList = new ArrayList();
        String[] strArrSplit = string2.split("#");
        if (strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                TraceConfigDto traceConfigDto = parserJsonToDto(str2);
                if (traceConfigDto != null && j2 == traceConfigDto.getTraceId()) {
                    Log.d(TAG, "删除指定info 信息 : " + str2);
                } else if (traceConfigDto != null) {
                    Log.d(TAG, "不需要删除指定info 信息 : " + str2);
                    arrayList.add(traceConfigDto);
                }
            }
            if (arrayList.size() > 0) {
                Log.d(TAG, "不需要删除指定info 信息 : " + arrayList);
                for (TraceConfigDto traceConfigDto2 : arrayList) {
                    if (traceConfigDto2 != null) {
                        String strConvDtoToJson = convDtoToJson(traceConfigDto2);
                        if (!TextUtils.isEmpty(strConvDtoToJson)) {
                            str = "#" + strConvDtoToJson;
                        }
                    }
                }
                Log.e(TAG, "删除后existPushInfo pkgName : " + string + " ; content : " + str);
                SPUtil sPUtil = SPUtil.getInstance();
                StringBuilder sb = new StringBuilder();
                sb.append(LogConstants.OPUSH_NX_DTO_KEY);
                sb.append(string);
                sPUtil.put(sb.toString(), str);
            }
        }
    }

    public static List<TraceConfigDto> getLocalTraceList(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            TraceConfigDto traceConfigDto = parserJsonToDto(str2);
            if (traceConfigDto != null) {
                arrayList.add(traceConfigDto);
            }
        }
        return arrayList;
    }

    public static boolean isExsitPushTaskDto(TraceConfigDto traceConfigDto, String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("#");
            if (strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    TraceConfigDto traceConfigDto2 = parserJsonToDto(str2);
                    if (traceConfigDto2 != null && traceConfigDto.getTraceId() == traceConfigDto2.getTraceId()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void noFindAndDeleteLocalTaskInfo(List<TraceConfigDto> list, String str) {
        List<TraceConfigDto> localTraceList;
        boolean z;
        if (list == null || list.size() == 0 || (localTraceList = getLocalTraceList(str)) == null || localTraceList.size() <= 0) {
            return;
        }
        for (TraceConfigDto traceConfigDto : localTraceList) {
            if (traceConfigDto != null) {
                long traceId = traceConfigDto.getTraceId();
                Iterator<TraceConfigDto> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    TraceConfigDto next = it.next();
                    if (next != null && traceId == next.getTraceId()) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    deletePushTaskInfo(traceId);
                }
            }
        }
    }

    public static TraceConfigDto parserJsonToDto(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!StdDtoConst.ENABLE_LOG_UPLOAD_KEY.equalsIgnoreCase(jSONObject.optString("action"))) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content");
            TraceConfigDto traceConfigDto = new TraceConfigDto();
            traceConfigDto.setTraceId(jSONObjectOptJSONObject.optInt("traceId"));
            traceConfigDto.setPhyid(jSONObjectOptJSONObject.optString("imei"));
            traceConfigDto.setEncryClientId(jSONObjectOptJSONObject.optString("openId"));
            traceConfigDto.setBeginTime(jSONObjectOptJSONObject.optLong(StdDtoConst.BEGIN_TIME_KEY));
            traceConfigDto.setEndTime(jSONObjectOptJSONObject.optLong("endTime"));
            traceConfigDto.setForce(jSONObjectOptJSONObject.optInt(StdDtoConst.FORCE_KEY));
            traceConfigDto.setTracePkg(jSONObjectOptJSONObject.optString("tracePkg"));
            traceConfigDto.setLevel(jSONObjectOptJSONObject.optInt("level"));
            traceConfigDto.setConsole(jSONObjectOptJSONObject.optInt(StdDtoConst.CONSOLE_KEY));
            traceConfigDto.setMaxLogSize(jSONObjectOptJSONObject.optInt(StdDtoConst.MAXLOGSIZE_KEY));
            traceConfigDto.setTimesPerDay(jSONObjectOptJSONObject.optInt(StdDtoConst.CONFIGURATIONCHECKS_KEY));
            traceConfigDto.setQueueSize(jSONObjectOptJSONObject.optInt(StdDtoConst.CONFIGURATIONCHECKS_KEY));
            traceConfigDto.setSample(jSONObjectOptJSONObject.optInt(StdDtoConst.NEARXTRACESIMPLERATE_KEY));
            traceConfigDto.setKeyWords(jSONObjectOptJSONObject.optString(StdDtoConst.KEYWORDS_KEY));
            traceConfigDto.setBusiness(jSONObjectOptJSONObject.optString("business"));
            traceConfigDto.setIsUploaded(jSONObjectOptJSONObject.optInt(StdDtoConst.ISUPLOADED_KEY, 0));
            traceConfigDto.setSrc(jSONObjectOptJSONObject.optInt("source"));
            return traceConfigDto;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void updatePushTaskInfo(List<TraceConfigDto> list) {
        String string = SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY);
        if (list == null || list.size() == 0) {
            SPUtil.getInstance().put(LogConstants.OPUSH_NX_DTO_KEY + string, "");
            return;
        }
        noFindAndDeleteLocalTaskInfo(list, TextUtils.isEmpty("") ? SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY + string, "") : "");
        String string2 = SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY + string, "");
        for (TraceConfigDto traceConfigDto : list) {
            if (!isExsitPushTaskDto(traceConfigDto, string2)) {
                traceConfigDto.setSrc(1);
                String strConvDtoToJson = convDtoToJson(traceConfigDto);
                if (!TextUtils.isEmpty(strConvDtoToJson)) {
                    string2 = string2 + "#" + strConvDtoToJson;
                }
            }
        }
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        Log.e(TAG, "existPushInfo pkgName : " + string + " ; content : " + string2);
        SPUtil sPUtil = SPUtil.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(LogConstants.OPUSH_NX_DTO_KEY);
        sb.append(string);
        sPUtil.put(sb.toString(), string2);
    }
}
