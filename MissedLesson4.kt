fun main(a:Array<String>)
{
    var def1 = StudentDemo()
    def1.printInfo()
    var def2 = StudentDemo(145)
    def2.printInfo()
    var def3 = StudentDemo(151,"Junsei")
    def3.printInfo()
}
class StudentDemo
{
    var id:Int = 0
    var name:String = ""
    constructor()
    {
        id = 134
        name = "Yuklin"
    }
    constructor(id:Int)
    {
        this.id = id
        this.name = "Linna"
    }
    constructor(id:Int, name:String)
    {
        this.id = id
        this.name = name
    }
    fun printInfo()
    {
        println("Id : $id ,  Name : $name")
    }
}
