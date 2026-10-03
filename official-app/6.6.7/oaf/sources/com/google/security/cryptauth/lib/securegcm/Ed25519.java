package com.google.security.cryptauth.lib.securegcm;

import androidx.annotation.VisibleForTesting;
import java.math.BigInteger;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class Ed25519 {
    private static final int HEX_RADIX = 16;
    private static final BigInteger[] IDENTITY_POINT;
    private static final int POINT_SIZE_BITS = 256;
    private static final int T = 3;
    private static final int X = 0;
    private static final int Y = 1;
    private static final int Z = 2;
    private static final BigInteger Ed25519_P = new BigInteger("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFED", 16);
    private static final BigInteger Ed25519_D = new BigInteger("52036CEE2B6FFE738CC740797779E89800700A4D4141D8AB75EB4DCA135978A3", 16);
    private static final BigInteger Ed25519_K = new BigInteger("2406D9DC56DFFCE7198E80F2EEF3D13000E0149A8283B156EBD69B9426B2F159", 16);

    public static class Ed25519Exception extends Exception {
        public Ed25519Exception(String str) {
            super(str);
        }

        public Ed25519Exception(Exception exc) {
            super(exc);
        }

        public Ed25519Exception(String str, Exception exc) {
            super(str, exc);
        }
    }

    static {
        BigInteger bigInteger = BigInteger.ZERO;
        BigInteger bigInteger2 = BigInteger.ONE;
        IDENTITY_POINT = new BigInteger[]{bigInteger, bigInteger2, bigInteger2, bigInteger};
    }

    private Ed25519() {
    }

    public static BigInteger[] addAffinePoints(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) throws Ed25519Exception {
        return toAffine(addExtendedPoints(toExtended(bigIntegerArr), toExtended(bigIntegerArr2)));
    }

    public static BigInteger[] addExtendedPoints(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) throws Ed25519Exception {
        checkPointIsInExtendedRepresentation(bigIntegerArr);
        checkPointIsInExtendedRepresentation(bigIntegerArr2);
        BigInteger bigIntegerMultiply = bigIntegerArr[1].subtract(bigIntegerArr[0]).multiply(bigIntegerArr2[1].subtract(bigIntegerArr2[0]));
        BigInteger bigIntegerMultiply2 = bigIntegerArr[1].add(bigIntegerArr[0]).multiply(bigIntegerArr2[1].add(bigIntegerArr2[0]));
        BigInteger bigIntegerMultiply3 = bigIntegerArr[3].multiply(Ed25519_K).multiply(bigIntegerArr2[3]);
        BigInteger bigInteger = bigIntegerArr[2];
        BigInteger bigIntegerMultiply4 = bigInteger.add(bigInteger).multiply(bigIntegerArr2[2]);
        BigInteger bigIntegerSubtract = bigIntegerMultiply2.subtract(bigIntegerMultiply);
        BigInteger bigIntegerSubtract2 = bigIntegerMultiply4.subtract(bigIntegerMultiply3);
        BigInteger bigIntegerAdd = bigIntegerMultiply4.add(bigIntegerMultiply3);
        BigInteger bigIntegerAdd2 = bigIntegerMultiply2.add(bigIntegerMultiply);
        BigInteger bigIntegerMultiply5 = bigIntegerSubtract.multiply(bigIntegerSubtract2);
        BigInteger bigInteger2 = Ed25519_P;
        return new BigInteger[]{bigIntegerMultiply5.mod(bigInteger2), bigIntegerAdd.multiply(bigIntegerAdd2).mod(bigInteger2), bigIntegerSubtract2.multiply(bigIntegerAdd).mod(bigInteger2), bigIntegerSubtract.multiply(bigIntegerAdd2).mod(bigInteger2)};
    }

    @VisibleForTesting
    public static void checkPointIsInAffineRepresentation(BigInteger[] bigIntegerArr) throws Ed25519Exception {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new Ed25519Exception("Point is not in affine representation");
        }
    }

    @VisibleForTesting
    public static void checkPointIsInExtendedRepresentation(BigInteger[] bigIntegerArr) throws Ed25519Exception {
        if (bigIntegerArr == null || bigIntegerArr.length != 4 || bigIntegerArr[0] == null || bigIntegerArr[1] == null || bigIntegerArr[2] == null || bigIntegerArr[3] == null) {
            throw new Ed25519Exception("Point is not in extended representation");
        }
    }

    private static BigInteger[] doubleExtendedPoint(BigInteger[] bigIntegerArr) throws Ed25519Exception {
        checkPointIsInExtendedRepresentation(bigIntegerArr);
        BigInteger bigIntegerMultiply = bigIntegerArr[3].pow(2).multiply(Ed25519_K);
        BigInteger bigIntegerShiftLeft = bigIntegerArr[2].pow(2).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerArr[1].multiply(bigIntegerArr[0]).shiftLeft(2);
        BigInteger bigIntegerSubtract = bigIntegerShiftLeft.subtract(bigIntegerMultiply);
        BigInteger bigIntegerAdd = bigIntegerShiftLeft.add(bigIntegerMultiply);
        BigInteger bigIntegerShiftLeft3 = bigIntegerArr[1].pow(2).add(bigIntegerArr[0].pow(2)).shiftLeft(1);
        BigInteger bigIntegerMultiply2 = bigIntegerShiftLeft2.multiply(bigIntegerSubtract);
        BigInteger bigInteger = Ed25519_P;
        return new BigInteger[]{bigIntegerMultiply2.mod(bigInteger), bigIntegerAdd.multiply(bigIntegerShiftLeft3).mod(bigInteger), bigIntegerSubtract.multiply(bigIntegerAdd).mod(bigInteger), bigIntegerShiftLeft2.multiply(bigIntegerShiftLeft3).mod(bigInteger)};
    }

    public static BigInteger[] scalarMultiplyAffinePoint(BigInteger[] bigIntegerArr, BigInteger bigInteger) throws Ed25519Exception {
        return toAffine(scalarMultiplyExtendedPoint(toExtended(bigIntegerArr), bigInteger));
    }

    public static BigInteger[] scalarMultiplyExtendedPoint(BigInteger[] bigIntegerArr, BigInteger bigInteger) throws Ed25519Exception {
        checkPointIsInExtendedRepresentation(bigIntegerArr);
        if (bigInteger == null) {
            throw new Ed25519Exception("Can't multiply point by null");
        }
        if (bigInteger.bitLength() > 256) {
            throw new Ed25519Exception("Refuse to multiply point by scalar with more than 256 bits");
        }
        BigInteger[] bigIntegerArrAddExtendedPoints = IDENTITY_POINT;
        BigInteger[] bigIntegerArrAddExtendedPoints2 = bigIntegerArrAddExtendedPoints;
        for (int i = 0; i < 256; i++) {
            if (bigInteger.testBit(i)) {
                bigIntegerArrAddExtendedPoints = addExtendedPoints(bigIntegerArrAddExtendedPoints, bigIntegerArr);
            } else {
                bigIntegerArrAddExtendedPoints2 = addExtendedPoints(bigIntegerArrAddExtendedPoints, bigIntegerArr);
            }
            if (i < 255) {
                bigIntegerArr = doubleExtendedPoint(bigIntegerArr);
            }
        }
        return addExtendedPoints(bigIntegerArrAddExtendedPoints, subtractExtendedPoints(bigIntegerArrAddExtendedPoints2, bigIntegerArrAddExtendedPoints2));
    }

    public static BigInteger[] subtractAffinePoints(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) throws Ed25519Exception {
        return toAffine(subtractExtendedPoints(toExtended(bigIntegerArr), toExtended(bigIntegerArr2)));
    }

    public static BigInteger[] subtractExtendedPoints(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) throws Ed25519Exception {
        checkPointIsInExtendedRepresentation(bigIntegerArr);
        checkPointIsInExtendedRepresentation(bigIntegerArr2);
        return addExtendedPoints(bigIntegerArr, new BigInteger[]{bigIntegerArr2[0].negate(), bigIntegerArr2[1], bigIntegerArr2[2], bigIntegerArr2[3].negate()});
    }

    @VisibleForTesting
    public static BigInteger[] toAffine(BigInteger[] bigIntegerArr) throws Ed25519Exception {
        checkPointIsInExtendedRepresentation(bigIntegerArr);
        BigInteger bigInteger = bigIntegerArr[0];
        BigInteger bigInteger2 = bigIntegerArr[2];
        BigInteger bigInteger3 = Ed25519_P;
        return new BigInteger[]{bigInteger.multiply(bigInteger2.modInverse(bigInteger3)).mod(bigInteger3), bigIntegerArr[1].multiply(bigIntegerArr[2].modInverse(bigInteger3)).mod(bigInteger3)};
    }

    @VisibleForTesting
    public static BigInteger[] toExtended(BigInteger[] bigIntegerArr) throws Ed25519Exception {
        checkPointIsInAffineRepresentation(bigIntegerArr);
        return new BigInteger[]{bigIntegerArr[0], bigIntegerArr[1], BigInteger.ONE, bigIntegerArr[0].multiply(bigIntegerArr[1]).mod(Ed25519_P)};
    }

    public static void validateAffinePoint(BigInteger[] bigIntegerArr) throws Ed25519Exception {
        checkPointIsInAffineRepresentation(bigIntegerArr);
        BigInteger bigInteger = bigIntegerArr[0];
        BigInteger bigInteger2 = bigIntegerArr[1];
        if (bigInteger.signum() != 1 || bigInteger2.signum() != 1) {
            throw new Ed25519Exception("Point encoding must use only positive integers");
        }
        BigInteger bigInteger3 = Ed25519_P;
        if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            throw new Ed25519Exception("Point lies outside of the expected field");
        }
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        BigInteger bigIntegerMultiply2 = bigInteger2.multiply(bigInteger2);
        if (!bigIntegerMultiply.negate().add(bigIntegerMultiply2).mod(bigInteger3).equals(BigInteger.ONE.add(Ed25519_D.multiply(bigIntegerMultiply).multiply(bigIntegerMultiply2)).mod(bigInteger3))) {
            throw new Ed25519Exception("Point does not lie on the expected curve");
        }
    }
}
