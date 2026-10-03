package com.customer.feedback.sdk;

import com.customer.feedback.sdk.util.LogUtil;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackThirdWebManager {
    private static final String TAG = "FeedbackThirdWebManager";
    private static volatile FeedbackThirdWebManager sInstance;
    private Class mTargetClass;

    public static FeedbackThirdWebManager getInstance() {
        if (sInstance == null) {
            synchronized (FeedbackThirdWebManager.class) {
                if (sInstance == null) {
                    sInstance = new FeedbackThirdWebManager();
                }
            }
        }
        return sInstance;
    }

    public String getThirdWebInterfaceName() {
        Class cls = this.mTargetClass;
        if (cls != null) {
            try {
                Object objInvoke = cls.getMethod("getInterfaceName", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke != null) {
                    return objInvoke.toString();
                }
            } catch (IllegalAccessException e2) {
                LogUtil.e(TAG, "IllegalAccessException in getThirdWebInterfaceName:" + e2.getMessage());
            } catch (NoSuchMethodException e3) {
                LogUtil.e(TAG, "NoSuchMethodException in getThirdWebInterfaceName:" + e3.getMessage());
            } catch (InvocationTargetException e4) {
                LogUtil.e(TAG, "InvocationTargetException in getThirdWebInterfaceName:" + e4.getMessage());
            }
        }
        return "feedbackInterface";
    }

    public String invoke(String str) {
        Class cls = this.mTargetClass;
        if (cls != null) {
            try {
                Object objInvoke = cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
                if (objInvoke != null) {
                    return objInvoke.toString();
                }
            } catch (IllegalAccessException e2) {
                LogUtil.e(TAG, "IllegalAccessException in invoke:" + e2.getMessage());
            } catch (NoSuchMethodException e3) {
                LogUtil.e(TAG, "NoSuchMethodException in invoke:" + e3.getMessage());
            } catch (InvocationTargetException e4) {
                LogUtil.e(TAG, "InvocationTargetException in invoke:" + e4.getMessage());
            }
        }
        return "";
    }

    public String invokeWithParams(String str, String str2) {
        Class cls = this.mTargetClass;
        if (cls != null) {
            try {
                Object objInvoke = cls.getMethod(str, String.class).invoke(null, str2);
                if (objInvoke != null) {
                    return objInvoke.toString();
                }
            } catch (IllegalAccessException e2) {
                LogUtil.e(TAG, "IllegalAccessException in invokeWithParams:" + e2.getMessage());
            } catch (NoSuchMethodException e3) {
                LogUtil.e(TAG, "NoSuchMethodException in invokeWithParams:" + e3.getMessage());
            } catch (InvocationTargetException e4) {
                LogUtil.e(TAG, "InvocationTargetException in invokeWithParams:" + e4.getMessage());
            }
        }
        return "";
    }

    public <T> void setTargetClass(Class<T> cls) {
        this.mTargetClass = cls;
    }
}
