package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.rde;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00122\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u0006j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u0001`\t\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010)J5\u0010.\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u0006j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u0001`\tHÆ\u0003J)\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\tHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J°\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u000324\b\u0002\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u0006j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u0001`\t2(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0010HÖ\u0001J\t\u0010:\u001a\u00020\u0007HÖ\u0001R:\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bRF\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u0006j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u0001`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006;"}, d2 = {"Lcom/oplus/vfxsdk/common/Layer;", "", "render", "", "Lcom/oplus/vfxsdk/common/RendPass;", "params", "Ljava/util/HashMap;", "", "Lcom/oplus/vfxsdk/common/PassParams;", "Lkotlin/collections/HashMap;", "animParams", "Lcom/oplus/vfxsdk/common/AnimatorValue;", "enableBlend", "", "enable", "blendSfactor", "", "blendDfactor", rde.PAY_SDK_ORDER, "([Lcom/oplus/vfxsdk/common/RendPass;Ljava/util/HashMap;Ljava/util/HashMap;ZZIII)V", "getAnimParams", "()Ljava/util/HashMap;", "setAnimParams", "(Ljava/util/HashMap;)V", "getBlendDfactor", "()I", "setBlendDfactor", "(I)V", "getBlendSfactor", "setBlendSfactor", "getEnable", "()Z", "setEnable", "(Z)V", "getEnableBlend", "setEnableBlend", "getOrder", "setOrder", "getParams", "setParams", "getRender", "()[Lcom/oplus/vfxsdk/common/RendPass;", "setRender", "([Lcom/oplus/vfxsdk/common/RendPass;)V", "[Lcom/oplus/vfxsdk/common/RendPass;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "([Lcom/oplus/vfxsdk/common/RendPass;Ljava/util/HashMap;Ljava/util/HashMap;ZZIII)Lcom/oplus/vfxsdk/common/Layer;", "equals", "other", "hashCode", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Layer {

    @Nullable
    private HashMap<String, AnimatorValue> animParams;
    private int blendDfactor;
    private int blendSfactor;
    private boolean enable;
    private boolean enableBlend;
    private int order;

    @Nullable
    private HashMap<String, PassParams[]> params;

    @NotNull
    private RendPass[] render;

    public Layer(@NotNull RendPass[] rendPassArr, @Nullable HashMap<String, PassParams[]> map, @Nullable HashMap<String, AnimatorValue> map2, boolean z, boolean z2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(rendPassArr, "render");
        this.render = rendPassArr;
        this.params = map;
        this.animParams = map2;
        this.enableBlend = z;
        this.enable = z2;
        this.blendSfactor = i;
        this.blendDfactor = i2;
        this.order = i3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RendPass[] getRender() {
        return this.render;
    }

    @Nullable
    public final HashMap<String, PassParams[]> component2() {
        return this.params;
    }

    @Nullable
    public final HashMap<String, AnimatorValue> component3() {
        return this.animParams;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnableBlend() {
        return this.enableBlend;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBlendSfactor() {
        return this.blendSfactor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBlendDfactor() {
        return this.blendDfactor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final Layer copy(@NotNull RendPass[] render, @Nullable HashMap<String, PassParams[]> params, @Nullable HashMap<String, AnimatorValue> animParams, boolean enableBlend, boolean enable, int blendSfactor, int blendDfactor, int order) {
        Intrinsics.checkNotNullParameter(render, "render");
        return new Layer(render, params, animParams, enableBlend, enable, blendSfactor, blendDfactor, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Layer)) {
            return false;
        }
        Layer layer = (Layer) other;
        return Intrinsics.areEqual(this.render, layer.render) && Intrinsics.areEqual(this.params, layer.params) && Intrinsics.areEqual(this.animParams, layer.animParams) && this.enableBlend == layer.enableBlend && this.enable == layer.enable && this.blendSfactor == layer.blendSfactor && this.blendDfactor == layer.blendDfactor && this.order == layer.order;
    }

    @Nullable
    public final HashMap<String, AnimatorValue> getAnimParams() {
        return this.animParams;
    }

    public final int getBlendDfactor() {
        return this.blendDfactor;
    }

    public final int getBlendSfactor() {
        return this.blendSfactor;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableBlend() {
        return this.enableBlend;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final HashMap<String, PassParams[]> getParams() {
        return this.params;
    }

    @NotNull
    public final RendPass[] getRender() {
        return this.render;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.render) * 31;
        HashMap<String, PassParams[]> map = this.params;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        HashMap<String, AnimatorValue> map2 = this.animParams;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
        boolean z = this.enableBlend;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        boolean z2 = this.enable;
        return ((((((i + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.blendSfactor)) * 31) + Integer.hashCode(this.blendDfactor)) * 31) + Integer.hashCode(this.order);
    }

    public final void setAnimParams(@Nullable HashMap<String, AnimatorValue> map) {
        this.animParams = map;
    }

    public final void setBlendDfactor(int i) {
        this.blendDfactor = i;
    }

    public final void setBlendSfactor(int i) {
        this.blendSfactor = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEnableBlend(boolean z) {
        this.enableBlend = z;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final void setParams(@Nullable HashMap<String, PassParams[]> map) {
        this.params = map;
    }

    public final void setRender(@NotNull RendPass[] rendPassArr) {
        Intrinsics.checkNotNullParameter(rendPassArr, "<set-?>");
        this.render = rendPassArr;
    }

    @NotNull
    public String toString() {
        return "Layer(render=" + Arrays.toString(this.render) + ", params=" + this.params + ", animParams=" + this.animParams + ", enableBlend=" + this.enableBlend + ", enable=" + this.enable + ", blendSfactor=" + this.blendSfactor + ", blendDfactor=" + this.blendDfactor + ", order=" + this.order + ")";
    }
}
