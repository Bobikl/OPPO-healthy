package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.device_pair.FamilyAccoutManagerApi;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.protocol.familydevice.FamilyDeviceProto$FamilyDevicePairInfo;
import com.heytap.health.watchpair.R$string;
import com.heytap.health.watchpair.family.bean.CreateFamilyAccountBean;
import com.heytap.health.watchpair.family.bean.FamilyAccountListBody;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class m17 {
    public static final int ERROR_CODE_EXIST = 23601;
    public static final int ERROR_CODE_FORMAT = 23602;
    public static final int ERROR_CODE_VIOLATION = 23600;

    public class a implements FamilyAccoutManagerApi.b<VirtualAccountData> {
        public final /* synthetic */ VirtualAccountData a;
        public final /* synthetic */ ccd b;

        public a(VirtualAccountData virtualAccountData, ccd ccdVar) {
            this.a = virtualAccountData;
            this.b = ccdVar;
        }

        @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(VirtualAccountData virtualAccountData) {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setErrorCode(0);
            CreateFamilyAccountBean createFamilyAccountBean = new CreateFamilyAccountBean();
            createFamilyAccountBean.setVirtualSsoid(this.a.getVirtualSsoid());
            baseResponse.setBody(createFamilyAccountBean);
            this.b.onNext(baseResponse);
            this.b.onComplete();
        }

        @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi.b
        public void onFail(String str, int i) {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setErrorCode(99999);
            baseResponse.setMessage(str);
            this.b.onNext(baseResponse);
            this.b.onComplete();
        }
    }

    public class b extends ao0<VirtualAccountData> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ VirtualAccountData f13907j;
        public final /* synthetic */ FamilyAccoutManagerApi.a k;

        public b(VirtualAccountData virtualAccountData, FamilyAccoutManagerApi.a aVar) {
            this.f13907j = virtualAccountData;
            this.k = aVar;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(VirtualAccountData virtualAccountData) {
            this.f13907j.setVirtualSsoid(virtualAccountData.getVirtualSsoid());
            this.f13907j.setBindStatus(1);
            gl4.businessApi.l(this.f13907j.getDeviceUniqueId(), this.f13907j);
            FamilyAccoutManagerApi.a aVar = this.k;
            if (aVar != null) {
                aVar.onSuccess(this.f13907j);
            }
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            a7b.b("FamilyAccountManager", th.getMessage());
            FamilyAccoutManagerApi.a aVar = this.k;
            if (aVar != null) {
                aVar.onFail("errMsg :" + th.getMessage(), -1);
            }
        }
    }

    public class c implements sl4 {
        public final /* synthetic */ ccd a;
        public final /* synthetic */ VirtualAccountData b;

        public c(ccd ccdVar, VirtualAccountData virtualAccountData) {
            this.a = ccdVar;
            this.b = virtualAccountData;
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NonNull String str, @NonNull MessageEvent messageEvent) {
            if (messageEvent.getServiceId() == 266 && messageEvent.getCommandId() == 1) {
                try {
                    FamilyDeviceProto$FamilyDevicePairInfo from = FamilyDeviceProto$FamilyDevicePairInfo.parseFrom(messageEvent.getData());
                    StringBuilder sb = new StringBuilder();
                    sb.append("set family rsp:");
                    sb.append(from.toString());
                    if (from.getType() == 1) {
                        this.a.onNext(this.b);
                        this.a.onComplete();
                    } else {
                        this.a.onError(new Throwable("watch set family faile!!!"));
                    }
                } catch (InvalidProtocolBufferException e2) {
                    this.a.onError(e2);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NonNull DMCallException dMCallException) {
        }
    }

    public class d extends ao0<BaseResponse<Object>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ FamilyAccoutManagerApi.b f13910j;

        public d(FamilyAccoutManagerApi.b bVar) {
            this.f13910j = bVar;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse<Object> baseResponse) {
            this.f13910j.onSuccess(baseResponse);
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            a7b.b("FamilyAccountManager", "checkNickName error!!!:" + th.getMessage());
            this.f13910j.onFail("errMsg :" + th.getMessage(), 0);
        }
    }

    public class e extends u61<Object> {
        public final /* synthetic */ VirtualAccountData i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ FamilyAccoutManagerApi.b f13911j;

        public e(VirtualAccountData virtualAccountData, FamilyAccoutManagerApi.b bVar) {
            this.i = virtualAccountData;
            this.f13911j = bVar;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("FamilyAccountManager", str);
            FamilyAccoutManagerApi.b bVar = this.f13911j;
            if (bVar != null) {
                bVar.onFail("errMsg :" + str, -1);
            }
        }

        @Override // com.oplus.aiunit.vision.u61
        public void d(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateCloudFamilyAccount result ");
            sb.append(obj != null ? obj.toString() : "  is null");
            this.i.setBindStatus(1);
            FamilyAccoutManagerApi.b bVar = this.f13911j;
            if (bVar != null) {
                bVar.onSuccess(this.i);
            }
        }
    }

    public class f implements FamilyAccoutManagerApi.b<BaseResponse<Object>> {
        public final /* synthetic */ FamilyAccoutManagerApi.b a;

        public f(FamilyAccoutManagerApi.b bVar) {
            this.a = bVar;
        }

        @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<Object> baseResponse) {
            if (baseResponse.isSuccess()) {
                this.a.onSuccess(baseResponse);
                return;
            }
            if (23600 == baseResponse.getErrorCode()) {
                y0k.i(b78.a().getString(R$string.oobe_family_error_tip_sensitive));
            } else if (23601 == baseResponse.getErrorCode()) {
                y0k.i(b78.a().getString(R$string.oobe_family_error_tip_exist));
            } else if (23602 == baseResponse.getErrorCode()) {
                y0k.i(b78.a().getString(R$string.oobe_family_error_tip_format));
            }
            this.a.onFail(baseResponse.getErrorCode() + ":" + baseResponse.getMessage(), baseResponse.getErrorCode());
        }

        @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi.b
        public void onFail(String str, int i) {
            y0k.i(BaseApplication.a().getString(com.heytap.health.base.R$string.lib_base_webview_time_out));
            this.a.onFail(str, i);
        }
    }

    public class g extends u61<Object> {
        public final /* synthetic */ FamilyAccoutManagerApi.b i;

        public g(FamilyAccoutManagerApi.b bVar) {
            this.i = bVar;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("FamilyAccountManager", str);
            FamilyAccoutManagerApi.b bVar = this.i;
            if (bVar != null) {
                bVar.onFail("errMsg :" + str, -1);
            }
        }

        @Override // com.oplus.aiunit.vision.u61
        public void d(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateCloudFamilyAccount result ");
            sb.append(obj != null ? obj.toString() : "  is null");
            FamilyAccoutManagerApi.b bVar = this.i;
            if (bVar != null) {
                if (obj == null) {
                    obj = "";
                }
                bVar.onSuccess(obj);
            }
        }
    }

    public static class h {
        public static final m17 a = new m17();
    }

    public static m17 l() {
        return h.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(VirtualAccountData virtualAccountData, ccd ccdVar) throws Throwable {
        u(virtualAccountData, new a(virtualAccountData, ccdVar));
    }

    public static /* synthetic */ jdd n(VirtualAccountData virtualAccountData, BaseResponse baseResponse) throws Throwable {
        if (baseResponse.getErrorCode() != 0) {
            return lbd.O(new Exception(baseResponse.getErrorCode() + ":" + baseResponse.getMessage()));
        }
        CreateFamilyAccountBean createFamilyAccountBean = (CreateFamilyAccountBean) baseResponse.getBody();
        StringBuilder sb = new StringBuilder();
        sb.append("createFamilyAccount result ");
        sb.append(createFamilyAccountBean != null ? createFamilyAccountBean.toString() : "  is null");
        if (createFamilyAccountBean == null) {
            return lbd.O(new Exception("errMsg :result == null"));
        }
        virtualAccountData.setVirtualSsoid(createFamilyAccountBean.getVirtualSsoid());
        virtualAccountData.setBindStatus(1);
        return lbd.h0(virtualAccountData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(VirtualAccountData virtualAccountData, ccd ccdVar) throws Throwable {
        gl4.devicePrimary.callApi.i(xxb.V(1, virtualAccountData.getVirtualSsoid()), new c(ccdVar, virtualAccountData), new ko4.b(266, 1), 0L, 0);
    }

    public static /* synthetic */ jdd p(VirtualAccountData virtualAccountData, FamilyAccoutManagerApi.a aVar, BaseResponse baseResponse) throws Throwable {
        if (baseResponse.isSuccess()) {
            gl4.businessApi.l(virtualAccountData.getDeviceUniqueId(), null);
            aVar.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unbinDevice code:");
        sb.append(baseResponse.getErrorCode());
        return lbd.O(new Throwable("send family data to watch,rsp timeout!!!!"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd q(final VirtualAccountData virtualAccountData, final FamilyAccoutManagerApi.a aVar, VirtualAccountData virtualAccountData2) throws Throwable {
        return t(virtualAccountData2.getVirtualSsoid(), virtualAccountData2.getDeviceUniqueId()).Q(new d08() { // from class: com.oplus.aiunit.vision.l17
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return m17.p(virtualAccountData, aVar, (BaseResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd r(final VirtualAccountData virtualAccountData, final FamilyAccoutManagerApi.a aVar, final VirtualAccountData virtualAccountData2) throws Throwable {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.j17
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.o(virtualAccountData2, ccdVar);
            }
        }).n0(su8.c()).Z0(15000L, TimeUnit.MILLISECONDS, lbd.h0(virtualAccountData2).Q(new d08() { // from class: com.oplus.aiunit.vision.k17
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.q(virtualAccountData, aVar, (VirtualAccountData) obj);
            }
        }));
    }

    public static /* synthetic */ ArrayList s(BaseResponse baseResponse) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (baseResponse == null) {
            return arrayList;
        }
        if (baseResponse.getBody() != null) {
            arrayList.addAll(((FamilyAccountListBody) baseResponse.getBody()).getRecords());
        }
        a7b.f("FamilyAccountManager", "getFamilyAccountList errorCode:" + baseResponse.getErrorCode() + ", message:" + baseResponse.getMessage() + ",size:" + arrayList.size());
        return arrayList;
    }

    public void h(String str, FamilyAccoutManagerApi.b<BaseResponse<Object>> bVar) {
        HashMap map = new HashMap();
        map.put("nickname", str);
        ((d17) com.heytap.health.network.core.a.j(d17.class)).e(map).L0(su8.c()).n0(f30.c()).subscribe(new d(bVar));
    }

    public void i(final VirtualAccountData virtualAccountData, final FamilyAccoutManagerApi.a<VirtualAccountData> aVar) {
        (virtualAccountData.isBindDevice() ? lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.g17
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.m(virtualAccountData, ccdVar);
            }
        }) : ((d17) com.heytap.health.network.core.a.l(d17.class)).b(virtualAccountData)).L0(su8.c()).Q(new d08() { // from class: com.oplus.aiunit.vision.h17
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return m17.n(virtualAccountData, (BaseResponse) obj);
            }
        }).Q(new d08() { // from class: com.oplus.aiunit.vision.i17
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.r(virtualAccountData, aVar, (VirtualAccountData) obj);
            }
        }).subscribe(new b(virtualAccountData, aVar));
    }

    public void j(String str, FamilyAccoutManagerApi.b<Object> bVar) {
        HashMap map = new HashMap();
        map.put("virtualSsoid", str);
        ((d17) com.heytap.health.network.core.a.j(d17.class)).f(map).L0(su8.c()).subscribe(new g(bVar));
    }

    public lbd<ArrayList<VirtualAccountData>> k() {
        return ((d17) com.heytap.health.network.core.a.l(d17.class)).c(new HashMap()).L0(su8.c()).j0(new d08() { // from class: com.oplus.aiunit.vision.f17
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return m17.s((BaseResponse) obj);
            }
        });
    }

    public lbd<BaseResponse<Object>> t(String str, String str2) {
        HashMap map = new HashMap();
        map.put("virtualSsoid", str);
        map.put(t04.DEVICE_UNIQUE_ID, str2);
        return ((d17) com.heytap.health.network.core.a.l(d17.class)).a(map).L0(su8.c());
    }

    public void u(VirtualAccountData virtualAccountData, FamilyAccoutManagerApi.b<VirtualAccountData> bVar) {
        ((d17) com.heytap.health.network.core.a.j(d17.class)).d(virtualAccountData).L0(su8.c()).subscribe(new e(virtualAccountData, bVar));
    }

    public void v(String str, FamilyAccoutManagerApi.b<Object> bVar) {
        l().h(str, new f(bVar));
    }

    public m17() {
    }
}
