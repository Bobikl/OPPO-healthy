package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.base.R$string;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$AutoEmergencyCall;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfo;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyESIMNumber;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.wearable.emergency.api.bean.EmergencyContact;
import com.heytap.wearable.watch.emergency.EmergencySpHelper;
import com.heytap.wearable.watch.emergency.R$array;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class yk6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile yk6 f19052j;
    public String a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19053c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData<Boolean> f19054e = new MutableLiveData<>();
    public final MutableLiveData<EmergencyContact> f = new MutableLiveData<>();
    public final MutableLiveData<String> g = new MutableLiveData<>();
    public kr0 h;
    public final aid i;

    public class a extends pyb {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.pyb
        public void k(EmergencySettingProto$EmergencyContactInfo emergencySettingProto$EmergencyContactInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("request emergency contact info: ");
            sb.append(emergencySettingProto$EmergencyContactInfo);
            EmergencyContact emergencyContact = new EmergencyContact();
            emergencyContact.setName(emergencySettingProto$EmergencyContactInfo.getName());
            int relationship = emergencySettingProto$EmergencyContactInfo.getRelationship();
            if (relationship > 0) {
                emergencyContact.setRelationshipType(Integer.valueOf(relationship));
                emergencyContact.setRelationship(b78.a().getResources().getStringArray(R$array.settings_contact_relation)[emergencySettingProto$EmergencyContactInfo.getRelationship() - 1]);
            }
            emergencyContact.setCustomRelationship(emergencySettingProto$EmergencyContactInfo.getCustomRelationship());
            emergencyContact.setMobile(emergencySettingProto$EmergencyContactInfo.getNumber());
            emergencyContact.checkValid();
            yk6.this.G(emergencyContact);
            EmergencySpHelper.saveEmergencyContactInfo(yk6.this.a, emergencyContact);
            yk6.this.f.postValue(emergencyContact);
        }
    }

    public class b implements sl4 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NonNull String str, @NonNull MessageEvent messageEvent) {
            try {
                EmergencySettingProto$AutoEmergencyCall from = EmergencySettingProto$AutoEmergencyCall.parseFrom(messageEvent.getData());
                a7b.f("EmergencyRepository", "request emergency auto call switch: " + from.getSwitch() + ", hasChanged: " + yk6.this.d);
                if (yk6.this.d) {
                    yk6.this.d = false;
                } else {
                    yk6.this.f19054e.postValue(Boolean.valueOf(from.getSwitch()));
                }
            } catch (InvalidProtocolBufferException unused) {
                yk6.this.f19054e.postValue(Boolean.FALSE);
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NonNull DMCallException dMCallException) {
            a7b.b("EmergencyRepository", "request emergency auto call error: " + dMCallException.getMessage());
            yk6.this.f19054e.postValue(Boolean.valueOf(hl6.a(yk6.this.a).V4()));
        }
    }

    public class c implements sl4 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NonNull String str, @NonNull MessageEvent messageEvent) {
            try {
                EmergencySettingProto$EmergencyESIMNumber from = EmergencySettingProto$EmergencyESIMNumber.parseFrom(messageEvent.getData());
                StringBuilder sb = new StringBuilder();
                sb.append("request emergency eSim number: ");
                sb.append(from);
                yk6.this.g.postValue(from.getNumber());
            } catch (InvalidProtocolBufferException unused) {
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NonNull DMCallException dMCallException) {
            a7b.b("EmergencyRepository", "request emergency eSim number error: " + dMCallException.getMessage());
        }
    }

    public yk6() {
        a aVar = new a();
        this.i = aVar;
        kr0 kr0VarE = kr0.e();
        this.h = kr0VarE;
        kr0VarE.g(31, aVar);
    }

    public static yk6 r() {
        if (f19052j == null) {
            synchronized (yk6.class) {
                if (f19052j == null) {
                    f19052j = new yk6();
                }
            }
        }
        return f19052j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Boolean bool) throws Throwable {
        A();
        B();
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(BaseResponse baseResponse) throws Throwable {
        if (!baseResponse.isSuccess()) {
            a7b.b("EmergencyRepository", "queryContacts is not success: " + baseResponse.getErrorCode());
            y();
            return;
        }
        if (baseResponse.getBody() == null || ((List) baseResponse.getBody()).isEmpty()) {
            a7b.b("EmergencyRepository", "queryContacts return empty");
            y();
            return;
        }
        EmergencyContact emergencyContact = (EmergencyContact) ((List) baseResponse.getBody()).get(0);
        if (emergencyContact.getRelationshipType() != null && emergencyContact.getRelationshipType().intValue() > 0) {
            emergencyContact.setRelationship(b78.a().getResources().getStringArray(R$array.settings_contact_relation)[emergencyContact.getRelationshipType().intValue() - 1]);
        }
        emergencyContact.checkValid();
        D(emergencyContact);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Throwable th) throws Throwable {
        a7b.b("EmergencyRepository", "queryContacts onError: " + th.getMessage());
        y();
    }

    public static /* synthetic */ void w(Throwable th) throws Throwable {
        a7b.b("EmergencyRepository", th.getMessage());
    }

    public final void A() {
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(31, 2, null), new b(), new ko4.a(2), 10000L, 0);
    }

    public final void B() {
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(31, 8, null), new c(), new ko4.a(8), 10000L, 0);
    }

    public void C(boolean z) {
        this.d = true;
        this.h.k(sk6.c(z));
        this.f19054e.postValue(Boolean.valueOf(z));
    }

    public void D(EmergencyContact emergencyContact) {
        EmergencySpHelper.saveEmergencyContactInfo(this.a, emergencyContact);
        this.h.k(sk6.d(emergencyContact));
        this.f.postValue(emergencyContact);
    }

    public void E(String str) {
        this.h.k(sk6.e(str));
        this.g.postValue(str);
    }

    public void F(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.b("EmergencyRepository", "set mac with null or empty");
            return;
        }
        this.a = str;
        this.b = rp5.g(str);
        this.f19053c = rp5.e(str);
    }

    public void G(EmergencyContact emergencyContact) {
        ArrayList arrayList = new ArrayList();
        if (emergencyContact.getRelationshipType() != null && emergencyContact.getRelationshipType().intValue() == 0) {
            emergencyContact.setRelationshipType(null);
        }
        arrayList.add(emergencyContact);
        ((vj6) com.heytap.health.network.core.a.l(vj6.class)).d(this.b ? this.f19053c : null, arrayList).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.uk6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) {
                ((BaseResponse) obj).getMessage();
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.vk6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                yk6.w((Throwable) obj);
            }
        });
    }

    public boolean l() {
        if (TextUtils.isEmpty(this.a)) {
            y0k.i(b78.a().getString(R$string.lib_base_device_disconnected_retry_later));
            return false;
        }
        if (gl4.managerApi.isConnected(this.a)) {
            return true;
        }
        y0k.i(b78.a().getString(R$string.lib_base_device_disconnected_retry_later));
        return false;
    }

    public boolean m() {
        if (rpc.c()) {
            return true;
        }
        y0k.i(b78.a().getString(R$string.lib_base_share_network_not_connected));
        return false;
    }

    public void n() {
        this.h.y(31, this.i);
        this.h = null;
        f19052j = null;
    }

    public LiveData<Boolean> o() {
        return this.f19054e;
    }

    public LiveData<EmergencyContact> p() {
        return this.f;
    }

    public LiveData<String> q() {
        return this.g;
    }

    public void x() {
        a7b.f("EmergencyRepository", "start to load emergency data");
        lbd.h0(Boolean.TRUE).L0(su8.c()).a(new o14() { // from class: com.oplus.aiunit.vision.tk6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.s((Boolean) obj);
            }
        });
    }

    public final void y() {
        EmergencyContact emergencyContactInfo = EmergencySpHelper.getEmergencyContactInfo(this.a);
        if (emergencyContactInfo == null) {
            this.h.k(sk6.a());
            return;
        }
        emergencyContactInfo.checkValid();
        G(emergencyContactInfo);
        this.f.postValue(emergencyContactInfo);
        this.h.k(sk6.d(emergencyContactInfo));
    }

    public final void z() {
        ((vj6) com.heytap.health.network.core.a.l(vj6.class)).b(this.b ? this.f19053c : null).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.wk6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.t((BaseResponse) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.xk6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.u((Throwable) obj);
            }
        });
    }
}
