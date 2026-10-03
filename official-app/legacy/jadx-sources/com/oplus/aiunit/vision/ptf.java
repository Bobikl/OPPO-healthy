package com.oplus.aiunit.vision;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ptf;", "Lcom/oplus/aiunit/vision/rfb;", "Landroid/net/Uri;", "data", "Lcom/oplus/aiunit/vision/frd;", "options", "c", "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nResourceUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,34:1\n1#2:35\n29#3:36\n*S KotlinDebug\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n*L\n25#1:36\n*E\n"})
public final class ptf implements rfb<Uri, Uri> {
    public final boolean b(Uri data) {
        if (!Intrinsics.areEqual(data.getScheme(), "android.resource")) {
            return false;
        }
        String authority = data.getAuthority();
        return !(authority == null || StringsKt__StringsJVMKt.isBlank(authority)) && data.getPathSegments().size() == 2;
    }

    @Override // com.oplus.aiunit.vision.rfb
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(@NotNull Uri data, @NotNull frd options) throws PackageManager.NameNotFoundException {
        if (!b(data)) {
            return null;
        }
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = options.getContext().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new IllegalStateException(("Invalid android.resource URI: " + data).toString());
        }
        return Uri.parse("android.resource://" + authority + mla.SEPARATOR + identifier);
    }
}
