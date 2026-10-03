package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.base.R$id;
import coil.decode.DataSource;
import coil.intercept.RealInterceptorChain;
import coil.request.Parameters;
import coil.request.Tags;
import coil.request.ViewTargetRequestManager;
import coil.size.Scale;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0000\u001a\u000e\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000\u001a\u000e\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u000bH\u0000\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0012H\u0000\u001a\f\u0010\u0014\u001a\u00020\r*\u00020\u000fH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u000f*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\b\u0010\u001a\u001a\u00020\u0019H\u0000\u001a\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001a\u0014\u0010 \u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0000\u001a\f\u0010#\u001a\u00020\"*\u00020!H\u0000\u001a\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0000\u001a\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020&H\u0000\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.\"\u001a\u00103\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b1\u00102\"\u001a\u00107\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106\"\u0014\u00108\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00109\"\u0014\u0010;\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00109\"\u0014\u0010<\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00109\"\u0014\u0010=\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00109\"\u0018\u0010B\u001a\u00020?*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0018\u0010F\u001a\u00020\u000f*\u00020C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u0018\u0010H\u001a\u00020\u000f*\u00020C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010E\"\u0018\u0010K\u001a\u00020\r*\u00020C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0018\u0010\u0017\u001a\u00020\u0016*\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u001a\u0010Q\u001a\u0004\u0018\u00010\u0004*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0018\u0010U\u001a\u00020\u000f*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0018\u0010Y\u001a\u00020V*\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X\"\u0018\u0010]\u001a\u00020\r*\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\\"\u0018\u0010a\u001a\u00020^*\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Ljava/io/Closeable;", "", "d", "Landroid/webkit/MimeTypeMap;", "", "url", "j", "Lcom/oplus/aiunit/vision/gj8;", "x", "Lcoil/request/d;", "w", "Lcoil/request/b;", "v", "", "r", "", "defaultValue", "z", "Lcoil/disk/a$b;", "a", "s", "Lcoil/size/c;", "Lcoil/size/Scale;", "scale", "A", "", c8l.KEY_B, "Landroid/net/Uri;", ParserTag.TAG_URI, "q", "Lcom/oplus/aiunit/vision/gj8$a;", "line", "b", "Lcom/oplus/aiunit/vision/ytf;", "Lcom/oplus/aiunit/vision/cuf;", "y", "Landroid/content/Context;", "context", "", MapSchema.FIELD_NAME_ENTRY, ParserTag.TAG_PERCENT, "c", "", "Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "o", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Lcom/oplus/aiunit/vision/gj8;", "getEMPTY_HEADERS", "()Lcom/oplus/aiunit/vision/gj8;", "EMPTY_HEADERS", "MIME_TYPE_JPEG", "Ljava/lang/String;", "MIME_TYPE_WEBP", "MIME_TYPE_HEIC", "MIME_TYPE_HEIF", "ASSET_FILE_PATH_ROOT", "Landroid/view/View;", "Lcoil/request/ViewTargetRequestManager;", LogFieldKey.LEVEL_KEY, "(Landroid/view/View;)Lcoil/request/ViewTargetRequestManager;", "requestManager", "Landroid/graphics/drawable/Drawable;", LogFieldKey.PROCESS_NAME_KEY, "(Landroid/graphics/drawable/Drawable;)I", Fields.WIDTH_FIELD, "i", Fields.HEIGHT_FIELD, "u", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "Landroid/widget/ImageView;", "n", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", b2n.g, "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", MapSchema.FIELD_NAME_KEY, "(Landroid/content/res/Configuration;)I", "nightMode", "Ljava/io/File;", LogFieldKey.MESSAGE_KEY, "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "Lcoil/intercept/a$a;", "t", "(Lcoil/intercept/a$a;)Z", "isPlaceholderCached", "Lcoil/a;", b2n.f, "(Lcoil/intercept/a$a;)Lcoil/a;", "eventListener", "coil-base_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-Utils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
public final class j {

    @NotNull
    public static final String ASSET_FILE_PATH_ROOT = "android_asset";

    @NotNull
    public static final String MIME_TYPE_HEIC = "image/heic";

    @NotNull
    public static final String MIME_TYPE_HEIF = "image/heif";

    @NotNull
    public static final String MIME_TYPE_JPEG = "image/jpeg";

    @NotNull
    public static final String MIME_TYPE_WEBP = "image/webp";

    @NotNull
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    @NotNull
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final gj8 f12702c = new gj8.a().g();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final int A(@NotNull coil.size.c cVar, @NotNull Scale scale) {
        if (cVar instanceof coil.size.c.a) {
            return ((coil.size.c.a) cVar).px;
        }
        int i = a.$EnumSwitchMapping$2[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Void B() {
        throw new IllegalStateException("Unsupported".toString());
    }

    public static final void a(@NotNull coil.disk.a.b bVar) {
        try {
            bVar.a();
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final gj8.a b(@NotNull gj8.a aVar, @NotNull String str) {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (!(iIndexOf$default != -1)) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        aVar.f(string, strSubstring2);
        return aVar;
    }

    public static final int c(@NotNull Context context, double d) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d2 = 1024;
        return (int) (d * ((double) largeMemoryClass) * d2 * d2);
    }

    public static final void d(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final double e(@NotNull Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @NotNull
    public static final Bitmap.Config f() {
        return b;
    }

    @NotNull
    public static final coil.a g(@NotNull coil.intercept.a.InterfaceC0135a interfaceC0135a) {
        return interfaceC0135a instanceof RealInterceptorChain ? ((RealInterceptorChain) interfaceC0135a).getEventListener() : coil.a.NONE;
    }

    @Nullable
    public static final String h(@NotNull Uri uri) {
        return (String) CollectionsKt___CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int i(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    @Nullable
    public static final String j(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), mla.SEPARATOR, (String) null, 2, (Object) null), '.', ""));
    }

    public static final int k(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    public static final ViewTargetRequestManager l(@NotNull View view) {
        int i = R$id.coil_request_manager;
        Object tag = view.getTag(i);
        ViewTargetRequestManager viewTargetRequestManager = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i);
                ViewTargetRequestManager viewTargetRequestManager2 = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager2 != null) {
                    viewTargetRequestManager = viewTargetRequestManager2;
                } else {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(i, viewTargetRequestManager);
                }
            }
        }
        return viewTargetRequestManager;
    }

    @NotNull
    public static final File m(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    @NotNull
    public static final Scale n(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : a.$EnumSwitchMapping$1[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
    }

    @NotNull
    public static final Bitmap.Config[] o() {
        return a;
    }

    public static final int p(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean q(@NotNull Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), Const.Scheme.SCHEME_FILE) && Intrinsics.areEqual(h(uri), ASSET_FILE_PATH_ROOT);
    }

    public static final boolean r() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean t(@NotNull coil.intercept.a.InterfaceC0135a interfaceC0135a) {
        return (interfaceC0135a instanceof RealInterceptorChain) && ((RealInterceptorChain) interfaceC0135a).getIsPlaceholderCached();
    }

    public static final boolean u(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    @NotNull
    public static final Parameters v(@Nullable Parameters parameters) {
        return parameters == null ? Parameters.EMPTY : parameters;
    }

    @NotNull
    public static final Tags w(@Nullable Tags tags) {
        return tags == null ? Tags.EMPTY : tags;
    }

    @NotNull
    public static final gj8 x(@Nullable gj8 gj8Var) {
        return gj8Var == null ? f12702c : gj8Var;
    }

    @NotNull
    public static final cuf y(@NotNull ytf ytfVar) {
        cuf body = ytfVar.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public static final int z(@NotNull String str, int i) {
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str);
        if (longOrNull == null) {
            return i;
        }
        long jLongValue = longOrNull.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }
}
