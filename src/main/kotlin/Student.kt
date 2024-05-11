class Student(
    private var firstName: String,
    private var lastName: String,
    private var id: String = generateId(),
    private var grade: Grades = Grades.DST
) {

    constructor(firstName: String, lastName: String, id: String) : this(firstName, lastName, id, Grades.DST)
    constructor(firstName: String, lastName: String, grade: Grades) : this(firstName, lastName, generateId(), grade)

    init {
        require(firstName.isNotBlank() && lastName.isNotBlank()) {
            "The field cannot be empty!"
        }
        require(id.isNotBlank()) {
            "The field cannot be empty!"
        }
    }

    override fun toString(): String {
        return "Imię: $firstName, Nazwisko: $lastName, Numer indeksu: $id, Ocena: ${grade.description} - ${grade.grade}"
    }

    fun getGrade(): Grades {
        return grade
    }

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getId(): String {
        return id
    }

    fun setGrade(grade: Grades) {
        this.grade = grade
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName

    }
    companion object {
        private var counter: Int = 0

        private fun generateId(): String {
            counter++
            return "$counter"
        }
    }

}