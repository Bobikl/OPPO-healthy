package com.heytap.health.watchface.business.creation.category.video.bean;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.heytap.health.watchface.business.creation.category.video.VideoRepository;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006$"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoItem;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "J", "b", "()J", "id", "getHeight", Fields.HEIGHT_FIELD, "c", "getWidth", Fields.WIDTH_FIELD, "d", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", MapSchema.FIELD_NAME_ENTRY, "getSize", "size", "f", "addTime", "Landroid/net/Uri;", b2n.f, "Lkotlin/Lazy;", "()Landroid/net/Uri;", ParserTag.TAG_URI, "<init>", "(JJJLjava/lang/String;JJ)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VideoItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String mimeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long size;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long addTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy uri;

    public VideoItem(long j2, long j3, long j4, @NotNull String mimeType, long j5, long j6) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.id = j2;
        this.height = j3;
        this.width = j4;
        this.mimeType = mimeType;
        this.size = j5;
        this.addTime = j6;
        this.uri = LazyKt__LazyJVMKt.lazy(new Function0<Uri>() { // from class: com.heytap.health.watchface.business.creation.category.video.bean.VideoItem$uri$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Uri invoke() {
                Uri uriWithAppendedId = TextUtils.equals(this.this$0.getMimeType(), VideoRepository.MIME_TYPE_GIF) ? ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.this$0.getId()) : ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.this$0.getId());
                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "if (TextUtils.equals(mim…d\n            )\n        }");
                return uriWithAppendedId;
            }
        });
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAddTime() {
        return this.addTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final Uri d() {
        return (Uri) this.uri.getValue();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(VideoItem.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watchface.business.creation.category.video.bean.VideoItem");
        VideoItem videoItem = (VideoItem) other;
        return this.id == videoItem.id && Intrinsics.areEqual(this.mimeType, videoItem.mimeType);
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.mimeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "VideoItem(id=" + this.id + ", height=" + this.height + ", width=" + this.width + ", mimeType=" + this.mimeType + ", size=" + this.size + ", addTime=" + this.addTime + ")";
    }
}
