package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001JD\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH\u0007J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J \u0010\u0012\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\f\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\bJJ\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH\u0002J\f\u0010\u0016\u001a\u00020\u0013*\u00020\bH\u0002J\u0014\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002R\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/gtf;", "", "Landroid/content/Context;", "context", "appContext", "src", "Landroid/graphics/drawable/Drawable;", b2n.f, "", "resName", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "idMap", "b", "id", "a", "type", "d", "", MapSchema.FIELD_NAME_ENTRY, b2n.g, "f", "c", "DRAWABLE_TYPE", "Ljava/lang/String;", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class gtf {

    @NotNull
    public static final String DRAWABLE_TYPE = "@drawable/";

    @NotNull
    public static final gtf INSTANCE = new gtf();

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @Nullable
    public final Drawable a(@Nullable Context context, int id) {
        if (id == 0) {
            return null;
        }
        if ((context != null ? context.getResources() : null) == null) {
            return null;
        }
        try {
            return ContextCompat.getDrawable(context, id);
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @Nullable
    public final Drawable b(@Nullable Context context, @NotNull String resName, @Nullable HashMap<String, Integer> idMap) {
        Intrinsics.checkNotNullParameter(resName, "resName");
        int iH = h(context, resName, ResourcesUtil.ResourceType.DRAWABLE, idMap);
        if (iH == 0) {
            return null;
        }
        if ((context != null ? context.getResources() : null) == null) {
            return null;
        }
        try {
            return ContextCompat.getDrawable(context, iH);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String c(String str, String str2) {
        int length = str2.length();
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final int d(@Nullable Context context, @NotNull String resName, @NotNull String type) {
        Intrinsics.checkNotNullParameter(resName, "resName");
        Intrinsics.checkNotNullParameter(type, "type");
        if (context == null) {
            return 0;
        }
        if (resName.length() == 0) {
            return 0;
        }
        return context.getResources().getIdentifier(resName, type, context.getPackageName());
    }

    public final boolean e(@Nullable String str) {
        return str != null && StringsKt__StringsJVMKt.startsWith$default(str, NotificationApiService.CONTENT, false, 2, null);
    }

    public final boolean f(String str) {
        return StringsKt__StringsJVMKt.startsWith$default(str, DRAWABLE_TYPE, false, 2, null);
    }

    @Nullable
    public final Drawable g(@NotNull Context context, @Nullable Context appContext, @Nullable Object src) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (src == null) {
            return null;
        }
        if (!(src instanceof String)) {
            if (src instanceof Integer) {
                return a(appContext, ((Number) src).intValue());
            }
            return null;
        }
        String str = (String) src;
        if (!e(str)) {
            if (f(str)) {
                return b(appContext, c(str, DRAWABLE_TYPE), null);
            }
            return null;
        }
        qrk qrkVar = qrk.INSTANCE;
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(src)");
        Bitmap bitmapA = qrkVar.a(context, uri);
        if (bitmapA == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), bitmapA);
    }

    public final int h(Context context, String resName, String type, HashMap<String, Integer> idMap) {
        int iIntValue;
        if (idMap == null || !idMap.containsKey(resName)) {
            iIntValue = 0;
        } else {
            Integer num = idMap.get(resName);
            Intrinsics.checkNotNull(num);
            iIntValue = num.intValue();
        }
        return iIntValue == 0 ? d(context, resName, type) : iIntValue;
    }
}
