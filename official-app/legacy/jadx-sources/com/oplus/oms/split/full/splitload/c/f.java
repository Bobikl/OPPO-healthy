package com.oplus.oms.split.full.splitload.c;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.oplus.aiunit.vision.bcm;
import com.oplus.aiunit.vision.w7i;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f extends ContentProvider {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20034e = "ContentProviderProxy";
    private static final String f = "_Decorated_";
    private ContentProvider a;
    private ProviderInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20035c;
    private String d;

    public ContentProvider a() {
        return this.a;
    }

    public abstract boolean a(String str);

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        return a(this.d) ? this.a.applyBatch(arrayList) : super.applyBatch(arrayList);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        String[] strArrSplit = getClass().getName().split(f);
        this.f20035c = strArrSplit[0];
        this.d = strArrSplit[1];
        super.attachInfo(context, providerInfo);
        this.b = new ProviderInfo(providerInfo);
        bcm.f().d(this.d, this);
    }

    public void b() {
        this.a = null;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return a(this.d) ? this.a.bulkInsert(uri, contentValuesArr) : super.bulkInsert(uri, contentValuesArr);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        return a(this.d) ? this.a.call(str, str2, bundle) : super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public Uri canonicalize(Uri uri) {
        return a() != null ? this.a.canonicalize(uri) : super.canonicalize(uri);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        if (a(this.d)) {
            return this.a.delete(uri, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String[] getStreamTypes(Uri uri, String str) {
        return a(this.d) ? this.a.getStreamTypes(uri, str) : super.getStreamTypes(uri, str);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (a(this.d)) {
            return this.a.getType(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (a(this.d)) {
            return this.a.insert(uri, contentValues);
        }
        return null;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (a(this.d)) {
            this.a.onConfigurationChanged(configuration);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ContentProvider contentProvider = this.a;
        if (contentProvider != null) {
            contentProvider.onLowMemory();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        ContentProvider contentProvider = this.a;
        if (contentProvider != null) {
            contentProvider.onTrimMemory(i);
        }
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
        return a(this.d) ? this.a.openAssetFile(uri, str) : super.openAssetFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return a(this.d) ? this.a.openFile(uri, str) : super.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public <T> ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, T t, ContentProvider.PipeDataWriter<T> pipeDataWriter) throws FileNotFoundException {
        return a(this.d) ? this.a.openPipeHelper(uri, str, bundle, t, pipeDataWriter) : super.openPipeHelper(uri, str, bundle, t, pipeDataWriter);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) throws FileNotFoundException {
        return a(this.d) ? this.a.openTypedAssetFile(uri, str, bundle) : super.openTypedAssetFile(uri, str, bundle);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (a(this.d)) {
            return this.a.query(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        return a(this.d) ? this.a.refresh(uri, bundle, cancellationSignal) : super.refresh(uri, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Uri uncanonicalize(Uri uri) {
        return a(this.d) ? this.a.uncanonicalize(uri) : super.uncanonicalize(uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (a(this.d)) {
            return this.a.update(uri, contentValues, str, strArr);
        }
        return 0;
    }

    public void a(ClassLoader classLoader) throws b {
        Throwable th;
        if (this.f20035c == null) {
            throw new b("Unable to read real content-provider for ".concat(getClass().getName()));
        }
        if (classLoader == null) {
            throw new b("classloader is null");
        }
        w7i.a(f20034e, "realContentProviderClassName " + this.f20035c, new Object[0]);
        try {
            th = null;
            ContentProvider contentProvider = (ContentProvider) classLoader.loadClass(this.f20035c).getDeclaredConstructor(null).newInstance(null);
            this.a = contentProvider;
            contentProvider.attachInfo(getContext(), this.b);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            th = e2;
        }
        if (th != null) {
            throw new b(th);
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        if (a(this.d)) {
            return this.a.query(uri, strArr, bundle, cancellationSignal);
        }
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        if (a(this.d)) {
            return this.a.call(str, str2, str3, bundle);
        }
        return super.call(str, str2, str3, bundle);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        if (a(this.d)) {
            return this.a.openAssetFile(uri, str, cancellationSignal);
        }
        return super.openAssetFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        if (a(this.d)) {
            return this.a.openFile(uri, str, cancellationSignal);
        }
        return super.openFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) throws FileNotFoundException {
        if (a(this.d)) {
            return this.a.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        if (a(this.d)) {
            return this.a.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
