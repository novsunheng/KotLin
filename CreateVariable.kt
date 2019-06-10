var gloInt:Int = 0
var gloFlo:Float = 0.0f
var gloStr:String? = null

fun main(a: Array<String>)
{
    var c:Int = 0
    c=10
    println(c)

    val d:Int

    //var sum = d+1
    // println(d) // Need to be assigned before use

    var a = "Hello..."
    // a = 100  // Variables can be reassigned but Data type must be same
    a = "World"
    a = "Test"

    val b:Int

    b = 100
    // b = 200 // Can be assigned only once
    // b = 200  // Immutable - Un changeable
    getStr(gloStr)
}
fun getStr(str:String?)
{
    println("Welcome $str ${str?.length}")
}