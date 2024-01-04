fun main(args: Array<String>) {
    val mark = 94
    val result = if (mark >= 40 && mark <= 49){
        "C-"
    }else if (mark >=50 && mark <= 59){
        "C+"
    }else if (mark >=60 && mark<= 69){
        "B-"
    }else if (mark >=70 && mark<79){
        "B+"
    }else if (mark >= 80 && mark <= 89){
        "A-"
    }else if (mark>=90 && mark<=100){
        "A+"
    }else{
        "F"
    }
    println(result)
}