package com.sensorsdata.analytics.android.sdk.core.event;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.event.imp.AssembleDataImpl;
import com.sensorsdata.analytics.android.sdk.core.event.imp.SendDataImpl;
import com.sensorsdata.analytics.android.sdk.core.event.imp.StoreDataImpl;

/* JADX INFO: loaded from: classes10.dex */
public abstract class EventProcessor {
    IAssembleData mAssembleData;
    ISendData mSendData;
    IStoreData mStoreData = new StoreDataImpl();

    public interface IAssembleData {
        Event assembleData(InputData inputData);
    }

    public interface ISendData {
        void sendData(InputData inputData, int i);
    }

    public interface IStoreData {
        int storeData(Event event);
    }

    public EventProcessor(SAContextManager sAContextManager) {
        this.mAssembleData = new AssembleDataImpl(sAContextManager);
        this.mSendData = new SendDataImpl(sAContextManager);
    }

    public Event assembleData(InputData inputData) {
        return this.mAssembleData.assembleData(inputData);
    }

    public synchronized void process(InputData inputData) {
        try {
            sendData(inputData, storeData(assembleData(inputData)));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void sendData(InputData inputData, int i) {
        this.mSendData.sendData(inputData, i);
    }

    public int storeData(Event event) {
        return this.mStoreData.storeData(event);
    }

    public abstract void trackEvent(InputData inputData);
}
