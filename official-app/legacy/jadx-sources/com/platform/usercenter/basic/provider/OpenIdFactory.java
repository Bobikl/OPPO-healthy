package com.platform.usercenter.basic.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class OpenIdFactory implements IOpenIdFactory {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile OpenIdFactory mFactory;
    private final Context mContext;
    private final List<IOpenIdProvider> mProviderList;

    private OpenIdFactory(Context context) {
        this.mContext = context;
        ArrayList arrayList = new ArrayList();
        this.mProviderList = arrayList;
        arrayList.add(new InternalOpenIdProvider(context));
    }

    public static OpenIdFactory getInstance(Context context) {
        if (mFactory == null) {
            synchronized (OpenIdFactory.class) {
                if (mFactory == null) {
                    mFactory = new OpenIdFactory(context);
                }
            }
        }
        return mFactory;
    }

    @Override // com.platform.usercenter.basic.provider.IOpenIdFactory
    public void addProvider(IOpenIdProvider iOpenIdProvider) {
        this.mProviderList.add(this.mProviderList.size() - 1, iOpenIdProvider);
    }

    @Nullable
    public <T> T iterator() {
        Iterator<IOpenIdProvider> it = this.mProviderList.iterator();
        while (it.hasNext()) {
            T t = (T) it.next().create();
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
