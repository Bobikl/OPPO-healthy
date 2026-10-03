package com.heytap.nearx.uikit.widget.keyboard.util;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class NearViewCompat {
    static final ViewCompatImpl IMPL = new JbMr1ViewCompatImpl();

    public static class BaseViewCompatImpl implements ViewCompatImpl {
        @Override // com.heytap.nearx.uikit.widget.keyboard.util.NearViewCompat.ViewCompatImpl
        @SuppressLint({"NewApi"})
        public int getRawLayoutDirection(View view) {
            return view.getLayoutDirection();
        }
    }

    public static class JBViewCompatImpl extends BaseViewCompatImpl {
    }

    public static class JbMr1ViewCompatImpl extends JBViewCompatImpl {
        @Override // com.heytap.nearx.uikit.widget.keyboard.util.NearViewCompat.BaseViewCompatImpl, com.heytap.nearx.uikit.widget.keyboard.util.NearViewCompat.ViewCompatImpl
        public int getRawLayoutDirection(View view) {
            return 2;
        }
    }

    public interface ViewCompatImpl {
        int getRawLayoutDirection(View view);
    }

    public static int getRawLayoutDirection(View view) {
        return IMPL.getRawLayoutDirection(view);
    }
}
