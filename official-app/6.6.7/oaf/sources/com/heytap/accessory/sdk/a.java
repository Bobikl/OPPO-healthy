package com.heytap.accessory.sdk;

import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.ServiceProfile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static PeerAccessory a(com.heytap.accessory.base.bean.b bVar) {
        bVar.a();
        boolean z = false;
        boolean z2 = false;
        for (FrameworkServiceDescription frameworkServiceDescription : bVar.x()) {
            if ("system:filetransfer".equals(frameworkServiceDescription.m())) {
                z = true;
            }
            if ("system:streamtransfer".equals(frameworkServiceDescription.m())) {
                z2 = true;
            }
        }
        return new PeerAccessory(bVar.H(), bVar.l(), bVar.d(), bVar.k(), bVar.h(), bVar.F(), bVar.s(), bVar.G(), bVar.v() - 1, bVar.c(), (bVar.v() - 7) - 1, bVar.j(), bVar.p(), bVar.N(), z, bVar.L(), z2, bVar.M() ? 1 : 0, bVar.t(), bVar.i());
    }

    public static ArrayList<ServiceProfile> a(List<FrameworkServiceDescription> list) {
        ArrayList<ServiceProfile> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("get available services profile:[ ");
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            sb.append(frameworkServiceDescription.m());
            sb.append(", ");
            arrayList.add(new ServiceProfile(frameworkServiceDescription.m(), frameworkServiceDescription.d(), frameworkServiceDescription.o(), frameworkServiceDescription.b(), frameworkServiceDescription.n(), frameworkServiceDescription.q(), frameworkServiceDescription.h(), frameworkServiceDescription.h(), null, frameworkServiceDescription.j(), frameworkServiceDescription.j(), frameworkServiceDescription.e()));
        }
        sb.append(" ]");
        com.heytap.accessory.base.logging.a.a(sb.toString());
        com.heytap.accessory.base.logging.a.a("get services profile sizes:" + arrayList.size());
        return arrayList;
    }

    public static long a(PeerAccessory peerAccessory) {
        return peerAccessory.getId();
    }
}
