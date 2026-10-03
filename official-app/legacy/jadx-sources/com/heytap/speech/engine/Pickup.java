package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJH\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/Pickup;", "", "displaytype", "", "enable", "", "far", "Lcom/heytap/speech/engine/Far;", "near", "Lcom/heytap/speech/engine/Near;", "visible", "(Ljava/lang/String;ZLcom/heytap/speech/engine/Far;Lcom/heytap/speech/engine/Near;Ljava/lang/Boolean;)V", "getDisplaytype", "()Ljava/lang/String;", "setDisplaytype", "(Ljava/lang/String;)V", "getEnable", "()Z", "setEnable", "(Z)V", "getFar", "()Lcom/heytap/speech/engine/Far;", "setFar", "(Lcom/heytap/speech/engine/Far;)V", "getNear", "()Lcom/heytap/speech/engine/Near;", "setNear", "(Lcom/heytap/speech/engine/Near;)V", "getVisible", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZLcom/heytap/speech/engine/Far;Lcom/heytap/speech/engine/Near;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/Pickup;", "equals", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Pickup {

    @Nullable
    private String displaytype;
    private boolean enable;

    @Nullable
    private Far far;

    @Nullable
    private Near near;

    @Nullable
    private Boolean visible;

    public Pickup() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ Pickup copy$default(Pickup pickup, String str, boolean z, Far far, Near near, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pickup.displaytype;
        }
        if ((i & 2) != 0) {
            z = pickup.enable;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            far = pickup.far;
        }
        Far far2 = far;
        if ((i & 8) != 0) {
            near = pickup.near;
        }
        Near near2 = near;
        if ((i & 16) != 0) {
            bool = pickup.visible;
        }
        return pickup.copy(str, z2, far2, near2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplaytype() {
        return this.displaytype;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Far getFar() {
        return this.far;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Near getNear() {
        return this.near;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final Pickup copy(@Nullable String displaytype, boolean enable, @Nullable Far far, @Nullable Near near, @Nullable Boolean visible) {
        return new Pickup(displaytype, enable, far, near, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pickup)) {
            return false;
        }
        Pickup pickup = (Pickup) other;
        return Intrinsics.areEqual(this.displaytype, pickup.displaytype) && this.enable == pickup.enable && Intrinsics.areEqual(this.far, pickup.far) && Intrinsics.areEqual(this.near, pickup.near) && Intrinsics.areEqual(this.visible, pickup.visible);
    }

    @Nullable
    public final String getDisplaytype() {
        return this.displaytype;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Far getFar() {
        return this.far;
    }

    @Nullable
    public final Near getNear() {
        return this.near;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    public int hashCode() {
        String str = this.displaytype;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.enable;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        Far far = this.far;
        int iHashCode2 = (i + (far == null ? 0 : far.hashCode())) * 31;
        Near near = this.near;
        int iHashCode3 = (iHashCode2 + (near == null ? 0 : near.hashCode())) * 31;
        Boolean bool = this.visible;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setDisplaytype(@Nullable String str) {
        this.displaytype = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setFar(@Nullable Far far) {
        this.far = far;
    }

    public final void setNear(@Nullable Near near) {
        this.near = near;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    @NotNull
    public String toString() {
        return "Pickup(displaytype=" + ((Object) this.displaytype) + ", enable=" + this.enable + ", far=" + this.far + ", near=" + this.near + ", visible=" + this.visible + ')';
    }

    public Pickup(@Nullable String str, boolean z, @Nullable Far far, @Nullable Near near, @Nullable Boolean bool) {
        this.displaytype = str;
        this.enable = z;
        this.far = far;
        this.near = near;
        this.visible = bool;
    }

    public /* synthetic */ Pickup(String str, boolean z, Far far, Near near, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : far, (i & 8) != 0 ? null : near, (i & 16) != 0 ? null : bool);
    }
}
