// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief SourceFactory provides a way to inspect/discover a Source's expected
 *  schema before materializing said Source. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class SourceFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SourceFactory(Pointer p) { super(p); }

  /** \brief Get the schemas of the Fragments and Partitioning. */
  public native @ByVal SchemaVectorResult InspectSchemas();

  /** \brief Get unified schema for the resulting Source. */
  public native @ByVal SchemaResult Inspect();

  /** \brief Create a Source with the given schema. */
  public native @ByVal SourceResult Finish(
        @Const @SharedPtr @ByRef Schema schema);

  /** \brief Create a Source using the inspected schema. */
  public native @ByVal SourceResult Finish();

  /** \brief Optional root partition for the resulting Source. */
  public native @Const @SharedPtr @ByRef Expression root_partition();
  public native @ByVal Status SetRootPartition(@SharedPtr @ByVal Expression partition);
}
