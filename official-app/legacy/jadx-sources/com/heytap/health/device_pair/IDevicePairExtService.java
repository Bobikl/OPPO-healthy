package com.heytap.health.device_pair;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IDevicePairExtService extends IProvider {

    public interface a {
        void a(Throwable th, String str);

        void onSuccess(Object obj);
    }

    public interface b {
    }

    public interface c {
        void a(String str);

        void onFail(String str);

        void onSuccess();
    }

    LiveData<Integer> B();

    void F2(String str, b bVar);

    boolean F6(@NonNull String str);

    void H8(long j2);

    void I0(int i);

    boolean L5();

    int N8(boolean z);

    int N9(int i, int i2, int i3);

    void S0(String str);

    void U(long j2);

    void V8(int i);

    void W7(String str);

    void X(Context context, String str, c cVar);

    void Y1(String str);

    void Y6(String str, int i, a aVar);

    int f3(int i);

    boolean f4(Context context);

    int k7();

    int k9(List<UserDeviceInfo> list);

    boolean q();

    void q0(String str, String str2, String str3, b bVar);

    boolean r();

    void x1(String str);

    boolean y8();

    int za(int i);
}
