// automatically generated by the FlatBuffers compiler, do not modify

package ppx

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class Run : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Run {
        __init(_i, _bb)
        return this
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsRun(_bb: ByteBuffer): Run = getRootAsRun(_bb, Run())
        fun getRootAsRun(_bb: ByteBuffer, obj: Run): Run {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun startRun(builder: FlatBufferBuilder) = builder.startTable(0)
        fun endRun(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
