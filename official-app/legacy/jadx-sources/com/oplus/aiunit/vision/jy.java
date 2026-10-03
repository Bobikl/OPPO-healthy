package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010-\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u00109\u001a\u00020\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\"\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R$\u0010$\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b#\u0010\u0018R$\u0010&\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b%\u0010\u0018R$\u0010*\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R$\u0010,\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b+\u0010\u0018R\u0019\u00101\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b'\u00104\"\u0004\b8\u00106R$\u0010<\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010\u0018R$\u0010>\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b=\u0010\u0018¨\u0006A"}, d2 = {"Lcom/oplus/aiunit/vision/jy;", "", "", "index", "mode", "", "o", "n", "Landroid/graphics/Bitmap;", "bitmap", LogFieldKey.PROCESS_NAME_KEY, "a", "Lcom/oplus/aiunit/vision/urb;", "Lcom/oplus/aiunit/vision/urb;", "f", "()Lcom/oplus/aiunit/vision/urb;", "r", "(Lcom/oplus/aiunit/vision/urb;)V", "mediaSource", "b", "Landroid/graphics/Bitmap;", b2n.g, "()Landroid/graphics/Bitmap;", "t", "(Landroid/graphics/Bitmap;)V", "timeLayerBitmap", "c", MapSchema.FIELD_NAME_KEY, "setTopLeftBitmap", "topLeftBitmap", "d", LogFieldKey.LEVEL_KEY, "setTopRightBitmap", "topRightBitmap", MapSchema.FIELD_NAME_ENTRY, "setBottomLeftBitmap", "bottomLeftBitmap", "setBottomRightBitmap", "bottomRightBitmap", b2n.f, "j", "setTopBitmap", "topBitmap", "setDownBitmap", "downBitmap", "", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "I", LogFieldKey.MESSAGE_KEY, "()I", "u", "(I)V", "type", "s", "position", "getBuffedBitmap", "setBuffedBitmap", "buffedBitmap", "q", "fgBitmap", "<init>", "(Lcom/oplus/aiunit/vision/urb;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class jy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public MediaSource mediaSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Bitmap timeLayerBitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bitmap topLeftBitmap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Bitmap topRightBitmap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bitmap bottomLeftBitmap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Bitmap bottomRightBitmap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Bitmap topBitmap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Bitmap downBitmap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bitmap buffedBitmap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Bitmap fgBitmap;

    public jy(@NotNull MediaSource mediaSource, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable Bitmap bitmap3, @Nullable Bitmap bitmap4, @Nullable Bitmap bitmap5, @Nullable Bitmap bitmap6, @Nullable Bitmap bitmap7, @Nullable String str, int i, int i2, @Nullable Bitmap bitmap8, @Nullable Bitmap bitmap9) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        this.mediaSource = mediaSource;
        this.timeLayerBitmap = bitmap;
        this.topLeftBitmap = bitmap2;
        this.topRightBitmap = bitmap3;
        this.bottomLeftBitmap = bitmap4;
        this.bottomRightBitmap = bitmap5;
        this.topBitmap = bitmap6;
        this.downBitmap = bitmap7;
        this.title = str;
        this.type = i;
        this.position = i2;
        this.buffedBitmap = bitmap8;
        this.fgBitmap = bitmap9;
    }

    public final void a() {
        this.topLeftBitmap = null;
        this.topRightBitmap = null;
        this.bottomLeftBitmap = null;
        this.bottomRightBitmap = null;
        this.topBitmap = null;
        this.downBitmap = null;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getBottomLeftBitmap() {
        return this.bottomLeftBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getBottomRightBitmap() {
        return this.bottomRightBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Bitmap getDownBitmap() {
        return this.downBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bitmap getFgBitmap() {
        return this.fgBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final MediaSource getMediaSource() {
        return this.mediaSource;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Bitmap getTimeLayerBitmap() {
        return this.timeLayerBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Bitmap getTopBitmap() {
        return this.topBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Bitmap getTopLeftBitmap() {
        return this.topLeftBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Bitmap getTopRightBitmap() {
        return this.topRightBitmap;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void n(int index, int mode) {
        if (mode == 5) {
            if (index == 0) {
                this.topBitmap = this.buffedBitmap;
                return;
            } else {
                if (index != 1) {
                    return;
                }
                this.downBitmap = this.buffedBitmap;
                return;
            }
        }
        if (index == 0) {
            this.topLeftBitmap = this.buffedBitmap;
            return;
        }
        if (index == 1) {
            this.topRightBitmap = this.buffedBitmap;
        } else if (index == 2) {
            this.bottomLeftBitmap = this.buffedBitmap;
        } else {
            if (index != 3) {
                return;
            }
            this.bottomRightBitmap = this.buffedBitmap;
        }
    }

    public final void o(int index, int mode) {
        if (mode == 5) {
            if (index == 0) {
                this.buffedBitmap = this.topBitmap;
                return;
            } else {
                if (index != 1) {
                    return;
                }
                this.buffedBitmap = this.downBitmap;
                return;
            }
        }
        if (index == 0) {
            this.buffedBitmap = this.topLeftBitmap;
            return;
        }
        if (index == 1) {
            this.buffedBitmap = this.topRightBitmap;
        } else if (index == 2) {
            this.buffedBitmap = this.bottomLeftBitmap;
        } else {
            if (index != 3) {
                return;
            }
            this.buffedBitmap = this.bottomRightBitmap;
        }
    }

    public final void p(@Nullable Bitmap bitmap, int index, int mode) {
        if (mode == 5) {
            if (index == 0) {
                this.topBitmap = bitmap;
                return;
            } else {
                if (index != 1) {
                    return;
                }
                this.downBitmap = bitmap;
                return;
            }
        }
        if (index == 0) {
            this.topLeftBitmap = bitmap;
            return;
        }
        if (index == 1) {
            this.topRightBitmap = bitmap;
        } else if (index == 2) {
            this.bottomLeftBitmap = bitmap;
        } else {
            if (index != 3) {
                return;
            }
            this.bottomRightBitmap = bitmap;
        }
    }

    public final void q(@Nullable Bitmap bitmap) {
        this.fgBitmap = bitmap;
    }

    public final void r(@NotNull MediaSource urbVar) {
        Intrinsics.checkNotNullParameter(urbVar, "<set-?>");
        this.mediaSource = urbVar;
    }

    public final void s(int i) {
        this.position = i;
    }

    public final void t(@Nullable Bitmap bitmap) {
        this.timeLayerBitmap = bitmap;
    }

    public final void u(int i) {
        this.type = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jy(MediaSource urbVar, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, Bitmap bitmap7, String str, int i, int i2, Bitmap bitmap8, Bitmap bitmap9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        MediaSource urbVar2;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if ((i3 & 1) != 0) {
            urbVar2 = new MediaSource(str2, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            urbVar2 = urbVar;
        }
        this(urbVar2, (i3 & 2) != 0 ? null : bitmap, (i3 & 4) != 0 ? null : bitmap2, (i3 & 8) != 0 ? null : bitmap3, (i3 & 16) != 0 ? null : bitmap4, (i3 & 32) != 0 ? null : bitmap5, (i3 & 64) != 0 ? null : bitmap6, (i3 & 128) != 0 ? null : bitmap7, (i3 & 256) != 0 ? null : str, i, i2, (i3 & 2048) != 0 ? null : bitmap8, (i3 & 4096) != 0 ? null : bitmap9);
    }
}
