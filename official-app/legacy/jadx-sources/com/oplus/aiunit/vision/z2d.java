package com.oplus.aiunit.vision;

import com.oplus.gallery.olive_decoder.source.FilePathSourceImpl;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/z2d;", "", "", "a", "Lcom/oplus/aiunit/vision/b3d;", "c", "Ljava/io/InputStream;", "b", "Companion", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public interface z2d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.z2d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/z2d$a;", "", "", "filePath", "Lcom/oplus/aiunit/vision/z2d;", "a", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        @JvmStatic
        @NotNull
        public final z2d a(@NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            return new a3d(new FilePathSourceImpl(filePath));
        }
    }

    boolean a();

    @Nullable
    InputStream b();

    @Nullable
    OLivePhoto c();
}
