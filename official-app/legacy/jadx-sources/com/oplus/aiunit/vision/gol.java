package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import io.protostuff.MapSchema;
import java.lang.ref.SoftReference;
import java.net.URISyntaxException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/gol;", "Lcom/oplus/aiunit/vision/g1a;", "Lcom/oplus/aiunit/vision/e1a;", "p0", "", "p1", "Landroid/graphics/Bitmap;", "p2", "", MapSchema.FIELD_NAME_ENTRY, "i", "f", "", "p3", "", "p4", "b", "d", "a", "url", "j", "Ljava/lang/ref/SoftReference;", "Landroid/content/Context;", "Ljava/lang/ref/SoftReference;", "contextRef", "<init>", "(Ljava/lang/ref/SoftReference;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class gol implements g1a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SoftReference<Context> contextRef;

    public gol(@NotNull SoftReference<Context> contextRef) {
        Intrinsics.checkNotNullParameter(contextRef, "contextRef");
        this.contextRef = contextRef;
    }

    @Override // com.oplus.aiunit.vision.g1a
    public boolean a(@NotNull e1a p0, @Nullable String p1) throws URISyntaxException {
        Context context;
        Intrinsics.checkNotNullParameter(p0, "p0");
        jnl.a("shouldOverrideUrlLoading:" + p1);
        if (p1 != null && !StringsKt__StringsJVMKt.startsWith(p1, "http://", true) && !StringsKt__StringsJVMKt.startsWith(p1, "https://", true) && !StringsKt__StringsJVMKt.startsWith(p1, "file://", true)) {
            PackageManager packageManager = p0.getContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "p0.context.packageManager");
            Intent uri = Intent.parseUri(p1, 1);
            uri.addFlags(268435456);
            if (packageManager.resolveActivity(uri, 131072) == null) {
                return true;
            }
        }
        if (!j(p1) || !icg.e(p1) || (context = this.contextRef.get()) == null || p1 == null) {
            return false;
        }
        hnl.INSTANCE.b(context, p1);
        return false;
    }

    @Override // com.oplus.aiunit.vision.g1a
    public void b(@NotNull e1a p0, int p1, @NotNull String p2, @NotNull String p3, boolean p4) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        jnl.a("onReceivedError");
    }

    @Override // com.oplus.aiunit.vision.g1a
    public void d(@NotNull e1a p0, @NotNull String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        jnl.a("onReceivedSslError");
    }

    @Override // com.oplus.aiunit.vision.g1a
    public void e(@NotNull e1a p0, @NotNull String p1, @NotNull Bitmap p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        jnl.a("onPageStarted");
    }

    @Override // com.oplus.aiunit.vision.g1a
    public void f(@NotNull e1a p0, @NotNull String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        jnl.a("onPageStarted");
    }

    @Override // com.oplus.aiunit.vision.g1a
    public void i(@NotNull e1a p0, @NotNull String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        jnl.a("onPageCommitVisible");
    }

    public final boolean j(String url) {
        return !(url == null || url.length() == 0) && StringsKt__StringsJVMKt.startsWith$default(url, "https://", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(url, ".apk", false, 2, null);
    }
}
