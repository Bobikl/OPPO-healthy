package com.heytap.health.videosdk.data;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012¢\u0006\u0002\u0010\u0013J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u0019\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012HÆ\u0003Ju\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012HÆ\u0001J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\rHÖ\u0001R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#¨\u0006@"}, d2 = {"Lcom/heytap/health/videosdk/data/DecodeData;", "", "phoneData", "Lcom/heytap/health/videosdk/data/PhoneData;", "useHwDecode", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "duration", "", "rotate", "prepareMsg", "", "codeName", "frameDatas", "Ljava/util/ArrayList;", "Lcom/heytap/health/videosdk/data/DecodeFrameData;", "Lkotlin/collections/ArrayList;", "(Lcom/heytap/health/videosdk/data/PhoneData;ZIIDILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getCodeName", "()Ljava/lang/String;", "setCodeName", "(Ljava/lang/String;)V", "getDuration", "()D", "setDuration", "(D)V", "getFrameDatas", "()Ljava/util/ArrayList;", "setFrameDatas", "(Ljava/util/ArrayList;)V", "getHeight", "()I", "setHeight", "(I)V", "getPhoneData", "()Lcom/heytap/health/videosdk/data/PhoneData;", "setPhoneData", "(Lcom/heytap/health/videosdk/data/PhoneData;)V", "getPrepareMsg", "setPrepareMsg", "getRotate", "setRotate", "getUseHwDecode", "()Z", "setUseHwDecode", "(Z)V", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DecodeData {

    @NotNull
    private String codeName;
    private double duration;

    @NotNull
    private ArrayList<DecodeFrameData> frameDatas;
    private int height;

    @Nullable
    private PhoneData phoneData;

    @NotNull
    private String prepareMsg;
    private int rotate;
    private boolean useHwDecode;
    private int width;

    public DecodeData() {
        this(null, false, 0, 0, 0.0d, 0, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PhoneData getPhoneData() {
        return this.phoneData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUseHwDecode() {
        return this.useHwDecode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRotate() {
        return this.rotate;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPrepareMsg() {
        return this.prepareMsg;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCodeName() {
        return this.codeName;
    }

    @NotNull
    public final ArrayList<DecodeFrameData> component9() {
        return this.frameDatas;
    }

    @NotNull
    public final DecodeData copy(@Nullable PhoneData phoneData, boolean useHwDecode, int width, int height, double duration, int rotate, @NotNull String prepareMsg, @NotNull String codeName, @NotNull ArrayList<DecodeFrameData> frameDatas) {
        Intrinsics.checkNotNullParameter(prepareMsg, "prepareMsg");
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        Intrinsics.checkNotNullParameter(frameDatas, "frameDatas");
        return new DecodeData(phoneData, useHwDecode, width, height, duration, rotate, prepareMsg, codeName, frameDatas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodeData)) {
            return false;
        }
        DecodeData decodeData = (DecodeData) other;
        return Intrinsics.areEqual(this.phoneData, decodeData.phoneData) && this.useHwDecode == decodeData.useHwDecode && this.width == decodeData.width && this.height == decodeData.height && Intrinsics.areEqual((Object) Double.valueOf(this.duration), (Object) Double.valueOf(decodeData.duration)) && this.rotate == decodeData.rotate && Intrinsics.areEqual(this.prepareMsg, decodeData.prepareMsg) && Intrinsics.areEqual(this.codeName, decodeData.codeName) && Intrinsics.areEqual(this.frameDatas, decodeData.frameDatas);
    }

    @NotNull
    public final String getCodeName() {
        return this.codeName;
    }

    public final double getDuration() {
        return this.duration;
    }

    @NotNull
    public final ArrayList<DecodeFrameData> getFrameDatas() {
        return this.frameDatas;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final PhoneData getPhoneData() {
        return this.phoneData;
    }

    @NotNull
    public final String getPrepareMsg() {
        return this.prepareMsg;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final boolean getUseHwDecode() {
        return this.useHwDecode;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    public int hashCode() {
        PhoneData phoneData = this.phoneData;
        int iHashCode = (phoneData == null ? 0 : phoneData.hashCode()) * 31;
        boolean z = this.useHwDecode;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((iHashCode + r1) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Double.hashCode(this.duration)) * 31) + Integer.hashCode(this.rotate)) * 31) + this.prepareMsg.hashCode()) * 31) + this.codeName.hashCode()) * 31) + this.frameDatas.hashCode();
    }

    public final void setCodeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.codeName = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setFrameDatas(@NotNull ArrayList<DecodeFrameData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.frameDatas = arrayList;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setPhoneData(@Nullable PhoneData phoneData) {
        this.phoneData = phoneData;
    }

    public final void setPrepareMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prepareMsg = str;
    }

    public final void setRotate(int i) {
        this.rotate = i;
    }

    public final void setUseHwDecode(boolean z) {
        this.useHwDecode = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        return "DecodeData(phoneData=" + this.phoneData + ", useHwDecode=" + this.useHwDecode + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", rotate=" + this.rotate + ", prepareMsg=" + this.prepareMsg + ", codeName=" + this.codeName + ", frameDatas=" + this.frameDatas + ')';
    }

    public DecodeData(@Nullable PhoneData phoneData, boolean z, int i, int i2, double d, int i3, @NotNull String prepareMsg, @NotNull String codeName, @NotNull ArrayList<DecodeFrameData> frameDatas) {
        Intrinsics.checkNotNullParameter(prepareMsg, "prepareMsg");
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        Intrinsics.checkNotNullParameter(frameDatas, "frameDatas");
        this.phoneData = phoneData;
        this.useHwDecode = z;
        this.width = i;
        this.height = i2;
        this.duration = d;
        this.rotate = i3;
        this.prepareMsg = prepareMsg;
        this.codeName = codeName;
        this.frameDatas = frameDatas;
    }

    public /* synthetic */ DecodeData(PhoneData phoneData, boolean z, int i, int i2, double d, int i3, String str, String str2, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : phoneData, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.0d : d, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? "" : str, (i4 & 128) == 0 ? str2 : "", (i4 & 256) != 0 ? new ArrayList() : arrayList);
    }
}
