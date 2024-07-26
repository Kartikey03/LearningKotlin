fun main() {
    val i=1
    if (i==1){
        println("hello")
    }

    var a: String ="hello world"
    if (a == "hello worl"){
        a="hi"
    }
    println(a)
    println("I have learnt the kotlin language in $i hour")

    var kt: String? = null
//    val dtype = kt::class.simpleName
//    println("the value of kt is $kt")
//    println("the datatype of kt is $dtype")
    kt="hemloooo"


    when (kt){
        null-> kt = "kartikey"
        else-> println(kt)
    }
    println(kt)
}
