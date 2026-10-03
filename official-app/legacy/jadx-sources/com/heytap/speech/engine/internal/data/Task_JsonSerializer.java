package com.heytap.speech.engine.internal.data;

import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Task_JsonSerializer implements Serializable {
    public static JSONObject serialize(Task task) throws JSONException {
        if (task == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("audioText", task.getAudioText());
        jSONObject.put("audioUrl", task.getAudioUrl());
        jSONObject.put(EngineConstant.WAKEUP_TYPE_COMMAND, Command_JsonSerializer.serialize(task.getCommand()));
        jSONObject.put("endSessionReason", EndSessionReason_JsonSerializer.serialize(task.getEndSessionReason()));
        jSONObject.put("error", Error_JsonSerializer.serialize(task.getError()));
        jSONObject.put("intentName", task.getIntentName());
        jSONObject.put("listen", task.getListen());
        jSONObject.put("nativeapi", Nativeapi_JsonSerializer.serialize(task.getNativeapi()));
        jSONObject.put("nlg", task.getNlg());
        jSONObject.put("nlu", task.getNlu());
        jSONObject.put(EngineConstant.ONESHOT, task.getOneshot());
        jSONObject.put(SpeechConstant.KEY_RECORD_ID, task.getRecordId());
        jSONObject.put("refText", task.getRefText());
        jSONObject.put("runSequence", task.getRunSequence());
        jSONObject.put("sessionId", task.getSessionId());
        jSONObject.put("shouldEndSession", task.getShouldEndSession());
        jSONObject.put("skillId", task.getSkillId());
        if (task.getSpeakList() != null) {
            JSONArray jSONArray = new JSONArray();
            for (Speak speak : task.getSpeakList()) {
                if (speak != null) {
                    jSONArray.put(Speak_JsonSerializer.serialize(speak));
                }
            }
            jSONObject.put("speakList", jSONArray);
        }
        jSONObject.put("speakType", task.getSpeakType());
        jSONObject.put("speakUrl", task.getSpeakUrl());
        jSONObject.put("speech", task.getSpeech());
        jSONObject.put(EngineConstant.TTS_TYPE_SSML, task.getSsml());
        jSONObject.put("taskId", task.getTaskId());
        jSONObject.put("tips", task.getTips());
        jSONObject.put(EngineConstant.CLOUD_CHECK, task.getCloudCheck());
        jSONObject.put("wakeupWord", task.getWakeupWord());
        jSONObject.put("startVad", task.getStartVad());
        return jSONObject;
    }
}
