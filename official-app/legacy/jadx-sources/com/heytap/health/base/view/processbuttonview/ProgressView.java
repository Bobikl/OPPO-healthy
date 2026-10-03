package com.heytap.health.base.view.processbuttonview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.coui.appcompat.button.COUIButton;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.task.ThreadUtils;

/* JADX INFO: loaded from: classes15.dex */
public class ProgressView extends FrameLayout {
    public TextProgressButton i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIButton f3326j;

    public ProgressView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, float f) {
        this.f3326j.setText(str);
        this.i.z(str, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        if (i == 0) {
            this.i.setVisibility(8);
            this.f3326j.setVisibility(0);
        } else {
            this.i.setVisibility(0);
            this.f3326j.setVisibility(4);
        }
        this.i.setState(i);
    }

    public void e(final String str, final float f) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.sye
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c(str, f);
            }
        });
    }

    public COUIButton getNormalButton() {
        return this.f3326j;
    }

    public TextProgressButton getProgressView() {
        return this.i;
    }

    public int getState() {
        return this.i.getState();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setCompleteText(String str) {
        e(str, 100.0f);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f3326j.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f3326j.setOnClickListener(onClickListener);
    }

    public void setState(final int i) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.tye
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d(i);
            }
        });
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R$layout.lib_base_progress_button_view, this);
        this.i = (TextProgressButton) findViewById(R$id.txt_progress);
        this.f3326j = (COUIButton) findViewById(R$id.btn_progress);
    }
}
