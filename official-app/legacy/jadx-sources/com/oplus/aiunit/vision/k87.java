package com.oplus.aiunit.vision;

import com.heytap.health.settings.me.settings2.permission.FeaturePermissionDetailActivity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/k87;", "", "Lcom/oplus/aiunit/vision/iid;", "listener", "", "registerPermChangedListener", "unregisterPermChangeListener", "Lcom/oplus/aiunit/vision/hee;", "permMsg", "a", "", "Ljava/util/List;", "permChangeListeners", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFeaturePermissionListenerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturePermissionListenerManager.kt\ncom/heytap/health/operations/settings/permission/FeaturePermissionListenerManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1855#2,2:31\n*S KotlinDebug\n*F\n+ 1 FeaturePermissionListenerManager.kt\ncom/heytap/health/operations/settings/permission/FeaturePermissionListenerManager\n*L\n24#1:31,2\n*E\n"})
public final class k87 {

    @NotNull
    public static final k87 INSTANCE = new k87();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<iid> permChangeListeners = new ArrayList();

    @JvmStatic
    public static final void a(@NotNull PermMsgHolder permMsg) {
        Intrinsics.checkNotNullParameter(permMsg, "permMsg");
        a7b.f(FeaturePermissionDetailActivity.TAG, "notifyPermsChanged");
        for (iid iidVar : permChangeListeners) {
            a7b.f(FeaturePermissionDetailActivity.TAG, "now notifyPerms:" + iidVar);
            iidVar.b(permMsg);
        }
    }

    @JvmStatic
    public static final void registerPermChangedListener(@NotNull iid listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<iid> list = permChangeListeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @JvmStatic
    public static final void unregisterPermChangeListener(@NotNull iid listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        permChangeListeners.remove(listener);
    }
}
