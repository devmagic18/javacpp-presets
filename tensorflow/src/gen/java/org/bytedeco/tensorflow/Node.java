// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // Defined in .cc

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Node extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Node(Pointer p) { super(p); }

  public native @StdString BytePointer DebugString();
  public native int id();
  public native int cost_id();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer name);
  public native void set_name(@StdString String name);
  public native @StdString BytePointer type_string();

  // def() provides the NodeDef the user supplied, but the specifics
  // of this Node may have changed due to placement, optimization, etc.
  // In particular:
  // * def().name() will match name();
  // * def().op() will match type_string() and op_def().name();
  // * def().input() is not reliable, use "in_edges()" below instead;
  // * def().device() is the "user's requested device" and may not match
  //   the actual assigned device, see assigned_device_name() below;
  // * def().attr() is authoritative.
  // TODO(irving): Replace with NodeInfo.
  public native @Const @ByRef NodeDef def();
  public native @Const @ByRef OpDef op_def();

  // input and output types
  public native int num_inputs();
  public native @Cast("tensorflow::DataType") int input_type(int i);
  public native @Const @ByRef DataTypeVector input_types();

  public native int num_outputs();
  public native @Cast("tensorflow::DataType") int output_type(int o);
  public native @Const @ByRef DataTypeVector output_types();

  // The device requested by the user.  For the actual assigned device,
  // use assigned_device_name() below.
  public native @StdString BytePointer requested_device();

  // This changes the user requested device but not necessarily the device that
  // on which the operation will run.
  public native void set_requested_device(@StdString BytePointer device);
  public native void set_requested_device(@StdString String device);

  // This gives the device the runtime has assigned this node to.  If
  // you want the device the user requested, use def().device() instead.
  // TODO(josh11b): Validate that the assigned_device, if not empty:
  // fully specifies a device, and satisfies def().device().
  // TODO(josh11b): Move assigned_device_name outside of Node into a
  // NodeId->DeviceName map.
  public native @StdString BytePointer assigned_device_name();
  public native void set_assigned_device_name(@StdString BytePointer device_name);
  public native void set_assigned_device_name(@StdString String device_name);
  public native @Cast("bool") boolean has_assigned_device_name();
  public native int assigned_device_name_index();
  public native void set_assigned_device_name_index(int index);

  // Sets 'original_node_names' field of this node's DebugInfo proto to
  // 'names'.
  public native void set_original_node_names(@Const @ByRef StringVector names);

  // Read only access to attributes
  public native @ByVal AttrSlice attrs();

  // Inputs requested by the NodeDef.  For the actual inputs, use in_edges.

  // Get the neighboring nodes via edges either in or out of this node.  This
  // includes control edges.
  public native @ByVal NeighborIterRange in_nodes();
  public native @ByVal NeighborIterRange out_nodes();
  public native @Const @ByRef EdgeSet in_edges();
  public native @Const @ByRef EdgeSet out_edges();

  // Node type helpers.
  public native @Cast("bool") boolean IsSource();
  public native @Cast("bool") boolean IsSink();
  // Anything other than the special Source & Sink nodes.
  public native @Cast("bool") boolean IsOp();

  // Node class helpers
  public native @Cast("bool") boolean IsSwitch();
  public native @Cast("bool") boolean IsMerge();
  public native @Cast("bool") boolean IsEnter();
  public native @Cast("bool") boolean IsExit();
  public native @Cast("bool") boolean IsNextIteration();
  public native @Cast("bool") boolean IsLoopCond();
  public native @Cast("bool") boolean IsControlTrigger();
  public native @Cast("bool") boolean IsSend();
  public native @Cast("bool") boolean IsRecv();
  public native @Cast("bool") boolean IsConstant();
  public native @Cast("bool") boolean IsVariable();
  public native @Cast("bool") boolean IsIdentity();
  public native @Cast("bool") boolean IsGetSessionHandle();
  public native @Cast("bool") boolean IsGetSessionTensor();
  public native @Cast("bool") boolean IsDeleteSessionTensor();
  public native @Cast("bool") boolean IsControlFlow();
  public native @Cast("bool") boolean IsHostSend();
  public native @Cast("bool") boolean IsHostRecv();
  public native @Cast("bool") boolean IsScopedAllocator();
  public native @Cast("bool") boolean IsCollective();

  public native @Cast("bool") boolean IsMetadata();
  public native @Cast("bool") boolean IsFakeParam();

  public native void ClearAttr(@StdString BytePointer name);
  public native void ClearAttr(@StdString String name);

  // Returns into '*e' the edge connecting to the 'idx' input of this Node.
  public native @ByVal Status input_edge(int idx, @Cast("const tensorflow::Edge**") PointerPointer e);
  public native @ByVal Status input_edge(int idx, @Const @ByPtrPtr Edge e);

  // Returns into '*edges' the input data edges of this Node, indexed by input
  // number. Does not return control edges.
  public native @ByVal Status input_edges(@Cast("std::vector<const tensorflow::Edge*>*") EdgeVector edges);

  // Returns into '*n' the node that has an output connected to the
  // 'idx' input of this Node.
  public native @ByVal Status input_node(int idx, @Cast("const tensorflow::Node**") PointerPointer n);
  public native @ByVal Status input_node(int idx, @Const @ByPtrPtr Node n);

  // Returns into '*t' the idx-th input tensor of this node, represented as the
  // output tensor of input_node(idx).
  public native @ByVal Status input_tensor(int idx, OutputTensor t);

  public native WhileContext while_ctx();
  public native void set_while_ctx(WhileContext while_ctx);
}