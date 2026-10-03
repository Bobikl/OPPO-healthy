package com.oplus.aiunit.vision;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.heytap.webpro.core.WebProFragment;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ezf, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\n\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/ezf;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/net/Uri;", ParserTag.TAG_URI, "Ljava/lang/Class;", "Lcom/heytap/webpro/core/WebProFragment;", "b", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "c", "activity", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "extBundle", "I", "()I", "flag", "<init>", "(Landroid/net/Uri;Ljava/lang/Class;Ljava/lang/Class;Landroid/os/Bundle;I)V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class RouterData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Uri uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Class<? extends WebProFragment> fragment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Class<? extends FragmentActivity> activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final Bundle extBundle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int flag;

    public RouterData(@NotNull Uri uri, @NotNull Class<? extends WebProFragment> fragment, @NotNull Class<? extends FragmentActivity> activity, @NotNull Bundle extBundle, int i) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extBundle, "extBundle");
        this.uri = uri;
        this.fragment = fragment;
        this.activity = activity;
        this.extBundle = extBundle;
        this.flag = i;
    }

    @NotNull
    public final Class<? extends FragmentActivity> a() {
        return this.activity;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bundle getExtBundle() {
        return this.extBundle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final Class<? extends WebProFragment> d() {
        return this.fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouterData)) {
            return false;
        }
        RouterData routerData = (RouterData) other;
        return Intrinsics.areEqual(this.uri, routerData.uri) && Intrinsics.areEqual(this.fragment, routerData.fragment) && Intrinsics.areEqual(this.activity, routerData.activity) && Intrinsics.areEqual(this.extBundle, routerData.extBundle) && this.flag == routerData.flag;
    }

    public int hashCode() {
        Uri uri = this.uri;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Class<? extends WebProFragment> cls = this.fragment;
        int iHashCode2 = (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31;
        Class<? extends FragmentActivity> cls2 = this.activity;
        int iHashCode3 = (iHashCode2 + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        Bundle bundle = this.extBundle;
        return ((iHashCode3 + (bundle != null ? bundle.hashCode() : 0)) * 31) + this.flag;
    }

    @NotNull
    public String toString() {
        return "RouterData(uri=" + this.uri + ", fragment=" + this.fragment + ", activity=" + this.activity + ", extBundle=" + this.extBundle + ", flag=" + this.flag + ")";
    }
}
