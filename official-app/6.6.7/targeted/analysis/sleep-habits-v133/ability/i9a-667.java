package com.oplus.aiunit.vision;

import android.app.Application;
import androidx.annotation.CallSuper;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public abstract class i9a {
    public static final int DEFAULT_PRIORITY = 200;
    public static final int PRIORITY_BACKGROUND_10 = 10;
    public static final int PRIORITY_BACKGROUND_20 = 20;
    public static final int PRIORITY_BACKGROUND_30 = 30;
    public static final int PRIORITY_BACKGROUND_BOUNDARY = 100;
    public static final int PRIORITY_BACKGROUND_MAX = 80;
    public static final int PRIORITY_BACKGROUND_URGENT = 95;
    public static final int PRIORITY_HIGH = 300;
    public static final int PRIORITY_HIGH_10 = 310;
    public static final int PRIORITY_HIGH_20 = 320;
    public static final int PRIORITY_HIGH_30 = 330;
    private static final ArrayList<Integer> PRIORITY_LIST;
    public static final int PRIORITY_LOW_10 = 110;
    public static final int PRIORITY_LOW_20 = 120;
    public static final int PRIORITY_LOW_30 = 130;
    public static final int PRIORITY_MAX = 1000;
    public static final int PRIORITY_MIN = 0;
    public static final int PRIORITY_NORM = 200;
    public static final int PRIORITY_NORM_10 = 210;
    public static final int PRIORITY_NORM_20 = 220;
    public static final int PRIORITY_NORM_30 = 230;
    public static final int PROCESS_ALL = -2147483617;
    public static final int PROCESS_MAIN = 1;
    public static final int PROCESS_ONCE = 8;
    public static final int PROCESS_PUSH = 16;
    public static final int PROCESS_SPORT_DAEMON = 4;
    public static final int PROCESS_TRANSPORT = 2;
    public static final int PROCESS_UNKNOWN = Integer.MIN_VALUE;
    private final boolean debugType;
    protected Application mApplication;
    private final int priority;
    private final int process;

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        PRIORITY_LIST = arrayList;
        arrayList.add(0);
        arrayList.add(95);
        arrayList.add(80);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(1000);
        arrayList.add(210);
        arrayList.add(220);
        arrayList.add(230);
        arrayList.add(310);
        arrayList.add(Integer.valueOf(PRIORITY_HIGH_20));
        arrayList.add(Integer.valueOf(PRIORITY_HIGH_30));
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(110);
        arrayList.add(120);
        arrayList.add(Integer.valueOf(PRIORITY_LOW_30));
    }

    public i9a() {
        int iConfigProcess = configProcess();
        this.process = iConfigProcess;
        if (((-2147483617) & iConfigProcess) != iConfigProcess) {
            throw new IllegalArgumentException("process use error");
        }
        this.debugType = configDebugType();
        int iConfigPriority = configPriority();
        this.priority = iConfigPriority;
        if (!PRIORITY_LIST.contains(Integer.valueOf(iConfigPriority))) {
            throw new IllegalArgumentException("priority use error");
        }
    }

    @CallSuper
    public void attachContext(Application application) {
        this.mApplication = application;
    }

    public boolean configDebugType() {
        return false;
    }

    public int configPriority() {
        return 200;
    }

    public abstract int configProcess();

    public int getPriority() {
        return this.priority;
    }

    public int getProcess() {
        return this.process;
    }

    public String getTag() {
        return getClass().getSimpleName();
    }

    public abstract void init();

    public void initAfterInternetAgreed() {
    }

    public void initAfterPrivacyAgreed() {
    }

    public boolean isDebugType() {
        return this.debugType;
    }

    public void timeout(long j) {
    }
}