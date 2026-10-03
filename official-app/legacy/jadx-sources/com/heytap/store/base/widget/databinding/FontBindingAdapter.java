package com.heytap.store.base.widget.databinding;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import com.heytap.store.base.widget.font.OppoFont;
import com.heytap.store.base.widget.font.OppoFontUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"bindOppoFont", "", "Landroid/widget/TextView;", "font", "Lcom/heytap/store/base/widget/font/OppoFont;", "Widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName(name = "FontBindingAdapter")
public final class FontBindingAdapter {
    @BindingAdapter({"android:bind_oppo_font_to_text_view"})
    public static final void bindOppoFont(@NotNull TextView textView, @NotNull OppoFont font) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(font, "font");
        OppoFontUtils.Companion companion = OppoFontUtils.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Typeface font2 = companion.getFont(context, font);
        if (font2 == null) {
            return;
        }
        textView.setTypeface(font2);
    }
}
