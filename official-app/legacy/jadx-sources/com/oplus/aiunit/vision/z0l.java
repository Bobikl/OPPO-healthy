package com.oplus.aiunit.vision;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import coil.size.ViewSizeResolver;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmOverloads;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "view", "", "subtractPadding", "Lcoil/size/ViewSizeResolver;", "a", "(Landroid/view/View;Z)Lcoil/size/ViewSizeResolver;", "coil-base_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "ViewSizeResolvers")
public final class z0l {
    @JvmOverloads
    @JvmName(name = "create")
    @NotNull
    public static final <T extends View> ViewSizeResolver<T> a(@NotNull T t, boolean z) {
        return new ddf(t, z);
    }

    public static /* synthetic */ ViewSizeResolver b(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(view, z);
    }
}
