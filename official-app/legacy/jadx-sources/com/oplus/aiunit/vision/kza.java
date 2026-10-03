package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/kza;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "src", "a", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class kza {

    @NotNull
    public static final kza INSTANCE = new kza();

    @NotNull
    public final <T> List<T> a(@NotNull List<T> src) throws IOException, ClassNotFoundException {
        Intrinsics.checkNotNullParameter(src, "src");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(src);
        Object object = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        if (object != null) {
            return TypeIntrinsics.asMutableList(object);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
    }
}
