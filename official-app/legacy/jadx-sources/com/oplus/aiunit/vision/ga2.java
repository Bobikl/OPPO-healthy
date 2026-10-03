package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$layout;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes19.dex */
public class ga2 {
    public static View a(Activity activity, int i, String str, String str2, int i2, int i3, boolean z, boolean z2, View.OnClickListener onClickListener) {
        View viewInflate = LayoutInflater.from(activity).inflate(R$layout.layout_bus_pre_open_item, (ViewGroup) null, false);
        viewInflate.setId(i);
        viewInflate.setOnClickListener(onClickListener);
        TextView textView = (TextView) viewInflate.findViewById(R$id.name);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.content);
        textView.setText(str);
        if (z) {
            h0l.a(textView2, 0, 0, R$drawable.gray_arrow, 0);
        }
        if (!TextUtils.isEmpty(str2)) {
            textView2.setText(str2);
        }
        if (i2 > 0) {
            textView.setTextColor(ContextCompat.getColor(activity, i2));
        }
        if (i3 > 0) {
            textView2.setTextColor(ContextCompat.getColor(activity, i3));
        }
        viewInflate.findViewById(R$id.bottom_line).setVisibility(z2 ? 0 : 8);
        if (onClickListener != null) {
            viewInflate.setOnClickListener(onClickListener);
        }
        return viewInflate;
    }

    public static int b(String str) {
        if ("SUC".equalsIgnoreCase(str)) {
            return R$string.card_status_success;
        }
        if (d04.CARD_STATUS_OPENING.equalsIgnoreCase(str)) {
            return R$string.card_status_paid;
        }
        if (d04.CARD_STATUS_ALLOW_OPEN.equalsIgnoreCase(str)) {
            return R$string.card_status_none;
        }
        if (d04.CARD_STATUS_PUTTING_ON_SHELVES.equalsIgnoreCase(str)) {
            return R$string.card_status_putting;
        }
        if ("MAINTAINING".equalsIgnoreCase(str)) {
            return R$string.card_status_maintaining;
        }
        if (d04.CARD_STATUS_OPENING_OFF_SHELVES.equalsIgnoreCase(str)) {
            return R$string.card_status_paidandoffshelves;
        }
        if (d04.CARD_STATUS_OPENING_MAINTAINING.equalsIgnoreCase(str)) {
            return R$string.card_status_paidandmaintaining;
        }
        if (!d04.CARD_STATUS_SHIFT_OUTING.equalsIgnoreCase(str) && !d04.CARD_STATUS_SHIFT_INING.equalsIgnoreCase(str)) {
            if (d04.CARD_STATUS_SHIFT_IN.equalsIgnoreCase(str)) {
                return R$string.card_status_none;
            }
            if (!d04.CARD_STATUS_DELETING.equalsIgnoreCase(str) && !d04.CARD_STATUS_THIRD_DELETING.equalsIgnoreCase(str)) {
                return R$string.card_status_none;
            }
            return R$string.card_del_continue;
        }
        return R$string.continue_available_status;
    }
}
