package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bke, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\t\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/bke;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "res", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "path", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "d", "Landroid/net/Uri;", "()Landroid/net/Uri;", ParserTag.TAG_URI, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/net/Uri;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PicChange {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer res;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Uri uri;

    public PicChange() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getRes() {
        return this.res;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicChange)) {
            return false;
        }
        PicChange picChange = (PicChange) other;
        return Intrinsics.areEqual(this.res, picChange.res) && Intrinsics.areEqual(this.path, picChange.path) && Intrinsics.areEqual(this.bitmap, picChange.bitmap) && Intrinsics.areEqual(this.uri, picChange.uri);
    }

    public int hashCode() {
        Integer num = this.res;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.path;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.bitmap;
        int iHashCode3 = (iHashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Uri uri = this.uri;
        return iHashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PicChange(res=" + this.res + ", path=" + this.path + ", bitmap=" + this.bitmap + ", uri=" + this.uri + ")";
    }

    public PicChange(@Nullable Integer num, @Nullable String str, @Nullable Bitmap bitmap, @Nullable Uri uri) {
        this.res = num;
        this.path = str;
        this.bitmap = bitmap;
        this.uri = uri;
    }

    public /* synthetic */ PicChange(Integer num, String str, Bitmap bitmap, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? null : uri);
    }
}
