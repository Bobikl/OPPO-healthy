package com.heytap.speech.engine;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JC\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/Module;", "", "aecenable", "", "enable", "type", "", "using", "", "", "visible", "(ZZILjava/util/List;Z)V", "getAecenable", "()Z", "setAecenable", "(Z)V", "getEnable", "setEnable", "getType", "()I", "setType", "(I)V", "getUsing", "()Ljava/util/List;", "setUsing", "(Ljava/util/List;)V", "getVisible", "setVisible", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Module {
    private boolean aecenable;
    private boolean enable;
    private int type;

    @Nullable
    private List<String> using;
    private boolean visible;

    public Module() {
        this(false, false, 0, null, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Module copy$default(Module module, boolean z, boolean z2, int i, List list, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = module.aecenable;
        }
        if ((i2 & 2) != 0) {
            z2 = module.enable;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            i = module.type;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = module.using;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            z3 = module.visible;
        }
        return module.copy(z, z4, i3, list2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAecenable() {
        return this.aecenable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<String> component4() {
        return this.using;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final Module copy(boolean aecenable, boolean enable, int type, @Nullable List<String> using, boolean visible) {
        return new Module(aecenable, enable, type, using, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Module)) {
            return false;
        }
        Module module = (Module) other;
        return this.aecenable == module.aecenable && this.enable == module.enable && this.type == module.type && Intrinsics.areEqual(this.using, module.using) && this.visible == module.visible;
    }

    public final boolean getAecenable() {
        return this.aecenable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<String> getUsing() {
        return this.using;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.aecenable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode = (((i + r2) * 31) + Integer.hashCode(this.type)) * 31;
        List<String> list = this.using;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z3 = this.visible;
        return iHashCode2 + (z3 ? 1 : z3);
    }

    public final void setAecenable(boolean z) {
        this.aecenable = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUsing(@Nullable List<String> list) {
        this.using = list;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    @NotNull
    public String toString() {
        return "Module(aecenable=" + this.aecenable + ", enable=" + this.enable + ", type=" + this.type + ", using=" + this.using + ", visible=" + this.visible + ')';
    }

    public Module(boolean z, boolean z2, int i, @Nullable List<String> list, boolean z3) {
        this.aecenable = z;
        this.enable = z2;
        this.type = i;
        this.using = list;
        this.visible = z3;
    }

    public /* synthetic */ Module(boolean z, boolean z2, int i, List list, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? false : z3);
    }
}
