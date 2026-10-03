package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/oplus/vfxsdk/common/StatusAnim;", "", "name", "", "anims", "", "Lcom/oplus/vfxsdk/common/Anim;", "(Ljava/lang/String;[Lcom/oplus/vfxsdk/common/Anim;)V", "getAnims", "()[Lcom/oplus/vfxsdk/common/Anim;", "[Lcom/oplus/vfxsdk/common/Anim;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Lcom/oplus/vfxsdk/common/Anim;)Lcom/oplus/vfxsdk/common/StatusAnim;", "equals", "", "other", "hashCode", "", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StatusAnim {

    @NotNull
    private final Anim[] anims;

    @NotNull
    private final String name;

    public StatusAnim(@NotNull String name, @NotNull Anim[] anims) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.name = name;
        this.anims = anims;
    }

    public static /* synthetic */ StatusAnim copy$default(StatusAnim statusAnim, String str, Anim[] animArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusAnim.name;
        }
        if ((i & 2) != 0) {
            animArr = statusAnim.anims;
        }
        return statusAnim.copy(str, animArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Anim[] getAnims() {
        return this.anims;
    }

    @NotNull
    public final StatusAnim copy(@NotNull String name, @NotNull Anim[] anims) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(anims, "anims");
        return new StatusAnim(name, anims);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusAnim)) {
            return false;
        }
        StatusAnim statusAnim = (StatusAnim) other;
        return Intrinsics.areEqual(this.name, statusAnim.name) && Intrinsics.areEqual(this.anims, statusAnim.anims);
    }

    @NotNull
    public final Anim[] getAnims() {
        return this.anims;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Arrays.hashCode(this.anims);
    }

    @NotNull
    public String toString() {
        return "StatusAnim(name=" + this.name + ", anims=" + Arrays.toString(this.anims) + ")";
    }
}
