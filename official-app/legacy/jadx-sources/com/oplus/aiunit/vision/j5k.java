package com.oplus.aiunit.vision;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.operations.settings.UserExpSettingService;
import com.oplus.drs.track.TrackApi;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class j5k implements com.heytap.health.base.track.a.InterfaceC0296a {
    public static final String TAG = "TrackApi";
    public TrackApi i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f12762j = Boolean.valueOf(!qe0.w());
    public final Executor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12763l;
    public final fs9 m;

    public class a implements fs9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.fs9
        public boolean d(@NonNull String str, @NonNull String str2, @Nullable Throwable th, @NonNull Object... objArr) {
            return j5k.this.f12762j.booleanValue();
        }

        @Override // com.oplus.aiunit.vision.fs9
        public boolean e(@NonNull String str, @NonNull String str2, @Nullable Throwable th, @NonNull Object... objArr) {
            return j5k.this.f12762j.booleanValue();
        }

        @Override // com.oplus.aiunit.vision.fs9
        public boolean i(@NonNull String str, @NonNull String str2, @Nullable Throwable th, @NonNull Object... objArr) {
            return j5k.this.f12762j.booleanValue();
        }

        @Override // com.oplus.aiunit.vision.fs9
        public boolean v(@NonNull String str, @NonNull String str2, @Nullable Throwable th, @NonNull Object... objArr) {
            return j5k.this.f12762j.booleanValue();
        }

        @Override // com.oplus.aiunit.vision.fs9
        public boolean w(@NonNull String str, @NonNull String str2, @Nullable Throwable th, @NonNull Object... objArr) {
            return j5k.this.f12762j.booleanValue();
        }
    }

    public j5k() {
        ExecutorService executorServiceE = zq8.e("Track");
        this.k = executorServiceE;
        this.f12763l = null;
        this.m = new a();
        executorServiceE.execute(new Runnable() { // from class: com.oplus.aiunit.vision.g5k
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str) {
        a7b.f("TrackApi", "Set custom client id called");
        e();
        TrackApi trackApi = this.i;
        if (trackApi != null) {
            trackApi.setCustomClientId(str);
        } else {
            this.f12763l = str;
        }
    }

    public final void e() {
        if (this.i != null) {
            return;
        }
        if (f()) {
            TrackApi.enableNetRequest(false);
            return;
        }
        a7b.f("TrackApi", "Start init track api");
        vb0.c(20187L);
        TrackApi.enableNetRequest(true);
        TrackApi.staticInit((Application) b78.a(), new TrackApi.StaticConfig.Builder("CN").enableLog(qe0.w() && !qe0.t()).setLogHook(this.m).enableTrackInCurrentProcess(false).build());
        TrackApi.Config configBuild = new TrackApi.Config.Builder(z7b.key, z7b.secret).build();
        TrackApi trackApi = TrackApi.getInstance(20187L);
        this.i = trackApi;
        trackApi.init(configBuild);
        this.i.setUserId(v9g.w().E("user_ssoid", ""));
        if (!TextUtils.isEmpty(this.f12763l)) {
            this.i.setCustomClientId(this.f12763l);
            this.f12763l = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TrackApiImpl >> init > ");
        sb.append(this.i.getUserId());
    }

    public final boolean f() {
        return !((UserExpSettingService) x0.d().h(UserExpSettingService.class)).B2();
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void h(String str, String str2, Map map) {
        if (f()) {
            a7b.f("TrackApi", "Track is disabled, return");
            return;
        }
        e();
        TrackApi trackApi = this.i;
        if (trackApi == null) {
            a7b.f("TrackApi", "Track api is null, drop event");
            return;
        }
        String userId = trackApi.getUserId();
        String strE = v9g.w().E("user_ssoid", "");
        if (TextUtils.isEmpty(userId)) {
            if (!TextUtils.isEmpty(strE)) {
                this.i.setUserId(strE);
                StringBuilder sb = new StringBuilder();
                sb.append("TrackApiImpl >> track > ");
                sb.append(this.i.getUserId());
            }
        } else if (!userId.equals(strE)) {
            this.i.setUserId(strE);
        }
        this.i.track(str, str2, (Map<String, ? extends Object>) map);
    }

    public void j() {
        TrackApi trackApi = this.i;
        if (trackApi != null) {
            trackApi.flush();
        }
    }

    @Override // com.heytap.health.base.track.a.InterfaceC0296a
    public void setCustomClientId(final String str) {
        this.k.execute(new Runnable() { // from class: com.oplus.aiunit.vision.i5k
            @Override // java.lang.Runnable
            public final void run() {
                this.i.g(str);
            }
        });
    }

    @Override // com.heytap.health.base.track.a.InterfaceC0296a
    public void track(final String str, final String str2, final Map map) {
        this.k.execute(new Runnable() { // from class: com.oplus.aiunit.vision.h5k
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h(str, str2, map);
            }
        });
    }
}
