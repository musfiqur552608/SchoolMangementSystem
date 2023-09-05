class Student(name:String, age:Int, gender:String, var studentId:String, var grade:Char):Person(name, age, gender) {
    override fun introduce(): String {
        return "I am a student ${name}, ${age} years old and I am in grade ${grade}"
    }

}