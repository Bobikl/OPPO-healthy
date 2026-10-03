package com.heytap.accessory.pair.common;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class TimeOutMonitor implements Handler.Callback {
    private static final int MSG_TIMEOUT = 1;
    public static final String TAG = "TimeOutMonitor";
    private static final String THREAD_NAME = "tom";
    private static final long TIMEOUT_NORMAL = 30000;
    private static final long TIMEOUT_USER_CONFIRM = 40000;
    private static final long TIMEOUT_USER_INPUT = 60000;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_USER_CONFIRM = 2;
    public static final int TYPE_USER_INPUT = 3;
    private Callback mCallback;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private boolean mIsStarted = false;
    private String mMsg;
    private String mTag;

    public interface Callback {
        void onTimeOut(String str, String str2);
    }

    public TimeOutMonitor(String str, @NonNull Callback callback) {
        this.mTag = str;
        this.mCallback = callback;
    }

    public synchronized void endTiming() {
        PairLog.i(TAG, "end timing for:" + this.mMsg);
        if (this.mIsStarted) {
            this.mHandler.removeMessages(1);
            this.mHandlerThread.quit();
            this.mIsStarted = false;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1) {
            PairLog.w(TAG, SensitiveLogUtils.toHiddenIfNeed(this.mTag) + " encounter timeout for:" + this.mMsg);
            this.mCallback.onTimeOut(this.mTag, this.mMsg);
        }
        return true;
    }

    public synchronized void startCustomizedTiming(long j, String str) {
        if (!this.mIsStarted) {
            HandlerThread handlerThread = new HandlerThread("tom-" + this.mTag);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper(), this);
            this.mIsStarted = true;
        }
        this.mHandler.removeMessages(1);
        this.mMsg = str;
        PairLog.i(TAG, "start timing for:" + this.mMsg);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(1, this.mMsg), j);
    }

    public void startTiming(int i, String str) {
        long j;
        if (i == 1) {
            j = TIMEOUT_NORMAL;
        } else if (i != 2) {
            j = i != 3 ? 0L : 60000L;
        } else {
            j = TIMEOUT_USER_CONFIRM;
        }
        startCustomizedTiming(j, str);
    }
}
