package com.oplus.accountsdk.open.core.ipc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.accountsdk.open.core.ipc.executor.a;
import com.oplus.aiunit.vision.bg;
import com.oplus.aiunit.vision.gh;
import com.oplus.aiunit.vision.ll9;
import com.oplus.aiunit.vision.me;
import com.oplus.aiunit.vision.ml9;
import com.oplus.aiunit.vision.oc;
import com.oplus.aiunit.vision.ze;
import com.platform.usercenter.account.ams.ipc.RequestConstant;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenIpcFactory implements ml9 {
    public static final ConcurrentHashMap<Integer, ll9> a = new ConcurrentHashMap<>();
    public static final Set<Integer> b = new HashSet<Integer>() { // from class: com.oplus.accountsdk.open.core.ipc.AcOpenIpcFactory.1
        {
            add(-1010);
            add(-1001);
            add(Integer.valueOf(RequestConstant.TYPE_REFRESH_V1));
            add(-1002);
            add(-1011);
            add(-1003);
        }
    };

    public final ll9 a(int i) {
        if (i == -1011) {
            return new me();
        }
        if (i == -1010) {
            return new ze();
        }
        if (i == -1008) {
            return new bg();
        }
        switch (i) {
            case -1003:
                return new a();
            case -1002:
                return new gh();
            case -1001:
                return new oc();
            default:
                return null;
        }
    }

    @Override // com.oplus.aiunit.vision.ml9
    @Nullable
    public ll9 create(@NonNull int i) {
        if (!b.contains(Integer.valueOf(i))) {
            return null;
        }
        ConcurrentHashMap<Integer, ll9> concurrentHashMap = a;
        ll9 ll9Var = concurrentHashMap.get(Integer.valueOf(i));
        if (ll9Var != null) {
            return ll9Var;
        }
        ll9 ll9VarA = a(i);
        if (ll9VarA == null) {
            return null;
        }
        ll9 ll9VarPutIfAbsent = concurrentHashMap.putIfAbsent(Integer.valueOf(i), ll9VarA);
        return ll9VarPutIfAbsent != null ? ll9VarPutIfAbsent : ll9VarA;
    }
}
