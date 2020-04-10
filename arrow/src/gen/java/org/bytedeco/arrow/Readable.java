// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Readable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Readable(Pointer p) { super(p); }


  /** \brief Read data from current file position.
   * 
   *  Read at most {@code nbytes} from the current file position into {@code out}.
   *  The number of bytes read is returned. */
  
  ///
  ///
  public native @ByVal LongResult Read(@Cast("int64_t") long nbytes, Pointer out);

  /** \brief Read data from current file position.
   * 
   *  Read at most {@code nbytes} from the current file position. Less bytes may
   *  be read if EOF is reached. This method updates the current file position.
   * 
   *  In some cases (e.g. a memory-mapped file), this method may avoid a
   *  memory copy. */
  public native @ByVal BufferResult Read(@Cast("int64_t") long nbytes);

  // Deprecated APIs

  public native @Deprecated @ByVal Status Read(@Cast("int64_t") long nbytes, @Cast("int64_t*") LongPointer bytes_read, Pointer out);
  public native @Deprecated @ByVal Status Read(@Cast("int64_t") long nbytes, @Cast("int64_t*") LongBuffer bytes_read, Pointer out);
  public native @Deprecated @ByVal Status Read(@Cast("int64_t") long nbytes, @Cast("int64_t*") long[] bytes_read, Pointer out);

  public native @Deprecated @ByVal Status Read(@Cast("int64_t") long nbytes, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);
}
