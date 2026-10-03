package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/q7h;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "b", "darkIcon", "lightIcon", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class q7h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("name")
    @Nullable
    private String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("darkIcon")
    @NotNull
    private final String darkIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lightIcon")
    @NotNull
    private final String lightIcon;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLightIcon() {
        return this.lightIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q7h)) {
            return false;
        }
        q7h q7hVar = (q7h) other;
        return Intrinsics.areEqual(this.name, q7hVar.name) && Intrinsics.areEqual(this.darkIcon, q7hVar.darkIcon) && Intrinsics.areEqual(this.lightIcon, q7hVar.lightIcon);
    }

    public int hashCode() {
        String str = this.name;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.darkIcon.hashCode()) * 31) + this.lightIcon.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkiFieldBean:{name:" + this.name + ",darkIcon:" + this.darkIcon + ",lightIcon:" + this.lightIcon + "}";
    }
}
