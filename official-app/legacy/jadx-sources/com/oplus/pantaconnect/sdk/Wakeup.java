package com.oplus.pantaconnect.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/oplus/pantaconnect/sdk/Wakeup;", "", "componentType", "", "pkg", "", "action", "(ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getComponentType", "()I", "getPkg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Wakeup {

    @NotNull
    private final String action;
    private final int componentType;

    @Nullable
    private final String pkg;

    @JvmOverloads
    public Wakeup(int i, @NotNull String str) {
        this(i, null, str, 2, null);
    }

    public static /* synthetic */ Wakeup copy$default(Wakeup wakeup, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wakeup.componentType;
        }
        if ((i2 & 2) != 0) {
            str = wakeup.pkg;
        }
        if ((i2 & 4) != 0) {
            str2 = wakeup.action;
        }
        return wakeup.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getComponentType() {
        return this.componentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Wakeup copy(int componentType, @Nullable String pkg, @NotNull String action) {
        return new Wakeup(componentType, pkg, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Wakeup)) {
            return false;
        }
        Wakeup wakeup = (Wakeup) other;
        return this.componentType == wakeup.componentType && Intrinsics.areEqual(this.pkg, wakeup.pkg) && Intrinsics.areEqual(this.action, wakeup.action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final int getComponentType() {
        return this.componentType;
    }

    @Nullable
    public final String getPkg() {
        return this.pkg;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.componentType) * 31;
        String str = this.pkg;
        return this.action.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "Wakeup(componentType=" + this.componentType + ", pkg=" + this.pkg + ", action=" + this.action + ')';
    }

    @JvmOverloads
    public Wakeup(@NotNull String str) {
        this(0, null, str, 3, null);
    }

    @JvmOverloads
    public Wakeup(int i, @Nullable String str, @NotNull String str2) {
        this.componentType = i;
        this.pkg = str;
        this.action = str2;
    }

    public /* synthetic */ Wakeup(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, str2);
    }
}
