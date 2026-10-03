package com.platform.usercenter.tools.handler;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes9.dex */
public class WeakHandlerHelper {

    public interface IHandler<T> {
        void handleMessage(Message message, T t);
    }

    public static <T> WeakHandler<T> getWeakHandler(T t, IHandler<T> iHandler) {
        return new StaticWeakHandler(iHandler, t);
    }

    public static class StaticWeakHandler<T> extends WeakHandler<T> {
        private IHandler<T> handler;

        public StaticWeakHandler(IHandler<T> iHandler, T t) {
            super(t);
            this.handler = iHandler;
        }

        @Override // com.platform.usercenter.tools.handler.WeakHandler
        public void handleMessage(Message message, T t) {
            IHandler<T> iHandler = this.handler;
            if (iHandler != null) {
                iHandler.handleMessage(message, t);
            }
        }

        public StaticWeakHandler(Looper looper, IHandler<T> iHandler, T t) {
            super(looper, t);
            this.handler = iHandler;
        }
    }

    public static <T> WeakHandler<T> getWeakHandler(T t, Looper looper, IHandler<T> iHandler) {
        return new StaticWeakHandler(looper, iHandler, t);
    }
}
