package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.Px;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import coil.decode.Decoder;
import coil.fetch.f;
import coil.memory.MemoryCache;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import coil.size.ViewSizeResolver;
import coil.target.ImageViewTarget;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.coj;
import com.oplus.aiunit.vision.d1l;
import com.oplus.aiunit.vision.f3j;
import com.oplus.aiunit.vision.gj8;
import com.oplus.aiunit.vision.h;
import com.oplus.aiunit.vision.izc;
import com.oplus.aiunit.vision.j;
import com.oplus.aiunit.vision.l55;
import com.oplus.aiunit.vision.m7h;
import com.oplus.aiunit.vision.n7h;
import com.oplus.aiunit.vision.nak;
import com.oplus.aiunit.vision.ne4;
import com.oplus.aiunit.vision.qp6;
import com.oplus.aiunit.vision.y75;
import com.oplus.aiunit.vision.y9k;
import com.oplus.aiunit.vision.z0l;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB\u008e\u0003\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010%\u001a\u0004\u0018\u00010 \u0012\b\u0010+\u001a\u0004\u0018\u00010&\u0012\u0006\u00101\u001a\u00020,\u0012\b\u00107\u001a\u0004\u0018\u000102\u0012\u0006\u0010=\u001a\u000208\u0012\u001c\u0010D\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\b\u0012\u0006\u0012\u0002\b\u00030@\u0018\u00010>\u0012\b\u0010I\u001a\u0004\u0018\u00010E\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020K0J\u0012\u0006\u0010T\u001a\u00020P\u0012\u0006\u0010Z\u001a\u00020U\u0012\u0006\u0010_\u001a\u00020[\u0012\u0006\u0010c\u001a\u00020\u0007\u0012\u0006\u0010e\u001a\u00020\u0007\u0012\u0006\u0010f\u001a\u00020\u0007\u0012\u0006\u0010i\u001a\u00020\u0007\u0012\u0006\u0010o\u001a\u00020j\u0012\u0006\u0010q\u001a\u00020j\u0012\u0006\u0010t\u001a\u00020j\u0012\u0006\u0010y\u001a\u00020u\u0012\u0006\u0010z\u001a\u00020u\u0012\u0006\u0010{\u001a\u00020u\u0012\u0006\u0010~\u001a\u00020u\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u007f\u0012\b\u0010\u0087\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u008c\u0001\u001a\u00030\u0088\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u008d\u0001\u0012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010 \u0012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\b\u0010¡\u0001\u001a\u00030\u009e\u0001\u0012\b\u0010¥\u0001\u001a\u00030¢\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010%\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010+\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u00107\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R-\u0010D\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\b\u0012\u0006\u0012\u0002\b\u00030@\u0018\u00010>8\u0006¢\u0006\f\n\u0004\b/\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010I\u001a\u0004\u0018\u00010E8\u0006¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020K0J8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010T\u001a\u00020P8\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010Z\u001a\u00020U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010_\u001a\u00020[8\u0006¢\u0006\f\n\u0004\bG\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b-\u0010bR\u0017\u0010e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\b3\u0010bR\u0017\u0010f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010a\u001a\u0004\b9\u0010bR\u0017\u0010i\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bg\u0010a\u001a\u0004\bh\u0010bR\u0017\u0010o\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010q\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bp\u0010l\u001a\u0004\bg\u0010nR\u0017\u0010t\u001a\u00020j8\u0006¢\u0006\f\n\u0004\br\u0010l\u001a\u0004\bs\u0010nR\u0017\u0010y\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bB\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010z\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bX\u0010v\u001a\u0004\br\u0010xR\u0017\u0010{\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bw\u0010v\u001a\u0004\bV\u0010xR\u0017\u0010~\u001a\u00020u8\u0006¢\u0006\f\n\u0004\b|\u0010v\u001a\u0004\b}\u0010xR\u001a\u0010\u0082\u0001\u001a\u00020\u007f8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0080\u0001\u001a\u0005\b|\u0010\u0081\u0001R\u001c\u0010\u0087\u0001\u001a\u00030\u0083\u00018\u0006¢\u0006\u000f\n\u0005\b#\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0006¢\u0006\u000f\n\u0005\bm\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0091\u0001\u001a\u00030\u008d\u00018\u0006¢\u0006\u000f\n\u0005\bs\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0093\u0001\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\"\u001a\u0005\b\u0092\u0001\u0010$R\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0095\u0001R\u0019\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bh\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0095\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0098\u0001R\u001b\u0010¡\u0001\u001a\u00030\u009e\u00018\u0006¢\u0006\u000e\n\u0005\b]\u0010\u009f\u0001\u001a\u0005\bd\u0010 \u0001R\u001b\u0010¥\u0001\u001a\u00030¢\u00018\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010£\u0001\u001a\u0005\b`\u0010¤\u0001R\u0017\u0010§\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010¦\u0001R\u0016\u0010¨\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\u0007\u001a\u0005\bk\u0010¦\u0001R\u0016\u0010©\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\u0007\u001a\u0005\bp\u0010¦\u0001¨\u0006¬\u0001"}, d2 = {"Lcoil/request/a;", "", "Landroid/content/Context;", "context", "Lcoil/request/a$a;", "Q", "other", "", "equals", "", "hashCode", "a", "Landroid/content/Context;", LogFieldKey.LEVEL_KEY, "()Landroid/content/Context;", "b", "Ljava/lang/Object;", LogFieldKey.MESSAGE_KEY, "()Ljava/lang/Object;", "data", "Lcom/oplus/aiunit/vision/coj;", "c", "Lcom/oplus/aiunit/vision/coj;", "M", "()Lcom/oplus/aiunit/vision/coj;", "target", "Lcoil/request/a$b;", "d", "Lcoil/request/a$b;", "A", "()Lcoil/request/a$b;", "listener", "Lcoil/memory/MemoryCache$Key;", MapSchema.FIELD_NAME_ENTRY, "Lcoil/memory/MemoryCache$Key;", c8l.KEY_B, "()Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "f", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", b2n.f, "Landroid/graphics/Bitmap$Config;", "j", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", b2n.g, "Landroid/graphics/ColorSpace;", MapSchema.FIELD_NAME_KEY, "()Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Precision;", "i", "Lcoil/size/Precision;", "H", "()Lcoil/size/Precision;", "precision", "Lkotlin/Pair;", "Lcoil/fetch/f$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "w", "()Lkotlin/Pair;", "fetcherFactory", "Lcoil/decode/Decoder$a;", "Lcoil/decode/Decoder$a;", "o", "()Lcoil/decode/Decoder$a;", "decoderFactory", "", "Lcom/oplus/aiunit/vision/y9k;", "Ljava/util/List;", "O", "()Ljava/util/List;", "transformations", "Lcom/oplus/aiunit/vision/nak$a;", "Lcom/oplus/aiunit/vision/nak$a;", SecureGcmConstants.MESSAGE_KEY, "()Lcom/oplus/aiunit/vision/nak$a;", "transitionFactory", "Lcom/oplus/aiunit/vision/gj8;", "n", "Lcom/oplus/aiunit/vision/gj8;", "x", "()Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcoil/request/d;", "Lcoil/request/d;", "L", "()Lcoil/request/d;", UTraceSQLiteHelperKt.COL_TAGS, LogFieldKey.PROCESS_NAME_KEY, "Z", "()Z", "allowConversionToBitmap", "q", "allowHardware", "allowRgb565", "s", "I", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "t", "Lcoil/request/CachePolicy;", "C", "()Lcoil/request/CachePolicy;", "memoryCachePolicy", "u", "diskCachePolicy", "v", "D", "networkCachePolicy", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "y", "()Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "z", "N", "transformationDispatcher", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/oplus/aiunit/vision/m7h;", "Lcom/oplus/aiunit/vision/m7h;", "K", "()Lcom/oplus/aiunit/vision/m7h;", "sizeResolver", "Lcoil/size/Scale;", "Lcoil/size/Scale;", "J", "()Lcoil/size/Scale;", "scale", "Lcoil/request/b;", "Lcoil/request/b;", ExifInterface.LONGITUDE_EAST, "()Lcoil/request/b;", "parameters", "G", "placeholderMemoryCacheKey", UserInfo.SEX_FEMALE, "Ljava/lang/Integer;", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "Lcom/oplus/aiunit/vision/y75;", "Lcom/oplus/aiunit/vision/y75;", "()Lcom/oplus/aiunit/vision/y75;", "defined", "Lcom/oplus/aiunit/vision/l55;", "Lcom/oplus/aiunit/vision/l55;", "()Lcom/oplus/aiunit/vision/l55;", "defaults", "()Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lcom/oplus/aiunit/vision/coj;Lcoil/request/a$b;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;Lcoil/decode/Decoder$a;Ljava/util/List;Lcom/oplus/aiunit/vision/nak$a;Lcom/oplus/aiunit/vision/gj8;Lcoil/request/d;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/Lifecycle;Lcom/oplus/aiunit/vision/m7h;Lcoil/size/Scale;Lcoil/request/b;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcom/oplus/aiunit/vision/y75;Lcom/oplus/aiunit/vision/l55;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final m7h sizeResolver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Scale scale;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Parameters parameters;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final MemoryCache.Key placeholderMemoryCacheKey;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final Integer placeholderResId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public final Drawable placeholderDrawable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final Integer errorResId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final Drawable errorDrawable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final Integer fallbackResId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public final Drawable fallbackDrawable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final y75 defined;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final l55 defaults;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final coj target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final b listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final MemoryCache.Key memoryCacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final ColorSpace colorSpace;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Precision precision;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<f.a<?>, Class<?>> fetcherFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final Decoder.a decoderFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<y9k> transformations;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final nak.a transitionFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gj8 headers;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Tags tags;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final boolean allowConversionToBitmap;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final boolean allowHardware;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final boolean allowRgb565;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final boolean premultipliedAlpha;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final CachePolicy networkCachePolicy;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher interceptorDispatcher;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher fetcherDispatcher;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher decoderDispatcher;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher transformationDispatcher;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcoil/request/a$b;", "", "Lcoil/request/a;", "request", "", "c", "a", "Lcom/oplus/aiunit/vision/qp6;", "result", "d", "Lcom/oplus/aiunit/vision/f3j;", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public interface b {
        @MainThread
        default void a(@NotNull a request) {
        }

        @MainThread
        default void b(@NotNull a request, @NotNull f3j result) {
        }

        @MainThread
        default void c(@NotNull a request) {
        }

        @MainThread
        default void d(@NotNull a request, @NotNull qp6 result) {
        }
    }

    public /* synthetic */ a(Context context, Object obj, coj cojVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.a aVar, List list, nak.a aVar2, gj8 gj8Var, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, m7h m7hVar, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, y75 y75Var, l55 l55Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cojVar, bVar, key, str, config, colorSpace, precision, pair, aVar, list, aVar2, gj8Var, tags, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, m7hVar, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, y75Var, l55Var);
    }

    public static /* synthetic */ C0136a R(a aVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = aVar.context;
        }
        return aVar.Q(context);
    }

    @Nullable
    /* JADX INFO: renamed from: A, reason: from getter */
    public final b getListener() {
        return this.listener;
    }

    @Nullable
    /* JADX INFO: renamed from: B, reason: from getter */
    public final MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: D, reason: from getter */
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: E, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Drawable F() {
        return h.c(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: from getter */
    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final Precision getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: from getter */
    public final m7h getSizeResolver() {
        return this.sizeResolver;
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: M, reason: from getter */
    public final coj getTarget() {
        return this.target;
    }

    @NotNull
    /* JADX INFO: renamed from: N, reason: from getter */
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @NotNull
    public final List<y9k> O() {
        return this.transformations;
    }

    @NotNull
    /* JADX INFO: renamed from: P, reason: from getter */
    public final nak.a getTransitionFactory() {
        return this.transitionFactory;
    }

    @JvmOverloads
    @NotNull
    public final C0136a Q(@NotNull Context context) {
        return new C0136a(this, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof a) {
            a aVar = (a) other;
            if (Intrinsics.areEqual(this.context, aVar.context) && Intrinsics.areEqual(this.data, aVar.data) && Intrinsics.areEqual(this.target, aVar.target) && Intrinsics.areEqual(this.listener, aVar.listener) && Intrinsics.areEqual(this.memoryCacheKey, aVar.memoryCacheKey) && Intrinsics.areEqual(this.diskCacheKey, aVar.diskCacheKey) && this.bitmapConfig == aVar.bitmapConfig && Intrinsics.areEqual(this.colorSpace, aVar.colorSpace) && this.precision == aVar.precision && Intrinsics.areEqual(this.fetcherFactory, aVar.fetcherFactory) && Intrinsics.areEqual(this.decoderFactory, aVar.decoderFactory) && Intrinsics.areEqual(this.transformations, aVar.transformations) && Intrinsics.areEqual(this.transitionFactory, aVar.transitionFactory) && Intrinsics.areEqual(this.headers, aVar.headers) && Intrinsics.areEqual(this.tags, aVar.tags) && this.allowConversionToBitmap == aVar.allowConversionToBitmap && this.allowHardware == aVar.allowHardware && this.allowRgb565 == aVar.allowRgb565 && this.premultipliedAlpha == aVar.premultipliedAlpha && this.memoryCachePolicy == aVar.memoryCachePolicy && this.diskCachePolicy == aVar.diskCachePolicy && this.networkCachePolicy == aVar.networkCachePolicy && Intrinsics.areEqual(this.interceptorDispatcher, aVar.interceptorDispatcher) && Intrinsics.areEqual(this.fetcherDispatcher, aVar.fetcherDispatcher) && Intrinsics.areEqual(this.decoderDispatcher, aVar.decoderDispatcher) && Intrinsics.areEqual(this.transformationDispatcher, aVar.transformationDispatcher) && Intrinsics.areEqual(this.placeholderMemoryCacheKey, aVar.placeholderMemoryCacheKey) && Intrinsics.areEqual(this.placeholderResId, aVar.placeholderResId) && Intrinsics.areEqual(this.placeholderDrawable, aVar.placeholderDrawable) && Intrinsics.areEqual(this.errorResId, aVar.errorResId) && Intrinsics.areEqual(this.errorDrawable, aVar.errorDrawable) && Intrinsics.areEqual(this.fallbackResId, aVar.fallbackResId) && Intrinsics.areEqual(this.fallbackDrawable, aVar.fallbackDrawable) && Intrinsics.areEqual(this.lifecycle, aVar.lifecycle) && Intrinsics.areEqual(this.sizeResolver, aVar.sizeResolver) && this.scale == aVar.scale && Intrinsics.areEqual(this.parameters, aVar.parameters) && Intrinsics.areEqual(this.defined, aVar.defined) && Intrinsics.areEqual(this.defaults, aVar.defaults)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        coj cojVar = this.target;
        int iHashCode2 = (iHashCode + (cojVar != null ? cojVar.hashCode() : 0)) * 31;
        b bVar = this.listener;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<f.a<?>, Class<?>> pair = this.fetcherFactory;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        Decoder.a aVar = this.decoderFactory;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.allowConversionToBitmap)) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        MemoryCache.Key key2 = this.placeholderMemoryCacheKey;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.placeholderResId;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.errorResId;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.fallbackResId;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallbackDrawable;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Decoder.a getDecoderFactory() {
        return this.decoderFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final l55 getDefaults() {
        return this.defaults;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final y75 getDefined() {
        return this.defined;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @Nullable
    public final Drawable t() {
        return h.c(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    @Nullable
    public final Drawable u() {
        return h.c(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @Nullable
    public final Pair<f.a<?>, Class<?>> w() {
        return this.fetcherFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final gj8 getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, Object obj, coj cojVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends f.a<?>, ? extends Class<?>> pair, Decoder.a aVar, List<? extends y9k> list, nak.a aVar2, gj8 gj8Var, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, m7h m7hVar, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, y75 y75Var, l55 l55Var) {
        this.context = context;
        this.data = obj;
        this.target = cojVar;
        this.listener = bVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = precision;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar;
        this.transformations = list;
        this.transitionFactory = aVar2;
        this.headers = gj8Var;
        this.tags = tags;
        this.allowConversionToBitmap = z;
        this.allowHardware = z2;
        this.allowRgb565 = z3;
        this.premultipliedAlpha = z4;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.lifecycle = lifecycle;
        this.sizeResolver = m7hVar;
        this.scale = scale;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = y75Var;
        this.defaults = l55Var;
    }

    /* JADX INFO: renamed from: coil.request.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\u0006\u00108\u001a\u000206¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001B\u001e\b\u0017\u0012\u0007\u0010\u009b\u0001\u001a\u000204\u0012\b\b\u0002\u00108\u001a\u000206¢\u0006\u0006\b\u0099\u0001\u0010\u009c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u0010J\u0010\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#J\u0010\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0010J\u000e\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.J\u000e\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201J\u0006\u00105\u001a\u000204R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00109R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010:R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010KR,\u0010Q\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030N\u0012\b\u0012\u0006\u0012\u0002\b\u00030O\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010[R(\u0010_\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030O\u0012\u0004\u0012\u00020\u0001\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010^R\u0016\u0010a\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0016\u0010e\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010`R\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010gR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010nR\u0018\u0010u\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010nR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010@R\u0018\u0010~\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010}R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0080\u0001R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010}R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0080\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008e\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0091\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcoil/request/a$a;", "", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/Lifecycle;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/m7h;", "o", "Lcoil/size/Scale;", "n", "data", MapSchema.FIELD_NAME_ENTRY, "Landroid/graphics/Bitmap$Config;", "config", "a", "", "size", LogFieldKey.PROCESS_NAME_KEY, Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "q", "Lcoil/size/e;", "r", "resolver", "s", "Lcoil/decode/Decoder$a;", "factory", "f", "drawableResId", "j", b2n.g, "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "i", "Landroid/widget/ImageView;", "imageView", "t", "Lcom/oplus/aiunit/vision/coj;", "target", "u", "", "enable", "d", "durationMillis", "c", "Lcom/oplus/aiunit/vision/nak$a;", "transition", "v", "Lcom/oplus/aiunit/vision/l55;", "defaults", b2n.f, "Lcoil/request/a;", "b", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/l55;", "Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/coj;", "Lcoil/request/a$b;", "Lcoil/request/a$b;", "listener", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Precision;", "Lcoil/size/Precision;", "precision", "Lkotlin/Pair;", "Lcoil/fetch/f$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "fetcherFactory", "Lcoil/decode/Decoder$a;", "decoderFactory", "", "Lcom/oplus/aiunit/vision/y9k;", "Ljava/util/List;", "transformations", "Lcom/oplus/aiunit/vision/nak$a;", "transitionFactory", "Lcom/oplus/aiunit/vision/gj8$a;", "Lcom/oplus/aiunit/vision/gj8$a;", "headers", "", "Ljava/util/Map;", UTraceSQLiteHelperKt.COL_TAGS, "Z", "allowConversionToBitmap", "Ljava/lang/Boolean;", "allowHardware", "allowRgb565", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "w", "networkCachePolicy", "Lkotlinx/coroutines/CoroutineDispatcher;", "x", "Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "y", "fetcherDispatcher", "z", "decoderDispatcher", "A", "transformationDispatcher", "Lcoil/request/b$a;", c8l.KEY_B, "Lcoil/request/b$a;", "parameters", "C", "placeholderMemoryCacheKey", "D", "Ljava/lang/Integer;", "placeholderResId", ExifInterface.LONGITUDE_EAST, "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", UserInfo.SEX_FEMALE, "errorResId", "G", "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", "J", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "K", "Lcom/oplus/aiunit/vision/m7h;", "sizeResolver", "L", "Lcoil/size/Scale;", "scale", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", "O", "resolvedScale", "<init>", "(Landroid/content/Context;)V", "request", "(Lcoil/request/a;Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    public static final class C0136a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @Nullable
        public CoroutineDispatcher transformationDispatcher;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public Parameters.a parameters;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public MemoryCache.Key placeholderMemoryCacheKey;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @DrawableRes
        @Nullable
        public Integer placeholderResId;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public Drawable placeholderDrawable;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @DrawableRes
        @Nullable
        public Integer errorResId;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @Nullable
        public Drawable errorDrawable;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @DrawableRes
        @Nullable
        public Integer fallbackResId;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public Drawable fallbackDrawable;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @Nullable
        public Lifecycle lifecycle;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @Nullable
        public m7h sizeResolver;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @Nullable
        public Scale scale;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @Nullable
        public Lifecycle resolvedLifecycle;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @Nullable
        public m7h resolvedSizeResolver;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        @Nullable
        public Scale resolvedScale;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public l55 defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object data;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public coj target;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b listener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public MemoryCache.Key memoryCacheKey;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String diskCacheKey;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public ColorSpace colorSpace;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Precision precision;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public Pair<? extends f.a<?>, ? extends Class<?>> fetcherFactory;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Decoder.a decoderFactory;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public List<? extends y9k> transformations;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public nak.a transitionFactory;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public gj8.a headers;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public Map<Class<?>, Object> tags;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public boolean allowConversionToBitmap;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public Boolean allowHardware;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public Boolean allowRgb565;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public boolean premultipliedAlpha;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public CachePolicy memoryCachePolicy;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public CachePolicy diskCachePolicy;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public CachePolicy networkCachePolicy;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public CoroutineDispatcher interceptorDispatcher;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public CoroutineDispatcher fetcherDispatcher;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @Nullable
        public CoroutineDispatcher decoderDispatcher;

        public C0136a(@NotNull Context context) {
            this.context = context;
            this.defaults = h.b();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            this.colorSpace = null;
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = CollectionsKt__CollectionsKt.emptyList();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        @NotNull
        public final C0136a a(@NotNull Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        @NotNull
        public final a b() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = izc.INSTANCE;
            }
            Object obj2 = obj;
            coj cojVar = this.target;
            b bVar = this.listener;
            MemoryCache.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config configE = this.bitmapConfig;
            if (configE == null) {
                configE = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config = configE;
            ColorSpace colorSpace = this.colorSpace;
            Precision precisionO = this.precision;
            if (precisionO == null) {
                precisionO = this.defaults.getPrecision();
            }
            Precision precision = precisionO;
            Pair<? extends f.a<?>, ? extends Class<?>> pair = this.fetcherFactory;
            Decoder.a aVar = this.decoderFactory;
            List<? extends y9k> list = this.transformations;
            nak.a aVarQ = this.transitionFactory;
            if (aVarQ == null) {
                aVarQ = this.defaults.getTransitionFactory();
            }
            nak.a aVar2 = aVarQ;
            gj8.a aVar3 = this.headers;
            gj8 gj8VarX = j.x(aVar3 != null ? aVar3.g() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags tagsW = j.w(map != null ? Tags.INSTANCE.a(map) : null);
            boolean z = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z2 = this.premultipliedAlpha;
            CachePolicy cachePolicyL = this.memoryCachePolicy;
            if (cachePolicyL == null) {
                cachePolicyL = this.defaults.getMemoryCachePolicy();
            }
            CachePolicy cachePolicy = cachePolicyL;
            CachePolicy cachePolicyG = this.diskCachePolicy;
            if (cachePolicyG == null) {
                cachePolicyG = this.defaults.getDiskCachePolicy();
            }
            CachePolicy cachePolicy2 = cachePolicyG;
            CachePolicy cachePolicyM = this.networkCachePolicy;
            if (cachePolicyM == null) {
                cachePolicyM = this.defaults.getNetworkCachePolicy();
            }
            CachePolicy cachePolicy3 = cachePolicyM;
            CoroutineDispatcher coroutineDispatcherK = this.interceptorDispatcher;
            if (coroutineDispatcherK == null) {
                coroutineDispatcherK = this.defaults.getInterceptorDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher = coroutineDispatcherK;
            CoroutineDispatcher coroutineDispatcherJ = this.fetcherDispatcher;
            if (coroutineDispatcherJ == null) {
                coroutineDispatcherJ = this.defaults.getFetcherDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcherJ;
            CoroutineDispatcher coroutineDispatcherF = this.decoderDispatcher;
            if (coroutineDispatcherF == null) {
                coroutineDispatcherF = this.defaults.getDecoderDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcherF;
            CoroutineDispatcher coroutineDispatcherP = this.transformationDispatcher;
            if (coroutineDispatcherP == null) {
                coroutineDispatcherP = this.defaults.getTransformationDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcherP;
            Lifecycle lifecycleM = this.lifecycle;
            if (lifecycleM == null && (lifecycleM = this.resolvedLifecycle) == null) {
                lifecycleM = m();
            }
            Lifecycle lifecycle = lifecycleM;
            m7h m7hVarO = this.sizeResolver;
            if (m7hVarO == null && (m7hVarO = this.resolvedSizeResolver) == null) {
                m7hVarO = o();
            }
            m7h m7hVar = m7hVarO;
            Scale scaleN = this.scale;
            if (scaleN == null && (scaleN = this.resolvedScale) == null) {
                scaleN = n();
            }
            Scale scale = scaleN;
            Parameters.a aVar4 = this.parameters;
            return new a(context, obj2, cojVar, bVar, key, str, config, colorSpace, precision, pair, aVar, list, aVar2, gj8VarX, tagsW, z, zBooleanValue, zBooleanValue2, z2, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, m7hVar, scale, j.v(aVar4 != null ? aVar4.a() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new y75(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        @NotNull
        public final C0136a c(int durationMillis) {
            nak.a aVar;
            if (durationMillis > 0) {
                aVar = new ne4.a(durationMillis, false, 2, null);
            } else {
                aVar = nak.a.NONE;
            }
            v(aVar);
            return this;
        }

        @NotNull
        public final C0136a d(boolean enable) {
            return c(enable ? 100 : 0);
        }

        @NotNull
        public final C0136a e(@Nullable Object data) {
            this.data = data;
            return this;
        }

        @NotNull
        public final C0136a f(@NotNull Decoder.a factory) {
            this.decoderFactory = factory;
            return this;
        }

        @NotNull
        public final C0136a g(@NotNull l55 defaults) {
            this.defaults = defaults;
            k();
            return this;
        }

        @NotNull
        public final C0136a h(@DrawableRes int drawableResId) {
            this.errorResId = Integer.valueOf(drawableResId);
            this.errorDrawable = null;
            return this;
        }

        @NotNull
        public final C0136a i(@Nullable Drawable drawable) {
            this.errorDrawable = drawable;
            this.errorResId = 0;
            return this;
        }

        @NotNull
        public final C0136a j(@DrawableRes int drawableResId) {
            this.placeholderResId = Integer.valueOf(drawableResId);
            this.placeholderDrawable = null;
            return this;
        }

        public final void k() {
            this.resolvedScale = null;
        }

        public final void l() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public final Lifecycle m() {
            coj cojVar = this.target;
            Lifecycle lifecycleC = com.oplus.aiunit.vision.d.c(cojVar instanceof d1l ? ((d1l) cojVar).getView().getContext() : this.context);
            return lifecycleC == null ? GlobalLifecycle.INSTANCE : lifecycleC;
        }

        public final Scale n() {
            View view;
            m7h m7hVar = this.sizeResolver;
            View view2 = null;
            ViewSizeResolver viewSizeResolver = m7hVar instanceof ViewSizeResolver ? (ViewSizeResolver) m7hVar : null;
            if (viewSizeResolver == null || (view = viewSizeResolver.getView()) == null) {
                coj cojVar = this.target;
                d1l d1lVar = cojVar instanceof d1l ? (d1l) cojVar : null;
                if (d1lVar != null) {
                    view2 = d1lVar.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? j.n((ImageView) view2) : Scale.FIT;
        }

        public final m7h o() {
            coj cojVar = this.target;
            if (!(cojVar instanceof d1l)) {
                return new coil.size.d(this.context);
            }
            View view = ((d1l) cojVar).getView();
            if (view instanceof ImageView) {
                ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                    return n7h.a(Size.ORIGINAL);
                }
            }
            return z0l.b(view, false, 2, null);
        }

        @NotNull
        public final C0136a p(@Px int size) {
            return q(size, size);
        }

        @NotNull
        public final C0136a q(@Px int width, @Px int height) {
            return r(coil.size.b.a(width, height));
        }

        @NotNull
        public final C0136a r(@NotNull Size size) {
            return s(n7h.a(size));
        }

        @NotNull
        public final C0136a s(@NotNull m7h resolver) {
            this.sizeResolver = resolver;
            l();
            return this;
        }

        @NotNull
        public final C0136a t(@NotNull ImageView imageView) {
            return u(new ImageViewTarget(imageView));
        }

        @NotNull
        public final C0136a u(@Nullable coj target) {
            this.target = target;
            l();
            return this;
        }

        @NotNull
        public final C0136a v(@NotNull nak.a transition) {
            this.transitionFactory = transition;
            return this;
        }

        @JvmOverloads
        public C0136a(@NotNull a aVar, @NotNull Context context) {
            this.context = context;
            this.defaults = aVar.getDefaults();
            this.data = aVar.getData();
            this.target = aVar.getTarget();
            this.listener = aVar.getListener();
            this.memoryCacheKey = aVar.getMemoryCacheKey();
            this.diskCacheKey = aVar.getDiskCacheKey();
            this.bitmapConfig = aVar.getDefined().getBitmapConfig();
            this.colorSpace = aVar.getColorSpace();
            this.precision = aVar.getDefined().getPrecision();
            this.fetcherFactory = aVar.w();
            this.decoderFactory = aVar.getDecoderFactory();
            this.transformations = aVar.O();
            this.transitionFactory = aVar.getDefined().getTransitionFactory();
            this.headers = aVar.getHeaders().d();
            this.tags = MapsKt__MapsKt.toMutableMap(aVar.getTags().a());
            this.allowConversionToBitmap = aVar.getAllowConversionToBitmap();
            this.allowHardware = aVar.getDefined().getAllowHardware();
            this.allowRgb565 = aVar.getDefined().getAllowRgb565();
            this.premultipliedAlpha = aVar.getPremultipliedAlpha();
            this.memoryCachePolicy = aVar.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = aVar.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = aVar.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = aVar.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = aVar.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = aVar.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = aVar.getDefined().getTransformationDispatcher();
            this.parameters = aVar.getParameters().c();
            this.placeholderMemoryCacheKey = aVar.getPlaceholderMemoryCacheKey();
            this.placeholderResId = aVar.placeholderResId;
            this.placeholderDrawable = aVar.placeholderDrawable;
            this.errorResId = aVar.errorResId;
            this.errorDrawable = aVar.errorDrawable;
            this.fallbackResId = aVar.fallbackResId;
            this.fallbackDrawable = aVar.fallbackDrawable;
            this.lifecycle = aVar.getDefined().getLifecycle();
            this.sizeResolver = aVar.getDefined().getSizeResolver();
            this.scale = aVar.getDefined().getScale();
            if (aVar.getContext() == context) {
                this.resolvedLifecycle = aVar.getLifecycle();
                this.resolvedSizeResolver = aVar.getSizeResolver();
                this.resolvedScale = aVar.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }
    }
}
