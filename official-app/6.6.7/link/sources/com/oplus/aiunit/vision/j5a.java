package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/j5a;", "", "Landroid/content/Context;", "context", "", qmm.a.l, "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Lkotlin/ParameterName;", "name", "bitmap", "", "onResourceReady", "Lkotlin/Function0;", "onLoadFailed", "a", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class j5a {

    @NotNull
    public static final j5a INSTANCE = new j5a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"com/oplus/aiunit/vision/j5a$a", "Lcom/oplus/aiunit/vision/ug4;", "Landroid/graphics/Bitmap;", "resource", "Lcom/oplus/aiunit/vision/qek;", "transition", "", "onResourceReady", "Landroid/graphics/drawable/Drawable;", "placeholder", "onLoadCleared", "errorDrawable", "onLoadFailed", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ug4<Bitmap> {
        public final /* synthetic */ Function1<Bitmap, Unit> i;
        public final /* synthetic */ Function0<Unit> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Bitmap, Unit> function1, Function0<Unit> function0) {
            this.i = function1;
            this.j = function0;
        }

        public void onLoadCleared(@Nullable Drawable placeholder) {
        }

        public void onLoadFailed(@Nullable Drawable errorDrawable) {
            super.onLoadFailed(errorDrawable);
            this.j.invoke();
        }

        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, qek qekVar) {
            onResourceReady((Bitmap) obj, (qek<? super Bitmap>) qekVar);
        }

        public void onResourceReady(@NotNull Bitmap resource, @Nullable qek<? super Bitmap> transition) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.i.invoke(resource);
        }
    }

    public final void a(@NotNull Context context, @NotNull String url, @NotNull Function1<? super Bitmap, Unit> onResourceReady, @NotNull Function0<Unit> onLoadFailed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, qmm.a.l);
        Intrinsics.checkNotNullParameter(onResourceReady, "onResourceReady");
        Intrinsics.checkNotNullParameter(onLoadFailed, "onLoadFailed");
        com.bumptech.glide.a.v(context).b().Y0(url).N0(new a(onResourceReady, onLoadFailed));
    }
}
