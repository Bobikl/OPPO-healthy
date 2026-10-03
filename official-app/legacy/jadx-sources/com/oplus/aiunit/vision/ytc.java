package com.oplus.aiunit.vision;

import android.os.RemoteCallbackList;
import com.oplus.ocs.wearengine.aidl.INodeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007R?\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bj\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f`\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ytc;", "", "", "packageName", "", "Lcom/oplus/ocs/wearengine/aidl/INodeListener;", "a", "listener", "", "c", "d", "Ljava/util/HashMap;", "Landroid/os/RemoteCallbackList;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "b", "()Ljava/util/HashMap;", "MAP", "Ljava/util/Set;", "EMPTY", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ytc {

    @NotNull
    public static final ytc INSTANCE = new ytc();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, RemoteCallbackList<INodeListener>> MAP = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<INodeListener> EMPTY = SetsKt__SetsKt.emptySet();

    @JvmStatic
    @NotNull
    public static final synchronized Set<INodeListener> a(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        RemoteCallbackList<INodeListener> remoteCallbackList = MAP.get(packageName);
        if (remoteCallbackList == null) {
            return EMPTY;
        }
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        HashSet hashSet = new HashSet(iBeginBroadcast);
        for (int i = 0; i < iBeginBroadcast; i++) {
            hashSet.add(remoteCallbackList.getBroadcastItem(i));
        }
        remoteCallbackList.finishBroadcast();
        return hashSet;
    }

    @JvmStatic
    public static final synchronized void c(@NotNull String packageName, @NotNull INodeListener listener) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        HashMap<String, RemoteCallbackList<INodeListener>> map = MAP;
        RemoteCallbackList<INodeListener> remoteCallbackList = map.get(packageName);
        if (remoteCallbackList == null) {
            remoteCallbackList = new RemoteCallbackList<>();
            map.put(packageName, remoteCallbackList);
        }
        remoteCallbackList.register(listener);
    }

    @JvmStatic
    public static final synchronized void d(@NotNull String packageName, @NotNull INodeListener listener) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RemoteCallbackList<INodeListener> remoteCallbackList = MAP.get(packageName);
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(listener);
        }
    }

    @NotNull
    public final HashMap<String, RemoteCallbackList<INodeListener>> b() {
        return MAP;
    }
}
