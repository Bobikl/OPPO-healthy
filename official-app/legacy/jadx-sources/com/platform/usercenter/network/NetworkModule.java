package com.platform.usercenter.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oplus.aiunit.vision.HeyConfig;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.evf;
import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.lc8;
import com.oplus.aiunit.vision.wr6;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.core.mvvm.calladapter.LiveDataCallAdapterFactory;
import com.platform.usercenter.network.header.IBizHeaderManager;
import com.platform.usercenter.network.header.UCDefaultBizHeader;
import com.platform.usercenter.network.interceptor.HeaderInterceptor;
import com.platform.usercenter.network.interceptor.SecurityRequestInterceptor;
import com.platform.usercenter.network.provider.INetConfigProvider;
import com.platform.usercenter.tools.datastructure.Lists;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes9.dex */
public final class NetworkModule {
    private static final int CONNECT_TIME = 5;
    private static final int READ_TIME = 30;
    private static final int WRITE_TIME = 30;
    wr6 eventListener;
    wr6.c eventListenerFactory;
    private final String mBaseUrl;
    private final IBizHeaderManager mBizHeaderManager;
    private final HeyConfig.Builder mConfig;
    private final WeakReference<INetConfigProvider> mConfigProvider = Builder.configProvider;
    private final List<InterceptorInsertHelper> mInsertHelpers;
    private AtomicInteger mInteger;
    private final LinkedList<jea> mInterceptorList;
    private final boolean mIsDebug;
    private efd mOkHttpClient;
    private evf mRetrofit;

    public static final class Builder {
        public static WeakReference<INetConfigProvider> configProvider;
        AtomicInteger atomicInteger;
        final String baseUrl;
        IBizHeaderManager bizHeaderManager;
        wr6 eventListener;
        wr6.c eventListenerFactory;
        HeyConfig.Builder heyConfig;
        boolean isDebug;
        final LinkedList<jea> interceptorList = new LinkedList<>();
        final List<InterceptorInsertHelper> insertHelpers = new ArrayList();

        public Builder(String str) {
            this.baseUrl = str;
        }

        private void countFirstInterceptors(int i) {
            this.atomicInteger.addAndGet(i);
        }

        public Builder addInterceptorInsertHelper(InterceptorInsertHelper interceptorInsertHelper) {
            this.insertHelpers.add(interceptorInsertHelper);
            return this;
        }

        public NetworkModule build() {
            return new NetworkModule(this);
        }

        public Builder eventListener(wr6 wr6Var) {
            this.eventListener = wr6Var;
            return this;
        }

        public Builder eventListenerFactory(wr6.c cVar) {
            this.eventListenerFactory = cVar;
            return this;
        }

        public Builder setBizHeaderManager(IBizHeaderManager iBizHeaderManager) {
            if (iBizHeaderManager == null) {
                return this;
            }
            this.bizHeaderManager = iBizHeaderManager;
            return this;
        }

        public Builder setFirstInterceptorList(List<jea> list) {
            if (Lists.isNullOrEmpty(list)) {
                return this;
            }
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                if (list.get(i) == null) {
                    size--;
                } else {
                    this.interceptorList.addFirst(list.get(i));
                }
            }
            if (this.atomicInteger == null) {
                this.atomicInteger = new AtomicInteger(0);
            }
            countFirstInterceptors(size);
            return this;
        }

        public Builder setFirstInterceptors(jea... jeaVarArr) {
            setFirstInterceptorList(Arrays.asList(jeaVarArr));
            return this;
        }

        public Builder setHttpDnsConfig(HeyConfig.Builder builder) {
            this.heyConfig = builder;
            return this;
        }

        public Builder setInterceptorByIndex(int i, jea jeaVar) {
            if (Lists.isNullOrEmpty(this.interceptorList)) {
                return this;
            }
            this.interceptorList.add(i, jeaVar);
            return this;
        }

        public Builder setInterceptorList(List<jea> list) {
            if (Lists.isNullOrEmpty(list)) {
                return this;
            }
            this.interceptorList.addAll(list);
            return this;
        }

        public Builder setInterceptors(jea... jeaVarArr) {
            setInterceptorList(Arrays.asList(jeaVarArr));
            return this;
        }

        public Builder setIsDebug(boolean z) {
            this.isDebug = z;
            return this;
        }

        public Builder setLastInterceptorList(List<jea> list) {
            if (Lists.isNullOrEmpty(list)) {
                return this;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i) != null) {
                    this.interceptorList.addLast(list.get(i));
                }
            }
            return this;
        }

        public Builder setLastInterceptors(jea... jeaVarArr) {
            setLastInterceptorList(Arrays.asList(jeaVarArr));
            return this;
        }

        public Builder setNetConfig(INetConfigProvider iNetConfigProvider) {
            configProvider = new WeakReference<>(iNetConfigProvider);
            return this;
        }
    }

    public interface InterceptorInsertHelper {
        default List<jea> insertBeforeEncrypt() {
            return new ArrayList();
        }

        default List<jea> insertFirst() {
            return new ArrayList();
        }

        default List<jea> insertLast() {
            return new ArrayList();
        }
    }

    public NetworkModule(Builder builder) {
        this.mIsDebug = builder.isDebug;
        this.mBaseUrl = builder.baseUrl;
        this.mInterceptorList = builder.interceptorList;
        this.mConfig = builder.heyConfig;
        this.mBizHeaderManager = builder.bizHeaderManager;
        this.mInteger = builder.atomicInteger;
        this.eventListener = builder.eventListener;
        this.eventListenerFactory = builder.eventListenerFactory;
        this.mInsertHelpers = builder.insertHelpers;
    }

    private void callInsertFirst() {
        Iterator<InterceptorInsertHelper> it = this.mInsertHelpers.iterator();
        while (it.hasNext()) {
            List<jea> listInsertFirst = it.next().insertFirst();
            this.mInterceptorList.addAll(this.mInteger.getAndAdd(listInsertFirst.size()), listInsertFirst);
        }
    }

    private void callInsertLast() {
        Iterator<InterceptorInsertHelper> it = this.mInsertHelpers.iterator();
        while (it.hasNext()) {
            List<jea> listInsertLast = it.next().insertLast();
            this.mInterceptorList.addAll(this.mInteger.getAndAdd(listInsertLast.size()), listInsertLast);
        }
    }

    private void callInsertMiddle() {
        Iterator<InterceptorInsertHelper> it = this.mInsertHelpers.iterator();
        while (it.hasNext()) {
            List<jea> listInsertBeforeEncrypt = it.next().insertBeforeEncrypt();
            this.mInterceptorList.addAll(this.mInteger.getAndAdd(listInsertBeforeEncrypt.size()), listInsertBeforeEncrypt);
        }
    }

    private void collectInterceptors(efd.a aVar) {
        if (Lists.isNullOrEmpty(this.mInterceptorList)) {
            return;
        }
        Iterator<jea> it = this.mInterceptorList.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
    }

    private HeaderInterceptor getHeaderInterceptor() {
        IBizHeaderManager uCDefaultBizHeader = this.mBizHeaderManager;
        if (uCDefaultBizHeader == null) {
            uCDefaultBizHeader = new UCDefaultBizHeader();
        }
        return new HeaderInterceptor(BaseApp.mContext, uCDefaultBizHeader);
    }

    private Gson provideGson() {
        return new GsonBuilder().create();
    }

    private evf.b provideNormalRetrofitBuilder(Gson gson) {
        evf.b bVar = new evf.b();
        WeakReference<INetConfigProvider> weakReference = this.mConfigProvider;
        if (weakReference != null && weakReference.get() != null) {
            INetConfigProvider iNetConfigProvider = this.mConfigProvider.get();
            if (iNetConfigProvider.getConvertFactory() != null) {
                bVar.b(iNetConfigProvider.getConvertFactory());
            }
        }
        return bVar.b(lc8.b(gson)).a(LiveDataCallAdapterFactory.create()).d(this.mBaseUrl);
    }

    private jea provideSecurityRequestInterceptor() {
        return new SecurityRequestInterceptor(this.mBizHeaderManager);
    }

    private void setDefaultInterceptors() {
        if (this.mInteger == null) {
            this.mInteger = new AtomicInteger(0);
        }
        callInsertFirst();
        this.mInterceptorList.add(this.mInteger.getAndIncrement(), getHeaderInterceptor());
        callInsertMiddle();
        this.mInterceptorList.add(this.mInteger.getAndIncrement(), provideSecurityRequestInterceptor());
        callInsertLast();
    }

    private void setEventListener(efd.a aVar) {
        wr6 wr6Var = this.eventListener;
        if (wr6Var != null) {
            aVar.j(wr6Var);
        }
        wr6.c cVar = this.eventListenerFactory;
        if (cVar != null) {
            aVar.k(cVar);
        }
    }

    private void setOkHttpClientConfig(efd.a aVar) {
        WeakReference<INetConfigProvider> weakReference = this.mConfigProvider;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        INetConfigProvider iNetConfigProvider = this.mConfigProvider.get();
        HeyConfig.Builder builder = this.mConfig;
        if (builder != null) {
            aVar.f(builder.a(BaseApp.mContext));
        }
        if (!this.mIsDebug || iNetConfigProvider.isEncryption()) {
            return;
        }
        SSLSocketFactory sSLSocketFactory = iNetConfigProvider.getSSLSocketFactory();
        X509TrustManager trustManager = iNetConfigProvider.getTrustManager();
        HostnameVerifier hostnameVerifier = iNetConfigProvider.getHostnameVerifier();
        if (sSLSocketFactory == null || trustManager == null || hostnameVerifier == null) {
            return;
        }
        aVar.a0(sSLSocketFactory, trustManager);
        aVar.S(hostnameVerifier).a0(sSLSocketFactory, trustManager);
    }

    public synchronized efd provideNormalOkHttpClient() {
        if (this.mOkHttpClient == null) {
            efd.a aVarProvidesOkHttpBuilder = providesOkHttpBuilder();
            setOkHttpClientConfig(aVarProvidesOkHttpBuilder);
            setDefaultInterceptors();
            collectInterceptors(aVarProvidesOkHttpBuilder);
            setEventListener(aVarProvidesOkHttpBuilder);
            this.mOkHttpClient = aVarProvidesOkHttpBuilder.c();
        }
        return this.mOkHttpClient;
    }

    public synchronized evf provideNormalRetrofit() {
        if (this.mRetrofit == null) {
            this.mRetrofit = provideNormalRetrofitBuilder(provideGson()).g(provideNormalOkHttpClient()).e();
        }
        return this.mRetrofit;
    }

    public efd.a providesOkHttpBuilder() {
        efd.a aVar = new efd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.g(5L, timeUnit).X(30L, timeUnit).b0(30L, timeUnit);
        return aVar;
    }
}
