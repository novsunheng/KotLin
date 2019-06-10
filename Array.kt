fun main (a:Array<String>)
{
    var arr =Array<Int>(size:5){0}

    arr[0] = 58
    arr[1] = 65
    arr.set(2,101)
    arr.set(3,200)
    arr.set(4,400)

    for (i :Int in  0..4)
    {
        //println(arr[i])

        println(arr.get(i))

    }

    for (i in arr)
    {
        println(i)
    }
}