package com.tencent.qgame.animplayer.mix;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.platform.videoplayer.bean.VideoPlayerProductDetailDataBeanKt;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.q0;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.smartenginehelper.entity.ImageEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 O2\u00020\u0001:\u0005\u0005PQRSB\u0011\b\u0016\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\"\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\b\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\fR\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010=\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b<\u0010\u0014R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b \u0010A\"\u0004\bB\u0010CR\"\u0010F\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0010\u001a\u0004\b5\u0010\u0012\"\u0004\bE\u0010\u0014R.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010G\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010H\u001a\u0004\b\u000f\u0010I\"\u0004\b?\u0010J¨\u0006T"}, d2 = {"Lcom/tencent/qgame/animplayer/mix/Src;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "", "toString", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "setSrcId", "(Ljava/lang/String;)V", "srcId", "", "b", "I", "getW", "()I", "setW", "(I)V", "w", "c", "getH", "setH", "d", MapSchema.FIELD_NAME_ENTRY, "setDrawWidth", "drawWidth", "setDrawHeight", "drawHeight", "Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", "f", "Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", MapSchema.FIELD_NAME_KEY, "()Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", "setSrcType", "(Lcom/tencent/qgame/animplayer/mix/Src$SrcType;)V", "srcType", "Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", b2n.f, "Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", "()Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", "setLoadType", "(Lcom/tencent/qgame/animplayer/mix/Src$LoadType;)V", "loadType", "i", "setSrcTag", "srcTag", "getTxt", "n", "txt", "Lcom/tencent/qgame/animplayer/mix/Src$Style;", "j", "Lcom/tencent/qgame/animplayer/mix/Src$Style;", "getStyle", "()Lcom/tencent/qgame/animplayer/mix/Src$Style;", "setStyle", "(Lcom/tencent/qgame/animplayer/mix/Src$Style;)V", Const.Arguments.Open.STYLE, "setColor", "color", "Lcom/tencent/qgame/animplayer/mix/Src$FitType;", LogFieldKey.LEVEL_KEY, "Lcom/tencent/qgame/animplayer/mix/Src$FitType;", "()Lcom/tencent/qgame/animplayer/mix/Src$FitType;", "setFitType", "(Lcom/tencent/qgame/animplayer/mix/Src$FitType;)V", "fitType", LogFieldKey.MESSAGE_KEY, "srcTextureId", "value", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "Companion", "FitType", "LoadType", "SrcType", "Style", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class Src {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String srcId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int w;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int h;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int drawWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int drawHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public SrcType srcType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public LoadType loadType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public String srcTag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public String txt;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Style style;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int color;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FitType fitType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int srcTextureId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Bitmap bitmap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tencent/qgame/animplayer/mix/Src$FitType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "FIT_XY", "CENTER_FULL", "animplayer_release"}, k = 1, mv = {1, 1, 15})
    public enum FitType {
        FIT_XY(ImageEntity.SCALE_TYPE_FIT_XY),
        CENTER_FULL("centerFull");


        @NotNull
        private final String type;

        FitType(String str) {
            this.type = str;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tencent/qgame/animplayer/mix/Src$LoadType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", LanConstants.OPERATOR_UNKNOWN, "NET", "LOCAL", "animplayer_release"}, k = 1, mv = {1, 1, 15})
    public enum LoadType {
        UNKNOWN("unknown"),
        NET("net"),
        LOCAL("local");


        @NotNull
        private final String type;

        LoadType(String str) {
            this.type = str;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tencent/qgame/animplayer/mix/Src$SrcType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", LanConstants.OPERATOR_UNKNOWN, "IMG", "TXT", "animplayer_release"}, k = 1, mv = {1, 1, 15})
    public enum SrcType {
        UNKNOWN("unknown"),
        IMG(VideoPlayerProductDetailDataBeanKt.IMG),
        TXT("txt");


        @NotNull
        private final String type;

        SrcType(String str) {
            this.type = str;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tencent/qgame/animplayer/mix/Src$Style;", "", Const.Arguments.Open.STYLE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStyle", "()Ljava/lang/String;", "DEFAULT", "BOLD", "animplayer_release"}, k = 1, mv = {1, 1, 15})
    public enum Style {
        DEFAULT("default"),
        BOLD("b");


        @NotNull
        private final String style;

        Style(String str) {
            this.style = str;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007e A[PHI: r7
  0x007e: PHI (r7v10 com.tencent.qgame.animplayer.mix.Src$SrcType) = (r7v5 com.tencent.qgame.animplayer.mix.Src$SrcType), (r7v6 com.tencent.qgame.animplayer.mix.Src$SrcType) binds: [B:10:0x007c, B:13:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1 A[PHI: r5
  0x00a1: PHI (r5v17 com.tencent.qgame.animplayer.mix.Src$LoadType) = (r5v14 com.tencent.qgame.animplayer.mix.Src$LoadType), (r5v15 com.tencent.qgame.animplayer.mix.Src$LoadType) binds: [B:16:0x009f, B:19:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    public Src(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkParameterIsNotNull(json, "json");
        this.srcId = "";
        SrcType srcType = SrcType.UNKNOWN;
        this.srcType = srcType;
        LoadType loadType = LoadType.UNKNOWN;
        this.loadType = loadType;
        this.srcTag = "";
        this.txt = "";
        Style style = Style.DEFAULT;
        this.style = style;
        FitType fitType = FitType.FIT_XY;
        this.fitType = fitType;
        String string = json.getString("srcId");
        Intrinsics.checkExpressionValueIsNotNull(string, "json.getString(\"srcId\")");
        this.srcId = string;
        this.w = json.getInt("w");
        this.h = json.getInt(b2n.g);
        String colorStr = json.optString("color", "#000000");
        Intrinsics.checkExpressionValueIsNotNull(colorStr, "colorStr");
        String str = colorStr.length() == 0 ? "#000000" : colorStr;
        this.color = Color.parseColor(str);
        String string2 = json.getString("srcTag");
        Intrinsics.checkExpressionValueIsNotNull(string2, "json.getString(\"srcTag\")");
        this.srcTag = string2;
        this.txt = string2;
        String string3 = json.getString("srcType");
        SrcType srcType2 = SrcType.IMG;
        if (!Intrinsics.areEqual(string3, srcType2.getType())) {
            srcType2 = SrcType.TXT;
            srcType = Intrinsics.areEqual(string3, srcType2.getType()) ? srcType2 : srcType;
        }
        this.srcType = srcType;
        String string4 = json.getString("loadType");
        LoadType loadType2 = LoadType.NET;
        if (!Intrinsics.areEqual(string4, loadType2.getType())) {
            loadType2 = LoadType.LOCAL;
            loadType = Intrinsics.areEqual(string4, loadType2.getType()) ? loadType2 : loadType;
        }
        this.loadType = loadType;
        String string5 = json.getString("fitType");
        FitType fitType2 = FitType.CENTER_FULL;
        this.fitType = Intrinsics.areEqual(string5, fitType2.getType()) ? fitType2 : fitType;
        String strOptString = json.optString(Const.Arguments.Open.STYLE, "");
        Style style2 = Style.BOLD;
        this.style = Intrinsics.areEqual(strOptString, style2.getStyle()) ? style2 : style;
        q0.INSTANCE.d("AnimPlayer.Src", toString() + " color=" + str);
    }

    public final void a(Bitmap bitmap) {
        int i;
        int i2;
        int width = bitmap != null ? bitmap.getWidth() : this.w;
        int height = bitmap != null ? bitmap.getHeight() : this.h;
        this.drawWidth = width;
        this.drawHeight = height;
        if (this.fitType != FitType.CENTER_FULL || (i = this.w) == 0 || (i2 = this.h) == 0) {
            return;
        }
        float f = width / height;
        if (f >= i / i2) {
            this.drawHeight = i2;
            this.drawWidth = (int) (i2 * f);
        } else {
            this.drawWidth = i;
            this.drawHeight = (int) (i / f);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDrawHeight() {
        return this.drawHeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDrawWidth() {
        return this.drawWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final FitType getFitType() {
        return this.fitType;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final LoadType getLoadType() {
        return this.loadType;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSrcId() {
        return this.srcId;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSrcTag() {
        return this.srcTag;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSrcTextureId() {
        return this.srcTextureId;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final SrcType getSrcType() {
        return this.srcType;
    }

    public final void l(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
        a(bitmap);
    }

    public final void m(int i) {
        this.srcTextureId = i;
    }

    public final void n(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.txt = str;
    }

    @NotNull
    public String toString() {
        return "Src(srcId='" + this.srcId + "', srcType=" + this.srcType + ", loadType=" + this.loadType + ", srcTag='" + this.srcTag + "', bitmap=" + this.bitmap + ", txt='" + this.txt + "')";
    }
}
