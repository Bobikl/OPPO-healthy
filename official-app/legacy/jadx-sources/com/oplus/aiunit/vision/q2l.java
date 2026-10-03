package com.oplus.aiunit.vision;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class q2l implements MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener {
    public static final int FINISH_REASON_EMPTY_SOURCE = 4;
    public static final int FINISH_REASON_MEDIA_PLAYER_ERROR = 2;
    public static final int FINISH_REASON_PLAY_SETUP_FAILED = 3;
    public static final int FINISH_REASON_SUCCESS = 1;
    public final Context i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaPlayer f15612l;
    public MediaPlayer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f15613n;
    public Uri o;
    public a r;
    public boolean s;
    public boolean t;
    public volatile boolean u;
    public AudioAttributes v;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Uri> f15611j = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<Long> k = new ConcurrentLinkedQueue<>();
    public long p = -1;
    public long q = -1;
    public final MediaPlayer.OnPreparedListener w = new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.o2l
        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.i.l(mediaPlayer);
        }
    };
    public final MediaPlayer.OnPreparedListener x = new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.p2l
        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.i.m(mediaPlayer);
        }
    };

    public interface a {
        void a(boolean z, int i);
    }

    public q2l(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.i = applicationContext;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f15612l = mediaPlayer;
        try {
            mediaPlayer.setWakeMode(applicationContext, 1);
            this.f15612l.setVolume(1.0f, 1.0f);
        } catch (Exception e2) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "setWakeMode current", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        if (this.u) {
            return;
        }
        try {
            mediaPlayer.start();
            n("onPrepared start", mediaPlayer);
        } catch (IllegalStateException e2) {
            a7b.b("VMEDIA_LocalSegmentPlayer", "onPrepared start: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        if (this.u) {
            return;
        }
        try {
            MediaPlayer mediaPlayer2 = this.f15612l;
            if (mediaPlayer2 == null || mediaPlayer2 == mediaPlayer) {
                return;
            }
            mediaPlayer2.setNextMediaPlayer(mediaPlayer);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            a7b.b("VMEDIA_LocalSegmentPlayer", "onNextPrepared setNextMediaPlayer: " + e2.getMessage());
        }
    }

    public final int c(LinkedList<Uri> linkedList, long j2) {
        int i = 0;
        if (linkedList == null) {
            return 0;
        }
        for (Uri uri : linkedList) {
            if (uri != null) {
                this.f15611j.offer(uri);
                this.k.offer(Long.valueOf(j2));
                i++;
            }
        }
        return i;
    }

    public final void d(LinkedList<Uri> linkedList, long j2) {
        if (linkedList == null || linkedList.isEmpty()) {
            a7b.m("VMEDIA_LocalSegmentPlayer", "play: already playing and incoming list empty");
        } else if (c(linkedList, j2) <= 0) {
            a7b.m("VMEDIA_LocalSegmentPlayer", "play: already playing and no valid uri to append");
        } else {
            u();
        }
    }

    public final void e(MediaPlayer mediaPlayer) {
        AudioAttributes audioAttributes = this.v;
        if (audioAttributes != null) {
            mediaPlayer.setAudioAttributes(audioAttributes);
        }
    }

    public final void f() {
        this.f15611j.clear();
        this.k.clear();
        r();
        this.s = false;
        this.t = false;
        this.f15613n = null;
        this.o = null;
        this.p = -1L;
        this.q = -1L;
        o(false, 3);
    }

    public final void g() {
        if (this.m != null) {
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.m = mediaPlayer;
        try {
            mediaPlayer.setWakeMode(this.i, 1);
        } catch (Exception e2) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "setWakeMode next", e2);
        }
    }

    public final String h(MediaPlayer mediaPlayer) {
        Uri uri;
        if (mediaPlayer == this.f15612l) {
            uri = this.f15613n;
        } else {
            uri = mediaPlayer == this.m ? this.o : null;
        }
        return uri == null ? "unknown" : uri.getLastPathSegment();
    }

    public final String i(MediaPlayer mediaPlayer) {
        if (mediaPlayer == this.f15612l) {
            return "currentPlayer";
        }
        return mediaPlayer == this.m ? "nextPlayer" : "unknownPlayer";
    }

    public final String j(MediaPlayer mediaPlayer) {
        long j2;
        if (mediaPlayer == this.f15612l) {
            j2 = this.p;
        } else {
            j2 = mediaPlayer == this.m ? this.q : -1L;
        }
        return j2 >= 0 ? String.valueOf(j2) : "unknown";
    }

    public boolean k() {
        if (this.u) {
            return false;
        }
        return this.s;
    }

    public final void n(String str, MediaPlayer mediaPlayer) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", player=");
        sb.append(i(mediaPlayer));
        sb.append(", file=");
        sb.append(h(mediaPlayer));
        sb.append(", voiceId=");
        sb.append(j(mediaPlayer));
    }

    public final void o(boolean z, int i) {
        a aVar = this.r;
        if (aVar != null) {
            aVar.a(z, i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        boolean zIsPlaying;
        if (this.u) {
            return;
        }
        try {
            this.f15612l.reset();
        } catch (Exception e2) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "onCompletion reset current", e2);
        }
        MediaPlayer mediaPlayer2 = this.f15612l;
        Uri uri = this.f15613n;
        long j2 = this.p;
        MediaPlayer mediaPlayer3 = this.m;
        if (mediaPlayer3 != null) {
            this.f15612l = mediaPlayer3;
            this.m = mediaPlayer2;
            this.f15613n = this.o;
            this.o = uri;
            this.p = this.q;
            this.q = j2;
            n("onCompletion switch", mediaPlayer3);
        }
        this.t = false;
        if (!this.f15611j.isEmpty() && this.m != null) {
            try {
                Uri uriPoll = this.f15611j.poll();
                Long lPoll = this.k.poll();
                if (uriPoll != null) {
                    e(this.m);
                    this.m.setDataSource(this.i, uriPoll);
                    this.o = uriPoll;
                    this.q = lPoll == null ? -1L : lPoll.longValue();
                    this.m.setOnPreparedListener(this.x);
                    this.m.setOnErrorListener(this);
                    this.m.prepareAsync();
                    this.t = true;
                }
            } catch (IOException | IllegalArgumentException | IllegalStateException e3) {
                a7b.b("VMEDIA_LocalSegmentPlayer", "onCompletion chain: " + e3.getMessage());
                this.f15611j.clear();
                this.k.clear();
                this.s = false;
                this.t = false;
                this.p = -1L;
                this.q = -1L;
                o(false, 3);
                return;
            }
        }
        try {
            zIsPlaying = this.f15612l.isPlaying();
        } catch (IllegalStateException unused) {
            zIsPlaying = false;
        }
        if (zIsPlaying || !this.f15611j.isEmpty()) {
            return;
        }
        this.s = false;
        o(true, 1);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        a7b.b("VMEDIA_LocalSegmentPlayer", "onError what=" + i + " extra=" + i2);
        if (this.u) {
            return true;
        }
        try {
            this.f15612l.setNextMediaPlayer(null);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onError setNextMediaPlayer(null): ");
            sb.append(e2.getMessage());
        }
        try {
            this.f15612l.release();
        } catch (Exception unused) {
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.f15612l = mediaPlayer2;
        try {
            mediaPlayer2.setWakeMode(this.i, 1);
        } catch (Exception e3) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "onError setWakeMode new current", e3);
        }
        MediaPlayer mediaPlayer3 = this.m;
        if (mediaPlayer3 != null) {
            try {
                mediaPlayer3.reset();
            } catch (Exception e4) {
                a7b.n("VMEDIA_LocalSegmentPlayer", "onError reset next", e4);
            }
        }
        this.f15611j.clear();
        this.k.clear();
        this.s = false;
        this.t = false;
        this.f15613n = null;
        this.o = null;
        this.p = -1L;
        this.q = -1L;
        o(false, 2);
        return true;
    }

    public void p(LinkedList<Uri> linkedList, boolean z, AudioAttributes audioAttributes, long j2) {
        if (this.u) {
            return;
        }
        if (this.s) {
            d(linkedList, j2);
            return;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            a7b.m("VMEDIA_LocalSegmentPlayer", "play: empty list");
            o(false, 4);
            return;
        }
        if (audioAttributes != null) {
            this.v = audioAttributes;
        }
        this.f15611j.clear();
        this.k.clear();
        c(linkedList, j2);
        this.s = true;
        try {
            Uri uriPoll = this.f15611j.poll();
            Long lPoll = this.k.poll();
            if (uriPoll == null) {
                this.s = false;
                o(false, 4);
                return;
            }
            e(this.f15612l);
            this.f15612l.setDataSource(this.i, uriPoll);
            this.f15613n = uriPoll;
            long jLongValue = -1;
            this.p = lPoll == null ? -1L : lPoll.longValue();
            this.f15612l.setLooping(z);
            this.f15612l.setOnPreparedListener(this.w);
            this.f15612l.setOnErrorListener(this);
            this.f15612l.prepareAsync();
            Uri uriPoll2 = this.f15611j.poll();
            Long lPoll2 = this.k.poll();
            if (uriPoll2 == null) {
                return;
            }
            g();
            e(this.m);
            this.m.setDataSource(this.i, uriPoll2);
            this.o = uriPoll2;
            if (lPoll2 != null) {
                jLongValue = lPoll2.longValue();
            }
            this.q = jLongValue;
            this.m.setOnPreparedListener(this.x);
            this.m.setOnErrorListener(this);
            this.m.prepareAsync();
            this.t = true;
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            a7b.b("VMEDIA_LocalSegmentPlayer", "play: " + e2.getMessage());
            f();
        }
    }

    public void q() {
        r();
        this.f15611j.clear();
        this.k.clear();
        this.s = false;
        this.t = false;
        this.f15613n = null;
        this.o = null;
        this.p = -1L;
        this.q = -1L;
    }

    public final void r() {
        try {
            this.f15612l.reset();
        } catch (Exception e2) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "reset current", e2);
        }
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception e3) {
                a7b.n("VMEDIA_LocalSegmentPlayer", "reset next", e3);
            }
        }
    }

    public void s(AudioAttributes audioAttributes) {
        this.v = audioAttributes;
    }

    public void setOnPlaybackFinishedListener(a aVar) {
        this.r = aVar;
    }

    public void t() {
        try {
            MediaPlayer mediaPlayer = this.f15612l;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
        } catch (Exception e2) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "stop current", e2);
        }
        try {
            MediaPlayer mediaPlayer2 = this.m;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
            }
        } catch (Exception e3) {
            a7b.n("VMEDIA_LocalSegmentPlayer", "stop next", e3);
        }
    }

    public final void u() {
        if (this.u || !this.s || this.t) {
            return;
        }
        Uri uriPoll = this.f15611j.poll();
        Long lPoll = this.k.poll();
        if (uriPoll == null) {
            return;
        }
        try {
            g();
            this.m.reset();
            e(this.m);
            this.m.setDataSource(this.i, uriPoll);
            this.o = uriPoll;
            this.q = lPoll == null ? -1L : lPoll.longValue();
            this.m.setOnPreparedListener(this.x);
            this.m.setOnErrorListener(this);
            this.m.prepareAsync();
            this.t = true;
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            a7b.b("VMEDIA_LocalSegmentPlayer", "tryPrepareNextSegmentIfNeeded: " + e2.getMessage());
            this.f15611j.clear();
            f();
        }
    }
}
