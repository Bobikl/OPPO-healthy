package com.sensorsdata.analytics.android.sdk.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.sensorsdata.analytics.android.sdk.R;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class SAFragmentUtils {

    @SuppressLint({"NewApi"})
    private static LruCache<String, WeakReference<Object>> sFragmentLruCache = new LruCache<>(Integer.MAX_VALUE);

    public static boolean fragmentGetUserVisibleHint(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("getUserVisibleHint", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean fragmentIsHidden(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isHidden", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean fragmentIsResumed(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isResumed", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static Activity getActivityFromFragment(Object obj) {
        try {
            return (Activity) obj.getClass().getMethod("getActivity", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getFragmentFromCache(String str) {
        Object obj;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            WeakReference<Object> weakReference = sFragmentLruCache.get(str);
            if (weakReference != null && (obj = weakReference.get()) != null) {
                return obj;
            }
            Object objNewInstance = Class.forName(str).newInstance();
            sFragmentLruCache.put(str, new WeakReference<>(objNewInstance));
            return objNewInstance;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public static Object getFragmentFromView(View view) {
        return getFragmentFromView(view, null);
    }

    public static boolean isFragment(Object obj) {
        Class<?> cls;
        Class<Fragment> cls2;
        if (obj == null) {
            return false;
        }
        Class cls3 = null;
        try {
            cls = Class.forName(Consts.FRAGMENT);
        } catch (Exception unused) {
            cls = null;
        }
        try {
            cls2 = Fragment.class;
            int i = Fragment.f169j;
        } catch (Exception unused2) {
            cls2 = null;
        }
        try {
            int i2 = androidx.fragment.app.Fragment.i;
            cls3 = androidx.fragment.app.Fragment.class;
        } catch (Exception unused3) {
        }
        if (cls2 == null && cls3 == null && cls == null) {
            return false;
        }
        if (cls2 != null) {
            try {
                if (cls2.isInstance(obj)) {
                    return true;
                }
                if (cls3 == null && cls3.isInstance(obj)) {
                    return true;
                }
                if (cls == null && cls.isInstance(obj)) {
                    return true;
                }
            } catch (Exception unused4) {
            }
        } else {
            if (cls3 == null) {
            }
            if (cls == null) {
            }
        }
        return false;
    }

    public static boolean isFragmentVisible(Object obj) {
        Object objInvoke;
        try {
            objInvoke = obj.getClass().getMethod("getParentFragment", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            objInvoke = null;
        }
        try {
            if (objInvoke == null) {
                if (!fragmentIsHidden(obj) && fragmentGetUserVisibleHint(obj) && fragmentIsResumed(obj)) {
                    return true;
                }
            } else if (!fragmentIsHidden(obj) && fragmentGetUserVisibleHint(obj) && fragmentIsResumed(obj) && !fragmentIsHidden(objInvoke) && fragmentGetUserVisibleHint(objInvoke) && fragmentIsResumed(objInvoke)) {
                return true;
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
        return false;
    }

    public static void setFragmentToCache(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        sFragmentLruCache.put(str, new WeakReference<>(obj));
    }

    private static String traverseParentViewTag(View view) {
        try {
            String str = null;
            for (ViewParent parent = view.getParent(); TextUtils.isEmpty(str) && (parent instanceof View); parent = parent.getParent()) {
                str = (String) ((View) parent).getTag(R.id.sensors_analytics_tag_view_fragment_name);
            }
            return str;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public static Object getFragmentFromView(View view, Activity activity) {
        Window window;
        if (view == null) {
            return null;
        }
        try {
            int i = R.id.sensors_analytics_tag_view_fragment_name;
            String strTraverseParentViewTag = (String) view.getTag(i);
            String str = (String) view.getTag(R.id.sensors_analytics_tag_view_fragment_name2);
            if (!TextUtils.isEmpty(str)) {
                strTraverseParentViewTag = str;
            }
            if (TextUtils.isEmpty(strTraverseParentViewTag)) {
                if (activity == null) {
                    activity = SAViewUtils.getActivityOfView(view.getContext(), view);
                }
                if (activity != null && (window = activity.getWindow()) != null && window.isActive() && window.getDecorView().getRootView().getTag(i) != null) {
                    strTraverseParentViewTag = traverseParentViewTag(view);
                }
            }
            return getFragmentFromCache(strTraverseParentViewTag);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }
}
