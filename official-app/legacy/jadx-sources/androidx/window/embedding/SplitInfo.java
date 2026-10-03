package androidx.window.embedding;

import android.app.Activity;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0013\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "primaryActivityStack", "Landroidx/window/embedding/ActivityStack;", "secondaryActivityStack", "splitAttributes", "Landroidx/window/embedding/SplitAttributes;", "token", "Landroid/os/IBinder;", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/SplitAttributes;Landroid/os/IBinder;)V", "getPrimaryActivityStack", "()Landroidx/window/embedding/ActivityStack;", "getSecondaryActivityStack", "getSplitAttributes", "()Landroidx/window/embedding/SplitAttributes;", "getToken$window_release", "()Landroid/os/IBinder;", "contains", "", "activity", "Landroid/app/Activity;", "equals", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SplitInfo {

    @NotNull
    private final ActivityStack primaryActivityStack;

    @NotNull
    private final ActivityStack secondaryActivityStack;

    @NotNull
    private final SplitAttributes splitAttributes;

    @NotNull
    private final IBinder token;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SplitInfo(@NotNull ActivityStack primaryActivityStack, @NotNull ActivityStack secondaryActivityStack, @NotNull SplitAttributes splitAttributes, @NotNull IBinder token) {
        Intrinsics.checkNotNullParameter(primaryActivityStack, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(secondaryActivityStack, "secondaryActivityStack");
        Intrinsics.checkNotNullParameter(splitAttributes, "splitAttributes");
        Intrinsics.checkNotNullParameter(token, "token");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitAttributes = splitAttributes;
        this.token = token;
    }

    public final boolean contains(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) other;
        return Intrinsics.areEqual(this.primaryActivityStack, splitInfo.primaryActivityStack) && Intrinsics.areEqual(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && Intrinsics.areEqual(this.splitAttributes, splitInfo.splitAttributes) && Intrinsics.areEqual(this.token, splitInfo.token);
    }

    @NotNull
    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    @NotNull
    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    @NotNull
    public final SplitAttributes getSplitAttributes() {
        return this.splitAttributes;
    }

    @NotNull
    /* JADX INFO: renamed from: getToken$window_release, reason: from getter */
    public final IBinder getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + this.splitAttributes.hashCode()) * 31) + this.token.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.primaryActivityStack + ", ");
        sb.append("secondaryActivityStack=" + this.secondaryActivityStack + ", ");
        sb.append("splitAttributes=" + this.splitAttributes + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("token=");
        sb2.append(this.token);
        sb.append(sb2.toString());
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
