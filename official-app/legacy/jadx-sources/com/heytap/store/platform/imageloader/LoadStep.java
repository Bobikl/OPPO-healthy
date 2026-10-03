package com.heytap.store.platform.imageloader;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.mla;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u0011\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u001a\u001a\u00020\u0000J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ&\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010%\u001a\u00020&H\u0002J\u001c\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0007J\u0010\u0010,\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010.\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000f¨\u00063"}, d2 = {"Lcom/heytap/store/platform/imageloader/LoadStep;", "", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "(Ljava/io/File;)V", "context", "Landroid/content/Context;", "resId", "", "(Landroid/content/Context;I)V", "url", "", "(Ljava/lang/String;)V", ParserTag.TAG_URI, "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "options", "Lcom/heytap/store/platform/imageloader/Options;", "getOptions", "()Lcom/heytap/store/platform/imageloader/Options;", "setOptions", "(Lcom/heytap/store/platform/imageloader/Options;)V", "getUri", "()Landroid/net/Uri;", "setUri", "apply", "asCircle", "corners", "radius", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "failure", ResourcesUtil.ResourceType.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "initConfig", "", "into", "imageView", "Landroid/widget/ImageView;", "listener", "Lcom/heytap/store/platform/imageloader/RequestListener;", "placeholder", "placeholderColor", "resize", "resizeOptions", "Lcom/heytap/store/platform/imageloader/ResizeOptions;", ParserTag.TAG_SCALE_TYPE, "Landroid/widget/ImageView$ScaleType;", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public final class LoadStep {

    @Nullable
    private Options options;

    @Nullable
    private Uri uri;

    public LoadStep(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.uri = Uri.parse("file://" + file.getAbsolutePath());
    }

    private final void initConfig() {
        if (this.options == null) {
            this.options = new Options();
        }
    }

    public static /* synthetic */ void into$default(LoadStep loadStep, ImageView imageView, RequestListener requestListener, int i, Object obj) {
        if ((i & 2) != 0) {
            requestListener = null;
        }
        loadStep.into(imageView, requestListener);
    }

    @NotNull
    public final LoadStep apply(@Nullable Options options) {
        this.options = options;
        return this;
    }

    @NotNull
    public final LoadStep asCircle() {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setRoundParams(new RoundParams());
        }
        Options options2 = this.options;
        RoundParams roundParams = options2 != null ? options2.getRoundParams() : null;
        Intrinsics.checkNotNull(roundParams);
        roundParams.m5050setRoundAsCircle(true);
        return this;
    }

    @NotNull
    public final LoadStep corners(float radius) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setRoundParams(new RoundParams());
        }
        Options options2 = this.options;
        RoundParams roundParams = options2 != null ? options2.getRoundParams() : null;
        Intrinsics.checkNotNull(roundParams);
        roundParams.setCornersRadius(radius);
        return this;
    }

    @NotNull
    public final LoadStep failure(@Nullable Drawable drawable) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setFailureDrawable(drawable);
        }
        return this;
    }

    @Nullable
    public final Options getOptions() {
        return this.options;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    @JvmOverloads
    public final void into(@NotNull ImageView imageView) {
        into$default(this, imageView, null, 2, null);
    }

    @NotNull
    public final LoadStep placeholder(@Nullable Drawable drawable) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setPlaceholderDrawable(drawable);
        }
        return this;
    }

    @NotNull
    public final LoadStep placeholderColor(int resId) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setPlaceholderColorResId(resId);
        }
        return this;
    }

    @NotNull
    public final LoadStep resize(@Nullable ResizeOptions resizeOptions) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setResizeOptions(resizeOptions);
        }
        return this;
    }

    @NotNull
    public final LoadStep scaleType(@Nullable ImageView.ScaleType scaleType) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setScaleType(scaleType);
        }
        return this;
    }

    public final void setOptions(@Nullable Options options) {
        this.options = options;
    }

    public final void setUri(@Nullable Uri uri) {
        this.uri = uri;
    }

    public LoadStep(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.uri = Uri.parse("android.resource://" + context.getResources().getResourcePackageName(i) + mla.SEPARATOR + context.getResources().getResourceTypeName(i) + mla.SEPARATOR + context.getResources().getResourceEntryName(i));
    }

    @JvmOverloads
    public final void into(@NotNull ImageView imageView, @Nullable RequestListener listener) {
        ImageLoaderConfig config;
        ImageEngine imageEngine;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (imageView.getContext() instanceof Activity) {
            Context context = imageView.getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            if (((Activity) context).isDestroyed()) {
                return;
            }
        }
        Uri uri = this.uri;
        if (uri == null || (config = ImageFactory.INSTANCE.getConfig()) == null || (imageEngine = config.getImageEngine()) == null) {
            return;
        }
        imageEngine.loadUri(uri, imageView, this.options, listener);
    }

    @NotNull
    public final LoadStep failure(int resId) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setFailureResId(resId);
        }
        return this;
    }

    @NotNull
    public final LoadStep placeholder(int resId) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setPlaceholderResId(resId);
        }
        return this;
    }

    @NotNull
    public final LoadStep corners(float topLeft, float topRight, float bottomLeft, float bottomRight) {
        initConfig();
        Options options = this.options;
        if (options != null) {
            options.setRoundParams(new RoundParams());
        }
        Options options2 = this.options;
        RoundParams roundParams = options2 != null ? options2.getRoundParams() : null;
        Intrinsics.checkNotNull(roundParams);
        roundParams.setCornersRadius(topLeft, topRight, bottomLeft, bottomRight);
        return this;
    }

    public LoadStep(@NotNull String url) {
        Uri uri;
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) ".gif", false, 2, (Object) null)) {
            uri = Uri.parse(url.subSequence(0, StringsKt__StringsKt.indexOf$default((CharSequence) url, ".gif", 0, false, 6, (Object) null) + 4).toString());
        } else {
            uri = Uri.parse(url);
        }
        this.uri = uri;
    }

    public LoadStep(@Nullable Uri uri) {
        this.uri = uri;
    }
}
