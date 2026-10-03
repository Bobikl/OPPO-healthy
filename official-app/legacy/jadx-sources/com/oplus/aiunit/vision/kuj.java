package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/kuj;", "Lcom/oplus/aiunit/vision/wuc;", "Landroid/app/Activity;", "r", "Landroid/app/Activity;", "getMContext", "()Landroid/app/Activity;", "mContext", "", "s", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "<init>", "(Landroid/app/Activity;Ljava/lang/String;)V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class kuj extends wuc {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Activity mContext;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(@NotNull Activity mContext, @NotNull String title) {
        super(mContext, title);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(title, "title");
        this.mContext = mContext;
        this.title = title;
    }
}
