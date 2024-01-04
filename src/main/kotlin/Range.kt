fun main(args: Array<String>) {
    val mark = 94
    val result = if (mark in 40 .. 49){
        "C-"
    }else if (mark in 50 ..59){
        "C+"
    }else if (mark in 60..  69){
        "B-"
    }else if (mark in 70..78){
        "B+"
    }else if (mark in 80..89){
        "A-"
    }else if (mark in 90..100){
        "A+"
    }else{
        "F"
    }
    println(result)
}