// automatically generated by the FlatBuffers compiler, do not modify

package ppx

@Suppress("unused")
@ExperimentalUnsignedTypes
class Distribution private constructor() {
    companion object {
        const val NONE: UByte = 0u
        const val Normal: UByte = 1u
        const val Uniform: UByte = 2u
        const val Categorical: UByte = 3u
        const val Poisson: UByte = 4u
        val names : Array<String> = arrayOf("NONE", "Normal", "Uniform", "Categorical", "Poisson")
        fun name(e: Int) : String = names[e]
    }
}
