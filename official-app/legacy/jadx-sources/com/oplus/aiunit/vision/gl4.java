package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.client.impl.DMManagerImpl;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/gl4;", "", "Lcom/oplus/aiunit/vision/ol4;", "managerApi", "Lcom/oplus/aiunit/vision/ol4;", "Lcom/oplus/aiunit/vision/xk4;", "businessApi", "Lcom/oplus/aiunit/vision/xk4;", "Lcom/oplus/aiunit/vision/ik5;", "deviceMultiple", "Lcom/oplus/aiunit/vision/ik5;", "Lcom/oplus/aiunit/vision/bm5;", "devicePrimary", "Lcom/oplus/aiunit/vision/bm5;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class gl4 {

    @NotNull
    public static final gl4 INSTANCE = new gl4();

    @JvmField
    @NotNull
    public static final ol4 managerApi = new DMManagerImpl();

    @JvmField
    @NotNull
    public static final xk4 businessApi = new yk4();

    @JvmField
    @NotNull
    public static final ik5 deviceMultiple = new ik5();

    @JvmField
    @NotNull
    public static final bm5 devicePrimary = new bm5();
}
