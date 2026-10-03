package com.example.sfxplayer.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sfxplayer.R$id;
import com.example.sfxplayer.R$layout;
import com.tencent.qgame.animplayer.AnimView;

/* JADX INFO: loaded from: classes13.dex */
public final class SfxLayoutBinding implements ViewBinding {

    @NonNull
    public final FrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SurfaceView f2210j;

    @NonNull
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final AnimView f2211l;

    @NonNull
    public final VMaskBinding m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final FrameLayout f2212n;

    @NonNull
    public final TextView o;

    public SfxLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull SurfaceView surfaceView, @NonNull ImageView imageView, @NonNull AnimView animView, @NonNull VMaskBinding vMaskBinding, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.i = frameLayout;
        this.f2210j = surfaceView;
        this.k = imageView;
        this.f2211l = animView;
        this.m = vMaskBinding;
        this.f2212n = frameLayout2;
        this.o = textView;
    }

    @NonNull
    public static SfxLayoutBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.background_video;
        SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, i);
        if (surfaceView != null) {
            i = R$id.cover_img_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R$id.foreground_video;
                AnimView animView = (AnimView) ViewBindings.findChildViewById(view, i);
                if (animView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.mask))) != null) {
                    VMaskBinding vMaskBindingA = VMaskBinding.a(viewFindChildViewById);
                    i = R$id.replay_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R$id.replay_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new SfxLayoutBinding((FrameLayout) view, surfaceView, imageView, animView, vMaskBindingA, frameLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SfxLayoutBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static SfxLayoutBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.sfx_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.i;
    }
}
