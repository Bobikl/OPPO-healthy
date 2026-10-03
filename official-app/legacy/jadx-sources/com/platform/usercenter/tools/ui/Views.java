package com.platform.usercenter.tools.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.platform.usercenter.tools.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class Views {
    private Views() {
    }

    public static <T extends View> T findViewById(Activity activity, int i) {
        return (T) Preconditions.checkNotNull(activity.findViewById(i));
    }

    public static <T extends View> T getChildAt(ViewGroup viewGroup, int i) {
        return (T) Preconditions.checkNotNull(viewGroup.getChildAt(i));
    }

    public static void setViewClickListener(Activity activity, int i, View.OnClickListener onClickListener) {
        findViewById(activity, i).setOnClickListener(onClickListener);
    }

    public static void setViewVisibility(Activity activity, int i, int i2) {
        findViewById(activity, i).setVisibility(i2);
    }

    public static <T extends View> T findViewById(View view, int i) {
        return (T) Preconditions.checkNotNull(view.findViewById(i));
    }

    public static void setViewClickListener(Activity activity, Map<Integer, View.OnClickListener> map) {
        for (Map.Entry<Integer, View.OnClickListener> entry : map.entrySet()) {
            setViewClickListener(activity, entry.getKey().intValue(), entry.getValue());
        }
    }

    public static void setViewVisibility(View view, int i, int i2) {
        findViewById(view, i).setVisibility(i2);
    }

    public static void setViewClickListener(View view, int i, View.OnClickListener onClickListener) {
        findViewById(view, i).setOnClickListener(onClickListener);
    }

    public static void setViewClickListener(View.OnClickListener onClickListener, View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void setViewClickListener(View view, Map<Integer, View.OnClickListener> map) {
        for (Map.Entry<Integer, View.OnClickListener> entry : map.entrySet()) {
            setViewClickListener(view, entry.getKey().intValue(), entry.getValue());
        }
    }
}
