package com.oplus.aiunit.vision;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/sb7;", "Lcom/oplus/aiunit/vision/woa;", "Ljava/io/File;", "data", "Lcom/oplus/aiunit/vision/frd;", "options", "", "b", "", "a", "Z", "addLastModifiedToFileCacheKey", "<init>", "(Z)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class sb7 implements woa<File> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean addLastModifiedToFileCacheKey;

    public sb7(boolean z) {
        this.addLastModifiedToFileCacheKey = z;
    }

    @Override // com.oplus.aiunit.vision.woa
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull File data, @NotNull frd options) {
        if (!this.addLastModifiedToFileCacheKey) {
            return data.getPath();
        }
        return data.getPath() + ':' + data.lastModified();
    }
}
