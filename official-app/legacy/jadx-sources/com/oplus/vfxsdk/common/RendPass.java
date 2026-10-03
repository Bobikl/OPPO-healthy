package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J%\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\nHÆ\u0003J\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0014Jd\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006%"}, d2 = {"Lcom/oplus/vfxsdk/common/RendPass;", "", "vs", "", "fs", "order", "", "uniforms", "Ljava/util/HashMap;", "Lcom/oplus/vfxsdk/common/Uniform;", "Lkotlin/collections/HashMap;", "status", "", "Lcom/oplus/vfxsdk/common/StatusAnim;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/HashMap;[Lcom/oplus/vfxsdk/common/StatusAnim;)V", "getFs", "()Ljava/lang/String;", "getOrder", "()I", "getStatus", "()[Lcom/oplus/vfxsdk/common/StatusAnim;", "[Lcom/oplus/vfxsdk/common/StatusAnim;", "getUniforms", "()Ljava/util/HashMap;", "getVs", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/HashMap;[Lcom/oplus/vfxsdk/common/StatusAnim;)Lcom/oplus/vfxsdk/common/RendPass;", "equals", "", "other", "hashCode", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RendPass {

    @NotNull
    private final String fs;
    private final int order;

    @Nullable
    private final StatusAnim[] status;

    @NotNull
    private final HashMap<String, Uniform> uniforms;

    @NotNull
    private final String vs;

    public RendPass(@NotNull String vs, @NotNull String fs, int i, @NotNull HashMap<String, Uniform> uniforms, @Nullable StatusAnim[] statusAnimArr) {
        Intrinsics.checkNotNullParameter(vs, "vs");
        Intrinsics.checkNotNullParameter(fs, "fs");
        Intrinsics.checkNotNullParameter(uniforms, "uniforms");
        this.vs = vs;
        this.fs = fs;
        this.order = i;
        this.uniforms = uniforms;
        this.status = statusAnimArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RendPass copy$default(RendPass rendPass, String str, String str2, int i, HashMap map, StatusAnim[] statusAnimArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rendPass.vs;
        }
        if ((i2 & 2) != 0) {
            str2 = rendPass.fs;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = rendPass.order;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            map = rendPass.uniforms;
        }
        HashMap map2 = map;
        if ((i2 & 16) != 0) {
            statusAnimArr = rendPass.status;
        }
        return rendPass.copy(str, str3, i3, map2, statusAnimArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVs() {
        return this.vs;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFs() {
        return this.fs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final HashMap<String, Uniform> component4() {
        return this.uniforms;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StatusAnim[] getStatus() {
        return this.status;
    }

    @NotNull
    public final RendPass copy(@NotNull String vs, @NotNull String fs, int order, @NotNull HashMap<String, Uniform> uniforms, @Nullable StatusAnim[] status) {
        Intrinsics.checkNotNullParameter(vs, "vs");
        Intrinsics.checkNotNullParameter(fs, "fs");
        Intrinsics.checkNotNullParameter(uniforms, "uniforms");
        return new RendPass(vs, fs, order, uniforms, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RendPass)) {
            return false;
        }
        RendPass rendPass = (RendPass) other;
        return Intrinsics.areEqual(this.vs, rendPass.vs) && Intrinsics.areEqual(this.fs, rendPass.fs) && this.order == rendPass.order && Intrinsics.areEqual(this.uniforms, rendPass.uniforms) && Intrinsics.areEqual(this.status, rendPass.status);
    }

    @NotNull
    public final String getFs() {
        return this.fs;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final StatusAnim[] getStatus() {
        return this.status;
    }

    @NotNull
    public final HashMap<String, Uniform> getUniforms() {
        return this.uniforms;
    }

    @NotNull
    public final String getVs() {
        return this.vs;
    }

    public int hashCode() {
        int iHashCode = ((((((this.vs.hashCode() * 31) + this.fs.hashCode()) * 31) + Integer.hashCode(this.order)) * 31) + this.uniforms.hashCode()) * 31;
        StatusAnim[] statusAnimArr = this.status;
        return iHashCode + (statusAnimArr == null ? 0 : Arrays.hashCode(statusAnimArr));
    }

    @NotNull
    public String toString() {
        return "RendPass(vs=" + this.vs + ", fs=" + this.fs + ", order=" + this.order + ", uniforms=" + this.uniforms + ", status=" + Arrays.toString(this.status) + ")";
    }
}
