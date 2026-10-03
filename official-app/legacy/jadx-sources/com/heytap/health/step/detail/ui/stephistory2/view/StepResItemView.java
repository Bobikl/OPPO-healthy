package com.heytap.health.step.detail.ui.stephistory2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public class StepResItemView extends ConstraintLayout {
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6021j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f6022l;

    public StepResItemView(@NonNull Context context) {
        super(context);
        e(context, null);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.step_res_detail_item, this);
        this.i = (ImageView) viewInflate.findViewById(R$id.device_img);
        this.f6021j = (TextView) viewInflate.findViewById(R$id.device_name);
        this.k = (TextView) viewInflate.findViewById(R$id.device_desc);
        this.f6022l = (TextView) viewInflate.findViewById(R$id.device_step);
    }

    public StepResItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public StepResItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context, attributeSet);
    }
}
