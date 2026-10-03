package com.google.firebase.components;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final /* synthetic */ class Component$$Lambda$1 implements ComponentFactory {
    private final Object arg$1;

    private Component$$Lambda$1(Object obj) {
        this.arg$1 = obj;
    }

    public static ComponentFactory lambdaFactory$(Object obj) {
        return new Component$$Lambda$1(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$0(this.arg$1, componentContainer);
    }
}
