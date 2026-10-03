package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/hg3;", "", "", "TAG", "Ljava/lang/String;", "", "Lcom/oplus/aiunit/vision/i70;", "a", "Ljava/util/List;", "()Ljava/util/List;", "mStrategyApiList", "<init>", "()V", "lib_apiprovider_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClientStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientStrategy.kt\ncom/oplus/health/apiprovider/ClientStrategy\n*L\n1#1,118:1\n110#1:119\n117#1:120\n*S KotlinDebug\n*F\n+ 1 ClientStrategy.kt\ncom/oplus/health/apiprovider/ClientStrategy\n*L\n38#1:119\n43#1:120\n*E\n"})
public final class hg3 {

    @NotNull
    public static final String TAG = "ClientStrategy";

    @NotNull
    public static final hg3 INSTANCE = new hg3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<i70> mStrategyApiList = new ArrayList();

    @NotNull
    public final List<i70> a() {
        return mStrategyApiList;
    }
}
