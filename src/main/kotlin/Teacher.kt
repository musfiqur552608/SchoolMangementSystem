class Teacher(name:String, age:Int, gender:String, var employeeId:String, var subject:String):Person(name, age, gender) {
    override fun introduce(): String {
        return "I am a Teacher ${name}, ${age} years old and I am teach ${subject}"
    }

}