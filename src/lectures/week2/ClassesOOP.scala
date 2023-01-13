package lectures.week2

object ClassesOOP extends App {
  class Employee(val name: String, var salary: Double) {
    def this() = this("John", 0)
  }

  val employee = new Employee()

  //  println(s"${employee.name}'s salary is ${employee.salary}")
  class Instructor(val id: Int, name: String, surname: String) {
    def fullName(): String = {
      s"${this.name.capitalize} ${this.surname.capitalize}"
    }
  }

  class Course(courseID: Int, title: String,
               val releaseYear: String, val instructor: Instructor) {
    def getID(): String = {
      s"${this.courseID}${this.instructor.id}"
    }

    def isTaughtBy(instructor: Instructor): Boolean = {
      this.instructor == instructor
    }

    def copyCourse(newReleaseYear: String): Course = {
      new Course(this.courseID, this.title, newReleaseYear, this.instructor)
    }
  }

  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName()) // Вася Пупкин

  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.instructor.fullName()) // Вася Пупкин
  println(course.getID) // 21
  println(course.isTaughtBy(instructor)) // true
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин"))) // false

  println(course.copyCourse("4321").releaseYear) // 4321
}


