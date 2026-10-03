package com.heytap.health.watch.music.api;

import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.watch.music.api.IMusicControlAidl;
import com.oplus.aiunit.vision.a7b;
import com.oplus.health.apiprovider.ClientManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class MusicControlApiManager {
    public static final String MUSIC_CONTROL_AIDL = "music_control_api";
    public static final Map<a, IMusicPlayStateCallback> a = new ConcurrentHashMap();
    public static final Object b = new Object();

    public interface a {
        void onPlayStateChanged(boolean z, String str, int i);
    }

    public static boolean a(String str) {
        IMusicControlAidl iMusicControlAidlB = b();
        if (iMusicControlAidlB == null) {
            return false;
        }
        try {
            return iMusicControlAidlB.getMusicControlSwitch(str);
        } catch (RemoteException e2) {
            a7b.b("MusicControlApiManager", "[getMusicControlSwitch] --> " + e2.getMessage());
            return false;
        }
    }

    public static IMusicControlAidl b() {
        return (IMusicControlAidl) ClientManager.getInstance().getBuildService(MUSIC_CONTROL_AIDL, new ClientManager.a() { // from class: com.oplus.aiunit.vision.m9c
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IMusicControlAidl.Stub.asInterface(iBinder);
            }
        });
    }

    public static boolean c() {
        IMusicControlAidl iMusicControlAidlB = b();
        if (iMusicControlAidlB == null) {
            return false;
        }
        try {
            return iMusicControlAidlB.isMusicPlaying();
        } catch (RemoteException e2) {
            a7b.b("MusicControlApiManager", "[isPlaying] --> " + e2.getMessage());
            return false;
        }
    }

    public static void d() {
        IMusicControlAidl iMusicControlAidlB = b();
        if (iMusicControlAidlB != null) {
            try {
                iMusicControlAidlB.pauseMusicIfPlaying();
            } catch (RemoteException e2) {
                a7b.b("MusicControlApiManager", "[pauseMusicIfPlaying] --> " + e2.getMessage());
            }
        }
    }

    public static boolean e(final a aVar) {
        IMusicControlAidl iMusicControlAidlB;
        boolean z;
        if (aVar == null || (iMusicControlAidlB = b()) == null) {
            return false;
        }
        Object obj = b;
        synchronized (obj) {
            Map<a, IMusicPlayStateCallback> map = a;
            if (map.get(aVar) != null) {
                return true;
            }
            IMusicPlayStateCallback.Stub stub = new IMusicPlayStateCallback.Stub() { // from class: com.heytap.health.watch.music.api.MusicControlApiManager.1
                @Override // com.heytap.health.watch.music.api.IMusicPlayStateCallback
                public void onPlayStateChanged(boolean z2, String str, int i) {
                    aVar.onPlayStateChanged(z2, str, i);
                }
            };
            map.put(aVar, stub);
            try {
                iMusicControlAidlB.registerPlayStateCallback(stub);
                synchronized (obj) {
                    z = map.get(aVar) != stub;
                }
                if (!z) {
                    return true;
                }
                try {
                    iMusicControlAidlB.unregisterPlayStateCallback(stub);
                } catch (RemoteException e2) {
                    a7b.b("MusicControlApiManager", "[registerPlayStateListener][rollback] --> " + e2.getMessage());
                }
                return false;
            } catch (RemoteException e3) {
                synchronized (b) {
                    a.remove(aVar, stub);
                    a7b.b("MusicControlApiManager", "[registerPlayStateListener] --> " + e3.getMessage());
                    return false;
                }
            }
        }
    }

    public static void f(String str) {
        IMusicControlAidl iMusicControlAidlB = b();
        if (iMusicControlAidlB != null) {
            try {
                iMusicControlAidlB.sendMusicControlDisable(str);
            } catch (RemoteException e2) {
                a7b.b("MusicControlApiManager", "[sendMusicControlDisable] --> " + e2.getMessage());
            }
        }
    }

    public static void g(String str) {
        IMusicControlAidl iMusicControlAidlB = b();
        if (iMusicControlAidlB != null) {
            try {
                iMusicControlAidlB.sendMusicControlEnable(str);
            } catch (RemoteException e2) {
                a7b.b("MusicControlApiManager", "[sendMusicControlEnable] --> " + e2.getMessage());
            }
        }
    }

    public static void h(a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (b) {
            IMusicPlayStateCallback iMusicPlayStateCallbackRemove = a.remove(aVar);
            if (iMusicPlayStateCallbackRemove == null) {
                return;
            }
            IMusicControlAidl iMusicControlAidlB = b();
            if (iMusicControlAidlB == null) {
                return;
            }
            try {
                iMusicControlAidlB.unregisterPlayStateCallback(iMusicPlayStateCallbackRemove);
            } catch (RemoteException e2) {
                a7b.b("MusicControlApiManager", "[unregisterPlayStateListener] --> " + e2.getMessage());
            }
        }
    }
}
