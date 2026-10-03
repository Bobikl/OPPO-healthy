package com.heytap.speech.engine.internal.data;

import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Task_JsonParser implements Serializable {
    public static Task parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Task task = new Task();
        if (jSONObject.optString("audioText") != null && !jSONObject.optString("audioText").toString().equalsIgnoreCase("null")) {
            task.setAudioText(jSONObject.optString("audioText"));
        }
        if (jSONObject.optString("audioUrl") != null && !jSONObject.optString("audioUrl").toString().equalsIgnoreCase("null")) {
            task.setAudioUrl(jSONObject.optString("audioUrl"));
        }
        task.setCommand(Command_JsonParser.parse(jSONObject.optJSONObject(EngineConstant.WAKEUP_TYPE_COMMAND)));
        task.setEndSessionReason(EndSessionReason_JsonParser.parse(jSONObject.optJSONObject("endSessionReason")));
        task.setError(Error_JsonParser.parse(jSONObject.optJSONObject("error")));
        if (jSONObject.optString("intentName") != null && !jSONObject.optString("intentName").toString().equalsIgnoreCase("null")) {
            task.setIntentName(jSONObject.optString("intentName"));
        }
        if (jSONObject.optString("listen") != null && !jSONObject.optString("listen").toString().equalsIgnoreCase("null")) {
            task.setListen(jSONObject.optString("listen"));
        }
        task.setNativeapi(Nativeapi_JsonParser.parse(jSONObject.optJSONObject("nativeapi")));
        if (jSONObject.optString("nlg") != null && !jSONObject.optString("nlg").toString().equalsIgnoreCase("null")) {
            task.setNlg(jSONObject.optString("nlg"));
        }
        if (jSONObject.optString("nlu") != null && !jSONObject.optString("nlu").toString().equalsIgnoreCase("null")) {
            task.setNlu(jSONObject.optString("nlu"));
        }
        if (jSONObject.optString(EngineConstant.ONESHOT) != null && !jSONObject.optString(EngineConstant.ONESHOT).toString().equalsIgnoreCase("null")) {
            task.setOneshot(jSONObject.optString(EngineConstant.ONESHOT));
        }
        if (jSONObject.optString(SpeechConstant.KEY_RECORD_ID) != null && !jSONObject.optString(SpeechConstant.KEY_RECORD_ID).toString().equalsIgnoreCase("null")) {
            task.setRecordId(jSONObject.optString(SpeechConstant.KEY_RECORD_ID));
        }
        if (jSONObject.optString("refText") != null && !jSONObject.optString("refText").toString().equalsIgnoreCase("null")) {
            task.setRefText(jSONObject.optString("refText"));
        }
        if (jSONObject.optString("runSequence") != null && !jSONObject.optString("runSequence").toString().equalsIgnoreCase("null")) {
            task.setRunSequence(jSONObject.optString("runSequence"));
        }
        if (jSONObject.optString("sessionId") != null && !jSONObject.optString("sessionId").toString().equalsIgnoreCase("null")) {
            task.setSessionId(jSONObject.optString("sessionId"));
        }
        task.setShouldEndSession(jSONObject.optBoolean("shouldEndSession", task.getShouldEndSession()));
        if (jSONObject.optString("skillId") != null && !jSONObject.optString("skillId").toString().equalsIgnoreCase("null")) {
            task.setSkillId(jSONObject.optString("skillId"));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("speakList");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Speak_JsonParser.parse(jSONArrayOptJSONArray.optJSONObject(i)));
            }
            task.setSpeakList(arrayList);
        }
        if (jSONObject.optString("speakType") != null && !jSONObject.optString("speakType").toString().equalsIgnoreCase("null")) {
            task.setSpeakType(jSONObject.optString("speakType"));
        }
        if (jSONObject.optString("speakUrl") != null && !jSONObject.optString("speakUrl").toString().equalsIgnoreCase("null")) {
            task.setSpeakUrl(jSONObject.optString("speakUrl"));
        }
        if (jSONObject.optString("speech") != null && !jSONObject.optString("speech").toString().equalsIgnoreCase("null")) {
            task.setSpeech(jSONObject.optString("speech"));
        }
        if (jSONObject.optString(EngineConstant.TTS_TYPE_SSML) != null && !jSONObject.optString(EngineConstant.TTS_TYPE_SSML).toString().equalsIgnoreCase("null")) {
            task.setSsml(jSONObject.optString(EngineConstant.TTS_TYPE_SSML));
        }
        if (jSONObject.optString("taskId") != null && !jSONObject.optString("taskId").toString().equalsIgnoreCase("null")) {
            task.setTaskId(jSONObject.optString("taskId"));
        }
        if (jSONObject.optString("tips") != null && !jSONObject.optString("tips").toString().equalsIgnoreCase("null")) {
            task.setTips(jSONObject.optString("tips"));
        }
        try {
            if (!jSONObject.has(EngineConstant.CLOUD_CHECK) || jSONObject.get(EngineConstant.CLOUD_CHECK) == null || jSONObject.get(EngineConstant.CLOUD_CHECK).toString().equalsIgnoreCase("null")) {
                task.setCloudCheck(null);
            } else {
                task.setCloudCheck(Boolean.valueOf(jSONObject.optBoolean(EngineConstant.CLOUD_CHECK)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONObject.optString("wakeupWord") != null && !jSONObject.optString("wakeupWord").toString().equalsIgnoreCase("null")) {
            task.setWakeupWord(jSONObject.optString("wakeupWord"));
        }
        try {
            if (!jSONObject.has("startVad") || jSONObject.get("startVad") == null || jSONObject.get("startVad").toString().equalsIgnoreCase("null")) {
                task.setStartVad(null);
            } else {
                task.setStartVad(Boolean.valueOf(jSONObject.optBoolean("startVad")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return task;
    }
}
