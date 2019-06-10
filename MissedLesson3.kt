fun main(arg:Array<String>)
{
    var leak = Student(121,"Leak",65)
    leak.printDetails()
    // leak.assign(121,"Noroleak",85)
    var lita = Student(131,"Lita",65)
    lita.printDetails()


    var pheara = Student(154,"Pheara")
    var reak = Student()
    //lita.assign(141,"Lita",99)
}

class Student(id:Int, name: String)
{
    var id: Int = 0
    var name: String = ""
    var age = 0

    init
    {
        this.id = id
        this.name = name
        //this.age = age
        println("Constructor invoked....")
    }
    constructor(id:Int, name:String, age:Int):this(id,name)
    {
        this.age = age
    }

    constructor():this(135,"Reak",56)
    {

    }

    fun printDetails()
    {
        println("Id : $id, Name : $name, Age : $age")
    }
}