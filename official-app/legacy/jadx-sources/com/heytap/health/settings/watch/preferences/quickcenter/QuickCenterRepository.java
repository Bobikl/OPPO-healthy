package com.heytap.health.settings.watch.preferences.quickcenter;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.protocol.dm.DMProto$AppItem;
import com.heytap.health.protocol.dm.DMProto$CommonError;
import com.heytap.health.protocol.dm.DMProto$DeviceAppData;
import com.heytap.health.settings.watch.preferences.dragutils.DragItemBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aid;
import com.oplus.aiunit.vision.g46;
import com.oplus.aiunit.vision.ioh;
import com.oplus.aiunit.vision.jp6;
import com.oplus.aiunit.vision.kr0;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.xm3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class QuickCenterRepository {
    public MutableLiveData<g46> a;
    public MutableLiveData<Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xm3 f5465c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5466e;
    public aid f = new a();

    public class a implements aid {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0107  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [int] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v21, types: [java.util.List] */
        @Override // com.oplus.aiunit.vision.aid
        public void a(int i, int i2, byte[] bArr) throws Throwable {
            xm3 xm3Var;
            int iValueOf;
            Throwable th;
            List<DragItemBean> arrayList;
            Exception e2;
            if (i != 1) {
                return;
            }
            if (i2 == 74) {
                List<DragItemBean> listI = null;
                try {
                    try {
                        arrayList = new ArrayList<>();
                        try {
                            DMProto$DeviceAppData from = DMProto$DeviceAppData.parseFrom(bArr);
                            int i3 = 0;
                            for (int i4 = 0; i4 < from.getDataCount(); i4++) {
                                DragItemBean dragItemBean = new DragItemBean();
                                DMProto$AppItem data = from.getData(i4);
                                dragItemBean.setId(data.getId());
                                dragItemBean.setName(data.getName());
                                dragItemBean.setState(data.getState());
                                if (data.getId() == 0) {
                                    dragItemBean.setCancelable(false);
                                    dragItemBean.setMoved(false);
                                    arrayList.add(0, dragItemBean);
                                } else {
                                    dragItemBean.setCancelable(data.getId() != 25);
                                    if (dragItemBean.getBooleanState()) {
                                        arrayList.add(i3, dragItemBean);
                                    } else {
                                        arrayList.add(arrayList.size(), dragItemBean);
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("receive quickCenter:");
                                    sb.append(dragItemBean);
                                }
                                i3++;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("receive quickCenter:");
                                sb2.append(dragItemBean);
                            }
                            listI = ((Boolean) lc5.c(QuickCenterRepository.this.d).a(new ioh())).booleanValue() ? QuickCenterRepository.this.i(arrayList) : arrayList;
                            QuickCenterRepository.this.l(listI);
                            if (QuickCenterRepository.this.a != null) {
                                QuickCenterRepository.this.a.postValue(new g46(100000, listI));
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            a7b.b("QuickCenterRepository", "parse ControlItem error:" + e2.getMessage());
                            if (QuickCenterRepository.this.a != null) {
                                QuickCenterRepository.this.a.postValue(new g46(100001, arrayList));
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (QuickCenterRepository.this.a != null) {
                            QuickCenterRepository.this.a.postValue(new g46(100001, i2));
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    arrayList = listI;
                    e2 = e4;
                } catch (Throwable th3) {
                    i2 = listI;
                    th = th3;
                    if (QuickCenterRepository.this.a != null) {
                        QuickCenterRepository.this.a.postValue(new g46(100001, i2));
                    }
                    throw th;
                }
            } else {
                if (i2 != 75) {
                    return;
                }
                try {
                    try {
                        DMProto$CommonError from2 = DMProto$CommonError.parseFrom(bArr);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("receive setQuickCenter:");
                        sb3.append(from2.getErrorCode());
                        int errorCode = from2.getErrorCode();
                        if (QuickCenterRepository.this.b != null) {
                            QuickCenterRepository.this.b.postValue(Integer.valueOf(errorCode));
                        }
                        if (QuickCenterRepository.this.f5465c != null) {
                            xm3Var = QuickCenterRepository.this.f5465c;
                            iValueOf = Integer.valueOf(errorCode);
                            xm3Var.onResult(iValueOf);
                        }
                    } catch (Exception e5) {
                        a7b.b("QuickCenterRepository", "receive setQuickCenter exception:" + e5.getMessage());
                        if (QuickCenterRepository.this.b != null) {
                            QuickCenterRepository.this.b.postValue(100001);
                        }
                        if (QuickCenterRepository.this.f5465c == null) {
                            return;
                        }
                        xm3Var = QuickCenterRepository.this.f5465c;
                        iValueOf = 100001;
                    }
                } catch (Throwable th4) {
                    if (QuickCenterRepository.this.b != null) {
                        QuickCenterRepository.this.b.postValue(100001);
                    }
                    if (QuickCenterRepository.this.f5465c != null) {
                        QuickCenterRepository.this.f5465c.onResult(100001);
                    }
                    throw th4;
                }
            }
        }

        @Override // com.oplus.aiunit.vision.aid
        public void b(int i, int i2, byte[] bArr) {
            if (i == 1) {
                if (i2 == 74) {
                    if (QuickCenterRepository.this.a != null) {
                        QuickCenterRepository.this.a.postValue(new g46(jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT, null));
                    }
                    if (QuickCenterRepository.this.f5465c != null) {
                        QuickCenterRepository.this.f5465c.onResult(Integer.valueOf(jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT));
                        return;
                    }
                    return;
                }
                if (i2 == 75) {
                    if (QuickCenterRepository.this.b != null) {
                        QuickCenterRepository.this.b.postValue(Integer.valueOf(jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT));
                    }
                    if (QuickCenterRepository.this.f5465c != null) {
                        QuickCenterRepository.this.f5465c.onResult(Integer.valueOf(jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT));
                    }
                }
            }
        }
    }

    public void f() {
        kr0.e().y(1, this.f);
    }

    public final int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            Matcher matcher = Pattern.compile("[a-zA-Z].\\d{2}_\\d{4}").matcher(str);
            if (matcher.find()) {
                int iStart = matcher.start();
                String[] strArrSplit = str.substring(iStart, (matcher.end() - iStart) + iStart).split("_");
                int iIntValue = Integer.valueOf(strArrSplit[1]).intValue() | (Integer.valueOf(strArrSplit[0].split("\\.")[1]).intValue() << 16);
                StringBuilder sb = new StringBuilder();
                sb.append("version:");
                sb.append((iIntValue >> 16) & 65535);
                sb.append(" ");
                sb.append(iIntValue & 65535);
                return iIntValue;
            }
        } catch (Exception e2) {
            a7b.b("QuickCenterRepository", "getFirmwareVersion error:" + e2.getMessage());
        }
        return 0;
    }

    public List<DragItemBean> h() {
        return (List) new Gson().fromJson(v9g.x("PreferenceSetttings").D("QuickCenter/" + this.d), new TypeToken<List<DragItemBean>>() { // from class: com.heytap.health.settings.watch.preferences.quickcenter.QuickCenterRepository.2
        }.getType());
    }

    public final List<DragItemBean> i(List<DragItemBean> list) {
        DragItemBean next;
        xm3 xm3Var;
        int iG = g(this.f5466e);
        if (iG > 131258 || iG == 0) {
            xm3 xm3Var2 = this.f5465c;
            if (xm3Var2 != null) {
                xm3Var2.onResult(100000);
            }
            return list;
        }
        Iterator<DragItemBean> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.getId() == 7) {
                next.setHided(true);
                break;
            }
        }
        if (next == null) {
            return list;
        }
        if (next.getBooleanState()) {
            next.setBooleanState(false);
            list.remove(next);
            list.add(next);
            n(list, null);
        } else if (!next.getBooleanState() && (xm3Var = this.f5465c) != null) {
            xm3Var.onResult(100000);
        }
        return list;
    }

    public void j(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("init:");
        sb.append(str);
        sb.append(",version:");
        sb.append(this.f5466e);
        this.d = str;
        this.f5466e = str2;
        kr0.e().g(1, this.f);
    }

    public void k(MutableLiveData<g46> mutableLiveData) {
        this.a = mutableLiveData;
        kr0.e().f();
    }

    public void l(List<DragItemBean> list) {
        String json = new Gson().toJson(list);
        v9g.x("PreferenceSetttings").U("QuickCenter/" + this.d, json);
    }

    public void m(xm3<Integer> xm3Var) {
        this.f5465c = xm3Var;
        kr0.e().f();
    }

    public void n(List<DragItemBean> list, MutableLiveData<Integer> mutableLiveData) {
        if (list == null) {
            a7b.m("QuickCenterRepository", "updateQuickCenterList: list is null");
            return;
        }
        this.b = mutableLiveData;
        DMProto$DeviceAppData.Builder builderNewBuilder = DMProto$DeviceAppData.newBuilder();
        for (int i = 0; i < list.size(); i++) {
            DragItemBean dragItemBean = list.get(i);
            a7b.f("QuickCenterRepository", "updateQuickCenter item: " + dragItemBean.toString());
            builderNewBuilder.addData(DMProto$AppItem.newBuilder().setId(dragItemBean.getId()).setName(dragItemBean.getName()).setState(dragItemBean.getState()).build());
        }
        kr0.e().x(builderNewBuilder.build());
    }
}
