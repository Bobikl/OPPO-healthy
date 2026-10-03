package com.oplus.gallery.olive_decoder.source;

import com.heytap.accessory.file.model.Constant;
import com.oplus.aiunit.vision.y25;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/gallery/olive_decoder/source/FilePathSourceImpl;", "Lcom/oplus/aiunit/vision/y25;", "Ljava/io/InputStream;", "getInputStream", "", "a", "", "Ljava/lang/String;", "filePath", "Ljava/io/File;", "b", "Ljava/io/File;", "decodeFile", "c", "Lkotlin/Lazy;", "()J", Constant.FILE_SIZE, "<init>", "(Ljava/lang/String;)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class FilePathSourceImpl implements y25 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public File decodeFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy fileSize;

    public FilePathSourceImpl(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.decodeFile = new File(filePath);
        this.fileSize = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.oplus.gallery.olive_decoder.source.FilePathSourceImpl$fileSize$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                return Long.valueOf(!new File(this.this$0.filePath).exists() ? 0L : new File(this.this$0.filePath).length());
            }
        });
    }

    @Override // com.oplus.aiunit.vision.y25
    public long a() {
        return c();
    }

    public final long c() {
        return ((Number) this.fileSize.getValue()).longValue();
    }

    @Override // com.oplus.aiunit.vision.y25
    @Nullable
    public InputStream getInputStream() {
        if (this.decodeFile.exists()) {
            return new FileInputStream(this.filePath);
        }
        return null;
    }
}
