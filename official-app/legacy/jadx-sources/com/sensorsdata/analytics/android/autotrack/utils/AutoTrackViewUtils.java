package com.sensorsdata.analytics.android.autotrack.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TabHost;
import com.google.android.material.tabs.TabLayout;
import com.sensorsdata.analytics.android.autotrack.core.beans.ViewContext;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import com.sensorsdata.analytics.android.sdk.util.SAFragmentUtils;
import com.sensorsdata.analytics.android.sdk.util.SAViewUtils;
import com.sensorsdata.analytics.android.sdk.util.WindowHelper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AutoTrackViewUtils {
    /* JADX WARN: Multi-variable type inference failed */
    private static View findTabLayout(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ("ViewPager".equals(childAt.getClass().getSimpleName())) {
                    View viewFindTabLayoutView = findTabLayoutView(childAt);
                    if (viewFindTabLayoutView == null) {
                        break;
                    }
                    return viewFindTabLayoutView;
                }
                i++;
            }
        }
        if (parent.getParent() == null) {
            return null;
        }
        return findTabLayout((View) parent);
    }

    private static View findTabLayoutView(View view) {
        List list = (List) ReflectUtil.findField(view.getClass(), view, "mOnPageChangeListeners");
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (Object obj : list) {
            WeakReference weakReference = (WeakReference) ReflectUtil.findField(obj.getClass(), obj, "tabLayoutRef");
            if (weakReference != null && weakReference.get() != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private static View getAndroidXTabLayout(Object obj) {
        try {
            int i = TabLayout.MODE_SCROLLABLE;
            if (SAViewUtils.isViewIgnored((Class<?>) TabLayout.class) || !ReflectUtil.isInstance(obj, "com.google.android.material.tabs.TabLayout$Tab")) {
                return null;
            }
            View view = (View) ReflectUtil.findField(new String[]{"com.google.android.material.tabs.TabLayout$Tab"}, obj, "parent");
            if (view != null) {
                try {
                    if (ReflectUtil.isInstance(view, "com.google.android.material.tabs.TabLayout") && SAViewUtils.isViewIgnored(view)) {
                        return null;
                    }
                } catch (Exception unused) {
                }
            }
            return view;
        } catch (Exception unused2) {
            return null;
        }
    }

    private static View getSupportTabLayout(Object obj) {
        try {
            if (SAViewUtils.isViewIgnored(Class.forName("android.support.design.widget.TabLayout")) || !ReflectUtil.isInstance(obj, "android.support.design.widget.TabLayout$Tab")) {
                return null;
            }
            View view = (View) ReflectUtil.findField(new String[]{"android.support.design.widget.TabLayout$Tab"}, obj, "mParent", "parent");
            if (view != null) {
                try {
                    if (ReflectUtil.isInstance(view, "android.support.design.widget.TabLayout") && SAViewUtils.isViewIgnored(view)) {
                        return null;
                    }
                } catch (Exception unused) {
                }
            }
            return view;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static View getTabLayout(Object obj) {
        View androidXTabLayout = getAndroidXTabLayout(obj);
        return androidXTabLayout == null ? getSupportTabLayout(obj) : androidXTabLayout;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:3:0x0001, B:5:0x0005, B:22:0x004b, B:24:0x0055, B:27:0x005d, B:28:0x0061, B:7:0x000d, B:9:0x0019, B:11:0x0027, B:12:0x002b, B:15:0x0033, B:17:0x0037, B:18:0x0042), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:3:0x0001, B:5:0x0005, B:22:0x004b, B:24:0x0055, B:27:0x005d, B:28:0x0061, B:7:0x000d, B:9:0x0019, B:11:0x0027, B:12:0x002b, B:15:0x0033, B:17:0x0037, B:18:0x0042), top: B:33:0x0001 }] */
    public static ViewContext getTabLayoutContext(Object obj, View view) {
        Activity activityOfView;
        Object fragmentFromView;
        try {
            if (!(obj instanceof Context)) {
                Field[] declaredFields = obj.getClass().getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        activityOfView = null;
                        fragmentFromView = null;
                        break;
                    }
                    Field field = declaredFields[i];
                    field.setAccessible(true);
                    fragmentFromView = field.get(obj);
                    if (fragmentFromView instanceof Activity) {
                        activityOfView = (Activity) fragmentFromView;
                    } else {
                        if (SAFragmentUtils.isFragment(fragmentFromView)) {
                            activityOfView = null;
                            break;
                        }
                        if (fragmentFromView instanceof View) {
                            activityOfView = SAViewUtils.getActivityOfView(((View) fragmentFromView).getContext(), null);
                        } else {
                            i++;
                        }
                    }
                }
                if (view != null) {
                    if (activityOfView == null) {
                        activityOfView = SAViewUtils.getActivityOfView(view.getContext(), null);
                    }
                    if (fragmentFromView == null) {
                        fragmentFromView = SAFragmentUtils.getFragmentFromView(view, activityOfView);
                    }
                }
                if (activityOfView == null && fragmentFromView != null) {
                    activityOfView = SAFragmentUtils.getActivityFromFragment(fragmentFromView);
                }
                return new ViewContext(activityOfView, fragmentFromView, view);
            }
            activityOfView = SAViewUtils.getActivityOfView((Context) obj, null);
            fragmentFromView = null;
            if (view != null) {
                if (activityOfView == null) {
                    activityOfView = SAViewUtils.getActivityOfView(view.getContext(), null);
                }
                if (fragmentFromView == null) {
                    fragmentFromView = SAFragmentUtils.getFragmentFromView(view, activityOfView);
                }
            }
            if (activityOfView == null) {
                activityOfView = SAFragmentUtils.getActivityFromFragment(fragmentFromView);
            }
            return new ViewContext(activityOfView, fragmentFromView, view);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public static String getTabLayoutText(View view, Object obj) {
        Object objCallMethod;
        String viewContent = null;
        if (view != null) {
            try {
                if (view instanceof ViewGroup) {
                    viewContent = SAViewUtils.traverseView(new StringBuilder(), (ViewGroup) view);
                    if (!TextUtils.isEmpty(viewContent)) {
                        viewContent = viewContent.substring(0, viewContent.length() - 1);
                    }
                } else {
                    viewContent = SAViewUtils.getViewContent(view);
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
        return (!TextUtils.isEmpty(viewContent) || (objCallMethod = ReflectUtil.callMethod(obj, "getText", new Object[0])) == null) ? viewContent : objCallMethod.toString();
    }

    public static View getTabView(String str) {
        View clickView = WindowHelper.getClickView(str);
        if (clickView != null) {
            View view = clickView;
            View view2 = null;
            while (view2 == null && view != null && view.getParent() != null) {
                view = (View) view.getParent();
                if (view instanceof TabHost) {
                    view2 = view;
                }
            }
            if (view2 != null && SAViewUtils.isViewIgnored(view2)) {
                return null;
            }
        }
        return clickView;
    }

    public static boolean isBindViewPager(View view) {
        if (view == null) {
            return false;
        }
        return ((View) ReflectUtil.findField(view.getClass(), view, "viewPager")) != null || view == findTabLayout(view);
    }
}
