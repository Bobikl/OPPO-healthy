package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.client.impl.primart.DMFileImpl;
import com.heytap.health.devicemanager.client.impl.primart.DMMessageImpl;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/bm5;", "", "Lcom/oplus/aiunit/vision/ul4;", "a", "Lcom/oplus/aiunit/vision/ul4;", "nodeApi", "Lcom/oplus/aiunit/vision/rl4;", "b", "Lcom/oplus/aiunit/vision/rl4;", "messageApi", "Lcom/oplus/aiunit/vision/el4;", "c", "Lcom/oplus/aiunit/vision/el4;", "fileApi", "Lcom/oplus/aiunit/vision/zk4;", "d", "Lcom/oplus/aiunit/vision/zk4;", "callApi", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class bm5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final ul4 nodeApi = new vl4();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final rl4 messageApi = new DMMessageImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    @NotNull
    public final el4 fileApi = new DMFileImpl();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final zk4 callApi = new al4();
}
