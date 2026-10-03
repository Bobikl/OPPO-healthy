package com.badlogic.gdx.physics.box2d;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.badlogic.gdx.physics.box2d.JointDef$JointType, still in use, count: 1, list:
  (r0v0 com.badlogic.gdx.physics.box2d.JointDef$JointType) from 0x0082: FILLED_NEW_ARRAY 
  (r0v0 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r1v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r2v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r3v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r4v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r5v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r6v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r7v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r8v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r9v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r10v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r11v2 com.badlogic.gdx.physics.box2d.JointDef$JointType)
 A[WRAPPED] elemType: com.badlogic.gdx.physics.box2d.JointDef$JointType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes13.dex */
public final class JointDef$JointType {
    Unknown(0),
    RevoluteJoint(1),
    PrismaticJoint(2),
    DistanceJoint(3),
    PulleyJoint(4),
    MouseJoint(5),
    GearJoint(6),
    WheelJoint(7),
    WeldJoint(8),
    FrictionJoint(9),
    RopeJoint(10),
    MotorJoint(11);

    public static JointDef$JointType[] valueTypes = {new JointDef$JointType(0), new JointDef$JointType(1), new JointDef$JointType(2), new JointDef$JointType(3), new JointDef$JointType(4), new JointDef$JointType(5), new JointDef$JointType(6), new JointDef$JointType(7), new JointDef$JointType(8), new JointDef$JointType(9), new JointDef$JointType(10), new JointDef$JointType(11)};
    private int value;

    static {
    }

    private JointDef$JointType(int i) {
        super(str, i);
        this.value = i;
    }

    public static JointDef$JointType valueOf(String str) {
        return (JointDef$JointType) Enum.valueOf(JointDef$JointType.class, str);
    }

    public static JointDef$JointType[] values() {
        return (JointDef$JointType[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}
