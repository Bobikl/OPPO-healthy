package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.account.third.api.ThirdOauthType;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ivj {
    public static volatile ivj d;
    public final Context a;
    public final EnumMap<ThirdOauthType, Class<bz9>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumMap<ThirdOauthType, bz9> f12670c;

    public ivj(Context context) {
        EnumMap<ThirdOauthType, Class<bz9>> enumMap = new EnumMap<>(ThirdOauthType.class);
        this.b = enumMap;
        this.f12670c = new EnumMap<>(ThirdOauthType.class);
        this.a = context.getApplicationContext();
        s70.a(enumMap);
    }

    public static ivj a(Context context) {
        if (d == null) {
            synchronized (ivj.class) {
                if (d == null) {
                    d = new ivj(context);
                }
            }
        }
        return d;
    }

    public bz9 b(ThirdOauthType thirdOauthType) {
        bz9 bz9Var = this.f12670c.get(thirdOauthType);
        if (bz9Var != null) {
            return bz9Var;
        }
        try {
            Class<bz9> cls = this.b.get(thirdOauthType);
            if (cls == null) {
                return bz9Var;
            }
            bz9 bz9VarNewInstance = cls.getDeclaredConstructor(Context.class).newInstance(this.a);
            try {
                this.f12670c.put(thirdOauthType, bz9VarNewInstance);
                return bz9VarNewInstance;
            } catch (Exception e2) {
                e = e2;
                bz9Var = bz9VarNewInstance;
            }
        } catch (Exception e3) {
            e = e3;
        }
        g7b.a("getThirdOauthApi error msg: " + e.getMessage());
        return bz9Var;
    }

    public void c(ThirdOauthType thirdOauthType) {
        this.f12670c.remove(thirdOauthType);
    }

    public List<ThirdOauthType> d() {
        ArrayList arrayList = new ArrayList();
        for (K k : this.b.keySet()) {
            if (k.isApkAvailable(this.a)) {
                arrayList.add(k);
            }
        }
        return arrayList;
    }
}
