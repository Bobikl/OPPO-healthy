package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.xingin.xhssharesdk.XhsShareSdkTools;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class gdm {

    @NonNull
    public final String a;

    @NonNull
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f11730c;

    @NonNull
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final String f11731e;

    public gdm(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5) {
        this.f11730c = str;
        this.a = str2;
        this.f11731e = str3;
        this.d = str4;
        this.b = str5;
    }

    @WorkerThread
    public final void a(@NonNull HashMap map) {
        String strMd5 = XhsShareSdkTools.md5(this.a + this.f11730c + this.b);
        map.put("app_package", this.a);
        map.put("timestamp", this.b);
        map.put("token", strMd5);
        map.put("sdk_version", this.d);
        map.put("app_version", this.f11731e);
    }
}
