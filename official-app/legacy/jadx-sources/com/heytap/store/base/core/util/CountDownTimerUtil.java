package com.heytap.store.base.core.util;

import android.os.CountDownTimer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class CountDownTimerUtil extends CountDownTimer {
    private OnCounterDownListener onCounterDownListener;
    private WeakReference<OnCounterDownListener> weakCountDownListener;

    public interface OnCounterDownListener {
        void onFinishCallBack();

        void onTickCallBack();

        void onTickCallBack(Long l2);
    }

    public CountDownTimerUtil(long j2, long j3, OnCounterDownListener onCounterDownListener) {
        super(j2, j3);
        this.onCounterDownListener = onCounterDownListener;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        OnCounterDownListener onCounterDownListener = this.onCounterDownListener;
        if (onCounterDownListener != null) {
            onCounterDownListener.onFinishCallBack();
        }
        WeakReference<OnCounterDownListener> weakReference = this.weakCountDownListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.weakCountDownListener.get().onFinishCallBack();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j2) {
        OnCounterDownListener onCounterDownListener = this.onCounterDownListener;
        if (onCounterDownListener != null) {
            onCounterDownListener.onTickCallBack();
            this.onCounterDownListener.onTickCallBack(Long.valueOf(j2));
        }
        WeakReference<OnCounterDownListener> weakReference = this.weakCountDownListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.weakCountDownListener.get().onTickCallBack(Long.valueOf(j2));
    }

    public void setCountDownListener(OnCounterDownListener onCounterDownListener) {
        this.weakCountDownListener = new WeakReference<>(onCounterDownListener);
    }

    public CountDownTimerUtil(long j2, long j3) {
        super(j2, j3);
    }
}
