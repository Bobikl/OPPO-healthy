package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class ye1 implements etf<BitmapDrawable> {
    public final kf1 a;
    public final etf<Bitmap> b;

    public ye1(kf1 kf1Var, etf<Bitmap> etfVar) {
        this.a = kf1Var;
        this.b = etfVar;
    }

    @Override // com.oplus.aiunit.vision.etf
    @NonNull
    public EncodeStrategy a(@NonNull erd erdVar) {
        return this.b.a(erdVar);
    }

    @Override // com.oplus.aiunit.vision.im6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull usf<BitmapDrawable> usfVar, @NonNull File file, @NonNull erd erdVar) {
        return this.b.b((Bitmap) new mf1(usfVar.get().getBitmap(), this.a), file, erdVar);
    }
}
