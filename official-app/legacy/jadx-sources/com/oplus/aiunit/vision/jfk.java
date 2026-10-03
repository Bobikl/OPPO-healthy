package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.fit.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public class jfk {
    public static void a(Toolbar toolbar, @ColorInt int i) {
        if (toolbar != null) {
            if (toolbar.isForceDarkAllowed()) {
                toolbar.setForceDarkAllowed(false);
            }
            for (int i2 = 0; i2 < toolbar.getMenu().size(); i2++) {
                MenuItem item = toolbar.getMenu().getItem(i2);
                if (item.getIcon() != null) {
                    DrawableCompat.setTint(item.getIcon(), i);
                }
            }
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                DrawableCompat.setTint(navigationIcon, i);
            }
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon != null) {
                DrawableCompat.setTint(overflowIcon, i);
            }
        }
    }

    public static void b(Activity activity) {
        c(activity.getWindow());
    }

    public static void c(Window window) {
        window.getDecorView().setSystemUiVisibility(3846);
    }

    public static ImageView d(ImageView imageView, Object obj) {
        hqf<Drawable> hqfVarP = com.bumptech.glide.a.w(imageView).p(obj);
        int i = R$drawable.fit_default_img_holder;
        hqfVarP.h0(i).j(ut5.ALL).q(i).Q0(imageView);
        return imageView;
    }

    public static JViewHolder e(JViewHolder jViewHolder, @IdRes int i, Object obj) {
        if (obj != null) {
            d((ImageView) jViewHolder.getView(i), obj);
        }
        return jViewHolder;
    }
}
