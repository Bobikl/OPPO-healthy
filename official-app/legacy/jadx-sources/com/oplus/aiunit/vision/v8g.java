package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.heytap.health.annotation.ProcessName;
import com.oplus.health.apiprovider.host.ServiceManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v8g extends ContentProvider {
    private final String TAG;
    private final ProcessName mProcessName;

    public v8g(ProcessName processName) {
        this.mProcessName = processName;
        this.TAG = "SMProvider@" + processName.name();
    }

    private void checkRuntime(Context context) {
        if (!this.mProcessName.mSupportProviderApi) {
            throw new IllegalArgumentException("please config mSupportProviderApi to true in mProcessName#" + this.mProcessName + " this=" + this);
        }
        String strReplace = gxe.c().replace(context.getPackageName(), "");
        if (TextUtils.equals(strReplace, this.mProcessName.mPName)) {
            return;
        }
        throw new IllegalArgumentException("ProcessName" + this.mProcessName + ".mPName=" + this.mProcessName.mPName + ", but current processSuffix=" + strReplace + " this=" + this);
    }

    private ServiceManager getSmStub(Context context) {
        return ServiceManager.getInstance(context, this.mProcessName);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        getSmStub(getContext()).dump(fileDescriptor, printWriter, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (!qe0.E()) {
            checkRuntime(context);
        }
        a7b.f(this.TAG, "onCreate: " + context);
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        getSmStub(getContext()).onTrimMemory(i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str3 = "query:  selection=" + str + " caller=" + Binder.getCallingPid();
        gwj.b(2000L, str3);
        MatrixCursor matrixCursor = new MatrixCursor(new String[0], 1);
        try {
            Bundle bundle = new Bundle();
            if (TextUtils.equals("ISM", str)) {
                bundle.putBinder("ISM", getSmStub(getContext()));
            }
            matrixCursor.setExtras(bundle);
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            gwj.d();
            a7b.f(this.TAG, str3 + " delay=" + jUptimeMillis2);
            matrixCursor.close();
            return matrixCursor;
        } catch (Throwable th) {
            try {
                matrixCursor.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
