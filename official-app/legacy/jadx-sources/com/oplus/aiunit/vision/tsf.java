package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.tencent.qgame.animplayer.mix.Src;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/tsf;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "id", "Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", "b", "Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", "getType", "()Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", "setType", "(Lcom/tencent/qgame/animplayer/mix/Src$SrcType;)V", "type", "Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", "c", "Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", "getLoadType", "()Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", "setLoadType", "(Lcom/tencent/qgame/animplayer/mix/Src$LoadType;)V", "loadType", "d", "getTag", "setTag", "tag", "Landroid/graphics/Bitmap;", MapSchema.FIELD_NAME_ENTRY, "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "Lcom/tencent/qgame/animplayer/mix/Src;", "src", "<init>", "(Lcom/tencent/qgame/animplayer/mix/Src;)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class tsf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Src.SrcType type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Src.LoadType loadType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String tag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bitmap bitmap;

    public tsf(@NotNull Src src) {
        Intrinsics.checkParameterIsNotNull(src, "src");
        this.id = "";
        this.type = Src.SrcType.UNKNOWN;
        this.loadType = Src.LoadType.UNKNOWN;
        this.tag = "";
        this.id = src.getSrcId();
        this.type = src.getSrcType();
        this.loadType = src.getLoadType();
        this.tag = src.getSrcTag();
        this.bitmap = src.getBitmap();
    }
}
