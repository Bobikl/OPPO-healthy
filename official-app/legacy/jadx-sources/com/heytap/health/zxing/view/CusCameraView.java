package com.heytap.health.zxing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.heytap.health.zxing.R$drawable;
import com.heytap.health.zxing.R$id;
import com.heytap.health.zxing.R$layout;
import com.oplus.aiunit.vision.cx9;

/* JADX INFO: loaded from: classes19.dex */
public class CusCameraView extends BaseCameraView {
    public ScanBoxView p;
    public Button q;
    public TextView r;
    public View s;
    public ImageView t;
    public Observer<Boolean> u;

    public CusCameraView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        Boolean value = this.f7231l.d().getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        this.f7231l.enableTorch(!value.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Boolean bool) {
        this.t.setImageResource(bool.booleanValue() ? R$drawable.lib_zxing_ic_open_light : R$drawable.lib_zxing_ic_close_light);
    }

    public LiveData<Boolean> B() {
        return this.f7231l.d();
    }

    public Button getBtBottomView() {
        return this.q;
    }

    public int getLayoutId() {
        return R$layout.lib_core_scanview;
    }

    public View getLightView() {
        return this.t;
    }

    public View getPhotoView() {
        return this.s;
    }

    public TextView getTvTip() {
        return this.r;
    }

    @Override // com.heytap.health.zxing.view.BaseCameraView
    public void k(Context context) {
        LayoutInflater.from(context).inflate(getLayoutId(), (ViewGroup) this, true);
        this.p = (ScanBoxView) findViewById(R$id.scanbox);
        ImageView imageView = (ImageView) findViewById(R$id.iv_open_light);
        this.t = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ef4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.C(view);
            }
        });
        if (this.u == null) {
            this.u = new Observer() { // from class: com.oplus.aiunit.vision.ff4
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.D((Boolean) obj);
                }
            };
        }
        this.f7231l.d().observeForever(this.u);
        this.q = (Button) findViewById(R$id.status_view);
        this.r = (TextView) findViewById(R$id.scan_tip);
        this.s = findViewById(R$id.iv_scan_photo);
    }

    @Override // com.heytap.health.zxing.view.BaseCameraView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.u != null) {
            this.f7231l.d().removeObserver(this.u);
        }
    }

    @Override // com.heytap.health.zxing.view.BaseCameraView
    public cx9 w() {
        return this.p;
    }

    public CusCameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CusCameraView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
