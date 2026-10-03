package com.heytap.health.health_archives.util;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/health_archives/util/PdfPageBitmap;", "", "bitmap", "Landroid/graphics/Bitmap;", "pageNumber", "", "(Landroid/graphics/Bitmap;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getPageNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PdfPageBitmap {

    @NotNull
    private final Bitmap bitmap;
    private final int pageNumber;

    public PdfPageBitmap(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.pageNumber = i;
    }

    public static /* synthetic */ PdfPageBitmap copy$default(PdfPageBitmap pdfPageBitmap, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bitmap = pdfPageBitmap.bitmap;
        }
        if ((i2 & 2) != 0) {
            i = pdfPageBitmap.pageNumber;
        }
        return pdfPageBitmap.copy(bitmap, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    @NotNull
    public final PdfPageBitmap copy(@NotNull Bitmap bitmap, int pageNumber) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new PdfPageBitmap(bitmap, pageNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfPageBitmap)) {
            return false;
        }
        PdfPageBitmap pdfPageBitmap = (PdfPageBitmap) other;
        return Intrinsics.areEqual(this.bitmap, pdfPageBitmap.bitmap) && this.pageNumber == pdfPageBitmap.pageNumber;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public int hashCode() {
        return (this.bitmap.hashCode() * 31) + Integer.hashCode(this.pageNumber);
    }

    @NotNull
    public String toString() {
        return "PdfPageBitmap(bitmap=" + this.bitmap + ", pageNumber=" + this.pageNumber + ")";
    }
}
