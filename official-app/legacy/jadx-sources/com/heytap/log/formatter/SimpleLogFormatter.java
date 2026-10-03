package com.heytap.log.formatter;

import android.os.Process;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.heytap.log.util.AppUtil;

/* JADX INFO: loaded from: classes19.dex */
public class SimpleLogFormatter implements ISimpleFormatter {
    private final Gson gson = new Gson();

    @Override // com.heytap.log.formatter.ISimpleFormatter
    public String format(String str, String str2, byte b, StackTraceElement stackTraceElement) {
        JsonObject jsonObject = new JsonObject();
        try {
            String strMyProcessName = AppUtil.myProcessName(AppUtil.getAppContext());
            jsonObject.addProperty(LogFieldKey.MESSAGE_KEY, str2);
            jsonObject.addProperty("t", str);
            jsonObject.addProperty(LogFieldKey.LEVEL_KEY, Byte.valueOf(b));
            jsonObject.addProperty(LogFieldKey.PROCESS_NAME_KEY, strMyProcessName);
            jsonObject.addProperty("pid", Integer.valueOf(Process.myPid()));
            return this.gson.toJson((JsonElement) jsonObject);
        } catch (Exception e2) {
            Log.e("SimpleLogFormatter", "format : " + e2);
            return "";
        }
    }
}
