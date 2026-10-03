package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.processor.bean.AppListBean;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0017j\b\u0012\u0004\u0012\u00020\t`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/i2m;", "", "Lcom/heytap/health/devicemanager/processor/bean/AppListBean;", "appListBean", "", "a", "other", "", "equals", "", "hashCode", "Lcom/oplus/aiunit/vision/ja5;", "Lcom/oplus/aiunit/vision/ja5;", "b", "()Lcom/oplus/aiunit/vision/ja5;", "deviceAppListChangeListener", "", "Ljava/lang/String;", "getMac", "()Ljava/lang/String;", "mac", "c", "TAG", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "d", "Ljava/util/LinkedHashSet;", "appIds", "Ljava/util/LinkedList;", "Lcom/oplus/aiunit/vision/ka5;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/LinkedList;", "preStatusList", "f", "currStatusList", "<init>", "(Lcom/oplus/aiunit/vision/ja5;Ljava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWrapperDeviceAppListChangeListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapperDeviceAppListChangeListener.kt\ncom/heytap/health/devicemanager/client/listener/WrapperDeviceAppListChangeListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n1855#2,2:91\n*S KotlinDebug\n*F\n+ 1 WrapperDeviceAppListChangeListener.kt\ncom/heytap/health/devicemanager/client/listener/WrapperDeviceAppListChangeListener\n*L\n33#1:89,2\n51#1:91,2\n*E\n"})
public final class i2m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ja5 deviceAppListChangeListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String mac;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<Integer> appIds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedList<ka5> preStatusList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<ka5> currStatusList;

    public i2m(@NotNull ja5 deviceAppListChangeListener, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(deviceAppListChangeListener, "deviceAppListChangeListener");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.deviceAppListChangeListener = deviceAppListChangeListener;
        this.mac = mac;
        this.TAG = "WrapperDeviceAppListChangeListener";
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        this.appIds = linkedHashSet;
        this.currStatusList = new LinkedList<>();
        deviceAppListChangeListener.D3(linkedHashSet);
        LinkedList<ka5> linkedList = new LinkedList<>();
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
            linkedList.add(ka5.d.INSTANCE);
        }
        this.preStatusList = linkedList;
    }

    public final void a(@NotNull AppListBean appListBean) {
        Intrinsics.checkNotNullParameter(appListBean, "appListBean");
        if ((this.mac.length() > 0) && !Intrinsics.areEqual(appListBean.getMac(), this.mac)) {
            ml4.d(this.TAG, "appListChange mac not equals,filter any:" + this.deviceAppListChangeListener + "," + appListBean);
            return;
        }
        if (this.appIds.isEmpty()) {
            ml4.d(this.TAG, "observeAppIds is empty any:" + this.deviceAppListChangeListener + "," + appListBean);
            this.deviceAppListChangeListener.appListChange(appListBean);
            return;
        }
        LinkedList<ka5> linkedList = this.currStatusList;
        linkedList.clear();
        Iterator<T> it = this.appIds.iterator();
        while (it.hasNext()) {
            linkedList.add(appListBean.getInstallAppSet().contains(Integer.valueOf(((Number) it.next()).intValue())) ? ka5.b.INSTANCE : ka5.c.INSTANCE);
        }
        boolean zAreEqual = Intrinsics.areEqual(this.currStatusList, this.preStatusList);
        ml4.d(this.TAG, "observeAppIds:" + this.appIds + " preStatue:" + this.preStatusList + " currStatue:" + this.currStatusList + " equals:" + zAreEqual + " any:" + this.deviceAppListChangeListener + "," + appListBean);
        if (zAreEqual) {
            return;
        }
        LinkedList<ka5> linkedList2 = this.preStatusList;
        linkedList2.clear();
        linkedList2.addAll(this.currStatusList);
        this.deviceAppListChangeListener.appListChange(appListBean);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ja5 getDeviceAppListChangeListener() {
        return this.deviceAppListChangeListener;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(i2m.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.devicemanager.client.listener.WrapperDeviceAppListChangeListener");
        return Intrinsics.areEqual(this.deviceAppListChangeListener, ((i2m) other).deviceAppListChangeListener);
    }

    public int hashCode() {
        return this.deviceAppListChangeListener.hashCode();
    }

    public /* synthetic */ i2m(ja5 ja5Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ja5Var, (i & 2) != 0 ? "" : str);
    }
}
