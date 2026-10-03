package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health_base.R$string;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.ParserTag;
import com.xiaomi.mipush.sdk.Constants;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ&\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017J.\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J?\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/c9i;", "", "", "str", "specialStr", "", "textSizeSp", ParserTag.TAG_TEXT_STYLE, "Landroid/text/SpannableString;", c7n.f, "contentString", "clickString", "clickTextColor", "Lcom/oplus/aiunit/vision/oz9;", "spanClickListener", "", "a", "imageWidthPx", "imageHeightPx", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, c7n.g, "minutes", "", "numberTextSize", "unitTextSize", MapSchema.FIELD_NAME_ENTRY, "appearance", "f", "number1", "number2", "percentSymbol", "symbolTextSize", "b", "(ILjava/lang/Integer;Ljava/lang/String;FF)Landroid/text/SpannableString;", "<init>", "()V", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class c9i {
    public static final int $stable = 0;

    @NotNull
    public static final c9i INSTANCE = new c9i();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/oplus/aiunit/vision/c9i$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", ParserTag.TAG_ONCLICK, "Landroid/text/TextPaint;", "ds", "updateDrawState", "health_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ClickableSpan {
        public final /* synthetic */ oz9 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f11372j;

        public a(oz9 oz9Var, int i) {
            this.i = oz9Var;
            this.f11372j = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            CharSequence text = ((TextView) widget).getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            this.i.a(spanned.subSequence(spanned.getSpanStart(this), spanned.getSpanEnd(this)));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            ds.setColor(this.f11372j);
            ds.setUnderlineText(false);
        }
    }

    public static final void c(SpannableString spannableString, int i, int i2, int i3) {
        spannableString.setSpan(new AbsoluteSizeSpan(i, false), i2, i3, 33);
    }

    public static /* synthetic */ SpannableString d(c9i c9iVar, int i, Integer num, String str, float f, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            str = "%";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            f = 22.0f;
        }
        float f3 = f;
        if ((i2 & 16) != 0) {
            f2 = 14.0f;
        }
        return c9iVar.b(i, num2, str2, f3, f2);
    }

    @NotNull
    public final CharSequence a(@NotNull String contentString, @NotNull String clickString, int clickTextColor, @NotNull oz9 spanClickListener) {
        Intrinsics.checkNotNullParameter(contentString, "contentString");
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        Intrinsics.checkNotNullParameter(spanClickListener, "spanClickListener");
        SpannableString spannableString = new SpannableString(clickString);
        spannableString.setSpan(new a(spanClickListener, clickTextColor), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(contentString);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) contentString, clickString, 0, false, 6, (Object) null);
        spannableStringBuilder.replace(iIndexOf$default, clickString.length() + iIndexOf$default, (CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @NotNull
    public final SpannableString b(int number1, @Nullable Integer number2, @NotNull String percentSymbol, float numberTextSize, float symbolTextSize) {
        String str;
        Intrinsics.checkNotNullParameter(percentSymbol, "percentSymbol");
        Context contextA = e88.a();
        String strValueOf = String.valueOf(number1);
        int iN = qmg.n(contextA, numberTextSize);
        int iN2 = qmg.n(contextA, symbolTextSize);
        if (number2 == null) {
            str = strValueOf + percentSymbol;
        } else {
            str = strValueOf + percentSymbol + Constants.ACCEPT_TIME_SEPARATOR_SERVER + number2 + percentSymbol;
        }
        SpannableString spannableString = new SpannableString(str);
        c(spannableString, iN, 0, strValueOf.length() + 0);
        int length = strValueOf.length() + 0;
        c(spannableString, iN2, length, percentSymbol.length() + length);
        int length2 = length + percentSymbol.length();
        if (number2 != null) {
            String string = number2.toString();
            int i = length2 + 1;
            c(spannableString, iN, length2, i);
            c(spannableString, iN, i, string.length() + i);
            int length3 = i + string.length();
            c(spannableString, iN2, length3, percentSymbol.length() + length3);
        }
        return spannableString;
    }

    @NotNull
    public final SpannableString e(int minutes, float numberTextSize, float unitTextSize) {
        return f(minutes, numberTextSize, unitTextSize, 0, 0);
    }

    @NotNull
    public final SpannableString f(int minutes, float numberTextSize, float unitTextSize, int appearance, int textStyle) {
        Context contextA = e88.a();
        if (minutes < 60) {
            String strValueOf = String.valueOf(minutes);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = contextA.getString(R$string.health_base_minute_v2);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…ng.health_base_minute_v2)");
            String str = String.format(string, Arrays.copyOf(new Object[]{strValueOf}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, strValueOf, 0, false, 6, (Object) null);
            int length = strValueOf.length() + iIndexOf$default;
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, numberTextSize), false), iIndexOf$default, length, 33);
            if (appearance != 0) {
                spannableString.setSpan(new TextAppearanceSpan(contextA, appearance), iIndexOf$default, length, 33);
            }
            spannableString.setSpan(new StyleSpan(textStyle), iIndexOf$default, length, 33);
            if (unitTextSize <= 0.0f) {
                return spannableString;
            }
            int length2 = str.length();
            spannableString.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, unitTextSize), false), length, length2, 33);
            if (appearance != 0) {
                spannableString.setSpan(new TextAppearanceSpan(contextA, appearance), length, length2, 33);
            }
            spannableString.setSpan(new StyleSpan(textStyle), length, length2, 33);
            return spannableString;
        }
        int i = minutes % 60;
        String strValueOf2 = String.valueOf(minutes / 60);
        String strValueOf3 = String.valueOf(i);
        if (i <= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = contextA.getString(R$string.health_base_time_hour_v2);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(com.he…health_base_time_hour_v2)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{strValueOf2}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str2, strValueOf2, 0, false, 6, (Object) null);
            int length3 = strValueOf2.length() + iIndexOf$default2;
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, numberTextSize), false), iIndexOf$default2, length3, 33);
            if (appearance != 0) {
                spannableString2.setSpan(new TextAppearanceSpan(contextA, appearance), iIndexOf$default2, length3, 33);
            }
            spannableString2.setSpan(new StyleSpan(textStyle), iIndexOf$default2, length3, 33);
            if (unitTextSize <= 0.0f) {
                return spannableString2;
            }
            int length4 = str2.length();
            spannableString2.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, unitTextSize), false), length3, length4, 33);
            if (appearance != 0) {
                spannableString2.setSpan(new TextAppearanceSpan(contextA, appearance), length3, length4, 33);
            }
            spannableString2.setSpan(new StyleSpan(textStyle), length3, length4, 33);
            return spannableString2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String string3 = contextA.getString(R$string.health_base_hour_minute_v2);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(com.he…alth_base_hour_minute_v2)");
        String str3 = String.format(string3, Arrays.copyOf(new Object[]{strValueOf2, strValueOf3}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str3, strValueOf2, 0, false, 6, (Object) null);
        int length5 = strValueOf2.length() + iIndexOf$default3;
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, strValueOf3, 0, false, 6, (Object) null);
        int length6 = strValueOf3.length() + iLastIndexOf$default;
        SpannableString spannableString3 = new SpannableString(str3);
        spannableString3.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, numberTextSize), false), iIndexOf$default3, length5, 33);
        if (appearance != 0) {
            spannableString3.setSpan(new TextAppearanceSpan(contextA, appearance), iIndexOf$default3, length5, 33);
        }
        spannableString3.setSpan(new StyleSpan(textStyle), iIndexOf$default3, length5, 33);
        spannableString3.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, numberTextSize), false), iLastIndexOf$default, length6, 33);
        if (appearance != 0) {
            spannableString3.setSpan(new TextAppearanceSpan(contextA, appearance), iLastIndexOf$default, length6, 33);
        }
        spannableString3.setSpan(new StyleSpan(textStyle), iLastIndexOf$default, length6, 33);
        if (unitTextSize > 0.0f) {
            if (length5 < iLastIndexOf$default) {
                spannableString3.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, unitTextSize), false), length5, iLastIndexOf$default, 33);
                if (appearance != 0) {
                    spannableString3.setSpan(new TextAppearanceSpan(contextA, appearance), length5, iLastIndexOf$default, 33);
                }
                spannableString3.setSpan(new StyleSpan(textStyle), length5, iLastIndexOf$default, 33);
            }
            int length7 = str3.length();
            if (length6 < length7) {
                spannableString3.setSpan(new AbsoluteSizeSpan(qmg.a(contextA, unitTextSize), false), length6, length7, 33);
                if (appearance != 0) {
                    spannableString3.setSpan(new TextAppearanceSpan(contextA, appearance), length6, length7, 33);
                }
                spannableString3.setSpan(new StyleSpan(textStyle), length6, length7, 33);
            }
        }
        return spannableString3;
    }

    @NotNull
    public final SpannableString g(@NotNull String str, @NotNull String specialStr, int textSizeSp, int textStyle) {
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(specialStr, "specialStr");
        SpannableString spannableString = new SpannableString(str);
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) specialStr, false, 2, (Object) null)) {
            return spannableString;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, specialStr, 0, false, 6, (Object) null) + 1;
        spannableString.setSpan(new AbsoluteSizeSpan(textSizeSp, true), 0, iIndexOf$default, 33);
        spannableString.setSpan(new TextAppearanceSpan(e88.a(), textStyle), 0, iIndexOf$default, 33);
        return spannableString;
    }

    @NotNull
    public final SpannableString h(@NotNull String str, int imageWidthPx, int imageHeightPx, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        String str2 = str + " #";
        SpannableString spannableString = new SpannableString(str2);
        drawable.setBounds(0, 0, imageWidthPx, imageHeightPx);
        spannableString.setSpan(new ImageSpan(drawable, 1), str2.length() - 1, str2.length(), 33);
        return spannableString;
    }
}