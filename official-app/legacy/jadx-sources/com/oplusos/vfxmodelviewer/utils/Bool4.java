package com.oplusos.vfxmodelviewer.utils;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\nB-\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J1\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010V\u001a\u00020\u00052\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010X\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020ZH\u0086\u0002J\u0019\u0010X\u001a\u00020\u00032\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020ZH\u0086\u0002J!\u0010X\u001a\u00020\b2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020ZH\u0086\u0002J)\u0010X\u001a\u00020\u00002\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020ZH\u0086\u0002J\u0011\u0010X\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020_H\u0086\u0002J\u0019\u0010X\u001a\u00020\u00032\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_H\u0086\u0002J!\u0010X\u001a\u00020\b2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_H\u0086\u0002J)\u0010X\u001a\u00020\u00002\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_2\u0006\u0010^\u001a\u00020_H\u0086\u0002J\t\u0010`\u001a\u00020_HÖ\u0001J\u0011\u0010a\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020_H\u0086\nJ1\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010b\u001a\u00020c2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010b\u001a\u00020c2\u0006\u0010Y\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J1\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_2\u0006\u0010^\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\t\u0010d\u001a\u00020eHÖ\u0001R&\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R&\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R&\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R&\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R&\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R&\u0010#\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010(\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\nR&\u00101\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R&\u00104\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R&\u00107\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R&\u0010:\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010/\"\u0004\b<\u0010\nR&\u0010=\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0011\"\u0004\bA\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R&\u0010D\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R&\u0010G\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R&\u0010J\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010/\"\u0004\bL\u0010\nR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0011\"\u0004\bN\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0011\"\u0004\bP\u0010\u0013¨\u0006f"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Bool4;", "", "v", "Lcom/oplusos/vfxmodelviewer/utils/Bool2;", "z", "", "w", "(Lcom/oplusos/vfxmodelviewer/utils/Bool2;ZZ)V", "Lcom/oplusos/vfxmodelviewer/utils/Bool3;", "(Lcom/oplusos/vfxmodelviewer/utils/Bool3;Z)V", "(Lcom/oplusos/vfxmodelviewer/utils/Bool4;)V", "x", "y", "(ZZZZ)V", "value", "a", "getA", "()Z", "setA", "(Z)V", "b", "getB", "setB", b2n.f, "getG", "setG", LogFieldKey.PROCESS_NAME_KEY, "getP", "setP", "q", "getQ", "setQ", "r", "getR", "setR", "rg", "getRg", "()Lcom/oplusos/vfxmodelviewer/utils/Bool2;", "setRg", "(Lcom/oplusos/vfxmodelviewer/utils/Bool2;)V", "rgb", "getRgb", "()Lcom/oplusos/vfxmodelviewer/utils/Bool3;", "setRgb", "(Lcom/oplusos/vfxmodelviewer/utils/Bool3;)V", "rgba", "getRgba", "()Lcom/oplusos/vfxmodelviewer/utils/Bool4;", "setRgba", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "stpq", "getStpq", "setStpq", "t", "getT", "setT", "getW", "setW", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "xyzw", "getXyzw", "setXyzw", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "equals", "other", ParserTag.TAG_GET, "index", "Lcom/oplusos/vfxmodelviewer/utils/VectorComponent;", "index1", "index2", "index3", "index4", "", "hashCode", "invoke", "set", "", "toString", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Bool4 {
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VectorComponent.values().length];
            iArr[VectorComponent.X.ordinal()] = 1;
            iArr[VectorComponent.R.ordinal()] = 2;
            iArr[VectorComponent.S.ordinal()] = 3;
            iArr[VectorComponent.Y.ordinal()] = 4;
            iArr[VectorComponent.G.ordinal()] = 5;
            iArr[VectorComponent.T.ordinal()] = 6;
            iArr[VectorComponent.Z.ordinal()] = 7;
            iArr[VectorComponent.B.ordinal()] = 8;
            iArr[VectorComponent.P.ordinal()] = 9;
            iArr[VectorComponent.W.ordinal()] = 10;
            iArr[VectorComponent.A.ordinal()] = 11;
            iArr[VectorComponent.Q.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Bool4() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ Bool4 copy$default(Bool4 bool4, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bool4.x;
        }
        if ((i & 2) != 0) {
            z2 = bool4.y;
        }
        if ((i & 4) != 0) {
            z3 = bool4.z;
        }
        if ((i & 8) != 0) {
            z4 = bool4.w;
        }
        return bool4.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @NotNull
    public final Bool4 copy(boolean x, boolean y, boolean z, boolean w) {
        return new Bool4(x, y, z, w);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bool4)) {
            return false;
        }
        Bool4 bool4 = (Bool4) other;
        return this.x == bool4.x && this.y == bool4.y && this.z == bool4.z && this.w == bool4.w;
    }

    public final boolean get(@NotNull VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.x;
            case 4:
            case 5:
            case 6:
                return this.y;
            case 7:
            case 8:
            case 9:
                return this.z;
            case 10:
            case 11:
            case 12:
                return this.w;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean getA() {
        return getW();
    }

    public final boolean getB() {
        return getZ();
    }

    public final boolean getG() {
        return getY();
    }

    public final boolean getP() {
        return getZ();
    }

    public final boolean getQ() {
        return getW();
    }

    public final boolean getR() {
        return getX();
    }

    @NotNull
    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    @NotNull
    public final Bool3 getRgb() {
        return new Bool3(getX(), getY(), getZ());
    }

    @NotNull
    public final Bool4 getRgba() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getS() {
        return getX();
    }

    @NotNull
    public final Bool2 getSt() {
        return new Bool2(getX(), getY());
    }

    @NotNull
    public final Bool3 getStp() {
        return new Bool3(getX(), getY(), getZ());
    }

    @NotNull
    public final Bool4 getStpq() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getT() {
        return getY();
    }

    public final boolean getW() {
        return this.w;
    }

    public final boolean getX() {
        return this.x;
    }

    @NotNull
    public final Bool2 getXy() {
        return new Bool2(getX(), getY());
    }

    @NotNull
    public final Bool3 getXyz() {
        return new Bool3(getX(), getY(), getZ());
    }

    @NotNull
    public final Bool4 getXyzw() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getY() {
        return this.y;
    }

    public final boolean getZ() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public int hashCode() {
        boolean z = this.x;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.y;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.z;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.w;
        return i3 + (z4 ? 1 : z4);
    }

    public final boolean invoke(int index) {
        return get(index - 1);
    }

    public final void set(int index, boolean v) {
        if (index == 0) {
            this.x = v;
            return;
        }
        if (index == 1) {
            this.y = v;
        } else if (index == 2) {
            this.z = v;
        } else {
            if (index != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.w = v;
        }
    }

    public final void setA(boolean z) {
        setW(z);
    }

    public final void setB(boolean z) {
        setZ(z);
    }

    public final void setG(boolean z) {
        setY(z);
    }

    public final void setP(boolean z) {
        setZ(z);
    }

    public final void setQ(boolean z) {
        setW(z);
    }

    public final void setR(boolean z) {
        setX(z);
    }

    public final void setRg(@NotNull Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(@NotNull Bool3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setRgba(@NotNull Bool4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setS(boolean z) {
        setX(z);
    }

    public final void setSt(@NotNull Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(@NotNull Bool3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setStpq(@NotNull Bool4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setT(boolean z) {
        setY(z);
    }

    public final void setW(boolean z) {
        this.w = z;
    }

    public final void setX(boolean z) {
        this.x = z;
    }

    public final void setXy(@NotNull Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setXyz(@NotNull Bool3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setXyzw(@NotNull Bool4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(boolean z) {
        this.y = z;
    }

    public final void setZ(boolean z) {
        this.z = z;
    }

    @NotNull
    public String toString() {
        return "Bool4(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ')';
    }

    public Bool4(boolean z, boolean z2, boolean z3, boolean z4) {
        this.x = z;
        this.y = z2;
        this.z = z3;
        this.w = z4;
    }

    @NotNull
    public final Bool2 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final void set(int index1, int index2, boolean v) {
        set(index1, v);
        set(index2, v);
    }

    public /* synthetic */ Bool4(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    @NotNull
    public final Bool3 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Bool3(get(index1), get(index2), get(index3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(@NotNull Bool2 v, boolean z, boolean z2) {
        this(v.getX(), v.getY(), z, z2);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @NotNull
    public final Bool4 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3, @NotNull VectorComponent index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new Bool4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int index1, int index2, int index3, boolean v) {
        set(index1, v);
        set(index2, v);
        set(index3, v);
    }

    public /* synthetic */ Bool4(Bool2 bool2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final boolean get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        if (index == 2) {
            return this.z;
        }
        if (index == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(@NotNull Bool3 v, boolean z) {
        this(v.getX(), v.getY(), v.getZ(), z);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public /* synthetic */ Bool4(Bool3 bool3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool3, (i & 2) != 0 ? false : z);
    }

    public final void set(int index1, int index2, int index3, int index4, boolean v) {
        set(index1, v);
        set(index2, v);
        set(index3, v);
        set(index4, v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(@NotNull Bool4 v) {
        this(v.x, v.y, v.z, v.w);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @NotNull
    public final Bool2 get(int index1, int index2) {
        return new Bool2(get(index1), get(index2));
    }

    @NotNull
    public final Bool3 get(int index1, int index2, int index3) {
        return new Bool3(get(index1), get(index2), get(index3));
    }

    public final void set(@NotNull VectorComponent index, boolean v) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.x = v;
                return;
            case 4:
            case 5:
            case 6:
                this.y = v;
                return;
            case 7:
            case 8:
            case 9:
                this.z = v;
                return;
            case 10:
            case 11:
            case 12:
                this.w = v;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final Bool4 get(int index1, int index2, int index3, int index4) {
        return new Bool4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, boolean v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, v);
        set(index2, v);
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3, boolean v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        set(index1, v);
        set(index2, v);
        set(index3, v);
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3, @NotNull VectorComponent index4, boolean v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        set(index1, v);
        set(index2, v);
        set(index3, v);
        set(index4, v);
    }
}
