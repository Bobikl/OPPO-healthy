package com.heytap.usercenter.accountsdk.imageload;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface IImageLoad {
    void loadLister(Context context, String str, ImageLoadCallback imageLoadCallback);

    void loadView(Activity activity, String str, int i, int i2, ImageView imageView);

    void loadView(Activity activity, String str, int i, int i2, ImageView imageView, int i3);

    void loadView(Context context, String str, int i, int i2, ImageView imageView);

    void loadView(Context context, String str, int i, int i2, ImageView imageView, int i3);

    void loadView(Context context, String str, int i, Drawable drawable, ImageView imageView);

    void loadView(Context context, String str, int i, ImageView imageView);

    void loadView(Context context, String str, TextView textView);

    void pause(Context context);

    void resume(Context context);

    <T> void setCircularImage(ImageView imageView, T t, boolean z, int i);
}
