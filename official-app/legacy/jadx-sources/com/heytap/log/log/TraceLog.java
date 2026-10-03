package com.heytap.log.log;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.appender.ILogAppender;
import com.heytap.log.collect.ActivityLifeMonitor;
import com.heytap.log.config.DynConfigManager;

/* JADX INFO: loaded from: classes19.dex */
public class TraceLog extends BaseSimpleLog {
    private static final String TRACE_TAG = "trace_info";
    private final ILogAppender mAppender;
    private ActivityLifeMonitor monitor;

    public TraceLog(ILogAppender iLogAppender, DynConfigManager dynConfigManager, ActivityLifeMonitor activityLifeMonitor) {
        this.mAppender = iLogAppender;
        this.dynConfigManager = dynConfigManager;
        this.monitor = activityLifeMonitor;
    }

    private void log2File(String str, String str2, byte b) {
        ILogAppender iLogAppender;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iLogAppender = this.mAppender) == null) {
            return;
        }
        iLogAppender.append(str, str2, b, getLogType());
    }

    @Override // com.heytap.log.log.BaseSimpleLog
    public void checkAndLog(LogBean logBean) {
    }

    @Override // com.heytap.log.log.BaseSimpleLog, com.heytap.log.IBaseLog
    public int getLogType() {
        return 105;
    }

    @Override // com.heytap.log.log.BaseSimpleLog
    public void checkAndLog(String str, String str2, boolean z, byte b) {
        if (TextUtils.isEmpty(str)) {
            str = TRACE_TAG;
        }
        ActivityLifeMonitor activityLifeMonitor = this.monitor;
        if (activityLifeMonitor != null && !activityLifeMonitor.isForeground()) {
            str = str + "_back";
        }
        if (this.dynConfigManager.isPrint(b)) {
            log2File(str, str2, b);
        }
        if (this.dynConfigManager.isShow(b)) {
            if (b == 1) {
                Log.v(str, str2);
                return;
            }
            if (b == 2) {
                Log.d(str, str2);
                return;
            }
            if (b == 3) {
                Log.i(str, str2);
            } else if (b == 4) {
                Log.w(str, str2);
            } else {
                if (b != 5) {
                    return;
                }
                Log.e(str, str2);
            }
        }
    }
}
