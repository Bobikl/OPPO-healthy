package com.oplus.aiunit.vision;

import coil.decode.DataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/w3i;", "Lcom/oplus/aiunit/vision/p97;", "", "other", "", "equals", "", "hashCode", "Lcoil/decode/d;", "a", "Lcoil/decode/d;", "c", "()Lcoil/decode/d;", "source", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", "Lcoil/decode/DataSource;", "Lcoil/decode/DataSource;", "()Lcoil/decode/DataSource;", "dataSource", "<init>", "(Lcoil/decode/d;Ljava/lang/String;Lcoil/decode/DataSource;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class w3i extends p97 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final coil.decode.d source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String mimeType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DataSource dataSource;

    public w3i(@NotNull coil.decode.d dVar, @Nullable String str, @NotNull DataSource dataSource) {
        super(null);
        this.source = dVar;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataSource getDataSource() {
        return this.dataSource;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final coil.decode.d getSource() {
        return this.source;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof w3i) {
            w3i w3iVar = (w3i) other;
            if (Intrinsics.areEqual(this.source, w3iVar.source) && Intrinsics.areEqual(this.mimeType, w3iVar.mimeType) && this.dataSource == w3iVar.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.dataSource.hashCode();
    }
}
