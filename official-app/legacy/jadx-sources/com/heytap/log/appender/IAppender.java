package com.heytap.log.appender;

import com.heytap.log.Settings;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.uploader.UploadManager;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface IAppender {
    void append(LoggingEvent loggingEvent);

    void appendSync(LoggingEvent loggingEvent);

    void appenderFlush(boolean z);

    void checkAndUpload(UploadManager uploadManager, String str, Map<String, String> map);

    void exit();

    Settings getSettings();

    void setName(String str);

    void setSettings(Settings settings);

    void upload(UploadManager uploadManager, String str, String str2, long j2, long j3, boolean z);

    void upload(UploadManager uploadManager, String str, Map<String, String> map, long j2, long j3, boolean z, String str2);
}
