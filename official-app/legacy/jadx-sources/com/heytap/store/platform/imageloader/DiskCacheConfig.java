package com.heytap.store.platform.imageloader;

import com.oplus.aiunit.vision.jla;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/platform/imageloader/DiskCacheConfig;", "", "builder", "Lcom/heytap/store/platform/imageloader/DiskCacheConfig$Builder;", "(Lcom/heytap/store/platform/imageloader/DiskCacheConfig$Builder;)V", "baseDirectoryName", "", "getBaseDirectoryName", "()Ljava/lang/String;", "baseDirectoryPath", "getBaseDirectoryPath", "defaultSizeLimit", "", "getDefaultSizeLimit", "()J", "Builder", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public class DiskCacheConfig {

    @NotNull
    private final String baseDirectoryName;

    @NotNull
    private final String baseDirectoryPath;
    private final long defaultSizeLimit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/platform/imageloader/DiskCacheConfig$Builder;", "", "()V", "<set-?>", "", "baseDirectoryName", "getBaseDirectoryName", "()Ljava/lang/String;", "baseDirectoryPath", "getBaseDirectoryPath", "", "defaultSizeLimit", "getDefaultSizeLimit", "()J", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/imageloader/DiskCacheConfig;", "setBaseDirectoryName", "directoryName", "setBaseDirectoryPath", "directoryPath", "setMaxCacheSize", "size", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {

        @NotNull
        private String baseDirectoryName = "";

        @NotNull
        private String baseDirectoryPath = "";
        private long defaultSizeLimit;

        @NotNull
        public final DiskCacheConfig build() {
            return new DiskCacheConfig(this);
        }

        @NotNull
        public final String getBaseDirectoryName() {
            return this.baseDirectoryName;
        }

        @NotNull
        public final String getBaseDirectoryPath() {
            return this.baseDirectoryPath;
        }

        public final long getDefaultSizeLimit() {
            return this.defaultSizeLimit;
        }

        @NotNull
        public final Builder setBaseDirectoryName(@NotNull String directoryName) {
            Intrinsics.checkNotNullParameter(directoryName, "directoryName");
            return this;
        }

        @NotNull
        public final Builder setBaseDirectoryPath(@NotNull String directoryPath) {
            Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
            this.baseDirectoryPath = directoryPath;
            return this;
        }

        @NotNull
        public final Builder setMaxCacheSize(long size) {
            this.defaultSizeLimit = size;
            return this;
        }
    }

    public DiskCacheConfig(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.defaultSizeLimit = builder.getDefaultSizeLimit();
        this.baseDirectoryName = builder.getBaseDirectoryName();
        this.baseDirectoryPath = builder.getBaseDirectoryPath();
    }

    @NotNull
    public final String getBaseDirectoryName() {
        return this.baseDirectoryName;
    }

    @NotNull
    public final String getBaseDirectoryPath() {
        return this.baseDirectoryPath;
    }

    public final long getDefaultSizeLimit() {
        return this.defaultSizeLimit;
    }
}
