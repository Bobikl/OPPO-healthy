package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/oplus/vfxsdk/common/PassParams;", "", "uniformPrams", "", "Lcom/oplus/vfxsdk/common/UniformValue;", "([Lcom/oplus/vfxsdk/common/UniformValue;)V", "getUniformPrams", "()[Lcom/oplus/vfxsdk/common/UniformValue;", "[Lcom/oplus/vfxsdk/common/UniformValue;", "component1", "copy", "([Lcom/oplus/vfxsdk/common/UniformValue;)Lcom/oplus/vfxsdk/common/PassParams;", "equals", "", "other", "hashCode", "", "toString", "", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PassParams {

    @NotNull
    private final UniformValue[] uniformPrams;

    public PassParams(@NotNull UniformValue[] uniformValueArr) {
        Intrinsics.checkNotNullParameter(uniformValueArr, "uniformPrams");
        this.uniformPrams = uniformValueArr;
    }

    public static /* synthetic */ PassParams copy$default(PassParams passParams, UniformValue[] uniformValueArr, int i, Object obj) {
        if ((i & 1) != 0) {
            uniformValueArr = passParams.uniformPrams;
        }
        return passParams.copy(uniformValueArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UniformValue[] getUniformPrams() {
        return this.uniformPrams;
    }

    @NotNull
    public final PassParams copy(@NotNull UniformValue[] uniformPrams) {
        Intrinsics.checkNotNullParameter(uniformPrams, "uniformPrams");
        return new PassParams(uniformPrams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PassParams) && Intrinsics.areEqual(this.uniformPrams, ((PassParams) other).uniformPrams);
    }

    @NotNull
    public final UniformValue[] getUniformPrams() {
        return this.uniformPrams;
    }

    public int hashCode() {
        return Arrays.hashCode(this.uniformPrams);
    }

    @NotNull
    public String toString() {
        return "PassParams(uniformPrams=" + Arrays.toString(this.uniformPrams) + ")";
    }
}
