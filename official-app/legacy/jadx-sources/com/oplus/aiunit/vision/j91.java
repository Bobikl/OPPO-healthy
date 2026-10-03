package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/j91;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "category", "", "b", "I", "()I", "x", "c", "y", "<init>", "(Ljava/lang/String;II)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class j91 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("widget")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("x")
    private final int x;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("y")
    private final int y;

    public j91(@NotNull String category, int i, int i2) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        this.x = i;
        this.y = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getY() {
        return this.y;
    }

    public /* synthetic */ j91(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
