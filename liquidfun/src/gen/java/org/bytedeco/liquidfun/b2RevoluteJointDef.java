// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Revolute joint definition. This requires defining an
 *  anchor point where the bodies are joined. The definition
 *  uses local anchor points so that the initial configuration
 *  can violate the constraint slightly. You also need to
 *  specify the initial relative angle for joint limits. This
 *  helps when saving and loading a game.
 *  The local anchor points are measured from the body's origin
 *  rather than the center of mass because:
 *  1. you might not know where the center of mass will be.
 *  2. if you add/remove shapes from a body and recompute the mass,
 *     the joints will be broken. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2RevoluteJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2RevoluteJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2RevoluteJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2RevoluteJointDef position(long position) {
        return (b2RevoluteJointDef)super.position(position);
    }

	public b2RevoluteJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize the bodies, anchors, and reference angle using a world
	 *  anchor point. */
	public native void Initialize(b2Body bodyA, b2Body bodyB, @Const @ByRef b2Vec2 anchor);

	/** The local anchor point relative to bodyA's origin. */
	public native @ByRef b2Vec2 localAnchorA(); public native b2RevoluteJointDef localAnchorA(b2Vec2 setter);

	/** The local anchor point relative to bodyB's origin. */
	public native @ByRef b2Vec2 localAnchorB(); public native b2RevoluteJointDef localAnchorB(b2Vec2 setter);

	/** The bodyB angle minus bodyA angle in the reference state (radians). */
	public native @Cast("float32") float referenceAngle(); public native b2RevoluteJointDef referenceAngle(float setter);

	/** A flag to enable joint limits. */
	public native @Cast("bool") boolean enableLimit(); public native b2RevoluteJointDef enableLimit(boolean setter);

	/** The lower angle for the joint limit (radians). */
	public native @Cast("float32") float lowerAngle(); public native b2RevoluteJointDef lowerAngle(float setter);

	/** The upper angle for the joint limit (radians). */
	public native @Cast("float32") float upperAngle(); public native b2RevoluteJointDef upperAngle(float setter);

	/** A flag to enable the joint motor. */
	public native @Cast("bool") boolean enableMotor(); public native b2RevoluteJointDef enableMotor(boolean setter);

	/** The desired motor speed. Usually in radians per second. */
	public native @Cast("float32") float motorSpeed(); public native b2RevoluteJointDef motorSpeed(float setter);

	/** The maximum motor torque used to achieve the desired motor speed.
	 *  Usually in N-m. */
	public native @Cast("float32") float maxMotorTorque(); public native b2RevoluteJointDef maxMotorTorque(float setter);
}
