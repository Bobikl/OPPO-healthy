package com.heytap.health.bandface.watchface.album;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.heytap.health.bandface.R$id;
import com.heytap.health.bandface.R$layout;

/* JADX INFO: loaded from: classes15.dex */
public class BandAlbumView extends FrameLayout {
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f3104j;

    public BandAlbumView(Context context) {
        this(context, null);
    }

    public void setAlbumBg(Bitmap bitmap) {
        this.f3104j.setImageBitmap(bitmap);
    }

    public void setStyleImage(@DrawableRes int i) {
        this.i.setImageResource(i);
    }

    public BandAlbumView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setAlbumBg(@DrawableRes int i) {
        this.f3104j.setImageResource(i);
    }

    public BandAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R$layout.band_album_dial, this);
        this.i = (ImageView) findViewById(R$id.iv_album_style);
        this.f3104j = (ImageView) findViewById(R$id.iv_album_background);
    }
}
