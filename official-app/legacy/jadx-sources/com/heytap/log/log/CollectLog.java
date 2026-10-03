package com.heytap.log.log;

import android.text.TextUtils;
import com.heytap.log.IBaseLog;
import com.heytap.log.appender.ILogAppender;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.collect.auto.SystemInfoCollect;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class CollectLog implements IBaseLog, ICollectLog {
    private final ILogAppender mAppender;

    public CollectLog(ILogAppender iLogAppender) {
        this.mAppender = iLogAppender;
    }

    private String getAutoCollectLog(LoggingEvent loggingEvent) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(loggingEvent.getThreadName())) {
            sb.append(loggingEvent.getThreadName());
            sb.append("|");
        }
        sb.append(getExtra(loggingEvent));
        sb.append(loggingEvent.getMessage());
        return sb.toString();
    }

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

    @Override // com.heytap.log.log.ICollectLog
    public void append(LoggingEvent loggingEvent, int i) {
        if (loggingEvent == null || this.mAppender == null || !(loggingEvent.getMessage() instanceof String)) {
            return;
        }
        this.mAppender.append(loggingEvent.getTag(), getAutoCollectLog(loggingEvent), loggingEvent.getPriority(), i);
    }

    @Override // com.heytap.log.log.ICollectLog
    public void appendSync(LoggingEvent loggingEvent, int i) {
        if (loggingEvent == null || this.mAppender == null || !(loggingEvent.getMessage() instanceof String)) {
            return;
        }
        this.mAppender.append(loggingEvent.getTag(), getAutoCollectLog(loggingEvent), loggingEvent.getPriority(), i);
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 104;
    }
}
