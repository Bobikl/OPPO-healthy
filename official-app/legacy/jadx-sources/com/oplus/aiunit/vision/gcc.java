package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watch.music.control.MusicControlApiImpl;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 [2\u00020\u0001:\u000248B\u000f\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001cJ\u0018\u0010*\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(J\u0006\u0010+\u001a\u00020(J\u000f\u0010,\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020(J\u0006\u00101\u001a\u000200J\u000e\u00102\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R \u0010H\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00180E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00180L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00180L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR\u0016\u0010T\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR4\u0010X\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020(0Uj\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020(`V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010W¨\u0006\\"}, d2 = {"Lcom/oplus/aiunit/vision/gcc;", "", "Landroid/os/Message;", "msg", "", LogFieldKey.PROCESS_NAME_KEY, "u", c8l.KEY_B, "v", "t", "q", "s", "z", "x", LogFieldKey.LEVEL_KEY, "r", "y", "A", "N", "M", "", "Landroid/media/session/MediaController;", "list", "D", "Lcom/oplus/aiunit/vision/nrb;", "mediaPlayerWrapper", "G", UserInfo.SEX_FEMALE, "", "direction", MapSchema.FIELD_NAME_KEY, "keyCode", LogFieldKey.MESSAGE_KEY, "K", "H", ExifInterface.LONGITUDE_EAST, "targetVolume", "J", "", "nodeId", "", "isForeground", "L", "C", "o", "()Ljava/lang/Boolean;", "isSuccess", "w", "Landroid/os/Handler;", "n", "I", "Lcom/oplus/aiunit/vision/hbc;", "a", "Lcom/oplus/aiunit/vision/hbc;", "mListener", "Landroid/os/HandlerThread;", "b", "Landroid/os/HandlerThread;", "mHandlerThread", "Lcom/oplus/aiunit/vision/gcc$b;", "c", "Lcom/oplus/aiunit/vision/gcc$b;", "mCustomHandler", "Lcom/oplus/aiunit/vision/f4l;", "d", "Lcom/oplus/aiunit/vision/f4l;", "mVolumeManager", MapSchema.FIELD_NAME_ENTRY, "mRegisterState", "", "f", "Ljava/util/Map;", "mMediaPlayers", b2n.f, "Lcom/oplus/aiunit/vision/nrb;", "mMediaPlayerWrapper", "Ljava/util/Stack;", b2n.g, "Ljava/util/Stack;", "mPlayingWrapper", "i", "mPauseWrapper", "j", "Z", "mHasSendMusicCloseMsg", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "mWatchForegroundMap", "<init>", "(Lcom/oplus/aiunit/vision/hbc;)V", "Companion", "music_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMusicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicService.kt\ncom/heytap/health/watch/music/control/MusicService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,533:1\n1#2:534\n215#3,2:535\n*S KotlinDebug\n*F\n+ 1 MusicService.kt\ncom/heytap/health/watch/music/control/MusicService\n*L\n411#1:535,2\n*E\n"})
public final class gcc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final hbc mListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HandlerThread mHandlerThread;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b mCustomHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final f4l mVolumeManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int mRegisterState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<String, nrb> mMediaPlayers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public nrb mMediaPlayerWrapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Stack<nrb> mPlayingWrapper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Stack<nrb> mPauseWrapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mHasSendMusicCloseMsg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Boolean> mWatchForegroundMap;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/gcc$b;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Lcom/oplus/aiunit/vision/gcc;Landroid/os/Looper;)V", "music_impl_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends Handler {
        public final /* synthetic */ gcc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull gcc gccVar, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.a = gccVar;
        }

        @Override // android.os.Handler
        @SuppressLint({"CheckResult"})
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            a7b.f("MCS_Service", "handleMessage msg.what = " + msg.what);
            switch (msg.what) {
                case 1:
                    this.a.p(msg);
                    break;
                case 2:
                    this.a.v(msg);
                    break;
                case 3:
                    this.a.t(msg);
                    break;
                case 4:
                    this.a.q(msg);
                    break;
                case 5:
                    this.a.s(msg);
                    break;
                case 6:
                    this.a.z();
                    break;
                case 7:
                    this.a.x();
                    break;
                case 8:
                    this.a.r();
                    break;
                case 9:
                    this.a.y(msg);
                    break;
                case 10:
                    this.a.A(msg);
                    break;
            }
        }
    }

    public gcc(@NotNull hbc mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
        HandlerThread handlerThread = new HandlerThread("MusicControlHandler");
        handlerThread.start();
        this.mHandlerThread = handlerThread;
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "mHandlerThread.looper");
        this.mCustomHandler = new b(this, looper);
        this.mVolumeManager = new f4l(this);
        this.mRegisterState = -1;
        Map<String, nrb> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(HashMap<…ediaControllerWrapper>())");
        this.mMediaPlayers = mapSynchronizedMap;
        this.mPlayingWrapper = new Stack<>();
        this.mPauseWrapper = new Stack<>();
        this.mWatchForegroundMap = new HashMap<>();
    }

    public final void A(Message msg) {
        boolean z = msg.arg1 == 1;
        Object obj = msg.obj;
        String str = obj instanceof String ? (String) obj : null;
        a7b.f("MCS_Service", "handleWatchStatueChange isForeground: " + z);
        this.mWatchForegroundMap.put(str, Boolean.valueOf(z));
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar != null) {
            if ((nrbVar != null ? nrbVar.e() : null) != null) {
                if (z) {
                    x();
                    return;
                }
                return;
            }
        }
        a7b.m("MCS_Service", "handleWatchStatueChange controller is null");
    }

    public final void B() {
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar != null) {
            PlaybackState playbackStateH = nrbVar.h();
            if (playbackStateH == null) {
                this.mPauseWrapper.remove(nrbVar);
                this.mPauseWrapper.push(nrbVar);
            } else if (playbackStateH.getState() == 3) {
                this.mPlayingWrapper.remove(nrbVar);
                this.mPlayingWrapper.push(nrbVar);
            } else {
                this.mPauseWrapper.remove(nrbVar);
                this.mPauseWrapper.push(nrbVar);
            }
        }
    }

    public final boolean C() {
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar == null) {
            return false;
        }
        PlaybackState playbackStateH = nrbVar != null ? nrbVar.h() : null;
        return playbackStateH != null && playbackStateH.getState() == 3;
    }

    public final void D(@Nullable List<MediaController> list) {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(1);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMes…G_ACTIVE_SESSION_CHANGED)");
        messageObtainMessage.obj = list;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void E() {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(8);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_DESTROY)");
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void F(@NotNull nrb mediaPlayerWrapper) {
        Intrinsics.checkNotNullParameter(mediaPlayerWrapper, "mediaPlayerWrapper");
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(3);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_SEND_PLAY_INFO)");
        messageObtainMessage.obj = mediaPlayerWrapper;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void G(@NotNull nrb mediaPlayerWrapper) {
        Intrinsics.checkNotNullParameter(mediaPlayerWrapper, "mediaPlayerWrapper");
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(2);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_SEND_PLAY_STATE)");
        messageObtainMessage.obj = mediaPlayerWrapper;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void H() {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(7);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMes…PONSE_REQUEST_TOTAL_INFO)");
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void I(@NotNull nrb mediaPlayerWrapper) {
        Intrinsics.checkNotNullParameter(mediaPlayerWrapper, "mediaPlayerWrapper");
        TypeIntrinsics.asMutableMap(this.mMediaPlayers).remove(mediaPlayerWrapper.g());
        this.mPlayingWrapper.remove(mediaPlayerWrapper);
        this.mPauseWrapper.remove(mediaPlayerWrapper);
        if (!this.mPlayingWrapper.isEmpty()) {
            this.mMediaPlayerWrapper = this.mPlayingWrapper.peek();
            M();
        } else if (!(!this.mPauseWrapper.isEmpty())) {
            N();
        } else {
            this.mMediaPlayerWrapper = this.mPauseWrapper.peek();
            M();
        }
    }

    public final void J(int targetVolume) {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(9);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_SLIDE_VOLUME)");
        messageObtainMessage.arg1 = targetVolume;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void K() {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(6);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_SEND_VOLUME_INFO)");
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void L(@Nullable String nodeId, boolean isForeground) {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(10);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_WATCH_STATUS)");
        messageObtainMessage.arg1 = isForeground ? 1 : 0;
        messageObtainMessage.obj = nodeId;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void M() {
        nrb nrbVar;
        String mAppName;
        String strG;
        nrb nrbVar2 = this.mMediaPlayerWrapper;
        if (nrbVar2 != null) {
            if ((nrbVar2 != null ? nrbVar2.e() : null) != null) {
                nrb.Companion companion = nrb.INSTANCE;
                nrb nrbVar3 = this.mMediaPlayerWrapper;
                PlaybackState playbackStateH = (companion.b(nrbVar3 != null ? nrbVar3.f() : null) || (nrbVar = this.mMediaPlayerWrapper) == null) ? null : nrbVar.h();
                qsg.Companion companion2 = qsg.INSTANCE;
                nrb nrbVar4 = this.mMediaPlayerWrapper;
                MediaMetadata mediaMetadataF = nrbVar4 != null ? nrbVar4.f() : null;
                nrb nrbVar5 = this.mMediaPlayerWrapper;
                String str = (nrbVar5 == null || (strG = nrbVar5.g()) == null) ? "" : strG;
                nrb nrbVar6 = this.mMediaPlayerWrapper;
                companion2.k(playbackStateH, mediaMetadataF, str, (nrbVar6 == null || (mAppName = nrbVar6.getMAppName()) == null) ? "" : mAppName, this.mVolumeManager.b(), this.mVolumeManager.c());
                return;
            }
        }
        a7b.m("MCS_Service", "sendMediaSessionInfo controller is null");
    }

    public final void N() {
        if (this.mHasSendMusicCloseMsg) {
            a7b.f("MCS_Service", "sendMusicCloseInfo mHasSendMusicCloseMsg is true, ignore");
        } else {
            qsg.INSTANCE.h();
            this.mHasSendMusicCloseMsg = true;
        }
    }

    public final void k(int direction) {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(4);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMessage(MSG_ADJUST_VOLUME)");
        messageObtainMessage.arg1 = direction;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    public final void l() {
        if (!this.mMediaPlayers.isEmpty()) {
            Iterator<Map.Entry<String, nrb>> it = this.mMediaPlayers.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().k();
            }
            this.mMediaPlayers.clear();
        }
    }

    public final void m(int keyCode) {
        Message messageObtainMessage = this.mCustomHandler.obtainMessage(5);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mCustomHandler.obtainMes…e(MSG_DISPATCH_MEDIA_KEY)");
        messageObtainMessage.arg1 = keyCode;
        this.mCustomHandler.sendMessage(messageObtainMessage);
    }

    @NotNull
    public final Handler n() {
        return this.mCustomHandler;
    }

    @Nullable
    public final Boolean o() {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (currentConnectId == null) {
            return null;
        }
        return this.mWatchForegroundMap.get(currentConnectId);
    }

    public final void p(Message msg) {
        MediaController mediaController;
        Object obj = msg.obj;
        if (obj == null) {
            u();
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            u();
            return;
        }
        try {
            int size = list.size() - 1;
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                mediaController = null;
                boolean z = false;
                if (-1 >= size) {
                    break;
                }
                MediaController mediaController2 = (MediaController) list.get(size);
                if (mediaController2 != null) {
                    String packageName = mediaController2.getPackageName();
                    if (s9c.e().g(packageName)) {
                        a7b.f("MCS_Service", "music controller in blacklist: " + packageName + " ");
                    } else {
                        if (this.mMediaPlayers.containsKey(packageName)) {
                            nrb nrbVar = this.mMediaPlayers.get(packageName);
                            a7b.m("MCS_Service", "old controller: " + (nrbVar != null ? nrbVar.e() : null) + ", new controller: " + mediaController2);
                        } else {
                            this.mMediaPlayers.put(packageName, new nrb(this, mediaController2));
                        }
                        if (mediaController2.getPlaybackState() != null) {
                            PlaybackState playbackState = mediaController2.getPlaybackState();
                            if (playbackState != null && playbackState.getState() == 3) {
                                z = true;
                            }
                            if (z) {
                                i2 = size;
                            }
                            if (nrb.INSTANCE.b(mediaController2.getMetadata())) {
                                i3 = size;
                            } else {
                                i = size;
                                i3 = i;
                            }
                            i4 = i3;
                        } else {
                            i4 = size;
                        }
                    }
                }
                size--;
            }
            a7b.f("MCS_Service", "metaDataIndex: " + i + ", playingIndex: " + i2 + ", stateNotNullIndex: " + i3 + ", controllerNotNullIndex: " + i4);
            if (i != -1) {
                mediaController = (MediaController) list.get(i);
            } else if (i2 != -1) {
                mediaController = (MediaController) list.get(i2);
            } else if (i3 != -1) {
                mediaController = (MediaController) list.get(i3);
            } else if (i4 != -1) {
                mediaController = (MediaController) list.get(i4);
            }
            if (mediaController == null) {
                u();
                return;
            }
            a7b.f("MCS_Service", "handleActiveSessionsChange mediaController is " + mediaController);
            this.mHasSendMusicCloseMsg = false;
            this.mMediaPlayerWrapper = this.mMediaPlayers.get(mediaController.getPackageName());
            B();
            M();
        } catch (Exception e2) {
            a7b.b("MCS_Service", e2.getMessage());
        }
    }

    public final void q(Message msg) {
        MediaController mediaControllerE;
        int i = msg.arg1;
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar != null) {
            if ((nrbVar != null ? nrbVar.e() : null) != null) {
                nrb nrbVar2 = this.mMediaPlayerWrapper;
                if (nrbVar2 == null || (mediaControllerE = nrbVar2.e()) == null) {
                    return;
                }
                mediaControllerE.adjustVolume(i, 1);
                return;
            }
        }
        a7b.m("MCS_Service", "handleAdjustVolume controller is null");
    }

    public final void r() {
        a7b.f("MCS_Service", "handleDestroy");
        this.mCustomHandler.removeCallbacksAndMessages(null);
        this.mHandlerThread.quit();
        this.mVolumeManager.e();
        l();
        this.mPlayingWrapper.clear();
        this.mPauseWrapper.clear();
        this.mMediaPlayerWrapper = null;
    }

    public final void s(Message msg) {
        MediaController mediaControllerE;
        MediaController mediaControllerE2;
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar != null) {
            if ((nrbVar != null ? nrbVar.e() : null) != null) {
                int i = msg.arg1;
                if (i == 85) {
                    i = C() ? 127 : 126;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("handleDispatchMediaKey: ");
                sb.append(i);
                long jUptimeMillis = SystemClock.uptimeMillis();
                KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, 0, i, 0);
                nrb nrbVar2 = this.mMediaPlayerWrapper;
                Object objValueOf = (nrbVar2 == null || (mediaControllerE2 = nrbVar2.e()) == null) ? -1 : Boolean.valueOf(mediaControllerE2.dispatchMediaButtonEvent(keyEvent));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("downResult: ");
                sb2.append(objValueOf);
                KeyEvent keyEvent2 = new KeyEvent(jUptimeMillis, jUptimeMillis, 1, i, 0);
                nrb nrbVar3 = this.mMediaPlayerWrapper;
                Object objValueOf2 = (nrbVar3 == null || (mediaControllerE = nrbVar3.e()) == null) ? -1 : Boolean.valueOf(mediaControllerE.dispatchMediaButtonEvent(keyEvent2));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("upResult: ");
                sb3.append(objValueOf2);
                return;
            }
        }
        a7b.f("MCS_Service", "handleDispatchMediaKey controller is null");
    }

    public final void t(Message msg) {
        String mAppName;
        String strG;
        Object obj = msg.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.health.watch.music.control.MediaControllerWrapper");
        if (!Intrinsics.areEqual((nrb) obj, this.mMediaPlayerWrapper)) {
            a7b.m("MCS_Service", "handleMetadataChange not current wrapper");
            return;
        }
        qsg.Companion companion = qsg.INSTANCE;
        nrb nrbVar = this.mMediaPlayerWrapper;
        PlaybackState playbackStateH = nrbVar != null ? nrbVar.h() : null;
        nrb nrbVar2 = this.mMediaPlayerWrapper;
        MediaMetadata mediaMetadataF = nrbVar2 != null ? nrbVar2.f() : null;
        nrb nrbVar3 = this.mMediaPlayerWrapper;
        String str = (nrbVar3 == null || (strG = nrbVar3.g()) == null) ? "" : strG;
        nrb nrbVar4 = this.mMediaPlayerWrapper;
        companion.i(playbackStateH, mediaMetadataF, str, (nrbVar4 == null || (mAppName = nrbVar4.getMAppName()) == null) ? "" : mAppName, this.mVolumeManager.b(), this.mVolumeManager.c());
    }

    public final void u() {
        a7b.f("MCS_Service", "handleNoControllers");
        if (this.mMediaPlayerWrapper != null) {
            N();
        }
        MusicControlApiImpl.d().e(false, "", 0);
        l();
        this.mPlayingWrapper.clear();
        this.mPauseWrapper.clear();
        this.mMediaPlayerWrapper = null;
    }

    public final void v(Message msg) {
        String strG;
        String mAppName;
        String strG2;
        Object obj = msg.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.health.watch.music.control.MediaControllerWrapper");
        nrb nrbVar = (nrb) obj;
        PlaybackState playbackStateH = nrbVar.h();
        if (playbackStateH != null) {
            if (playbackStateH.getState() == 3) {
                this.mPauseWrapper.remove(nrbVar);
                this.mPlayingWrapper.remove(nrbVar);
                this.mPlayingWrapper.push(nrbVar);
                if (!Intrinsics.areEqual(this.mMediaPlayerWrapper, nrbVar)) {
                    this.mMediaPlayerWrapper = nrbVar;
                }
            } else {
                this.mPlayingWrapper.remove(nrbVar);
                this.mPauseWrapper.remove(nrbVar);
                this.mPauseWrapper.push(nrbVar);
                if (!this.mPlayingWrapper.isEmpty()) {
                    this.mMediaPlayerWrapper = this.mPlayingWrapper.peek();
                }
            }
            qsg.Companion companion = qsg.INSTANCE;
            nrb nrbVar2 = this.mMediaPlayerWrapper;
            PlaybackState playbackStateH2 = nrbVar2 != null ? nrbVar2.h() : null;
            nrb nrbVar3 = this.mMediaPlayerWrapper;
            MediaMetadata mediaMetadataF = nrbVar3 != null ? nrbVar3.f() : null;
            nrb nrbVar4 = this.mMediaPlayerWrapper;
            String str = "";
            String str2 = (nrbVar4 == null || (strG2 = nrbVar4.g()) == null) ? "" : strG2;
            nrb nrbVar5 = this.mMediaPlayerWrapper;
            companion.j(playbackStateH2, mediaMetadataF, str2, (nrbVar5 == null || (mAppName = nrbVar5.getMAppName()) == null) ? "" : mAppName, this.mVolumeManager.b(), this.mVolumeManager.c());
            nrb nrbVar6 = this.mMediaPlayerWrapper;
            PlaybackState playbackStateH3 = nrbVar6 != null ? nrbVar6.h() : null;
            MusicControlApiImpl musicControlApiImplD = MusicControlApiImpl.d();
            boolean z = playbackStateH3 != null && playbackStateH3.getState() == 3;
            if (nrbVar6 != null && (strG = nrbVar6.g()) != null) {
                str = strG;
            }
            musicControlApiImplD.e(z, str, playbackStateH3 != null ? playbackStateH3.getState() : 0);
        }
    }

    public final void w(boolean isSuccess) {
        this.mRegisterState = !isSuccess ? 1 : 0;
    }

    public final void x() {
        boolean zF;
        String mAppName;
        String strG;
        a7b.f("MCS_Service", "handleRequestTotalInfo registerState = " + this.mRegisterState);
        if (this.mRegisterState == 0) {
            zF = true;
        } else {
            twc.Companion companion = twc.INSTANCE;
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            zF = companion.f(contextA);
            if (zF) {
                this.mListener.u(this.mCustomHandler);
            }
        }
        boolean z = zF;
        qsg.Companion companion2 = qsg.INSTANCE;
        boolean zC = C();
        nrb nrbVar = this.mMediaPlayerWrapper;
        PlaybackState playbackStateH = nrbVar != null ? nrbVar.h() : null;
        nrb nrbVar2 = this.mMediaPlayerWrapper;
        MediaMetadata mediaMetadataF = nrbVar2 != null ? nrbVar2.f() : null;
        nrb nrbVar3 = this.mMediaPlayerWrapper;
        String str = (nrbVar3 == null || (strG = nrbVar3.g()) == null) ? "" : strG;
        nrb nrbVar4 = this.mMediaPlayerWrapper;
        companion2.f(zC, playbackStateH, mediaMetadataF, str, (nrbVar4 == null || (mAppName = nrbVar4.getMAppName()) == null) ? "" : mAppName, this.mVolumeManager.b(), this.mVolumeManager.c(), z);
    }

    public final void y(Message msg) {
        MediaController mediaControllerE;
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar != null) {
            if ((nrbVar != null ? nrbVar.e() : null) != null) {
                int i = msg.arg1;
                nrb nrbVar2 = this.mMediaPlayerWrapper;
                if (nrbVar2 == null || (mediaControllerE = nrbVar2.e()) == null) {
                    return;
                }
                mediaControllerE.setVolumeTo(i, 1);
                return;
            }
        }
        a7b.m("MCS_Service", "handleSlideVolume controller is null");
    }

    public final void z() {
        nrb nrbVar = this.mMediaPlayerWrapper;
        if (nrbVar != null) {
            if ((nrbVar != null ? nrbVar.e() : null) == null) {
                return;
            }
            int iB = this.mVolumeManager.b();
            int iC = this.mVolumeManager.c();
            a7b.f("MCS_Service", "handleVolumeInfoChange maxVolume: " + iC + ", volume: " + iB);
            if (iB < 0 || iC < 0) {
                return;
            }
            qsg.INSTANCE.l(iB, iC);
        }
    }
}
