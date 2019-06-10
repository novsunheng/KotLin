import java.util.*

fun main(a:Array<String>)
{
    /*
    var num:Int = 0
    println("Enter a day of the month (1 to 31)")
    var s = Scanner(System.`in`)

    num = s.nextInt()
    when(num)
    {
        in 1..8  -> println("Start of the month")
        in 9..24 -> println("Middle of the month")
        in 25..31 -> println("End of the month")

        else -> println("Invalid number...")
    }

    var name: String = ""

    println("ENter name : ")
    name = s.next()
    when(name)
    {
        "Asuka","Yuriko","Junosuke" -> {
            println("You are from Japan")
            println("Welcome to Cambodia")
            println("You have visa for an year")
        }
        "Vignesh","Dinesh","Leo" ->{
            println("You are an Indian")
            println("But u are too young to study")
        }
        "Vira","Vireak","Puthireak" ->{
            println("You are Cambodian")
            println("But too old to study")
        }
    }
*/
    var  arr: Array<Int> = arrayOf(30,50, 60, 54) // Generics

    outer@ for(j in 10 downTo 1)
    {
        inner@ for(i in 10 downTo 1)
        {
            println(" $i")
            if(i == 3)
            {
                break@outer
            }
            else if(i%2==0)
            {
                continue@inner
            }
            println("The value of i is neither 3 nor even")
        }
        println("*********** $j")
    }


    /*for(item in arr)
    {
        println(item)
    }
*/
}