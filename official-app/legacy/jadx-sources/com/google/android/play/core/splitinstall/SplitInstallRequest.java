package com.google.android.play.core.splitinstall;

import androidx.annotation.NonNull;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SplitInstallRequest extends OplusSplitInstallRequest {
    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallRequest
    public List<String> getModuleNames() {
        return super.getModuleNames();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallRequest
    @NonNull
    public String toString() {
        return "SplitInstallRequest{modulesNames=" + String.valueOf(getModuleNames()) + "}";
    }

    public static class Builder {
        public final List<String> a = new ArrayList();

        public Builder() {
        }

        @NonNull
        public Builder addModule(String str) {
            this.a.add(str);
            return this;
        }

        @NonNull
        public SplitInstallRequest build() {
            return new SplitInstallRequest(this);
        }

        public Builder(AnonymousClass1 anonymousClass1) {
        }
    }

    public SplitInstallRequest(Builder builder) {
        super(new ArrayList(builder.a));
    }
}
