package com.oplus.aiunit.vision;

import com.heytap.accessory.file.model.Constant;
import com.heytap.health.watchface.business.creation.engine.compress.CompressType;
import com.heytap.health.watchface.utils.RsWfPacker;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ae1;", "Lcom/oplus/aiunit/vision/l3;", "Lcom/heytap/health/watchface/business/creation/engine/compress/CompressType;", "b", "", Constant.SOURCE_PATH, "sinkPath", "", "c", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ae1 extends l3 {
    @Override // com.oplus.aiunit.vision.l3
    @NotNull
    public CompressType b() {
        return CompressType.BIN;
    }

    @Override // com.oplus.aiunit.vision.l3
    public int c(@NotNull String sourcePath, @NotNull String sinkPath) {
        Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
        Intrinsics.checkNotNullParameter(sinkPath, "sinkPath");
        return RsWfPacker.b().a(sourcePath, sinkPath);
    }
}
