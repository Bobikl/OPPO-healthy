package com.heytap.store.util;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.sdk.R;
import com.oplus.aiunit.vision.boj;
import com.oplus.aiunit.vision.ff1;
import com.oplus.aiunit.vision.g5a;
import com.oplus.aiunit.vision.hc3;
import com.oplus.aiunit.vision.l7h;
import com.oplus.aiunit.vision.uqf;
import com.oplus.aiunit.vision.ut5;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.zqf;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/store/util/GlideUtil;", "", "()V", "Companion", "util_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GlideUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JX\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J8\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007JX\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007JX\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0003J<\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/util/GlideUtil$Companion;", "", "()V", "loadGif", "", "url", "", "imageView", "Landroid/widget/ImageView;", "needReLayout", "", "edgeOffset", "", "placeholder", "roundAsCircle", ParserTag.TAG_CORNER_RADIUS, "df", "listener", "Lcom/heytap/store/util/IProductLoadImgListener;", "loadImage", "loadImg", "reLayout", "resourceWidth", "resourceHeight", "util_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void loadGif(String url, final ImageView imageView, final boolean needReLayout, final int edgeOffset, int placeholder, boolean roundAsCircle, int cornerRadius, final int df, final IProductLoadImgListener listener) {
            String strReplaceAfter$default = StringsKt__StringsKt.replaceAfter$default(url, ".gif", "", (String) null, 4, (Object) null);
            g5a<GifDrawable> g5aVar = new g5a<GifDrawable>(imageView, needReLayout) { // from class: com.heytap.store.util.GlideUtil$Companion$loadGif$imageViewTarget$1
                final /* synthetic */ ImageView $imageView;
                final /* synthetic */ boolean $needReLayout;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(imageView);
                    this.$imageView = imageView;
                    this.$needReLayout = needReLayout;
                }

                @Override // com.oplus.aiunit.vision.c1l, com.oplus.aiunit.vision.boj
                public void getSize(@NotNull l7h cb) {
                    Intrinsics.checkNotNullParameter(cb, "cb");
                    if (this.$needReLayout) {
                        cb.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    super.getSize(cb);
                }

                @Override // com.oplus.aiunit.vision.g5a
                public void setResource(@Nullable GifDrawable resource) {
                    this.$imageView.setImageDrawable(resource);
                }
            };
            if (placeholder == -1) {
                placeholder = vhc.a(ContextGetterUtils.INSTANCE.getApp()) ? R.drawable.product_gallery_dark_bg : R.drawable.product_gallery_bg;
            }
            zqf zqfVar = new zqf();
            ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
            zqf zqfVarR = zqfVar.i0(contextGetterUtils.getApp().getDrawable(placeholder)).j(ut5.ALL).r(contextGetterUtils.getApp().getDrawable(placeholder));
            Intrinsics.checkNotNullExpressionValue(zqfVarR, "RequestOptions()\n       …awable(placeholderColor))");
            a.v(contextGetterUtils.getApp()).d().Y0(strReplaceAfter$default).a(zqfVarR).S0(new uqf<GifDrawable>() { // from class: com.heytap.store.util.GlideUtil$Companion$loadGif$1
                @Override // com.oplus.aiunit.vision.uqf
                public boolean onLoadFailed(@Nullable GlideException e2, @Nullable Object model, @Nullable boj<GifDrawable> target, boolean isFirstResource) {
                    IProductLoadImgListener iProductLoadImgListener = listener;
                    if (iProductLoadImgListener == null) {
                        return false;
                    }
                    iProductLoadImgListener.onFailure();
                    return false;
                }

                @Override // com.oplus.aiunit.vision.uqf
                public boolean onResourceReady(@Nullable GifDrawable resource, @Nullable Object model, @Nullable boj<GifDrawable> target, @Nullable DataSource dataSource, boolean isFirstResource) {
                    if (needReLayout) {
                        GlideUtil.Companion.reLayout$default(GlideUtil.INSTANCE, imageView, resource != null ? resource.getIntrinsicWidth() : 1, resource != null ? resource.getIntrinsicHeight() : 1, edgeOffset, df, null, 32, null);
                    }
                    IProductLoadImgListener iProductLoadImgListener = listener;
                    if (iProductLoadImgListener == null) {
                        return false;
                    }
                    iProductLoadImgListener.onSuccess(null);
                    return false;
                }
            }).N0(g5aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void loadImg(String url, final ImageView imageView, final boolean needReLayout, final int edgeOffset, int placeholder, final boolean roundAsCircle, final int cornerRadius, final int df, final IProductLoadImgListener listener) {
            if (placeholder == -1) {
                placeholder = vhc.a(ContextGetterUtils.INSTANCE.getApp()) ? R.drawable.product_gallery_dark_bg : R.drawable.product_gallery_bg;
            }
            zqf zqfVar = new zqf();
            ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
            zqf zqfVarR = zqfVar.i0(contextGetterUtils.getApp().getDrawable(placeholder)).j(ut5.ALL).r(contextGetterUtils.getApp().getDrawable(placeholder));
            Intrinsics.checkNotNullExpressionValue(zqfVarR, "RequestOptions()\n       …awable(placeholderColor))");
            a.v(contextGetterUtils.getApp()).b().Y0(url).a(zqfVarR).S0(new uqf<Bitmap>() { // from class: com.heytap.store.util.GlideUtil$Companion$loadImg$1
                @Override // com.oplus.aiunit.vision.uqf
                public boolean onLoadFailed(@Nullable GlideException e2, @NotNull Object model, @NotNull boj<Bitmap> target, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(target, "target");
                    IProductLoadImgListener iProductLoadImgListener = listener;
                    if (iProductLoadImgListener == null) {
                        return false;
                    }
                    iProductLoadImgListener.onFailure();
                    return false;
                }

                @Override // com.oplus.aiunit.vision.uqf
                public boolean onResourceReady(@NotNull Bitmap resource, @NotNull Object model, @NotNull boj<Bitmap> target, @NotNull DataSource dataSource, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(target, "target");
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    if (needReLayout) {
                        GlideUtil.Companion.reLayout$default(GlideUtil.INSTANCE, imageView, resource.getWidth(), resource.getHeight(), edgeOffset, df, null, 32, null);
                    }
                    IProductLoadImgListener iProductLoadImgListener = listener;
                    if (iProductLoadImgListener == null) {
                        return false;
                    }
                    iProductLoadImgListener.onSuccess(resource);
                    return false;
                }
            }).N0(new ff1(imageView, needReLayout, roundAsCircle, cornerRadius) { // from class: com.heytap.store.util.GlideUtil$Companion$loadImg$target$1
                final /* synthetic */ int $cornerRadius;
                final /* synthetic */ ImageView $imageView;
                final /* synthetic */ boolean $needReLayout;
                final /* synthetic */ boolean $roundAsCircle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(imageView);
                    this.$imageView = imageView;
                    this.$needReLayout = needReLayout;
                    this.$roundAsCircle = roundAsCircle;
                    this.$cornerRadius = cornerRadius;
                }

                @Override // com.oplus.aiunit.vision.c1l, com.oplus.aiunit.vision.boj
                public void getSize(@NotNull l7h cb) {
                    Intrinsics.checkNotNullParameter(cb, "cb");
                    if (this.$needReLayout) {
                        cb.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    super.getSize(cb);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.oplus.aiunit.vision.ff1, com.oplus.aiunit.vision.g5a
                public void setResource(@Nullable Bitmap resource) {
                    super.setResource(resource);
                    RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(ContextGetterUtils.INSTANCE.getApp().getResources(), resource);
                    Intrinsics.checkNotNullExpressionValue(roundedBitmapDrawableCreate, "create(ContextGetterUtil…pp().resources, resource)");
                    boolean z = this.$roundAsCircle;
                    if (z) {
                        roundedBitmapDrawableCreate.setCircular(z);
                    } else {
                        int i = this.$cornerRadius;
                        if (i != -1) {
                            roundedBitmapDrawableCreate.setCornerRadius(DisplayUtil.dip2px(i));
                        }
                    }
                    this.$imageView.setImageDrawable(roundedBitmapDrawableCreate);
                }
            });
        }

        private final void reLayout(ImageView imageView, int resourceWidth, int resourceHeight, int edgeOffset, int df, IProductLoadImgListener listener) {
            int screenWidth = DisplayUtil.getScreenWidth(ContextGetterUtils.INSTANCE.getApp()) - DisplayUtil.dip2px(edgeOffset);
            if (df == 0) {
                df = 1;
            }
            int i = screenWidth / df;
            float f = i / resourceWidth;
            if (f == 0.0f) {
                f = 1.0f;
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = (int) (resourceHeight * f);
            layoutParams.width = i;
            imageView.setLayoutParams(layoutParams);
            imageView.requestLayout();
        }

        public static /* synthetic */ void reLayout$default(Companion companion, ImageView imageView, int i, int i2, int i3, int i4, IProductLoadImgListener iProductLoadImgListener, int i5, Object obj) {
            if ((i5 & 32) != 0) {
                iProductLoadImgListener = null;
            }
            companion.reLayout(imageView, i, i2, i3, i4, iProductLoadImgListener);
        }

        @JvmStatic
        public final void loadImage(@NotNull String url, @NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            loadImage(url, imageView, false, 0, null);
        }

        public static /* synthetic */ void loadImage$default(Companion companion, String str, ImageView imageView, boolean z, int i, IProductLoadImgListener iProductLoadImgListener, int i2, Object obj) {
            boolean z2 = (i2 & 4) != 0 ? false : z;
            int i3 = (i2 & 8) != 0 ? 0 : i;
            if ((i2 & 16) != 0) {
                iProductLoadImgListener = null;
            }
            companion.loadImage(str, imageView, z2, i3, iProductLoadImgListener);
        }

        @JvmStatic
        public final void loadImage(@NotNull String url, @NotNull ImageView imageView, boolean needReLayout, int edgeOffset, int placeholder, boolean roundAsCircle, int cornerRadius, int df, @Nullable IProductLoadImgListener listener) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            if (!StringsKt__StringsJVMKt.endsWith$default(url, hc3.CLASSIC_CONFIG_SUFFIX, false, 2, null)) {
                if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) ".gif", false, 2, (Object) null)) {
                    loadGif(url, imageView, needReLayout, edgeOffset, placeholder, roundAsCircle, cornerRadius, df, listener);
                    return;
                } else {
                    loadImg(url, imageView, needReLayout, edgeOffset, placeholder, roundAsCircle, cornerRadius, df, listener);
                    return;
                }
            }
            try {
                if (imageView instanceof LottieAnimationView) {
                    ((LottieAnimationView) imageView).setRepeatCount(-1);
                    ((LottieAnimationView) imageView).setAnimationFromUrl(url);
                    ((LottieAnimationView) imageView).enableMergePathsForKitKatAndAbove(true);
                    ((LottieAnimationView) imageView).playAnimation();
                }
            } catch (Exception unused) {
            }
        }

        @JvmStatic
        public final void loadImage(@NotNull String url, @NotNull ImageView imageView, boolean needReLayout, int edgeOffset, @Nullable IProductLoadImgListener listener) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            loadImage(url, imageView, needReLayout, edgeOffset, -1, false, -1, 0, listener);
        }
    }

    @JvmStatic
    public static final void loadImage(@NotNull String str, @NotNull ImageView imageView) {
        INSTANCE.loadImage(str, imageView);
    }

    @JvmStatic
    private static final void loadImg(String str, ImageView imageView, boolean z, int i, int i2, boolean z2, int i3, int i4, IProductLoadImgListener iProductLoadImgListener) {
        INSTANCE.loadImg(str, imageView, z, i, i2, z2, i3, i4, iProductLoadImgListener);
    }

    @JvmStatic
    public static final void loadImage(@NotNull String str, @NotNull ImageView imageView, boolean z, int i, int i2, boolean z2, int i3, int i4, @Nullable IProductLoadImgListener iProductLoadImgListener) {
        INSTANCE.loadImage(str, imageView, z, i, i2, z2, i3, i4, iProductLoadImgListener);
    }

    @JvmStatic
    public static final void loadImage(@NotNull String str, @NotNull ImageView imageView, boolean z, int i, @Nullable IProductLoadImgListener iProductLoadImgListener) {
        INSTANCE.loadImage(str, imageView, z, i, iProductLoadImgListener);
    }
}
