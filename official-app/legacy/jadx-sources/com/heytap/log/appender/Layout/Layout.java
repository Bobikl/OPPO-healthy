package com.heytap.log.appender.Layout;

import android.text.TextUtils;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.collect.auto.SystemInfoCollect;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public abstract class Layout {
    private String unitFormat(String str) {
        long j2;
        try {
            j2 = Long.parseLong(str);
        } catch (Throwable unused) {
            j2 = 0;
        }
        return new DecimalFormat("##.##").format(j2 / 1048576.0f);
    }

    public abstract String format(LoggingEvent loggingEvent);

    public String getContentType() {
        return "text/plain";
    }

    public String getExtra(LoggingEvent loggingEvent) {
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
}
