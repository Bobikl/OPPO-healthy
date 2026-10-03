package com.heytap.health.wallet.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.palette.graphics.Palette;
import com.oplus.aiunit.vision.sr0;

/* JADX INFO: loaded from: classes18.dex */
public class ColouringCircleNetworkImageView extends CircleNetworkImageView {
    public int o;

    public class a implements d {
        public final /* synthetic */ Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // com.heytap.health.wallet.widget.ColouringCircleNetworkImageView.d
        public void a(int i) {
            if (i != 0 && i != ColouringCircleNetworkImageView.this.o) {
                ColouringCircleNetworkImageView.this.o = i;
                ColouringCircleNetworkImageView.this.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            }
            ColouringCircleNetworkImageView.super.setImageBitmap(this.a);
        }
    }

    public class b implements Palette.PaletteAsyncListener {
        public final /* synthetic */ Bitmap a;
        public final /* synthetic */ d b;

        public b(Bitmap bitmap, d dVar) {
            this.a = bitmap;
            this.b = dVar;
        }

        @Override // androidx.palette.graphics.Palette.PaletteAsyncListener
        public void onGenerated(@Nullable Palette palette) {
            if (palette != null) {
                int mutedColor = palette.getMutedColor(0);
                if (mutedColor == 0) {
                    ColouringCircleNetworkImageView.this.j(this.a, this.b);
                } else {
                    this.b.a(mutedColor);
                }
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Bitmap i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f6416j;

        public class a implements Runnable {
            public final /* synthetic */ int i;

            public a(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f6416j.a(this.i);
            }
        }

        public c(Bitmap bitmap, d dVar) {
            this.i = bitmap;
            this.f6416j = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            sr0.e(new a(ColouringCircleNetworkImageView.this.i(this.i)));
        }
    }

    public interface d {
        void a(int i);
    }

    public ColouringCircleNetworkImageView(Context context) {
        super(context);
        this.o = 0;
    }

    public final int i(Bitmap bitmap) {
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return k(iArr);
    }

    public final void j(Bitmap bitmap, d dVar) {
        sr0.i(new c(bitmap, dVar));
    }

    public final int k(int[] iArr) {
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i : iArr) {
            j2 += (long) ((16711680 & i) >> 16);
            j3 += (long) ((65280 & i) >> 8);
            j4 += (long) (i & 255);
        }
        return ((int) (((j2 / ((long) iArr.length)) << 16) | ((j3 / ((long) iArr.length)) << 8) | (j4 / ((long) iArr.length)))) | (-16777216);
    }

    public final void l(Bitmap bitmap, d dVar) {
        Palette.from(bitmap).maximumColorCount(24).generate(new b(bitmap, dVar));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            l(bitmap, new a(bitmap));
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    public ColouringCircleNetworkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = 0;
    }

    public ColouringCircleNetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = 0;
    }
}
