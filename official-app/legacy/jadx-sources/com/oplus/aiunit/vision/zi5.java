package com.oplus.aiunit.vision;

import android.os.Build;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0002\u001a\u00020\u0000H\u0002\u001a\b\u0010\u0003\u001a\u00020\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t8\u0006¢\u0006\f\n\u0004\b\u0001\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "a", "c", "b", "d", "", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getLimitList", "()Ljava/util/ArrayList;", "limitList", "sleep_release"}, k = 2, mv = {1, 8, 0})
public final class zi5 {

    @NotNull
    public static final String TAG = "DeviceInfoUtils";

    @NotNull
    public static final ArrayList<String> a = CollectionsKt__CollectionsKt.arrayListOf("PHN110", "PGU110", "PKH120", "PFEM10", "PGEM10", "PHY110", "PHZ110", "PKC110", "PKC130", "PKB110", "PJJ110", "PJW110");

    public static final boolean a() {
        boolean z = c() || b() || d();
        a7b.f(TAG, "unprocessed:" + z);
        return z;
    }

    public static final boolean b() {
        if (!StringsKt__StringsJVMKt.equals("PHB110", Build.MODEL, true)) {
            return false;
        }
        a7b.f(TAG, "isOnePlus11");
        return true;
    }

    public static final boolean c() {
        if (!StringsKt__StringsJVMKt.equals("LE2100", Build.MODEL, true)) {
            return false;
        }
        a7b.f(TAG, "isOnePlus9R");
        return true;
    }

    public static final boolean d() {
        return a.contains(Build.MODEL);
    }
}
