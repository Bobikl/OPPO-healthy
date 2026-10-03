package com.heytap.health.settings.watch.preferences.controlcenter;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.protocol.dm.DMProto$CommonError;
import com.heytap.health.protocol.dm.DMProto$ControlCenterData;
import com.heytap.health.protocol.dm.DMProto$ControlItem;
import com.heytap.health.settings.watch.preferences.dragutils.DragItemBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aid;
import com.oplus.aiunit.vision.g46;
import com.oplus.aiunit.vision.jp6;
import com.oplus.aiunit.vision.kr0;
import com.oplus.aiunit.vision.v9g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ControlCenterRepository {
    public MutableLiveData<g46> a;
    public MutableLiveData<Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5455c;
    public aid d = new a();

    public class a implements aid {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v18 */
        @Override // com.oplus.aiunit.vision.aid
        public void a(int i, int i2, byte[] bArr) throws Throwable {
            int iValueOf;
            MutableLiveData mutableLiveData;
            ArrayList arrayList;
            Throwable th;
            Exception e2;
            g46 g46Var;
            if (i != 1) {
                return;
            }
            if (i2 != 47) {
                try {
                    if (i2 == 48) {
                        try {
                            DMProto$CommonError from = DMProto$CommonError.parseFrom(bArr);
                            StringBuilder sb = new StringBuilder();
                            sb.append("receive setControlCenter:");
                            sb.append(from.getErrorCode());
                            int errorCode = from.getErrorCode();
                            MutableLiveData mutableLiveData2 = ControlCenterRepository.this.b;
                            this = this;
                            if (mutableLiveData2 != null) {
                                MutableLiveData mutableLiveData3 = ControlCenterRepository.this.b;
                                iValueOf = Integer.valueOf(errorCode);
                                mutableLiveData = mutableLiveData3;
                                mutableLiveData.postValue(iValueOf);
                                this = mutableLiveData;
                            }
                        } catch (Exception e3) {
                            a7b.b("ControlCenterRepository", "receive setControlCenter exception:" + e3.getMessage());
                            MutableLiveData mutableLiveData4 = ControlCenterRepository.this.b;
                            this = this;
                            if (mutableLiveData4 != null) {
                                iValueOf = 100001;
                                mutableLiveData = ControlCenterRepository.this.b;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (ControlCenterRepository.this.b != null) {
                        ControlCenterRepository.this.b.postValue(100001);
                    }
                    throw th2;
                }
            }
            try {
                arrayList = new ArrayList();
                try {
                    try {
                        DMProto$ControlCenterData from2 = DMProto$ControlCenterData.parseFrom(bArr);
                        int i3 = 0;
                        for (int i4 = 0; i4 < from2.getDataCount(); i4++) {
                            DMProto$ControlItem data = from2.getData(i4);
                            DragItemBean dragItemBean = new DragItemBean();
                            dragItemBean.setId(data.getId());
                            dragItemBean.setName(data.getName());
                            dragItemBean.setState(data.getState());
                            if (data.getId() == 5) {
                                dragItemBean.setCancelable(false);
                            }
                            if (dragItemBean.getBooleanState()) {
                                arrayList.add(i3, dragItemBean);
                                i3++;
                            } else {
                                arrayList.add(arrayList.size(), dragItemBean);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("receive ControlCenter:");
                            sb2.append(dragItemBean);
                        }
                        ControlCenterRepository.this.g(arrayList);
                        if (ControlCenterRepository.this.a != null) {
                            g46Var = new g46(100000, arrayList);
                            ControlCenterRepository.this.a.postValue(g46Var);
                        }
                    } catch (Exception e4) {
                        e2 = e4;
                        a7b.b("ControlCenterRepository", "parse ControlItem error:" + e2.getMessage());
                        if (ControlCenterRepository.this.a != null) {
                            g46Var = new g46(100001, arrayList);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (ControlCenterRepository.this.a != null) {
                        ControlCenterRepository.this.a.postValue(new g46(100001, arrayList));
                    }
                    throw th;
                }
            } catch (Exception e5) {
                arrayList = null;
                e2 = e5;
            } catch (Throwable th4) {
                arrayList = null;
                th = th4;
                if (ControlCenterRepository.this.a != null) {
                    ControlCenterRepository.this.a.postValue(new g46(100001, arrayList));
                }
                throw th;
            }
        }

        @Override // com.oplus.aiunit.vision.aid
        public void b(int i, int i2, byte[] bArr) {
            if (i == 1) {
                if (i2 == 47) {
                    if (ControlCenterRepository.this.a != null) {
                        ControlCenterRepository.this.a.postValue(new g46(jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT, null));
                        return;
                    }
                    return;
                }
                if (i2 != 48 || ControlCenterRepository.this.b == null) {
                    return;
                }
                ControlCenterRepository.this.b.postValue(Integer.valueOf(jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT));
            }
        }
    }

    public void c() {
        kr0.e().y(1, this.d);
    }

    public List<DragItemBean> d() {
        return (List) new Gson().fromJson(v9g.x("PreferenceSetttings").D("ControlCenter/" + this.f5455c), new TypeToken<List<DragItemBean>>() { // from class: com.heytap.health.settings.watch.preferences.controlcenter.ControlCenterRepository.2
        }.getType());
    }

    public void e(String str) {
        this.f5455c = str;
        kr0.e().g(1, this.d);
    }

    public void f(MutableLiveData<g46> mutableLiveData) {
        this.a = mutableLiveData;
        kr0.e().c();
    }

    public void g(List<DragItemBean> list) {
        String json = new Gson().toJson(list);
        v9g.x("PreferenceSetttings").U("ControlCenter/" + this.f5455c, json);
    }

    public void h(List<DragItemBean> list, MutableLiveData<Integer> mutableLiveData) {
        if (list == null) {
            a7b.m("ControlCenterRepository", "uppdateControlCenterData: list is null");
            return;
        }
        this.b = mutableLiveData;
        DMProto$ControlCenterData.Builder builderNewBuilder = DMProto$ControlCenterData.newBuilder();
        for (int i = 0; i < list.size(); i++) {
            DragItemBean dragItemBean = list.get(i);
            builderNewBuilder.addData(DMProto$ControlItem.newBuilder().setId(dragItemBean.getId()).setName(dragItemBean.getName()).setState(dragItemBean.getState()).build());
        }
        kr0.e().v(builderNewBuilder.build());
    }
}
