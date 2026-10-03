package com.heytap.log.formatter;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.collect.auto.SystemInfoCollect;
import com.heytap.log.util.AppUtil;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class CollectFormatter implements ICollectFormatter {
    private String getExtra(LoggingEvent loggingEvent) {
        String key;
        StringBuilder sb = new StringBuilder();
        if (loggingEvent.getExtras() != null) {
            Iterator<Map.Entry<String, String>> it = loggingEvent.getExtras().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String value = null;
                try {
                    key = next.getKey();
                    try {
                        value = next.getValue();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    key = null;
                }
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    if (SystemInfoCollect.RAM_SIZE.equals(key)) {
                        value = unitFormat(value) + "GB";
                    }
                    if (SystemInfoCollect.INTERNAL_FREESPACE.equals(key)) {
                        value = unitFormat(value) + "GB";
                    }
                    sb.append(key);
                    sb.append(":");
                    sb.append(value);
                    if (it.hasNext()) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("|");
        }
        return sb.toString();
    }

    private String unitFormat(String str) {
        long j2;
        try {
            j2 = Long.parseLong(str);
        } catch (Throwable unused) {
            j2 = 0;
        }
        return new DecimalFormat("##.##").format(j2 / 1048576.0f);
    }

    @Override // com.heytap.log.formatter.ICollectFormatter
    public String format(LoggingEvent loggingEvent) {
        if (loggingEvent == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(loggingEvent.getThreadName())) {
                sb.append(loggingEvent.getThreadName());
                sb.append("|");
            }
            sb.append(getExtra(loggingEvent));
            sb.append(loggingEvent.getMessage());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogFieldKey.MESSAGE_KEY, sb.toString());
            jSONObject.put("t", loggingEvent.getTag());
            jSONObject.put(LogFieldKey.LEVEL_KEY, (int) loggingEvent.getPriority());
            jSONObject.put(LogFieldKey.PROCESS_NAME_KEY, AppUtil.myProcessName(AppUtil.getAppContext()));
            jSONObject.put("pid", Process.myPid());
            return jSONObject.toString();
        } catch (Exception e2) {
            Log.e("CollectFormatter", "format : " + e2.toString());
            return "format exception:" + e2.toString();
        }
    }
}
