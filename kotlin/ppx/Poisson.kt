// automatically generated by the FlatBuffers compiler, do not modify

package ppx

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class Poisson : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Poisson {
        __init(_i, _bb)
        return this
    }
    val rate : ppx.Tensor? get() = rate(ppx.Tensor())
    fun rate(obj: ppx.Tensor) : ppx.Tensor? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_2_0_0()
        fun getRootAsPoisson(_bb: ByteBuffer): Poisson = getRootAsPoisson(_bb, Poisson())
        fun getRootAsPoisson(_bb: ByteBuffer, obj: Poisson): Poisson {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createPoisson(builder: FlatBufferBuilder, rateOffset: Int) : Int {
            builder.startTable(1)
            addRate(builder, rateOffset)
            return endPoisson(builder)
        }
        fun startPoisson(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addRate(builder: FlatBufferBuilder, rate: Int) = builder.addOffset(0, rate, 0)
        fun endPoisson(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
