abstract class Animal
{
    abstract fun eat ()

    fun drink ()
    {
        println ("Drink water..")
    }

}

abstract class Mammal
{

}
class Deer : Animal ()
{
    override fun eat ()
    {
        println("I eat only Vegetable ")
    }
}
class Lion : Animal()
{
    override fun eat ()
    {
        println("I can eat anything but vegetable")
    }
}

/*class Deer : Animal()
{

}
*/
fun main(a: Array <String>)
{
    /*var deer = Deer()
    deer.eat()*/

    // var animal = Animal()
    var deer = Deer()
    deer.eat()
    deer.drink()

    var lion=Lion()
    lion.eat()
    lion.drink()

}