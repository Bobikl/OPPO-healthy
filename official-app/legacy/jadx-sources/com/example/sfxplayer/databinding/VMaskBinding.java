package com.example.sfxplayer.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes13.dex */
public final class VMaskBinding implements ViewBinding {

    @NonNull
    public final LinearLayout i;

    public VMaskBinding(@NonNull LinearLayout linearLayout) {
        this.i = linearLayout;
    }

    @NonNull
    public static VMaskBinding a(@NonNull View view) {
        if (view != null) {
            return new VMaskBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.i;
    }
}
