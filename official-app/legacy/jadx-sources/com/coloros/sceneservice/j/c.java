package com.coloros.sceneservice.j;

import android.os.Bundle;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.SceneObjectFactory;
import com.coloros.sceneservice.sceneprovider.api.IClient;
import com.coloros.sceneservice.sceneprovider.model.SceneInfo;
import com.coloros.sceneservice.sceneprovider.sceneprocessor.AbsSceneProcessor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class c {
    public static final String TAG = "ProcessorManager";
    public List mClients;
    public final Object vc;
    public Map wc;

    public static class a {
        public static c sInstance = new c();
    }

    private void c(int i, Bundle bundle) {
        Iterator it = this.mClients.iterator();
        while (it.hasNext()) {
            ((IClient) it.next()).handleSceneEvent(i, bundle);
        }
        f.d(TAG, "dispatchSceneDataToClient:" + this.mClients.size());
    }

    private AbsSceneProcessor d(int i) {
        f.d(TAG, "createProcessor:" + i);
        synchronized (this.vc) {
            if (SceneObjectFactory.getObjectFactory() == null) {
                f.d(TAG, "getProcessor: objectFactory is null");
                return null;
            }
            AbsSceneProcessor absSceneProcessorCreateSceneProcessor = SceneObjectFactory.getObjectFactory().createSceneProcessor(i);
            if (absSceneProcessorCreateSceneProcessor == null) {
                f.d(TAG, "getProcessor create processor by SDK");
                absSceneProcessorCreateSceneProcessor = new com.coloros.sceneservice.j.a(i);
            }
            this.wc.put(Integer.valueOf(i), absSceneProcessorCreateSceneProcessor);
            return absSceneProcessorCreateSceneProcessor;
        }
    }

    private AbsSceneProcessor e(int i) {
        AbsSceneProcessor absSceneProcessor;
        synchronized (this.vc) {
            absSceneProcessor = (AbsSceneProcessor) this.wc.get(Integer.valueOf(i));
        }
        return absSceneProcessor;
    }

    public static c getInstance() {
        return a.sInstance;
    }

    public void a(SceneInfo sceneInfo) {
        if (sceneInfo == null) {
            f.w(TAG, "submitSceneTask info is null");
            return;
        }
        AbsSceneProcessor absSceneProcessorE = e(sceneInfo.getSceneId());
        if (absSceneProcessorE == null) {
            absSceneProcessorE = d(sceneInfo.getSceneId());
        }
        synchronized (this.vc) {
            if (absSceneProcessorE != null) {
                absSceneProcessorE.handleBundle(sceneInfo.getPolicyData());
            }
        }
    }

    public boolean addClient(IClient iClient) {
        if (iClient != null) {
            return this.mClients.add(iClient);
        }
        return false;
    }

    public void b(int i) {
        synchronized (this.vc) {
            AbsSceneProcessor absSceneProcessor = (AbsSceneProcessor) this.wc.remove(Integer.valueOf(i));
            if (absSceneProcessor != null) {
                absSceneProcessor.onDestroy();
                StringBuilder sb = new StringBuilder();
                sb.append("destroyProcessor: id =");
                sb.append(i);
                f.d(TAG, sb.toString());
            }
        }
    }

    public boolean removeClient(IClient iClient) {
        if (iClient != null) {
            return this.mClients.remove(iClient);
        }
        return false;
    }

    public c() {
        this.vc = new Object();
        this.mClients = new CopyOnWriteArrayList();
        this.wc = new ConcurrentHashMap();
    }

    public void c(int i, String str) {
        synchronized (this.vc) {
            AbsSceneProcessor absSceneProcessor = (AbsSceneProcessor) this.wc.get(Integer.valueOf(i));
            if (absSceneProcessor != null) {
                absSceneProcessor.h(str);
            }
        }
    }

    public void a(int i, Bundle bundle) {
        AbsSceneProcessor absSceneProcessorE = e(i);
        if (absSceneProcessorE == null) {
            absSceneProcessorE = d(i);
        }
        synchronized (this.vc) {
            if (absSceneProcessorE != null) {
                f.d(TAG, "submitSceneTask");
                absSceneProcessorE.handleSceneBundle(bundle);
                c(i, bundle);
            } else {
                c(i, bundle);
            }
            throw th;
        }
    }
}
