package com.oplus.cardwidget.file.util;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.cardwidget.util.Logger;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.io.TextStreamsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"", "Landroid/content/Context;", "context", "", "loadFromAsset", "com.oplus.card.widget.cardwidget"}, k = 2, mv = {1, 8, 0})
public final class FileSourceHelperKt {
    @Keep
    @Nullable
    public static final byte[] loadFromAsset(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpen = context.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(this)");
            Charset charset = Charsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, charset);
            String text = TextStreamsKt.readText(inputStreamReader);
            inputStreamReader.close();
            if (text == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl == null) {
                return null;
            }
            Logger.INSTANCE.e("FileSourceHelper", "loadFromAsset error: " + thM5290exceptionOrNullimpl.getMessage());
            return null;
        }
    }
}
