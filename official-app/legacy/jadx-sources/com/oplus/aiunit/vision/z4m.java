package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class z4m {
    public boolean a;
    public o1 b;
    public static final n1 subjectDirectoryAttributes = new n1("2.5.29.9");
    public static final n1 subjectKeyIdentifier = new n1("2.5.29.14");
    public static final n1 keyUsage = new n1("2.5.29.15");
    public static final n1 privateKeyUsagePeriod = new n1("2.5.29.16");
    public static final n1 subjectAlternativeName = new n1("2.5.29.17");
    public static final n1 issuerAlternativeName = new n1("2.5.29.18");
    public static final n1 basicConstraints = new n1("2.5.29.19");
    public static final n1 cRLNumber = new n1("2.5.29.20");
    public static final n1 reasonCode = new n1("2.5.29.21");
    public static final n1 instructionCode = new n1("2.5.29.23");
    public static final n1 invalidityDate = new n1("2.5.29.24");
    public static final n1 deltaCRLIndicator = new n1("2.5.29.27");
    public static final n1 issuingDistributionPoint = new n1("2.5.29.28");
    public static final n1 certificateIssuer = new n1("2.5.29.29");
    public static final n1 nameConstraints = new n1("2.5.29.30");
    public static final n1 cRLDistributionPoints = new n1("2.5.29.31");
    public static final n1 certificatePolicies = new n1("2.5.29.32");
    public static final n1 policyMappings = new n1("2.5.29.33");
    public static final n1 authorityKeyIdentifier = new n1("2.5.29.35");
    public static final n1 policyConstraints = new n1("2.5.29.36");
    public static final n1 extendedKeyUsage = new n1("2.5.29.37");
    public static final n1 freshestCRL = new n1("2.5.29.46");
    public static final n1 inhibitAnyPolicy = new n1("2.5.29.54");
    public static final n1 authorityInfoAccess = new n1("1.3.6.1.5.5.7.1.1");
    public static final n1 subjectInfoAccess = new n1("1.3.6.1.5.5.7.1.11");
    public static final n1 logoType = new n1("1.3.6.1.5.5.7.1.12");
    public static final n1 biometricInfo = new n1("1.3.6.1.5.5.7.1.2");
    public static final n1 qCStatements = new n1("1.3.6.1.5.5.7.1.3");
    public static final n1 auditIdentity = new n1("1.3.6.1.5.5.7.1.4");
    public static final n1 noRevAvail = new n1("2.5.29.56");
    public static final n1 targetInformation = new n1("2.5.29.55");

    public static r1 a(z4m z4mVar) throws IllegalArgumentException {
        try {
            return r1.i(z4mVar.b().o());
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: " + e2);
        }
    }

    public o1 b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z4m)) {
            return false;
        }
        z4m z4mVar = (z4m) obj;
        return z4mVar.b().equals(b()) && z4mVar.c() == c();
    }

    public int hashCode() {
        return c() ? b().hashCode() : ~b().hashCode();
    }
}
