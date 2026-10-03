package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class ipm implements w7i.a {
    public final boolean a;

    public ipm(boolean z) {
        this.a = z;
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void a(String str, String str2, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        Log.i(str, str2);
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void b(String str, Throwable th, String str2, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        Log.e(str, str2 + "  " + Log.getStackTraceString(th));
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void c(String str, String str2, Object... objArr) {
        if (this.a) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.d(str, str2);
        }
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void d(String str, String str2, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void e(String str, String str2, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        Log.w(str, str2);
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    @Override // com.oplus.aiunit.vision.w7i.a
    public void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
