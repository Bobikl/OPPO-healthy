package com.heytap.webview.extension.activity;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.heytap.webview.extension.fragment.WebExtFragment;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\fHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/heytap/webview/extension/activity/RouterData;", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "fragment", "Ljava/lang/Class;", "Lcom/heytap/webview/extension/fragment/WebExtFragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "extBundle", "Landroid/os/Bundle;", "flag", "", "(Landroid/net/Uri;Ljava/lang/Class;Ljava/lang/Class;Landroid/os/Bundle;I)V", "getActivity", "()Ljava/lang/Class;", "getExtBundle", "()Landroid/os/Bundle;", "getFlag", "()I", "getFragment", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RouterData {

    @NotNull
    private final Class<? extends FragmentActivity> activity;

    @NotNull
    private final Bundle extBundle;
    private final int flag;

    @NotNull
    private final Class<? extends WebExtFragment> fragment;

    @NotNull
    private final Uri uri;

    public RouterData(@NotNull Uri uri, @NotNull Class<? extends WebExtFragment> fragment, @NotNull Class<? extends FragmentActivity> activity, @NotNull Bundle extBundle, int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouterData copy$default(RouterData routerData, Uri uri, Class cls, Class cls2, Bundle bundle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uri = routerData.uri;
        }
        if ((i2 & 2) != 0) {
            cls = routerData.fragment;
        }
        Class cls3 = cls;
        if ((i2 & 4) != 0) {
            cls2 = routerData.activity;
        }
        Class cls4 = cls2;
        if ((i2 & 8) != 0) {
            bundle = routerData.extBundle;
        }
        Bundle bundle2 = bundle;
        if ((i2 & 16) != 0) {
            i = routerData.flag;
        }
        return routerData.copy(uri, cls3, cls4, bundle2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    public final Class<? extends WebExtFragment> component2() {
        return this.fragment;
    }

    @NotNull
    public final Class<? extends FragmentActivity> component3() {
        return this.activity;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getExtBundle() {
        return this.extBundle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final RouterData copy(@NotNull Uri uri, @NotNull Class<? extends WebExtFragment> fragment, @NotNull Class<? extends FragmentActivity> activity, @NotNull Bundle extBundle, int flag) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extBundle, "extBundle");
        return new RouterData(uri, fragment, activity, extBundle, flag);
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

    @NotNull
    public final Class<? extends FragmentActivity> getActivity() {
        return this.activity;
    }

    @NotNull
    public final Bundle getExtBundle() {
        return this.extBundle;
    }

    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final Class<? extends WebExtFragment> getFragment() {
        return this.fragment;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((this.uri.hashCode() * 31) + this.fragment.hashCode()) * 31) + this.activity.hashCode()) * 31) + this.extBundle.hashCode()) * 31) + Integer.hashCode(this.flag);
    }

    @NotNull
    public String toString() {
        return "RouterData(uri=" + this.uri + ", fragment=" + this.fragment + ", activity=" + this.activity + ", extBundle=" + this.extBundle + ", flag=" + this.flag + ')';
    }
}
