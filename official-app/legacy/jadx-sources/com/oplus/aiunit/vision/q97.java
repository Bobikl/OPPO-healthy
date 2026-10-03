package com.oplus.aiunit.vision;

import android.os.Build;
import android.text.TextUtils;
import android.util.ArraySet;
import io.protostuff.MapSchema;
import java.util.BitSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H&J&\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0004J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0004J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0004R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/q97;", "", "", MapSchema.FIELD_NAME_ENTRY, "", "ssid", "preSharedKey", "Ljava/util/BitSet;", "allowedKeyManagement", "", "c", "", "a", "b", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/jwl;", "Landroid/util/ArraySet;", "d", "()Landroid/util/ArraySet;", "wifiRecords", "<init>", "()V", "Companion", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class q97 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArraySet<WifiRecord> wifiRecords = new ArraySet<>();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.q97$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/q97$a;", "", "Lcom/oplus/aiunit/vision/q97;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final q97 a() {
            if (!ilj.x()) {
                a7b.f("Fetcher", "[getFetcher] --> non linkage rom");
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i <= 29) {
                a7b.f("Fetcher", "[getFetcher] --> smaller than Q");
                return null;
            }
            if (i > 34) {
                return new s6e();
            }
            return i >= 31 ? new gkd() : new kr3();
        }
    }

    public final int a(@NotNull BitSet allowedKeyManagement) {
        Intrinsics.checkNotNullParameter(allowedKeyManagement, "allowedKeyManagement");
        if (allowedKeyManagement.get(14)) {
            return 8;
        }
        int i = 13;
        if (allowedKeyManagement.get(13)) {
            return 7;
        }
        int i2 = 10;
        if (allowedKeyManagement.get(10)) {
            return 5;
        }
        if (!allowedKeyManagement.get(17)) {
            i = 9;
            if (allowedKeyManagement.get(9)) {
                return 6;
            }
            if (allowedKeyManagement.get(8)) {
                return 4;
            }
            if (!allowedKeyManagement.get(5)) {
                i2 = 2;
                if (!allowedKeyManagement.get(4) && !allowedKeyManagement.get(11)) {
                    if (allowedKeyManagement.get(2) || allowedKeyManagement.get(12)) {
                        if (!allowedKeyManagement.get(12) && !allowedKeyManagement.get(2) && !allowedKeyManagement.get(3)) {
                            return 3;
                        }
                    } else if (!allowedKeyManagement.get(1)) {
                        allowedKeyManagement.get(0);
                        return 0;
                    }
                }
            }
            return i2;
        }
        return i;
    }

    public final int b(@NotNull BitSet allowedKeyManagement) {
        char c2;
        Intrinsics.checkNotNullParameter(allowedKeyManagement, "allowedKeyManagement");
        if (allowedKeyManagement.get(0) && allowedKeyManagement.get(2)) {
            c2 = 5;
        } else if (allowedKeyManagement.get(2)) {
            c2 = 4;
        } else if (allowedKeyManagement.get(0) && allowedKeyManagement.get(1)) {
            c2 = 3;
        } else if (allowedKeyManagement.get(1)) {
            c2 = 2;
        } else {
            c2 = allowedKeyManagement.get(0) ? (char) 1 : (char) 0;
        }
        if (c2 == 1 || c2 == 2) {
            return 2;
        }
        if (c2 != 3) {
            return (c2 == 4 || c2 != 5) ? 0 : 6;
        }
        return 4;
    }

    public final boolean c(@Nullable String ssid, @Nullable String preSharedKey, @Nullable BitSet allowedKeyManagement) {
        if (TextUtils.isEmpty(ssid) || TextUtils.isEmpty(preSharedKey)) {
            return false;
        }
        if (allowedKeyManagement != null && (allowedKeyManagement.get(2) || allowedKeyManagement.get(3))) {
            return false;
        }
        if (TextUtils.isEmpty(ssid)) {
            return true;
        }
        Intrinsics.checkNotNull(ssid);
        return !StringsKt__StringsJVMKt.startsWith$default(ssid, "\"DIRECT-", false, 2, null);
    }

    @NotNull
    public final ArraySet<WifiRecord> d() {
        return this.wifiRecords;
    }

    public abstract void e();
}
