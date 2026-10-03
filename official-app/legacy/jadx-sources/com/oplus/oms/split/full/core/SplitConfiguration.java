package com.oplus.oms.split.full.core;

import com.oplus.aiunit.vision.sgd;
import com.oplus.oms.split.full.splitdownload.Downloader;
import com.oplus.oms.split.full.splitdownload.IProvider;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SplitConfiguration {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19993c;
    public final Downloader d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ISplitUpdateManager f19994e;
    public final Class<? extends ObtainUserConfirmationDialog> f;
    public final boolean g;
    public final boolean h;
    public final IProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<String> f19995j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19996l;

    public static class Builder {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19997c;
        public Downloader d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ISplitUpdateManager f19998e;
        public Class<? extends ObtainUserConfirmationDialog> f;
        public boolean g;
        public boolean h;
        public IProvider i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<String> f19999j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20000l;

        public static /* synthetic */ sgd c(Builder builder) {
            builder.getClass();
            return null;
        }

        public SplitConfiguration build() {
            return new SplitConfiguration(this);
        }

        public void callbackOnMainThread(boolean z) {
            this.f20000l = z;
        }

        public Builder customOmsJsonProvider(sgd sgdVar) {
            return this;
        }

        public Builder customProvider(IProvider iProvider) {
            this.i = iProvider;
            return this;
        }

        public Builder customizeOmsJsonStatus(boolean z) {
            this.k = z;
            return this;
        }

        public Builder downloader(Downloader downloader) {
            this.d = downloader;
            return this;
        }

        public Builder localFirst(boolean z) {
            this.h = z;
            return this;
        }

        public Builder netWorkingType(int i) {
            this.b = i;
            return this;
        }

        public Builder obtainUserConfirmationClass(Class<? extends ObtainUserConfirmationDialog> cls) {
            this.f = cls;
            return this;
        }

        public Builder queryStartUp(boolean z) {
            this.g = z;
            return this;
        }

        public Builder splitLoadMode(int i) {
            this.a = i;
            return this;
        }

        public Builder updateManager(ISplitUpdateManager iSplitUpdateManager) {
            this.f19998e = iSplitUpdateManager;
            return this;
        }

        public Builder updateTimeByHours(int i) {
            this.f19997c = i;
            return this;
        }

        public Builder workProcesses(List<String> list) {
            if (list != null && list.size() > 0) {
                this.f19999j = list;
            }
            return this;
        }

        public Builder() {
            this.a = 1;
            this.b = 3;
            this.f19997c = 72;
            this.g = true;
            this.h = false;
            this.k = false;
            this.f20000l = true;
            this.f = ObtainUserConfirmationDialog.class;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getCallbackOnMainThread() {
        return this.f19996l;
    }

    public Class<? extends ObtainUserConfirmationDialog> getConfirmActivityName() {
        return this.f;
    }

    public IProvider getCustomProvider() {
        return this.i;
    }

    public boolean getCustomizeOmsJsonStatus() {
        return this.k;
    }

    public Downloader getDownloader() {
        return this.d;
    }

    public boolean getLocalFirst() {
        return this.h;
    }

    public int getNetWorkingType() {
        return this.b;
    }

    public sgd getOmsJsonCustomProvider() {
        return null;
    }

    public boolean getQueryStartUp() {
        return this.g;
    }

    public int getSplitLoadMode() {
        return this.a;
    }

    public ISplitUpdateManager getUpdateManager() {
        return this.f19994e;
    }

    public int getUpdateTimeByHours() {
        return this.f19993c;
    }

    public List<String> getWorkProcesses() {
        return this.f19995j;
    }

    public SplitConfiguration(Builder builder) {
        this.k = false;
        this.f19996l = true;
        this.a = builder.a;
        this.b = builder.b;
        this.f19993c = builder.f19997c;
        this.d = builder.d;
        this.f19994e = builder.f19998e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.f19995j = builder.f19999j;
        Builder.c(builder);
        this.k = builder.k;
        this.f19996l = builder.f20000l;
    }
}
