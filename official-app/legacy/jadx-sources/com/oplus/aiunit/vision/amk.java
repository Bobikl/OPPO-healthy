package com.oplus.aiunit.vision;

import android.net.Uri;
import android.text.TextUtils;
import com.oplus.channel.server.IUserContext;
import com.oplus.smartenginehelper.ParserTag;
import com.pantanal.server.content.sdk.StaticSdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/amk;", "", "Landroid/net/Uri;", ParserTag.TAG_URI, "a", "", "userId", "b", "(Landroid/net/Uri;Ljava/lang/Integer;)Landroid/net/Uri;", "", "c", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class amk {

    @NotNull
    public static final amk INSTANCE = new amk();

    @JvmStatic
    @NotNull
    public static final Uri a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        IUserContext iUserContextC = StaticSdk.INSTANCE.c();
        return iUserContextC == null ? uri : b(uri, Integer.valueOf(iUserContextC.getUserId()));
    }

    @JvmStatic
    @NotNull
    public static final Uri b(@NotNull Uri uri, @Nullable Integer userId) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if ((userId != null && userId.intValue() == -2) || !Intrinsics.areEqual("content", uri.getScheme()) || c(uri)) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.encodedAuthority("" + userId + '@' + ((Object) uri.getEncodedAuthority()));
        Uri uriBuild = builderBuildUpon.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
        return uriBuild;
    }

    @JvmStatic
    public static final boolean c(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return !TextUtils.isEmpty(uri.getUserInfo());
    }
}
