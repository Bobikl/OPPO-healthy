package com.heytap.health.watch.contactsync.ui.model;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi;
import com.heytap.health.watch.contactsync.ContactSyncOnceApi;
import com.heytap.health.watch.contactsync.db.table.DBSelectContactLite;
import com.heytap.health.watch.contactsync.ui.bean.ContactItemBean;
import com.heytap.health.watch.contactsync.ui.model.ContactViewModel;
import com.oplus.aiunit.vision.bdd;
import com.oplus.aiunit.vision.ccd;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.u64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ContactViewModel extends BaseViewModel {
    public static final String TAG = "ContactViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<List<ContactItemBean>> f6485j = new MutableLiveData<>();
    public MutableLiveData<Integer> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.a f6486l;
    public io.reactivex.rxjava3.disposables.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.a f6487n;
    public io.reactivex.rxjava3.disposables.a o;
    public String p;

    public static class ContactViewModelFactory implements ViewModelProvider.Factory {
        public String a;

        public ContactViewModelFactory(String str) {
            this.a = str;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public <T extends ViewModel> T create(@NonNull Class<T> cls) {
            return new ContactViewModel(this.a);
        }
    }

    public interface a {
        void a(boolean z);
    }

    public interface b {
        void a(List<ContactItemBean> list);
    }

    public ContactViewModel(String str) {
        this.p = str;
    }

    public static /* synthetic */ void O(b bVar, List list) throws Throwable {
        u64.a(TAG, "success!!!--->" + list.toString(), new Object[0]);
        bVar.a(list);
    }

    public static /* synthetic */ void P(Throwable th) throws Throwable {
        u64.c(TAG, th.getMessage(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(List list, ccd ccdVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        Iterator it = arrayList3.iterator();
        int i = 0;
        while (it.hasNext()) {
            ContactItemBean contactItemBean = (ContactItemBean) it.next();
            if (contactItemBean.isSelect()) {
                arrayList.add(Long.valueOf(contactItemBean.get_id()));
                it.remove();
            } else {
                DBSelectContactLite dBSelectContactLite = new DBSelectContactLite(this.p, contactItemBean.get_id());
                dBSelectContactLite.setName(contactItemBean.getName());
                dBSelectContactLite.setSort(i);
                arrayList2.add(dBSelectContactLite);
                i++;
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        u64.a(TAG, "delete id-->" + Arrays.toString(jArr), new Object[0]);
        if (ContactSyncDatabaseOnceApi.g(this.p, jArr, arrayList2) != null) {
            if (arrayList3.size() == 0) {
                u64.a(TAG, "no result", new Object[0]);
                arrayList3.add(new ContactItemBean(4));
            }
            list = arrayList3;
        }
        ccdVar.onNext(list);
        ccdVar.onComplete();
    }

    public static /* synthetic */ int R(LongSparseArray longSparseArray, ContactItemBean contactItemBean, ContactItemBean contactItemBean2) {
        return ((Integer) longSparseArray.get(contactItemBean.get_id(), 0)).intValue() - ((Integer) longSparseArray.get(contactItemBean2.get_id(), 0)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(ccd ccdVar) throws Throwable {
        u64.a(TAG, "get sync contact start!!!", new Object[0]);
        List<DBSelectContactLite> listI = ContactSyncDatabaseOnceApi.i(this.p);
        ArrayList arrayList = new ArrayList();
        if (listI != null && listI.size() > 0) {
            final LongSparseArray longSparseArray = new LongSparseArray(listI.size());
            StringBuilder sb = new StringBuilder("_id in (");
            ArrayList arrayList2 = new ArrayList();
            for (DBSelectContactLite dBSelectContactLite : listI) {
                sb.append("?,");
                arrayList2.add(dBSelectContactLite.getContactId() + "");
                longSparseArray.append(dBSelectContactLite.getContactId(), Integer.valueOf(dBSelectContactLite.getSort()));
            }
            sb.deleteCharAt(sb.lastIndexOf(",")).append(")");
            try {
                Cursor cursorQuery = BaseApplication.a().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, ContactSelectViewModel.PROJECTION_CONTACT, sb.toString(), (String[]) arrayList2.toArray(new String[0]), null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            ContactItemBean contactItemBean = new ContactItemBean(1);
                            String string = cursorQuery.getString(1);
                            if (TextUtils.isEmpty(string)) {
                                string = "";
                            }
                            contactItemBean.setName(string);
                            contactItemBean.set_id(cursorQuery.getInt(0));
                            arrayList.add(contactItemBean);
                        } catch (Throwable th) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    Collections.sort(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.c64
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ContactViewModel.R(longSparseArray, (ContactItemBean) obj, (ContactItemBean) obj2);
                        }
                    });
                    u64.a(TAG, "query size:" + arrayList.size(), new Object[0]);
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                u64.a(TAG, "query ContentResolver error!!!" + e2.getMessage(), new Object[0]);
            }
        }
        if (arrayList.size() == 0) {
            u64.a(TAG, "no result", new Object[0]);
            arrayList.add(new ContactItemBean(4));
        }
        ccdVar.onNext(arrayList);
        ccdVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(List list) throws Throwable {
        this.f6485j.postValue(list);
    }

    public static /* synthetic */ void U(Throwable th) throws Throwable {
        u64.c(TAG, th.getMessage(), new Object[0]);
    }

    public static /* synthetic */ int V(DBSelectContactLite dBSelectContactLite, DBSelectContactLite dBSelectContactLite2) {
        return dBSelectContactLite.getSort() - dBSelectContactLite2.getSort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(ccd ccdVar) throws Throwable {
        int i = 0;
        u64.a(TAG, "update contact start!!!", new Object[0]);
        try {
            List<DBSelectContactLite> listI = ContactSyncDatabaseOnceApi.i(this.p);
            if (listI == null || listI.size() <= 0) {
                ccdVar.onComplete();
                return;
            }
            LongSparseArray longSparseArray = new LongSparseArray(listI.size());
            StringBuilder sb = new StringBuilder("_id in (");
            ArrayList arrayList = new ArrayList();
            for (DBSelectContactLite dBSelectContactLite : listI) {
                sb.append("?,");
                arrayList.add(dBSelectContactLite.getContactId() + "");
                longSparseArray.append(dBSelectContactLite.getContactId(), Integer.valueOf(dBSelectContactLite.getSort()));
            }
            sb.deleteCharAt(sb.lastIndexOf(",")).append(")");
            try {
                Cursor cursorQuery = BaseApplication.a().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, ContactSelectViewModel.PROJECTION_CONTACT, sb.toString(), (String[]) arrayList.toArray(new String[0]), null);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            DBSelectContactLite dBSelectContactLite2 = new DBSelectContactLite(this.p, cursorQuery.getInt(0));
                            String string = cursorQuery.getString(1);
                            if (TextUtils.isEmpty(string)) {
                                dBSelectContactLite2.setName("");
                            } else {
                                dBSelectContactLite2.setName(string);
                            }
                            Integer num = (Integer) longSparseArray.get(dBSelectContactLite2.getContactId());
                            if (num != null) {
                                dBSelectContactLite2.setSort(num.intValue());
                            }
                            arrayList2.add(dBSelectContactLite2);
                        }
                    }
                    Collections.sort(arrayList2, new Comparator() { // from class: com.oplus.aiunit.vision.m64
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ContactViewModel.V((DBSelectContactLite) obj, (DBSelectContactLite) obj2);
                        }
                    });
                    if (arrayList2.size() > 0 && arrayList2.size() != listI.size()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((DBSelectContactLite) it.next()).setSort(i);
                            i++;
                        }
                    }
                    ccdVar.onNext(arrayList2);
                    ccdVar.onComplete();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                ccdVar.onError(e2);
            }
        } catch (Exception e3) {
            ccdVar.onError(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd X(List list) throws Throwable {
        List<DBSelectContactLite> listF = ContactSyncDatabaseOnceApi.f(this.p, list);
        if (listF == null) {
            return lbd.O(new Exception("db update error!!!!"));
        }
        ArrayList arrayList = new ArrayList();
        for (DBSelectContactLite dBSelectContactLite : listF) {
            ContactItemBean contactItemBean = new ContactItemBean(1);
            contactItemBean.setName(dBSelectContactLite.getName());
            contactItemBean.set_id(dBSelectContactLite.getContactId());
            arrayList.add(contactItemBean);
        }
        return lbd.h0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(List list) throws Throwable {
        this.f6485j.postValue(list);
    }

    public static /* synthetic */ void Z(Throwable th) throws Throwable {
        u64.c(TAG, th.getMessage(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(List list, List list2, ccd ccdVar) throws Throwable {
        if (list != null && list2.equals(list)) {
            ccdVar.onNext(Boolean.FALSE);
            ccdVar.onComplete();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            ContactItemBean contactItemBean = (ContactItemBean) it.next();
            DBSelectContactLite dBSelectContactLite = new DBSelectContactLite(this.p, contactItemBean.get_id());
            dBSelectContactLite.setName(contactItemBean.getName());
            dBSelectContactLite.setSort(i);
            arrayList.add(dBSelectContactLite);
            i++;
        }
        u64.a(TAG, "update success!!!-->" + ContactSyncDatabaseOnceApi.j(arrayList), new Object[0]);
        ccdVar.onNext(Boolean.TRUE);
        ccdVar.onComplete();
    }

    public static /* synthetic */ void b0(a aVar, Boolean bool) throws Throwable {
        aVar.a(bool.booleanValue());
        u64.a(TAG, "sendSortMessage-->" + bool, new Object[0]);
    }

    public static /* synthetic */ void c0(Throwable th) throws Throwable {
        u64.a(TAG, "sendSortMessage-->" + th.getMessage(), new Object[0]);
    }

    public void K(final List<ContactItemBean> list, final b bVar) {
        L(this.f6487n);
        io.reactivex.rxjava3.disposables.a aVarB = lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.d64
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.Q(list, ccdVar);
            }
        }).L0(su8.c()).n0(f30.c()).b(new o14() { // from class: com.oplus.aiunit.vision.e64
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ContactViewModel.O(bVar, (List) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.f64
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ContactViewModel.P((Throwable) obj);
            }
        });
        this.f6487n = aVarB;
        u(aVarB);
    }

    public final void L(io.reactivex.rxjava3.disposables.a aVar) {
        if (aVar != null) {
            aVar.dispose();
        }
    }

    public MutableLiveData<Integer> M() {
        return this.k;
    }

    public MutableLiveData<List<ContactItemBean>> N() {
        if (PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS")) {
            L(this.f6486l);
            io.reactivex.rxjava3.disposables.a aVarB = lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.j64
                @Override // com.oplus.aiunit.vision.bdd
                public final void a(ccd ccdVar) throws Throwable {
                    this.a.S(ccdVar);
                }
            }).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.k64
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    this.i.T((List) obj);
                }
            }, new o14() { // from class: com.oplus.aiunit.vision.l64
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    ContactViewModel.U((Throwable) obj);
                }
            });
            this.f6486l = aVarB;
            u(aVarB);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ContactItemBean(3));
            u64.a(TAG, "no permission", new Object[0]);
            this.f6485j.setValue(arrayList);
        }
        return this.f6485j;
    }

    public void d0() {
        ContactSyncOnceApi.S(1);
    }

    public void e0() {
        ContactSyncOnceApi.S(8);
    }

    public void f0() {
        ContactSyncOnceApi.S(7);
    }

    public void g0() {
        L(this.m);
        io.reactivex.rxjava3.disposables.a aVarB = lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.a64
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.W(ccdVar);
            }
        }).Q(new d08() { // from class: com.oplus.aiunit.vision.g64
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.X((List) obj);
            }
        }).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.h64
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.Y((List) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.i64
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ContactViewModel.Z((Throwable) obj);
            }
        });
        this.m = aVarB;
        u(aVarB);
    }

    public void h0(final List<ContactItemBean> list, final List<ContactItemBean> list2, final a aVar) {
        L(this.o);
        io.reactivex.rxjava3.disposables.a aVarB = lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.n64
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.a0(list2, list, ccdVar);
            }
        }).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.o64
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ContactViewModel.b0(aVar, (Boolean) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.b64
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ContactViewModel.c0((Throwable) obj);
            }
        });
        this.o = aVarB;
        u(aVarB);
    }
}
