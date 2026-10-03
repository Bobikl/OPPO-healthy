package com.accountbase;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.heytap.usercenter.accountsdk.utils.StatusCodeUtil;
import com.platform.usercenter.basic.core.mvvm.AppExecutors;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;
import com.platform.usercenter.basic.core.mvvm.Objects;
import com.platform.usercenter.basic.core.mvvm.Resource;
import com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h<ResultType, RequestType> implements ProtocolCommand<ResultType> {
    private final AppExecutors a = AppExecutors.getInstance();
    private final MediatorLiveData<Resource<ResultType>> b = new MediatorLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LiveData<ResultType> f468c;

    public class a implements Observer<ResultType> {
        final /* synthetic */ LiveData a;

        /* JADX INFO: renamed from: com.accountbase.h$a$a, reason: collision with other inner class name */
        public class C0139a implements Observer<ResultType> {
            public C0139a() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(ResultType resulttype) {
                h.this.a(Resource.error(Integer.parseInt("2000"), StatusCodeUtil.matchResultMsg("2000"), resulttype));
            }
        }

        public a(LiveData liveData) {
            this.a = liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(ResultType resulttype) {
            h.this.b.removeSource(this.a);
            if (h.this.b(resulttype)) {
                h.this.a(this.a);
                return;
            }
            h.this.f468c = this.a;
            h.this.b.addSource(this.a, new C0139a());
        }
    }

    public class b implements Observer<ResultType> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(ResultType resulttype) {
            h.this.a(Resource.loading(resulttype));
        }
    }

    public class c implements Observer<CoreResponse<RequestType>> {
        final /* synthetic */ LiveData a;
        final /* synthetic */ LiveData b;

        public class a implements Runnable {
            final /* synthetic */ CoreResponse a;

            /* JADX INFO: renamed from: com.accountbase.h$c$a$a, reason: collision with other inner class name */
            public class RunnableC0140a implements Runnable {

                /* JADX INFO: renamed from: com.accountbase.h$c$a$a$a, reason: collision with other inner class name */
                public class C0141a implements Observer<ResultType> {
                    public C0141a() {
                    }

                    @Override // androidx.lifecycle.Observer
                    public void onChanged(ResultType resulttype) {
                        h.this.a(Resource.success(resulttype));
                    }
                }

                public RunnableC0140a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    h hVar = h.this;
                    hVar.f468c = hVar.c();
                    h.this.b.addSource(h.this.f468c, new C0141a());
                }
            }

            public a(CoreResponse coreResponse) {
                this.a = coreResponse;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                h hVar = h.this;
                hVar.a(hVar.a(this.a));
                h.this.a.mainThread().execute(new RunnableC0140a());
            }
        }

        public class b implements Observer<ResultType> {
            final /* synthetic */ CoreResponse a;

            public b(CoreResponse coreResponse) {
                this.a = coreResponse;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(ResultType resulttype) {
                if (this.a.getError() != null) {
                    h.this.a(Resource.error(this.a.getError().code, this.a.getError().message, resulttype));
                } else {
                    h.this.a(Resource.error(this.a.getCode(), this.a.message, resulttype));
                }
            }
        }

        public c(LiveData liveData, LiveData liveData2) {
            this.a = liveData;
            this.b = liveData2;
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CoreResponse<RequestType> coreResponse) {
            h.this.b.removeSource(this.a);
            h.this.b.removeSource(this.b);
            if (coreResponse.getData() != null) {
                h.this.a.diskIO().execute(new a(coreResponse));
                return;
            }
            h.this.d();
            h.this.f468c = this.b;
            h.this.b.addSource(h.this.f468c, new b(coreResponse));
        }
    }

    @MainThread
    public h() {
    }

    @NonNull
    @MainThread
    public abstract LiveData<CoreResponse<RequestType>> a(String str);

    @WorkerThread
    public abstract void a(@NonNull RequestType requesttype);

    @Override // com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand
    public LiveData<Resource<ResultType>> asLiveData() {
        return this.b;
    }

    @WorkerThread
    public abstract String b();

    @MainThread
    public abstract boolean b(@Nullable ResultType resulttype);

    @NonNull
    @MainThread
    public abstract LiveData<ResultType> c();

    public void d() {
    }

    @Override // com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand
    public void handle() {
        a((Resource) Resource.loading(null));
        a();
    }

    private void a() {
        LiveData<ResultType> liveData = this.f468c;
        if (liveData != null) {
            this.b.removeSource(liveData);
        }
        LiveData<ResultType> liveDataC = c();
        this.b.addSource(liveDataC, new a(liveDataC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void a(Resource<ResultType> resource) {
        if (Objects.equals(this.b.getValue(), resource)) {
            return;
        }
        this.b.setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LiveData<ResultType> liveData) {
        LiveData<CoreResponse<RequestType>> liveDataA = a(b());
        this.b.addSource(liveData, new b());
        this.b.addSource(liveDataA, new c(liveDataA, liveData));
    }

    @WorkerThread
    public RequestType a(CoreResponse<RequestType> coreResponse) {
        return coreResponse.getData();
    }
}
