package com.heytap.wearable.support.watchface.common.vector;

import android.content.Context;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class VectorPathFinder {
    private VectorDrawableCompatLocal mDrawableCompatLocal;

    public VectorPathFinder(Context context, int i, ImageView imageView) {
        VectorDrawableCompatLocal vectorDrawableCompatLocalCreate = VectorDrawableCompatLocal.create(context.getResources(), i, null);
        this.mDrawableCompatLocal = vectorDrawableCompatLocalCreate;
        if (vectorDrawableCompatLocalCreate != null) {
            vectorDrawableCompatLocalCreate.setAllowCaching(false);
            imageView.setImageDrawable(this.mDrawableCompatLocal);
        }
    }

    public VectorDrawableCompatLocal.VGroup findGroupByName(String str) {
        return (VectorDrawableCompatLocal.VGroup) this.mDrawableCompatLocal.getTargetByName(str);
    }

    public VectorDrawableCompatLocal.VFullPath findPathByName(String str) {
        return (VectorDrawableCompatLocal.VFullPath) this.mDrawableCompatLocal.getTargetByName(str);
    }
}
