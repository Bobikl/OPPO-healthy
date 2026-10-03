package com.oplus.aiunit.vision;

import com.heytap.health.connect.rawapi.NodeApi;
import com.heytap.health.connect.rawapi.impl.FileApiImpl;
import com.heytap.health.connect.rawapi.impl.InitApiImpl;
import com.heytap.health.connect.rawapi.impl.MessageApiImpl;
import com.heytap.health.connect.rawapi.impl.NodeApiImpl;
import com.heytap.health.connect.rawapi.impl.RunModeApiImpl;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/u89;", "", "Lcom/oplus/aiunit/vision/v7a;", "InitApi", "Lcom/oplus/aiunit/vision/v7a;", "Lcom/oplus/aiunit/vision/je1;", "BinderApi", "Lcom/oplus/aiunit/vision/je1;", "Lcom/heytap/health/connect/rawapi/NodeApi;", "NodeApi", "Lcom/heytap/health/connect/rawapi/NodeApi;", "Lcom/oplus/aiunit/vision/nxb;", "MessageApi", "Lcom/oplus/aiunit/vision/nxb;", "Lcom/oplus/aiunit/vision/ka7;", "FileApi", "Lcom/oplus/aiunit/vision/ka7;", "Lcom/oplus/aiunit/vision/b2g;", "RunModeApi", "Lcom/oplus/aiunit/vision/b2g;", "Lcom/heytap/health/connect/rawapi/a;", "CallApi", "Lcom/heytap/health/connect/rawapi/a;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class u89 {

    @NotNull
    public static final u89 INSTANCE = new u89();

    @JvmField
    @NotNull
    public static final v7a InitApi = new InitApiImpl();

    @JvmField
    @NotNull
    public static final je1 BinderApi = new com.heytap.health.connect.rawapi.impl.a();

    @JvmField
    @NotNull
    public static final NodeApi NodeApi = new NodeApiImpl();

    @JvmField
    @NotNull
    public static final nxb MessageApi = new MessageApiImpl();

    @JvmField
    @NotNull
    public static final ka7 FileApi = new FileApiImpl();

    @JvmField
    @NotNull
    public static final b2g RunModeApi = new RunModeApiImpl();

    @JvmField
    @NotNull
    public static final com.heytap.health.connect.rawapi.a CallApi = new as2();
}
