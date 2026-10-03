package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class e8 {
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<la>> a;

    public static class b {
        public static final e8 a = new e8();
    }

    public static e8 c() {
        return b.a;
    }

    public static /* synthetic */ void d(String str, la laVar, AcApiResponse acApiResponse) {
        AcLogUtil.i("AcCallbackMgr", "start callback method: " + str, laVar.b());
        laVar.a().call(acApiResponse);
        AcLogUtil.i("AcCallbackMgr", "end callback method: " + str, laVar.b());
    }

    public void b(String str, c8 c8Var, String str2) {
        CopyOnWriteArrayList<la> copyOnWriteArrayListPutIfAbsent;
        CopyOnWriteArrayList<la> copyOnWriteArrayList = this.a.get(str);
        if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = this.a.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
        }
        copyOnWriteArrayList.add(new la(str2, c8Var));
    }

    public void e(final String str, final AcApiResponse acApiResponse) {
        CopyOnWriteArrayList<la> copyOnWriteArrayListRemove = this.a.remove(str);
        if (copyOnWriteArrayListRemove == null || copyOnWriteArrayListRemove.isEmpty()) {
            AcLogUtil.e("AcCallbackMgr", "notifyCallback: callback is null");
            return;
        }
        AcLogUtil.i("AcCallbackMgr", "notifyCallback: callback size=" + copyOnWriteArrayListRemove.size());
        for (final la laVar : copyOnWriteArrayListRemove) {
            zj.a().g(new Runnable() { // from class: com.oplus.aiunit.vision.d8
                @Override // java.lang.Runnable
                public final void run() {
                    e8.d(str, laVar, acApiResponse);
                }
            });
        }
    }

    public e8() {
        this.a = new ConcurrentHashMap<>();
    }
}
