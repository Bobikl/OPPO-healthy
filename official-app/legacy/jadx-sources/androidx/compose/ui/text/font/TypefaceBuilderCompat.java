package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 26)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "()V", "createFromAssets", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", "context", "Landroid/content/Context;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "createFromFile", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "createFromFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "toVariationSettings", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPreloadedFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,235:1\n151#2,3:236\n33#2,4:239\n154#2,2:243\n38#2:245\n156#2:246\n37#3,2:247\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n230#1:236,3\n230#1:239,4\n230#1:243,2\n230#1:245\n230#1:246\n232#1:247,2\n*E\n"})
final class TypefaceBuilderCompat {

    @NotNull
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @ExperimentalTextApi
    @RequiresApi(26)
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else {
            if (settings.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i = 0; i < size; i++) {
            FontVariation.Setting setting = settings2.get(i);
            arrayList.add(new FontVariationAxis(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface createFromAssets(@NotNull AssetManager assetManager, @NotNull String path, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(assetManager, path).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface createFromFile(@NotNull File file, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(file).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface createFromFileDescriptor(@NotNull ParcelFileDescriptor fileDescriptor, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(fileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }
}
