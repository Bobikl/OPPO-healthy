package com.heytap.health.operation.ecg.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.R$string;
import com.heytap.health.ui.R$id;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.oplus.aiunit.vision.zd6;
import com.support.appcompat.R$drawable;

/* JADX INFO: loaded from: classes17.dex */
public class EcgListEmptyLayout extends LinearLayout {
    public EcgListEmptyLayout(Context context) {
        super(context);
        setOrientation(1);
        View.inflate(getContext(), R$layout.ecg_list_empty_layout, this);
        ((TextView) findViewById(R$id.j_multity_empt_msg)).setText(R$string.ecg_have_no_data);
        JViewHolder jViewHolder = new JViewHolder(findViewById(com.heytap.health.operation.R$id.ecg_empty_head));
        zd6 zd6Var = new zd6();
        zd6Var.i = true;
        zd6Var.onBindViewHolder(jViewHolder, 0, null, null);
        setBackgroundResource(R$drawable.coui_window_background_selector);
        setClickable(true);
    }

    public EcgListEmptyLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        View.inflate(getContext(), R$layout.ecg_list_empty_layout, this);
        ((TextView) findViewById(R$id.j_multity_empt_msg)).setText(R$string.ecg_have_no_data);
        JViewHolder jViewHolder = new JViewHolder(findViewById(com.heytap.health.operation.R$id.ecg_empty_head));
        zd6 zd6Var = new zd6();
        zd6Var.i = true;
        zd6Var.onBindViewHolder(jViewHolder, 0, null, null);
        setBackgroundResource(R$drawable.coui_window_background_selector);
        setClickable(true);
    }

    public EcgListEmptyLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        View.inflate(getContext(), R$layout.ecg_list_empty_layout, this);
        ((TextView) findViewById(R$id.j_multity_empt_msg)).setText(R$string.ecg_have_no_data);
        JViewHolder jViewHolder = new JViewHolder(findViewById(com.heytap.health.operation.R$id.ecg_empty_head));
        zd6 zd6Var = new zd6();
        zd6Var.i = true;
        zd6Var.onBindViewHolder(jViewHolder, 0, null, null);
        setBackgroundResource(R$drawable.coui_window_background_selector);
        setClickable(true);
    }
}
