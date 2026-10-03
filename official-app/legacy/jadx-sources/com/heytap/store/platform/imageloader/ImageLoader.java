package com.heytap.store.platform.imageloader;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.example.sfxplayer.player.SFXPlayer;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a8i;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\u001c\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/heytap/store/platform/imageloader/ImageLoader;", "", "()V", "imageFactory", "Lcom/heytap/store/platform/imageloader/ImageFactory;", "getImageFactory$annotations", "getImageFactory", "()Lcom/heytap/store/platform/imageloader/ImageFactory;", "sIsInitialized", "", "checkInit", "", "defaultConfig", "Lcom/heytap/store/platform/imageloader/ImageLoaderConfig;", "context", "Landroid/content/Context;", a8i.DOWNLOAD, "url", "", "listener", "Lcom/heytap/store/platform/imageloader/DownloadListener;", "hasInitialized", "init", "config", "load", "Lcom/heytap/store/platform/imageloader/LoadStep;", "resId", "", ParserTag.TAG_URI, "Landroid/net/Uri;", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "imageView", "Landroid/widget/ImageView;", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public final class ImageLoader {
    public static final ImageLoader INSTANCE = new ImageLoader();
    private static volatile boolean sIsInitialized;

    private ImageLoader() {
    }

    private final void checkInit() {
        if (!hasInitialized()) {
            throw new IllegalStateException("You cannot call ImageLoader before init()");
        }
    }

    private final ImageLoaderConfig defaultConfig(Context context) {
        String path;
        File externalCacheDir = context.getExternalCacheDir();
        return new ImageLoaderConfig((externalCacheDir == null || (path = externalCacheDir.getPath()) == null) ? null : new DiskCacheConfig.Builder().setMaxCacheSize(SFXPlayer.MAX_CACHE_SIZE).setBaseDirectoryName("image_loader").setBaseDirectoryPath(path).build(), new GlideEngine());
    }

    @JvmStatic
    public static final void download(@NotNull String url, @Nullable DownloadListener listener) {
        ImageEngine imageEngine;
        Intrinsics.checkNotNullParameter(url, "url");
        ImageLoaderConfig config = ImageFactory.INSTANCE.getConfig();
        if (config == null || (imageEngine = config.getImageEngine()) == null) {
            return;
        }
        imageEngine.downloadOnly(url, listener);
    }

    @Nullable
    public static final ImageFactory getImageFactory() {
        return ImageFactory.INSTANCE;
    }

    @JvmStatic
    public static /* synthetic */ void getImageFactory$annotations() {
    }

    @JvmStatic
    public static final boolean hasInitialized() {
        return sIsInitialized;
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull Context context) {
        init$default(context, null, 2, null);
    }

    public static /* synthetic */ void init$default(Context context, ImageLoaderConfig imageLoaderConfig, int i, Object obj) {
        if ((i & 2) != 0) {
            imageLoaderConfig = null;
        }
        init(context, imageLoaderConfig);
    }

    @JvmStatic
    @NotNull
    public static final LoadStep load(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        INSTANCE.checkInit();
        return new LoadStep(url);
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull Context context, @Nullable ImageLoaderConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextGetter.Companion companion = ContextGetter.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        companion.setContext(applicationContext);
        ImageFactory imageFactory = ImageFactory.INSTANCE;
        if (config == null) {
            config = INSTANCE.defaultConfig(context);
        }
        imageFactory.init(config);
        sIsInitialized = true;
    }

    @JvmStatic
    @NotNull
    public static final LoadStep load(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        INSTANCE.checkInit();
        return new LoadStep(file);
    }

    @JvmStatic
    @NotNull
    public static final LoadStep load(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        INSTANCE.checkInit();
        return new LoadStep(uri);
    }

    @JvmStatic
    @NotNull
    public static final LoadStep load(@NotNull Context context, int resId) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.checkInit();
        return new LoadStep(context, resId);
    }

    @JvmStatic
    public static final void load(@NotNull String url, @NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        INSTANCE.checkInit();
        LoadStep.into$default(new LoadStep(url), imageView, null, 2, null);
    }
}
