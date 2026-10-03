package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class l68 extends z46<GifDrawable> {
    public l68(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<GifDrawable> a() {
        return GifDrawable.class;
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return ((GifDrawable) this.i).i();
    }

    @Override // com.oplus.aiunit.vision.z46, com.oplus.aiunit.vision.z7a
    public void initialize() {
        ((GifDrawable) this.i).e().prepareToDraw();
    }

    @Override // com.oplus.aiunit.vision.usf
    public void recycle() {
        ((GifDrawable) this.i).stop();
        ((GifDrawable) this.i).k();
    }
}
