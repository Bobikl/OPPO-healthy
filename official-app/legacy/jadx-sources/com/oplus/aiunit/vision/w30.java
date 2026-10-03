package com.oplus.aiunit.vision;

import android.os.SystemClock;
import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0002\r\u0015B\u000f\u0012\u0006\u0010#\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J&\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/w30;", "", "Lcom/oplus/aiunit/vision/eq9;", "fileContainer", "", "enableVersion1", "", "defaultVideoMode", "defaultFps", MapSchema.FIELD_NAME_ENTRY, "_videoWidth", "_videoHeight", "", "a", "c", "", "boxHead", "Lcom/oplus/aiunit/vision/w30$a;", "d", "Lcom/oplus/aiunit/vision/v30;", "Lcom/oplus/aiunit/vision/v30;", "b", "()Lcom/oplus/aiunit/vision/v30;", "setConfig", "(Lcom/oplus/aiunit/vision/v30;)V", "config", "Z", "isParsingConfig", "()Z", "setParsingConfig", "(Z)V", "Lcom/oplus/aiunit/vision/a40;", "Lcom/oplus/aiunit/vision/a40;", "getPlayer", "()Lcom/oplus/aiunit/vision/a40;", "player", "<init>", "(Lcom/oplus/aiunit/vision/a40;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class w30 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AnimConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isParsingConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a40 player;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/w30$a;", "", "", "a", "J", "getStartIndex", "()J", "d", "(J)V", "startIndex", "", "b", "I", "()I", "c", "(I)V", "length", "", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "type", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public long startIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final void c(int i) {
            this.length = i;
        }

        public final void d(long j2) {
            this.startIndex = j2;
        }

        public final void e(@Nullable String str) {
            this.type = str;
        }
    }

    public w30(@NotNull a40 player) {
        Intrinsics.checkParameterIsNotNull(player, "player");
        this.player = player;
    }

    public final void a(int _videoWidth, int _videoHeight) {
        AnimConfig animConfig;
        AnimConfig animConfig2 = this.config;
        if ((animConfig2 == null || animConfig2.getIsDefaultConfig()) && (animConfig = this.config) != null) {
            animConfig.u(_videoWidth);
            animConfig.t(_videoHeight);
            int defaultVideoMode = animConfig.getDefaultVideoMode();
            if (defaultVideoMode == 1) {
                animConfig.v(_videoWidth / 2);
                animConfig.q(_videoHeight);
                animConfig.m(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.s(new PointRect(animConfig.getWidth(), 0, animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            if (defaultVideoMode == 2) {
                animConfig.v(_videoWidth);
                animConfig.q(_videoHeight / 2);
                animConfig.m(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.s(new PointRect(0, animConfig.getHeight(), animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            if (defaultVideoMode == 3) {
                animConfig.v(_videoWidth / 2);
                animConfig.q(_videoHeight);
                animConfig.s(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.m(new PointRect(animConfig.getWidth(), 0, animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            if (defaultVideoMode != 4) {
                animConfig.v(_videoWidth / 2);
                animConfig.q(_videoHeight);
                animConfig.m(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.s(new PointRect(animConfig.getWidth(), 0, animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            animConfig.v(_videoWidth);
            animConfig.q(_videoHeight / 2);
            animConfig.s(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
            animConfig.m(new PointRect(0, animConfig.getHeight(), animConfig.getWidth(), animConfig.getHeight()));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnimConfig getConfig() {
        return this.config;
    }

    public final boolean c(eq9 fileContainer, int defaultVideoMode, int defaultFps) {
        a aVarD;
        AnimConfig animConfig = new AnimConfig();
        this.config = animConfig;
        fileContainer.a();
        byte[] bArr = new byte[8];
        long length = 0;
        while (true) {
            if (fileContainer.read(bArr, 0, 8) != 8 || (aVarD = d(bArr)) == null) {
                aVarD = null;
                break;
            }
            if (Intrinsics.areEqual("vapc", aVarD.getType())) {
                aVarD.d(length);
                break;
            }
            length += (long) aVarD.getLength();
            fileContainer.skip(((long) aVarD.getLength()) - 8);
        }
        if (aVarD == null) {
            q0.INSTANCE.b("AnimPlayer.AnimConfigManager", "vapc box head not found");
            animConfig.n(true);
            animConfig.o(defaultVideoMode);
            animConfig.p(defaultFps);
            this.player.x(animConfig.getFps());
            return true;
        }
        int length2 = aVarD.getLength() - 8;
        byte[] bArr2 = new byte[length2];
        fileContainer.read(bArr2, 0, length2);
        fileContainer.b();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(\"UTF-8\")");
        JSONObject jSONObject = new JSONObject(new String(bArr2, 0, length2, charsetForName));
        animConfig.r(jSONObject);
        boolean zL = animConfig.l(jSONObject);
        if (defaultFps > 0) {
            animConfig.p(defaultFps);
        }
        this.player.x(animConfig.getFps());
        return zL;
    }

    public final a d(byte[] boxHead) {
        if (boxHead.length != 8) {
            return null;
        }
        a aVar = new a();
        aVar.c(((boxHead[2] & 255) << 8) | 0 | ((boxHead[0] & 255) << 24) | ((boxHead[1] & 255) << 16) | (boxHead[3] & 255));
        Charset charsetForName = Charset.forName(CharEncoding.US_ASCII);
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(\"US-ASCII\")");
        aVar.e(new String(boxHead, 4, 4, charsetForName));
        return aVar;
    }

    public final int e(@NotNull eq9 fileContainer, boolean enableVersion1, int defaultVideoMode, int defaultFps) {
        Intrinsics.checkParameterIsNotNull(fileContainer, "fileContainer");
        try {
            this.isParsingConfig = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean zC = c(fileContainer, defaultVideoMode, defaultFps);
            q0.INSTANCE.d("AnimPlayer.AnimConfigManager", "parseConfig cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms enableVersion1=" + enableVersion1 + " result=" + zC);
            if (!zC) {
                this.isParsingConfig = false;
                return 10005;
            }
            AnimConfig animConfig = this.config;
            if (animConfig != null && animConfig.getIsDefaultConfig() && !enableVersion1) {
                this.isParsingConfig = false;
                return 10005;
            }
            AnimConfig animConfig2 = this.config;
            int iB = animConfig2 != null ? this.player.getPluginManager().b(animConfig2) : 0;
            this.isParsingConfig = false;
            return iB;
        } catch (Throwable th) {
            q0.INSTANCE.c("AnimPlayer.AnimConfigManager", "parseConfig error " + th, th);
            this.isParsingConfig = false;
            return 10005;
        }
    }
}
