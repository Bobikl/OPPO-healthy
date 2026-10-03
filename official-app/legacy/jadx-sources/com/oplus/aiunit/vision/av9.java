package com.oplus.aiunit.vision;

import android.animation.ObjectAnimator;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/av9;", ExifInterface.GPS_DIRECTION_TRUE, "", "endValue", "Landroid/animation/ObjectAnimator;", "a", "(Ljava/lang/Object;)Landroid/animation/ObjectAnimator;", "Lkotlin/Function0;", "", oea.CALLBACK, "b", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public interface av9<T> {
    @NotNull
    ObjectAnimator a(T endValue);

    void b(@NotNull Function0<Unit> cb);
}
