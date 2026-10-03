package com.sensorsdata.analytics.android.autotrack.core.impl;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataIgnoreTrackAppViewScreen;
import com.sensorsdata.analytics.android.sdk.SensorsDataIgnoreTrackAppViewScreenAndAppClick;
import com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes10.dex */
public class FragmentAPI implements IFragmentAPI {
    private static final String TAG = "FragmentAPI";
    private Set<Integer> mAutoTrackFragments;
    private Set<Integer> mAutoTrackIgnoredFragments;
    private boolean mTrackFragmentAppViewScreen;

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void enableAutoTrackFragment(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            if (this.mAutoTrackFragments == null) {
                this.mAutoTrackFragments = new CopyOnWriteArraySet();
            }
            String canonicalName = cls.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName)) {
                return;
            }
            this.mAutoTrackFragments.add(Integer.valueOf(canonicalName.hashCode()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void enableAutoTrackFragments(List<Class<?>> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.mAutoTrackFragments == null) {
            this.mAutoTrackFragments = new CopyOnWriteArraySet();
        }
        try {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                String canonicalName = it.next().getCanonicalName();
                if (!TextUtils.isEmpty(canonicalName)) {
                    this.mAutoTrackFragments.add(Integer.valueOf(canonicalName.hashCode()));
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void ignoreAutoTrackFragment(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            if (this.mAutoTrackIgnoredFragments == null) {
                this.mAutoTrackIgnoredFragments = new CopyOnWriteArraySet();
            }
            String canonicalName = cls.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName)) {
                return;
            }
            this.mAutoTrackIgnoredFragments.add(Integer.valueOf(canonicalName.hashCode()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void ignoreAutoTrackFragments(List<Class<?>> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                if (this.mAutoTrackIgnoredFragments == null) {
                    this.mAutoTrackIgnoredFragments = new CopyOnWriteArraySet();
                }
                for (Class<?> cls : list) {
                    if (cls != null) {
                        String canonicalName = cls.getCanonicalName();
                        if (!TextUtils.isEmpty(canonicalName)) {
                            this.mAutoTrackIgnoredFragments.add(Integer.valueOf(canonicalName.hashCode()));
                        }
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public boolean isFragmentAutoTrackAppViewScreen(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        try {
            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN) && this.mTrackFragmentAppViewScreen) {
                Set<Integer> set = this.mAutoTrackFragments;
                if (set != null && set.size() > 0) {
                    String canonicalName = cls.getCanonicalName();
                    if (!TextUtils.isEmpty(canonicalName)) {
                        return this.mAutoTrackFragments.contains(Integer.valueOf(canonicalName.hashCode()));
                    }
                }
                if (cls.getAnnotation(SensorsDataIgnoreTrackAppViewScreen.class) != null || cls.getAnnotation(SensorsDataIgnoreTrackAppViewScreenAndAppClick.class) != null) {
                    return false;
                }
                Set<Integer> set2 = this.mAutoTrackIgnoredFragments;
                if (set2 != null && set2.size() > 0) {
                    String canonicalName2 = cls.getCanonicalName();
                    if (!TextUtils.isEmpty(canonicalName2)) {
                        return !this.mAutoTrackIgnoredFragments.contains(Integer.valueOf(canonicalName2.hashCode()));
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public boolean isTrackFragmentAppViewScreenEnabled() {
        return this.mTrackFragmentAppViewScreen;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void resumeIgnoredAutoTrackFragment(Class<?> cls) {
        if (cls != null) {
            try {
                if (this.mAutoTrackIgnoredFragments == null) {
                    return;
                }
                String canonicalName = cls.getCanonicalName();
                if (TextUtils.isEmpty(canonicalName)) {
                    return;
                }
                this.mAutoTrackIgnoredFragments.remove(Integer.valueOf(canonicalName.hashCode()));
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void resumeIgnoredAutoTrackFragments(List<Class<?>> list) {
        if (list != null) {
            try {
                if (list.size() != 0 && this.mAutoTrackIgnoredFragments != null) {
                    for (Class<?> cls : list) {
                        if (cls != null) {
                            String canonicalName = cls.getCanonicalName();
                            if (TextUtils.isEmpty(canonicalName)) {
                                continue;
                            } else {
                                this.mAutoTrackIgnoredFragments.remove(Integer.valueOf(canonicalName.hashCode()));
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void trackFragmentAppViewScreen() {
        this.mTrackFragmentAppViewScreen = true;
    }
}
