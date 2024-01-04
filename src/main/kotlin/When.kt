fun main(args: Array<String>) {
    val mark = 56
    val result = when(mark){
        in 40..49-> "C-"
        in 50..59-> "C+"
        in 60 ..69-> "B-"
        in 70 ..79 ->"B+"
        in 80 ..89->"A-"
        in 90..100->"A+"
        else -> "F"
    }
    println(result)
}