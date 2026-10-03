package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.heytap.health.bodyfat.R$drawable;
import com.heytap.health.bodyfat.R$plurals;
import com.heytap.health.health_base.R$color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class c12 {
    public static String a(float f, float f2) {
        return new DecimalFormat(".00").format(f / (f2 * f2));
    }

    public static void b(TextView textView, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !(str.equals("理想") || str.equals("标准"))) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.health_base_F27141));
            if (z) {
                textView.setBackgroundResource(R$drawable.health_body_fat_bg_round_4dp_lable_exception);
                return;
            }
            return;
        }
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.health_base_2AD181));
        if (z) {
            textView.setBackgroundResource(R$drawable.health_body_fat_bg_round_4dp_lable_normal);
        }
    }

    public static float c(float f, int i) {
        if (i != 1) {
            return i != 2 ? f : (float) (((double) f) / 2.2046226d);
        }
        return f / 2.0f;
    }

    public static float d(float f, float f2, int i, int i2) {
        return Math.max(0.0f, i(f2, i, i2) - i(f, i, i2));
    }

    public static String e(float f, int i) {
        int iMax = Math.max(0, i);
        return String.format(Locale.getDefault(), f(iMax), new BigDecimal(Float.toString(f)).setScale(iMax, RoundingMode.HALF_UP));
    }

    public static String f(int i) {
        if (i < 0) {
            return "%f";
        }
        return "%." + i + "f";
    }

    public static String g(Context context, int i, int i2, String str) {
        if (i2 == 0) {
            return context.getResources().getQuantityString(R$plurals.health_body_fat_unit_kg_format, i, str);
        }
        if (i2 != 1) {
            return i2 != 2 ? "" : context.getResources().getQuantityString(R$plurals.health_body_fat_unit_lb_format, i, str);
        }
        return context.getResources().getQuantityString(R$plurals.health_body_fat_unit_500g_format, i, str);
    }

    public static float h(float f, int i) {
        if (i != 1) {
            return i != 2 ? f : (float) (((double) f) * 2.2046226d);
        }
        return f * 2.0f;
    }

    public static float i(float f, int i, int i2) {
        return j(h(f, i), i2);
    }

    public static float j(float f, int i) {
        return new BigDecimal(Float.toString(f)).setScale(Math.max(0, i), RoundingMode.HALF_UP).floatValue();
    }
}
