// automatically generated by the FlatBuffers compiler, do not modify

package ppx

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class Uniform : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Uniform {
        __init(_i, _bb)
        return this
    }
    val low : ppx.Tensor? get() = low(ppx.Tensor())
    fun low(obj: ppx.Tensor) : ppx.Tensor? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val high : ppx.Tensor? get() = high(ppx.Tensor())
    fun high(obj: ppx.Tensor) : ppx.Tensor? {
        val o = __offset(6)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_2_0_0()
        fun getRootAsUniform(_bb: ByteBuffer): Uniform = getRootAsUniform(_bb, Uniform())
        fun getRootAsUniform(_bb: ByteBuffer, obj: Uniform): Uniform {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createUniform(builder: FlatBufferBuilder, lowOffset: Int, highOffset: Int) : Int {
            builder.startTable(2)
            addHigh(builder, highOffset)
            addLow(builder, lowOffset)
            return endUniform(builder)
        }
        fun startUniform(builder: FlatBufferBuilder) = builder.startTable(2)
        fun addLow(builder: FlatBufferBuilder, low: Int) = builder.addOffset(0, low, 0)
        fun addHigh(builder: FlatBufferBuilder, high: Int) = builder.addOffset(1, high, 0)
        fun endUniform(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
