package com.heytap.log.collect.auto;

import android.content.Context;
import android.os.Build;
import com.heytap.log.IBaseLog;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.log.ICollectLog;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.BaseInfoUtil;
import com.heytap.log.util.DeviceMemoryUtil;
import com.heytap.log.util.DeviceUtil;
import com.heytap.log.util.ThreadUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class SystemInfoCollect implements IDataCollect, IBaseLog {
    public static final String APP_VERSION = "App_version";
    public static final String APP_VERSIONCODE = "App_versioncode";
    public static final String BASEINFO_TAG = "BASE_INFO";
    public static final String BRAND_OS_VERSION = "BrandOS_version";
    public static final String IMEI = "IMEI";
    public static final String INTERNAL_FREESPACE = "InternalFreeSpace";
    public static final String MODEL = "Model";
    public static final String RAM_SIZE = "RAMSize";
    public static final String ROM_VERSION = "ROM_version";
    public static final String SDK_VERSION = "SDK_version";
    private ICollectLog mAppender;
    private SimpleLog mSimpleLog;

    public SystemInfoCollect(ICollectLog iCollectLog) {
        this.mAppender = iCollectLog;
    }

    private void appendBaseInfo(final Context context) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.collect.auto.SystemInfoCollect.1
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap();
                map.put("Model", Build.PRODUCT);
                map.put(SystemInfoCollect.BRAND_OS_VERSION, DeviceUtil.getMobileRomVersion());
                map.put(SystemInfoCollect.SDK_VERSION, Build.VERSION.RELEASE);
                map.put(SystemInfoCollect.ROM_VERSION, Build.DISPLAY);
                map.put(SystemInfoCollect.RAM_SIZE, String.valueOf(DeviceMemoryUtil.getSysMemoryInfo().get("MemTotal:")));
                map.put(SystemInfoCollect.INTERNAL_FREESPACE, String.valueOf(BaseInfoUtil.getInternalFreeSpace() / 1024));
                map.put(SystemInfoCollect.APP_VERSION, AppUtil.getAppVersionName(context));
                map.put(SystemInfoCollect.APP_VERSIONCODE, String.valueOf(AppUtil.getAppVersionCode(context)));
                if (SystemInfoCollect.this.mAppender != null) {
                    LoggingEvent loggingEvent = new LoggingEvent(SystemInfoCollect.BASEINFO_TAG, "record_base_info", (byte) 4, null, map, null);
                    if (SystemInfoCollect.this.mSimpleLog != null) {
                        SystemInfoCollect.this.mSimpleLog.append(loggingEvent, SystemInfoCollect.this.getLogType());
                    } else {
                        SystemInfoCollect.this.mAppender.append(loggingEvent, SystemInfoCollect.this.getLogType());
                    }
                }
            }
        });
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void destroy(Context context) {
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 104;
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void init(Context context) {
        appendBaseInfo(context);
    }

    public SystemInfoCollect(ICollectLog iCollectLog, SimpleLog simpleLog) {
        this.mAppender = iCollectLog;
        this.mSimpleLog = simpleLog;
    }
}
