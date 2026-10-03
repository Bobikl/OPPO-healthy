package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.heytap.health.health_archives.R$drawable;
import com.heytap.health.health_archives.R$string;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/jm8;", "", "Landroid/widget/TextView;", "textView", "", "a", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class jm8 {

    @NotNull
    public static final jm8 INSTANCE = new jm8();

    public final void a(@NotNull TextView textView) {
        Drawable drawableMutate;
        Intrinsics.checkNotNullParameter(textView, "textView");
        Context context = textView.getContext();
        String string = context.getString(R$string.health_archives_aigc_tips_prefix);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rchives_aigc_tips_prefix)");
        String string2 = context.getString(R$string.health_archives_aigc_tips_brand);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…archives_aigc_tips_brand)");
        String string3 = context.getString(R$string.health_archives_aigc_tips_suffix);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…rchives_aigc_tips_suffix)");
        int iA = xu5.a(context, 4.0f);
        int iA2 = xu5.a(context, 2.5f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(StringUtil.SPACE);
        int length2 = spannableStringBuilder.length();
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append(StringUtil.SPACE);
        int length4 = spannableStringBuilder.length();
        int length5 = spannableStringBuilder.length();
        spannableStringBuilder.append(StringUtil.SPACE);
        int length6 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.append(StringUtil.SPACE);
        spannableStringBuilder.append((CharSequence) string3);
        spannableStringBuilder.setSpan(new ar7(iA), length, length2, 33);
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.health_archives_text_aigc_logo);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return;
        }
        int iA3 = xu5.a(context, 12.0f);
        drawableMutate.setBounds(0, 0, iA3, iA3);
        spannableStringBuilder.setSpan(new ImageSpan(drawableMutate, 2), length3, length4, 33);
        spannableStringBuilder.setSpan(new ar7(iA2), length5, length6, 33);
        textView.setText(spannableStringBuilder);
    }
}
