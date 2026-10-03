package com.oplus.aiunit.vision;

import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/x5i;", "Lcom/oplus/aiunit/vision/tz0;", "", "b", "c", "", "id", "", "bytes", "d", "a", "I", "getCount", "()I", "setCount", "(I)V", "count", "Ljava/io/File;", "Ljava/io/File;", "getDir", "()Ljava/io/File;", "dir", "<init>", "()V", "Companion", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class x5i extends tz0 {

    @NotNull
    public static final String TAG = "VAM_FakeRecorder";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final File dir = b78.a().getExternalFilesDir(null);

    @Override // com.oplus.aiunit.vision.tz0
    public void b() {
        a7b.f(TAG, "[startRecord] --> ");
    }

    @Override // com.oplus.aiunit.vision.tz0
    public void c() {
        a7b.f(TAG, "[stopRecord] --> ");
    }

    public final void d(int id, @Nullable byte[] bytes) {
        if (bytes != null) {
            a(bytes);
            this.count += bytes.length;
            if (!qe0.z()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.dir, "breeno_in_" + id), true);
                try {
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            }
            int i = this.count;
            if (i >= 32000) {
                a7b.f(TAG, "fireWatchData: " + i);
                this.count = 0;
            }
        }
    }
}
