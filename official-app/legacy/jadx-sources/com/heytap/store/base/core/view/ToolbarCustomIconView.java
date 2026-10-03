package com.heytap.store.base.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.base.core.util.thread.MainLooper;
import com.heytap.store.platform.imageloader.DownloadListener;
import com.heytap.store.platform.imageloader.ImageLoader;
import java.io.File;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ToolbarCustomIconView extends FrameLayout {
    public static final int TOOL_BAR_ICON_STYLE_GIF = 1;
    public static final int TOOL_BAR_ICON_STYLE_IMAGE = 0;
    public static final int TOOL_BAR_ICON_STYLE_LOTTIE = 2;
    public LottieAnimationView mAnimView;
    public Drawable mClickedDrawable;
    public String mDefaultUrl;
    public ImageView mImageView;
    public Drawable mNormalDrawable;

    @ToolbarIconStyle
    public int mStyle;

    /* JADX INFO: renamed from: com.heytap.store.base.core.view.ToolbarCustomIconView$1, reason: invalid class name */
    public class AnonymousClass1 implements DownloadListener {
        final /* synthetic */ boolean val$autoChangeVisibility;
        final /* synthetic */ boolean val$isCustomAppBar;
        final /* synthetic */ boolean val$isNightMode;

        public AnonymousClass1(boolean z, boolean z2, boolean z3) {
            this.val$isCustomAppBar = z;
            this.val$isNightMode = z2;
            this.val$autoChangeVisibility = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReady$0(File file, boolean z, boolean z2, boolean z3) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            ToolbarCustomIconView.this.mNormalDrawable = new BitmapDrawable(bitmapDecodeFile);
            ToolbarCustomIconView.this.updateImageIfNeeded(z, z2, z3);
        }

        @Override // com.heytap.store.platform.imageloader.DownloadListener
        public void onFailure(@Nullable Throwable th) {
        }

        @Override // com.heytap.store.platform.imageloader.DownloadListener
        public void onReady(@Nullable final File file) {
            AppThreadExecutor appThreadExecutor = AppThreadExecutor.getInstance();
            final boolean z = this.val$isCustomAppBar;
            final boolean z2 = this.val$isNightMode;
            final boolean z3 = this.val$autoChangeVisibility;
            appThreadExecutor.executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onReady$0(file, z, z2, z3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.heytap.store.base.core.view.ToolbarCustomIconView$2, reason: invalid class name */
    public class AnonymousClass2 implements DownloadListener {
        final /* synthetic */ boolean val$autoChangeVisibility;
        final /* synthetic */ boolean val$isCustomAppBar;
        final /* synthetic */ boolean val$isNightMode;

        public AnonymousClass2(boolean z, boolean z2, boolean z3) {
            this.val$isCustomAppBar = z;
            this.val$isNightMode = z2;
            this.val$autoChangeVisibility = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReady$0(File file, boolean z, boolean z2, boolean z3) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            ToolbarCustomIconView.this.mClickedDrawable = new BitmapDrawable(bitmapDecodeFile);
            ToolbarCustomIconView.this.updateImageIfNeeded(z, z2, z3);
        }

        @Override // com.heytap.store.platform.imageloader.DownloadListener
        public void onFailure(@Nullable Throwable th) {
        }

        @Override // com.heytap.store.platform.imageloader.DownloadListener
        public void onReady(@Nullable final File file) {
            AppThreadExecutor appThreadExecutor = AppThreadExecutor.getInstance();
            final boolean z = this.val$isCustomAppBar;
            final boolean z2 = this.val$isNightMode;
            final boolean z3 = this.val$autoChangeVisibility;
            appThreadExecutor.executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.view.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onReady$0(file, z, z2, z3);
                }
            });
        }
    }

    public @interface ToolbarIconStyle {
    }

    public ToolbarCustomIconView(@NonNull Context context) {
        super(context);
        this.mDefaultUrl = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setImageDrawable$0(boolean z, Drawable drawable) {
        this.mStyle = 0;
        if (z) {
            setVisibility(0);
        }
        this.mImageView.setVisibility(0);
        this.mImageView.setImageDrawable(drawable);
    }

    private void setImageDrawable(final Drawable drawable, final boolean z) {
        if (isAttachedToWindow()) {
            MainLooper.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.t1k
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$setImageDrawable$0(z, drawable);
                }
            });
        }
    }

    @ToolbarIconStyle
    public int getStyle() {
        return this.mStyle;
    }

    public void loadImageDrawable(boolean z, boolean z2, String str, String str2, boolean z3) {
        ImageLoader.download(str, new AnonymousClass1(z, z2, z3));
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ImageLoader.download(str2, new AnonymousClass2(z, z2, z3));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(getContext());
        this.mImageView = imageView;
        imageView.setForceDarkAllowed(false);
        this.mImageView.setVisibility(4);
        addView(this.mImageView, layoutParams);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        this.mAnimView = lottieAnimationView;
        lottieAnimationView.setVisibility(4);
        addView(this.mAnimView, layoutParams);
        setVisibility(8);
    }

    public void updateImageIfNeeded(boolean z, boolean z2) {
        updateImageIfNeeded(z, z2, true);
    }

    public void updateVisible(boolean z) {
        if (TextUtils.isEmpty(this.mDefaultUrl) && this.mNormalDrawable == null) {
            setVisibility(8);
        } else {
            setVisibility(z ? 0 : 8);
        }
    }

    public void updateImageIfNeeded(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        Drawable drawable2 = this.mNormalDrawable;
        if (drawable2 != null && (drawable = this.mClickedDrawable) != null) {
            if (z || z2) {
                setImageDrawable(drawable2, z3);
                return;
            } else {
                setImageDrawable(drawable, z3);
                return;
            }
        }
        if (drawable2 != null) {
            setImageDrawable(drawable2, z3);
            return;
        }
        Drawable drawable3 = this.mClickedDrawable;
        if (drawable3 != null) {
            setImageDrawable(drawable3, z3);
        }
    }

    public ToolbarCustomIconView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDefaultUrl = "";
    }

    public void loadImageDrawable(boolean z, boolean z2, String str, String str2) {
        loadImageDrawable(z, z2, str, str2, true);
    }

    public ToolbarCustomIconView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDefaultUrl = "";
    }
}
