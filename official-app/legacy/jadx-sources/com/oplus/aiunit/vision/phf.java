package com.oplus.aiunit.vision;

import com.heytap.health.osahssdkself.HealthLogProxy;
import com.heytap.health.osahssdkself.OsahsSDKNative;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "", "Z", "isAlreadyInit", "sleep_release"}, k = 2, mv = {1, 8, 0})
public final class phf {
    public static boolean a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/phf$a", "Lcom/heytap/health/osahssdkself/HealthLogProxy;", "", "p0", "", FragmentStyle.DEBUG, UTraceSQLiteHelperKt.COL_INFO, "error", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements HealthLogProxy {
        @Override // com.heytap.health.osahssdkself.HealthLogProxy
        public void debug(@Nullable String p0) {
        }

        @Override // com.heytap.health.osahssdkself.HealthLogProxy
        public void error(@Nullable String p0) {
            a7b.b("snore_c_log", p0);
        }

        @Override // com.heytap.health.osahssdkself.HealthLogProxy
        public void info(@Nullable String p0) {
            a7b.f("snore_c_log", p0);
        }
    }

    public static final void a() {
        if (a) {
            a7b.f("snore_c_log", "already init health log success");
        } else if (OsahsSDKNative.initHealthLog(new a()) == 0) {
            a7b.f("snore_c_log", "init health log success");
            a = true;
        }
    }
}
