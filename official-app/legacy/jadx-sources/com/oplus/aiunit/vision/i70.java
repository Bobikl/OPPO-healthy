package com.oplus.aiunit.vision;

import android.os.IInterface;
import androidx.annotation.NonNull;
import com.heytap.health.annotation.ProcessName;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes2.dex */
public class i70 {
    public final Class<? extends cm9<? extends IInterface>> a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProcessName f12405c;
    public final Semaphore d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g91 f12406e;

    public i70(Class<? extends cm9<? extends IInterface>> cls, String str, ProcessName processName, int i, g91 g91Var) {
        this.a = cls;
        this.b = str;
        this.f12405c = processName;
        this.d = new Semaphore(i);
        this.f12406e = g91Var;
    }

    @NonNull
    public String toString() {
        return this.b + " -> " + this.a + " proc=" + this.f12405c + " strategy=" + this.f12406e;
    }
}
