package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/is3;", "", "", "a", "I", "()I", "providerId", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "widgetName", "providerTitle", "", "d", "Z", "()Z", "isTitle", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class is3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int providerId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String widgetName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String providerTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isTitle;

    public is3(int i, @NotNull String widgetName, @NotNull String providerTitle, boolean z) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(providerTitle, "providerTitle");
        this.providerId = i;
        this.widgetName = widgetName;
        this.providerTitle = providerTitle;
        this.isTitle = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getProviderId() {
        return this.providerId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProviderTitle() {
        return this.providerTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsTitle() {
        return this.isTitle;
    }
}
