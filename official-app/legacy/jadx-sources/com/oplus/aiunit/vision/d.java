package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import io.protostuff.MapSchema;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00052\b\b\u0001\u0010\u0002\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0018\u00010\u0006R\u00020\u0005H\u0000\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u0000H\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "", "resId", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", "b", "resources", "d", "Landroidx/lifecycle/Lifecycle;", "c", "", PermissionDetailAct.PERMISSION, "", MapSchema.FIELD_NAME_ENTRY, "coil-base_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-Contexts")
@SourceDebugExtension({"SMAP\nContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,83:1\n1#2:84\n31#3:85\n*S KotlinDebug\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n*L\n78#1:85\n*E\n"})
public final class d {
    @NotNull
    public static final Drawable a(@NotNull Context context, @DrawableRes int i) {
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    @NotNull
    public static final Drawable b(@NotNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    @Nullable
    public static final Lifecycle c(@Nullable Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    @NotNull
    public static final Drawable d(@NotNull Context context, @NotNull Resources resources, @XmlRes @DrawableRes int i) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(@NotNull Context context, @NotNull String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
