package com.oplusos.vfxmodelviewer.utils;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u001d\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0086\u0002J\u0019\u0010*\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020/H\u0086\u0002J\u0019\u0010*\u001a\u00020\u00002\u0006\u0010-\u001a\u00020/2\u0006\u0010.\u001a\u00020/H\u0086\u0002J\t\u00100\u001a\u00020/HÖ\u0001J\u0011\u00101\u001a\u00020\u00052\u0006\u0010+\u001a\u00020/H\u0086\nJ!\u00102\u001a\u0002032\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u00102\u001a\u0002032\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u00102\u001a\u0002032\u0006\u0010+\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u00102\u001a\u0002032\u0006\u0010-\u001a\u00020/2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\t\u00104\u001a\u000205HÖ\u0001R&\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR&\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0003R&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR&\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0003R&\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR&\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0003R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\r¨\u00066"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Bool2;", "", "v", "(Lcom/oplusos/vfxmodelviewer/utils/Bool2;)V", "x", "", "y", "(ZZ)V", "value", "g", "getG", "()Z", "setG", "(Z)V", "r", "getR", "setR", "rg", "getRg", "()Lcom/oplusos/vfxmodelviewer/utils/Bool2;", "setRg", "s", "getS", "setS", "st", "getSt", "setSt", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "getY", "setY", "component1", "component2", "copy", "equals", "other", ParserTag.TAG_GET, "index", "Lcom/oplusos/vfxmodelviewer/utils/VectorComponent;", "index1", "index2", "", "hashCode", "invoke", "set", "", "toString", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Bool2 {
    private boolean x;
    private boolean y;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Bool2() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ Bool2 copy$default(Bool2 bool2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bool2.x;
        }
        if ((i & 2) != 0) {
            z2 = bool2.y;
        }
        return bool2.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    @NotNull
    public final Bool2 copy(boolean x, boolean y) {
        return new Bool2(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bool2)) {
            return false;
        }
        Bool2 bool2 = (Bool2) other;
        return this.x == bool2.x && this.y == bool2.y;
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
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final boolean getG() {
        return getY();
    }

    public final boolean getR() {
        return getX();
    }

    @NotNull
    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final boolean getS() {
        return getX();
    }

    @NotNull
    public final Bool2 getSt() {
        return new Bool2(getX(), getY());
    }

    public final boolean getT() {
        return getY();
    }

    public final boolean getX() {
        return this.x;
    }

    @NotNull
    public final Bool2 getXy() {
        return new Bool2(getX(), getY());
    }

    public final boolean getY() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.x;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.y;
        return i + (z2 ? 1 : z2);
    }

    public final boolean invoke(int index) {
        return get(index - 1);
    }

    public final void set(int index, boolean v) {
        if (index == 0) {
            this.x = v;
        } else {
            if (index != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.y = v;
        }
    }

    public final void setG(boolean z) {
        setY(z);
    }

    public final void setR(boolean z) {
        setX(z);
    }

    public final void setRg(@NotNull Bool2 bool2) {
        Intrinsics.checkNotNullParameter(bool2, "value");
        setX(bool2.getX());
        setY(bool2.getY());
    }

    public final void setS(boolean z) {
        setX(z);
    }

    public final void setSt(@NotNull Bool2 bool2) {
        Intrinsics.checkNotNullParameter(bool2, "value");
        setX(bool2.getX());
        setY(bool2.getY());
    }

    public final void setT(boolean z) {
        setY(z);
    }

    public final void setX(boolean z) {
        this.x = z;
    }

    public final void setXy(@NotNull Bool2 bool2) {
        Intrinsics.checkNotNullParameter(bool2, "value");
        setX(bool2.getX());
        setY(bool2.getY());
    }

    public final void setY(boolean z) {
        this.y = z;
    }

    @NotNull
    public String toString() {
        return "Bool2(x=" + this.x + ", y=" + this.y + ')';
    }

    public Bool2(boolean z, boolean z2) {
        this.x = z;
        this.y = z2;
    }

    public /* synthetic */ Bool2(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool2(@NotNull Bool2 bool2) {
        this(bool2.x, bool2.y);
        Intrinsics.checkNotNullParameter(bool2, "v");
    }

    public final void set(int index1, int index2, boolean v) {
        set(index1, v);
        set(index2, v);
    }

    @NotNull
    public final Bool2 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final boolean get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        throw new IllegalArgumentException("index must be in 0..1");
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
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    @NotNull
    public final Bool2 get(int index1, int index2) {
        return new Bool2(get(index1), get(index2));
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, boolean v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, v);
        set(index2, v);
    }
}
