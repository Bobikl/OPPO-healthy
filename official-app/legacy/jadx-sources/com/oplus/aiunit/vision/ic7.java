package com.oplus.aiunit.vision;

import com.oplus.nearx.cloudconfig.CloudConfigCtrl;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ic7;", "", "", "tag", "", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/io/File;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "fileMap", "Lcom/oplus/aiunit/vision/gbd;", "b", "configObservableMap", "Lcom/oplus/nearx/cloudconfig/CloudConfigCtrl;", "Lcom/oplus/nearx/cloudconfig/CloudConfigCtrl;", "cloudconfig", "Lcom/oplus/aiunit/vision/v7b;", "logger", "<init>", "(Lcom/oplus/nearx/cloudconfig/CloudConfigCtrl;Lcom/oplus/aiunit/vision/v7b;)V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class ic7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ConcurrentHashMap<String, File> fileMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final ConcurrentHashMap<String, gbd<File>> configObservableMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final CloudConfigCtrl cloudconfig;

    public ic7(@NotNull CloudConfigCtrl cloudconfig, @NotNull v7b logger) {
        Intrinsics.checkParameterIsNotNull(cloudconfig, "cloudconfig");
        Intrinsics.checkParameterIsNotNull(logger, "logger");
        this.cloudconfig = cloudconfig;
        this.fileMap = new ConcurrentHashMap<>();
        this.configObservableMap = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ void d(ic7 ic7Var, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = "FileService";
        }
        ic7Var.c(obj, str);
    }

    public final void c(@NotNull Object obj, String str) {
        v7b.a(null, str, String.valueOf(obj), null, null, 12, null);
    }
}
