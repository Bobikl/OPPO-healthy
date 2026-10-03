package com.platform.sdk.center.sdk.image;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class ImageLoadManager implements IImageLoad {
    private static ImageLoadManager INSTANCE = new ImageLoadManager();
    private IImageLoad install;

    private ImageLoadManager() {
    }

    public static ImageLoadManager getInstance() {
        return INSTANCE;
    }

    public boolean existInstall() {
        return this.install == null;
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadLister(Context context, String str, ImageLoadCallback imageLoadCallback) {
        if (existInstall()) {
            return;
        }
        this.install.loadLister(context, str, imageLoadCallback);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Activity activity, String str, int i, int i2, ImageView imageView) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(activity, str, i, i2, imageView);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void pause(Context context) {
        if (existInstall()) {
            return;
        }
        this.install.pause(context);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void resume(Context context) {
        if (existInstall()) {
            return;
        }
        this.install.resume(context);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public <T> void setCircularImage(ImageView imageView, T t, boolean z, int i) {
        if (existInstall()) {
            return;
        }
        this.install.setCircularImage(imageView, t, z, i);
    }

    public void setInstall(IImageLoad iImageLoad) {
        this.install = iImageLoad;
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Context context, String str, int i, int i2, ImageView imageView) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(context, str, i, i2, imageView);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Context context, String str, int i, Drawable drawable, ImageView imageView) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(context, str, i, drawable, imageView);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Context context, String str, int i, ImageView imageView) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(context, str, i, imageView);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Activity activity, String str, int i, int i2, ImageView imageView, int i3) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(activity, str, i, i2, imageView, i3);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Context context, String str, int i, int i2, ImageView imageView, int i3) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(context, str, i, i2, imageView, i3);
    }

    @Override // com.platform.sdk.center.sdk.image.IImageLoad
    public void loadView(Context context, String str, TextView textView) {
        if (existInstall()) {
            return;
        }
        this.install.loadView(context, str, textView);
    }
}
