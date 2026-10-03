package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import androidx.annotation.RequiresApi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/p5h;", "", "Landroid/content/Context;", "context", "", "shortcutId", "", "b", "a", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShortcutDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutDetector.kt\ncom/oplus/pay/opensdk/taskwall/util/ShortcutDetector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1747#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 ShortcutDetector.kt\ncom/oplus/pay/opensdk/taskwall/util/ShortcutDetector\n*L\n35#1:70,3\n48#1:73\n48#1:74,3\n*E\n"})
public final class p5h {

    @NotNull
    public static final p5h INSTANCE = new p5h();

    @RequiresApi(26)
    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("shortcut");
            ShortcutManager shortcutManager = systemService instanceof ShortcutManager ? (ShortcutManager) systemService : null;
            return shortcutManager != null && shortcutManager.isRequestPinShortcutSupported();
        } catch (Exception unused) {
            return false;
        }
    }

    @RequiresApi(26)
    public final boolean b(@NotNull Context context, @NotNull String shortcutId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        try {
            Object systemService = context.getSystemService("shortcut");
            ShortcutManager shortcutManager = systemService instanceof ShortcutManager ? (ShortcutManager) systemService : null;
            List<ShortcutInfo> pinnedShortcuts = shortcutManager != null ? shortcutManager.getPinnedShortcuts() : null;
            if (pinnedShortcuts == null) {
                pinnedShortcuts = CollectionsKt.emptyList();
            }
            List<ShortcutInfo> list = pinnedShortcuts;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ShortcutInfo) it.next()).getId(), shortcutId)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
