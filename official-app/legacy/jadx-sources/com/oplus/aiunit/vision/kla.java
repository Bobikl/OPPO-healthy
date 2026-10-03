package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class kla extends JsonParser {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JsonParser f13339l;

    public kla(JsonParser jsonParser) {
        this.f13339l = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public int A() {
        return this.f13339l.A();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal B() throws IOException {
        return this.f13339l.B();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double C() throws IOException {
        return this.f13339l.C();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object D() throws IOException {
        return this.f13339l.D();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float E() throws IOException {
        return this.f13339l.E();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int F() throws IOException {
        return this.f13339l.F();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long G() throws IOException {
        return this.f13339l.G();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType H() throws IOException {
        return this.f13339l.H();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number I() throws IOException {
        return this.f13339l.I();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number J() throws IOException {
        return this.f13339l.J();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object K() throws IOException {
        return this.f13339l.K();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public zla L() {
        return this.f13339l.L();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public eia<StreamReadCapability> M() {
        return this.f13339l.M();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public short N() throws IOException {
        return this.f13339l.N();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String O() throws IOException {
        return this.f13339l.O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] P() throws IOException {
        return this.f13339l.P();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int Q() throws IOException {
        return this.f13339l.Q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int R() throws IOException {
        return this.f13339l.R();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation S() {
        return this.f13339l.S();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object T() throws IOException {
        return this.f13339l.T();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int U() throws IOException {
        return this.f13339l.U();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int V(int i) throws IOException {
        return this.f13339l.V(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long W() throws IOException {
        return this.f13339l.W();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long X(long j2) throws IOException {
        return this.f13339l.X(j2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String Y() throws IOException {
        return this.f13339l.Y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String Z(String str) throws IOException {
        return this.f13339l.Z(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a0() {
        return this.f13339l.a0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean b0() {
        return this.f13339l.b0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean c0(JsonToken jsonToken) {
        return this.f13339l.c0(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13339l.close();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean d0(int i) {
        return this.f13339l.d0(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean f0() {
        return this.f13339l.f0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean g0() {
        return this.f13339l.g0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean h() {
        return this.f13339l.h();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean h0() {
        return this.f13339l.h0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean i() {
        return this.f13339l.i();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean i0() throws IOException {
        return this.f13339l.i0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void l() {
        this.f13339l.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String m() throws IOException {
        return this.f13339l.m();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken m0() throws IOException {
        return this.f13339l.m0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken n() {
        return this.f13339l.n();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser n0(int i, int i2) {
        this.f13339l.n0(i, i2);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int o() {
        return this.f13339l.o();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser o0(int i, int i2) {
        this.f13339l.o0(i, i2);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser p(JsonParser.Feature feature) {
        this.f13339l.p(feature);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int p0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.f13339l.p0(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean q0() {
        return this.f13339l.q0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void r0(Object obj) {
        this.f13339l.r0(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger s() throws IOException {
        return this.f13339l.s();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser s0(int i) {
        this.f13339l.s0(i);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void t0(fx7 fx7Var) {
        this.f13339l.t0(fx7Var);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] u(Base64Variant base64Variant) throws IOException {
        return this.f13339l.u(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte v() throws IOException {
        return this.f13339l.v();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public yad w() {
        return this.f13339l.w();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation x() {
        return this.f13339l.x();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String y() throws IOException {
        return this.f13339l.y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken z() {
        return this.f13339l.z();
    }
}
