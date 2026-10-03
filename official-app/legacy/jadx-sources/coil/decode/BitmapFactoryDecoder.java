package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.size.Size;
import com.oplus.aiunit.vision.a35;
import com.oplus.aiunit.vision.cx6;
import com.oplus.aiunit.vision.dx6;
import com.oplus.aiunit.vision.frd;
import com.oplus.aiunit.vision.j;
import com.oplus.aiunit.vision.w3i;
import com.oplus.aiunit.vision.x25;
import com.oplus.aiunit.vision.yw6;
import io.protostuff.MapSchema;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0003\u0003\u0010\nB+\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder;", "Lcoil/decode/Decoder;", "Lcom/oplus/aiunit/vision/x25;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/yw6;", "exifData", "", "c", "d", "Lcoil/decode/d;", "Lcoil/decode/d;", "source", "Lcom/oplus/aiunit/vision/frd;", "b", "Lcom/oplus/aiunit/vision/frd;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil/decode/ExifOrientationPolicy;", "Lcoil/decode/ExifOrientationPolicy;", "exifOrientationPolicy", "<init>", "(Lcoil/decode/d;Lcom/oplus/aiunit/vision/frd;Lkotlinx/coroutines/sync/Semaphore;Lcoil/decode/ExifOrientationPolicy;)V", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBitmapFactoryDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 6 Utils.kt\ncoil/util/-Utils\n*L\n1#1,227:1\n82#2,9:228\n1#3:237\n50#4:238\n28#5:239\n219#6:240\n223#6:241\n*S KotlinDebug\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n*L\n45#1:228,9\n92#1:238\n92#1:239\n144#1:240\n145#1:241\n*E\n"})
public final class BitmapFactoryDecoder implements Decoder {
    public static final int DEFAULT_MAX_PARALLELISM = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final d source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final frd options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Semaphore parallelismLock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ExifOrientationPolicy exifOrientationPolicy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R4\u0010\u000e\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$b;", "Lokio/ForwardingSource;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "i", "Ljava/lang/Exception;", "a", "()Ljava/lang/Exception;", "exception", "Lokio/Source;", "delegate", "<init>", "(Lokio/Source;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class b extends ForwardingSource {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public Exception exception;

        public b(@NotNull Source source) {
            super(source);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e2) {
                this.exception = e2;
                throw e2;
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$c;", "Lcoil/decode/Decoder$a;", "Lcom/oplus/aiunit/vision/w3i;", "result", "Lcom/oplus/aiunit/vision/frd;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/decode/Decoder;", "a", "", "other", "", "equals", "", "hashCode", "Lcoil/decode/ExifOrientationPolicy;", "Lcoil/decode/ExifOrientationPolicy;", "exifOrientationPolicy", "Lkotlinx/coroutines/sync/Semaphore;", "b", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "maxParallelism", "<init>", "(ILcoil/decode/ExifOrientationPolicy;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class c implements Decoder.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ExifOrientationPolicy exifOrientationPolicy;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Semaphore parallelismLock;

        public c(int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
            this.exifOrientationPolicy = exifOrientationPolicy;
            this.parallelismLock = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        }

        @Override // coil.decode.Decoder.a
        @NotNull
        public Decoder a(@NotNull w3i result, @NotNull frd options, @NotNull ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(result.getSource(), options, this.parallelismLock, this.exifOrientationPolicy);
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    public BitmapFactoryDecoder(@NotNull d dVar, @NotNull frd frdVar, @NotNull Semaphore semaphore, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.source = dVar;
        this.options = frdVar;
        this.parallelismLock = semaphore;
        this.exifOrientationPolicy = exifOrientationPolicy;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.decode.Decoder
    @Nullable
    public Object a(@NotNull Continuation<? super x25> continuation) throws Throwable {
        BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        Semaphore semaphore;
        Throwable th;
        Semaphore semaphore2;
        if (continuation instanceof BitmapFactoryDecoder$decode$1) {
            bitmapFactoryDecoder$decode$1 = (BitmapFactoryDecoder$decode$1) continuation;
            int i = bitmapFactoryDecoder$decode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bitmapFactoryDecoder$decode$1.label = i - Integer.MIN_VALUE;
            } else {
                bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuation);
            }
        } else {
            bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuation);
        }
        Object obj = bitmapFactoryDecoder$decode$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bitmapFactoryDecoder$decode$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                semaphore = this.parallelismLock;
                bitmapFactoryDecoder$decode$1.L$0 = this;
                bitmapFactoryDecoder$decode$1.L$1 = semaphore;
                bitmapFactoryDecoder$decode$1.label = 1;
                if (semaphore.acquire(bitmapFactoryDecoder$decode$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    semaphore2 = (Semaphore) bitmapFactoryDecoder$decode$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        x25 x25Var = (x25) obj;
                        semaphore2.release();
                        return x25Var;
                    } catch (Throwable th2) {
                        th = th2;
                        semaphore2.release();
                        throw th;
                    }
                }
                Semaphore semaphore3 = (Semaphore) bitmapFactoryDecoder$decode$1.L$1;
                BitmapFactoryDecoder bitmapFactoryDecoder = (BitmapFactoryDecoder) bitmapFactoryDecoder$decode$1.L$0;
                ResultKt.throwOnFailure(obj);
                semaphore = semaphore3;
                this = bitmapFactoryDecoder;
            }
            Function0<x25> function0 = new Function0<x25>() { // from class: coil.decode.BitmapFactoryDecoder$decode$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final x25 invoke() {
                    return this.this$0.e(new BitmapFactory.Options());
                }
            };
            bitmapFactoryDecoder$decode$1.L$0 = semaphore;
            bitmapFactoryDecoder$decode$1.L$1 = null;
            bitmapFactoryDecoder$decode$1.label = 2;
            Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, function0, bitmapFactoryDecoder$decode$1, 1, null);
            if (objRunInterruptible$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            Semaphore semaphore4 = semaphore;
            obj = objRunInterruptible$default;
            semaphore2 = semaphore4;
            x25 x25Var2 = (x25) obj;
            semaphore2.release();
            return x25Var2;
        } catch (Throwable th3) {
            Semaphore semaphore5 = semaphore;
            th = th3;
            semaphore2 = semaphore5;
            semaphore2.release();
            throw th;
        }
    }

    public final void c(BitmapFactory.Options options, yw6 yw6Var) {
        Bitmap.Config config = this.options.getConfig();
        if (yw6Var.getIsFlipped() || dx6.a(yw6Var)) {
            config = com.oplus.aiunit.vision.a.e(config);
        }
        if (this.options.getAllowRgb565() && config == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, j.MIME_TYPE_JPEG)) {
            config = Bitmap.Config.RGB_565;
        }
        if (options.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = config;
    }

    public final void d(BitmapFactory.Options options, yw6 yw6Var) {
        d.a aVarA = this.source.a();
        if ((aVarA instanceof e) && coil.size.b.b(this.options.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((e) aVarA).getDensity();
            options.inTargetDensity = this.options.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = dx6.b(yw6Var) ? options.outHeight : options.outWidth;
        int i2 = dx6.b(yw6Var) ? options.outWidth : options.outHeight;
        Size size = this.options.getSize();
        int iA = coil.size.b.b(size) ? i : j.A(size.d(), this.options.getScale());
        Size size2 = this.options.getSize();
        int iA2 = coil.size.b.b(size2) ? i2 : j.A(size2.c(), this.options.getScale());
        int iA3 = a35.a(i, i2, iA, iA2, this.options.getScale());
        options.inSampleSize = iA3;
        double dB = a35.b(((double) i) / ((double) iA3), ((double) i2) / ((double) iA3), iA, iA2, this.options.getScale());
        if (this.options.getAllowInexactSize()) {
            dB = RangesKt___RangesKt.coerceAtMost(dB, 1.0d);
        }
        boolean z = !(dB == 1.0d);
        options.inScaled = z;
        if (z) {
            if (dB > 1.0d) {
                options.inDensity = MathKt__MathJVMKt.roundToInt(((double) Integer.MAX_VALUE) / dB);
                options.inTargetDensity = Integer.MAX_VALUE;
            } else {
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = MathKt__MathJVMKt.roundToInt(((double) Integer.MAX_VALUE) * dB);
            }
        }
    }

    public final x25 e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.g());
        BufferedSource bufferedSourceBuffer = Okio.buffer(bVar);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        cx6 cx6Var = cx6.INSTANCE;
        yw6 yw6VarA = cx6Var.a(options.outMimeType, bufferedSourceBuffer, this.exifOrientationPolicy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (this.options.getColorSpace() != null) {
            options.inPreferredColorSpace = this.options.getColorSpace();
        }
        options.inPremultiplied = this.options.getPremultipliedAlpha();
        c(options, yw6VarA);
        d(options, yw6VarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, options);
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), cx6Var.b(bitmapDecodeStream, yw6VarA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new x25(bitmapDrawable, z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedSourceBuffer, th);
                throw th2;
            }
        }
    }
}
