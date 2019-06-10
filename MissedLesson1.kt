import java.util.Scanner;
fun main(a:Array<String>)
{
    val st = StudentTest()
    val scan = Scanner(System.`in`)
    //println("Enter id, name and age: ")

    st.id = 10  // st.setId(10)
    st.name = "Leak" // st.setName("Leak")
    st.age = 72 // st.setAge(72)

    println("Id : ${st.id}") // st.getId()
    println("Name : ${st.name}")
    println("Age : ${st.age}")
}
class StudentTest
{
    var id = 0
    var name = ""
    var age = 0
}