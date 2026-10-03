package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.heytap.webpro.core.WebProActivity;
import com.heytap.webpro.core.WebProFragment;
import com.heytap.webview.extension.activity.RouterKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J&\u0010\u000f\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016J \u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\nH\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R \u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001f¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/qnl;", "", "", "url", b2n.f, "Landroid/net/Uri;", ParserTag.TAG_URI, "f", "styleName", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Class;", "Lcom/heytap/webpro/core/WebProFragment;", "fragmentClass", "Landroidx/fragment/app/FragmentActivity;", "activityClass", "d", "Landroid/os/Bundle;", "bundle", "a", "key", "value", "b", "Landroid/content/Context;", "context", "", "i", "j", "", b2n.g, "c", "Landroid/net/Uri;", "Ljava/lang/Class;", "Landroid/os/Bundle;", "extBundle", "", "I", "flag", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class qnl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Uri uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Class<? extends WebProFragment> fragmentClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Bundle extBundle = new Bundle();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int flag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Class<? extends FragmentActivity> activityClass;

    @NotNull
    public final qnl a(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.extBundle.putAll(bundle);
        return this;
    }

    @NotNull
    public final qnl b(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.extBundle.putString(key, value);
        return this;
    }

    public final void c(Context context, Class<? extends FragmentActivity> activityClass) {
        Intent intentAddFlags = new Intent(context, activityClass).putExtra(RouterKey.URI, this.uri).putExtra(RouterKey.FRAGMENT, this.fragmentClass).putExtra(RouterKey.EXT_BUNDLE, this.extBundle).addFlags(this.flag);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "Intent(context, activity…          .addFlags(flag)");
        context.startActivity(intentAddFlags);
    }

    @NotNull
    public final qnl d(@NotNull Class<? extends WebProFragment> fragmentClass, @NotNull Class<? extends FragmentActivity> activityClass) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        this.activityClass = activityClass;
        this.fragmentClass = fragmentClass;
        return this;
    }

    @NotNull
    public final qnl e(@NotNull String styleName) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        this.fragmentClass = ay7.INSTANCE.a(styleName);
        return this;
    }

    @NotNull
    public final qnl f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        return this;
    }

    @NotNull
    public final qnl g(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!TextUtils.isEmpty(url)) {
            this.uri = Uri.parse(url);
        }
        return this;
    }

    public final void h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uri = this.uri;
        if (uri != null) {
            if (spc.d(uri)) {
                j(context);
            } else {
                i(context);
            }
        }
    }

    public final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uri = this.uri;
        if (uri != null) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            } catch (Exception e2) {
                q7b.f("WebProRouter", "startDeepLink failed!", e2);
            }
        }
        return false;
    }

    public final boolean j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uri = this.uri;
        if (uri == null) {
            return false;
        }
        Class<? extends WebProFragment> cls = this.fragmentClass;
        if (cls == null) {
            throw new IllegalArgumentException("fragment is null!");
        }
        Class<? extends FragmentActivity> clsB = this.activityClass;
        if (clsB == null) {
            clsB = ay7.INSTANCE.b(cls);
        }
        if (clsB == null) {
            clsB = WebProActivity.class;
        }
        Class<? extends FragmentActivity> cls2 = clsB;
        if (onl.g().a(context, new RouterData(uri, cls, cls2, this.extBundle, this.flag))) {
            return false;
        }
        c(context, cls2);
        return true;
    }
}
