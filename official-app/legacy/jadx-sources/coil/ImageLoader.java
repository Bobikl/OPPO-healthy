package coil;

import android.content.Context;
import coil.memory.MemoryCache;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.d4a;
import com.oplus.aiunit.vision.dv5;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.h;
import com.oplus.aiunit.vision.i7h;
import com.oplus.aiunit.vision.j;
import com.oplus.aiunit.vision.l55;
import com.oplus.aiunit.vision.m4a;
import com.oplus.aiunit.vision.wr2;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.KotlinNothingValueException;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcoil/ImageLoader;", "", "Lcoil/request/a;", "request", "Lcom/oplus/aiunit/vision/dv5;", "a", "Lcom/oplus/aiunit/vision/m4a;", "b", "(Lcoil/request/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/ComponentRegistry;", "getComponents", "()Lcoil/ComponentRegistry;", "components", "Lcoil/memory/MemoryCache;", "c", "()Lcoil/memory/MemoryCache;", "memoryCache", "Builder", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface ImageLoader {

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R \u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcoil/ImageLoader$Builder;", "", "", "enable", "b", "Lcoil/ImageLoader;", "c", "Lcoil/ComponentRegistry;", "registry", "d", "Landroid/content/Context;", "a", "Landroid/content/Context;", "applicationContext", "Lcom/oplus/aiunit/vision/l55;", "Lcom/oplus/aiunit/vision/l55;", "defaults", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "Lkotlin/Lazy;", "memoryCache", "Lcoil/disk/a;", "diskCache", "Lcom/oplus/aiunit/vision/wr2$a;", MapSchema.FIELD_NAME_ENTRY, "callFactory", "Lcoil/a$c;", "f", "Lcoil/a$c;", "eventListenerFactory", b2n.f, "Lcoil/ComponentRegistry;", "componentRegistry", "Lcom/oplus/aiunit/vision/d4a;", b2n.g, "Lcom/oplus/aiunit/vision/d4a;", "options", "context", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context applicationContext;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public l55 defaults = h.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Lazy<? extends MemoryCache> memoryCache = null;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public Lazy<? extends coil.disk.a> diskCache = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Lazy<? extends wr2.a> callFactory = null;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public a.c eventListenerFactory = null;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public ComponentRegistry componentRegistry = null;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public d4a options = new d4a(false, false, false, 0, null, 31, null);

        public Builder(@NotNull Context context) {
            this.applicationContext = context.getApplicationContext();
        }

        @NotNull
        public final Builder b(boolean enable) {
            l55 l55Var = this.defaults;
            this.defaults = l55Var.a((32511 & 1) != 0 ? l55Var.interceptorDispatcher : null, (32511 & 2) != 0 ? l55Var.fetcherDispatcher : null, (32511 & 4) != 0 ? l55Var.decoderDispatcher : null, (32511 & 8) != 0 ? l55Var.transformationDispatcher : null, (32511 & 16) != 0 ? l55Var.transitionFactory : null, (32511 & 32) != 0 ? l55Var.precision : null, (32511 & 64) != 0 ? l55Var.bitmapConfig : null, (32511 & 128) != 0 ? l55Var.allowHardware : false, (32511 & 256) != 0 ? l55Var.allowRgb565 : enable, (32511 & 512) != 0 ? l55Var.placeholder : null, (32511 & 1024) != 0 ? l55Var.error : null, (32511 & 2048) != 0 ? l55Var.fallback : null, (32511 & 4096) != 0 ? l55Var.memoryCachePolicy : null, (32511 & 8192) != 0 ? l55Var.diskCachePolicy : null, (32511 & 16384) != 0 ? l55Var.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final ImageLoader c() {
            Context context = this.applicationContext;
            l55 l55Var = this.defaults;
            Lazy<? extends MemoryCache> lazy = this.memoryCache;
            if (lazy == null) {
                lazy = LazyKt__LazyJVMKt.lazy(new Function0<MemoryCache>() { // from class: coil.ImageLoader$Builder$build$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final MemoryCache invoke() {
                        return new MemoryCache.a(this.this$0.applicationContext).a();
                    }
                });
            }
            Lazy<? extends MemoryCache> lazy2 = lazy;
            Lazy<? extends coil.disk.a> lazy3 = this.diskCache;
            if (lazy3 == null) {
                lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<coil.disk.a>() { // from class: coil.ImageLoader$Builder$build$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final coil.disk.a invoke() {
                        return i7h.INSTANCE.a(this.this$0.applicationContext);
                    }
                });
            }
            Lazy<? extends coil.disk.a> lazy4 = lazy3;
            Lazy<? extends wr2.a> lazy5 = this.callFactory;
            if (lazy5 == null) {
                lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<efd>() { // from class: coil.ImageLoader$Builder$build$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final efd invoke() {
                        return new efd();
                    }
                });
            }
            Lazy<? extends wr2.a> lazy6 = lazy5;
            a.c cVar = this.eventListenerFactory;
            if (cVar == null) {
                cVar = a.c.NONE;
            }
            a.c cVar2 = cVar;
            ComponentRegistry componentRegistry = this.componentRegistry;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(context, l55Var, lazy2, lazy4, lazy6, cVar2, componentRegistry, this.options, null);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @ReplaceWith(expression = "components(registry)", imports = {}))
        @NotNull
        public final Builder d(@NotNull ComponentRegistry registry) {
            j.B();
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    dv5 a(@NotNull coil.request.a request);

    @Nullable
    Object b(@NotNull coil.request.a aVar, @NotNull Continuation<? super m4a> continuation);

    @Nullable
    MemoryCache c();

    @NotNull
    ComponentRegistry getComponents();
}
