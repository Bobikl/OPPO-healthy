package com.oplus.aiunit.vision;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class w46 implements oak<Drawable> {
    public final int a;
    public final boolean b;

    public w46(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // com.oplus.aiunit.vision.oak
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, oak.a aVar) {
        Drawable currentDrawable = aVar.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        aVar.setDrawable(transitionDrawable);
        return true;
    }
}
