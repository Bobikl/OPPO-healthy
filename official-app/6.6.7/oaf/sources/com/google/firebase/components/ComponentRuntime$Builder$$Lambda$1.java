package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final /* synthetic */ class ComponentRuntime$Builder$$Lambda$1 implements Provider {
    private final ComponentRegistrar arg$1;

    private ComponentRuntime$Builder$$Lambda$1(ComponentRegistrar componentRegistrar) {
        this.arg$1 = componentRegistrar;
    }

    public static Provider lambdaFactory$(ComponentRegistrar componentRegistrar) {
        return new ComponentRuntime$Builder$$Lambda$1(componentRegistrar);
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.arg$1);
    }
}
