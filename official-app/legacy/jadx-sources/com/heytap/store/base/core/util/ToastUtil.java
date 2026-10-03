package com.heytap.store.base.core.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.UiThread;
import com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager;
import com.heytap.store.platform.tools.LogUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class ToastUtil {
    private static final String TAG = "ToastUtil";
    private static long mCurrentTime;
    private static Toast mToast;
    private static Field sField_TN;
    private static Field sField_TN_Handler;

    public static class SafelyHandlerWarpper extends Handler {
        private Handler impl;

        public SafelyHandlerWarpper(Handler handler) {
            this.impl = handler;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception unused) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.impl.handleMessage(message);
        }
    }

    public static boolean canShowToast(Activity activity) {
        return (ActivityCollectionManager.INSTANCE.getInstance().getIsRunInBackground() || activity == null || activity.isDestroyed()) ? false : true;
    }

    public static void cancel() {
        Toast toast = mToast;
        if (toast != null) {
            toast.cancel();
        }
    }

    @UiThread
    public static void centerShow(Context context, int i) {
        centerShow(context, context.getString(i));
    }

    private static void hook(Toast toast) {
        try {
            Object obj = sField_TN.get(toast);
            sField_TN_Handler.set(obj, new SafelyHandlerWarpper((Handler) sField_TN_Handler.get(obj)));
        } catch (Exception unused) {
        }
    }

    private static void setHook(Toast toast) {
    }

    public static void show(Context context, String str) {
        if (TextUtils.isEmpty(str) || System.currentTimeMillis() - mCurrentTime < 2100) {
            Toast toast = mToast;
            if (toast == null || toast.getView() == null) {
                mToast.setText(str);
                return;
            }
            TextView textView = (TextView) mToast.getView().findViewById(R.id.message);
            if (textView != null) {
                textView.setText(str);
                return;
            } else {
                mToast.setText(str);
                return;
            }
        }
        Toast toast2 = mToast;
        if (toast2 != null) {
            toast2.cancel();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Toast toastMakeText = Toast.makeText(context.getApplicationContext(), str, 0);
            mToast = toastMakeText;
            setHook(toastMakeText);
            mToast.show();
        } else {
            try {
                Looper.prepare();
                Toast toastMakeText2 = Toast.makeText(context.getApplicationContext(), str, 0);
                mToast = toastMakeText2;
                setHook(toastMakeText2);
                mToast.show();
                Looper.loop();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        mCurrentTime = System.currentTimeMillis();
    }

    public static boolean showToastSafely(Activity activity, String str) {
        if (canShowToast(activity)) {
            show(activity, str);
            return true;
        }
        LogUtils.INSTANCE.w("", "show toast failed, toast = " + str);
        return false;
    }

    @UiThread
    public static void centerShow(Context context, String str) {
        TextView textView;
        if (TextUtils.isEmpty(str) || System.currentTimeMillis() - mCurrentTime < 2100) {
            Toast toast = mToast;
            if (toast == null || toast.getView() == null) {
                mToast.setText(str);
                return;
            }
            TextView textView2 = (TextView) mToast.getView().findViewById(R.id.message);
            if (textView2 != null) {
                textView2.setText(str);
                return;
            }
            return;
        }
        Toast toast2 = mToast;
        if (toast2 != null) {
            toast2.cancel();
        }
        Toast toastMakeText = Toast.makeText(context.getApplicationContext(), str, 0);
        mToast = toastMakeText;
        setHook(toastMakeText);
        mToast.setGravity(17, 0, 0);
        mToast.getView().setBackgroundColor(0);
        if (mToast.getView() != null && (textView = (TextView) mToast.getView().findViewById(R.id.message)) != null) {
            textView.setTextColor(-1);
            textView.setTextSize(1, 20.0f);
        }
        mToast.show();
        mCurrentTime = System.currentTimeMillis();
    }

    public static void show(Context context, int i) {
        if (context == null) {
            LogUtils.INSTANCE.e(ToastUtil.class.getSimpleName(), "传入的Context为null !!!");
        } else {
            show(context, context.getString(i));
        }
    }
}
