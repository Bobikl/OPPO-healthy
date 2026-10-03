package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/bjg;", "Lcom/oplus/aiunit/vision/el4$b;", "", MapSchema.FIELD_NAME_ENTRY, "f", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "c", "a", "b", "Ljava/io/File;", "d", "i", "Ljava/lang/String;", "picturesPath", "j", ParserTag.TAG_URI, MapSchema.FIELD_NAME_KEY, "uri_lite", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class bjg implements el4.b {

    @NotNull
    public static final bjg INSTANCE = new bjg();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final String picturesPath = b78.a().getPackageName() + "/screenshots";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String uri = "watch_screen_shot";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final String uri_lite = "watch_screen_shot_lite";

    @Override // com.oplus.aiunit.vision.el4.b
    public void a(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public void b(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        File file = new File(d(), fileTaskInfo.b());
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        String strB = fileTaskInfo.b();
        Intrinsics.checkNotNullExpressionValue(strB, "fileTaskInfo.fileName");
        u3a.a(file, contextA, strB, picturesPath);
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public void c(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        el4 el4Var = gl4.devicePrimary.fileApi;
        String strH = fileTaskInfo.h();
        Intrinsics.checkNotNullExpressionValue(strH, "fileTaskInfo.taskId");
        String absolutePath = new File(d(), fileTaskInfo.b()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(getCacheFilePath(),…fo.fileName).absolutePath");
        el4Var.receiveFile(strH, absolutePath);
    }

    public final File d() {
        return new File(b78.a().getCacheDir(), "screen_shot_cache");
    }

    public final void e() {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.fileApi.m(uri, this);
        bm5Var.fileApi.m(uri_lite, this);
    }

    public final void f() {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.fileApi.j(uri, this);
        bm5Var.fileApi.j(uri_lite, this);
    }
}
