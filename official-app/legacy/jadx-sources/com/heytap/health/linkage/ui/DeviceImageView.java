package com.heytap.health.linkage.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.content.ContextCompat;
import com.heytap.health.linkage.R$layout;
import com.heytap.health.ui.R$color;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.j4h;
import com.oplus.aiunit.vision.oak;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.ut5;
import com.oplus.aiunit.vision.wek;
import com.oplus.aiunit.vision.zqf;
import com.oplusos.vfxmodelviewer.view.ModelScene;
import com.oplusos.vfxmodelviewer.view.ModelViewer;
import com.support.appcompat.R$style;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceImageView extends ConstraintLayout {
    public static final String TAG = "LA.DeviceImageView";
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f4911j;
    public ModelViewer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ModelScene f4912l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4913n;
    public int o;
    public float p;
    public float q;

    public class a extends j4h<Bitmap> {
        public final /* synthetic */ String i;

        public a(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
        public void onLoadFailed(@Nullable Drawable drawable) {
            super.onLoadFailed(drawable);
            try {
                DeviceImageView.this.removeAllViews();
                DeviceImageView.this.f4911j.setImageDrawable(drawable);
                DeviceImageView deviceImageView = DeviceImageView.this;
                deviceImageView.addView(deviceImageView.f4911j);
                String str = this.i;
                if (str != null) {
                    DeviceImageView.this.p(str);
                }
            } catch (Exception e2) {
                a7b.b(DeviceImageView.TAG, "load2DUrl onLoadFailed error:" + e2.getMessage());
            }
        }

        @Override // com.oplus.aiunit.vision.boj
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable oak oakVar) {
            onResourceReady((Bitmap) obj, (oak<? super Bitmap>) oakVar);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable oak<? super Bitmap> oakVar) {
            try {
                DeviceImageView.this.removeAllViews();
                DeviceImageView.this.f4911j.setImageBitmap(bitmap);
                DeviceImageView deviceImageView = DeviceImageView.this;
                deviceImageView.addView(deviceImageView.f4911j);
                String str = this.i;
                if (str != null) {
                    DeviceImageView.this.p(str);
                }
            } catch (Exception e2) {
                a7b.b(DeviceImageView.TAG, "load2DUrl onResourceReady error:" + e2.getMessage());
            }
        }
    }

    public DeviceImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str, String str2) {
        try {
            this.f4912l.loadSceneFromFile(str);
            this.f4912l.setAAType(ModelScene.AAType.MSAA);
            float fJ = j(this.f4913n);
            if (str2 == null) {
                int i = this.o;
                this.m = i;
                requestLayout();
                fJ = i;
            }
            int i2 = (int) fJ;
            this.f4912l.setViewSize(i2, i2);
            this.f4912l.setOpaque(false);
            this.f4912l.setSkyboxColorGammaCorrect(0.0f, 0.0f, 0.0f, 0.0f);
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(i2, i2);
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            View creatTextureView = this.f4912l.getCreatTextureView(getContext());
            if (str2 != null) {
                this.f4912l.setModelScale(1.3f);
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                p(str2);
            }
            creatTextureView.setLayoutParams(layoutParams);
            addView(creatTextureView);
        } catch (Exception e2) {
            a7b.b(TAG, "load3DUrl error " + e2.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        super.addView(view);
    }

    public final void h(Context context) {
        LayoutInflater.from(context).inflate(R$layout.view_device_loading, (ViewGroup) this, true);
    }

    public Pair<Integer, Integer> i(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) j(this.m), 1073741824);
        if (!wek.a(this.i)) {
            i = iMakeMeasureSpec;
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(iMakeMeasureSpec));
    }

    public final float j(int i) {
        float f;
        float f2;
        boolean z = getResources().getConfiguration().orientation == 2;
        if (!(!wek.a(this.i))) {
            return i;
        }
        if (z) {
            f = i;
            f2 = this.p;
        } else {
            f = i;
            f2 = this.q;
        }
        return f * f2;
    }

    public void l(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("load2DUrl: ");
        sb.append(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f4911j == null) {
            ImageView imageView = new ImageView(this.i);
            this.f4911j = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f4911j.setAdjustViewBounds(true);
            int iJ = (int) j(this.o);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iJ, iJ);
            layoutParams.startToStart = 0;
            layoutParams.topToTop = 0;
            layoutParams.endToEnd = 0;
            layoutParams.bottomToBottom = 0;
            if (TextUtils.isEmpty(str2)) {
                this.m = this.o;
                requestLayout();
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ejg.a(b78.a(), 26.0f);
                this.m = ejg.a(b78.a(), 200.0f);
                requestLayout();
            }
            this.f4911j.setLayoutParams(layoutParams);
        }
        com.bumptech.glide.a.v(this.i).b().Y0(str).a(new zqf().k().q(i).s(i).j(ut5.RESOURCE)).N0(new a(str2));
    }

    public void m(final String str, final String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("load3DUrl: ");
        sb.append(str);
        removeAllViews();
        this.f4911j = null;
        n();
        ModelViewer modelViewer = new ModelViewer();
        this.k = modelViewer;
        ModelScene scene = modelViewer.getScene(TAG);
        this.f4912l = scene;
        if (scene == null) {
            this.f4912l = this.k.creatScene(TAG);
        }
        post(new Runnable() { // from class: com.oplus.aiunit.vision.bh5
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k(str, str2);
            }
        });
    }

    public void n() {
        ModelViewer modelViewer = this.k;
        if (modelViewer != null) {
            modelViewer.destroy();
        }
    }

    public final void o() {
        ModelScene modelScene = this.f4912l;
        if (modelScene != null) {
            long runningTime = modelScene.getRunningTime();
            StringBuilder sb = new StringBuilder();
            sb.append("report time:");
            sb.append(runningTime);
            com.heytap.health.base.track.a.y().a("pageid", "DeviceImageView_3D").a("duration", Long.valueOf(runningTime)).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
        n();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.k != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Pair<Integer, Integer> pairI = i(i, i2);
        super.onMeasure(((Integer) pairI.first).intValue(), ((Integer) pairI.second).intValue());
    }

    public void onPause() {
        ModelViewer modelViewer = this.k;
        if (modelViewer != null) {
            modelViewer.enable(false);
        }
    }

    public void onResume() {
        ModelViewer modelViewer = this.k;
        if (modelViewer != null) {
            modelViewer.enable(true);
        }
    }

    @SuppressLint({"ResourceAsColor"})
    public final void p(String str) {
        this.m = ejg.a(b78.a(), 200.0f);
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(this.i, R$style.couiTextAppearanceHeadline5);
        textView.setTextColor(ContextCompat.getColor(getContext(), R$color.lib_ui_black));
        textView.setText(str);
        Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        addView(textView, layoutParams);
    }

    public void set2DImgSize(int i) {
        this.o = i;
    }

    public void set3DImgSize(int i) {
        this.f4913n = i;
    }

    public void setImageResource(int i) {
        ImageView imageView = this.f4911j;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setOpenLandScale(float f) {
        this.p = f;
    }

    public void setOpenPortraitScale(float f) {
        this.q = f;
    }

    public void setViewSize(int i) {
        this.m = i;
    }

    public DeviceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeviceImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = ejg.a(b78.a(), 360.0f);
        this.f4913n = ejg.a(b78.a(), 350.0f);
        this.o = ejg.a(b78.a(), 260.0f);
        this.p = 0.8f;
        this.q = 0.7f;
        qe0.G(this, false);
        this.i = context;
        h(context);
    }
}
