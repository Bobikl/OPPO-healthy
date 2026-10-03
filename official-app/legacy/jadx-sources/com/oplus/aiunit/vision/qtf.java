package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0000\u001a\u0012\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a\u001a\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002\u001a\u001a\u0010\r\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000\u001a*\u0010\u0010\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0000\u001a\u0012\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000\u001a\u001a\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u001a\n\u0010\u0019\u001a\u00020\u0000*\u00020\u0000\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0000\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u0000\u001a\n\u0010\u001f\u001a\u00020\u0000*\u00020\u001e\u001a\n\u0010 \u001a\u00020\u0000*\u00020\u001e\u001a\n\u0010!\u001a\u00020\u001e*\u00020\u001e\u001a\n\u0010\"\u001a\u00020\u0000*\u00020\u001e\u001a\u000e\u0010#\u001a\n \u0003*\u0004\u0018\u00010\u00110\u0011\u001a\u0018\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u001a¨\u0006("}, d2 = {"", "", "", "kotlin.jvm.PlatformType", "r", "(I)[Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "format", "o", LogFieldKey.MESSAGE_KEY, "format1", "format2", LogFieldKey.PROCESS_NAME_KEY, "n", "format3", "format4", "q", "Landroid/content/Context;", "context", "num", MapSchema.FIELD_NAME_KEY, "i", "str", "j", b2n.f, "f", "Landroid/graphics/drawable/Drawable;", b2n.g, "Landroid/graphics/Bitmap;", MapSchema.FIELD_NAME_ENTRY, "", "b", "t", "c", "s", "d", "text", ResourcesUtil.ResourceType.DRAWABLE, "Landroid/text/SpannableStringBuilder;", "a", "lib_base_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResourceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUtils.kt\ncom/heytap/health/base/string/ResourceUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class qtf {
    @NotNull
    public static final SpannableStringBuilder a(@NotNull String text, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (drawable == null) {
            return new SpannableStringBuilder(text);
        }
        String str = text + " #";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ImageSpan(drawable), str.length() - 1, str.length(), 33);
        return spannableStringBuilder;
    }

    public static final int b(float f) {
        Context contextD = d();
        if (contextD != null) {
            return ejg.a(contextD, f);
        }
        return 1;
    }

    public static final float c(float f) {
        Context contextD = d();
        if (contextD != null) {
            return TypedValue.applyDimension(1, f, contextD.getResources().getDisplayMetrics());
        }
        return 1.0f;
    }

    public static final Context d() {
        Activity activityP = op.n().p();
        return activityP != null ? activityP : b78.a();
    }

    @Nullable
    public static final Bitmap e(int i) {
        return BitmapFactory.decodeResource(d().getResources(), i);
    }

    public static final int f(int i) {
        Context contextD = d();
        if (contextD != null) {
            return contextD.getColor(i);
        }
        return -16777216;
    }

    public static final int g(int i, @Nullable Context context) {
        Context contextD;
        if (context == null || (contextD = d()) == null) {
            return -16777216;
        }
        return contextD.getColor(i);
    }

    @Nullable
    public static final Drawable h(int i) {
        Context contextD = d();
        if (contextD != null) {
            return contextD.getDrawable(i);
        }
        return null;
    }

    @NotNull
    public static final String i(int i, int i2) {
        Resources resources;
        String quantityString;
        Context contextD = d();
        return (contextD == null || (resources = contextD.getResources()) == null || (quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2))) == null) ? "" : quantityString;
    }

    @NotNull
    public static final String j(int i, int i2, @NotNull String str) {
        Resources resources;
        String quantityString;
        Intrinsics.checkNotNullParameter(str, "str");
        Context contextD = d();
        return (contextD == null || (resources = contextD.getResources()) == null || (quantityString = resources.getQuantityString(i, i2, str)) == null) ? "" : quantityString;
    }

    @NotNull
    public static final String k(int i, @Nullable Context context, int i2) {
        Resources resources;
        String quantityString;
        return (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2))) == null) ? "" : quantityString;
    }

    @NotNull
    public static final String l(int i) {
        String string;
        Context contextD = d();
        return (contextD == null || (string = contextD.getString(i)) == null) ? "" : string;
    }

    @NotNull
    public static final String m(int i, int i2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(l(i), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String n(int i, int i2, int i3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(l(i), Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String o(int i, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(l(i), Arrays.copyOf(new Object[]{format}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String p(int i, @NotNull String format1, @NotNull String format2) {
        Intrinsics.checkNotNullParameter(format1, "format1");
        Intrinsics.checkNotNullParameter(format2, "format2");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(l(i), Arrays.copyOf(new Object[]{format1, format2}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String q(int i, @NotNull String format1, @NotNull String format2, @NotNull String format3, @NotNull String format4) {
        Intrinsics.checkNotNullParameter(format1, "format1");
        Intrinsics.checkNotNullParameter(format2, "format2");
        Intrinsics.checkNotNullParameter(format3, "format3");
        Intrinsics.checkNotNullParameter(format4, "format4");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(l(i), Arrays.copyOf(new Object[]{format1, format2, format3, format4}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String[] r(int i) {
        String[] stringArray = b78.a().getResources().getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getAppContext().resources.getStringArray(this)");
        return stringArray;
    }

    public static final int s(float f) {
        return (int) ((f / d().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int t(float f) {
        Context contextD = d();
        if (contextD != null) {
            return ejg.n(contextD, f);
        }
        return 1;
    }
}
