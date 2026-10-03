package com.heytap.accessory.sdp.service;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.heytap.accessory.base.bean.FrameworkServiceChannelDescription;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.base.database.h;
import com.heytap.accessory.base.database.l;
import com.heytap.accessory.base.database.q;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.sdp.service.protocol.ServiceDiscoveryUtils;
import com.heytap.accessory.utils.HexUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static final String f = "c";
    public final l a = new l();
    public SecureRandom d = new SecureRandom();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Long> f2656e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2655c = false;
    public final Map<String, FrameworkServiceDescription> b = new ConcurrentHashMap();

    public c(Handler handler) {
    }

    public Pair<Integer, FrameworkServiceDescription> b(FrameworkServiceDescription frameworkServiceDescription) {
        long jA = a(frameworkServiceDescription.i(), ServiceDiscoveryUtils.LOCAL_ADDRESS, 0);
        String strM = frameworkServiceDescription.m();
        int iO = frameworkServiceDescription.o();
        String strD = frameworkServiceDescription.d();
        if (!a(strM, Long.valueOf(jA), strD, iO, frameworkServiceDescription.b(), frameworkServiceDescription.c())) {
            return Pair.create(1, null);
        }
        FrameworkServiceDescription frameworkServiceDescriptionC = c(a(strM, Long.valueOf(jA), strD, Integer.valueOf(iO)));
        return (frameworkServiceDescriptionC == null || !ServiceDiscoveryUtils.matchLocalServiceDesc(frameworkServiceDescriptionC, frameworkServiceDescription)) ? Pair.create(3, frameworkServiceDescriptionC) : Pair.create(2, frameworkServiceDescriptionC);
    }

    @Nullable
    public FrameworkServiceDescription c(String str) {
        if (this.f2655c) {
            return this.b.get(str);
        }
        for (FrameworkServiceDescription frameworkServiceDescription : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true)) {
            if (frameworkServiceDescription.a().equalsIgnoreCase(str)) {
                return frameworkServiceDescription;
            }
        }
        return null;
    }

    public String d(String str) {
        return this.a.c(str);
    }

    public List<String> e() {
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkServiceDescription> it = (this.f2655c ? new ArrayList<>(this.b.values()) : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true)).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }

    public List<String> f() {
        HashSet hashSet = new HashSet();
        List<FrameworkServiceDescription> arrayList = this.f2655c ? new ArrayList<>(this.b.values()) : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true);
        com.heytap.accessory.base.logging.a.a(f + " - SLPTrack ", "retrievePersistentProfiles, mLocalCacheServiceRecords: " + ServiceDiscoveryUtils.getSimpleLogString(arrayList));
        for (FrameworkServiceDescription frameworkServiceDescription : arrayList) {
            String strM = frameworkServiceDescription.m();
            if (frameworkServiceDescription.k() == 1) {
                hashSet.add(strM);
            }
        }
        com.heytap.accessory.base.logging.a.a(f, "retrievePersistentProfiles, result: " + hashSet);
        return new ArrayList(hashSet);
    }

    public List<FrameworkServiceDescription> g(String str) {
        List<String> listA = a(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listA) {
            FrameworkServiceDescription frameworkServiceDescriptionC = c(String.valueOf(str2));
            if (frameworkServiceDescriptionC != null) {
                if (frameworkServiceDescriptionC.m().startsWith("system:")) {
                    com.heytap.accessory.base.logging.a.e(f, "removeLocalServicesExceptSystemAgent," + frameworkServiceDescriptionC.m() + " is system agent, not remove it");
                } else {
                    e(str2);
                    if (a(frameworkServiceDescriptionC, str2) == -1) {
                        com.heytap.accessory.base.logging.a.e(f, "Error while trying to remove component " + str2 + "from the Local DB!");
                    } else {
                        arrayList.add(frameworkServiceDescriptionC);
                    }
                }
            }
        }
        return arrayList;
    }

    public List<FrameworkServiceDescription> h(String str) {
        ArrayList arrayList = new ArrayList();
        for (FrameworkServiceDescription frameworkServiceDescription : this.f2655c ? new ArrayList<>(this.b.values()) : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true)) {
            if (str.equalsIgnoreCase(frameworkServiceDescription.d())) {
                arrayList.add(frameworkServiceDescription);
            }
        }
        return arrayList;
    }

    public void a() {
        if (this.f2655c) {
            return;
        }
        for (FrameworkServiceDescription frameworkServiceDescription : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true)) {
            com.heytap.accessory.base.logging.a.a(f, "cacheLocalServiceRecord:" + frameworkServiceDescription.m() + ",role:" + frameworkServiceDescription.o());
            this.b.put(frameworkServiceDescription.a(), frameworkServiceDescription);
        }
        this.f2655c = true;
    }

    public void d(String str, int i, int i2) {
        this.a.b(b(str, i, i2));
    }

    public int d() {
        return this.a.a();
    }

    public List<FrameworkServiceDescription> c(String str, int i, int i2) {
        return a(str, i, i2, false);
    }

    public void c(final com.heytap.accessory.base.bean.b bVar, final FrameworkServiceDescription frameworkServiceDescription) {
        AsyncTask.execute(new Runnable() { // from class: com.oplus.aiunit.vision.ikm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b(bVar, frameworkServiceDescription);
            }
        });
    }

    public List<FrameworkServiceDescription> a(int i, String str) {
        List<FrameworkServiceDescription> listA;
        ArrayList arrayList = new ArrayList();
        if (this.f2655c) {
            listA = new ArrayList<>(this.b.values());
        } else {
            listA = a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true);
        }
        for (FrameworkServiceDescription frameworkServiceDescription : listA) {
            if ((frameworkServiceDescription.i() & i) != 0 && str.equalsIgnoreCase(frameworkServiceDescription.m())) {
                com.heytap.accessory.base.logging.a.d(f, "getLocalServices :" + frameworkServiceDescription.m() + " " + frameworkServiceDescription.a() + " " + frameworkServiceDescription.o());
                arrayList.add(frameworkServiceDescription);
            }
        }
        return arrayList;
    }

    public final void c(FrameworkServiceDescription frameworkServiceDescription) {
        boolean z;
        Iterator<FrameworkServiceDescription> it = this.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            FrameworkServiceDescription next = it.next();
            if (next.m().equalsIgnoreCase(frameworkServiceDescription.m()) && next.d().equalsIgnoreCase(frameworkServiceDescription.d()) && next.o() == frameworkServiceDescription.o()) {
                z = true;
                break;
            }
        }
        if (z) {
            com.heytap.accessory.base.logging.a.e(f, "The service record for " + frameworkServiceDescription.d() + " is already present in the cached record!!");
            return;
        }
        String str = f;
        com.heytap.accessory.base.logging.a.a(str, "updateCachedRecord mServiceRecords put" + frameworkServiceDescription.m());
        this.b.put(frameworkServiceDescription.a(), frameworkServiceDescription);
        this.f2655c = true;
        com.heytap.accessory.base.logging.a.d(str, "Cached service record <" + frameworkServiceDescription.a() + "> " + frameworkServiceDescription.m());
    }

    public final void e(String str) {
        this.f2656e.remove(Long.valueOf(Long.parseLong(str)));
        FrameworkServiceDescription frameworkServiceDescriptionRemove = this.b.remove(str);
        if (frameworkServiceDescriptionRemove != null) {
            com.heytap.accessory.base.logging.a.a(f, "cleared cached entry <" + str + "> " + frameworkServiceDescriptionRemove.m());
        }
    }

    public int b(String str, String str2) {
        for (Map.Entry<String, List<String>> entry : com.heytap.accessory.misc.utils.b.a(PlatformUtils.getContext()).b().entrySet()) {
            List<String> value = entry.getValue();
            if (entry.getKey().equalsIgnoreCase(str) && value.contains(str2)) {
                return 0;
            }
        }
        for (Map.Entry<String, List<String>> entry2 : com.heytap.accessory.misc.utils.b.a(PlatformUtils.getContext()).a().entrySet()) {
            List<String> value2 = entry2.getValue();
            if (entry2.getKey().equalsIgnoreCase(str) && value2.contains(str2)) {
                return 1;
            }
        }
        return 2;
    }

    public List<FrameworkServiceDescription> f(String str) {
        List<String> listA = a(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listA) {
            FrameworkServiceDescription frameworkServiceDescriptionC = c(String.valueOf(str2));
            if (frameworkServiceDescriptionC != null) {
                e(str2);
                if (a(frameworkServiceDescriptionC, str2) == -1) {
                    com.heytap.accessory.base.logging.a.e(f, "Error while trying to remove component " + str2 + "from the Local DB!");
                } else {
                    arrayList.add(frameworkServiceDescriptionC);
                }
            }
        }
        return arrayList;
    }

    public List<FrameworkServiceDescription> a(int i) {
        List<FrameworkServiceDescription> listA;
        ArrayList arrayList = new ArrayList();
        if (this.f2655c) {
            listA = new ArrayList<>(this.b.values());
        } else {
            listA = a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true);
        }
        for (FrameworkServiceDescription frameworkServiceDescription : listA) {
            if ((frameworkServiceDescription.i() & i) != 0) {
                arrayList.add(frameworkServiceDescription);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.heytap.accessory.base.bean.b bVar, FrameworkServiceDescription frameworkServiceDescription) {
        List<h> listB = this.a.b(bVar.d(), bVar.h(), bVar.F());
        if (listB == null || listB.isEmpty()) {
            return;
        }
        int iA = this.a.a(listB.get(0).c(), frameworkServiceDescription.a());
        Log.d(f, "removeRemoteService result: " + iA + " sd: " + frameworkServiceDescription);
        this.a.a(frameworkServiceDescription.a());
    }

    public long c() {
        return ((long) this.d.nextInt(65279)) + 1;
    }

    public FrameworkServiceDescription a(String str, String str2) {
        List<FrameworkServiceDescription> listA;
        if (this.f2655c) {
            listA = new ArrayList<>(this.b.values());
        } else {
            listA = a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true);
        }
        for (FrameworkServiceDescription frameworkServiceDescription : listA) {
            if (str.equals(frameworkServiceDescription.d()) && str2.equals(frameworkServiceDescription.b())) {
                return frameworkServiceDescription;
            }
        }
        return null;
    }

    public List<FrameworkServiceChannelDescription> b(long j2) {
        ArrayList arrayList = new ArrayList();
        try {
            List<com.heytap.accessory.base.database.d> listA = a(j2);
            if (listA != null && !listA.isEmpty()) {
                for (com.heytap.accessory.base.database.d dVar : listA) {
                    arrayList.add(new FrameworkServiceChannelDescription(dVar.b(), dVar.f(), dVar.d(), dVar.c()));
                }
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public d a(FrameworkServiceDescription frameworkServiceDescription) {
        long jC;
        long j2;
        if (frameworkServiceDescription == null) {
            return null;
        }
        String strD = frameworkServiceDescription.d();
        if (strD == null || strD.length() == 0) {
            return null;
        }
        long jA = a(frameworkServiceDescription.i(), ServiceDiscoveryUtils.LOCAL_ADDRESS, 0);
        if (-1 == jA) {
            com.heytap.accessory.base.logging.a.b(f, "Failed to addOrUpdateDevice");
            return null;
        }
        d dVar = new d();
        b();
        do {
            jC = c();
        } while (this.f2656e.contains(Long.valueOf(jC)));
        String str = f;
        com.heytap.accessory.base.logging.a.a(str, "addLocalService, " + frameworkServiceDescription.m() + " agentId is " + jC);
        int iB = b(strD, frameworkServiceDescription.m());
        d dVar2 = dVar;
        q qVar = new q(frameworkServiceDescription.m(), frameworkServiceDescription.i(), strD, frameworkServiceDescription.c(), jA, frameworkServiceDescription.n(), String.valueOf(frameworkServiceDescription.k()), iB, frameworkServiceDescription.o(), frameworkServiceDescription.j(), frameworkServiceDescription.r(), jC, frameworkServiceDescription.q(), frameworkServiceDescription.h(), frameworkServiceDescription.b(), frameworkServiceDescription.p(), frameworkServiceDescription.e());
        long jA2 = a(qVar);
        if (-1 == jA2) {
            com.heytap.accessory.base.logging.a.b(str, "Failed to insertOrUpdateServiceInfo");
            return null;
        }
        if (0 == jA2) {
            String strA = a(qVar.m(), Long.valueOf(qVar.h()), qVar.d(), Integer.valueOf(qVar.n()));
            com.heytap.accessory.base.logging.a.c(str, "Entry already existes for " + frameworkServiceDescription.d() + ". Retrieved old agent ID : " + strA);
            FrameworkServiceDescription frameworkServiceDescriptionC = c(strA);
            if (frameworkServiceDescriptionC != null && ServiceDiscoveryUtils.matchLocalServiceDesc(frameworkServiceDescriptionC, frameworkServiceDescription)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(frameworkServiceDescriptionC);
                dVar2.a(arrayList);
                dVar2.a(2);
                return dVar2;
            }
            com.heytap.accessory.base.logging.a.c(str, "Old Service description is null or does not match with new description!");
            if (frameworkServiceDescriptionC != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(frameworkServiceDescriptionC);
                dVar2.b(arrayList2);
                dVar2.a(3);
            }
            if (!TextUtils.isEmpty(strA)) {
                j2 = Long.parseLong(strA);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(strA);
                a(arrayList3);
            } else {
                if (strA.isEmpty()) {
                    com.heytap.accessory.base.logging.a.c(str, "old agent ID is Null, remove...");
                    this.b.remove(strA);
                    this.a.a(strA, qVar.m(), qVar.h(), qVar.d(), qVar.n());
                }
                j2 = jC;
            }
            a(frameworkServiceDescription.f(), j2);
            qVar.a(j2);
            if (-1 == a(qVar)) {
                com.heytap.accessory.base.logging.a.b(str, "Failed to insertOrUpdateServiceInfo");
                return null;
            }
        } else {
            dVar2 = dVar2;
            j2 = jC;
        }
        a(frameworkServiceDescription.f(), j2);
        FrameworkServiceDescription frameworkServiceDescription2 = new FrameworkServiceDescription(frameworkServiceDescription.d(), frameworkServiceDescription.c(), String.valueOf(j2), frameworkServiceDescription.f(), frameworkServiceDescription.i(), iB, frameworkServiceDescription.m(), frameworkServiceDescription.n(), frameworkServiceDescription.o(), frameworkServiceDescription.j(), frameworkServiceDescription.r(), 1, frameworkServiceDescription.q(), frameworkServiceDescription.h(), frameworkServiceDescription.p(), frameworkServiceDescription.b(), frameworkServiceDescription.e());
        this.f2656e.add(Long.valueOf(j2));
        c(frameworkServiceDescription2);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(frameworkServiceDescription2);
        dVar2.a(arrayList4);
        if (dVar2.c() != 0) {
            return dVar2;
        }
        dVar2.a(1);
        return dVar2;
    }

    public void b() {
        if (this.f2656e.isEmpty()) {
            com.heytap.accessory.base.logging.a.a(f, "List of used UIDs is empty. Fetching from the database instead ...");
            this.f2656e.addAll(this.a.c());
        }
    }

    public List<q> b(int i) {
        return this.a.a(i);
    }

    public int b(String str) {
        List<h> listB = this.a.b(str);
        if (listB == null || listB.isEmpty()) {
            return -1;
        }
        return listB.get(0).c();
    }

    public int b(String str, int i, int i2) {
        List<h> listA = this.a.a(str, i, i2);
        if (listA == null || listA.isEmpty()) {
            return -1;
        }
        return listA.get(0).c();
    }

    public String a(com.heytap.accessory.base.bean.b bVar, FrameworkServiceDescription frameworkServiceDescription) {
        if (frameworkServiceDescription == null) {
            return "";
        }
        long jA = a(bVar.h(), bVar.d(), bVar.F());
        if (-1 == jA) {
            com.heytap.accessory.base.logging.a.b(f, "Failed to addOrUpdateDevice");
            return "";
        }
        if (frameworkServiceDescription.f() != null) {
            a(frameworkServiceDescription.f(), Long.parseLong(frameworkServiceDescription.a()));
        }
        long jA2 = a(new q(frameworkServiceDescription.m(), frameworkServiceDescription.i(), frameworkServiceDescription.d(), frameworkServiceDescription.c(), jA, frameworkServiceDescription.n(), String.valueOf(frameworkServiceDescription.k()), 0, frameworkServiceDescription.o(), frameworkServiceDescription.j(), frameworkServiceDescription.r(), Long.parseLong(frameworkServiceDescription.a()), frameworkServiceDescription.q(), frameworkServiceDescription.h(), frameworkServiceDescription.b(), frameworkServiceDescription.p(), frameworkServiceDescription.e()));
        String str = f;
        com.heytap.accessory.base.logging.a.a(str, "addRemoteService, " + frameworkServiceDescription.m() + " getComponentId is " + frameworkServiceDescription.a() + " packageName: " + frameworkServiceDescription.d());
        if (-1 != jA2) {
            return String.valueOf(jA2);
        }
        com.heytap.accessory.base.logging.a.b(str, "Failed to insertOrUpdateServiceInfo");
        return "";
    }

    public boolean a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            FrameworkServiceDescription frameworkServiceDescriptionC = c(String.valueOf(str));
            if (frameworkServiceDescriptionC != null) {
                arrayList.add(frameworkServiceDescriptionC);
                e(str);
                if (a(frameworkServiceDescriptionC, str) == -1) {
                    com.heytap.accessory.base.logging.a.e(f, "Error while trying to remove component " + str + "from the Local DB!");
                    return false;
                }
            }
        }
        return true;
    }

    public List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        for (FrameworkServiceDescription frameworkServiceDescription : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true)) {
            if (str.equalsIgnoreCase(frameworkServiceDescription.d())) {
                arrayList.add(frameworkServiceDescription.a());
            }
        }
        return arrayList;
    }

    public void a(com.heytap.accessory.base.bean.b bVar, List<FrameworkServiceDescription> list, int i) {
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            bVar.a(frameworkServiceDescription);
            if (Integer.parseInt(frameworkServiceDescription.a()) <= ServiceDiscoveryUtils.AF_SERVICE_COMPONENT_ID_USABLE_LIMIT) {
                a(bVar, frameworkServiceDescription);
            } else {
                com.heytap.accessory.base.logging.a.e(f, "updateService agentId >= 65280: " + frameworkServiceDescription.m());
            }
        }
        if (list.isEmpty()) {
            a((int) bVar.l(), bVar.d(), bVar.F());
        }
        a(bVar, i);
    }

    public String a(String str, Long l2, String str2, Integer num) {
        return this.a.a(str, l2, str2, num);
    }

    public int a(FrameworkServiceDescription frameworkServiceDescription, String str) {
        int iB = (int) this.a.b(Long.parseLong(str));
        this.a.a(str);
        return iB;
    }

    public List<FrameworkServiceDescription> a(String str, boolean z) {
        return a(str, 0, 0, z);
    }

    public List<FrameworkServiceDescription> a(String str, int i, int i2, boolean z) {
        int iB;
        int i3;
        int i4;
        int iP;
        int iO;
        String strB;
        c cVar = this;
        ArrayList arrayList = new ArrayList();
        String str2 = f;
        com.heytap.accessory.base.logging.a.a(str2, "address:" + HexUtils.hideAddress(str) + " transportType:" + i + " uuid:" + i2);
        if (z) {
            iB = b(str);
        } else {
            iB = b(str, i, i2);
        }
        if (iB == -1) {
            com.heytap.accessory.base.logging.a.e(str2, "deviceId == -1,get service failed!!");
            return arrayList;
        }
        List<q> listB = cVar.b(iB);
        if (listB != null && !listB.isEmpty()) {
            for (q qVar : listB) {
                try {
                    int iR = qVar.r();
                    String strM = qVar.m();
                    String strE = qVar.e();
                    long jA = qVar.a();
                    int iN = qVar.n();
                    List<FrameworkServiceChannelDescription> listB2 = cVar.b(jA);
                    int iG = qVar.g();
                    int iJ = qVar.j();
                    int iQ = qVar.q();
                    String strD = qVar.d();
                    String strC = qVar.c();
                    int iF = qVar.f();
                    if (z) {
                        int i5 = Integer.parseInt(qVar.k());
                        int iL = qVar.l();
                        iP = qVar.p();
                        iO = qVar.o();
                        strB = qVar.b();
                        i3 = iL;
                        i4 = i5;
                    } else {
                        i3 = 0;
                        i4 = 0;
                        iP = 0;
                        iO = 0;
                        strB = "";
                    }
                    if (iN != 0) {
                        iN = 1;
                    }
                    arrayList.add(new FrameworkServiceDescription(strD, strC, String.valueOf(jA), listB2, iR, i3, strM, strE, iN, iJ, iQ, i4, iP, iG, iO, strB, iF));
                } catch (Exception e2) {
                    com.heytap.accessory.base.logging.a.e(f, e2 + "on getServiceFromDb");
                }
                cVar = this;
            }
            com.heytap.accessory.base.logging.a.a(f, "getServiceFromDb : " + ServiceDiscoveryUtils.getSimpleLogString(arrayList));
        }
        return arrayList;
    }

    public void a(com.heytap.accessory.base.bean.b bVar, int i) {
        int iB = b(bVar.d(), bVar.h(), bVar.F());
        h hVar = new h();
        hVar.b(iB);
        hVar.a(i);
        hVar.a("Remote");
        hVar.b(bVar.d());
        hVar.c(bVar.h());
        hVar.d(bVar.F());
        this.a.b(hVar);
    }

    public long a(int i, String str, int i2) {
        h hVar = new h(i, str, i2);
        if (str.equalsIgnoreCase(ServiceDiscoveryUtils.LOCAL_ADDRESS)) {
            hVar.a("Local");
        } else {
            hVar.a("Remote");
        }
        hVar.a(0);
        return this.a.a(hVar);
    }

    public void a(List<FrameworkServiceChannelDescription> list, long j2) {
        ArrayList arrayList = new ArrayList();
        for (FrameworkServiceChannelDescription frameworkServiceChannelDescription : list) {
            com.heytap.accessory.base.database.d dVar = new com.heytap.accessory.base.database.d();
            dVar.a(j2);
            dVar.a(frameworkServiceChannelDescription.a());
            dVar.b(frameworkServiceChannelDescription.b());
            dVar.e(frameworkServiceChannelDescription.c());
            dVar.c(frameworkServiceChannelDescription.d());
            arrayList.add(dVar);
        }
        this.a.a(arrayList);
    }

    public long a(String str, int i, int i2) {
        return this.a.c(str, i, i2);
    }

    public long a(q qVar) {
        return this.a.a(qVar);
    }

    public boolean a(String str, Long l2, String str2, int i, String str3, String str4) {
        for (FrameworkServiceDescription frameworkServiceDescription : a(ServiceDiscoveryUtils.LOCAL_ADDRESS, true)) {
            if (!str.equals(frameworkServiceDescription.m()) && str3.equals(frameworkServiceDescription.b()) && str2.equals(frameworkServiceDescription.d())) {
                if (str4.equals(frameworkServiceDescription.c()) && i == frameworkServiceDescription.o()) {
                    String str5 = f;
                    com.heytap.accessory.base.logging.a.c(str5, "only profileId changed, so replace it, old:" + frameworkServiceDescription.m() + " to new:" + str);
                    FrameworkServiceDescription frameworkServiceDescriptionRemove = this.b.remove(frameworkServiceDescription.a());
                    if (frameworkServiceDescriptionRemove == null) {
                        com.heytap.accessory.base.logging.a.a(str5, "removeDes is null");
                    } else {
                        com.heytap.accessory.base.logging.a.a(str5, "removeDes is " + frameworkServiceDescriptionRemove.toString());
                    }
                    this.a.a(frameworkServiceDescription.a(), frameworkServiceDescription.m(), 1L, frameworkServiceDescription.d(), frameworkServiceDescription.o());
                    return true;
                }
            }
        }
        return this.a.a(str, l2, str2, i) != -1;
    }

    public List<com.heytap.accessory.base.database.d> a(long j2) {
        return this.a.a(j2);
    }
}
