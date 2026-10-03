package com.heytap.log.core;

import android.util.Log;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
class CLoganProtocol implements LoganProtocolHandler {
    private static final String LIBRARY_NAME = "heytaplog";
    private static final String TAG = "CLoganProtocol";
    private static boolean sIsCloganOk;
    private boolean mIsLoganInit;
    private boolean mIsLoganOpen;
    private OnLoganProtocolStatus mLoganProtocolStatus;
    private Set<Integer> mArraySet = Collections.synchronizedSet(new HashSet());

    @Keep
    private long nativeConfigPointer = 0;
    private final Object object = new Object();

    static {
        try {
            if (!Util.loadLibrary(LIBRARY_NAME, CLoganProtocol.class)) {
                System.loadLibrary(LIBRARY_NAME);
            }
            sIsCloganOk = true;
        } catch (Throwable unused) {
            sIsCloganOk = false;
        }
    }

    private native void clogan_clean();

    private static native void clogan_debug(boolean z);

    private native void clogan_flush();

    private native int clogan_init(String str, String str2, int i, String str3, String str4, int i2);

    private native int clogan_open(String str);

    private native int clogan_write(int i, String str, long j2, String str2, long j3);

    public static boolean isCloganSuccess() {
        return sIsCloganOk;
    }

    private void loganStatusCode(String str, int i) {
        if (i < 0) {
            if (ConstantCode.CloganStatus.CLOGAN_WRITE_STATUS.endsWith(str) && i != -4060) {
                if (this.mArraySet.contains(Integer.valueOf(i))) {
                    return;
                } else {
                    this.mArraySet.add(Integer.valueOf(i));
                }
            }
            OnLoganProtocolStatus onLoganProtocolStatus = this.mLoganProtocolStatus;
            if (onLoganProtocolStatus != null) {
                onLoganProtocolStatus.loganProtocolStatus(str, i);
            }
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_clean() {
        Object obj;
        synchronized (this.object) {
            try {
                try {
                    clogan_clean();
                    obj = this.object;
                } catch (UnsatisfiedLinkError unused) {
                    Log.e(TAG, "quit exception !");
                    obj = this.object;
                }
                obj.notify();
            } catch (Throwable th) {
                this.object.notify();
                throw th;
            }
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_debug(boolean z) {
        if (this.mIsLoganInit && sIsCloganOk) {
            try {
                clogan_debug(z);
            } catch (UnsatisfiedLinkError e2) {
                Log.e(TAG, "static : " + e2.toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_flush() {
        if (this.mIsLoganOpen && sIsCloganOk) {
            synchronized (this.object) {
                try {
                    try {
                        clogan_flush();
                        this = this.object;
                    } catch (UnsatisfiedLinkError unused) {
                        Log.e(TAG, "flush exception !");
                        this = this.object;
                    }
                    this.notify();
                } catch (Throwable th) {
                    this.object.notify();
                    throw th;
                }
            }
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_init(String str, String str2, int i, String str3, String str4, int i2) {
        if (this.mIsLoganInit) {
            return;
        }
        if (!sIsCloganOk) {
            loganStatusCode(ConstantCode.CloganStatus.CLOGAN_LOAD_SO, ConstantCode.CloganStatus.CLOGAN_LOAD_SO_FAIL);
            return;
        }
        try {
            int iClogan_init = clogan_init(str, str2, i, str3, str4, i2);
            this.mIsLoganInit = true;
            loganStatusCode(ConstantCode.CloganStatus.CLGOAN_INIT_STATUS, iClogan_init);
        } catch (UnsatisfiedLinkError e2) {
            Log.e(TAG, "logan_init : " + e2.toString());
            loganStatusCode(ConstantCode.CloganStatus.CLGOAN_INIT_STATUS, ConstantCode.CloganStatus.CLOGAN_INIT_FAIL_JNI);
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public synchronized void logan_open(String str) {
        if (this.mIsLoganInit && sIsCloganOk) {
            try {
                int iClogan_open = clogan_open(str);
                this.mIsLoganOpen = true;
                loganStatusCode(ConstantCode.CloganStatus.CLOGAN_OPEN_STATUS, iClogan_open);
            } catch (UnsatisfiedLinkError e2) {
                Log.e(TAG, "logan_open : " + e2.toString());
                loganStatusCode(ConstantCode.CloganStatus.CLOGAN_OPEN_STATUS, ConstantCode.CloganStatus.CLOGAN_OPEN_FAIL_JNI);
            }
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_write(int i, String str, long j2, String str2, long j3) {
        Object obj;
        if (this.mIsLoganOpen && sIsCloganOk) {
            synchronized (this.object) {
                try {
                    try {
                        int iClogan_write = clogan_write(i, str, j2, str2, j3);
                        if (iClogan_write != -4010 || Logan.sDebug) {
                            loganStatusCode(ConstantCode.CloganStatus.CLOGAN_WRITE_STATUS, iClogan_write);
                        }
                        obj = this.object;
                    } catch (UnsatisfiedLinkError unused) {
                        loganStatusCode(ConstantCode.CloganStatus.CLOGAN_WRITE_STATUS, ConstantCode.CloganStatus.CLOGAN_WRITE_FAIL_JNI);
                        obj = this.object;
                    }
                    obj.notify();
                } catch (Throwable th) {
                    this.object.notify();
                    throw th;
                }
            }
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.mLoganProtocolStatus = onLoganProtocolStatus;
    }
}
