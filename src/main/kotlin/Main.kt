fun main(args: Array<String>) {
    var student1 = Student("Rumman Mahfuz", 20, "Male", "111", 'A')
    var student2 = Student("Saif", 22, "Male", "112", 'B')

    var teacher1 = Teacher("Musfiqur Rahman", 24, "Male", "259", "Kotlin")
    var teacher2 = Teacher("Aminul Islam", 25, "Male", "308", "Python")

    var school = School()
    school.enroll(student1)
    school.enroll(student2)
    school.hire(teacher1)
    school.hire(teacher2)

    school.listOfStudents()
    school.listOfTeacher()
}