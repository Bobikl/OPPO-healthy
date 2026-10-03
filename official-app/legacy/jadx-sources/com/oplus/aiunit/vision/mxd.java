package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/mxd;", "", "Ljava/io/File;", "a", "Ljava/io/File;", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", Const.Scheme.SCHEME_FILE, "<init>", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class mxd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public File file;

    public mxd(@Nullable File file) {
        this.file = file;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public /* synthetic */ mxd(File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file);
    }
}
