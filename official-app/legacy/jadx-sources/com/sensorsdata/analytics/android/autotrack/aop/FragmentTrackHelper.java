package com.sensorsdata.analytics.android.autotrack.aop;

import android.os.Bundle;
import android.view.View;
import com.sensorsdata.analytics.android.autotrack.core.autotrack.SAFragmentLifecycleCallbacks;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.SAFragmentUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes10.dex */
public class FragmentTrackHelper {
    private static final CopyOnWriteArraySet<SAFragmentLifecycleCallbacks> FRAGMENT_CALLBACKS = new CopyOnWriteArraySet<>();

    public static void addFragmentCallbacks(SAFragmentLifecycleCallbacks sAFragmentLifecycleCallbacks) {
        if (sAFragmentLifecycleCallbacks != null) {
            FRAGMENT_CALLBACKS.add(sAFragmentLifecycleCallbacks);
        }
    }

    public static void onFragmentViewCreated(Object obj, View view, Bundle bundle) {
        if (SAFragmentUtils.isFragment(obj)) {
            Iterator<SAFragmentLifecycleCallbacks> it = FRAGMENT_CALLBACKS.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onViewCreated(obj, view, bundle);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        }
    }

    public static void removeFragmentCallbacks(SAFragmentLifecycleCallbacks sAFragmentLifecycleCallbacks) {
        if (sAFragmentLifecycleCallbacks != null) {
            FRAGMENT_CALLBACKS.remove(sAFragmentLifecycleCallbacks);
        }
    }

    public static void trackFragmentPause(Object obj) {
        if (SAFragmentUtils.isFragment(obj)) {
            Iterator<SAFragmentLifecycleCallbacks> it = FRAGMENT_CALLBACKS.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onPause(obj);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        }
    }

    public static void trackFragmentResume(Object obj) {
        if (SAFragmentUtils.isFragment(obj)) {
            Iterator<SAFragmentLifecycleCallbacks> it = FRAGMENT_CALLBACKS.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onResume(obj);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        }
    }

    public static void trackFragmentSetUserVisibleHint(Object obj, boolean z) {
        if (SAFragmentUtils.isFragment(obj)) {
            Iterator<SAFragmentLifecycleCallbacks> it = FRAGMENT_CALLBACKS.iterator();
            while (it.hasNext()) {
                try {
                    it.next().setUserVisibleHint(obj, z);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        }
    }

    public static void trackOnHiddenChanged(Object obj, boolean z) {
        if (SAFragmentUtils.isFragment(obj)) {
            Iterator<SAFragmentLifecycleCallbacks> it = FRAGMENT_CALLBACKS.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onHiddenChanged(obj, z);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        }
    }
}
