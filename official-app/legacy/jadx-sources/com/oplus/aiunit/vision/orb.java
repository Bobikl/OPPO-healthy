package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class orb {
    public static ContentResolver b = b78.a().getContentResolver();
    public srb a;

    public <T extends MediaStore.MediaColumns> orb(Class<T> cls, srb srbVar) {
        woe.b(cls);
        woe.b(srbVar);
        this.a = srbVar;
    }

    public static ParcelFileDescriptor c(Uri uri) {
        return d(uri, "rw");
    }

    public static ParcelFileDescriptor d(Uri uri, String str) {
        try {
            return b.openFileDescriptor(uri, str);
        } catch (FileNotFoundException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("openFileDescriptor: ");
            sb.append(e2.getMessage());
            b.delete(uri, null, null);
            return null;
        }
    }

    public Uri a() {
        return b.insert(this.a.a(), this.a.b());
    }

    public int b() {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        ContentValues contentValuesB = this.a.b();
        Set<String> setKeySet = contentValuesB.keySet();
        ArrayList arrayList = new ArrayList();
        int size = setKeySet.size();
        String[] strArr2 = new String[size];
        setKeySet.toArray(strArr2);
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb.append(strArr2[i] + "=?");
            } else {
                sb.append(strArr2[i] + "=? and ");
            }
            arrayList.add(contentValuesB.getAsString(strArr2[i]));
        }
        if (arrayList.size() > 0) {
            strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
        } else {
            strArr = null;
        }
        return b.delete(this.a.a(), sb.toString(), strArr);
    }
}
