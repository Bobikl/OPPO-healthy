package com.heytap.health.gdxui.stars;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.World;
import com.oplus.aiunit.vision.de7;
import com.oplus.aiunit.vision.e91;
import com.oplus.aiunit.vision.s46;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/gdxui/stars/b;", "Lcom/oplus/aiunit/vision/e91;", "Lcom/badlogic/gdx/physics/box2d/World;", "world", "", "b", "Lcom/badlogic/gdx/physics/box2d/Body;", "Lcom/badlogic/gdx/physics/box2d/Body;", "getBody", "()Lcom/badlogic/gdx/physics/box2d/Body;", "body", "Lcom/badlogic/gdx/physics/box2d/Fixture;", "c", "Lcom/badlogic/gdx/physics/box2d/Fixture;", "()Lcom/badlogic/gdx/physics/box2d/Fixture;", "fixture", "", "tag", "<init>", "(Ljava/lang/String;Lcom/badlogic/gdx/physics/box2d/Body;Lcom/badlogic/gdx/physics/box2d/Fixture;)V", "Companion", "a", "gdx_ui_release"}, k = 1, mv = {1, 8, 0})
public final class b extends e91 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG_GROUND = "ground";

    @NotNull
    public static final String TAG_SENSOR = "sensor";

    @NotNull
    public static final String TAG_WRAPPER = "wrapper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Body body;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Fixture fixture;

    /* JADX INFO: renamed from: com.heytap.health.gdxui.stars.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/gdxui/stars/b$a;", "", "Lcom/badlogic/gdx/physics/box2d/World;", "world", "Lcom/heytap/health/gdxui/stars/b;", "a", "c", "b", "", "TAG_GROUND", "Ljava/lang/String;", "TAG_SENSOR", "TAG_WRAPPER", "<init>", "()V", "gdx_ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a(@NotNull World world) {
            Intrinsics.checkNotNullParameter(world, "world");
            BodyDef bodyDef = new BodyDef();
            bodyDef.a = BodyDef.BodyType.StaticBody;
            bodyDef.b.set(2.33f, 2.33f);
            Body body = world.b(bodyDef);
            ChainShape chainShape = new ChainShape();
            chainShape.i(s46.b(2.33f, 30));
            Fixture fixture = body.a(chainShape, 0.0f);
            fixture.d(0.8f);
            fixture.e(0.5f);
            fixture.b().a = (short) 2;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            Intrinsics.checkNotNullExpressionValue(fixture, "fixture");
            b bVar = new b(b.TAG_GROUND, body, fixture, null);
            body.m(bVar);
            chainShape.dispose();
            return bVar;
        }

        @NotNull
        public final b b(@NotNull World world) {
            Intrinsics.checkNotNullParameter(world, "world");
            BodyDef bodyDef = new BodyDef();
            bodyDef.a = BodyDef.BodyType.StaticBody;
            bodyDef.b.set(2.33f, 2.33f);
            Body body = world.b(bodyDef);
            CircleShape circleShape = new CircleShape();
            circleShape.b(1.8529999f);
            Fixture fixture = body.a(circleShape, 0.0f);
            fixture.f(true);
            Intrinsics.checkNotNullExpressionValue(body, "body");
            Intrinsics.checkNotNullExpressionValue(fixture, "fixture");
            b bVar = new b(b.TAG_SENSOR, body, fixture, null);
            body.m(bVar);
            circleShape.dispose();
            return bVar;
        }

        @NotNull
        public final b c(@NotNull World world) {
            Intrinsics.checkNotNullParameter(world, "world");
            BodyDef bodyDef = new BodyDef();
            bodyDef.a = BodyDef.BodyType.StaticBody;
            bodyDef.b.set(2.33f, 4.66f);
            Body body = world.b(bodyDef);
            ChainShape chainShape = new ChainShape();
            chainShape.i(s46.a(2.33f, 4.66f));
            Fixture fixture = body.a(chainShape, 0.0f);
            de7 de7VarB = fixture.b();
            de7VarB.a = (short) 1;
            de7VarB.b = (short) 1;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            Intrinsics.checkNotNullExpressionValue(fixture, "fixture");
            b bVar = new b(b.TAG_WRAPPER, body, fixture, null);
            fixture.g(bVar);
            body.m(bVar);
            chainShape.dispose();
            return bVar;
        }
    }

    public /* synthetic */ b(String str, Body body, Fixture fixture, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, body, fixture);
    }

    public final void b(@NotNull World world) {
        Intrinsics.checkNotNullParameter(world, "world");
        world.i(this.body);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Fixture getFixture() {
        return this.fixture;
    }

    public b(String str, Body body, Fixture fixture) {
        super(str);
        this.body = body;
        this.fixture = fixture;
    }
}
