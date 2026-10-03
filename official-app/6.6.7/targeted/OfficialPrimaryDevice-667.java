package com.oplus.aiunit.model;

import com.heytap.health.vision.client.impl.primart.DMFileImpl;
import com.heytap.health.vision.client.impl.primart.DMMessageImpl;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\.\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/xm5;", BuildConfig.VERSION_NAME, "Lcom/oplus/aiunit/vision/km4;", "a", "Lcom/oplus/aiunit/vision/km4;", "nodeApi", "Lcom/oplus/aiunit/vision/hm4;", "b", "Lcom/oplus/aiunit/vision/hm4;", "messageApi", "Lcom/oplus/aiunit/vision/ul4;", "c", "Lcom/oplus/aiunit/vision/ul4;", "fileApi", "Lcom/oplus/aiunit/vision/pl4;", "d", "Lcom/oplus/aiunit/vision/pl4;", "callApi", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class xm5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final km4 nodeApi = new lm4();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final hm4 messageApi = new DMMessageImpl();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final ul4 fileApi = new DMFileImpl();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final pl4 callApi = new ql4();
}
