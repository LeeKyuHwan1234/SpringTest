fun main(){

    check("dsfsd")
    check(1)

}
fun check(a : Any){
    if(a is String){
        print(a.length)
    }
    else if(a is Int){
        print("It's Int")
    }
}