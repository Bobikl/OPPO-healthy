package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes18.dex */
public class yj5 {
    public static volatile yj5 mInstance;
    public Context a;
    public ReentrantLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Condition f19035c;
    public WalletDevInfo d;

    public class a extends ao0<bvf<UserDeviceInfo>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ UserDeviceInfo[] f19036j;
        public final /* synthetic */ CountDownLatch k;

        public a(UserDeviceInfo[] userDeviceInfoArr, CountDownLatch countDownLatch) {
            this.f19036j = userDeviceInfoArr;
            this.k = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(bvf<UserDeviceInfo> bvfVar) {
            UserDeviceInfo userDeviceInfoB = bvfVar.b();
            if (userDeviceInfoB != null) {
                this.f19036j[0] = userDeviceInfoB;
            }
            this.k.countDown();
        }
    }

    public yj5() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.f19035c = reentrantLock.newCondition();
        if (this.a == null) {
            this.a = qz0.mContext;
        }
    }

    public static yj5 c() {
        if (mInstance == null) {
            synchronized (yj5.class) {
                if (mInstance == null) {
                    mInstance = new yj5();
                }
            }
        }
        return mInstance;
    }

    public synchronized void a() {
        t6b.b("W-DEV-I", "clear Cached DevInfo!");
        this.d = null;
    }

    public synchronized WalletDevInfo b() {
        String strT = j7l.t();
        WalletDevInfo u6lVar = this.d;
        if (u6lVar != null && !u6lVar.equals(new WalletDevInfo()) && Objects.equals(this.d.getMac(), strT)) {
            t6b.b("W-DEV-I", "getDeviceInfo deviceInfo cache hit:" + this.d);
            return this.d;
        }
        t6b.b("W-DEV-I", "getDeviceInfo currentMac:" + strT);
        new ArrayList().add(strT);
        UserDeviceInfo[] userDeviceInfoArr = new UserDeviceInfo[1];
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            gl4.managerApi.m(strT).g().subscribe(new a(userDeviceInfoArr, countDownLatch));
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (Exception e2) {
            t6b.d("W-DEV-I", "getDeviceInfo, exception: " + e2.getMessage());
        }
        t6b.b("W-DEV-I", "getDeviceInfo deviceInfo from dev:" + userDeviceInfoArr[0]);
        UserDeviceInfo userDeviceInfo = userDeviceInfoArr[0];
        if (userDeviceInfo == null) {
            return new WalletDevInfo();
        }
        WalletDevInfo u6lVar2 = new WalletDevInfo(strT, userDeviceInfo.getModel(), userDeviceInfoArr[0].getFirmwareVersion(), userDeviceInfoArr[0].getDeviceSn(), userDeviceInfoArr[0].getDeviceMarketName(), userDeviceInfoArr[0].getDeviceName());
        this.d = u6lVar2;
        return u6lVar2;
    }
}
