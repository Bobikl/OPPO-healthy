package com.oplus.aiunit.vision;

import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.heytap.health.sport.model.MovingGoal;
import com.oplus.channel.client.data.Action;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class eki {
    public static final int MSG_DURATION_COST = 3;
    public static final int MSG_DURATION_HOUR = 5;
    public static final int MSG_DURATION_HOUR_COUNT = 4;
    public static final int MSG_DURATION_MIN = 7;
    public static final int MSG_DURATION_MIN_COUNT = 6;
    public static final int MSG_DURATION_SEC = 9;
    public static final int MSG_DURATION_SEC_COUNT = 8;
    public static final int MSG_KM = 2;
    public static final int MSG_KM_COUNT = 1;
    public static final int MSG_PACE = 10;
    public static final int MSG_PACE_MIN = 12;
    public static final int MSG_PACE_MIN_COUNT = 11;
    public static final int MSG_PACE_SEC = 14;
    public static final int MSG_PACE_SEC_COUNT = 13;
    public static final int MSG_RELEASE = 16;
    public static final int MSG_SPEAK = 15;
    public MovingGoal a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f10969c;
    public b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10970e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10971j;
    public AudioManager r;
    public final LinkedBlockingQueue<b4l> b = new LinkedBlockingQueue<>();
    public Handler k = new Handler();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f10972l = new a();
    public c4l m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10973n = true;
    public boolean o = true;
    public boolean p = false;
    public boolean q = false;
    public final AudioManager.OnAudioFocusChangeListener s = new AudioManager.OnAudioFocusChangeListener() { // from class: com.oplus.aiunit.vision.dki
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            eki.y(i);
        }
    };

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            eki.this.f10973n = true;
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            b4l b4lVar;
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    c4l c4lVar = eki.this.m;
                    String str = aki.SPORTS_MEDIA_PATH;
                    eki ekiVar = eki.this;
                    c4lVar.c(str, ekiVar.u(ekiVar.f10970e));
                    eki ekiVar2 = eki.this;
                    sendEmptyMessageDelayed(2, t3l.a(ekiVar2.u(ekiVar2.f10970e)));
                    break;
                case 2:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_KM);
                    sendEmptyMessageDelayed(3, t3l.a(aki.SPORTS_VOICE_KM));
                    break;
                case 3:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_TIME_USE);
                    if (eki.this.f != 0) {
                        sendEmptyMessageDelayed(4, t3l.a(aki.SPORTS_VOICE_TIME_USE));
                    } else {
                        sendEmptyMessageDelayed(6, t3l.a(aki.SPORTS_VOICE_TIME_USE));
                    }
                    break;
                case 4:
                    c4l c4lVar2 = eki.this.m;
                    String str2 = aki.SPORTS_MEDIA_PATH;
                    eki ekiVar3 = eki.this;
                    c4lVar2.c(str2, ekiVar3.u(ekiVar3.f));
                    eki ekiVar4 = eki.this;
                    sendEmptyMessageDelayed(5, t3l.a(ekiVar4.u(ekiVar4.f)));
                    break;
                case 5:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_HOUR);
                    sendEmptyMessageDelayed(6, t3l.a(aki.SPORTS_VOICE_HOUR));
                    break;
                case 6:
                    c4l c4lVar3 = eki.this.m;
                    String str3 = aki.SPORTS_MEDIA_PATH;
                    eki ekiVar5 = eki.this;
                    c4lVar3.c(str3, ekiVar5.u(ekiVar5.g));
                    eki ekiVar6 = eki.this;
                    sendEmptyMessageDelayed(7, t3l.a(ekiVar6.u(ekiVar6.g)));
                    break;
                case 7:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_MINUTE);
                    sendEmptyMessageDelayed(8, t3l.a(aki.SPORTS_VOICE_MINUTE));
                    break;
                case 8:
                    c4l c4lVar4 = eki.this.m;
                    String str4 = aki.SPORTS_MEDIA_PATH;
                    eki ekiVar7 = eki.this;
                    c4lVar4.c(str4, ekiVar7.u(ekiVar7.h));
                    eki ekiVar8 = eki.this;
                    sendEmptyMessageDelayed(9, t3l.a(ekiVar8.u(ekiVar8.h)));
                    break;
                case 9:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_SECOND);
                    if (eki.this.a.getSportMode() != 1 && eki.this.a.getSportMode() != 3 && eki.this.i <= 60) {
                        sendEmptyMessageDelayed(10, t3l.a(aki.SPORTS_VOICE_SECOND));
                        break;
                    }
                    break;
                case 10:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_AVG_PACE);
                    sendEmptyMessageDelayed(11, t3l.a(aki.SPORTS_VOICE_AVG_PACE));
                    break;
                case 11:
                    c4l c4lVar5 = eki.this.m;
                    String str5 = aki.SPORTS_MEDIA_PATH;
                    eki ekiVar9 = eki.this;
                    c4lVar5.c(str5, ekiVar9.u(ekiVar9.i));
                    eki ekiVar10 = eki.this;
                    sendEmptyMessageDelayed(12, t3l.a(ekiVar10.u(ekiVar10.i)));
                    break;
                case 12:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_MINUTE);
                    sendEmptyMessageDelayed(13, t3l.a(aki.SPORTS_VOICE_MINUTE));
                    break;
                case 13:
                    c4l c4lVar6 = eki.this.m;
                    String str6 = aki.SPORTS_MEDIA_PATH;
                    eki ekiVar11 = eki.this;
                    c4lVar6.c(str6, ekiVar11.u(ekiVar11.f10971j));
                    eki ekiVar12 = eki.this;
                    sendEmptyMessageDelayed(14, t3l.a(ekiVar12.u(ekiVar12.f10971j)));
                    break;
                case 14:
                    eki.this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_SECOND);
                    break;
                case 15:
                    eki.this.D();
                    try {
                        eki.this.q = true;
                        b4lVar = (b4l) eki.this.b.take();
                    } catch (InterruptedException e2) {
                        e2.getMessage();
                        b4lVar = null;
                    }
                    eki.this.q = false;
                    eki.this.E();
                    eki.this.A(b4lVar);
                    if (b4lVar != null) {
                        if (!b4lVar.c()) {
                            sendEmptyMessageDelayed(15, b4lVar.a());
                        } else {
                            sendEmptyMessageDelayed(16, b4lVar.a() + 500);
                        }
                    }
                    break;
                case 16:
                    eki.this.C();
                    break;
            }
        }
    }

    public eki(MovingGoal movingGoal) {
        a7b.f("SportsSpeaker", "SportsSpeaker");
        this.a = movingGoal;
        x(movingGoal);
    }

    public static /* synthetic */ void y(int i) {
    }

    public final void A(b4l b4lVar) {
        if (b4lVar == null) {
        }
        switch (b4lVar.b()) {
            case 1:
                if (this.a.getSportMode() == 1) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_WALK_START);
                } else if (this.a.getSportMode() != 3) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RUN_START);
                } else {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RIDE_START);
                }
                break;
            case 2:
                if (this.a.getSportMode() == 1) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_WALK_PAUSE);
                } else if (this.a.getSportMode() != 3) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RUN_PAUSE);
                } else {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RIDE_PAUSE);
                }
                break;
            case 3:
                if (this.a.getSportMode() == 1) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_WALK_RESUME);
                } else if (this.a.getSportMode() != 3) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RUN_RESUME);
                } else {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RIDE_RESUME);
                }
                break;
            case 4:
                if (this.a.getSportMode() == 1) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_WALK_STOP);
                } else if (this.a.getSportMode() != 3) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RUN_STOP);
                } else {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RIDE_STOP);
                }
                break;
            case 5:
                this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_GPS_WEAK);
                break;
            case 6:
                this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_GPS_RECOVER);
                break;
            case 7:
                this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_HALF_GOAL);
                break;
            case 8:
                this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_GOAL_COMPLETE);
                break;
            case 9:
                if (this.a.getSportMode() == 1) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_WALK_ALREADY);
                    this.d.sendEmptyMessageDelayed(1, t3l.a(aki.SPORTS_VOICE_WALK_ALREADY));
                } else if (this.a.getSportMode() != 3) {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RUN_ALREADY);
                    this.d.sendEmptyMessageDelayed(1, t3l.a(aki.SPORTS_VOICE_RUN_ALREADY));
                } else {
                    this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_RIDE_ALREADY);
                    this.d.sendEmptyMessageDelayed(1, t3l.a(aki.SPORTS_VOICE_RIDE_ALREADY));
                }
                break;
            case 10:
                this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_CONNECT);
                break;
            case 11:
                this.m.c(aki.SPORTS_MEDIA_PATH, aki.SPORTS_VOICE_DISCONNECT);
                break;
        }
    }

    public void B() {
        c4l c4lVar = this.m;
        String str = aki.SPORTS_MEDIA_PATH;
        c4lVar.f(str, aki.SPORTS_VOICE_WALK_START);
        this.m.f(str, aki.SPORTS_VOICE_RUN_START);
        this.m.f(str, aki.SPORTS_VOICE_RIDE_START);
    }

    public void C() {
        a7b.f("SportsSpeaker", "release");
        D();
        this.r = null;
        c4l c4lVar = this.m;
        if (c4lVar != null) {
            c4lVar.g();
        }
        HandlerThread handlerThread = this.f10969c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f10969c.join();
                this.f10969c = null;
                this.d = null;
            } catch (InterruptedException e2) {
                e2.getMessage();
            }
        }
    }

    public final void D() {
        this.r.abandonAudioFocus(this.s);
        a7b.f("SportsSpeaker", "releaseAudioFocus");
    }

    public final void E() {
        a7b.f("SportsSpeaker", "requestAudioFocus");
        this.r.requestAudioFocus(this.s, 3, 3);
    }

    public void F() {
        a7b.f("SportsSpeaker", "resume");
        if (this.a == null) {
            a7b.b("SportsSpeaker", "mMovingGoal == null");
        } else {
            this.b.add(new b4l(3, t3l.a(aki.SPORTS_VOICE_RUN_RESUME)));
        }
    }

    public void G(MovingGoal movingGoal) {
        this.a = movingGoal;
    }

    public void H(boolean z) {
        String str;
        a7b.f("SportsSpeaker", "start");
        MovingGoal movingGoal = this.a;
        if (movingGoal == null) {
            a7b.b("SportsSpeaker", "mMovingGoal == null");
            return;
        }
        int sportMode = movingGoal.getSportMode();
        if (sportMode != 1) {
            str = sportMode != 3 ? aki.SPORTS_VOICE_RUN_START : aki.SPORTS_VOICE_RIDE_START;
        } else {
            str = aki.SPORTS_VOICE_WALK_START;
        }
        this.b.add(new b4l(1, t3l.a(str), z));
    }

    public void I() {
        a7b.f("SportsSpeaker", Action.LIFE_CIRCLE_VALUE_STOP);
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.k = null;
        }
        this.d.removeCallbacksAndMessages(null);
        if (this.a == null) {
            a7b.b("SportsSpeaker", "mMovingGoal == null");
        } else {
            if (this.q) {
                this.b.add(new b4l(4, t3l.a(aki.SPORTS_VOICE_RUN_STOP), true));
                return;
            }
            this.b.clear();
            this.b.add(new b4l(4, t3l.a(aki.SPORTS_VOICE_RUN_STOP), true));
            this.d.sendEmptyMessage(15);
        }
    }

    public final long q() {
        int iA;
        if (this.a.getSportMode() == 1) {
            iA = t3l.a(aki.SPORTS_VOICE_WALK_ALREADY);
        } else {
            iA = this.a.getSportMode() == 3 ? t3l.a(aki.SPORTS_VOICE_RIDE_ALREADY) : t3l.a(aki.SPORTS_VOICE_RUN_ALREADY);
        }
        long jA = ((long) iA) + 500 + ((long) t3l.a(u(this.f10970e))) + ((long) t3l.a(aki.SPORTS_VOICE_KM)) + ((long) t3l.a(aki.SPORTS_VOICE_TIME_USE));
        int i = this.f;
        if (i != 0) {
            jA = jA + ((long) t3l.a(u(i))) + ((long) t3l.a(aki.SPORTS_VOICE_HOUR));
        }
        long jA2 = jA + ((long) t3l.a(u(this.g))) + ((long) t3l.a(aki.SPORTS_VOICE_MINUTE)) + ((long) t3l.a(u(this.h))) + ((long) t3l.a(aki.SPORTS_VOICE_SECOND));
        return (this.a.getSportMode() == 1 || this.i > 60) ? jA2 : jA2 + ((long) t3l.a(aki.SPORTS_VOICE_AVG_PACE)) + ((long) t3l.a(u(this.i))) + ((long) t3l.a(aki.SPORTS_VOICE_MINUTE)) + ((long) t3l.a(u(this.f10971j))) + ((long) t3l.a(aki.SPORTS_VOICE_SECOND));
    }

    public void r() {
        a7b.f("SportsSpeaker", "connect");
        if (this.a == null) {
            a7b.b("SportsSpeaker", "mMovingGoal == null");
        } else {
            this.b.add(new b4l(10, t3l.a(aki.SPORTS_VOICE_CONNECT)));
        }
    }

    public void s() {
        a7b.f("SportsSpeaker", "disconnect");
        if (this.a == null) {
            a7b.b("SportsSpeaker", "mMovingGoal == null");
        } else {
            this.b.add(new b4l(11, t3l.a(aki.SPORTS_VOICE_DISCONNECT), true));
        }
    }

    public void t(int i, int i2) {
        if (this.a.getSportMode() == 10) {
            return;
        }
        int i3 = i + 1;
        this.f10970e = i3;
        if (i3 <= 150 && i2 < 216000) {
            if (i2 >= 3600) {
                int i4 = i2 / 3600;
                this.f = i4;
                int i5 = i2 - (i4 * 3600);
                this.g = i5 / 60;
                this.h = i5 % 60;
            } else {
                this.f = 0;
                this.g = i2 / 60;
                this.h = i2 % 60;
            }
            int i6 = i2 / i3;
            this.i = i6 / 60;
            this.f10971j = i6 % 60;
            StringBuilder sb = new StringBuilder();
            sb.append("mKmCount: ");
            sb.append(this.f10970e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mDurationHour: ");
            sb2.append(this.f);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("mDurationMin: ");
            sb3.append(this.g);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("mDurationSec: ");
            sb4.append(this.h);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("mPaceMin: ");
            sb5.append(this.i);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("mPaceSec: ");
            sb6.append(this.f10971j);
            this.b.add(new b4l(9, q()));
        }
    }

    public final String u(int i) {
        return "sports_voice_" + i;
    }

    public void v(double d, int i) {
        if (this.a.getGoalType() == -1 || this.a.getSportMode() == 10) {
            return;
        }
        this.b.add(new b4l(8, t3l.a(aki.SPORTS_VOICE_GOAL_COMPLETE)));
    }

    public void w() {
        if (this.a.getGoalType() == -1 || this.a.getSportMode() == 10) {
            return;
        }
        this.b.add(new b4l(7, t3l.a(aki.SPORTS_VOICE_HALF_GOAL)));
    }

    public final void x(MovingGoal movingGoal) {
        this.m = new c4l();
        this.a = movingGoal;
        HandlerThread handlerThread = new HandlerThread(System.currentTimeMillis() + "");
        this.f10969c = handlerThread;
        handlerThread.start();
        this.d = new b(this.f10969c.getLooper());
        this.p = true;
        this.r = (AudioManager) b78.a().getSystemService("audio");
        this.d.sendEmptyMessage(15);
    }

    public void z() {
        a7b.f("SportsSpeaker", "pause");
        if (this.a == null) {
            a7b.b("SportsSpeaker", "mMovingGoal == null");
            return;
        }
        this.o = true;
        this.f10973n = true;
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.f10972l);
        }
        this.b.add(new b4l(2, t3l.a(aki.SPORTS_VOICE_RUN_PAUSE)));
    }
}
