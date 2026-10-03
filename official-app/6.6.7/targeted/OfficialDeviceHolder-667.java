package com.oplus.aiunit.model;

import com.heytap.health.vision.client.impl.DMManagerImpl;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\.\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/wl4;", BuildConfig.VERSION_NAME, "Lcom/oplus/aiunit/vision/em4;", "managerApi", "Lcom/oplus/aiunit/vision/em4;", "Lcom/oplus/aiunit/vision/nl4;", "businessApi", "Lcom/oplus/aiunit/vision/nl4;", "Lcom/oplus/aiunit/vision/el5;", "deviceMultiple", "Lcom/oplus/aiunit/vision/el5;", "Lcom/oplus/aiunit/vision/xm5;", "devicePrimary", "Lcom/oplus/aiunit/vision/xm5;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class wl4 {

    @NotNull
    public static final wl4 INSTANCE = new wl4();

    @JvmField
    @NotNull
    public static final em4 managerApi = new DMManagerImpl();

    @JvmField
    @NotNull
    public static final nl4 businessApi = new ol4();

    @JvmField
    @NotNull
    public static final el5 deviceMultiple = new el5();

    @JvmField
    @NotNull
    public static final xm5 devicePrimary = new xm5();
}
