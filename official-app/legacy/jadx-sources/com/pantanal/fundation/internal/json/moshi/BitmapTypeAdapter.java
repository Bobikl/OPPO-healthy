package com.pantanal.fundation.internal.json.moshi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/pantanal/fundation/internal/json/moshi/BitmapTypeAdapter;", "", "Landroid/graphics/Bitmap;", "value", "", "toJson", "fromJson", "bitmap", "b", "base64", "a", "<init>", "()V", "Companion", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class BitmapTypeAdapter {
    public final Bitmap a(String base64) {
        byte[] bArrDecode = Base64.decode(base64, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(decodedB…es, 0, decodedBytes.size)");
        return bitmapDecodeByteArray;
    }

    public final String b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
        return strEncodeToString;
    }

    @FromJson
    @NotNull
    public final Bitmap fromJson(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return a(value);
    }

    @ToJson
    @NotNull
    public final String toJson(@NotNull Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return b(value);
    }
}
