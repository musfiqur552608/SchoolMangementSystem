class School:SchoolInterface{
    private val students = mutableSetOf<Student>()
    private val teachers = mutableSetOf<Teacher>()
    override fun enroll(student: Student) {
        students.add(student)
    }

    override fun hire(teacher: Teacher) {
        teachers.add(teacher)
    }

    fun listOfStudents(){
        println("The list of enrolled students")
        for(student in students){
            println(student.introduce())
        }
    }
    fun listOfTeacher(){
        println("The list of hired teachers")
        for(teacher in teachers){
            println(teacher.introduce())
        }
    }
}