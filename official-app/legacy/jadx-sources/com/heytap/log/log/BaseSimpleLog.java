package com.heytap.log.log;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.IBaseLog;
import com.heytap.log.ISimpleLog;
import com.heytap.log.collect.ActivityLifeMonitor;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.config.LogMemoryConfig;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseSimpleLog implements IBaseLog, ISimpleLog {
    protected DynConfigManager dynConfigManager;
    protected LogProcessor mLogProcessor;
    protected ActivityLifeMonitor monitor;
    private int mFileLogLevel = 1;
    private int mConsoleLogLevel = 1;

    public interface BatchCallback {
        void onBatch(String str);
    }

    public BaseSimpleLog() {
    }

    private String cvtMessage(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processAndSendLog$1(byte b, String str, boolean z, String str2) {
        this.mLogProcessor.sendLogInfo(new LogBean(b, str, str2, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: printChunk, reason: merged with bridge method [inline-methods] */
    public void lambda$showConsole$0(int i, String str, String str2) {
        if (i == 1) {
            Log.v(str, str2);
            return;
        }
        if (i == 2) {
            Log.d(str, str2);
            return;
        }
        if (i == 3) {
            Log.i(str, str2);
        } else if (i == 4) {
            Log.w(str, str2);
        } else {
            if (i != 5) {
                return;
            }
            Log.e(str, str2);
        }
    }

    private void processAndSendLog(final byte b, final String str, String str2, final boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str2.length() > 25600) {
            str2 = str2.substring(0, LogMemoryConfig.MAX_MESSAGE_LENGTH) + LogMemoryConfig.LOG_ELLIPSIS;
        }
        splitMessageWithMarkers(str2, new BatchCallback() { // from class: com.heytap.log.log.a
            @Override // com.heytap.log.log.BaseSimpleLog.BatchCallback
            public final void onBatch(String str3) {
                this.a.lambda$processAndSendLog$1(b, str, z, str3);
            }
        });
    }

    private void showConsole(final int i, final String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        DynConfigManager dynConfigManager = this.dynConfigManager;
        boolean zIsShow = dynConfigManager == null ? true : dynConfigManager.isShow(i);
        if (z || zIsShow) {
            if (str2.length() > 25600) {
                str2 = str2.substring(0, LogMemoryConfig.MAX_MESSAGE_LENGTH) + LogMemoryConfig.LOG_ELLIPSIS;
            }
            splitMessageWithMarkers(str2, new BatchCallback() { // from class: com.heytap.log.log.b
                @Override // com.heytap.log.log.BaseSimpleLog.BatchCallback
                public final void onBatch(String str3) {
                    this.a.lambda$showConsole$0(i, str, str3);
                }
            });
        }
    }

    private void splitMessageWithMarkers(String str, BatchCallback batchCallback) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length <= 3980) {
            batchCallback.onBatch(str);
            return;
        }
        int iCeil = (int) Math.ceil(((double) length) / ((double) 3980));
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i2++;
            int iMin = Math.min(i + 3980, length);
            while (iMin < length && (bytes[iMin] & 192) == 128) {
                iMin--;
            }
            int i3 = iMin - i;
            byte[] bArr = new byte[i3];
            System.arraycopy(bytes, i, bArr, 0, i3);
            batchCallback.onBatch(new String(bArr, StandardCharsets.UTF_8) + String.format("[%d/%d] ", Integer.valueOf(i2), Integer.valueOf(iCeil)));
            i = iMin;
        }
    }

    public abstract void checkAndLog(LogBean logBean);

    public abstract void checkAndLog(String str, String str2, boolean z, byte b);

    @Override // com.heytap.log.ISimpleLog
    public void d(String str, String str2) {
        showConsole(2, str, str2, false);
        if (this.mLogProcessor == null) {
            checkAndLog(str, str2, this.mConsoleLogLevel != 6, (byte) 2);
            return;
        }
        String strCvtMessage = cvtMessage(str);
        if (this.mLogProcessor.canWriteLog()) {
            processAndSendLog((byte) 2, strCvtMessage, str2, false);
        }
    }

    @Override // com.heytap.log.ISimpleLog
    public void e(String str, String str2) {
        showConsole(5, str, str2, false);
        if (this.mLogProcessor == null) {
            checkAndLog(str, str2, this.mConsoleLogLevel != 6, (byte) 5);
            return;
        }
        String strCvtMessage = cvtMessage(str);
        if (this.mLogProcessor.canWriteLog()) {
            processAndSendLog((byte) 5, strCvtMessage, str2, false);
        }
    }

    public int getConsoleLogLevel() {
        return this.mConsoleLogLevel;
    }

    public int getFileLogLevel() {
        return this.mFileLogLevel;
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 101;
    }

    @Override // com.heytap.log.ISimpleLog
    public void i(String str, String str2) {
        showConsole(3, str, str2, false);
        if (this.mLogProcessor == null) {
            checkAndLog(str, str2, this.mConsoleLogLevel != 6, (byte) 3);
            return;
        }
        String strCvtMessage = cvtMessage(str);
        if (this.mLogProcessor.canWriteLog()) {
            processAndSendLog((byte) 3, strCvtMessage, str2, false);
        }
    }

    public void setConsoleLogLevel(int i) {
        this.mConsoleLogLevel = i;
    }

    public void setFileLogLevel(int i) {
        this.mFileLogLevel = i;
    }

    @Override // com.heytap.log.ISimpleLog
    public void v(String str, String str2) {
        showConsole(1, str, str2, false);
        if (this.mLogProcessor == null) {
            checkAndLog(str, str2, this.mConsoleLogLevel != 6, (byte) 1);
            return;
        }
        String strCvtMessage = cvtMessage(str);
        if (this.mLogProcessor.canWriteLog()) {
            processAndSendLog((byte) 1, strCvtMessage, str2, false);
        }
    }

    @Override // com.heytap.log.ISimpleLog
    public void w(String str, String str2) {
        showConsole(4, str, str2, false);
        if (this.mLogProcessor == null) {
            checkAndLog(str, str2, this.mConsoleLogLevel != 6, (byte) 4);
            return;
        }
        String strCvtMessage = cvtMessage(str);
        if (this.mLogProcessor.canWriteLog()) {
            processAndSendLog((byte) 4, strCvtMessage, str2, false);
        }
    }

    public BaseSimpleLog(LogProcessor logProcessor) {
        this.mLogProcessor = logProcessor;
    }

    @Override // com.heytap.log.ISimpleLog
    public void d(String str, String str2, boolean z) {
        showConsole(2, str, str2, z);
        if (this.mLogProcessor != null) {
            String strCvtMessage = cvtMessage(str);
            if (this.mLogProcessor.canWriteLog()) {
                processAndSendLog((byte) 2, strCvtMessage, str2, z);
                return;
            }
            return;
        }
        checkAndLog(str, str2, z, (byte) 2);
    }

    @Override // com.heytap.log.ISimpleLog
    public void e(String str, String str2, boolean z) {
        showConsole(5, str, str2, z);
        if (this.mLogProcessor != null) {
            String strCvtMessage = cvtMessage(str);
            if (this.mLogProcessor.canWriteLog()) {
                processAndSendLog((byte) 5, strCvtMessage, str2, z);
                return;
            }
            return;
        }
        checkAndLog(str, str2, z, (byte) 5);
    }

    @Override // com.heytap.log.ISimpleLog
    public void i(String str, String str2, boolean z) {
        showConsole(3, str, str2, z);
        if (this.mLogProcessor != null) {
            String strCvtMessage = cvtMessage(str);
            if (this.mLogProcessor.canWriteLog()) {
                processAndSendLog((byte) 3, strCvtMessage, str2, z);
                return;
            }
            return;
        }
        checkAndLog(str, str2, z, (byte) 3);
    }

    @Override // com.heytap.log.ISimpleLog
    public void v(String str, String str2, boolean z) {
        showConsole(1, str, str2, z);
        if (this.mLogProcessor != null) {
            String strCvtMessage = cvtMessage(str);
            if (this.mLogProcessor.canWriteLog()) {
                processAndSendLog((byte) 1, strCvtMessage, str2, z);
                return;
            }
            return;
        }
        checkAndLog(str, str2, z, (byte) 1);
    }

    @Override // com.heytap.log.ISimpleLog
    public void w(String str, String str2, boolean z) {
        showConsole(4, str, str2, z);
        if (this.mLogProcessor != null) {
            String strCvtMessage = cvtMessage(str);
            if (this.mLogProcessor.canWriteLog()) {
                processAndSendLog((byte) 4, strCvtMessage, str2, z);
                return;
            }
            return;
        }
        checkAndLog(str, str2, z, (byte) 4);
    }
}
