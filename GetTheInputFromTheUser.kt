import java.util.Scanner
fun main(a: Array<String>)
{

    var s = Scanner(System.`in`)
    println("Enter name : ")
    var name :String = s.next()
    println("Enter Three number ")
    var num1 = s.nextInt()
    var num2 = s.nextInt()
    var num3 = s.nextInt()

    var res = if(num1>num2)
    {
        var max = if(num1>num3)
        {
            num1
        }
        else
        {
            num3
        }
        "Inside if block : Max : $max"
    }
    else
    {
        var max = if(num2>num3)
        {
            num2
        }
        else
        {
            num3
        }
        "Inside else block : Max : $max"
    }
    println(res)
}