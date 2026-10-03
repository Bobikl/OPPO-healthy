package com.omron;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class w {
    private static final a m = a.UsedBeforeGattConnection;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f9087n = c.NotUse;
    private a a = m;
    private c b = f9087n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9088c = true;
    private boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9089e = false;

    @NonNull
    private String f = "000000";
    private boolean g = true;
    private long h = 1500;
    private boolean i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f9090j = 1000;
    private int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9091l = true;

    public enum a {
        NotUse,
        UsedBeforeGattConnection,
        UsedAfterServicesDiscovered
    }

    public enum b {
        CreateBondOption,
        RemoveBondOption,
        AssistPairingDialogEnabled,
        AutoPairingEnabled,
        AutoEnterThePinCodeEnabled,
        PinCode,
        StableConnectionEnabled,
        StableConnectionWaitTime,
        ConnectionRetryEnabled,
        ConnectionRetryDelayTime,
        ConnectionRetryCount,
        UseRefreshWhenDisconnect
    }

    public enum c {
        NotUse,
        UsedBeforeConnectionProcessEveryTime
    }

    @NonNull
    public Bundle a(@Nullable List<b> list) {
        if (list == null) {
            list = Arrays.asList(b.values());
        }
        Bundle bundle = new Bundle();
        for (b bVar : list) {
            b bVar2 = b.CreateBondOption;
            if (bundle.containsKey(bVar2.name())) {
                bundle.putSerializable(bVar2.name(), this.a);
            }
            if (bundle.containsKey(b.RemoveBondOption.name())) {
                bundle.putSerializable(bVar2.name(), this.b);
            }
            b bVar3 = b.AssistPairingDialogEnabled;
            if (bVar3.equals(bVar)) {
                bundle.putBoolean(bVar3.name(), this.f9088c);
            }
            b bVar4 = b.AutoPairingEnabled;
            if (bVar4.equals(bVar)) {
                bundle.putBoolean(bVar4.name(), this.d);
            }
            b bVar5 = b.AutoEnterThePinCodeEnabled;
            if (bVar5.equals(bVar)) {
                bundle.putBoolean(bVar5.name(), this.f9089e);
            }
            b bVar6 = b.PinCode;
            if (bVar6.equals(bVar)) {
                bundle.putString(bVar6.name(), this.f);
            }
            b bVar7 = b.StableConnectionEnabled;
            if (bVar7.equals(bVar)) {
                bundle.putBoolean(bVar7.name(), this.g);
            }
            b bVar8 = b.StableConnectionWaitTime;
            if (bVar8.equals(bVar)) {
                bundle.putLong(bVar8.name(), this.h);
            }
            b bVar9 = b.ConnectionRetryEnabled;
            if (bVar9.equals(bVar)) {
                bundle.putBoolean(bVar9.name(), this.i);
            }
            b bVar10 = b.ConnectionRetryDelayTime;
            if (bVar10.equals(bVar)) {
                bundle.putLong(bVar10.name(), this.f9090j);
            }
            b bVar11 = b.ConnectionRetryCount;
            if (bVar11.equals(bVar)) {
                bundle.putInt(bVar11.name(), this.k);
            }
            b bVar12 = b.UseRefreshWhenDisconnect;
            if (bVar12.equals(bVar)) {
                bundle.putBoolean(bVar12.name(), this.f9091l);
            }
        }
        return bundle;
    }

    @NonNull
    public Bundle b(@Nullable List<b> list) {
        if (list == null) {
            list = Arrays.asList(b.values());
        }
        Bundle bundle = new Bundle();
        for (b bVar : list) {
            b bVar2 = b.CreateBondOption;
            if (bundle.containsKey(bVar2.name())) {
                bundle.putSerializable(bVar2.name(), m);
            }
            if (bundle.containsKey(b.RemoveBondOption.name())) {
                bundle.putSerializable(bVar2.name(), f9087n);
            }
            b bVar3 = b.AssistPairingDialogEnabled;
            if (bVar3.equals(bVar)) {
                bundle.putBoolean(bVar3.name(), true);
            }
            b bVar4 = b.AutoPairingEnabled;
            if (bVar4.equals(bVar)) {
                bundle.putBoolean(bVar4.name(), false);
            }
            b bVar5 = b.AutoEnterThePinCodeEnabled;
            if (bVar5.equals(bVar)) {
                bundle.putBoolean(bVar5.name(), false);
            }
            b bVar6 = b.PinCode;
            if (bVar6.equals(bVar)) {
                bundle.putString(bVar6.name(), "000000");
            }
            b bVar7 = b.StableConnectionEnabled;
            if (bVar7.equals(bVar)) {
                bundle.putBoolean(bVar7.name(), true);
            }
            b bVar8 = b.StableConnectionWaitTime;
            if (bVar8.equals(bVar)) {
                bundle.putLong(bVar8.name(), 1500L);
            }
            b bVar9 = b.ConnectionRetryEnabled;
            if (bVar9.equals(bVar)) {
                bundle.putBoolean(bVar9.name(), true);
            }
            b bVar10 = b.ConnectionRetryDelayTime;
            if (bVar10.equals(bVar)) {
                bundle.putLong(bVar10.name(), 1000L);
            }
            b bVar11 = b.ConnectionRetryCount;
            if (bVar11.equals(bVar)) {
                bundle.putInt(bVar11.name(), 0);
            }
            b bVar12 = b.UseRefreshWhenDisconnect;
            if (bVar12.equals(bVar)) {
                bundle.putBoolean(bVar12.name(), true);
            }
        }
        return bundle;
    }

    public c c() {
        return this.b;
    }

    public long d() {
        return this.h;
    }

    public boolean e() {
        return this.f9088c;
    }

    public boolean f() {
        return this.f9089e;
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.f9091l;
    }

    public a a() {
        return this.a;
    }

    @NonNull
    public String b() {
        return this.f;
    }

    public void a(@NonNull Bundle bundle) {
        b bVar = b.CreateBondOption;
        if (bundle.containsKey(bVar.name())) {
            this.a = (a) bundle.getSerializable(bVar.name());
        }
        b bVar2 = b.RemoveBondOption;
        if (bundle.containsKey(bVar2.name())) {
            this.b = (c) bundle.getSerializable(bVar2.name());
        }
        b bVar3 = b.AssistPairingDialogEnabled;
        if (bundle.containsKey(bVar3.name())) {
            this.f9088c = bundle.getBoolean(bVar3.name());
        }
        b bVar4 = b.AutoPairingEnabled;
        if (bundle.containsKey(bVar4.name())) {
            this.d = bundle.getBoolean(bVar4.name());
        }
        b bVar5 = b.AutoEnterThePinCodeEnabled;
        if (bundle.containsKey(bVar5.name())) {
            this.f9089e = bundle.getBoolean(bVar5.name());
        }
        b bVar6 = b.PinCode;
        if (bundle.containsKey(bVar6.name())) {
            this.f = bundle.getString(bVar6.name(), "000000");
        }
        b bVar7 = b.StableConnectionEnabled;
        if (bundle.containsKey(bVar7.name())) {
            this.g = bundle.getBoolean(bVar7.name());
        }
        b bVar8 = b.StableConnectionWaitTime;
        if (bundle.containsKey(bVar8.name())) {
            this.h = bundle.getLong(bVar8.name());
        }
        b bVar9 = b.ConnectionRetryEnabled;
        if (bundle.containsKey(bVar9.name())) {
            this.i = bundle.getBoolean(bVar9.name());
        }
        b bVar10 = b.ConnectionRetryDelayTime;
        if (bundle.containsKey(bVar10.name())) {
            this.f9090j = bundle.getLong(bVar10.name());
        }
        b bVar11 = b.ConnectionRetryCount;
        if (bundle.containsKey(bVar11.name())) {
            this.k = bundle.getInt(bVar11.name());
        }
        b bVar12 = b.UseRefreshWhenDisconnect;
        if (bundle.containsKey(bVar12.name())) {
            this.f9091l = bundle.getBoolean(bVar12.name());
        }
    }
}
